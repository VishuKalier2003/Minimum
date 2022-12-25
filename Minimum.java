// todo: Create a Stack that returns minimum element in constant time... O (1)...
import java.util.Scanner;
import java.util.Stack;
public class Minimum
{
    //! Since the function does not uses Loops, it gives the result in Constant time... O(1) time...
    public int MinimumValue(Stack<Integer> stack1, int value)
    {
        if(stack1.isEmpty())      //? Since the Stack is empty in first Instance...
            stack1.push(value);
        int p = stack1.peek();
        if (p > value)              //? If the current value is less...
            stack1.push(value);
        if (p < value)              //? If the previous value was less...
        {
            stack1.pop();
            stack1.push(value);
            stack1.push(p);
        }
        return stack1.peek();    
    }
    //! Return the Top pointer element as the Minimum element...

    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        Stack <Integer> stack = new Stack<Integer>();
        Minimum minimum = new Minimum();
        int x, a, result = 0;
        System.out.print("Enter the number of values you want to enter : ");
        x = scanner.nextInt();
        for (int i = 0; i < x; i++)
        {
            System.out.print("Enter value : ");
            a = scanner.nextInt();
            result = minimum.MinimumValue(stack, a);
        }
        System.out.println("The Minimum Value in the Stack is : "+result);
        scanner.close();
    }
}