/** Q18: Shape Hierarchy — Parent Reference Array */
public class ShapeMain {
    static class Shape {
        protected String name;

        Shape(String name) {
            this.name = name;
        }

        void displayShapeName() {
            System.out.println("Shape: " + name);
        }
    }

    static class Circle extends Shape {
        private double radius;

        Circle(String name, double radius) {
            super(name);
            this.radius = radius;
        }

        double calculateArea() {
            return 3.14159 * radius * radius;
        }
    }

    static class Rectangle extends Shape {
        private double length;
        private double width;

        Rectangle(String name, double length, double width) {
            super(name);
            this.length = length;
            this.width = width;
        }

        double calculateArea() {
            return length * width;
        }
    }

    static class ShapeManager {
        void displayAreas(Shape[] shapes) {
            for (int i = 0; i < shapes.length; i++) {
                Shape shape = shapes[i];
                shape.displayShapeName();
                if (shape instanceof Circle) {
                    Circle circle = (Circle) shape;
                    System.out.println("Area: " + circle.calculateArea());
                } else if (shape instanceof Rectangle) {
                    Rectangle rectangle = (Rectangle) shape;
                    System.out.println("Area: " + rectangle.calculateArea());
                }
            }
        }
    }

    public static void main(String[] args) {
        Shape[] shapes = {
            new Circle("Circle", 7),
            new Rectangle("Rectangle", 8, 5)
        };

        ShapeManager manager = new ShapeManager();
        manager.displayAreas(shapes);
    }
}
