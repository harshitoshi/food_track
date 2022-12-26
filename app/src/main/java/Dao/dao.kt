package Dao

import com.example.food_track.models.producers
import com.google.android.gms.tasks.Task
import com.google.firebase.firestore.DocumentSnapshot
import com.google.firebase.firestore.FirebaseFirestore

class dao {
    private val db= FirebaseFirestore.getInstance()
    private val producerCollection= db.collection("producer")

    fun insertProducer(producer: producers?){
        producer?.let {
            producerCollection.document(producer.phoneNumber).set(it)
        }
    }

    fun getuserphone(phoneNumber: String): Task<DocumentSnapshot> {
        return producerCollection.document(phoneNumber).get()
    }
}