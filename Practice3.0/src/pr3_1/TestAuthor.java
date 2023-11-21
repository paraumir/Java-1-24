package pr3_1;

public class TestAuthor {
    public static void main(String[] args) {
        // Создаем объект Author
        Author author = new Author("John Doe", "johndoe@gmail.com", 'M');

        // Выводим информацию об авторе
        System.out.println("Информация об авторе:");
        System.out.println(author);

        // Изменяем электронную почту автора
        author.setEmail("john.doe@gmail.com");

        // Выводим обновленную информацию об авторе
        System.out.println("Обновленная информация об авторе:");
        System.out.println(author);
    }
}
