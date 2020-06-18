package KindOfAcceses;
// В этом классе определяется целочисленный стеек, который может
// содержать 10 значений
class Stack {
    /* Теперь переменные stck и tos являются закрытыми.
       Это означает, что они не могут быть случайно или
       намеренно изменены таким образом, чтобы нарушить стек.
     */
    private int[] stck = new int [10];
    private int tos;


    // инициализировать вершину стека
    Stack() {
        tos = -1;
    }

    // разместить элемент в стеке
    void push(int item) {
        if (tos == 9)
            System.out.println("Стек заполнен");
        else
            stck[++tos] = item;
    }

    // извлечь элемент из стека
    int pop() {
        if (tos < 0) {
            System.out.println("Стек загружен");
            return 0;
        } else
            return stck[tos--];
        }
}

class TestStack {
    public static void main(String[] args) {
        Stack mystack1 = new Stack();
        Stack mystack2 = new Stack();

        // разместить числа в стеке
        for(int i = 0; i < 10; i++)
            mystack1.push(i);
        for (int i = 10; i < 20; i++)
            mystack2.push(i);

        // Извлечь эти числа из стека
        System.out.println("Стек в mystack1:");
        for(int i = 0; i < 10; i++)
            System.out.println(mystack1.pop());
        System.out.println("Стек в mystack2:");
        for(int i = 10; i < 20; i++)
            System.out.println(mystack2.pop());

        // эти оператор недопустимы
        // mystack1.tos = -2;
        // mystack2.stck[3] = 100;
    }
}
