package JAVA.Stacks;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

// https://www.youtube.com/watch?v=f29emeUcw6c&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=120

//infic -> operator inbetween operends-->a+b
//prefix -> operends after operator-->+ab
//postfix -> operetor after operends-->ab+

public class Infix_Conversions {

    public static int preceddence(char ops){
        if(ops == '+'){
            return 1;
        }else if(ops == '-'){
            return 1;
        }else if(ops == '/'){
            return 2;
        }else if(ops == '*'){
            return 2;
        }else{
            return -1;
        }
    }

    public static void performOperation(Stack<String> pre, Stack<String> post, char op){

        // Postfix operation
        String postv2 = post.pop();
        String postv1 = post.pop();
        String postVal = postv1 + postv2 + op;
        post.push(postVal);

        // Prefix operation
        String prev2 = pre.pop();
        String prev1 = pre.pop();
        String preVal = op + prev1 + prev2;
        pre.push(preVal);
    }


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();

        Stack<String> post = new Stack<>();
        Stack<String> pre = new Stack<>();
        Stack<Character> ops = new Stack<>();

        for(int i=0; i<exp.length() ; i++){
            char ch = exp.charAt(i);

            if(ch == '('){
                ops.push(ch);

            }else if((ch>='0' && ch<='9') || (ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
                //charecter+"" --> string
                post.push(ch+"");
                pre.push(ch+"");

            }else if(ch == ')'){
                while(ops.peek() != '('){
                    char op = ops.pop();
                    performOperation(pre, post, op);
                }

                ops.pop(); // Pop '('


            }else if(ch=='+' || ch=='-' || ch=='/' || ch=='*'){
                while(ops.size()>0 && ops.peek()!='(' && preceddence(ops.peek()) >= preceddence(ch)){
                    char op = ops.pop();
                    performOperation(pre, post, op);
                }
                ops.push(ch); // Push current operator
            }else{
                //operand
                pre.push(ch+"");
                post.push(ch+"");
            }
        }

        // Perform remaining operations
        while(ops.size() > 0){
            char op = ops.pop();
            performOperation(pre, post, op);
        }

        System.out.println(post.peek());
        System.out.println(pre.peek());
    }
}
