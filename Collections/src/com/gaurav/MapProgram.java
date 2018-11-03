package com.gaurav;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {

    public static void main(String[] args) {
        Map<String, String> language = new HashMap<>();
        if (language.containsKey("Java")){
            System.out.println("Java is already in map");
        }else{
            language.put("Java", "a complied , OOPS language");
            System.out.println("Java added");
        }
        language.put("Python", "interpreter , OOPS language");
        language.put("Algo", "algorithms");
        System.out.println(language.put("BASIC", "Old language"));
        System.out.println(language.put("Lisp", "qwe"));


        if (language.containsKey("Java")){
            System.out.println("Java is already in map");
        }else{
            System.out.println("--> " + language.put("Java", "testing this"));
        }


        System.out.println("========================");
//        language.remove("Lisp");

//        if(language.remove("Algo", "a family of algo")){
        if(language.remove("Algo", "algorithms")){
            System.out.println("Algo removed");
        }else{
            System.out.println("Algo not removed, key/value pair not " +
                    "found");
        }

        if(language.replace("Lisp","qwe", "a functional programming")){
            System.out.println("List replaced");
        }else{
            System.out.println("List not replaced");
        }

        System.out.println(language.replace("Scala", "a functional programming"));
        for(String key: language.keySet()){
            System.out.println(key + " : " + language.get(key));
        }


    }
}
