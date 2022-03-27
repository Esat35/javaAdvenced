package _05_StringManipulation;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
       /*
        TASK :
        kullanıcıdan bir e-posta adresi girmesini isteyin, ardından "hotmail" içeriyorsa, "gmail" ile değiştirin,
        örneğin: johnbrown@hotmail.com ==> johnbrown@gmail.com
        */

        Scanner scan=new Scanner(System.in);
        System.out.print("e-posta adresınızı gırınız : ");
String eposta = scan.next();

if (eposta.contains("hotmail")){
    System.out.println(eposta.replace("hotmail", "gmail"));


}else System.out.println("e-postanız zaten gmail içeriyor");





    }
}
