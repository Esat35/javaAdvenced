package alıstırma;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class A1 {
    /* TASK :

     * Input olarak verilen listteki isimlerden
     * icinde ‘a’ harfi bulunanlari silen bir code create ediniz.
     *
     * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
     * OUTPUT : [Veli,Omer]
     */

    public static void main(String[] args) {

        List<String> list1 = new ArrayList<String>(Arrays.asList("Ali", "Veli", "Ayse", "Fatma", "Omer"));
        List<String> yeniList = new ArrayList<String>();

        for (int i = 0; i < list1.size(); i++) {

            if (!list1.get(i).toLowerCase(Locale.ROOT).contains("a")) {

                yeniList.add(list1.get(i));
            }
        }

        System.out.println(yeniList);
    }
}
