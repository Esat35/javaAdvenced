package _13_StringBuilder;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
		/*
		Bir cümleyi parametre olarak kabul eden, StringBuilder kullanarak cümleyi ters çeviren ve cümlenin palindrom
	        olup olmadığını kontrol eden (büyük/küçük harf duyarlılığı olmadan) bir Java programı yazın.
	     (without case sensitivity)
	     Eg : input : I love Java
	     Output: "Reversed sentence : avaJ evol I 
	        It is not a palindrome"

		 */


        Scanner scan = new Scanner(System.in);
        System.out.print("bir cumle gırınız : ");
        String str = scan.nextLine();
        StringBuilder sb=new StringBuilder();
        sb.append(str);
        sb.reverse();

        if (sb.toString().equalsIgnoreCase(str)){
            System.out.println("girilen cumle palındrome..");
        }else System.out.println("gırlen cumle palındrome degıl!!");

    }

}
