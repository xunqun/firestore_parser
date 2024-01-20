package com.nuazure.firestore

import com.google.gson.Gson
import com.google.gson.JsonArray
import com.google.gson.JsonElement
import com.google.gson.JsonObject

class FirestoreResponse {
    companion object {

        fun parse(json: String): FirestoreResponse {
            val gson = Gson()

            val jsonObject = gson.fromJson(json, JsonObject::class.java)

            val fields = jsonObject.getAsJsonObject("fields")
            val fieldsMap = parseFields(gson, fields)

            val createTime = jsonObject.getAsJsonObject("createTime").getAsString()
            val updateTime = jsonObject.getAsJsonObject("updateTime").getAsString()
            val name = jsonObject.getAsJsonObject("name").getAsString()


            print(fieldsMap)
            return FirestoreResponse(name, fieldsMap, createTime, updateTime)
        }

        private fun parseFields(gson: Gson, fields: JsonObject): MutableMap<String, Any?> {
            val fieldsMap = mutableMapOf<String, Any?>()
            for ((key, value) in fields.entrySet()) {
                fieldsMap[key.toString()] = value.asJsonObject.entrySet().first().let {
                    getValue(it, gson)
                }
            }
            return fieldsMap
        }

        private fun handleArrayValue(gson: Gson, jsonArray: JsonArray): List<Any?> {
            return jsonArray.map { it ->
                    it.asJsonObject.entrySet().first().let {
                        getValue(it, gson)
                    }
            }

        }

        private fun getValue(
            it: MutableMap.MutableEntry<String, JsonElement>,
            gson: Gson
        ): Any? {
            val type = it.key
            return when (type) {
                "stringValue" -> it.value.asString
                "integerValue" -> it.value.asInt
                "booleanValue" -> it.value.asBoolean
                "arrayValue" -> handleArrayValue(gson, it.value.asJsonObject.entrySet().first().value.asJsonArray)
                "mapValue" -> parseFields(gson, it.value.asJsonObject.entrySet().first().value.asJsonObject)
                "nullValue" -> null
                else -> it.value.asString
            }
        }


    }

    var fields: Map<String, Any?>
    var createTime: String
    var updateTime: String
    var name: String

    constructor( name: String, fieldsMap: Map<String, Any?>, createTime: String, updateTime: String) {
        this.fields = fieldsMap
        this.createTime = createTime
        this.updateTime = updateTime
        this.name = name
    }

}