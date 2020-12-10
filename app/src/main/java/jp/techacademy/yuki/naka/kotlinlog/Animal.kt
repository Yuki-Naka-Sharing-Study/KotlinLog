package jp.techacademy.yuki.naka.kotlinlog

abstract class Animal {
    // プロパティ
    open var name: String
    open var age: Int
    open var hobby: String

    // 引数付きコンストラクタ
    constructor(name: String, age: Int, hobby: String) {
        this.name = name
        this.age = age
        this.hobby = hobby
    }

    abstract fun say()

    abstract fun think()
}