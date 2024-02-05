package com.example.ina_toast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this,"Aplikasi Berjalan", Toast.LENGTH_SHORT).show()

        val tombolNama = findViewById<Button>(R.id.ToastNama)
        val tombolNis = findViewById<Button>(R.id.Toastnis)
        val tombolKelas = findViewById<Button>(R.id.ToastKelas)

        tombolNama.setOnClickListener {
            Toast.makeText(this,"Ina Shantika Izza", Toast.LENGTH_SHORT).show()
        }
        tombolNis.setOnClickListener {
            Toast.makeText(this,"2233291", Toast.LENGTH_SHORT).show()
        }
        tombolKelas.setOnClickListener {
            Toast.makeText(this,"XI PPLG 2", Toast.LENGTH_SHORT).show()
        }
    }
}