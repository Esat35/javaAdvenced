package Projects.P05_HalukMarket;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class HalukMarket {
    static List<String> urunListesi = new ArrayList<>(Arrays.asList("Domates", "Patates", "Biber", "Soğan", "Havuç", "Elma", "Muz ", "Çilek", "Kavun", "Üzüm", "Limon"));
    static List<Double> fiyatListesi = new ArrayList<>(Arrays.asList(2.1, 3.2, 1.5, 2.3, 3.1, 1.2, 1.9, 6.1, 4.3, 2.7, 0.5));
    static List<String> sepet = new ArrayList<>();
    static double toplamTutar;

    static Scanner scan = new Scanner(System.in);
/* Basarili Market alış-veriş programı.
		 *
		 * 1. Adım: Ürünler ve fiyatları içeren listeleri oluşturunuz.
		 * 			No 	   Ürün 		  Fiyat
				   ====	 =======	 	=========
					00	 Domates   	 	 2.10 TL
					01	 Patates   	 	 3.20 TL
					02	 Biber     	 	 1.50 TL
					03	 Soğan      	 2.30 TL
					04	 Havuç     	   	 3.10 TL
					05	 Elma      	   	 1.20 TL
					06	 Muz     	 	 1.90 TL
					07	 Çilek 	 		 6.10 TL
					08	 Kavun      	 4.30 TL
					09	 Üzüm      	 	 2.70 TL
					10	 Limon     	 	 0.50 TL

		 * 2. Adım: Kullanıcının ürün nosuna göre listeden ürün seçmesini isteyiniz.
		 * 3. Adım: Kaç kg satın almak istediğini sorunuz.
		 * 4. Adım: Alınacak bu ürünü sepete ekleyiniz ve Sepeti yazdırınız.
		 * 5. Başka bir ürün alıp almak istemediğini sorunuz.
		 * 6. Eğer devam etmek istiyorsa yeniden ürün seçme kısmına yönlendiriniz.
		 * 7. Eğer bitirmek istiyorsa ödemeyi kontrol edip para ustu hesaplayarak  programı bitirinzi.
		 */




    public static void main(String[] args) {


        urunsec();

    }

    private static void urunsec() {
        System.out.println("No \t     Ürün \t\t  Fiyat\n" +
                "==      =====         ======");
        for (int i = 0; i < urunListesi.size(); i++) {
            System.out.println((i + 1) + "\t\t" + urunListesi.get(i) + "\t\t\t" + fiyatListesi.get(i));
        }
        System.out.print("Almak istediğiniz urunun kodunu gırınız : ");
        int urunsecim = scan.nextInt();
        System.out.println();
        System.out.print("Kaç kg ıstersınız : ");
        double kacKg = scan.nextDouble();
        System.out.println();
        toplamTutar += fiyatListesi.get(urunsecim - 1) * kacKg;
        String str = "* " + kacKg + " kg. " + urunListesi.get(urunsecim - 1) + "---> TUTARI = " + kacKg * fiyatListesi.get(urunsecim - 1) + " TL.";
        sepet.add(str);
        sepetiYaz(sepet);

        System.out.print("Alıs verıse devam etmek için 1, bitirmek için 2 'yi tuslayınız : ");
        int devamMı = scan.nextInt();

        switch (devamMı) {
            case 1:
                urunsec();
                break;
            case 2:
                kasa();
                break;
            default:
                System.out.println("Hatalı gırıs yaptınız.");
        }

    }

    private static void sepetiYaz(List<String> sepet) {
        System.out.println("Spettekı urunlerınız : \n");
        for (int i = 0; i < sepet.size(); i++) {
            System.out.println(sepet.get(i));

        }
    }

    private static void kasa() {
        System.out.println("Alış verişinizin toplam tutarı : " + toplamTutar + "TL. dir.");
        System.out.print("Ödeme için yatıracagınız mıktarı yazınız  : ");
        double alınanPara = scan.nextDouble();;
        while (alınanPara < toplamTutar) {

            if (alınanPara < toplamTutar) {
                System.out.println("Eksık para gırısı! \n" + (toplamTutar - alınanPara) + " TL. daha yatırmalısınız.");
                alınanPara += scan.nextDouble();
            }


        }
        if (alınanPara > toplamTutar) {
            System.out.println("Para ustunuz " + (alınanPara - toplamTutar + " TL. \nBizi tercih ettiğiniz için tesekkur ederız."));
        } else {
            System.out.println("Bizi tercih ettiğiniz için tesekkur ederız.");
        }
    }
}
