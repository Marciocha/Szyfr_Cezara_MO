package com.sdajava.szyfr_cezara;

import java.util.Scanner;

public class Main {

    public static String szyfr(String str) {

            char x[ ] = str.toCharArray(); //string.toCharArray kopiuje znaki z tego wystapienia na tablicy znakow Unicode

            for( int i = 0; i != x.length ; i++)
            {
                int n = x[i];
                n += 3;
                x[i] = (char) n;
                System.out.print(x[i]);
            }
            return new String(x);
    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj tekst jaki chcesz zaszyfrowac: ");

        String t = scanner.nextLine();

        Main main = new Main();
        main.szyfr(t);
    }
}
