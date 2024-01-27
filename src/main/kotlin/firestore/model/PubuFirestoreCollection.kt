package firestore.model

import firestore.PubuFirestore
import firestore.util.Parser
import okhttp3.MediaType
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody

class PubuFirestoreCollection(val collectionName: String) {
    var document: PubuFirestoreDocument? = null
    fun document(docName: String): PubuFirestoreDocument {
        document = PubuFirestoreDocument("$collectionName/$docName")
        return document!!
    }

    fun add(dataMap: HashMap<String, Any?>): PubuFirestoreResponse {
        val body = Parser.format(dataMap);
        val requestBody = RequestBody.create(
            MediaType.parse("application/json; charset=utf-8"),
            body
        )
        val request = Request.Builder()
            .url("https://firestore.googleapis.com/v1/projects/pubu-ebooks-android/databases/(default)/documents$collectionName")
            .post(requestBody)
            .build();
        val response = PubuFirestore.client.newCall(request).execute()
        if(response.isSuccessful) {
            val content = response.body()?.string()
            if (content != null) {
                return Parser.response(content)
            }
            throw Exception("Error: no content")
        }
        throw Exception("Error: ${response.code()} ${response.message()}")
    }
}