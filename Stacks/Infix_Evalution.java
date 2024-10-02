package JAVA.Stacks;

// https://www.youtube.com/watch?v=IY0nZLEg6MA&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=118


import java.io.*;
import java.util.*;

public class Infix_Evalution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();

        Stack<Integer> opnds = new Stack<>();
        Stack<Character> optors = new Stack<>();

        for(int i=0; i<exp.length() ; i++){
            char ch = exp.charAt(i);

            if(ch == '('){
                optors.push(ch);

            }else if(Character.isDigit(ch)){
                opnds.push(ch - '0');
                //convert charecter into number
                //'5' --> 53 ,so '5' != 5
                //'0' --48
                //'5' - '0' = 53 - 48 = 5

            }else if(ch == ')'){
                while(optors.peek() != '('){
                    char optor = optors.pop();
                    int v2 = opnds.pop();
                    int v1 = opnds.pop();

                    int opVal = operation(v1, v2, optor);
                    opnds.push(opVal);
                }
                optors.pop(); //to pop closing bracket

            }else if(ch == '+' || ch == '-' || ch == '/' || ch == '*'){
                //ch is waiting for higher priority operators to solve first
                while(optors.size()>0 && optors.peek()!='(' && precedence(ch) <= precedence(optors.peek())){
                    char optor = optors.pop();
                    int v2 = opnds.pop();
                    int v1 = opnds.pop();

                    int opVal = operation(v1, v2, optor);
                    opnds.push(opVal);
                }

                optors.push(ch); //ch is pushed itself now
            }
        }

        while(optors.size() != 0){
            char optor = optors.pop();
            int v2 = opnds.pop();
            int v1 = opnds.pop();

            int opVal = operation(v1, v2, optor);
            opnds.push(opVal);
        }

        System.out.println(opnds.peek());
    }

    public static int precedence(char optor){
        if(optor == '+'){
            return 1;
        }else if(optor == '-'){
            return 1;
        }else if(optor == '*'){
            return 2;
        }
        else if(optor == '/'){
            return 2;
        }

        return -1; // Default return if no valid operator is found
    }

    public static int operation(int v1, int v2, char optor){
        if(optor == '+'){
            return v1+v2;
        }else if(optor == '-'){
            return v1-v2;
        }else if(optor == '*'){
            return v1*v2;
        }
        else if(optor == '/'){
            return v1/v2;
        }

        return 0; // Default return value if the operator is not recognized
    }
}
