package alıstırma;

import java.util.Scanner;

public class A2 {
    public static void main(String[] args) {
        String [] movies= {"JOKER","INCEPTION","PIYANIST","GREENMILE","LEON","GODFATHER","JURASSICPARK","TITANIC","kILLBILL","MILLENIUMMAMBO"};
      Scanner scan = new Scanner(System.in);

        int choice;
        int pLeft;
        int dogru=0;
        int yanlis=0;
        while(true) {

            while(true) {
                System.out.println("Tahmin edeceginiz filmin 0-9 arasinda seciniz");
                choice=scan.nextInt();

                if(choice >= 0 && choice<10) {
                    break;
                }else {
                    System.out.println("1-10 arasi deger gir gerizekali");
                }
            }
            pLeft=movies[choice].length()*2;
            System.out.println("girdiginiz filmin karakter sayisi= " + movies[choice].length() + "\t Tahmin hakkiniz= " + pLeft );
            while(pLeft>0) {
                pLeft--;
                System.out.println("film tahmininde bulununuz");
                String movie=scan.next().toLowerCase().trim();

                if(movies[choice].toUpperCase().equals(movie)) {
                    ++dogru;
                    System.out.println("bildiniz. Kalan tahmin sayiniz= " + pLeft);
                    break;
                }else{
                    ++yanlis;
                    System.out.println("bilemediniz. Kalan tahmin sayiniz= " + pLeft);

                }
            }
            System.out.println("Butun tahmin hakkinizi kullandiniz" );
            System.out.println("kazandiginiz oyun=" + dogru + "\nKaybettiginiz oyun sayisi= " + yanlis );
            System.out.println("************************************************************");
            System.out.println("devam etmek istiyor musunuz? Istiyorsaniz: \n1 \nıstemiyorsaniz \n2  ");
            int gobreak=scan.nextInt();
            if(gobreak==1) {
                continue;
            }else {
                System.out.println("get out here!!");
                break;
            }
        }
    }
}
