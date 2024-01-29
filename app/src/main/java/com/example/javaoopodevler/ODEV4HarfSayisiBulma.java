package com.example.javaoopodevler;

import java.util.Scanner;

public class ODEV4HarfSayisiBulma {
    public static void main(String[] args) {


        Scanner tarayici = new Scanner(System.in);

        System.out.println("kelime giriniz");
        String kelime = tarayici.next();

        System.out.println("harf giriniz ");
         char  harf = tarayici.next().charAt(0);

         OdevlerSinifi o = new OdevlerSinifi() ;

          o.HarfSayisiBulma(kelime,harf);


    }

}
