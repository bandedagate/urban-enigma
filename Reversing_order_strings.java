import java.util.Stack;
public class Reversing_order_strings {
    public static void main (String args[]){
        Stack <String> stack = new Stack <String>();       // generic type creation of stack (String here)
        stack.push("The");
        stack.push("sky");
        stack.push("is");
        stack.push("blue");
      while(!stack.isEmpty()){
        System.out.print(stack.pop()+" ");
      }
        }
}
