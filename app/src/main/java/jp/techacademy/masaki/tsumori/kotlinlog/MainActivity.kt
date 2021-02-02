package jp.techacademy.masaki.tsumori.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human1 = Human("masaki", 19, "fishing")
        human1.say()
        human1.think()

        val human2 = Human("zasu", 5, "running")
        human2.say()
        human2.think()
    }
}