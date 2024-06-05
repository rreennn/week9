package week9;

public class BangunDatar {
    private int sisi;
    private int panjang;
    private int lebar;
    private double diameter;
    public static double pi = 3.14;

    public BangunDatar(int sisi) {
        this.sisi = sisi;
    }

    public BangunDatar(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public BangunDatar(double diameter) {
        this.diameter = diameter;
    }

    public static double getPi() {
        return pi;
    }

    public int getSisi() {
        return sisi;
    }

    public int getPanjang() {
        return panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public double getDiameter() {
        return diameter;
    }

    public int luas(int s) {
        return s*s;
    }

    public int luas(int p, int l) {
        return p*l;
    }

    public double luas(double d) {
        double r = d / 2;
        return pi * r * r;
    }

    public int keliling(int s) {
        return s*4;
    }

    public int keliling(int p, int l) {
        return (p + l) * 2;
    }

    public double keliling(double d) {
        return pi * d;
    }
}