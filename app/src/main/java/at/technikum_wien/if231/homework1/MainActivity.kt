package at.technikum_wien.if231.homework1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.SeekBar
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

        // INPUT
        val inputValue1 = findViewById<EditText>(R.id.value_1)
        val inputValue2 = findViewById<EditText>(R.id.value_2)


        var startPoint = 0
        var endPoint = 0


        // CALCULATE
        val calculateButton = findViewById<Button>(R.id.btn_calculate)
        val outputCalculate = findViewById<TextView>(R.id.result_calculate)
        calculateButton.setOnClickListener {
            outputCalculate.text = sum(inputValue1.text.toString(),inputValue2.text.toString())
        }

        // NAVIGATE
        val navigationButton = findViewById<Button>(R.id.btn_nav)
        val intent = Intent(this, SecoundActivity :: class.java)
        navigationButton.setOnClickListener {

            var result =  sum(inputValue1.text.toString(),inputValue2.text.toString())
            intent.putExtra("result", result)

            startActivity(intent)
        }

        // SEEKBAR
        val seekBar = findViewById<SeekBar>(R.id.seekBar)
        val outputSeekBar = findViewById<TextView>(R.id.result_seekBar)
        seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                outputSeekBar.text = sum(inputValue1.text.toString(),inputValue2.text.toString())
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {
                if(seekBar != null){
                   startPoint = 0
                }
            }

            override fun onStopTrackingTouch(p0: SeekBar?) {
                if(seekBar != null){
                    endPoint = 0
                }
                
               // Toast.makeText(this)
            }

        })


    }


}
