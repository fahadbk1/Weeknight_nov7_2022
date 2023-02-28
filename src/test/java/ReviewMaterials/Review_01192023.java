package ReviewMaterials;

public class Review_01192023 {
    public static void main(String[] args) {
        //declare a string variable
        String actionItem = "AI_05";
        //Requirement: As a professor, I would like to see the action item number only.
        //tips: use split to achieve this task
        //declare an array to store the split message
        String[] actionItemArr = actionItem.split("_");
        //print out only the action item number
        System.out.println("The action item number is " + actionItemArr[1]);
        //print out AI text
        System.out.println("The action item text is " + actionItemArr[0]);
    }//end of main
}//end of class
