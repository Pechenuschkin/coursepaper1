import java.util.Objects;

//  Создаём класс Employee.
public class Employee {
    private final String fullName;
    private int department;
    private int salary;
    //  Добавляем статическую переменную счётчик.
    private static int idCounter = 1;
    //  Добавляем поле id.
    private int id;

    public Employee(String fullName, int department, int salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        id = idCounter++;
    }

    //  Создаём геттеры.
    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public int getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

    // Создаём сеттеры.
    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    //  Реализуем вывод информации
    @Override
    public String toString() {
        return "id-" + id + ", " + "Ф.И.О.-" + " " + this.fullName + ", " + "Отдел №" + " " + this.department + ", " + "Зарплата" + " " + this.salary;
    }

    //  Реализуем контракт equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Employee employee = (Employee) o;
        return getSalary() == employee.getSalary();
    }


}
