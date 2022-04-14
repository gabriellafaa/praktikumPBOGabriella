package com.company;
import java.util.Scanner;

public class SaldoNasabah {
    public static void main(String[] args) {

        Scanner masuk = new Scanner(System.in);
        double saldo = masuk.nextInt();
        double setoran = masuk.nextInt();
        System.out.println(mesin(saldo, setoran));
    }
    public static double mesin(double x, double y){
        double biayadmin = 7000;
        double totalsaldo = (x + y);
        totalsaldo -= biayadmin;
        double potong = totalsaldo * 0.0005;
        double hasil = totalsaldo + potong;
        return hasil;
    }
}


