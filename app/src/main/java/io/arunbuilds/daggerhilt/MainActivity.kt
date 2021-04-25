package io.arunbuilds.daggerhilt

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import javax.inject.Named

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {


    @Inject
    @Named("String2")
    lateinit var testString: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("Arun", testString)
        findViewById<TextView>(R.id.tvString).text = testString
    }
}