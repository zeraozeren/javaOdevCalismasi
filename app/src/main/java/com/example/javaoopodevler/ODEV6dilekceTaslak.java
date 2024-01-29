package com.example.javaoopodevler;

import java.util.Scanner;

public class ODEV6dilekceTaslak {

     public static void main (String args []){

         Scanner tarayici = new Scanner( System.in);

          System.out.println("öğrenci Adini giriniz");
         String ogrenciAdi = tarayici.next();


         System.out.println("okul no giriniz");
         int OkulNo = tarayici.next();

         System.out.println("izin miktari giriniz");
         int izinmiktari = tarayici.next();

         System.out.println("tarih giriniz");
         String tarih = tarayici.next();
          
         System.out.println(" velinin adi   giriniz");
         String  VeliAdi = tarayici.next();

         System.out.println("velinin soy adini giriniz")
         String SoyAdi = tarayici.next();

         OdevlerSinifi o =  new  OdevlerSinifi ();
         o.dilekceOlustır(ogrenciAdi,okulNo,izinMiktari,tarih,veliAdi); 



     }
}
