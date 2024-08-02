/**
 * https://www.youtube.com/watch?v=F0aTGc2vS5s&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=82
 * 
 * anyBase_To_Decimal
 */
public class anyBase_To_Decimal {

    public static void main(String[] args) {
        
        int num = 1172;
        int base = 8;

        int result = 0;
        int p = 1;

        while(num > 0){
            int dig = num % 10;
            num = num/10;

            result = result + dig*p;
            p = p*base;

        }

        System.out.println(result);
    }
}