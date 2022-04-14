package com.company;
import java.util.ArrayList;

public class CarData {
    public static ArrayList<Car> carList= new ArrayList<>();

    public void addCar(String carType, String polNum, String merk){
        carList.add(new Car(carType,polNum,merk));
    }
    public void listOfCar(){
        System.out.println("-------------------------------");
        System.out.println("    DAFTAR MOBIL");
        System.out.println("-------------------------------");
        for (Car masuk : CarData.carList) {
            System.out.println("TIPE MOBIL  : " + masuk.getCarType());
            System.out.println("NO.POLIS    : " + masuk.getPolNum());
            System.out.println("MERK MOBIL  : " + masuk.getMerk());
            System.out.println("-------------------------------");
        }
    }
}
