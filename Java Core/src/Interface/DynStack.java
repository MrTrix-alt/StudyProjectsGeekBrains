package Interface;

class DynStack implements IntStack {
    private int[] stck;
    private int tos;

    DynStack(int size) {
        stck = new int[size];
        tos = -1;
    }

    public void push(int item) {
        // если стек заполнен,
        // выделить память под стек большего размера
        if(tos == stck.length - 1) {
            int temp[] = new int[stck.length * 2]; // удвоить размер стека
            for(int i = 0; i < stck.length; i++)
                temp[i] = stck[i];
            stck = temp;
            stck[++tos] = item;
        }
        else
            stck[++tos] = item;
    }

    public int pop() {
        if (tos < 0) {
            System.out.println("Стек");
            return 0;
        }
        else
            return stck[tos--];
    }
}

class IFTest2 {
    public static void main(String[] args) {
        DynStack stack1 = new DynStack(5);
        DynStack stack2 = new DynStack(8);

        // В этих циклах увеличиваются размеры каждого стека
        for(int i = 0; i < 12; i++)
            stack1.push(i);
        for(int i = 0; i < 20; i++)
            stack2.push(i);

        System.out.println("Стек в stack1:");
        for(int i = 0; i < 12; i++)
            System.out.println(stack1.pop());
        System.out.println("Стек в stack2");
        for(int i = 0; i < 20; i++)
            System.out.println(stack2.pop());
    }
}