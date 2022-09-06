package com.example.actividad5
// Made by Sofía Jiménez Martínez

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Switch
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // find the switches
        val switchCharmander = findViewById<Switch>(R.id.charmander)
        val switchSquirtle = findViewById<Switch>(R.id.squirtle)
        val switchBulbasur = findViewById<Switch>(R.id.bulbasur)
        val switchPidgey = findViewById<Switch>(R.id.pidgey)
        val switchAxew = findViewById<Switch>(R.id.axew)

        // create the messages for the switches
        var messageCharmander = ""
        var messageSquirtle = ""
        var messageBulbasur = ""
        var messagePidgey = ""
        var messageAxew = ""

        // listen if any of the switches change its value
        switchCharmander?.setOnCheckedChangeListener { _, isCheked ->
            messageCharmander = if (isCheked) "Charmander" else ""
        }

        switchSquirtle?.setOnCheckedChangeListener { _, isCheked ->
            messageSquirtle = if (isCheked) "Squirtle" else ""
        }

        switchBulbasur?.setOnCheckedChangeListener { _, isCheked ->
            messageBulbasur = if (isCheked) "Bulbasur" else ""
        }

        switchPidgey?.setOnCheckedChangeListener { _, isCheked ->
            messagePidgey = if (isCheked) "Pidgey" else ""
        }

        switchAxew?.setOnCheckedChangeListener { _, isCheked ->
            messageAxew = if (isCheked) "Axew" else ""
        }

        // find the button
        val button = findViewById<Button>(R.id.button)

        // set onClickListener on button
        button.setOnClickListener {
            Toast.makeText(this, "Se escogieron: "
                    +  messageCharmander + " " + messageSquirtle + " " + messageBulbasur
                + " " + messagePidgey + " " + messageAxew, Toast.LENGTH_SHORT).show()
        }
    }


}