package JAVA;

import java.util.Scanner;

/**
 * https://www.youtube.com/watch?v=w4bRrZCEz6o&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=32
 * 
 * pythagoreanTriplets
 */
public class pythagoreanTriplets {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = a;
        if(b > c && b > a){
            max = b;
        }else if(c > b && c > a){
            max = c;
        }

        if(max == a){
            // if( a*a == b*b + c*c){
            //     System.out.println("true");
            // }else{
            //     System.out.println("false");
            // }
            boolean flag = (a*a == (b*b + c*c));
            System.out.println(flag);
        }else if(max == b){
            // if( b*b == a*a + c*c){
            //     System.out.println("true");
            // }else{
            //     System.out.println("false");
            // }
            boolean flag = (b*b == (a*a + c*c));
            System.out.println(flag);
        }else if(max == c){
            // if( c*c == b*b + a*a){
            //     System.out.println("true");
            // }else{
            //     System.out.println("false");
            // }
            boolean flag = (c*c == (b*b + a*a));
            System.out.println(flag);
        }

    }
    
}