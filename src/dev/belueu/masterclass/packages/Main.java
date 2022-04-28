package dev.belueu.masterclass.packages;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        MyWindow myWindow = new MyWindow("Complete Java");
        myWindow.setVisible(true);
    }
}
