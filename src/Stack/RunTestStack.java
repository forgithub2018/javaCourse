public class RunTestStack {
    public static void main(String[] args) {
        Stack stack = new ArrayStack();

        System.out.println("size: " + stack.size()); // 0
        stack.push("A");
        System.out.println("size: " + stack.size()); // 1
        stack.push("B");
        System.out.println("size: " + stack.size()); // 2
        stack.push("C");
        System.out.println("Push finish");

        System.out.println("size: " + stack.size()); // 3
        ((ArrayStack) stack).showStack();

        Object element = stack.pop();
        System.out.println(element); // C

        System.out.println("size: " + stack.size()); // 2

        System.out.println("pop called: " + stack.pop()); // B
        System.out.println("pop called: " + stack.pop()); // A

        System.out.println("Push   new start");
        System.out.println("size: " + stack.size());

        stack.push(8);
        System.out.println("pop called: " + stack.pop()); // 8
        System.out.println("size: " + stack.size()); // 0
        System.out.println("pop called: " + stack.pop()); // null
        System.out.println("Push   new finish");

        stack.push("X");
        System.out.println("Last value(peek): " + stack.peek());
        stack.push("Y");
        stack.push("Z");
        stack.push("Y");
        ((ArrayStack) stack).showStack();
        System.out.println("Y is present: " + stack.contains("Y"));
        System.out.println("F is present: " + stack.contains("F"));
        System.out.println("Y removed: " + stack.remove("Y"));
        System.out.println("F removed: " + stack.remove("F"));
        System.out.println("size: " + stack.size()); // 0
        ((ArrayStack) stack).showStack();
        System.out.println("pop called: " + stack.pop());


    }
}
