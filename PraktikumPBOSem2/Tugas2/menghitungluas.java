package com.company;
import java.util.Scanner;

public class menghitungluas {

    int persegiLuas;
    int segitigaLuas;
    double lingkaranLuas;
    static int pilihan;

    public menghitungluas (int sisi){
        this.persegiLuas = sisi*sisi;
    }
    public menghitungluas (double alas, double tinggi){
        this.segitigaLuas = (int) (alas * tinggi)/2;
    }
    public menghitungluas (double jarijari){
        if (jarijari % 7 == 0){
            double phi = 22/7;
            double lingkaran = phi * jarijari * jarijari;
            this.lingkaranLuas= (int) lingkaran;
        }else{
            double phi = 3.14;
            double lingkaran = phi * jarijari * jarijari;
            this.lingkaranLuas= (int) lingkaran;
        }
    }
    void print(){
        if(pilihan == 1){
            System.out.println(persegiLuas);
        }else if(pilihan == 2){
            System.out.println(segitigaLuas);
        }else if(pilihan == 3){
            System.out.println(lingkaranLuas);
        }else{
            System.out.println("Input yang anda masukan tidak sesuai");
        }
    }

    public static void main(String[] args){
        Scanner masuk = new Scanner(System.in);
        pilihan = masuk.nextInt();
        switch(pilihan){
            case 1:
                int sisi= masuk.nextInt();
                menghitungluas persegi = new menghitungluas(sisi);
                persegi.print();
                break;
            case 2:
                double alas = masuk.nextInt();
                double tinggi = masuk.nextInt();
                menghitungluas segitiga = new menghitungluas(alas,tinggi);
                segitiga.print();
                break;
            case 3:
                double jarijari = masuk.nextInt();
                menghitungluas lingkaran = new menghitungluas(jarijari);
                lingkaran.print();
                break;
            default:
                System.out.println("Input yang anda masukan tidak sesuai");
                break;
        }
    }
}