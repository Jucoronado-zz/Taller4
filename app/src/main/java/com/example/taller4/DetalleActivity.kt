package com.example.taller4

import android.os.Bundle
//import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import kotlinx.android.synthetic.main.activity_detalle.*

import java.util.*

class DetalleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle)


        val friendname = intent.getStringExtra("FRIENDS_NAME")
        setFriend(friendname)
    }

    fun setFriend(friendsName: String) {
        val imageId = resources.getIdentifier(friendsName,"drawable", packageName)
        val fileId = resources.getIdentifier(friendsName,"raw", packageName)
        var NombreFriend = ""
        var descripcionFriend = ""
        val fileStream = Scanner(resources.openRawResource(fileId))
        if(fileStream.hasNextLine())
            NombreFriend = fileStream.nextLine()
        while(fileStream.hasNextLine()) {
            descripcionFriend += fileStream.nextLine() + "\n"

        }
        fileStream.close()
        friend_image.setImageResource(imageId)
        friend_name.setText(NombreFriend)
        friend_description.setText(descripcionFriend)
    }
    }


