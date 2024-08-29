// https://www.youtube.com/watch?v=BzJK1zNXwcU&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=100 

package JAVA.Arrays;

public class sumOfTwoArray {
    public static void main(String[] args) {
        
         int a1[] = {9, 9, 9};
         int a2[] = {2 , 8};

         int[] sum = new int[ a1.length > a2.length ? a1.length : a2.length ];

         int carry = 0;

         int i = a1.length - 1;
         int j = a2.length - 1;
         int k = sum.length - 1;  

         while(k >= 0){
            int dig = carry;

            if( i >= 0){
                dig = dig+a1[i];
            }

            if(j >= 0){
                dig = dig + a2[j];
            }

            carry = dig / 10;
            dig = dig % 10;

            sum[k] = dig;

            i--;
            j--;
            k--;
         }

         if(carry != 0 ){
            System.out.print(carry);
         }

         for(int val : sum){
            System.out.print(val);
         }
    }
}
