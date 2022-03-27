package filmTahmin;

import java.util.*;

public class FilmTahmin {
    static Scanner scan = new Scanner(System.in);
    static List<String> film = new ArrayList<>(Arrays.asList("JOKER", "INCEPTION", "PIYANIST", "GREENMILE", "LEON", "GODFATHER", "JURASSICPARK", "TITANIC"));
/*
 TASK :
  yukarıdaki film listinde bulunan filmlerden herhangi birisini kullanıcının filim ismini  görmeden
  filmin index nosuna göre sectiriniz
  seçilen filmin  ismini filmin harf saysının 2 katı kadar hak tanıyarak tahmin etmesini
  sağlayan method create ediniz...
  Ahanda TRICK...
  kullanıcının sectiği filmin harf sayısını  console yazdırınız.
  kullanıcının sectiği film için tahmin hakkını  console yazdırınız.
  kullanıcının her tahmininde kalan hak sayısını console yazdırınız.
  kullanıcının her tahmininde doğru ve yanlış tahmin  sayısını console yazdırınız.
  kullanıcının kaybedip veya kazandığını ve tahmin etmesi gereken filmin ismini  console yazdırınız.

 */

    public static void main(String[] args) {


        System.out.println("~~~FILM TAHMIN OYUNUNA HOSGELDINIZ~~~");


        filmTahminEt();


    }

    private static void filmTahminEt() {
        System.out.println("1-" + (film.size()) + " arasinda bir sayi giriniz");
        int filmNo = scan.nextInt();

        if (filmNo>=1&&filmNo<=8){
            int tahminHakkı = film.get(filmNo - 1).length() * 2;
            int yanlısTahmin = 0;

            String tahmin = "";
            boolean tahminDogruMu = true;
            System.out.println("Filmin harf sayısı : " + film.get(filmNo - 1).length());

            do {
                System.out.println(tahminHakkı + " tahmın hakkınız var!");
                System.out.print("Film tahminizi yazınız : ");
                tahmin = scan.next();
                tahminHakkı--;


                if (tahmin.equalsIgnoreCase(film.get(filmNo - 1))) {
                    System.out.println("tebrikler " + (yanlısTahmin + 1) + ". denemede filmi bildiniz.");
                    System.out.println("Tahmin etmeniz gereken filmin adı : " + film.get(filmNo - 1));
                    System.out.println("yanlış tahmın sayısı : " + yanlısTahmin);
                    System.out.println("dogru tahmın sayısı : 1");


                    System.out.println("oyuna devam edecek misiniz? (E/H)");
                    String devamMı = scan.next();

                    if (devamMı.equalsIgnoreCase("e")) {
                        filmTahminEt();
                    } else {
                        System.out.println("Oyuna katıldıgınız ıcın tesekkur ederız...");
                        tahminDogruMu = false;
                        break;
                    }
                    break;


                } else {
                    yanlısTahmin++;
                    System.out.println("yanlış tahmın sayısı : " + yanlısTahmin);

                }


            } while (tahminHakkı > 0);

            if (tahminDogruMu) {
                System.out.println("Tahmin etmeniz gereken filmin adı : " + film.get(filmNo - 1));
                System.out.println("yanlış tahmın sayısı : " + yanlısTahmin);
                System.out.println("dogru tahmın sayısı : 0");

                System.out.println("oyuna devam edecek misiniz? (E/H)");
                String devamMı = scan.next();
                if (devamMı.equalsIgnoreCase("e")) {
                    filmTahminEt();
                } else System.out.println("Oyuna katıldıgınız ıcın tesekkur ederız...");

            }
        }else {
            System.out.println("1-8 arasında sayı gırmelısınız!!");
        }

    }
}
