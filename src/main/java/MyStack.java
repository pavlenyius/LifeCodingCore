import java.util.Stack;

public class MyStack {
    public static boolean isBalance(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char currenrBraket = str.charAt(i);

            if (currenrBraket == '(' || currenrBraket == '[' || currenrBraket == '{') {
                stack.push(currenrBraket);
            } else if (currenrBraket == ')' || currenrBraket == ']' || currenrBraket == '}') {
                if (stack.isEmpty()) {
                    return false;
                }

                char openBrakets = stack.pop();

                if (currenrBraket == '(' && openBrakets != ')'
                        || currenrBraket == '[' && openBrakets != ']'
                        || currenrBraket == '{' && openBrakets != '}') {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String test1="([{}])";
        System.out.println(isBalance(test1));

    }

}
// 11 min