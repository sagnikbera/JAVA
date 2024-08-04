import java.util.Scanner;

/**
 * https://www.youtube.com/watch?v=TJtXba11yNU&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=88
 * 
 * anyBase_Subtraction
 */
public class anyBase_Subtraction {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Base : ");
        int base = sc.nextInt();
        System.out.print("Enter Number1 : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the Number2 : ");
        int num2 = sc.nextInt();

        //here num1 is greater than num2
        int subtractedResult = getSubtracted(base , num1 , num2);
        System.out.println(subtractedResult);

        sc.close();
    }

    public static int getSubtracted( int b, int n1 , int n2 ){

        int result = 0;

        int borrow = 0;
        int power = 1;

        while (n2 > 0) {
            int d1 = n1 % 10;
            n1 = n1 / 10;
            int d2 = n2 % 10;
            n2 = n2 / 10;

            int d = 0;
            d1 = d1 - borrow;

            if( d1 >= d2){
                 borrow = 0;
            }else{
                 borrow = 1;
                 d = d1 + b - d2;
            }

            result = result + d*power;
            power = power*10;
            
        }
        return result;

    }
    
}