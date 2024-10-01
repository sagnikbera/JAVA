package JAVA.Random;

/**
 * https://www.youtube.com/watch?v=U3VZNsMJpD4&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=77
 * 
 * digitFrequency
 * 
 * 994543234 => frequency of 4 = 3
 */
public class digitFrequency {

    public static void main(String[] args) {
        
        int n = 994543234;
        int dig = 4;

        int count = 0;

        while(n > 0){
            int rem = n%10;
            n = n/10;

            if(rem == dig){
                count++;
            }
        }

        System.out.println(count);
    }
    
}