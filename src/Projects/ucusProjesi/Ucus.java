package Projects.ucusProjesi;

public class Ucus {
    String guzergah;

    String ucusTipi;
    int yas;
    static double biletfiyatı;


    Ucus() {

    }

    public Ucus(String guzergah, String ucusTipi, int yas) {
        this.guzergah = guzergah;
        this.ucusTipi = ucusTipi;
        this.yas = yas;

    }




    public static void fiyatBulGuzergah(String guzergah) {
        switch (guzergah) {
            case "b":
                biletfiyatı = 500 * 0.1;
                break;
            case "c":
                biletfiyatı = 700 * 0.1;
                break;
            case "d":
                biletfiyatı = 900 * 0.1;
                break;
            default:
                System.out.println("hatalı guzergah gırısı yaptınız");
        }
    }


    public static void fiyatBulYas(int yas) {
        if (yas < 0) {
            System.out.println("yas negatif olamaz!!");
        } else if (yas >= 65) {
            biletfiyatı *= 0.7;
        } else if (yas >= 12 && yas < 24) {
            biletfiyatı *= 0.9;
        } else if (yas < 12) {
            biletfiyatı *= 0.9;
        }

    }

    public static void fiyatBulUcusTipi(String ucusTipi) {
        if (ucusTipi.equals("2")) {
            biletfiyatı *= 0.8 * 2;
        }
    }

}
