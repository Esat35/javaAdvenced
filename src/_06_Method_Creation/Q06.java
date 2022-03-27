package _06_Method_Creation;

public class Q06 {

 /*
        TASK  :
        Bir String içindeki tüm karakterleri en fazla bir kez yazdıran parametreli bir method create ediniz.
        Test Data:
        input: "aabbcccccddddaaa"
        output: abcd
     */
 public static void main(String[] args) {
     String str="aabbcccccddddaaa";

     karakterler(str);



 }

    private static void karakterler(String str) {
     String karakterler="";
        for (int i = 0; i <str.length() ; i++) {

            if (!karakterler.contains(str.substring(i,i+1))){
                karakterler+=str.substring(i,i+1);

            }


        }

        System.out.println("Stringdekı harfler : "+karakterler);
    }

}
