package assesment;
    abstract class Shape {
        abstract double area();
        abstract double perimeter();
    }
    class Circle extends Shape {
        private double radius;
        Circle(double radius) {
            this.radius = radius;
        }
        @Override
        double area() {
            return Math.PI * radius * radius;
        }

        @Override
        double perimeter() {
            return 2 * Math.PI * radius;
        }
    }
    class Rectangle extends Shape {
        private double length;
        private double width;
        Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }
        @Override
        double area() {
            return length * width;
        }

        @Override
        double perimeter() {
            return 2 * (length + width);
        }
    }

    public class ShapeDemo {
        public static void main(String[] args) {
            Shape circle = new Circle(5);       // radius = 5
            Shape rectangle = new Rectangle(4, 6); // length = 4, width = 6
            System.out.println("=== Circle ===");
            System.out.println("Area: " + circle.area());
            System.out.println("Perimeter: " + circle.perimeter());
            System.out.println("\n=== Rectangle ===");
            System.out.println("Area: " + rectangle.area());
            System.out.println("Perimeter: " + rectangle.perimeter());
        }
    }


