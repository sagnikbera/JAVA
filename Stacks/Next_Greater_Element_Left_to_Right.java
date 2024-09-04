// https://www.youtube.com/watch?v=XP8iEi9Aa8c&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=110

// 2 5 9  3  1  12 6  8  7
// 5 9 12 12 12 -1 8 -1 -1

package JAVA.Stacks;

import java.util.Stack;

public class Next_Greater_Element_Left_to_Right {
    public static void main(String[] args) {
        int[] arr = {2,5,9,3,1,12,6,8,7};
        int[] result = nextGreaterEl(arr);

        for(int i=0; i<result.length ; i++){
            System.out.print(result[i] + " ");
        }
    }

    public static int[] nextGreaterEl(int[] arr){
        int[] result = new int[arr.length];

        Stack<Integer> st = new Stack<>();

        st.push(0);
        for(int i=1; i<arr.length ; i++){
            while(st.size() > 0 && arr[i] > arr[st.peek()]){
                int pos = st.peek();
                result[pos] = arr[i];
                st.pop();
            }

            st.push(i);
        }

        while(st.size() > 0){
            int pos = st.peek();
            result[pos] = -1;
            st.pop();
        }

        return result;
    }
}
