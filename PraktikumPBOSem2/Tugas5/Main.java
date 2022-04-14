package com.company;

public class Main {

    public static void main(String[] args) {
        CarRider ming = new CarRider("Lin Ming", 19, "080000000000");
        CarRider yohan = new CarRider("Bei Yohan", 20, "081111111111");
        CarRider ling = new CarRider("Ling'er", 31, "082222222222");

        CarData masuk = new CarData();
        masuk.addCar("SUV", "N 1111 AB", "Honda");
        masuk.addCar("SPORT", "N 2222 AB", "SSC Tuatara");
        masuk.addCar("TRUCK", "N 3333 AB", "Suzuki");

        masuk.listOfCar();

        RentArchive data = new RentArchive();
        data.Rent(ming, masuk.carList.get(1), 9);
        data.Rent(yohan, masuk.carList.get(0), 3);
        data.Rent(ling, masuk.carList.get(1), 1);

        System.out.println("");
        data.info();
    }
}
