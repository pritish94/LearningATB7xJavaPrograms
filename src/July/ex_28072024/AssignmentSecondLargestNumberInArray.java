package july.ex_28072024;

public class AssignmentSecondLargestNumberInArray {
    public static void main(String[] args) {
        int[] salaries = {7, 10, 4, 13, 25, 18, 9, 8, 17};

//        Arrays.sort(salaries);
//        System.out.printf("Second largest number in array is: %d",salaries[salaries.length-2]);

        int largestNumber = Integer.MIN_VALUE;
        int secondLargestNumber = Integer.MIN_VALUE;

        for(int num: salaries){
            if(num > largestNumber){
                secondLargestNumber = largestNumber;
                largestNumber = num;
            } else if (num > secondLargestNumber && num != largestNumber) {
                secondLargestNumber = num;
            }
        }

        System.out.printf("Second largest number in array is: %d",secondLargestNumber);


    }
}
