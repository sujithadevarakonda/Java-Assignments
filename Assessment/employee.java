package assesment;

public class employee {
    public record Employee(int id, String name, double salary) {

        @Override
        public String toString() {
            return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
        }

        public static void main(String[] args) {
            Employee emp = new Employee(1, "Sujitha", 50000.0);
            System.out.println(emp);
        }
    }


    }

