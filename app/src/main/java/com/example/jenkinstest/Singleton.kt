package com.example.jenkinstest

class Singleton private constructor() {
        companion object {
            val instance = SingletonHolder.holder
        }

        private object SingletonHolder {
            val holder = Singleton()
        }
    fun add(a: Int, b: Int) = a + b
}