//https://www.youtube.com/watch?v=tCVOQX3lWeI&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=116

// 2 9 3 8 1 7 12 6 14 4 -- size 10
// - - - - (max 9)
// 2 9 3 8 1 7 12 6 14 4
//   - - - - (max 9) 
// 2 9 3 8 1 7 12 6 14 4 
//     - - - - (max 8)
// 2 9 3 8 1 7 12 6 14 4 
//       - - - - (max 12)
// 2 9 3 8 1 7 12 6 14 4 
//         - -  -  - (max 12)
// 2 9 3 8 1 7 12 6 14 4 
//           - -  -  - (max 14)
// 2 9 3 8 1 7 12 6 14 4 
//              - -  - - (max 14)

//Ans = 9 9 8 12 12 14 14

package JAVA.Stacks;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Sliding_window_maximum {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter size of array: ");
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        System.out.println("Enter values in that array : ");

        for(int i=0 ; i<n ; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        System.out.println("Enter sliding window size: ");
        int k = Integer.parseInt(br.readLine());


        //logic
        Stack<Integer> st = new Stack<>();

        //next greater element
        int[] nge = new int[arr.length]; 

        st.push(arr.length - 1);
        nge[arr.length - 1] = arr.length;  // Last element has no greater element, hence we set it to the length of the array

        for(int i = arr.length-2 ; i >= 0 ; i--){
            //-a+
            while(st.size() > 0  &&  arr[i] >= arr[st.peek()]){
                // Pop elements from the stack while the current element is greater than or equal to the element at the stack's top index
                st.pop();
            }

            // If the stack is empty, there's no greater element to the right
            if(st.size() == 0){
                nge[i] = arr.length;
            }else{
                nge[i] = st.peek();
            }

            // Push the current element's index onto the stack
            st.push(i);
        }

        //-------
        int j = 0; //opt
        // j tracks the maximum index within the current window
        for(int i=0 ; i<= arr.length-k ; i++){
            //enter the loop to find the maximum of window starting at i
            // int j = i;
            if(j < i){
                //opt
                // Ensure j is within the bounds of the current window
                j = i ;
            }

             // Find the maximum element for the current window
            while(nge[j] < i+k){
                j = nge[j];
            }

            System.out.println(arr[j]); // Print the maximum element in the current window
        }

    }
}
