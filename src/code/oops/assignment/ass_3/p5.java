package code.oops.assignment.ass_3;

import java.util.Stack;

public class p5 {
    public static void main(String[] args) {
        StringBuilder text = new StringBuilder();
        Stack<String> stk = new Stack<>();

        String newText = "hello ";
        stk.push(text.toString());
        text.append(newText);
        System.out.println("text added -> " + newText);
        System.out.println("stack -> " + text.toString());

        newText = "world";
        stk.push(text.toString());
        text.append(newText);
        System.out.println("text added -> " + newText);
        System.out.println("stack -> " + text.toString());

        if(!stk.isEmpty()){
           text = new StringBuilder(stk.pop()) ;
        }
        System.out.println("undo successful");
        System.out.println("stack -> " + text.toString());

        if(!stk.isEmpty()){
            text = new StringBuilder(stk.pop()) ;
        }
        System.out.println("undo successful");
        System.out.println("stack -> " + text.toString());

        if(!stk.isEmpty()){
            text = new StringBuilder(stk.pop()) ;
            System.out.println("undo successful");
            System.out.println("stack -> " + text.toString());
        } else {
            System.out.println("nothing to undo");
        }

    }

}
