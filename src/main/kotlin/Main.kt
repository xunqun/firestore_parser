import com.google.gson.Gson
import com.google.gson.JsonArray
import com.google.gson.JsonObject
import com.nuazure.firestore.FirestoreResponse

fun main(args: Array<String>) {
    val jsonData = """{
    "name": "THE_REQUEST_PATH",
    "fields": {
        "pro_hidden_app_list_1": {
            "arrayValue": {
                "values": [
                    {
                        "stringValue": "com.nuazure.bookbuffet.launcher"
                    },
                    {
                        "stringValue": "com.nuazure.bookbuffet.reader"
                    },
                    {
                        "stringValue": "com.android.settings"
                    },
                    {
                        "stringValue": "com.yitoa.factorytest"
                    },
                    {
                        "stringValue": "net.toload.main.hd"
                    },
                    {
                        "stringValue": "com.yitoa.launcher.ereader"
                    },
                    {
                        "stringValue": "com.android.gallery3d"
                    },
                    {
                        "stringValue": "com.android.documentsui"
                    },
                    {
                        "stringValue": "com.debug.loggerui"
                    },
                    {
                        "stringValue": "com.yitoa.note.demo"
                    },
                    {
                        "stringValue": "com.yitoa.hand.write"
                    },
                    {
                        "stringValue": "com.yiyitong.translator"
                    },
                    {
                        "stringValue": "com.yt.mtkFactory"
                    },
                    {
                        "stringValue": "com.nuazure.security"
                    },
                    {
                        "stringValue": "com.nuazure.bookbuffet.settings"
                    }
                ]
            }
        },
        "hidden_app_list": {
            "arrayValue": {
                "values": [
                    {
                        "stringValue": "com.nuazure.bookbuffet.launcher"
                    },
                    {
                        "stringValue": "com.nuazure.bookbuffet.reader"
                    },
                    {
                        "stringValue": "com.android.settings"
                    },
                    {
                        "stringValue": "com.yitoa.factorytest"
                    },
                    {
                        "stringValue": "net.toload.main.hd"
                    },
                    {
                        "stringValue": "com.yitoa.launcher.ereader"
                    },
                    {
                        "stringValue": "com.android.gallery3d"
                    },
                    {
                        "stringValue": "com.android.documentsui"
                    },
                    {
                        "stringValue": "com.debug.loggerui"
                    },
                    {
                        "stringValue": "com.yitoa.note.demo"
                    },
                    {
                        "stringValue": "com.yitoa.hand.write"
                    },
                    {
                        "stringValue": "com.yiyitong.translator"
                    },
                    {
                        "stringValue": "com.yt.mtkFactory"
                    },
                    {
                        "stringValue": "com.nuazure.security"
                    }
                ]
            }
        }
    },
    "createTime": "2023-05-15T05:39:33.156967Z",
    "updateTime": "2023-12-22T10:14:40.877250Z"
}"""
    val response = FirestoreResponse.parseDocument(jsonData)

}

