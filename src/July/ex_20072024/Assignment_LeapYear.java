package july.ex_20072024;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Assignment_LeapYear {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

       if(isLeapYear(getYear(bufferedReader))){
           System.out.println("Its a leap year");
       }else{
           System.out.println("Its not a leap year");
       }
    }
    private static int getYear(BufferedReader bufferedReader){
        int year = 0;
        boolean validInput = false;

        while(!validInput) {
            try {
                System.out.print("Enter the year in YYYY format: ");
                year = Integer.parseInt(bufferedReader.readLine());
                validInput = true;
            } catch (Exception E) {
                System.out.println("This is not a valid input, please try again.");
            }
        }
        return year;
    }

    private static boolean isLeapYear(int year){
        return  ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
    }
}

