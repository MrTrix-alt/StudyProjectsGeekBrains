package Interface.DefaultMethod;

class StackNew implements IntStack{
    private int[] stck;
    private int tos;

    StackNew(int size) {
        stck = new int[size];
        tos = -1;
    }

    public void push(int item) {
        if(tos == stck.length - 1)
            System.out.println("Стек загружен");
        else
            stck[++tos] = item;
    }

    public int pop() {
        if (tos < 0) {
            System.out.println("Стек не загружен");
            return 0;
        }
        else
            return stck[tos--];
    }


}
class NewStack {
    public static void main(String[] args) {
        StackNew stack = new StackNew(5);

        for(int i = 0; i < 5; i++)
            stack.push(i);
        System.out.println("Стек в stack:");
        for(int i = 0; i < 5; i++)
            System.out.println(stack.pop());

        System.out.println(stack.clear("двенадцать"));


    }
}

