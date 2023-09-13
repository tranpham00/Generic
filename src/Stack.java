import java.util.*;

public class Stack<T> {
    ArrayList<T> stack = new ArrayList<T>();

    public void push(T obj)
    {
        stack.add(obj);
    }

    public void pop()
    {
        stack.remove(stack.get(stack.size() - 1));
    }

    public void peek()
    {
        System.out.println(stack.get(stack.size() - 1));
    }

    public void isEmpty()
    {
        boolean empty = false;
        if(stack.size() == 0)
        {
            empty = true;
        }
        System.out.println(empty);
    }
}
