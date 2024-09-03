// https://www.youtube.com/watch?v=aMPXhEdpXFA&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=105

// ((a+b) + (c+d)) --> false
// (a+b) + ((c+d)) --> true

package JAVA.Stacks;

import java.util.Scanner;
import java.util.Stack;

public class Duplicate_Brackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        
        Stack<Character> st = new Stack<>();

        for(int i = 0 ; i < str.length() ; i++){
            char ch = str.charAt(i);

            if(ch == ')'){
                if(st.peek() == '('){
                    System.out.println(true);
                    return;
                } else {
                    while (st.peek() != '('){
                        st.pop();
                    }
                    st.pop();
                }
            }else{
                st.push(ch);
            }
        }

        System.out.println(false);

        
    }
}
