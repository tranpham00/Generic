import java.util.*;

public class Stack<T> {
    ArrayList<T> stack;

    public Stack()
    {
        stack = new ArrayList<T>();
    }

    public void push(T obj)
    {
        stack.add(obj);
    }

    public T pop()
    {
        T top = stack.get(stack.size() - 1);
        stack.remove(stack.size() - 1);
        return top;
    }

    public T peek()
    {
        return stack.get(stack.size() - 1);
    }

    public boolean isEmpty()
    {
        boolean empty = false;
        if(stack.size() == 0)
        {
            empty = true;
        }
        return empty;
    }
}
