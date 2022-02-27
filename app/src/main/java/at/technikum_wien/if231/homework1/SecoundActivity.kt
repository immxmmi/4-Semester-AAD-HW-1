package at.technikum_wien.if231.homework1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecoundActivity() : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secound)

        val outputResult2 = findViewById<TextView>(R.id.result_nav)
        outputResult2.text = intent.getStringExtra("result");
    }
}