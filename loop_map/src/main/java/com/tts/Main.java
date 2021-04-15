package com.tts;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Array 5 numbers
        ArrayList<Integer> newArray = new ArrayList<>();
        for(int i =0; i<5; i++){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter a number and hit enter(Total of 5 numbers): ");
            int j = scanner.nextInt();
            newArray.add(j);
        }
        int sum = 0;
        int prod = 1;

        for(int newAr: newArray){
            sum += newAr;
            prod *= newAr;
        }

        int small= newArray.get(0);
        int big= newArray.get(0);
        int n= newArray.size();

        for(int j =1; j<n; j++){
            if (newArray.get(j) < small){
                small= newArray.get(j);
            }
        }
        for(int j =1; j<n; j++){
            if (newArray.get(j) > big){
                big= newArray.get(j);
            }

        }

        System.out.println(newArray);
        System.out.println(sum);
        System.out.println(prod);
        System.out.println(small);
        System.out.println(big);

        //Hash map of vehicles

        HashMap<String, String> vehicles = new HashMap<>();

        Scanner input = new Scanner(System.in);
        System.out.println("What car model are you looking for: ");
        String car = input.nextLine();

        vehicles.put("Civic", "Honda");
        vehicles.put("Accord", "Honda");
        vehicles.put("Sonata", "Hyundai");
        vehicles.put("Santa Fe", "Hyundai");

        if (vehicles.containsKey(car)){
            System.out.println("|\nOh, your looking for a " + car + "? our " + vehicles.get(car) + " selection is right over here...");
        }else {
            System.out.println("We don't have that car!");
        }












    }

}
