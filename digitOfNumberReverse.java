package JAVA;

/**
 * digit Of Number Reverse
 * https://www.youtube.com/watch?v=D_yKIOnhMRc&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=22
 */
public class digitOfNumberReverse {

    public static void main(String[] args) {
        int n = 123456;
        int dig=0;
        
        while(n != 0){ 
          
          dig=n%10;
          System.out.println(dig);
          n = n/10;
          
        }
    }
}