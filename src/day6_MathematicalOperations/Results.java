package day6_MathematicalOperations;

public class Results {
    public static void main(String[] args) {


        float computer = 48;
        float science = 45;
        float nepali = 26;
        float math = 41;
        float english = 44;

        float percentage = ((computer+science+nepali+math+english)/250)*100;
        System.out.println(percentage);

        boolean isDistinction = percentage >= 80;
        System.out.println("Distinction:" + isDistinction);

        boolean isFirstDivision = percentage >=79 && percentage <=60;
        System.out.println("First Division:" + isFirstDivision);

        boolean isSecondDivision = percentage <=50 && percentage >=60;
        System.out.println("Second Division:" + isSecondDivision);

        //Ternary Operator
        String division = isDistinction ? "Distinction" : "No it's not";
        System.out.println(division);


    }



}
