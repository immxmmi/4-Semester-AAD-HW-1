package at.technikum_wien.if231.homework1

import android.os.Bundle
import android.text.Editable
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inputValue1 = findViewById<EditText>(R.id.value_1)
        val inputValue2 = findViewById<EditText>(R.id.value_2)
        var result: Int? = 0
        val calculateButton = findViewById<Button>(R.id.btn_calculate)
        val outputResult1 = findViewById<TextView>(R.id.result_1)
        val navigationButton = findViewById<Button>(R.id.btn_nav)
        val outputResult2 = findViewById<TextView>(R.id.result_2)

        calculateButton.setOnClickListener {


            result = 0
            if(inputValue1.text.toString().toIntOrNull() != null){
                result = result?.plus(inputValue1.text.toString().toInt())
            }
            if(inputValue2.text.toString().toIntOrNull() != null){
                result = result?.plus(inputValue2.text.toString().toInt())
            }

            outputResult1.text = result.toString()
        }

    }
}
