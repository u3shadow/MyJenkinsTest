package com.example.jenkinstest;

import static org.junit.Assert.*;

public class MainActivityTest {

        @org.junit.Test
        public void onCreate() {
            MainActivity mainActivity = new MainActivity();
            assertEquals(2,mainActivity.addFunction(2,1));
        }
}