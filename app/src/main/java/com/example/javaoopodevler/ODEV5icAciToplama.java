package com.example.javaoopodevler;

import java.util.Scanner;

public class ODEV5icAciToplama {
     public static  void main (String args []){


         Scanner tarayici = new Scanner( System.in);

         System.out.println(" kenar sayisi giriniz");
       int kenarSayisi = tarayici.nextInt();

       OdevlerSinifi o =  new OdevlerSinifi();

        int sonuc = o.icAciToplami(kenarSayisi);

         System.out.println (" ic acı tooplamı : "+ sonuc);







     }
}
