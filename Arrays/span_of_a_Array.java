package JAVA.Arrays;

import java.util.*;


/**
 * span_of_a_Array
 * 
 * https://www.youtube.com/watch?v=1SsXm5TI8W4&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=94
 */

public class span_of_a_Array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i=0 ; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int Max = arr[0];
        int Min = arr[0];

        for(int i=0 ; i < arr.length ; i++){
            if(arr[i] > Max){
                Max = arr[i];
            }else if(arr[i] < Min){
                Min = arr[i];
            }
        }

        System.out.println("Max is " + Max);
        System.out.println("Min is "+ Min);
        System.out.println("Span is " + (Max - Min));

        sc.close();
        
    }
}