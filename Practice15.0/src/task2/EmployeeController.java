package task2;
public class EmployeeController {
    private Employee model;
    private EmployeeView view;

    public EmployeeController(Employee model, EmployeeView view) {
        this.model = model;
        this.view = view;
    }

    public void setEmployeeName(String name) {
        model.setName(name);
    }

    public String getEmployeeName() {
        return model.getName();
    }

    public void setHourlyRate(double hourlyRate) {
        model.setHourlyRate(hourlyRate);
    }

    public double getHourlyRate() {
        return model.getHourlyRate();
    }

    public void setHoursWorked(int hoursWorked) {
        model.setHoursWorked(hoursWorked);
    }

    public int getHoursWorked() {
        return model.getHoursWorked();
    }

    public void updateView() {
        view.printEmployeeDetails(model.getName(), model.calculateSalary());
    }
}