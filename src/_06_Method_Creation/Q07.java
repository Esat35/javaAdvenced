package _06_Method_Creation;

public class Q07 {
    /*      TASK:
        reverseString isminde bir method create ediniz.
        Bu method bir String'i parametre olarak alsın.
        Ve bu method, girilen String'i tersten print etsin.


        Örn: String = "Java'yı Seviyorum."
        Print: .muroyiveS ıy'avaJ
         */


    public static void main(String[] args) {


        String str="Java'yı Seviyorum.";

        reverseString(str);

    }

    private static void reverseString(String str) {
        String yeniStr="";

        for (int i = 0; i <str.length() ; i++) {

            yeniStr+=str.substring(str.length()-1-i,str.length()-i);


        }

        System.out.println(yeniStr);
    }


}
