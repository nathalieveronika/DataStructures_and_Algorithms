/** A stack abstract data type that contains Strings. */
public class StringStack {
  // variables
  private int top;
  private String[] stack;

 /**
 * Constructor for creating a new StringStack with a certain capacity.
 * @param capacity the maximum number of strings the stack can hold
 */
 public StringStack(int capacity) {
   top = 0;
   stack = new String[capacity];
 }
 /**
 * Puts the given String on top of the stack (if there is enough space).
 * @param s the String to add to the top of the stack
 * @return false if there was not enough space in the stack to add the string;
 otherwise true
 */
 public boolean push(String s) {
   if (top == stack.length){
     return false;
   } else {
     stack[top] = s;
     top++;
     return true;
   }
 }
 /**
 * Removes the String on top of the stack from the stack and returns it.
 * @return the String on top of the stack, or null if the stack is empty.
 */
 public String pop() {
   if (top == 0){
     return null;
   }
   else {
     String first = stack[top-1];
     top--;
     return first;
   }
 }
 /**
 * Returns the number of Strings in the stack.
 * @return the number of Strings in the stack
 */
 public int count() {
   return top;
 }
}
