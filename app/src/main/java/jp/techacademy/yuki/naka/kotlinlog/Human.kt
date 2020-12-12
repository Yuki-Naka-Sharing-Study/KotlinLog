package jp.techacademy.yuki.naka.kotlinlog

import android.util.Log

open class Human: Animal, Thinkable {
    // プロパティ
    var hobby: String

    // 引数付きコンストラクタ
    constructor(name: String, age: Int, hobby: String): super(name, age, hobby) {
        this.hobby = ""
    }


    // Animalクラスのメソッドをオーバーライド  (私の名前は〜〜です。年は〜〜歳です。)
    override fun say() {
        Log.d("kotlintest", this.name + "" + this.age + "歳")
    }

    // Thinkableインターフェイスのメソッドをオーバーライド
    override fun think() {
        Log.d("kotlintest", this.name + "" + this.age + "歳" + "は" + ""+ "について考える。")
    }
}