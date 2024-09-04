// https://www.youtube.com/watch?v=rSf9vPtKcmI&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=109

// 2 5 9  3  1  12 6  8  7
// 5 9 12 12 12 -1 8 -1 -1


package JAVA.Stacks;

import java.util.Stack;

public class Next_Greater_Element_Right_to_Left {
    public static void main(String[] args) {
        
        int[] arr = {2,5,9,3,1,12,6,8,7};
        int[] result = nextGreaterEl(arr);

        for(int i=0; i< result.length ; i++){
            System.out.print(result[i] + " ");
        }
    }

    public static int[] nextGreaterEl(int[] arr){
        int[] result = new int[arr.length];
        Stack<Integer> st = new Stack<>();

        st.push(arr[arr.length-1]);
        result[arr.length-1] = -1;

        for(int i= arr.length-2 ; i>=0 ; i--){
            //- a +
            while(st.size() > 0  &&  arr[i] >= st.peek()){
                st.pop();
            }
            if(st.size() == 0){
                result[i] = -1;
            }else{
                result[i] = st.peek();
            }

            st.push(arr[i]);
        }

        return result;
    }
}
