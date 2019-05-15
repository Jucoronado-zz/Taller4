package com.example.taller4

import android.annotation.SuppressLint
import android.content.Intent
import android.media.MediaPlayer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import kotlinx.android.synthetic.main.layout_friends.*

//import kotlinx.android.synthetic.main.layout_friends.*


class FriendsActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_friends)

        val context = this
        val player = MediaPlayer.create(this, R.raw.friendsong)
        player.start()
       // btnplay.setBackproudResource(R.drawable.on_opt)
        btnplay.setOnClickListener{
        if(player.isPlaying){

            player.pause()
           // btnplay.setBackproudResource(R.drawable.mute_opt)
            Toast.makeText(context, "Silencio", Toast.LENGTH_SHORT).show()
        }else{

            player.start()
            // btnplay.setBackproudResource(R.drawable.on_opt)
            Toast.makeText(context, "Sonido", Toast.LENGTH_SHORT).show()
        }  }
    }

    fun onFriendsClick(view: View) {


        val friend = view as ImageView
        val intent = Intent(this, DetalleActivity::class.java)
        intent.putExtra("FRIENDS_NAME", friend.tag.toString())
        startActivity(intent)
     }

   /** override fun onDestroy(){

       super.onDestroy()

    }**/


}
