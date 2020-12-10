package jp.techacademy.yuki.naka.kotlinlog

import android.util.Log

abstract class Human: Animal, Thinkable {
    // プロパティ
    override var name: String
    override var age: Int
    override var hobby: String

    // 引数付きコンストラクタ
    constructor(name: String, age: Int, hobby: String) : this(name,0, hobby) {
        this.name = name
        this.age = age
        this.hobby = hobby
    }

    // Animalクラスのメソッドをオーバーライド  (私の名前は〜〜です。年は〜〜歳です。)
    override fun say() {
        super.say()
        Log.d("kotlintest", this.name + "(" + this.age + "歳)")
    }

    // Thinkableインターフェイスのメソッドをオーバーライド
    override fun think() {
        super.think()
        Log.d("kotlintest", this.name + "(" + this.age + "歳)" + "は" + this.hobby + "について考える。")
    }
}