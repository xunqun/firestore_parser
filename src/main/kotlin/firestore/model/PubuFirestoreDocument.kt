package firestore.model

import com.google.gson.Gson
import com.google.gson.JsonObject
import firestore.PubuFirestore
import firestore.util.Parser
import okhttp3.MediaType
import okhttp3.Request
import okhttp3.RequestBody

class PubuFirestoreDocument(val docName: String) {
    var gson = Gson()
    fun collection(collectionName: String): PubuFirestoreCollection {
        return PubuFirestoreCollection("$docName/$collectionName")
    }

    fun patch(dataMap: Map<String, Any?>): PubuFirestoreResponse {
        val body = parseData(dataMap);
        val requestBody = RequestBody.create(
            MediaType.parse("application/json; charset=utf-8"),
            body
        )
        val request = Request.Builder()
            .url("https://firestore.googleapis.com/v1/projects/pubu-ebooks-android/databases/(default)/documents$docName")
            .patch(requestBody)
            .build();
        try {
            val response = PubuFirestore.client.newCall(request).execute()
            if (response.isSuccessful) {
                val content = response.body()?.string()
                if (content != null) {
                    return Parser.response(content)
                }
                throw Exception("Error: no content")
            }
            throw Exception("Error: ${response.code()} ${response.message()}")
        }catch (e: Exception){
            println(e.message)
            throw Exception("Error: ${e.message}")
        }



    }

    fun parseData(dataMap: Map<String, Any?>): String {

        val fields = hashMapOf<String, Any?>()
        dataMap.forEach{
            val type = when(it.value){
                null -> "nullValue"
                is Int -> "integerValue"
                is Double -> "doubleValue"
                is Boolean -> "booleanValue"
                is List<*> -> "arrayValue"
                is Map<*, *> -> "mapValue"
                else -> "stringValue"
            }
            fields[it.key] = hashMapOf(type to it.value)
        }

        val body = hashMapOf("fields" to fields)
        return gson.toJson(body)
    }
}