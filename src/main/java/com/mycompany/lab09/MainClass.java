package com.mycompany.lab09;

import java.util.Stack;

public class MainClass {
    
    public static void main(String[] args){
        
        System.out.println(isBalanced("(2+4) * 8 + ((3-1) + 7)"));
        System.out.println(isBalanced("(2+4*7 + (3-1) + 8"));
        System.out.println(isBalancedBrackets("[9+2] * 7 + [[6+2] + 20]")); // tests true
        System.out.println(isBalancedCurlyBrackets("{9+3-2 * 2 + {2+2} - 4")); // tests false
        
    }
    
    public static Boolean isBalanced(String expression){ // paranthesis
        
        char[] exp = expression.toCharArray();
        Stack<Character> stack = new Stack();
        
        for(int i = 0; i<exp.length; i++){
            if(exp[i] == '('){
                stack.push('(');
            }
            if(exp[i] == ')'){
                if(stack.isEmpty()){
                    return false;
                }
                stack.pop();
            }
        }
        
        if(stack.isEmpty()){
            return true;
        }
        
        return false;
        
    }
    
    public static Boolean isBalancedBrackets(String expression){ // brackets
        
        char[] exp = expression.toCharArray();
        Stack<Character> stack = new Stack();
        
        for(int i = 0; i<exp.length; i++){
            if(exp[i] == '['){
                stack.push('[');
            }
            if(exp[i] == ']'){
                if(stack.isEmpty()){
                    return false;
                }
                stack.pop();
            }
        }
        
        if(stack.isEmpty()){
            return true;
        }
        
        return false;
    }
    
    public static Boolean isBalancedCurlyBrackets(String expression){ // curly brackets
        
        char[] exp = expression.toCharArray();
        Stack<Character> stack = new Stack();
        
        for(int i = 0; i<exp.length; i++){
            if(exp[i] == '{'){
                stack.push('{');
            }
            if(exp[i] == '}'){
                if(stack.isEmpty()){
                    return false;
                }
                stack.pop();
            }
        }
        
        if(stack.isEmpty()){
            return true;
        }
        
        return false;
    }
    
}