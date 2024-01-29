package com.example.javaoopodevler;

import java.util.Scanner;

public class ODEV1SicaklıkDonsum {
    public static void main(String[] args) {
        Scanner tararyici = new Scanner(System.in);

        System.out.println("sıcaklık degerini giriniz");

     double sicaklik = tararyici.nextDouble();

     //metod

 OdevlerSinifi o = new OdevlerSinifi();
  o.sicaklikdonustur(sicaklik);



    }

}
