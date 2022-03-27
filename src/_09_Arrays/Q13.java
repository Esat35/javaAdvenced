package _09_Arrays;
import java.util.Scanner;
public class Q13 {
    public static void main(String[] args) {
        /* TASK :
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
        3 e bolunebilen sayi adedini yazdıran java code create ediniz (negatif sayilar da dahil olsun)
         */
        int arr[] = new int[8];//8 elemanlı bos int type array cretae edildi
        Scanner scan = new Scanner(System.in);
        int sayac = 0;
        for (int i = 0; i < arr.length; i++) {//arrayin 8 elamanını alındı
            System.out.print(i + ". index elemanı giriniz : ");
            arr[i] = scan.nextInt();
            if (arr[i] % 3 == 0) {//arayın her bir elamnının 3 e tam bolunme kontrolu yapıldı
                sayac++;
            }
        }
        System.out.println("3'e tam bolunebilen eleman sayısı : "+sayac);
    }
}