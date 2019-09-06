package com.example.mvvmapp

import android.util.Log
import androidx.lifecycle.ViewModel
import kotlin.random.Random

class MainActivityViewModel : ViewModel(){

    private var myRandomNumber: String? = null

    fun getNumber(): String?{
        Log.i(TAG, "Get number")
        if (myRandomNumber == null){
            createNumber()
        }
        return myRandomNumber
    }

    private fun createNumber(){
        Log.i(TAG, "Activity ON_CREATE")
      val random : Int = Random.nextInt(10)
        myRandomNumber = "Number $random"

    }

    override fun onCleared() {
        super.onCleared()
        Log.i(TAG, "ViewModel destroyed")
    }

    companion object{
        const val TAG = "MainActivity"
    }
}