/**
 * https://www.youtube.com/watch?v=lOsmPMihcTM&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=80
 * 
 * decimal_To_AnyBase
 */
public class decimal_To_AnyBase {

    public static void main(String[] args) {
        
        int num = 5;
        int base = 2;
        int result = 0;
        int mult = 1;

        while(num > 0){
            int remainder = num % base;
            num = num/base;
            result = result + remainder*mult;
            mult = mult*10;
        }

        System.out.println(result);
    }
}