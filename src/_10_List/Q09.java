package _10_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q09 {
    public static void main(String[] args) {


    /*  Write a Java program to get a String from user as input and find the maximumCounts occurring character in that string.
         (Ignore case sensitivity)

         Kullanicidan aldiginiz bir string icinde en cok tekrar eden karakteri yazdiran code create ediniz.
       input : Learning java is easy
       output: maximumCounts occurring character is : a
        */


        String input= "Learning java is easy";

        List<String> list= new ArrayList<String>();

        for (int i = 0; i <input.length() ; i++) {
            list.add(input.substring(i,i+1));
        }

        System.out.println(list);

        String enCokTekrarEden="";
        int count=0;
        int tekrarSayısı=0;
        int maxTekrar=0;


        for (int i=0; i<list.size(); i++) {
            count=0;
            for (int j=0; j<list.size(); j++) {
                if (list.get(i).equals(list.get(j))){
                    count++;
                }
            }

            if (count>=tekrarSayısı){
                maxTekrar=count;
                enCokTekrarEden=list.get(i);
                tekrarSayısı=count;
            }
        }

        System.out.println("en cok tekrar eden harf : "+enCokTekrarEden+" tekrar sayısı : "+maxTekrar);


    }
}

