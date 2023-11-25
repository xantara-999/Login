package com.example.login
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        val editTextEmail = findViewById<EditText>(R.id.email)
        val editTextPassword = findViewById<EditText>(R.id.password)
        val btnLogin = findViewById<Button>(R.id.btnLogin)

        btnLogin.setOnClickListener {
            val email = editTextEmail.text.toString()
            val password = editTextPassword.text.toString()

            if (isValidCredentials(email, password)) {
                // Jika kredensial valid, pindah ke tampilan kedua
                val intent = Intent(this, MainActivity2::class.java)
                intent.putExtra("EMAIL", email)
                startActivity(intent)
                finish()
            } else {
            }
        }
    }

    private fun isValidCredentials(email: String, password: String): Boolean {
        return email == "dy@gmail.com" && password == "123"
    }
}