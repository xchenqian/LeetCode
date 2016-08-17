import java.util.Stack;
public class _20_valid_parentheses {
    
    public boolean isValid(String s) {
        int len = s.length();
        if (len==0 || len==1) {
            return false;
        }
        Stack<Character> stack = new Stack<Character>();        
        for (int i=0; i<len; i++) {
            char c = s.charAt(i);
            if (c=='(' || c=='[' || c=='{') {
                stack.push(c);
            }else{
                if (stack.empty()) {
                    return false;
                }
                char t = stack.pop();
                if (!(c==')'&&t=='(' || c==']'&&t=='[' || c=='}'&&t=='{')) {
                    return false;
                }
            }
        }
        if (!stack.empty()) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        _20_valid_parentheses a = new _20_valid_parentheses();  
        
        System.out.println("res:"+a.isValid("}}"));
    }
    
}