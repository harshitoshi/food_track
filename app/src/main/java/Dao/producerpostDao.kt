package Dao

import android.media.Image
import android.widget.ImageView
import com.example.food_track.models.producerpost
import com.google.android.gms.tasks.Task
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.firestore.DocumentSnapshot
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.ktx.Firebase
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.tasks.await

class producerpostDao {

    val db= FirebaseFirestore.getInstance()
    val producerpostcollection= db.collection("ProducerInfo")
    val auth= Firebase.auth

      fun insertProducer(type: String, expiry: String, description: String){
        val userphone= auth.currentUser!!.phoneNumber
        GlobalScope.launch {
            val producer= dao()
            val producerphone= userphone?.let { producer.getuserphone(it).await() }!!.toObject(dao::class.java)
            val time= System.currentTimeMillis()
            val post= producerphone?.let { producerpost(it, type, expiry, description, time) }
            post?.let { producerpostcollection.document().set(it) }
        }
    }
}