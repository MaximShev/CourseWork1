import java.util.Arrays;
import java.util.Objects;

public class Main {
    private static final Employee[] employees = {
    new Employee("Королёв Овидий Ильяович", 1, 30000),
    new Employee("Шилов Тихон Рубенович", 2, 37000),
    new Employee("Кабанова Лана Аркадьевна", 3, 34300),
    new Employee("Князева Мирра Мироновна", 4, 31720),
    new Employee("Муравьёв Антон Рубенович", 5, 32486),
    new Employee("Давыдов Степан Валентинович", 3, 35416),
    new Employee("Степанова Рамина Георгьевна", 1, 32498),
    new Employee("Евдокимова Марина Ивановна", 2, 35435),
    new Employee("Михайлова Хильда Антониновна", 4, 34835),
    new Employee("Козлов Самуил Михаилович", 5, 34652)
    };
    public static void main(String[] args) {
    print();
    System.out.println(sumSalary());
    System.out.println(employeeWithMinSalary());
    System.out.println(employeeWithMaxSalary());
    System.out.println(averageSumSalary());
    printFullNames();
    }
    public static void print() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
    private static int sumSalary() {
        int sum = 0;
        for (Employee employee : employees) {
        sum = employee.getSalary() + sum;
        }
        return sum;
    }
    private static Employee employeeWithMinSalary() {
        Employee result = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() < result.getSalary()) {
                result = employee;
            }
        }
        return result;
    }
    private static Employee employeeWithMaxSalary() {
        Employee result = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() > result.getSalary()) {
                result = employee;
            }
        }
        return result;
    }
    private static float averageSumSalary () {
        return (float) sumSalary() / employees.length;
    }
    private static void printFullNames () {
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
    }
}