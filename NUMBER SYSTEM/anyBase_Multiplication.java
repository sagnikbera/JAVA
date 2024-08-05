import java.util.Scanner;

/**
 * https://www.youtube.com/watch?v=_jcwos0_pSg&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=90
 * 
 * anyBase_Multiplication
 */
public class anyBase_Multiplication {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Base: ");
        int b = sc.nextInt();
        System.out.print("Enter Number 1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter Number 2: ");
        int num2 = sc.nextInt();

        int d = getProduct( b, num1 , num2);
        System.out.println(d);

        sc.close();
    }

    public static int getProduct( int b, int n1 , int n2){

        int returnValue = 0;
        int p = 1;

        while( n2 > 0){
            int d2 = n2%10;
            n2 = n2/10;

            int singleProduct = getProductWithSingleDigit(b, n1, d2);

            returnValue = getSum(b, returnValue, singleProduct*p);
            p = p*10;
        }

        return returnValue;

    }

    public static int getProductWithSingleDigit(int b, int n1 , int d2){

        int returnValue = 0;

        int c = 0;
        int p = 1; //power

        while( n1 > 0 || c > 0){
            int d1 = n1%10;
            n1 = n1/10;

            int d = d1*d2 + c;

            c = d / b;
            d = d % b;

            returnValue = returnValue + d*p;
            p = p*10;
        }

        return returnValue;

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