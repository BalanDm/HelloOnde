public interface IStack<T extends Comparable<T>> {
    void push(T element);
    T pop();
    T getMin();
}
