package JAVA;

/**
 * Count Digits in a Number
 * https://www.youtube.com/watch?v=Ue3MTpyPHoU&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=18
 */
public class countDigit {

    public static void main(String[] args) {
        
        int n = 123456;

        int dig = 0;

        while(n != 0){
            n = n/10;
            dig++;
        }

        System.out.println(dig);
    }
}