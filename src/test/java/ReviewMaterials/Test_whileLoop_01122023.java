package ReviewMaterials;

public class Test_whileLoop_01122023 {
    public static void main(String[] args) {
        //declare and define linear array for street number
        int[] streetNumber = new int[]{111, 333, 444, 555, 666, 777};
        //iterate through all street number by while loop
        //set the initializer
        int i = 0;
        //now set the condition for while loop
        //linear array gets the count by using .length command
        while (i < streetNumber.length)
        // 0 < 6
            // 1 < 6
            //2 < 6
            //5 < 6
            // 6 < 6
        {
            //count i
            System.out.println("i is now: " + i);
            System.out.println("Street Number: " + streetNumber[i]);
            //incrementation goes at the end of the while loop
            //print the length of the array
            System.out.println("Length of street number array is : " + streetNumber.length);
//            i++;
            i = i+1;
        }//end of while loop
    }//end of main
}//end of class
