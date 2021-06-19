package com.company;

public class Person {

    public static void main(String[] args) {
        String fullNameAidar = "Мусаев Айдар Нурсултанович";
        String[] person1 = fullNameAidar.split("\\s");
        for (String subStr:person1){
            System.out.println(subStr);
        }

        String fullNameMaksat = "Азамат уулу Максат";
        String[] person2 = fullNameMaksat.split("\\s");
        for (String subStr:person2){
            System.out.println(subStr);
        }

        String fullNameElina = "Азамат уулу Максат";
        String[] person3 = fullNameElina.split("\\s");
        for (String subStr:person2){
            System.out.println(subStr);
        }
    }
}
