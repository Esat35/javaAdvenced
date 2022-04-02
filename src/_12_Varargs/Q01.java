package _12_Varargs;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        //  verilen Stringleri birlestiren concat isimli bir method olusturunuz
        // input : "m", "e", "r", "v", "e";
        // output : merve

String s1="m";
String s2="e";
String s3="r";
String s4="v";
String s5="e";

concat(s1, s2, s3, s4, s5);
    }

    private static void concat(String ...s) {
        String isim="";
        for (int i = 0; i <s.length ; i++) {
           isim+=s[i];
        }
        System.out.println(isim);
    }


}

