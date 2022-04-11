package Projects.P07_GeometrikHesaplama;

import java.util.Scanner;

public class Islemler {
    static Scanner scan = new Scanner(System.in);



    public static void islemlerMenusu() {

        System.out.print("\n1:Kare\n2:Dikdörtgen\n3:Cember \n4:Çıkış\nYapmak istediğiniz işlemin numarasını gırınız : ");
        int islem = scan.nextInt();

        switch (islem) {
            case 1:
                kareIslemleri();
                islemlerMenusu();
                break;
            case 2:
                dikdortgenIslemleri();
                islemlerMenusu();
                break;
            case 3:
                cemberIslemleri();
                islemlerMenusu();
                break;
            case 4:
                System.out.println("Güle Güle...");
                break;
            default:
                System.out.println("Hatalı işlem seçimi yaptınız!!  Tekrar deneyiniz.");
                islemlerMenusu();
        }

    }

    private static void kareIslemleri() {

        Sekil kare = new Kare();
        System.out.print("Karenin bir kenar uzunlugunu  gırınız : ");
        kare.uzunKenar = scan.nextDouble();
        kare.kısaKenar = kare.uzunKenar;
        System.out.print("\nAlan hesaplamak için 1\nÇevre hesaplamak için 2\ntuşlayınız : ");
        int tercih = scan.nextInt();
        if (tercih == 1) {
            kare.alanBul(kare.uzunKenar, kare.kısaKenar);
        } else if (tercih == 2) {
            kare.cevreBul(kare.uzunKenar, kare.kısaKenar);
        } else {
            System.out.print("Hatalı tuşlama yaptınız ");
            kareIslemleri();
        }
        System.out.print("Devam etmek için herhangi bir tusa basınız : ");
        scan.next();

    }

    private static void dikdortgenIslemleri() {

        Sekil dikdortgen = new Dikdortgen();
        System.out.print("Dikdörtgenin uzun kenarını gırınız : ");
        dikdortgen.uzunKenar = scan.nextDouble();
        System.out.print("Dikdörtgenin kısa kenarını gırınız : ");
        dikdortgen.kısaKenar = scan.nextDouble();

        System.out.print("\nAlan hesaplamak için 1\nÇevre hesaplamak için 2\ntuşlayınız : ");
        int tercih = scan.nextInt();
        if (tercih == 1) {
            dikdortgen.alanBul(dikdortgen.uzunKenar, dikdortgen.kısaKenar);
        } else if (tercih == 2) {
            dikdortgen.cevreBul(dikdortgen.uzunKenar, dikdortgen.kısaKenar);
        } else {
            System.out.println("Hatalı tuşlama yaptınız ");
            dikdortgenIslemleri();
        }
        System.out.print("Devam etmek için herhangi bir tusa basınız : ");
        scan.next();


    }

    private static void cemberIslemleri() {

        Sekil cember = new Cember();
        System.out.print("cemberin yarı capını gırınız : ");
        cember.yarıCap = scan.nextDouble();

        System.out.print("\nAlan hesaplamak için 1\nÇevre hesaplamak için 2\ntuşlayınız : ");
        int tercih = scan.nextInt();
        if (tercih == 1) {
            cember.alanBul(cember.yarıCap);
        } else if (tercih == 2) {
            cember.cevreBul(cember.yarıCap);
        } else {
            System.out.print("Hatalı tuşlama yaptınız ");
            dikdortgenIslemleri();
        }
        System.out.print("Devam etmek için herhangi bir tusa basınız : ");
        scan.next();


    }
}
