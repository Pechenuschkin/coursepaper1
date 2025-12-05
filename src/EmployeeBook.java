import java.util.Objects;

// 7. Создаём класс EmployeeBook
public class EmployeeBook {
    static public Employee[] employees = new Employee[10];

    // Ищем свободные ячейки и добавляем сотрудников.
    public static boolean fillingArray(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                return true;
            }
        }
        return false;
    }

    // Выводим список сотрудников со всеми данными с помощью массива.
    public static void listAllEmployees() {
        for (Employee e : employees) {
            if (e != null) {
                System.out.println(e);
            }
        }
    }

    // Среднее значение зарплат.
    public static void averageSalaryValue() {
        int averageSum = 0;
        int numberEmployees = 0;
        for (Employee e : employees) {
            if (e != null) {
                averageSum += e.getSalary();
                numberEmployees++;
            }
        }
        System.out.println(averageSum / numberEmployees);
    }

    // Вывод только имени и зарплаты.
    public static void printShortInfo(Employee employee) {
        System.out.println("Ф.И.О.-" + employee.getFullName() + " " + "Зарплата" + " " + employee.getSalary());
    }

    // Выводим значение налогов.
    public static void calculationTaxes(String taxes) {
        double t;
        switch (taxes) {
            case "PROPORTIONAL":
                for (Employee e : employees) {
                    if (e != null) {
                        t = e.getSalary() * 0.13;
                        System.out.println(t);
                    }
                }
                break;
            case "PROGRESSIVE":
                for (Employee e : employees) {
                    if (e != null && e.getSalary() <= 150 && e.getSalary() > 0) {
                        t = e.getSalary() * 0.13;
                        System.out.println(t);
                    } else if (e != null && e.getSalary() > 150 && e.getSalary() <= 350) {
                        t = e.getSalary() * 0.17;
                        System.out.println(t);
                    } else {
                        t = e.getSalary() * 0.21;
                        System.out.println(t);
                    }
                }
                break;
            default:
                System.out.println("Такой схемы расчётов нет.");
        }
    }

    // Индексация зарплаты по отделам.
    public static void indexSalary(int dep, double percent) {
        double salary1;
        for (Employee e : employees) {
            if (e != null && dep == e.getDepartment()) {
                salary1 = e.getSalary() * percent;
            } else {
                continue;
            }
            System.out.println("Отдел #" + " " + e.getDepartment() + ", " + "Индексация зарплаты" + " " + salary1);
        }
    }

    // Находим сотрудника по отделу с зарплатой больше установленной и выводим первого сотрудника этого отдела.
    public static void maxSalaryInDept(int dep1, int maxSalary) {
        for (Employee e : employees) {
            if (e != null && dep1 == e.getDepartment() && e.getSalary() > maxSalary) {
                printShortInfo(e);
                break;
            }
        }
    }

    // Находим сотрудников с зарплатой меньше установленной и выводим первых 3 сотрудников.
    public static void printEmployeesWithSalaryLess(int wage, int employeeNumber) {
        int i = 0;
        int counter = 1;
        while (i < employees.length) {
            i++;
            if (employees[i - 1] != null && employees[i - 1].getSalary() < wage && employeeNumber >= counter) {
                System.out.println(employees[i - 1]);
                counter++;
            } else if (employees.length - 1 == i) {
                break;
            }
        }
    }

    // Ищем сотрудника по зарплате.
    public static void lookingSalaryEmployee(int lookingSalary) {
        for (Employee e : employees) {
            if (e == null) {
                break;
            } else {
                System.out.println(Objects.equals(lookingSalary, e.getSalary()));
            }
        }
    }

    // Ищем сотрудника по id.
    public static void searchingById(int id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                System.out.println("Такого id нет");
                break;
            } else if (employees[i].getId() == id) {
                System.out.println(employees[i]);
                break;
            }

        }
    }
}