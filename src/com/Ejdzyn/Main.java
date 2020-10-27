package com.Ejdzyn;

public class Main {

    public static void main(String[] args) {
        String pwd = "ala ma kota";

        AtBashCipher coder = new AtBashCipher();

        System.out.println(coder.encode(pwd));

    }
}
