package com.example.bahadir_eray_odev6_bootcamp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
        GlobalScope.launch {
    launch(Dispatchers.Main){
        println("Main Thread      : ${Thread.currentThread().name}")
    }
    launch(Dispatchers.Default) {
        println("Default Thread   : ${Thread.currentThread().name}")
    }
    launch(Dispatchers.Unconfined){
        println("Unconfined Thread: ${Thread.currentThread().name}")
    }
    launch(Dispatchers.IO) {
        println("IO Thread        : ${Thread.currentThread().name}")
    }
           */



        GlobalScope.launch {
            var i=0
            launch(Dispatchers.Default) {
                delay(100)
                while (true){
                    Log.v("PATIKA: ", i.toString())
                i++}
            }
        }
    }
}