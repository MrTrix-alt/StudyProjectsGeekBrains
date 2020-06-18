package Exceptions.Throws;

// Эта программа содержит ошибку,
// и поэтому она не подлежит компиляции

class ThrowsDemo {
    static void throwOne() throws IllegalAccessException {
        System.out.println("В теле метода throwOne().");
        // throw new IllegalAccessException("демонстрация");
        // ошибочно так оставлять без " throws IllegalAccessException "
        throw new IllegalAccessException("демонстрация");

    }

    public static void main(String[] args) {
        try {
            throwOne();
        } catch (IllegalAccessException e) {
            System.out.println("Перехвачено исключение: " + e);
        }
    }
}

