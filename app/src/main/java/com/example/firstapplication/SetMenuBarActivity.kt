package com.example.firstapplication

import android.os.Bundle
import android.view.ContextMenu
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.view.menu.MenuBuilder
import com.shashank.sony.fancytoastlib.FancyToast


class SetMenuBarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_set_menu_bar)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.example_menu, menu)

        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId)
        {
            R.id.addgroup -> FancyToast.makeText(this,"Click on Add group",FancyToast.LENGTH_LONG,FancyToast.INFO,false).show()
            R.id.adddevice -> FancyToast.makeText(this,"Click on Add Device",FancyToast.LENGTH_LONG,FancyToast.INFO,false).show()
            R.id.logout -> FancyToast.makeText(this,"You are logging out",FancyToast.LENGTH_LONG,FancyToast.INFO,false).show()
            R.id.about -> FancyToast.makeText(this,"This is about me",FancyToast.LENGTH_LONG,FancyToast.INFO,false).show()
            else -> super.onOptionsItemSelected(item)
        }

        return true;
    }
}