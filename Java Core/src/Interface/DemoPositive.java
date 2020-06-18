package Interface;

public class DemoPositive implements NewInter.G {

    public boolean isNotPositive(int x) {
        return x > 0 ? true : false;
    }
}

class TestDemo{
    public static void main(String[] args) {
        NewInter.G ob = new DemoPositive();
        if(ob.isNotPositive(10))
            System.out.println("Это сообщение будет выведено");
        if(ob.isNotPositive(-5))
            System.out.println("Это сообщение не будет выведено");




    }
}
