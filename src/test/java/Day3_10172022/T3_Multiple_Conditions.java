package Day3_10172022;

public class T3_Multiple_Conditions {
//    public static void main(String[] args) {
//        //lets say we want the student with the higher grade
//        //declare two int student variables
//        int student1Grade = 99;
//        int student2Grade = 99;
//        // == used for comparison operator to check if value1 is equal to value2
//        // = is used to assign a value
//        if (student1Grade > student2Grade) {
//            System.out.println("Student 1 has the higher grade");
//        } else if (student2Grade > student1Grade) {
//            System.out.println("Student 2 has the higher grade");
//        } else if (student1Grade == student2Grade) {
//            System.out.println("Both students have the same grade");
//        }//end of last else if clause / condition
//    }//end of main

    public static void main(String[] args) {
        int studentGrade1 = 90;
        int studentGrade2 = 99;
        int passingGrade = 91;
        //give me the highest number here

        if (studentGrade1 > passingGrade || studentGrade2 > passingGrade) {
            System.out.println("Student passed");
        } else
            System.out.println("Student failed");

    }


}//end of class
