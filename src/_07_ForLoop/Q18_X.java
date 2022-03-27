package _07_ForLoop;

public class Q18_X {


    public static void main(String[] args) {


//        1
//        2 3
//        4 5 6
//        7 8 9 10
//        11 12 13 14 15
//        16 17 18 19 20 21
//        22 23 24 25 26 27 28
//        29 30 31 32 33 34 35 36

        for (int i = 1; i <36 ; i++) {

            for (int j = i; j <2*i ; j++) {
                System.out.print((j)+" ");
            }
            System.out.println();
        }


    }
}
