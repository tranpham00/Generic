public class App {
    public static void main(String[] args) throws Exception {
        /*Stack<Integer> nums = new Stack<Integer>();

        nums.push(10);
        nums.push(9);
        nums.push(1);
        System.out.println(nums.peek());
        System.out.println(nums.isEmpty());
        System.out.println(nums.pop());
        System.out.println(nums.peek());
        System.out.println(nums.pop());
        System.out.println(nums.isEmpty());
        nums.pop();
        System.out.println(nums.isEmpty());
        */


        System.out.println(postFix("67+"));
        System.out.println(postFix("98*"));
        
    }

    public static int postFix(String operation)
    {
        Stack<String> ops = new Stack<String>();
        
        for(int i = 0; i < operation.length(); i++)
        {
            String top = operation.substring(i, i+1);
            if(top.equals("+"))
            {
                int x = Integer.parseInt(ops.pop());
                int y = Integer.parseInt(ops.pop());
                ops.push(Integer.toString(add(x, y)));
            }
            else if(top.equals("*"))
            {
                int x = Integer.parseInt(ops.pop());
                int y = Integer.parseInt(ops.pop());
                ops.push(Integer.toString(multiply(x, y)));
            }
            else
            {
                ops.push(top);
            }
        }
        return Integer.parseInt(ops.pop());
    }

    public static int add(int X, int Y)
    {
        return X + Y;
    }

    public static int multiply(int X, int Y)
    {
        return X * Y;
    }
}