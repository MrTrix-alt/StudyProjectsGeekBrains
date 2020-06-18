package Interface;
/* Создать переменную интерфейса и
   обратиться к стекам через нее.
 */
class IFTEST3 {
    public static void main(String[] args) {
        IntStack stack; // создать переменную ссылка на интерфейс
        FixedStack fs = new FixedStack(8);
        DynStack ds = new DynStack(5);

        stack = ds; // загрузить динамический стек
        // разместить числа в стеке
        for(int i = 0; i < 12; i++)
            stack.push(i);

        stack = fs; // загрузить фиксированный стек
        for(int i = 0; i < 8; i++)
            stack.push(i);

        // Извлечь значения из обоих стеков
        stack = ds;
        System.out.println("Значения в динамеческом стеке:");
        for(int i = 0; i < 12; i++)
            System.out.println(stack.pop());
        stack = fs;
        System.out.println("Значения в фиксированном стеке");
        for(int i = 0; i < 8; i++)
            System.out.println(stack.pop());
    }
}
