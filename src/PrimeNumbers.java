import java.util.Scanner;

public class PrimeNumbers extends Thread{

    private int limit;

    public PrimeNumbers(int limit){
        this.limit = limit;
    }

    private boolean isPrime(int num){
        boolean isPrime = true;
        for (int i=2; i<num; i++){
            if(num%i ==0){
                isPrime = false;
            }
        }
        return isPrime;
    }

    @Override
    public void run() {
        System.out.println("The list of prime numbers less than " + limit + " is:");
        for(int i =1; i<limit;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Up to what number would you like a list of all prime numbers? ");
        int max = scanner.nextInt();
        PrimeNumbers primeThread = new PrimeNumbers(max);
        primeThread.start();
    }
}
