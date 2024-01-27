package firestore

import firestore.model.PubuFirestoreCollection
import okhttp3.OkHttpClient

object PubuFirestore {
    val client = OkHttpClient().newBuilder().build()
    fun collection(collectionName: String): PubuFirestoreCollection {
        return PubuFirestoreCollection("/$collectionName")
    }
}