package jp.techacademy.yuki.naka.kotlinlog

import android.util.Log

open class Human: Animal, Thinkable {
    // プロパティ
    var hobby: String

    // 引数付きコンストラクタ
    constructor(name: String, age: Int, hobby: String): super(name, age) {
        this.hobby = hobby
    }

    // Animalクラスのメソッドをオーバーライド  (私の名前は〜〜です。年は〜〜歳です。)
    override fun say() {
        Log.d("kotlintest", "私の名前は" + "this.name" + "です。" + "年は" + "(" + "this.age" + "歳)" + "です。")
    }

    // Thinkableインターフェイスのメソッドをオーバーライド　（私は〜〜について考える。）
    override fun think() {
        Log.d("kotlintest", "私は" + "this.hobby" + "について考える。")
    }
}