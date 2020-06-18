package Exceptions.TryCatch;
// В этой программе изменена последовательность
// операторов catch, которая была ошибочной
// в классе SuperSubCatch
public class SuperSubCatch1 {
    public static void main(String[] args) {
        try {
            int a = 0;
            int b = 42 / a;
        } catch (ArithmeticException e) {
            System.out.println("Перехват исключения: " + e);
        }
        catch (Exception e) { // ОШИБКА! НЕДОСТИЖИМЫЙ КОД!
            System.out.println("Этот код вообще не достижим");
        }


    }
}

