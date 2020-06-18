package Exceptions.TryCatch;

 class Exc2 {
     public static void main(String[] args) {
         int d, a;
         try { // проконтролировать блок кода
             d = 0;
             a = 42 / d;
             System.out.println("Это не будет выведено."); // не будет выведено в консоль
         } catch (ArithmeticException e) { // перехватить ошибку деления на нуль
             System.out.println("Деление на нуль.");
         }
         System.out.println("После оператора catch.");

     }
}
