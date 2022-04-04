package tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class T05_KahveMakinesi {
    static String hangiKahve;
    static List<String> kahveList = new ArrayList<>(Arrays.asList("Türk Kahvesi", "Filtre Kahve", "Espresso"));
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

hangiKahve();
sutlüMü();
sekerOlsunMu();
        scan.nextLine();
String boy=hangiBoy();

        System.out.println(hangiKahve+" "+boy+" hazırdır.");

    }

    private static String hangiBoy() {

        System.out.println("Hangi boyutta olsun? (Büyük boy - orta boy - küçük boy olarak giriniz.) : ");

        String boyut=scan.nextLine();
       if(boyut.equalsIgnoreCase("buyuk boy")||boyut.equalsIgnoreCase("orta boy")||boyut.equalsIgnoreCase("kucuk boy")){
           System.out.println("Kahveniz "+boyut+" hazırlanıyor...");

        }else{
           System.out.println("hatalı gırıs yaptınız!!");
           hangiBoy();
       }
       return boyut;
    }

    private static void sekerOlsunMu() {
        System.out.println("Şeker ister misiniz ? (Evet veya hayır cevabını veriniz) : ");
        String seker=scan.next();
        if (seker.equalsIgnoreCase("evet")){
            System.out.println("Kaç Seker İstersiniz.");
            int sekerSayısı=scan.nextInt();
            System.out.println(sekerSayısı+" seker ekleniyor...");
        }else if (seker.equalsIgnoreCase("hayır")){
            System.out.println("Şeker eklenmiyor.");
        }else{
            System.out.println("hatalı gırıs yaptınız!!");
            sekerOlsunMu();
        }
    }

    private static void sutlüMü() {
        System.out.println("Süt eklememizi ister misiniz ? (Evet veya Hayır olarak cevaplayınız):    ");
        String sut=scan.next();
        if (sut.equalsIgnoreCase("evet")){
            System.out.println("Süt ekleniyor...");
        }else if (sut.equalsIgnoreCase("hayır")){
            System.out.println("Süt eklenmiyor...");
        }else {
            System.out.println("Hatalı gırıs yaptınız.");
            sutlüMü();
        }
    }

    private static void hangiKahve() {
        System.out.println(" Hangi Kahveyi İstersiniz?\n" +
                "  1.Türk Kahvesi\n" +
                "  2.Filtre Kahve\n" +
                "  3.Espresso");
        int secim = scan.nextInt();
switch (secim){
    case 1:
    case 2:
    case 3:

        hangiKahve = kahveList.get(secim - 1);
        System.out.println(hangiKahve + " hazırlanıyor...");
        break;
        default:
            System.out.println("hatalı giriş yaptınız!!");
            hangiKahve();
}


    }
}
