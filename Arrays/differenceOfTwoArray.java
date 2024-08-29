// https://www.youtube.com/watch?v=jKyuWD8XKjw&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=102

package JAVA.Arrays;

public class differenceOfTwoArray {
    public static void main(String[] args) {
        
        int a1[] = {1, 0, 0 , 0};
         int a2[] = { 1 };

         int[] diff = new int[ a1.length ]; //let a1 is learger

         int carry = 0;

         int i = a1.length - 1;
         int j = a2.length - 1;
         int k = diff.length - 1; 

         while(k >= 0){

            int dig = 0;

            int a2Val = ( j >= 0 ) ? a2[j] : 0 ; 
            // 1000
            // ---1 >> 0001 

            if(a1[i] + carry >= a2Val){  //a2Val = a2[j];
                dig = a1[i] + carry - a2Val;
                carry = 0;
            }else{
                dig = a1[i] + carry + 10 - a2Val;
                carry = -1;
            }

            diff[k] = dig;

            i--;
            j--;
            k--;
         }

         //code for skip inital 0, like 009 >> 9 only

         int index = 0;
         while(index < diff.length){
            if(diff[index] == 0){
                index++;
            }else{
                break;
            }
         }

         while(index < diff.length){
            System.out.print(diff[index]);
            index++;
         }
    }
}
