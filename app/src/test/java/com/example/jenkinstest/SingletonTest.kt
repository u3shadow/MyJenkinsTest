package com.example.jenkinstest

import org.junit.Assert.*

class SingletonTest {
    @org.junit.Test
    fun testGetInstance() {
        val instance1 = Singleton.instance
        val instance2 = Singleton.instance
        assertEquals(instance1, instance2)
    }
    @org.junit.Test
    fun testAdd() {
        val instance = Singleton.instance
        assertEquals(3, instance.add(2, 2))
    }
}