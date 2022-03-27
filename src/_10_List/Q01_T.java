package _10_List;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q01_T {

    public static void main(String[] args) {
        /* TASK :

         * Input olarak verilen listteki isimlerden
         * icinde ‘a’ harfi bulunanlari silen bir code create ediniz.
         *
         * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
         * OUTPUT : [Veli,Omer]
         */
List<String> list1 = new ArrayList<String>(Arrays.asList("Ali","Veli","Ayse","Fatma","Omer"));
int list1Boyutu=list1.size();

        for (int i = 0; i <list1Boyutu ; i++) {

            if (list1.get(i).toLowerCase().contains("a")){
                list1.remove(list1.indexOf(list1.get(i)));

            }
        }
        System.out.println(list1);
    }


}
