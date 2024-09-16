//https://www.youtube.com/watch?v=0do2734xhnU&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=114


//                  width --> 1
//  6 2 5 4 5 1 6   --> height
//  ]           ]   6 -->
//  ]   ]   ]   ]   5 -->
//  ]   ] ] ]   ]   4 --> (4x3)
//  ]   ] ] ]   ]   3 -->
//  ] ] ] ] ]   ]   2 --> (2x5)
//  ] ] ] ] ] ] ]   1 --> (1x6)
//  - - (4x3) - -   ==> height


package JAVA.Stacks;

import java.io.*;
import  java.util.*;


public class Lrg_Area_Histogram {
     public static void main(String[] args) throws Exception{

        //input
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         System.out.println("Enter Size :");

         int n = Integer.parseInt(br.readLine());
        
         int[] arr = new int[n];
        System.out.println("Enter length of each column: ");
         for(int i=0 ; i<n ; i++){
            arr[i] = Integer.parseInt(br.readLine());
         }

         //logic
         int[] rb = new int[arr.length]; //next-smallest-element index on the right
         Stack<Integer> st = new Stack<>();
         st.push(arr.length - 1);
         rb[arr.length - 1] =  arr.length; // No smaller element on the right for the last element
         for(int i = arr.length - 2; i >= 0; i--) {
            while(st.size() > 0 && arr[i] <= arr[st.peek()]){
                st.pop();
            }
            if(st.size() == 0){
                rb[i] = arr.length;
            }else{
                rb[i] = st.peek();
            }
            st.push(i);
         }


         int[] lb = new int[arr.length]; //next-smallest-element index on the left
         st = new Stack<>();
         st.push(0);
         lb[0] =  -1; // No smaller element on the left for the first element
         for(int i = 1; i < arr.length ; i++) {
            while(st.size() > 0 && arr[i] <= arr[st.peek()]){
                st.pop();
            }
            if(st.size() == 0){
                lb[i] = -1;
            }else{
                lb[i] = st.peek();
            }
            st.push(i);
         }


         //ans-wala-code
         int maxArea = 0;
         for(int i=0 ; i<arr.length ; i++){
            int width = rb[i] - lb[i] - 1;
            int area = arr[i] * width;

            if(area > maxArea){
                maxArea = area;
            }
         }

         System.out.println("Largest area Histogram is : " + maxArea);
     }

}
