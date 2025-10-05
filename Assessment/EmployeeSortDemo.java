package assesment;

    import java.util.*;
    class Employee {
        private int id;
        private String name;
        private double salary;
        public Employee(int id, String name, double salary) {
            this.id = id;
            this.name = name;
            this.salary = salary;
        }
        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public double getSalary() {
            return salary;
        }
        @Override
        public String toString() {
            return "Employee{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", salary=" + salary +
                    '}';
        }
    }
    public class EmployeeSortDemo {
        public static void main(String[] args) {
            List<Employee> employees = new ArrayList<>();
            employees.add(new Employee(101, "suji", 55000));
            employees.add(new Employee(102, "meena", 45000));
            employees.add(new Employee(103, "latha", 70000));
            employees.add(new Employee(104, "meghana", 50000));

            System.out.println("Before Sorting (Original List):");
            employees.forEach(System.out::println);
            employees.sort(Comparator.comparingDouble(Employee::getSalary));

            System.out.println("\nAfter Sorting by Salary (Ascending):");
            employees.forEach(System.out::println);
            employees.sort(Comparator.comparingDouble(Employee::getSalary).reversed());

            System.out.println("\nAfter Sorting by Salary (Descending):");
            employees.forEach(System.out::println);
        }
    }

