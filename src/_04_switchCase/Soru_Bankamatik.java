package _04_switchCase;

import java.util.Scanner;

public class Soru_Bankamatik {
  /*
  Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma ve cekme, çıkış işlemlerinin yapıldıgı bir ATM app. code create ediniz
   */


    public static void main(String[] args) {


         double bakıye=1000;
        Scanner scan=new Scanner(System.in);
        System.out.println("       ****    ");
        System.out.println(" ATM'ye hos geldiniz  :-)    ");
        System.out.print("1.Bakiye ogrenme\n2.Para yatırma\n3.Para çekme\n4.Çıkış\nİşleminizi seciniz : ");
int işlem=scan.nextInt();
switch (işlem)
{
    case 1:
        System.out.println("Bakıyenız : "+bakıye);break;
    case 2:
        System.out.print("Yatıracagınız miktarı gırınız : ");
        double yatanMiktar=scan.nextDouble();
        bakıye+=yatanMiktar;
        System.out.println("işleminiz basarı ıle yapıldı.\nyatırılan miktar : "+yatanMiktar+" yenı bakıyenız : "+bakıye);
        break;
    case 3:
        System.out.print("cekmek istediginiz miktarı gırınız : ");
        double cekılecekMiktarı =scan.nextDouble();

        if(cekılecekMiktarı>bakıye){
            System.out.println("uzgunuz bakıyenız yetersız .");
        }else {
            bakıye-=cekılecekMiktarı;
            System.out.println("işleminiz basarı ıle yapıldı \nkalan bakıyenız : "+bakıye);
            break;
        }

    case 4:
        System.out.println("iyi gunler dılerız ..."); break;
    default:
        System.out.println("hatalı gırıs...");
}
  }
}

