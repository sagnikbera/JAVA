package JAVA.Random;

/**
 * Print all Prime Numbers till N
 */
public class printPrimeNumber {

    public static void main(String[] args) {
        int low = 5;
        int high = 13;

    for(int n = low; n <= high; n++){

        int count = 0;
        
        //try to divide n and increase count
        for(int div =2; div*div <=n; div++){
            if(n % div ==0){
                count++;
                break;
            }
        }

        if(count==0){
            System.out.println(n + " is a prime number");
        }
    }

    }
}