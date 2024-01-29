package com.example.javaoopodevler;

import java.util.Scanner;

public class ODEV2CevreHesaplam {
     public  static  void  main( String args []){
          Scanner tarayici = new Scanner(System.in);

            int  uzunkenar = tarayici.nextInt();

          System.out.println("dikdortgenin kısa kenarını giriniz");
 int kisakenar = tarayici.nextInt();

   //veri almak için odevler sınıfından veri  aktarmayı unutma buraya
OdevlerSinifi o= new OdevlerSinifi();
int gelensonuc = o.cevrehesaplama(kisakenar,uzunkenar);
 // gelen sonuc için  kısa kenar uxun kenar atamasını k buarya atamayı unutma burda  atama YAPILACAK//

          System.out.println("sonuc : "+gelensonuc );


     }


}
