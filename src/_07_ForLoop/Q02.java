package _07_ForLoop;

public class Q02 {
    public static void main(String[] args) {


// 0-255 e kadar olan harflerin , sayı ve harf değerini konsola yazdırınız.
int sayı=0;
        for (char i = 0; i <=255 ; i++) {

            System.out.print("harf : "+i+"    ");
            System.out.println("sayı karsılıgı : "+ ( sayı=i));
        }

    }
}


