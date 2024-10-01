package JAVA.Random;

/**
 * https://www.youtube.com/watch?v=ZtDeDD1VYLk&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk
 * 
 * GCDandLCM
 */
public class GCDandLCM {

    public static void main(String[] args) {
        
        int num1 = 24;
        int num2 = 36;

        int ogNum1 = num1;
        int ogNum2 = num2;


        //small and big number doest not effect as it will sort in next step of division
        
        while(num1 % num2 != 0){

            int remainder = num1 % num2;
            num1 = num2;
            num2 = remainder;
        }

        int gcd = num2;
        int lcm = (ogNum1 * ogNum2)/gcd;

        System.out.println(gcd);
        System.out.println(lcm);

        

    }
}