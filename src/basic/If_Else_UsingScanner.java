package basic;

import java.util.Scanner;

public class If_Else_UsingScanner {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Voter eligibility");
        System.out.println("enter your age");
        int age = input.nextInt();
        System.out.println("Enter your gender");
        String gender = input.next();

//        if (gender.equalsIgnoreCase("Female") && (age >=18)){
//
//            System.out.println("You are eligible for vote");
//        } else if (gender.equalsIgnoreCase("Male") && (age>=18)) {
//
//            System.out.println("you are eligible for vote");
//
//
//        }else {
//            System.out.println("You are not eligible for vote");
//        }
//------------------------------------------------------------------

//        if (gender.equalsIgnoreCase("Female") && (age >18)){
//
//            System.out.println("You are eligible for vote");
//        } else if (gender.equalsIgnoreCase("Male") && (age>18)) {
//
//            System.out.println("you are eligible for vote");
//
//
//        }else {
//            System.out.println("You are not eligible for vote");
//        }
//        =====================================================

        if (gender.equalsIgnoreCase("Female") || (age ==18)){

            System.out.println("You are eligible for vote");
        } else if (gender.equalsIgnoreCase("Male") ||(age==18)) {

            System.out.println("you are eligible for vote");


        }else {
            System.out.println("You are not eligible for vote");
        }

    }


}
