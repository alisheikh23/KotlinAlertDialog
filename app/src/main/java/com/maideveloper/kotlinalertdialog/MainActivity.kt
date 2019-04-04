package com.maideveloper.kotlinalertdialog

import android.content.DialogInterface
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun save(view: View){
        val alertDialog=AlertDialog.Builder(this)
        alertDialog.setTitle("Save")
        alertDialog.setMessage("Are You Sure?")
        alertDialog.setPositiveButton("Yes"){
                                                dialog: DialogInterface?, which: Int ->
            Toast.makeText(applicationContext,"Saved",Toast.LENGTH_LONG).show()

        }

        alertDialog.setNegativeButton("No"){ dialog: DialogInterface?, which: Int ->
            Toast.makeText(applicationContext,"Not Saved",Toast.LENGTH_LONG).show()
        }
        alertDialog.show()
    }
}
