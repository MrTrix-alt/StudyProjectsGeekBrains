package ClassesAndMethodes;

class Recursion {
    // Рекурсия - процесс определения чего-либо относительно самого себя
    // Она позволяет методу вызывать самого себя. Такой метод
    // называется рекурсивным.

    int factorial(int n) { // это рекурсивный метод
        int result;
        System.out.println(n);
        if (n == 1)
            return 1;
        result = factorial(n - 1)  * n; // в этом месте он вызывает самого себя
        System.out.println(result);
        return result;
    }
}

class RecursionExample {
    public static void main(String[] args) {
        Recursion f = new Recursion();

        System.out.println("Факториал 1 равен " + f.factorial(1));
        System.out.println("Факториал 2 равен " + f.factorial(2));
        System.out.println("Факториал 3 равен " + f.factorial(3));
        System.out.println("Факториал 4 равен " + f.factorial(4));
        System.out.println("Факториал 5 равен " + f.factorial(5));
    }
}
