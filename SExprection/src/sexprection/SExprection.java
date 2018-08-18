/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sexprection;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Administrator
 */
public class SExprection {

    /**
     * @param args the command line arguments
     */
    /*
    2 4 5 * + 2 3 * 7 + *  = 286
    1 2 + 3 4 + * = 21
    1 2 6 * 4 / 5 + 7 * + = 5
    */
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Scanner reader = new Scanner(System.in);
        String n1 = reader.nextLine();
        String[] n2 = n1.split(" ");
        double sum = 0;
        int a;
        int b;
        Stack line = new Stack();
        for(int i = 0; i < n2.length; i++){
            if("+".equals(n2[i])){
                b = line.pop();
                a = line.pop();
                line.push(a+b);
            }
        }
        */
        String sExp = sc.nextLine();
        calculate(sExp);
    }

    private static void calculate(String sExp) {
        Stack<Integer> operands = new Stack();
        String[] tockens = sExp.split(" ");
        for(int i = 0; i < tockens.length; i++){
            char op = tockens[i].charAt(0);
            switch(op){
                case '+':
                    int b=operands.pop();
                    int a=operands.pop();
                    operands.push(a+b);
                    break;
                case '-':
                    b=operands.pop();
                    a=operands.pop();
                    operands.push(a-b);
                    break;
                case '*':
                    b=operands.pop();
                    a=operands.pop();
                    operands.push(a*b);
                    break;
                case '/':
                    b=operands.pop();
                    a=operands.pop();
                    operands.push(a/b);
                    break;
                default:
                    operands.push(Integer.parseInt(tockens[i]));
                    break;
            }
        }
        System.out.println(operands.pop());
    }
    
}
