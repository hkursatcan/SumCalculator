package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.content.ContextCompat
import com.example.calculator.databinding.ActivityMainBinding
import net.objecthunter.exp4j.Expression
import net.objecthunter.exp4j.ExpressionBuilder
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    lateinit var tasarim:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        tasarim = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(tasarim.root)

        tasarim.buttonClear.setOnClickListener {
            tasarim.inputText0.text = ""
            tasarim.outputText0.text = ""
        }

        tasarim.button0.setOnClickListener {
            tasarim.inputText0.append("0")
        }
        tasarim.button1.setOnClickListener {
            tasarim.inputText0.append("1")
        }
        tasarim.button2.setOnClickListener {
            tasarim.inputText0.append("2")
        }
        tasarim.button3.setOnClickListener {
            tasarim.inputText0.append("3")
        }
        tasarim.button4.setOnClickListener {
            tasarim.inputText0.append("4")
        }
        tasarim.button5.setOnClickListener {
            tasarim.inputText0.append("5")
        }
        tasarim.button6.setOnClickListener {
            tasarim.inputText0.append("6")
        }
        tasarim.button7.setOnClickListener {
            tasarim.inputText0.append("7")
        }
        tasarim.button8.setOnClickListener {
            tasarim.inputText0.append("8")
        }
        tasarim.button9.setOnClickListener {
            tasarim.inputText0.append("9")
        }
        tasarim.buttonSum.setOnClickListener {
            tasarim.inputText0.append("+")
        }
        tasarim.buttonEqual.setOnClickListener {
            showResult()
        }

    }

    private fun showResult(){
        try {
            val expression=ExpressionBuilder(tasarim.inputText0.text.toString()).build()
            val result = expression.evaluate()
            if(result.isNaN()){
                tasarim.outputText0.text = "Error"
                tasarim.outputText0.setTextColor(ContextCompat.getColor(this,R.color.koyu_beyaz))
            }else {

                tasarim.outputText0.text = result.toString()
            }
        }
        catch (e: Exception){
            tasarim.outputText0.text = "Error"
            tasarim.outputText0.setTextColor(ContextCompat.getColor(this,R.color.koyu_beyaz))
        }
    }

}



