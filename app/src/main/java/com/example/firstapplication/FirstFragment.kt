package com.example.firstapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.firstapplication.databinding.FragmentFirstBinding
import com.shashank.sony.fancytoastlib.FancyToast


class FirstFragment : Fragment() {
  private lateinit var binding: FragmentFirstBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var binding = FragmentFirstBinding.inflate(inflater, container, false)
        binding.firstFrBtn.setOnClickListener {
            context?.let { it1 -> FancyToast.makeText(it1,"I am from fragment One",FancyToast.LENGTH_SHORT,FancyToast.SUCCESS,false).show() }
        }
        return binding.root
    }

    companion object {

    }
}