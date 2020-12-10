package jp.techacademy.yuki.naka.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human = Human("仲優樹",24, YouTube ho)    // 名前を仲優樹、年齢24歳で、趣味はYouTubeのインスタンスを作る

        human.say()
        Log.d("kotlintest", "私の名前は" + human.name + "です。")
        Log.d("kotlintest", "年は" + human.age + "歳です。")

        human.think()
        Log.d("kotlintest", "私は" + human.hobby + "について考える。")
    }
}