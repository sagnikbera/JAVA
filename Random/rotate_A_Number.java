package JAVA;

/**
 * rotate_A_Number
 * https://www.youtube.com/watch?v=ysMHtDIlU0c&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=25
 * 
 * 273516
 * rotate 2
 * 2735|16
 * 162735
 * 
 * //steps
 * 25398
 * rotate 2
 * 253|98 => 1000|100 => 25398%100 =>98 ==> 8*1000 + 253
 * 98253
 * 
 * rotate 5
 * 25398|
 * 
 * rotate 6 => rotate 1
 * 2|5398
 * 53982
 */
public class rotate_A_Number {

    public static void main(String[] args) {
        
        int n = 25398;
        int r = -2;

        int temp = n;
        int dig = 0;

        while(temp>0){
            temp = temp/10;
            dig++;
        }


        //logic for if rotator is grater than the number of digit
        r = r%dig;


        // logic for if rotator is neg no
        if(r < 0){
            r = dig + r;
        }

        int div = 1;
        int mult = 1;

        for(int i=1; i<=dig ; i++){
            if(i <= r){
                div = div*10;
            }else{
                mult = mult*10;
            }
        }

        int quotient = n/div;
        int remainder = n%div;

        int rotatedNum = remainder*mult + quotient;

        // int rotatedNum = (n%div)*mult + n/div;

        System.out.println(rotatedNum);

    }
    
}