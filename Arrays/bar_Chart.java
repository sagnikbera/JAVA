package JAVA.Arrays;

import java.util.Scanner;

/**
 * bar_Chart
 * 
 * https://www.youtube.com/watch?v=L-0IxqvYQKs&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=98
 */
public class bar_Chart {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr [] = new int[n];

        for(int i=0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }

        int Max = arr[0];

        for(int i=0 ; i < arr.length ; i++){
            if(arr[i] > Max){
                Max = arr[i];
            }
        }

        for(int floor = Max ; floor >= 1; floor--){
            for(int i=0 ; i < arr.length ; i++){
                if(arr[i] >= floor){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}