package mx.edu.potros.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Campos de texto
        val input: TextView=findViewById(R.id.input)
        val output: TextView=findViewById(R.id.output)
        //Botones
        val button0: Button=findViewById(R.id.buttonZero)
        val button1: Button=findViewById(R.id.button1)
        val button2: Button=findViewById(R.id.button2)
        val button3: Button=findViewById(R.id.button3)
        val button4: Button=findViewById(R.id.button4)
        val button5: Button=findViewById(R.id.button5)
        val button6: Button=findViewById(R.id.button6)
        val button7: Button=findViewById(R.id.button7)
        val button8: Button=findViewById(R.id.button8)
        val button9: Button=findViewById(R.id.button9)
        val buttonplus: Button=findViewById(R.id.buttonPlus)
        val buttonminus: Button=findViewById(R.id.buttonMinus)
        val buttonmulti: Button=findViewById(R.id.buttonMult)
        val buttondiv: Button=findViewById(R.id.buttonDivide)
        val buttonResult: Button=findViewById(R.id.buttonResult)
        val buttonBorrar: Button=findViewById(R.id.buttonBorrar)

        //On click listeners

        button0.setOnClickListener {
            if(input.text.toString()=="0"){
                input.setText("")
            }
            input.setText(input.text.toString()+"0")
        }
        button1.setOnClickListener {
            if(input.text.toString()=="0"){
                input.setText("")
            }
            input.setText(input.text.toString()+"1")
        }
        button2.setOnClickListener {
            if(input.text.toString()=="0"){
                input.setText("")
            }
            input.setText(input.text.toString()+"2")
        }
        button3.setOnClickListener {
            if(input.text.toString()=="0"){
                input.setText("")
            }
            input.setText(input.text.toString()+"3")
        }
        button4.setOnClickListener {
            if(input.text.toString()=="0"){
                input.setText("")
            }
            input.setText(input.text.toString()+"4")
        }
        button5.setOnClickListener {
            if(input.text.toString()=="0"){
                input.setText("")
            }
            input.setText(input.text.toString()+"5")
        }
        button6.setOnClickListener {
            if(input.text.toString()=="0"){
                input.setText("")
            }
            input.setText(input.text.toString()+"6")
        }
        button7.setOnClickListener {
            if(input.text.toString()=="0"){
                input.setText("")
            }
            input.setText(input.text.toString()+"7")
        }
        button8.setOnClickListener {
            if(input.text.toString()=="0"){
                input.setText("")
            }
            input.setText(input.text.toString()+"8")
        }
        button9.setOnClickListener {
            if(input.text.toString()=="0"){
                input.setText("")
            }
            input.setText(input.text.toString()+"9")
        }
        buttonplus.setOnClickListener {
            output.setText(input.text.toString()+"+")
            input.setText("0")
        }
        buttonminus.setOnClickListener {
            output.setText(input.text.toString()+"-")
            input.setText("0")
        }
        buttonmulti.setOnClickListener {
            output.setText(input.text.toString()+"*")
            input.setText("0")
        }
        buttondiv.setOnClickListener {
            output.setText(input.text.toString()+"/")
            input.setText("0")
        }
        buttonResult.setOnClickListener {
            var outputString:String=output.text.toString()
            var operacion:Char=outputString.last()
            outputString=outputString.dropLast(1)
            var inputDouble:Double=input.text.toString().toDouble()
            var outputDouble=outputString.toDouble()
            when(operacion){
                '+'-> {
                    var result=outputDouble+inputDouble
                    output.setText(result.toString())
                }
                '-'-> {
                    var result=outputDouble-inputDouble
                    output.setText(result.toString())
                }
                '*'-> {
                    var result=outputDouble*inputDouble
                    output.setText(result.toString())
                }
                '/'-> {
                    var result=outputDouble/inputDouble
                    output.setText(result.toString())
                }


            }
            input.setText("0")
        }
        buttonBorrar.setOnClickListener {
            input.setText("0")
            output.setText("")
        }



    }
}