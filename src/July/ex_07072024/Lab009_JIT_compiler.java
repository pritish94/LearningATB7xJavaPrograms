package July.ex_07072024;

public class Lab009_JIT_compiler {

    public static void main(String[] args) {

        double starTime = System.nanoTime();
        int result = 0;

        for (int i = 1 ; i<=100; i++){
            result = calculateIValue(i);
        }
        System.out.println(result);
        double endTime = System.nanoTime();
        System.out.println(endTime-starTime);
    }

    private static int calculateIValue(int num) {
       return (num + 5) * 12;
    }
}
