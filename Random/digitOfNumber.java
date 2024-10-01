package JAVA.Random;

/**
 * Digits of a number
 * https://www.youtube.com/watch?v=gZp776a-pbQ&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=20
 */
public class digitOfNumber {

    public static void main(String[] args) {
        
        int n = 12345;

        int dig = 0;
        int temp = n;
        
        while(temp !=0){
          temp = temp/10;
          dig++;
        }

        //754 - dig-3
        //div by 100 = 10^(3-1)
        
        int div = (int)Math.pow(10,dig-1);
        
        while(div != 0){
          System.out.println(n/div);
          n = n%div;
          div = div/10;
        }
    }
}