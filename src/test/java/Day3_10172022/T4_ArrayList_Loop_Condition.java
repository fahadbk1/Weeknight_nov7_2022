package Day3_10172022;

import java.util.ArrayList;

public class T4_ArrayList_Loop_Condition {
    public static void main(String[] args) {
        //define an array list of fruits
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apples");
        fruits.add("Oranges");
        fruits.add("Grapes");
        fruits.add("Bananas");
        //define for loop
        for (int i = 0; i < fruits.size(); i++) {
/*
            if (fruits.get(i) == "Apples") {
                System.out.println("My index is " + i);
                System.out.println("My Fruit is Apple");
            } else if (fruits.get(i) == "Bananas") {
                System.out.println("My index is " + i);
                System.out.println("My Fruit is Banana");
            }//end of last else if condition
 */
            //alternative solution to print apples or bananas
            //to combine multiple conditions we can use || (or) operator where only one of the condition need to be true
            //we can also use && (and) operator when both conditions need to be true
            if (fruits.get(i) == "Apples" || fruits.get(i) == "Bananas") {
                System.out.println("My Fruit at index: " + i + " is " + fruits.get(i));
            }//end of if statement
        }//end of for loop
    }//end of main
}//end of class

