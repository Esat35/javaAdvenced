package _09_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Q01 {

	/* TASK :
	 kullanicin girdigi sayi kadar int array olusturan ve array elemanlarini kullanicidan alan
	 ve girilen array elemanlarinin en buyuk ile en kucuk elemaninin arasinki farki gosteren
	 java code create ediniz.

	 */
	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.print("olusturmak ıstedıgınız array'ın boyutunu gırınız : ");
		int boyut =scan.nextInt();
int arr[]=new int[boyut];

		for (int i = 0; i <boyut ; i++) {
			System.out.print(i+". index için eleman gırınız:  ");
			arr[i]=scan.nextInt();

		}

		System.out.println("arrayınız : "+Arrays.toString(arr));
		Arrays.sort(arr);

		System.out.println("en buyuk ve en kucuk elemanlar arasındakı fark : "+(arr[arr.length-1]-arr[0]));

	}

}
