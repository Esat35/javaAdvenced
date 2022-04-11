package _14_Encapsulation.Q02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserMain {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        List<String> user1=new ArrayList<String>();
        List<String> user2=new ArrayList<String>();
        System.out.print(" id : ");
        String id=scan.next();
        System.out.println();
        System.out.print("Kullanıcı adı : ");
        String kullanıcı=scan.next();
        System.out.println();
        System.out.print("Sifre : ");
String sifre=scan.next();
      user1.add(id);
      user1.add(kullanıcı);
      user1.add(sifre);



    }




}
