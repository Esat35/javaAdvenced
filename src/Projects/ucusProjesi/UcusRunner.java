package Projects.ucusProjesi;

import java.util.Locale;
import java.util.Scanner;

public class UcusRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("guzergah seciniz (B,C,D 'den birini seciniz  : ");
        String guzergah = scan.next().toLowerCase(Locale.ROOT);
        System.out.print("\n1.Tek Yön\n2.Gidiş-Dönüş\nUcus tipi secin :");
        String ucusTipi = scan.next().toLowerCase(Locale.ROOT);
        System.out.print("yasınızı gırınız : ");
        int yas = scan.nextInt();


        Ucus u1 = new Ucus(guzergah, ucusTipi, yas);


        u1.fiyatBulGuzergah(guzergah);
        u1.fiyatBulYas(yas);
        u1.fiyatBulUcusTipi(ucusTipi);

        if ("bcd".contains(guzergah) && "12".contains(ucusTipi) && yas > 0) {
            System.out.println(guzergah.toUpperCase() + " guzergahı için bilet tutarınız : " + u1.biletfiyatı + " $ dir.");
        } else System.out.println("Hatalı veri girişi yaptıgınız ıcın ucus planlanamadı!!");


    }


}
