package pr4_3;

public class BookTester {
    public static void main(String[] args) {
        // Создание объекта книги
        Book book = new Book("Автор", "Название книги", 2023);

        // Получение свойств книги
        System.out.println("Автор: " + book.getAuthor());
        System.out.println("Название: " + book.getTitle());
        System.out.println("Год написания: " + book.getYear());

        // Изменение свойств книги
        book.setAuthor("Новый автор");
        book.setTitle("Новое название книги");
        book.setYear(2024);

        // Проверка измененных свойств
        System.out.println("Новый автор: " + book.getAuthor());
        System.out.println("Новое название: " + book.getTitle());
        System.out.println("Новый год написания: " + book.getYear());
    }
}