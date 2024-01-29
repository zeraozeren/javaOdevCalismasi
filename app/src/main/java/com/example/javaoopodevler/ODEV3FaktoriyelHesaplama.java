package com.example.javaoopodevler;

import java.util.Scanner;

public class ODEV3FaktoriyelHesaplama {
     public static void main (String args[]){

         Scanner tarayici = new Scanner( System.in);
           System.out.println("faktöriyel hesabı için sayı giriniz");
         int sayi = tarayici.nextInt();

         OdevlerSinifi o = new OdevlerSinifi();

          int  faktoriyel = o.faktoriyel(sayi);

          System.out.println("faktoriyel sonu : " + faktoriyel);


     }
}
