package Exceptions.TryCatch;
/* Эта программа содержит ошибку.

   В последовательности операторов catch подкласс исключений,
   должен быть указан перед его суперклассмо, иначе это приведет
   к недостижимому коду и ошибке во время компиляции.
 */
public class SuperSubCatch {
    public static void main(String[] args) {
        try {
            int a = 0;
            int b = 42 / a;
        } catch (Exception e) {
            System.out.println("Перехват исключений общего класса Exception " + e);
       // }
        /* Этот оператор catch вообще не будет достигнут, т.к.
           подкласс ArithmeticException является производным
           от класс Exception.
         */
      //  catch (ArithmeticException e) { // ОШИБКА! НЕДОСТИЖИМЫЙ КОД!
            // System.out.println("Этот код вообще не достижим");
        }

    }
}
