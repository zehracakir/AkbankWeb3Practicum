package com.zehra.Kayit;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.zehra.Araclar.Arac;

public class Kayit {
    private int hgsNo;
    private String ad;
    private String soyad;
    private Arac aracSinifi;
    private String gecisTarihi;
    private String gecisSaati;
    private double bakiye;

    public Kayit() {
    }

    public Kayit(int hgsNo, String ad, String soyad, Arac aracSinifi, double bakiye) {
        this.hgsNo = hgsNo;
        this.ad = ad;
        this.soyad = soyad;
        this.aracSinifi = aracSinifi;
        this.bakiye = bakiye;
        

    }
    public void gecisTarihi(){
        DateFormat tarih = new SimpleDateFormat("yyyy/MM/dd");
        Date gecisTarihi = new Date();
        this.gecisTarihi = tarih.format(gecisTarihi);
        DateFormat saat = new SimpleDateFormat("HH:mm:ss");
        Date gecisSaati = new Date();
        this.gecisSaati = saat.format(gecisSaati);
        
    }
    public int getHgsNo() {
        return hgsNo;
    }

    public void setHgsNo(int hgsNo) {
        this.hgsNo = hgsNo;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public Arac getAracSinifi() {
        return aracSinifi;
    }

    public void setAracSinifi(Arac aracSinifi) {
        this.aracSinifi = aracSinifi;
    }

    public String getGecisTarihi() {
        return gecisTarihi;
    }

    public void setGecisTarihi(String gecisTarihi) {
        this.gecisTarihi = gecisTarihi;
    }

    public String getGecisSaati() {
        return gecisSaati;
    }

    public void setGecisSaati(String gecisSaati) {
        this.gecisSaati = gecisSaati;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

}
