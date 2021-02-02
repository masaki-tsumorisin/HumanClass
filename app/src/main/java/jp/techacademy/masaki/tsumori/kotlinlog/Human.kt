package jp.techacademy.masaki.tsumori.kotlinlog

import android.util.Log

class Human(name: String, age: Int, var hobby: String): Animal(name, age), Thinkable {

    override fun say() {

        Log.d("kotlintest", "私の名前は" + this.name + "です。　年は" + this.age + "歳です。")
    }

    override fun think() {

        Log.d("kotlintest", "「私は" + this.hobby + "について考える。」")
    }
}