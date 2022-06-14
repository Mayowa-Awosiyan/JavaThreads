import java.util.Scanner;

public class FibonacciSequence extends Thread{

    private int limit;
    private int[] values;

    public FibonacciSequence(int limit, int[] values){
        this.limit = limit;
        this.values = values;
    }

    @Override
    public void run(){
        values[0] = 0;
        values[1] =1;
        for(int i = 2; i<values.length;i++){
            values[i]= values[i-2] + values[i-1];
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers in the fibonacci sequence would you like displayed? ");
        int max = scanner.nextInt();
        int[] values = new int[max];

        FibonacciSequence sequence = new FibonacciSequence(max,values);
        sequence.start();
        sequence.join();
        for (int target:
             values) {
            System.out.println(target);
        }
    }

}
