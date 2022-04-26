package basic;

import java.util.Scanner;

public class LearnScanner {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("I am trying to learn if else using Scanner");
        System.out.println("Please enter true oor false");
        String must = input.nextLine();

        if (must.equalsIgnoreCase( "true")){

            System.out.println("I am understanding slowly");
        } else if (must.equalsIgnoreCase("false")) {

            System.out.println("I need to practice more and more");

        }
        else {
            System.out.println("Go back home");
        }


    }


}
