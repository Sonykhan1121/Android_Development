package com.example.firstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import com.shashank.sony.fancytoastlib.FancyToast

class AlertDialogActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alert_dialog)
        val btn2 = findViewById<Button>(R.id.button2)
        btn2.setOnClickListener {
            val dialog = AlertDialog.Builder(this)
            dialog.setTitle("Delete File")
            dialog.setMessage("Are you sure ?")
            dialog.setIcon(R.drawable.alart)
            dialog.setPositiveButton("Yes"){
                dialogInterface,which ->
                FancyToast.makeText(this,"Yes clicked !",FancyToast.LENGTH_LONG,FancyToast.WARNING,false).show();
            }
            dialog.setNegativeButton("No"){
                    dialogInterface,which ->
                FancyToast.makeText(this,"No clicked !",FancyToast.LENGTH_LONG,FancyToast.WARNING,false).show();
            }
            dialog.setNeutralButton("Cancel"){
                    dialogInterface,which ->
                FancyToast.makeText(this,"Cancel clicked !",FancyToast.LENGTH_LONG,FancyToast.WARNING,false).show();
            }
            val alertDialog  = dialog.create()
            alertDialog.setCancelable(false)
            alertDialog.show()
        }
    }
}