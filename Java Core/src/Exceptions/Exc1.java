package Exceptions;

class Exc1 {
    static void subroutine() {
        int d = 0;
        int a = 10 / d;
    }

    public static void main(String[] args) {
        Exc1.subroutine();
    } // В данном случае можно увидеть последовательность
      // методов, которые привели к ошибке.
}
