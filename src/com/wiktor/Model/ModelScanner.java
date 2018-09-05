package com.wiktor.Model;

import java.util.Scanner;

public class ModelScanner {

    private String myText;

    public void startScanner() {
        System.out.println("Please insert some text to output:");
        Scanner scan = new Scanner(System.in);
        System.out.print("Text: ");
        this.setMyText(scan.nextLine());
        System.out.println("Your text is: " + this.getMyText());
    }

    public String getMyText() {
        return myText;
    }

    public void setMyText(String myText) {
        this.myText = myText;
    }

}
