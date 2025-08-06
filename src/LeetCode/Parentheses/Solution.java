package LeetCode.Parentheses;
import java.util.EmptyStackException;
import java.util.List;
import java.util.Stack;
import java.util.Arrays;
public class Solution {
    public static boolean isValid(String s) {
        Stack<String> stack = new Stack<>();
        List<String> opening = Arrays.asList("(", "[", "{");
        List<String> closing = Arrays.asList(")", "]", "}");

        for (int i = 0; i < s.length(); i++) {
            String Bracket = Character.toString(s.charAt(i));
            if (opening.contains(Bracket)) { //logic for opening brackets
                stack.push(Bracket);
                System.out.println("pushed " + Bracket);
            }
            else if (closing.contains(Bracket)) { //logic for closing brackets
                try {
                    String top = stack.peek();
                    int index1 = opening.indexOf(top);
                    int index2 = closing.indexOf(Bracket);
                    if (opening.contains(top) && index1 == index2) {
                        System.out.println("popped " + top);
                        stack.pop();
                    }
                    else {
                        stack.push(Bracket);
                    }

                }
                catch (EmptyStackException e) {
                    stack.push(Bracket);
                }

            }
        }
        System.out.println(stack);

        return stack.isEmpty();
    }

}