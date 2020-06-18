package Polymorphism.KeyFinal;

// предотвращение переопределения с помощью
// ключевого слова final
class Fig {
    final void meth() {
        System.out.println("Это завершенный метод");
    }
}
class Sig extends Fig {
   // void meth() { // Ошибка! Этот метод не может быть переопределен!
        // System.out.println("НЕДОПУСТИМО!");
    }

