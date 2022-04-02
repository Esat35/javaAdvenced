package _11_dateTime.HaftaninSorusu;

import _11_dateTime.HaftaninSorusu.Registration;
import _11_dateTime.HaftaninSorusu.User;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {

            Registration userReg = new Registration();
            List<Integer> register = userReg.register();
         userReg.printHappyUsers(register);




    }
}
