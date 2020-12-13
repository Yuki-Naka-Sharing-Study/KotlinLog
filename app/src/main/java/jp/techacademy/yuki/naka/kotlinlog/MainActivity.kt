package jp.techacademy.yuki.naka.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human = Human("仲優樹",24, hobby = "YouTube")    // 名前を仲優樹、年齢24歳で、趣味はYouTubeのインスタンスを作る

        human.say()
        human.think()

        val human2 = Human("Yuki Naka",25, hobby = "YouTube")    // 名前をYuki Naka、年齢25歳で、趣味はYouTubeのインスタンスを作る

        human2.say()
        human2.think()
    }
}