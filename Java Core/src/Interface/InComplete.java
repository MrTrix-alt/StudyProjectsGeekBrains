package Interface;

abstract class InComplete implements CallBack {
    int a, b;
    void show() {
        System.out.println(a + " " + b);
    }
    /** Этот класс включает себя интерфейс,
     *  но не полностью его реализиует определенные в нем
     *  методы, следовательно, объявить его нужно как abstract,
     *  Любой класс, наследующийся от класса InComplete, должен
     *  реализовать метод callback(), который определен  интерфейсе,
     *  или должен быть также объявленным как abstract.
     */
}
