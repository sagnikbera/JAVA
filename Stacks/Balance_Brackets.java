// https://www.youtube.com/watch?v=uuE2pEjLiEI&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=107

// [(a+b)+{(c+d)*(e/f)}] --> true
// [(a+b)+{(c+d)*(e/f)}} --> false

package JAVA.Stacks;

import java.util.Scanner;
import java.util.Stack;

public class Balance_Brackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();

        Stack<Character> st = new Stack<>();

        // for(int i = 0; i <str.length(); i++){
        //     char ch = str.charAt(i;)
        //     logic-------logic
        //   }

        for (Character ch : str.toCharArray()) { //for-each loop
            if(ch == '(' || ch == '{' || ch == '['){
                st.push(ch);
            }else if (ch == ')'){

                // handleClosing(st,ch){
                //     if(st.size() == 0){
                //         return false;
                //     }else if (st.peek() != opBrac){
                //         return false;
                //     }else{
                //         st.pop();
                //         return true;
                //     }
                // }
               boolean val = handleClosing(st,'(');
               if(val == false){
                System.out.println(val);
                return;
               }
            }else if (ch == '}'){
                boolean val = handleClosing(st,'{');
                if(val == false){
                    System.out.println(val);
                    return;
                   }
            }else if ( ch == ']'){
                boolean val = handleClosing(st,'[');
                if(val == false){
                    System.out.println(val);
                    return;
                   }
            }else{

            }
        }

        if(st.size() == 0){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }

    public static boolean handleClosing(Stack<Character> st, char opBrac){
        if(st.size() == 0){
            return false;
        }else if (st.peek() != opBrac){
            return false;
        }else{
            st.pop();
            return true;
        }
    }
}
