package com.example.javaoopodevler;

public class OdevlerSinifi {
    public void sicaklikdonustur(double sicaklik) {

        double f = (sicaklik * 1.8) + 32;
        System.out.println("Fahrenhiet: " + f);

    }
    //ODEV2 sayilari  int ile belirtmeyi unutma double olarak alırsan  girdi alamazsin sayi değrinde

    public int cevrehesaplama(int kisakenar, int uzunkenar) {

        int cevre = (2 * kisakenar) + (2 * uzunkenar);

        return cevre;

    }


    public int faktoriyel(int sayi) {

        int sonuc = 1;

        if (sayi == 0) {
            sonuc = 1;
        } else {
            for (int i = 1; i <= sayi; i++) {
                sonuc = sonuc * i;

            }
        }
        return sonuc;


    }

public  void  HarfSayisiBulma(String kelime,char harf) {

    int boyut = kelime.length(); //araba5

    char[] harfler = new char[boyut];

    for (int i = 0; i< boyut; i++) {

        harfler [i] = kelime.charAt(i);//1,2,3,

    }
    int sayac= 0;

     for ( int i = 0 ;i<boyut;i++){


         if (harfler[i]==harf){
             sayac++;
         }
     }
    System.out.println(" Harf Sayısı : " +sayac);
}


 public int icAciToplami(int KenarSayisi){
       int sonuc = (KenarSayisi - 2) * 180;

       return sonuc ;

    }



    public void  dilekceOlustur(String ogrenciAdi, int okulno,int izinmiktari,String tarih,String veliadi){

        String dilekce = "\t\tBursa Anadolu lisesi Müdürlüğüne,\n"+ogrenciAdi
        +" adlı "+okulno+"nolu öğrencini izin "+izinmiktari
        +" gün izinli olmasını rica ediyorum.\n"
        +" tarih : "+tarih+"\n"
        +"Veli Ad-Soyad: "+veliadi;

System.out.println(dilekce);

    }

}








