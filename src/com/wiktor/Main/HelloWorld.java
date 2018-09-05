package com.wiktor.Main;


import com.wiktor.Model.ModelScanner;
import com.wiktor.Model.User;

public class HelloWorld {

    public static void main(String[] args) {

        User user = new User("Wiktor", "Krzyżanowski");

        new ModelScanner().printObject(user);

        System.out.println("nowyBranch");

    }

}
