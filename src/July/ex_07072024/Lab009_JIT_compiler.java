package July.ex_07072024;

public class Lab009_JIT_compiler {
    private static long sumOfSquare(int num) {
        long sum = 0;
        for (int i = 1; i < num; i++) {
            sum += (long) i *i;
        }
        return sum;
    }

    public static void main(String[] args) {

        // Warm-up phase to let JIT compile the method
        for (int i = 1 ; i<=1000; i++){
          sumOfSquare(i);
        }

        // Measure the time taken by the JIT-compiled method
        double starTime = System.nanoTime();
        long result = sumOfSquare(15);
        double endTime = System.nanoTime();

        System.out.printf("result is %d",result).println();
        System.out.println(endTime-starTime);
    }


}