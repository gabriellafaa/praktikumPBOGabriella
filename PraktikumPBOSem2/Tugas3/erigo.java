package com.company;
import java.util.Scanner;

public class erigo {
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);

        Baju2 object = new Baju2();
        object.keterangan();

        System.out.print("Baju yang akan anda beli bertipe : ");
        object.jenis = masuk.nextLine();

        System.out.print("Jumlah baju yang akan anda beli adalah : ");
        object.jumlah = masuk.nextInt();

        object.tampilan();

    }
}

class Baju2 {
    String jenis;
    int harga;
    int jumlah;

    final int bajuA = 100000;
    final int bajuB = 125000;
    final int bajuC = 175000;

    void keterangan() {
        System.out.println("Baju yang tersedia : ");
        System.out.println("Baju A dengan harga " + bajuA);
        System.out.println("Baju B dengan harga " + bajuB);
        System.out.println("Baju C dengan harga " + bajuC);
    }

    void hargabajuA() {
        if (jumlah > 100) {
            this.harga = 95000;
        } else {
            this.harga = bajuA;
        }
    }

    void hargabajuB() {
        if (jumlah > 100) {
            this.harga = 120000;
        } else {
            this.harga = bajuB;
        }
    }

    void hargabajuC() {
        if (jumlah > 100) {
            this.harga = 160000;
        } else {
            this.harga = bajuC;
        }
    }

    void tampilan() {
        if (jenis.equalsIgnoreCase("a"))
            hargabajuA();
        else if (jenis.equalsIgnoreCase("b"))
            hargabajuB();
        else if (jenis.equalsIgnoreCase("c"))
            hargabajuC();

        System.out.println("Jenis yang anda beli : " + jenis);
        System.out.println("Harga per buah       : " + harga);
        System.out.println("Total harga          : " + harga * jumlah);
    }
}

