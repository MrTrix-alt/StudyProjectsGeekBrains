package Interface.InheritanceInInterface;

import Interface.A;

interface Alpha {
    void pop();

    default String reset() {
        return "hi";
    }
}

interface Beta  extends Alpha {
    void pop();

    default String  reset() {
        return "hello";
    }
}

class Abc implements Beta {
    public void pop() {
        System.out.println("timur");
    }


}

class Hell {
    public static void main(String[] args) {
        Beta obj = new Abc();
        obj.pop();
        System.out.println(obj.reset());
    }
}
