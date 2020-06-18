import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<String> favoriteBooks = new ArrayList<>();
        favoriteBooks.add("1984");
        favoriteBooks.add("The Fatal Eggs");
        favoriteBooks.add("War and Peace");

        Man man = new Man("Alexey", 20, favoriteBooks);
        System.out.println("Оригинальный объект: " + man.getName() + " " + man.getAge() + " " + man.getFavoriteBooks());


        // Создание копии через конструктор
        // Для сравнения вводим те же аргументы, что и для оригинала, передавая объект man
        Man copy = new Man(man);
        System.out.println("Копия №1 с данными объекта man: " + copy.getName() + " " + copy.getAge() + " years" +
                " " + copy.getFavoriteBooks());
        // сравнение этих объектов
        System.out.println("Равенство объектов: " + copy.equals(man));

        // создание копии с другими данными
        List<String> favoriteBooksCopy = new ArrayList<>();
        favoriteBooksCopy.add("Судьба человека");
        favoriteBooksCopy.add("Мастер и Маргаритa");
        favoriteBooksCopy.add("Три товарища");
        copy.deepCopy("Jiro", 23, favoriteBooksCopy);
        System.out.println("Копия №2 " + copy.getName() + " " + copy.getAge() + " years"
                + " " + copy.getFavoriteBooks());

        // сравнение объектов
        System.out.println("Равенство объектов: " + copy.equals(man));

        // данные у оригинала не изменились
        System.out.println("Оригинальный объект man не изменился: " + man.getName() + " " + man.getAge() + " years"
                + " " + man.getFavoriteBooks());

        Man copyTwo = new Man(copy);
        copyTwo.deepCopy("Felix", 24, favoriteBooksCopy);
        System.out.println("Копия №3: " + copyTwo.getName() + " " + copyTwo.getAge() + " years"
                + " " + copyTwo.getFavoriteBooks());
        System.out.println("Равенство объектов: " + copyTwo.equals(copy));

    }
}
