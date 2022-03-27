package _09_Arrays;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		/*
		 * Anagram, bir kelimenin harflerinden baska bir kelime olusturmaya denir.
			Kullanıcıdan alınacak  iki kelimenin Anagram durumunu belirleyen  Java kodunu yazınız.
			isAnagram("listen", "Silent") ==> true
		 */

		Scanner scan=new Scanner(System.in);
		System.out.print("anagram olup olmadıgını kontrol etmek ıcın 2 kelıme gırınız : ");
		String kelıme1=scan.next().toLowerCase(Locale.ROOT);
		String kelıme2=scan.next().toLowerCase(Locale.ROOT);

		String arr1[]=kelıme1.split("");
		String arr2[]=kelıme2.split("");

		Arrays.sort(arr1);
		Arrays.sort(arr2);

		if (Arrays.equals(arr1, arr2)){
			System.out.println("kelımeler anagram.");
		}else System.out.println("kelımeler anagram degıl!");



	}

}
