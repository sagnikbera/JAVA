package JAVA;

/**
 * https://www.youtube.com/watch?v=5gFC-ayyQMk&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=30
 * primeFactorization
 */
public class primeFactorization {

    public static void main(String[] args) {
        
        int n = 1440;

        //divide through prime number and update the prime number
         for(int div = 2; div*div <= n; div++){
            while(n % div == 0){
                n = n/div;
                System.out.print(div + " ");
            }
        }      
        
        //46 = 2 X 23 ; This logic is for 23
            if(n != 1) {
                System.out.print(n);
            }
        
    }
}