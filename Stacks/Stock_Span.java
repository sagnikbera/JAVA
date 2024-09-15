//https://www.youtube.com/watch?v=0BsPlzqksZQ&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=112

// a b c d e f g h i j k 
// 2 3 4 3 4 6 5 4 3 4 5 --> n=11 
//           |         
//           | |       | 
//     |   | | | |   | | 
//   | | | | | | | | | | 
// | | | | | | | | | | | 
// | | | | | | | | | | | 
// 1 2 3 1 2 6 1 1 1 2 4 --> Answer

//using Next greater element on the left (which verient stors index)

package JAVA.Stacks;


import  java.util.*;


/**
 * Stock_Span
 */
public class Stock_Span {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element: ");
        int n = sc.nextInt();

        System.out.println("Enter elemenets vaue: ");

        int[] a = new int[n];

        for(int i=0 ; i<n ; i++){
            a[i] = sc.nextInt();
        }

            int[] span = solve(a);
            System.out.println("Answer is : ");
            display(span);
        sc.close();
    }


    public static void display(int[] a){
        for(int val : a){
            System.out.println(val);
        }
    }

    public static int[] solve(int[] arr){

        int[] span = new int[arr.length];

        Stack<Integer> st = new Stack<>();

        st.push(0);
        span[0] = 1;

        for(int i=1; i<arr.length ; i++){
            while(st.size()>0 && arr[i] > arr[st.peek()]){
                st.pop();
            }

            if(st.size() == 0){
                span[i] = i+1;
            }else{
                span[i] = i - st.peek();
            }

            st.push(i);
        }
        return span;
    }
    
}