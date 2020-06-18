package Interface.DefaultMethod;

interface IntStack {
    void push(int item);
    int pop();

    default String  clear(String g) {
        String c = g;
        return c;
    }
}
