/**
 * Created by sujiaxu on 2017/1/18.
 */
import java.util.*;
public class valid_paren {

    public static int paren(String string){
        if(string == null || string.length() == 0){
            return 0;
        }
        Stack<Character> stack = new Stack<>();
        //stack.push(string.charAt(0));
        for(int i = 0 ; i < string.length() ; i++){

            if(string.charAt(i) == '(') {
                stack.push('(');
                continue;
            }else {
                if(stack.isEmpty() || stack.pop() != '('){
                    return -1;
                }
            }
        }
        return stack.isEmpty()? string.length()/2 : -1;

    }
    public static void main(String[] args) {
        System.out.println(paren(")("));
    }
}
