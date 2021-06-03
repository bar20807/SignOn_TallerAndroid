package com.uvg.signon_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {
    private lateinit var mAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mAuth= FirebaseAuth.getInstance()
        var user=mAuth.currentUser

        Handler().postDelayed({
            if (user != null){
                var maps = Intent(this, maps::class.java)
                startActivity(maps)
                finish()

            }
            else{
                var iniciar = Intent(this, AppSesion::class.java)
                startActivity(iniciar)
                finish()
            }
        }, 2000)
    }



}