package JAVA.Random;

public class primeNumber {

    public static void main(String[] args) {
        int n = 15;

        //bruteforce - no is divided by 1 and itself,so the number of divisor must be 2
        int count = 0;
        for (int div = 1; div <= n; div++) {
            if(n % div == 0){
                count ++;
            }
        }
        if(count == 2){
            System.out.println("Prime");
        }else{
            System.out.println("Not Prime");
        }


        //any non-number must have divisor bellow its square root,factor must be found under root n. (skip 1, and check are there any factor found till root n)

        int num = 13;
        int cnt = 0;
        for(int div=2; div*div <= num; div++){
            if(num % div == 0){
                cnt++;
                break; //if atleast 1 factor found, no need to check further 
            }
        }

        if(cnt == 0){
            System.out.println("Prime");
        }else{
            System.out.println("Not Prime");
        }
    }
}