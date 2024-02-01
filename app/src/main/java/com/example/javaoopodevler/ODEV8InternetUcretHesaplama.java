package com.example.javaoopodevler;

import java.util.Scanner;

public class ODEV8InternetUcretHesaplama {

    public static void main(String[] args) {

        Scanner tarayici = new Scanner(System.in);

        System.out.println("aylık gb kullanımını giriniz");
         int gb = tarayici.nextInt();

          new OdevlerSinifi().internetUcretiHesaplama(gb);




    }
}
