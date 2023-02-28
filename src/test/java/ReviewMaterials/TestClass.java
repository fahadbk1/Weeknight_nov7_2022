package ReviewMaterials;

import java.util.ArrayList;

public class TestClass {

    public static void main(String[] args) {

//        int num123 = 5;
//
//        String number = "2";
//
//        int myNumber = 2 + 2;
//
//        String character = "a";
//
//        System.out.println("my variables are " + num123 + " " + number + " " + myNumber + " " + character);

        //declare and define an arraylist of countries
        ArrayList<String> countries = new ArrayList<>();
        //add values for countries
        countries.add("USA");//index 0
        countries.add("BANGLADESH");//index 1
        countries.add("INDIA");//index 2
        countries.add("PAKISTAN");//index 3
        countries.add("CANADA");//index 4
        //call for loop to print out all the countries from the array list
        for (int i = 0; i < countries.size(); i++) {
            if (!countries.get(i).equals("USA")){
                //print out the i value to see the iteration
                System.out.println("Iteration number is " + i);
                //print out each country from the arraylist
                System.out.println("Countries are: " + countries.get(i));
            }
        }//end of for loop
    }//end of main
}//end of class
