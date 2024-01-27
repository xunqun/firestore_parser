package firestore.model

import firestore.PubuFirestore
import junit.framework.Assert.assertEquals
import org.junit.jupiter.api.Test
import kotlin.test.BeforeTest


class PubuFirestoreDocumentTest {
    var collection: PubuFirestoreCollection? = null
    var document: PubuFirestoreDocument? = null

    @BeforeTest
    fun setup() {
        collection = PubuFirestore.collection("test_documents")
        document = collection!!.document("test")
    }

    @Test
    fun add() {
        val response = collection!!.add(hashMapOf("item" to "99999"))
        assertEquals("99999", response.fields["item"])
    }

    @Test
    fun patch() {
        val response = document!!.patch(mapOf("item" to "12345"))
        assertEquals("12345", response.fields["item"])
    }

    @Test
    fun getDocName() {
        assertEquals("/test_documents/test", document!!.docName)
    }
}