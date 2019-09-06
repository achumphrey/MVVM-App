package com.example.mvvmapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProviders
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i(TAG, "MainActivity ON_CREATE")
  //      lifecycle.addObserver(MainActivityObserver())

//       val dataGenerator = MainActivityViewModel()
//        tv_random.text = dataGenerator.getNumber()

        val viewModel = ViewModelProviders.of(this)
            .get(MainActivityViewModel::class.java)

        tv_random.text = viewModel.getNumber()

    }

  /*  override fun onStart() {
        super.onStart()
        Log.i(TAG, "MainActivity ON_START")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "MainActivity ON_RESUME")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "MainActivity ON_PAUSE")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "MainActivity ON_DESTROY")
    }


    override fun onStop() {
        super.onStop()
        Log.i(TAG, "MainActivity ON_STOP")
    }
*/
        companion object{
        const val TAG = "MainActivity"
    }
}
