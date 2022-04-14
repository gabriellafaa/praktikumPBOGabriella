package com.company;
import java.util.Scanner;

public class MenghitungLuas {
    private static final Scanner masuk = new Scanner (System.in);

    public static void main(String[] args) {

        halamanUtama();
    }
    private static void halamanUtama(){

        double pilihan = masuk.nextDouble();

        if (pilihan == 1) {
            luasPersegi();
        } else if (pilihan == 2) {
            luasSegitiga();
        } else if (pilihan == 3) {
            luasLingkaran();
        } else if (pilihan == 4) {
            System.out.println("Input yang anda masukan tidak sesuai");}


    }
    private static void luasPersegi(){

        int luasPersegi;
        int sisi = masuk.nextInt();
        luasPersegi = sisi*sisi;
        System.out.println(luasPersegi);

    }
    private static void luasSegitiga(){

        int luasSegitiga;
        int alas = masuk.nextInt();
        int tinggi = masuk.nextInt();
        luasSegitiga = alas*tinggi/2;
        System.out.println(luasSegitiga);
    }
    private static void luasLingkaran(){

        double luasLingkaran = 0;
        double jari =masuk.nextDouble();

        if (jari%7 == 0 ){
            luasLingkaran = (int)(22/7*jari*jari);
        }else if(jari%7 != 0){
            luasLingkaran = (int)(3.14*jari*jari);
        }
        System.out.println(luasLingkaran);
    }
}

