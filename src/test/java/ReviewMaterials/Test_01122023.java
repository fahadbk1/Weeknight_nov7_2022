package ReviewMaterials;

import java.util.ArrayList;

public class Test_01122023 {
    public static void main(String[] args) {
        //single = sign is used to assign a value to a variable
//        int a = 5;
//        int b = 8;
//        if ((a + a) > b) {
//            System.out.println("option 1"); // punit, Md M, Addia, Hussain, Ahsan, Ali, Shohel, Adeeba, Zokir , Ersild , betim , Zannatul, Ahmed
//        } else if (b < a) {
//            System.out.println("option 2");
//        }
//        // == is used to compare two values if they are equal to each other or not
//        else if (a == b) {
//            System.out.println("option 3");
//        } else if ((b - 1) >= (a + 2)) {
//            System.out.println("option 4"); //Jijen, Shohel, Zokir, Ersild, betim , betim, Ahmed
//        }


        ArrayList<String> countries = new ArrayList<>();
        countries.add("USA");
        countries.add("Mexico");
        countries.add("Canada");
        //&& means that both conditions need to be satisfied in order to proceed
        //both conditions need to be true in order for the full condition to be true
        if (countries.get(0).equals("USA") && countries.get(1).equals("Canada")) {
            System.out.println("Option 1");
        }
        //pipe delimeted (straight bars) are used as the OR operator in java
        //only one condition needs to be satisfied in order to proceed
        else if (countries.get(0).equals("USA") || countries.get(1).equals("Canada")) {
            System.out.println("Option 2");
        }



        int a = 9;
        int b = 7;

//can you find the lowest number using conditional statement

        if (a < b) {
            System.out.println("a is the lowest number. a is equal to: " + a);
        } else if (b < a) {
            System.out.println("b is the lowest number. b is equal to: " + b);
        } else {
            System.out.println("a is equal to b");
        }
    }//end of main
}//end of class
