package Projects.P02_javaBankATM;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


class JavaBankAtm {
   /*      ATM
        Kullaniciya giriş için kart numarasi ve şifresini isteyin, eger herhangi birini yanlis girerse tekrar isteyin.
        Kart numarasi aralarda boşluk ile girerse de eger doğruysa kabul edin.
        Kart numarasi ve sifre dogrulanirsa kullanicinin yapabileceği işlemleri ekrana yazdirin,

        Bakiye sorgula, para yatirma, para çekme, para gönderme, sifre değiştirme ve cikis.

        Para çekme ve para gonderme işleminde mevcut bakiyeden buyuk para çekilemez,
        Para gönderme işleminde istenen iban TR ile baslamali ve toplam 26 karakterli olmali, eger değilse menü ekranina geri donsun.
        Sifre değiştirme işleminde mevcut şifreyi teyit ettikten sonra, sifre değişiklik işlemini yapmali,       */

    static Scanner scan = new Scanner(System.in);
    static String kartNo = "1234567890";
    static int sifre = 1234;
    static double bakiye = 1000;

    public static void main(String[] args) {


        bilgileriAl();


    }

    public static void bilgileriAl() {
        System.out.print("kart no : ");
        String girilenNo = scan.nextLine();

        System.out.print("sifrenızı gırınız : ");
        int girilensifre = scan.nextInt();
        System.out.println();


        String arr[] = girilenNo.split(" ");
        girilenNo = "";
        for (int i = 0; i < arr.length; i++) {
            girilenNo += arr[i];
        }


        if (girilenNo.equalsIgnoreCase(kartNo) && sifre == girilensifre) {

            islemler();

        } else {

            if (!kartNo.equalsIgnoreCase(girilenNo)) {
                System.out.println("yanlış kart numarası gırısı yaptınız!");
            }
            if (sifre != girilensifre) {
                System.out.println("yanlış şifre girişi yaptınız !");
            }
            bilgileriAl();
        }
    }

    private static void islemler() {
        // Bakiye sorgula, para yatirma, para çekme, para gönderme, sifre değiştirme ve cikis.

        System.out.print("1.Bakiye Sorgulama\n2.Para Yatırma\n3.Para Çekme\n4.Para Gönderme\n5.Şifre Değiştirme\n6.Çıkış\nişlem secçiminizi tuşlayınız : ");
        int secim = scan.nextInt();

        switch (secim) {
            case 1:
                bakiyeOgren();
                break;
            case 2:
                paraYatır();
                break;
            case 3:
                paraCek();
                break;
            case 4:
                paraGonder();
                break;
            case 5:
                sıfreDegis();
                break;
            case 6:
                System.out.println("İyi Günler Dileriz...");
                break;
            default:
                System.out.println("hatalı secım. Tekrar deneyınız.");
                islemler();
        }


    }

    private static void paraGonder() {
        System.out.print("gondermek ıstedıgınız mıktrı gırınız : ");
        double gonderılecekMıktar = scan.nextDouble();
        System.out.println();
        if (gonderılecekMıktar < bakiye) {
            System.out.println("iban numarsaını gırınız : ");
            String ıbanNo = scan.next();

            if (ıbanNo.startsWith("TR")) {
                if (ıbanNo.length() == 26) {
                    bakiye -= gonderılecekMıktar;
                    System.out.println("para gonderme işlemi basarı ıle gerceklesti.\nGonderilen miktar : " + gonderılecekMıktar + "\nKalan bakıyenız : " + bakiye);
                    System.out.println("devam etmek için herhangi bir tusa basınız");
                    scan.next();
                    islemler();
                } else {
                    System.out.println("iban numarası 26 hanelı olmalı.");
                    System.out.println("devam etmek için herhangi bir yusa basınız");
                    scan.next();
                    islemler();
                }
            } else {
                System.out.println("iban TR ile baslamalı!");
                System.out.println("devam etmek için herhangi bir yusa basınız");
                scan.next();
                islemler();
            }

        }
    }

    private static void sıfreDegis() {
        System.out.print("mevcut sıfrenızı gırınız : ");
        System.out.println();
        int sifreKontrol = scan.nextInt();
        if (sifreKontrol == sifre) {
            System.out.print("yeni sifrenizi giriniz : ");
            int yeniSifre = scan.nextInt();
            System.out.println("yeni sifrenizi " + yeniSifre + " olarak onaylıyor musunuz?  (E/H)");
            String onaylansınMı = scan.next();
            if (onaylansınMı.equalsIgnoreCase("e")) {
                sifre = yeniSifre;
                System.out.println("işlem basarı ıle yapıldı. Yenı sıfrenız : " + sifre);
                System.out.println("devam etmek için herhangi bir yusa basınız");
                scan.next();
                islemler();
            }


        } else {
            System.out.println("sıfrenız uyusmadı tekrar deneyınız");
            System.out.println("devam etmek için herhangi bir yusa basınız");
            scan.next();
            islemler();
        }
    }

    private static void paraCek() {
        System.out.print("çekmek ıstedıgınız mıktarı gırınız : ");
        double cekilenMiktar = scan.nextDouble();

        if (cekilenMiktar < bakiye) {
            bakiye -= cekilenMiktar;
            System.out.println("işleminiz yapıldı. \nKalan bakiyeniz : " + bakiye);
            System.out.println("devam etmek için herhangi bir yusa basınız");
            scan.next();
            islemler();
        } else {
            System.out.println("bakıyenız yetersız!\ndevam etmek için herhangi bir tusa basın.");
            scan.next();
            islemler();

        }

    }

    private static void paraYatır() {
        System.out.print("yatıracagınız miktari giriniz : ");
        double yatanPara = scan.nextDouble();
        bakiye += yatanPara;
        System.out.println("işleminiz yapıldı. Yeni bakıyenız : "+bakiye);
        System.out.println("devam etmek için herhangi bir yusa basınız");
        scan.next();
        islemler();
    }

    private static void bakiyeOgren() {
        System.out.println("mevcut bakıyenız : " + bakiye + " TL.");
        System.out.println("devam etmek için herhangi bir tusa basınız");
        scan.next();
        islemler();
    }
}


