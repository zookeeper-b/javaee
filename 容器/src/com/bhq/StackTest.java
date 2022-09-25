package com.bhq;

import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        String a = stack.push("a");
        String b = stack.push("b");
        String c = stack.push("c");


        System.out.println(stack.peek());
        System.out.println(stack.search(a));

        String p1 = stack.pop();
        System.out.println(p1);
        String p2 = stack.pop();
        System.out.println(p2);
        String p3 = stack.pop();
        System.out.println(p3);

        System.out.println(stack.isEmpty());
        System.out.println("----------------------");
        StackTest stackTest=new StackTest();
        stackTest.symmetry();
    }

    public void symmetry() {
        String str = "..{.[.().].}..";
        Stack<String> stack = new Stack<>();
        //假设修正法
        boolean flag = true;

        for (int i = 0; i < str.length(); i++) {

            char c = str.charAt(i);
            if (c == '{') {
                stack.push("}");
            }
            if (c == '[') {
                stack.push("]");
            }
            if (c == '(') {
                stack.push(")");
            }
            //判断符号是否匹配
            if (c == '}' || c == ']' || c == ')') {
                if (stack.empty()) {
                    flag = false;
                    break;
                }
                String x = stack.pop();
                if (x.charAt(0) != c) {
                    flag = false;
                    break;
                }

            }


        }
        if (!stack.empty()) {
            flag = false;

        }
        System.out.println(flag);
    }

}
