package com.example.javaoopodevler;

import java.util.Scanner;

public class ODEV6dilekceTaslak {

     public static void main (String args []){

         Scanner tarayici = new Scanner( System.in);

         System.out.println("öğrenci Adini giriniz");
         String ogrenciAdi= tarayici.next();

         System.out.println("öğrenci okulunu giriniz");
         int okulNo= tarayici.nextInt();

         System.out.println("izin miktari giriniz");
         int izinMiktari = tarayici.nextInt();

         System.out.println("Tarih giriniz");
         String tarih = tarayici.next();

         System.out.println("velinin adini giriniz");
         String veliadi=tarayici.next();

         System.out.println("velinin soy adini giriniz");
         String soyAdi = tarayici.next();

 OdevlerSinifi o = new OdevlerSinifi();

o.dilekceOlustur(ogrenciAdi,okulNo,izinMiktari,tarih,veliadi);



     }
}
