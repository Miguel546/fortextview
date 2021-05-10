package com.luismiguel.textviewfor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.luismiguel.textviewfor.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.btnSetText.setOnClickListener{
            pintarForTextView()
        }
        binding.btnVolverAlInicio.setOnClickListener{
            binding.numero.text = ""
            binding.numero.hint = "Numero 0...1000"
        }
    }

    private fun pintarForTextView(){
        for(i in 0 .. 10000){
            Log.i("for", "" + i)
            binding.numero.text = ""+i
        }
    }
}