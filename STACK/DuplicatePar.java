import java.util.Stack;

public class DuplicatePar {

    public static boolean FindDuplicate(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            if (ch == ')') {
                int count = 0;
                // Pop until we find the matching '('
                while (!s.isEmpty() && s.peek() != '(') {
                    s.pop();
                    count++;
                }
                // Remove the '(' from the stack
                if (!s.isEmpty() && s.peek() == '(') {
                    s.pop();
                }
                
                // Check if the parentheses were duplicate
                if (count == 0) {
                    return true;
                }
            } else {
                s.push(ch);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "((a+b))";
        System.out.println(FindDuplicate(str)); // Output should be true for this example
    }
}
