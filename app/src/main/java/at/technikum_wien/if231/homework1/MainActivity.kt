package at.technikum_wien.if231.homework1

import android.os.Bundle
import android.text.Editable
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {


    private fun sum(a: String, b: String) : String{
        var result: Int? = 0

        result = 0
        if(a.toIntOrNull() != null){
            result = result?.plus(a.toInt())
        }
        if(b.toIntOrNull() != null){
            result = result?.plus(b.toInt())
        }

        return result.toString()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inputValue1 = findViewById<EditText>(R.id.value_1)
        val inputValue2 = findViewById<EditText>(R.id.value_2)

        val calculateButton = findViewById<Button>(R.id.btn_calculate)
        val outputResult1 = findViewById<TextView>(R.id.result_1)
        val navigationButton = findViewById<Button>(R.id.btn_nav)
        val outputResult2 = findViewById<TextView>(R.id.result_2)

        calculateButton.setOnClickListener {
            outputResult1.text = sum(inputValue1.text.toString(),inputValue2.text.toString())
        }

        navigationButton.setOnClickListener {
            outputResult2.text = sum(inputValue1.text.toString(),inputValue2.text.toString())
        }

    }


}
