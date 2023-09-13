public class App {
    public static void main(String[] args) throws Exception {
        Stack<Integer> nums = new Stack<Integer>();

        nums.push(10);
        nums.push(9);
        nums.push(1);
        System.out.println(nums.peek());
        System.out.println(nums.isEmpty());
        System.out.println(nums.pop());
        System.out.println(nums.peek());
        nums.pop();
        System.out.println(nums.isEmpty());
    }
}
