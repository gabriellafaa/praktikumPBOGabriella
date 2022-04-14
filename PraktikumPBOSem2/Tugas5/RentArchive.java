package com.company;
import java.util.ArrayList;

public class RentArchive {
    public static ArrayList<CarRent> rentData= new ArrayList<>();

    public void Rent(CarRider rider, Car car, int rentDur){
        rentData.add(new CarRent(rider, car, rentDur));
    }
    public void info(){
        System.out.println("-------------------------------");
        System.out.println("    INFORMASI PELANGGAN");
        System.out.println("-------------------------------");
        for (CarRent masuk : RentArchive.rentData) {
            System.out.println("NAMA PEMINJAM   : " + masuk.getRider().getName());
            System.out.println("TIPE MOBIL      : " + masuk.getCar().getCarType());
            System.out.println("NO. POLISI      : " + masuk.getCar().getPolNum());
            System.out.println("LAMA RENTAL     : " + masuk.getRentDur());
            System.out.println("-------------------------------");
        }
    }
}
