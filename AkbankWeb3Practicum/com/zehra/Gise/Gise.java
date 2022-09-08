package com.zehra.Gise;
import java.util.ArrayList;
import com.zehra.Araclar.Arac;

public class Gise {
    private ArrayList<Arac> liste;

    public Gise() {
        this.liste = new ArrayList<>();
    }

    public void odeme(Kayit aracSinifi, Yonetim yonetim) {
        if (aracSinifi.getAracSinifi().getSegmentSinifi() == 1) {
            if (aracSinifi.getBakiye() < 40) {
                System.out.println("Hgs için bakiye yetersiz.");
            } else {
                aracSinifi.setBakiye(aracSinifi.getBakiye() - 40);
                System.out.println("Güncel bakiyeniz: " + aracSinifi.getBakiye());
                liste.add(aracSinifi.getAracSinifi());
                yonetim.bakiyeArtir(40);
            }

        } else if (aracSinifi.getAracSinifi().getSegmentSinifi() == 2) {
            if (aracSinifi.getBakiye() < 50) {
                System.out.println("Hgs için bakiye yetersiz.");
            } else {
                aracSinifi.setBakiye(aracSinifi.getBakiye() - 50);
                System.out.println("Güncel bakiyeniz: " + aracSinifi.getBakiye());
                liste.add(aracSinifi.getAracSinifi());
                yonetim.bakiyeArtir(50);
            }

        } else if (aracSinifi.getAracSinifi().getSegmentSinifi() == 3) {
            if (aracSinifi.getBakiye() < 60) {
                System.out.println("Hgs için bakiye yetersiz.");
            } else {
                aracSinifi.setBakiye(aracSinifi.getBakiye() - 60);
                System.out.println("Güncel bakiyeniz: " + aracSinifi.getBakiye());
                liste.add(aracSinifi.getAracSinifi());
                yonetim.bakiyeArtir(60);
            }
        } else {
            System.out.println("İşlem yapılamadı.");
        }

    }

    public void aracBastir() {
        if (getListe().size() == 0) {
            System.out.println("Gişede araba yok");
        } else {
            for (Arac i : getListe()) {
                System.out.println(i.getSegmentSinifi());
            }
        }
    }

    public void aracEkle(Arac arac) {
        liste.add(arac);
    }

    public ArrayList<Arac> getListe() {
        return liste;
    }

    public void setListe(ArrayList<Arac> liste) {
        this.liste = liste;
    }
}
