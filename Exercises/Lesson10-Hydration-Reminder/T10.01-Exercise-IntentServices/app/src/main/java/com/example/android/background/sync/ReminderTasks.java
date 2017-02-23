package com.example.android.background.sync;

import android.content.Context;

import com.example.android.background.utilities.PreferenceUtilities;

public class ReminderTasks {
    public static String ACTION_INCREMENT_WATER_COUNT = "increment-water-count";

    private static void incrementWaterCount(Context c){
        PreferenceUtilities.incrementWaterCount(c);;

    }

    public static void executeTask(Context c, String action){
        if (action.equals(ACTION_INCREMENT_WATER_COUNT))
            incrementWaterCount(c);

    }
}
// DONE (1) Create a class called ReminderTasks

// DONE (2) Create a public static constant String called ACTION_INCREMENT_WATER_COUNT

// DONE (6) Create a public static void method called executeTask
// DONE (7) Add a Context called context and String parameter called action to the parameter list

// DONE (8) If the action equals ACTION_INCREMENT_WATER_COUNT, call this class's incrementWaterCount

// DONE (3) Create a private static void method called incrementWaterCount
// DONE (4) Add a Context called context to the argument list
// DONE (5) From incrementWaterCount, call the PreferenceUtility method that will ultimately update the water count