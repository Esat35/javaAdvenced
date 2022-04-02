package _11_dateTime.HaftaninSorusu;

import java.time.LocalTime;
import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class Registration {
   static Scanner scan=new Scanner(System.in);
   static List<String> kullanıcılist = new ArrayList<String>();
   static List<Integer> kullanıcıKayıtZamanı = new ArrayList<>();


    public static void printHappyUsers(List<Integer> register) {
        for (int i = 0; i <register.size() ; i++) {
            if (register.get(i)<=10){

                System.out.println("tebrıkler sanslı kullanıcımız!  \nsayın :"+kullanıcılist.get(i)+" "+register.get(i)+". sanıye de kayıt yaptınız");

            }
        }

    }


    public static List<Integer> register(){

    System.out.print("kullanıcı adınızı gırınız :");
    String kullanıcıAdı=scan.next();

   int kayıtzamanı= LocalTime.now().getSecond();
        User user=new User(kullanıcıAdı,kayıtzamanı);

        kullanıcılist.add(user.name);
        kullanıcıKayıtZamanı.add(kayıtzamanı);

        System.out.println("kayıt ıslemine devam edecek mısınız ?  (E/H)");
        String cevap= scan.next();

        if(cevap.equalsIgnoreCase("e")){
            register();
        }
 return kullanıcıKayıtZamanı;
}
}
