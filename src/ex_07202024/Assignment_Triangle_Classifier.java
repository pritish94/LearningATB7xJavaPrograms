package ex_07202024;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment_Triangle_Classifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //input for 3 sides
        double side1 = getSideLength("Enter side1: ",scanner);
        double side2 = getSideLength("Enter side2: ",scanner);
        double side3 = getSideLength("Enter side3: ",scanner);


        //Triangle classifier
        if(side1==side2 && side1==side3){
            System.out.println("This triangle is equilateral");
        } else if (side1==side2 || side2==side3 || side1==side3) {
            System.out.println("This triangle is isosceles");
        }else {
            System.out.println("This triangle is scalene");
        }
       scanner.close();
    }

    private static double getSideLength(String prompt,Scanner scanner){
        double sideLength = 0;
        boolean validInput = false;

        while (!validInput){
            try{
                System.out.println(prompt);
                sideLength = scanner.nextDouble();
                validInput = true;
            }catch (InputMismatchException e){
                System.out.println("The entered input is not valid, please enter again");
                scanner.next();
            }
        }
        return sideLength;
    }
}
