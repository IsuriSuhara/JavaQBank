package main.java.com.koboMagic.javaQBank.pizzaltd;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PizzaBooking {


//    Create a program that will calculate how much the cost would be for each size of pizza, and
//    therefore which is the lowest cost for the customer.
//    Show the cost for each, plus highlight the lowest cost

    // totalPieces = people * pieces

    public static void getBestPizzaCombination(int people, int pieces) {
        int totalPieces = people * pieces;
        //cost would be for each size of pizza
        //even if the totalPieces < 1 pizza customer would be given one pizza
        //round

        HashMap<Integer, Integer> priceMap5 = new HashMap<Integer, Integer>();
        priceMap5.put(3, 4);
        HashMap<Integer, Integer> priceMap7 = new HashMap<Integer, Integer>();
        priceMap7.put(5, 6);
        HashMap<Integer, Integer> priceMap10 = new HashMap<Integer, Integer>();
        priceMap10.put(8, 10);
        HashMap<Integer, Integer> priceMap15 = new HashMap<Integer, Integer>();
        priceMap15.put(12, 15);
        HashMap<Integer, Integer> priceMap24 = new HashMap<Integer, Integer>();
        priceMap24.put(18, 24);

        HashMap<Integer, HashMap<Integer, Integer>> pizzaMap = new HashMap<>();
        pizzaMap.put(5, priceMap5);
        pizzaMap.put(7, priceMap7);
        pizzaMap.put(10, priceMap10);
        pizzaMap.put(15, priceMap15);
        pizzaMap.put(24, priceMap24);

        HashMap<Integer, Integer> pizzaResultMap = new HashMap<>();
        List list = new ArrayList();

        int[] arr = new int[5];
        //pizza, cost
        //5, (totalPieces /pieces)*price of that pizza


        //COST: SHOULD GET THE ROUND VALUE TO UPPER BOUN

        pizzaResultMap.put(5, (totalPieces / pizzaMap.get(5).get(3)) * 3);
        arr[0] = ((totalPieces / pizzaMap.get(5).get(3)) * 3);
        pizzaResultMap.put(7, (totalPieces / pizzaMap.get(7).get(5)) * 5);
        arr[1] = ((totalPieces / pizzaMap.get(7).get(5)) * 5);
        pizzaResultMap.put(10, (totalPieces / pizzaMap.get(10).get(8)) * 8);
        arr[2] = ((totalPieces / pizzaMap.get(10).get(8)) * 8);
        pizzaResultMap.put(15, (totalPieces / pizzaMap.get(15).get(12)) * 12);
        arr[3] = ((totalPieces / pizzaMap.get(15).get(12)) * 12);
        pizzaResultMap.put(24, (totalPieces / pizzaMap.get(24).get(18)) * 18);
        arr[4] = ((totalPieces / pizzaMap.get(24).get(18)) * 18);

        int min = Integer.MAX_VALUE;
        for (int i : arr) {
            if (i < min) {
                min = i;
            }
        }


        System.out.println("5 inch cost: " + pizzaResultMap.get(5));
        System.out.println("7 inch cost: " + pizzaResultMap.get(7));
        System.out.println("10 inch cost: " + pizzaResultMap.get(10));
        System.out.println("15 inch cost: " + pizzaResultMap.get(15));
        System.out.println("24 inch cost: " + pizzaResultMap.get(24));

        System.out.println("Lowest cost is: " + min);


    }

    public static void main(String[] args) {
        //scanner input for people and pieces
//        Scanner in = new Scanner();
        //INPUT 4 50
        getBestPizzaCombination(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
    }
}
