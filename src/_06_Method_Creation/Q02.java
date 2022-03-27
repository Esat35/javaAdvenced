package _06_Method_Creation;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
		/*
		name1 ve name2 degiskenlerini olusturun.
		name1 degiskeninin karakter sayisi cift ise kelimenin ortasina name2 yi yerlestirin.
		name1 degiskeninin karakter sayisi tek ise "name1 cift sayili olmadigi icin ortasina yerlestiremedik" yazdirinan bir method oluşturun
		          e.g:
		         name1= mehmet
		         name2= ahmet
		         Print ==> mehahmetmet
		*/

        Scanner scan=new Scanner(System.in);
        System.out.print("ilk ismi giriniz : ");
        String num1=scan.next();
        System.out.print("ikinci ismi giriniz : ");
        String num2=scan.next();

        ortasınaYaz(num1,num2);



    }

    private static void ortasınaYaz(String num1, String num2) {

        if(num1.length()%2==0){

            num1=num1.substring(0,num1.length()/2)+num2+num1.substring(num1.length()/2);
            System.out.println(num1);
        }else System.out.println(num1+" isminin harf sayısı tek oldugu ıcın ortasına yerleştıremedık!");

    }


}
