package com.example.guide;

import java.util.ArrayList;
import java.util.List;

public class QuestBank {
    private static List<Bank> orfoepQue () {

        final List<Bank> bank = new ArrayList<>();
        final 
    }

    public static List<Bank> getquiz (String selectedtopic){
        switch (selectedtopic){
            case "orfoep" : return orfoepQue();
            default: return paronicQue();
        }
    }
}
