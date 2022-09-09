package com.zehra.Test;
import java.util.Scanner;

import com.zehra.Araclar.Arac;
import com.zehra.Araclar.Minibus;
import com.zehra.Araclar.Otobus;
import com.zehra.Araclar.Otomobil;

public class Main {
    public static void main(String[] args) {
        String menu = "1-Kullanıcı kayıt\n" +
                "2-Kullanıcı işlemleri\n" +
                "3-Yönetim bakiyesi sorgulama\n" +
                "4-Gişeden geçen arabaları kontrol etme\n" +
                "5-Çıkış";
        Scanner klavye = new Scanner(System.in);
        Yonetim yonetim = new Yonetim();
        Kayit kayit = null;
        Gise gise = new Gise();
        int secim;
        while (true) {
            System.out.println(menu);
            secim = klavye.nextInt();

            if (secim == 1) {
                System.out.println("HGS no giriniz: ");
                int hgsNo = klavye.nextInt();
                klavye.nextLine();
                System.out.println("Adınızı giriniz: ");
                String ad = klavye.nextLine();
                System.out.println("Soyadınızı giriniz: ");
                String soyad = klavye.nextLine();
                System.out.println("Araç sınıfınızı seçiniz\n" +
                        "1-Otomobil\n" +
                        "2-Minibus\n" +
                        "3-Otobus");
                int aracSecimi = klavye.nextInt();
                Arac arac = null;
                if (aracSecimi == 1) {
                    arac = new Otomobil();
                } else if (aracSecimi == 2) {
                    arac = new Minibus();
                } else if (aracSecimi == 3) {
                    arac = new Otobus();
                } else {
                    System.out.println("Hatalı seçim");
                    continue;
                }
                System.out.println("Bakiyenizi giriniz");
                double bakiye = klavye.nextDouble();
                kayit = new Kayit(hgsNo, ad, soyad, arac, bakiye);

            } else if (secim == 2) {
                if (kayit == null) {
                    System.out.println("Önce kullanıcı kaydı oluşturulmalı!");
                    continue;
                } else {

                    while (true) {
                        String kullaniciMenu = "1-HGS no öğrenme\n" +
                                "2-Araç türü sorgulama\n" +
                                "3-Bakiye sorgulama\n" +
                                "4-Gişeden geçiş yapma\n" +
                                "5-Gişeden geçiş tarihi ogren\n" +
                                "6-Çıkış";
                        System.out.println(kullaniciMenu);
                        int kullaniciSecim = klavye.nextInt();
                        if (kullaniciSecim == 1) {
                            System.out.println(kayit.getHgsNo());
                        } else if (kullaniciSecim == 2) {
                            System.out.println(kayit.getAracSinifi().getSegmentSinifi());
                        } else if (kullaniciSecim == 3) {
                            System.out.println(kayit.getBakiye());
                        } else if (kullaniciSecim == 4) {
                            gise.odeme(kayit, yonetim);
                        }else if(kullaniciSecim == 5){
                            if(kayit.getGecisSaati()==null && kayit.getGecisTarihi()==null){
                                System.out.println("Giseden gecis yapmadiniz...");
                            }else{
                                System.out.println("Giseden gecis yaptiginiz tarih = "+kayit.getGecisTarihi()+"\nGiseden gecis yaptiginz saat = "+kayit.getGecisSaati());
                            }
                        }
                        else if (kullaniciSecim == 6) {
                            break;
                        } else {
                            System.out.println("Hatalı seçim");
                        }
                    }
                }

            } else if (secim == 3) {
                System.out.println(yonetim.getToplamBakiye());
            } else if (secim == 4) {
                gise.aracBastir();
            } else if (secim == 5) {
                break;
            }
        }

    }
}
