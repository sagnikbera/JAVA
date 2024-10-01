package JAVA;

/**
 * inverseNumber
 * https://www.youtube.com/watch?v=dbk42TKwk4M&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=23
 */
public class inverse_Number {

    /**
     * Position 5 4 3 2 1
     * Number   1 5 2 3 4 
     * Inv Num  4 1 2 3 5
     * position and number will switch accordingly
     * 
     * Position 8 7 6 5 4 3 2 1
     * Number   8 1 4 5 6 2 7 3
     * Inv Num  8 2 4 5 6 1 3 7
     * 
     */

    public static void main(String[] args) {
        
        int n = 15234;

        int inv = 0;
        int op = 1;

        while(n != 0){
            int od = n%10;

            int ip = od;
            int id = op;

            inv = inv + id* (int)Math.pow(10, ip-1);

            n = n/10;
            op++;
        }

        System.out.println(inv);
    }
}