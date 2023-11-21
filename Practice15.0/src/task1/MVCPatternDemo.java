package task1;

public class MVCPatternDemo {
    public static void main(String[] args) {
        // Получаем студента из базы данных
        Student model = retrieveStudentFromDatabase();

        // Создаем вью и контроллер
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);

        // Обновляем вью
        controller.updateView();

        // Обновляем модель и затем снова обновляем вью
        controller.setStudentName("John");
        controller.updateView();
    }

    private static Student retrieveStudentFromDatabase() {
        // Пример - создаем студента из базы данных
        Student student = new Student();
        student.setName("Bob");
        student.setRollNo("12345");
        return student;
    }
}
