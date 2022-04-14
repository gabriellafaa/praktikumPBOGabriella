package com.company;
import java.util.Scanner;

public class SuratKaisar{

    public static void main(String[] args) {
        Scanner masuk = new Scanner (System.in);
        String opposite = masuk.nextLine();
        int shift = masuk.nextInt();
        String asal = "";
        char huruf;
        for(int i=0; i < opposite.length();i++)
        {
            huruf = opposite.charAt(i);
            if(huruf >= 'a' && huruf <= 'z') {
                huruf = (char) (huruf + shift);
                if(huruf > 'z') {
                    huruf = (char) (huruf+'a'-'z'-1);
                }
                asal = asal + huruf;
            } else if(huruf >= 'A' && huruf <= 'Z') {
                huruf = (char) (huruf + shift);
                if(huruf > 'Z') {
                    huruf = (char) (huruf+'A'-'Z'-1);
                }
                asal = asal + huruf;
            }else {
                asal = asal + huruf;
            }
        }
        System.out.println(asal);
    }
}

