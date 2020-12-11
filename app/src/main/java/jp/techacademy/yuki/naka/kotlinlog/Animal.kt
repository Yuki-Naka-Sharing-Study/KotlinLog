package jp.techacademy.yuki.naka.kotlinlog

abstract class Animal {
    // プロパティ
    open var name: String
    open var age: Int

    // 引数付きコンストラクタ
    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }

    abstract fun say()

    abstract fun think()
}