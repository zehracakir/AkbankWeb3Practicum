package com.zehra.Yonetim;
public class Yonetim {

    private double toplamBakiye;

    public Yonetim() {
        this.toplamBakiye = 0;
    }

    public double getToplamBakiye() {
        return toplamBakiye;
    }

    public void setToplamBakiye(double toplamBakiye) {
        this.toplamBakiye = toplamBakiye;
    }

    public void bakiyeArtir(int miktar) {
        toplamBakiye += miktar;
    }

}
