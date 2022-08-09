public class Starter {
    public static void main(String[] args) {
        IntegerStack integerStack = new IntegerStack();
        integerStack.push(10);
        integerStack.push(20);
        integerStack.push(2);
        integerStack.push(0);
        integerStack.push(3);
        integerStack.push(-1);
        integerStack.push(4);
        integerStack.push(-6);
        System.out.println("MIN-" + integerStack.getMin());
        System.out.println("POP-" + integerStack.pop());
        System.out.println("POP-" + integerStack.pop());
        System.out.println("MIN-" + integerStack.getMin());
        System.out.println("POP-" + integerStack.pop());
        System.out.println("POP-" + integerStack.pop());
        System.out.println("MIN-" + integerStack.getMin());
        System.out.println("POP-" + integerStack.pop());
        System.out.println("MIN-" + integerStack.getMin());
        System.out.println("POP-" + integerStack.pop());
        System.out.println("POP-" + integerStack.pop());
        System.out.println("MIN-" + integerStack.getMin());
        System.out.println("POP-" + integerStack.pop());
    }
}
