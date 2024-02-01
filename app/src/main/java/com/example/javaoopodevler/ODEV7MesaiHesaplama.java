package com.example.javaoopodevler;

import java.util.Scanner;

public class ODEV7MesaiHesaplama {

    public static void main(String[] args) {

        Scanner tarayici = new Scanner(System.in);

        System.out.println("çalısma gün sayinizi giriniz");

int gun  = tarayici.nextInt();

 OdevlerSinifi o = new OdevlerSinifi();

          int sonuc  = new OdevlerSinifi().maasHesaplama(gun);

        System.out.println( "maaş : "+sonuc);


    }








}
