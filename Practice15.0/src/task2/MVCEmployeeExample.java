package task2;

public class MVCEmployeeExample {
    public static void main(String[] args) {
        // Создаем модель, представление и контроллер
        Employee model = new Employee("John Doe", 20.0, 40);
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController(model, view);

        // Обновляем и отображаем детали сотрудника
        controller.updateView();

        // Изменяем данные сотрудника и снова отображаем детали
        controller.setHourlyRate(25.0);
        controller.setHoursWorked(50);
        controller.updateView();
    }

}