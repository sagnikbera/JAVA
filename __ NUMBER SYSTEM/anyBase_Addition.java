import java.util.Scanner;

/**
 * https://www.youtube.com/watch?v=YVpTjZRShqo&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=86
 * 
 * anyBase_Addition
 */
public class anyBase_Addition {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base :");
        int base = sc.nextInt();
        System.out.print("Enter Number 1 :");
        int num1 = sc.nextInt();
        System.out.print("Enter Number 2 :");
        int num2 = sc.nextInt();

        int resultSum = getSum(base , num1 , num2);
        System.out.println(resultSum);

        sc.close();
    }

    public static int getSum(int b, int n1, int n2){

        int sum = 0;
        
        int carry = 0;
        int power = 1;

        while(n1 > 0 || n2 > 0 || carry > 0){
            int d1 = n1 % 10;
            int d2 = n2 % 10;

            n1 = n1/10;
            n2 = n2/10;

            int d = d1 + d2 + carry;

            carry = d / b;
            d = d % b;

            sum = sum + d * power;
            power = power * 10;
        }

        return sum;
    }
}