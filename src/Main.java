import java.util.Objects;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
// Сотрудники.
        Employee name1 = new Employee("Перумов Н. Д.", 1, 450);
        Employee name2 = new Employee("Пехов А. Ю.", 3, 400);
        Employee name3 = new Employee("Семёнова М. В.", 2, 300);
        Employee name4 = new Employee("Никитин И. С.", 3, 440);
        Employee name5 = new Employee("Булгаков М. А.", 5, 350);
        Employee name6 = new Employee("Лавкрафт Г. Ф.", 4, 370);
        Employee name7 = new Employee("Кинг С. Э.", 5, 430);
// Заполняем массив.
        System.out.println("Заполняем массив.");
        EmployeeBook.fillingArray(name1);
        EmployeeBook.fillingArray(name2);
        EmployeeBook.fillingArray(name3);
        EmployeeBook.fillingArray(name4);
        EmployeeBook.fillingArray(name5);
        EmployeeBook.fillingArray(name6);
        EmployeeBook.fillingArray(name7);
        // Выводим список сотрудников со всеми данными с помощью массива.
        System.out.println("Выводим список сотрудников со всеми данными с помощью массива.");
        EmployeeBook.listAllEmployees();
        System.out.println();
        // Добавляем новых сотрудников.
        System.out.println("Добавляем новых сотрудников.");
        Employee newName1 = new Employee("Толстой Л. Н.", 1, 500);
        Employee newName2 = new Employee("Достоевский Ф. М.", 2, 480);
        Employee newName3 = new Employee("Пушкин А. С.", 3, 490);
        Employee newName4 = new Employee("Есенин С. А.", 4, 470);
        System.out.println("Сотрудник добавлен" + " " + EmployeeBook.fillingArray(newName1));
        System.out.println("Сотрудник добавлен" + " " + EmployeeBook.fillingArray(newName2));
        System.out.println("Сотрудник добавлен" + " " + EmployeeBook.fillingArray(newName3));
        System.out.println("Сотрудник добавлен" + " " + EmployeeBook.fillingArray(newName4));
        System.out.println();
        System.out.println("Выводим список всех сотрудников");
        EmployeeBook.listAllEmployees();
        System.out.println();
        // Вывод только имени и зарплаты.
        System.out.println("Вывод только имени и зарплаты.");
        Employee nameSalary = name3;
        EmployeeBook.printShortInfo(nameSalary);
        System.out.println();
        // Среднее значение зарплат.
        System.out.println("Среднее значение зарплат.");
        EmployeeBook.averageSalaryValue();
        System.out.println();
        // Выводим значение налогов.
        System.out.println("Выводим значение налогов.");
        String taxes = "PROGRESSIVE";
        EmployeeBook.calculationTaxes(taxes);
        System.out.println();
// Индексация зарплаты по отделам.
        System.out.println("Индексация зарплаты по отделам.");
        int dep = 5;
        double indexation = 1.15;
        EmployeeBook.indexSalary(dep, indexation);
        System.out.println();
// Находим сотрудника по отделу с зарплатой больше установленной и выводим первого сотрудника этого отдела.
        System.out.println("Находим сотрудника по отделу с зарплатой больше установленной и выводим первого сотрудника этого отдела.");
        int maxSalary = 300;
        int dep1 = 5;
        EmployeeBook.maxSalaryInDept(dep1, maxSalary);
        System.out.println();
        // Находим сотрудников с зарплатой меньше установленной и выводим первых 3 сотрудников.
        System.out.println("Находим сотрудников с зарплатой меньше установленной и выводим первых 3 сотрудников.");
        int wage = 390;
        int employeeNumber = 3;
        EmployeeBook.printEmployeesWithSalaryLess(wage, employeeNumber);
        System.out.println();
        // Ищем сотрудника по зарплате.
        System.out.println("Ищем сотрудника по зарплате.");
        int lookingSalary = 350;
        EmployeeBook.lookingSalaryEmployee(lookingSalary);
        System.out.println();
//Ищем сотрудника по id.
        System.out.println("Ищем сотрудника по id.");
        int id = 7;
        EmployeeBook.searchingById(id);

    }
}







