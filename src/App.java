public class App {
    public static void main(String[] args) throws Exception {
        Stack<Integer> nums = new Stack<Integer>();

        nums.push(2);
        nums.peek();
        nums.push(4);
        nums.push(23);
        nums.push(9);
        nums.peek();
        nums.pop();
        nums.peek();
        nums.isEmpty();

    }
}
