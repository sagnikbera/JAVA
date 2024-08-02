import java.util.Scanner;

/**
 * 
 * https://www.youtube.com/watch?v=2-d3DcBFzug&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=83
 * 
 * anyBase_to_anyBase
 */
public class anyBase_to_anyBase {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.print("Base of that number: ");
        int b1 = sc.nextInt();
        System.out.print("The Base you want to convert: ");
        int b2 = sc.nextInt();

        int finalResult = getValue(n , b1, b2);
        System.out.println(finalResult);

        sc.close();;
    }

    public static int getValue(int n, int b1, int b2){
        int dec = anyBaseToDecimal(n , b1);
        int dn = decimalToAnyBase(dec , b2);
        return dn;
    }

    public static int decimalToAnyBase(int n, int b){
        int result = 0;

        int power = 1;

        while(n > 0){
            int dig = n%b;
            n = n/b;

            result = result + dig*power;
            power = power*10;
        }

        return result;
    }

    public static int anyBaseToDecimal(int n, int b){
        int result = 0;

        int power = 1;

        while (n > 0) {
            int dig = n % 10;
            n = n / 10;

            result = result + dig*power;

            power = power*b;
        }

        return result;
    }


}