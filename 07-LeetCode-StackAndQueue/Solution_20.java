import java.util.HashMap;
import java.util.Stack;

/**
 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。

 有效字符串需满足：

 左括号必须用相同类型的右括号闭合。
 左括号必须以正确的顺序闭合。
 注意空字符串可被认为是有效字符串。

 示例 1:

 输入: "()"
 输出: true
 示例 2:

 输入: "()[]{}"
 输出: true
 */
public class Solution_20 {
    public static boolean isValid(String s) {
        boolean ret = true;
        Stack<Character> stack = new Stack();
        HashMap<Character,Character> map = new HashMap<>();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');

        for(int i=0; i<s.length() ; i++){
            char c = s.charAt(i);
            if(map.containsValue(c)){

                stack.push(c);

            } else if(map.containsKey(c)){
                if(stack.size() == 0)
                    return false;

                Character a = stack.pop();


                if(map.get(c) == a)
                    continue;
                else
                    return false;

            } else{
                continue;
            }
        }
        if(stack.size() != 0)
            return false;

        return ret;
    }


    public static void main(String[] args) {

        System.out.println(isValid("()"));
    }
}
