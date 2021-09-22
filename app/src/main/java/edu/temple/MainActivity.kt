package edu.temple

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast




class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myName = findViewById<EditText>(R.id.Name)
        val myEmail = findViewById<EditText>(R.id.Email)
        val myPassword = findViewById<EditText>(R.id.Password)
        val myPassConf = findViewById<EditText>(R.id.PasswordConfirmation)
        val myButton = findViewById<Button>(R.id.Save)

        myButton.setOnClickListener {
            val name = myName.text.toString()
            val email = myEmail.text.toString()
            val pass: String = myPassword.text.toString()
            val passConf = myPassConf.text.toString()

            if (name == "" || email == "" || pass == "" || passConf == "") {
                val t = Toast.makeText(this, "Please enter all fields", Toast.LENGTH_SHORT)
                t.show()
            }
            else if (pass != passConf) {
                val t = Toast.makeText(this, "Error: Passwords don't match", Toast.LENGTH_SHORT)
                t.show()
            }
            else { val t = Toast.makeText(this, "Your information has been saved", Toast.LENGTH_SHORT)
                t.show()
            }

        }
    }
}