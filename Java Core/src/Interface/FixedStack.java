package Interface;

// Реализация интерфейса IntStack
// для стека фиксированного размера

public class FixedStack implements IntStack {
    private int[] stck;
    private int tos;

    // Выделить память и инициализировать стек
    FixedStack(int size) {
        stck = new int[size];
        tos = -1;
    }

    // разместить элемент в стеке
    public void push(int item) {
        if (tos == stck.length - 1) // использовать поле длины стека
            System.out.println("Стек заполнен.");
        else
            stck[++tos] = item;
    }

    // извлечь элемент из стека
    public int pop() {
        if (tos < 0) {
            System.out.println("Стек не загружен.");
            return 0;
        }
        else
            return stck[tos--];
    }
}

class IFTest {
    public static void main(String[] args) {
        FixedStack stack1 = new FixedStack(5);
        FixedStack stack2 = new FixedStack(8);
        // разместить числа в стеке
        for(int i = 0; i < 5; i++)
        stack1.push(i);
        for(int i = 0; i < 8; i++)
        stack2.push(i);

        // излечь эти числа в стеке
        System.out.println("Стек в stack1:");
        for(int i = 0; i < 5; i++)
            System.out.println(stack1.pop());
        System.out.println("Стек в stack2:");
        for(int i = 0; i < 8; i++)
            System.out.println(stack2.pop());
    }
}



