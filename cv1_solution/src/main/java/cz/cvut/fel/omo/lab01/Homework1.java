package cz.cvut.fel.omo.lab01;

public class Homework1 {

    public static void main(String[] args) {
        System.out.println("Vytvarim auta");
        CarFactory carFactory = new CarFactory();
        carFactory.createTruck(CarColor.BLACK);
        carFactory.createTruck(CarColor.BLUE);
        carFactory.createPassengerCar(CarColor.RED);
        carFactory.createPassengerCar(CarColor.GREEN);
        carFactory.createTruck(CarColor.WHITE);
        System.out.println("Vytvoreno " + carFactory.getCarsMade() + " aut");
    }
}
