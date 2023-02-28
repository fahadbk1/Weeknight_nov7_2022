package Day2_01092023;
import java.util.ArrayList;

public class T2_ArrayList {
    public static void main(String[] args) {
        //declare an array list of countries
        ArrayList<String> countries = new ArrayList<>();
        //add values for countries
        countries.add("USA"); // index 0
        countries.add("PAKISTAN");// index 1
        countries.add("INDIA");// index 2
        countries.add("BANGLADESH");// index 3
        //Print out USA and INDIA from the countries arrayList
        System.out.println("Countries first value is " + countries.get(0) + " Countries third value is " + countries.get(2));
        //get the total size of the countries array
        System.out.println("The size of the countries array list is " + countries.size());
        //add one more country
        countries.add("CHINA");
        System.out.println("The size of the countries array list after adding china is " + countries.size());
        //declare an integer array of student grades
        ArrayList<Integer> studentGrades = new ArrayList<>();
        //add some grade to the studentGrades arrayList
        studentGrades.add(96); //index 0
        studentGrades.add(86);//index 1
        studentGrades.add(76); //index 2
        System.out.println("Student 1 grade is " + studentGrades.get(0));
    }//end of main
}//end of class
