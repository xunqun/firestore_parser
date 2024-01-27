package firestore.model

import com.google.gson.Gson
import com.google.gson.JsonArray
import com.google.gson.JsonElement
import com.google.gson.JsonObject

class   PubuFirestoreResponse {

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