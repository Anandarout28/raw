package com.ananda.raw;

import java.time.ZoneId;

public class TimeZoneTest {
    public static void main(String[] args) {

        System.setProperty("user.timezone", "Asia/Kolkata");

        System.out.println("System timezone: " + ZoneId.systemDefault());
    }
}