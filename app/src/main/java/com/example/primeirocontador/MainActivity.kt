package com.example.primeirocontador

import android.app.Application
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.lang.reflect.Modifier

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnDecrement = findViewById<Button>(R.id.btn_decrement);
        var btnIncrement = findViewById<Button>(R.id.button_increment);
        var tvCounter = findViewById<TextView>(R.id.tv_counter);

        var contador = 0;

        btnDecrement.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View?) {
                if (contador > 0) {
                    contador--;
                } else {
                    Toast.makeText(applicationContext, "Não é possível ser menor que 0.", Toast.LENGTH_SHORT).show()
                }

                tvCounter.setText(contador.toString().padStart(2, '0'));
            }
        });

        btnIncrement.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View?) {
                if (contador < 15) {
                    contador++;
                } else {
                    Toast.makeText(applicationContext, "Você atingiu o limite da contagem.", Toast.LENGTH_SHORT).show()
                }
                tvCounter.setText(contador.toString().padStart(2, '0'));
            }
        });

    }
}
