package homeWorkSix;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    private static final int INITIAL_CAPACITY_ARRAY = 5;
    private static final String[] cars = {"McLaren", "RollsRoyce", "Bugatti", "Koenigsegg", "Hennessey"};

    public static void main(String[] args) {
        Car[] array = new Car[INITIAL_CAPACITY_ARRAY];
        Random random = new Random();
        for(int i = 0; i < 5; i++){
            double randomNumber = ThreadLocalRandom.current().nextDouble(100000.0, 3000000.0);
            array[i] = new Car(Math.round(randomNumber * 100.0) / 100.0, cars[i]);
        }
        System.out.println("Unsorted: ");
        for(Car car : array){
            System.out.println("Car - " + car.getModel() + ", price = " + car.getPrice() + " €");
        }
        System.out.println("Sorted by Price: ");
        bubbleSortPrice(array);
        for(Car car : array){
            System.out.println("Car - " + car.getModel() + ", price = " + car.getPrice() + " €");
        }
        System.out.println("Sorted by Model: ");
        bubbleSortModel(array);
        for(Car car : array){
            System.out.println("Car - " + car.getModel() + ", price = " + car.getPrice() + " €");
        }
    }
    public static void bubbleSortPrice(Car[] array){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length -1 -i; j++){
                if(array[j].getPrice() > array[j+1].getPrice()){
                    Car temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
    public static void bubbleSortModel(Car[] array){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length -1 -i; j++){
                if(array[j].getModel().charAt(0) > array[j+1].getModel().charAt(0)){
                    Car temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
