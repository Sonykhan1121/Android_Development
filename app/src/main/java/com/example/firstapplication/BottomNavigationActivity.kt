package com.example.firstapplication

import android.content.Context
import android.location.GnssAntennaInfo.Listener
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.firstapplication.databinding.ActivityBottomNavigationBinding
import com.google.android.material.bottomnavigation.BottomNavigationView
import nl.joery.animatedbottombar.AnimatedBottomBar


@Suppress("DEPRECATION")
class BottomNavigationActivity : AppCompatActivity() {
    private lateinit var binding:ActivityBottomNavigationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding  = ActivityBottomNavigationBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replacementfrag(homeFragment_nv())

        binding.bottomBar.onTabSelected = {
            when(it.id)
            {
                R.id.item0-> replacementfrag(homeFragment_nv())
                R.id.item1-> replacementfrag(LeaderFragment_nv())
                R.id.item2 -> replacementfrag(StoreFragment_nv())
                R.id.item3 -> replacementfrag(ProfileFragment_nv())
                else -> Toast.makeText(this, "Something went Wrong", Toast.LENGTH_SHORT).show()
            }
        }
        

    }
    private fun replacementfrag(fragment :Fragment)
    {
        var manager = supportFragmentManager
        var tr = manager.beginTransaction()
        tr.replace(R.id.frame_id_bottom_nv,fragment)
        tr.commit()

    }



}










