public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("circle", 15);
        Triangle triangle = new Triangle("triangle", 12, 45, 67);
        Square square = new Square("square", 65);
        Rectangle rectangle = new Rectangle("rectangle", 23, 34);
        Dog dog = new Dog("dog");
        dog.callSound();
        Cat cat = new Cat("cat");

        Drowable[] drawables = {circle, square, triangle, rectangle, cat, dog};
        for (int i = 0; i < drawables.length; i++) {
            if (drawables[i] instanceof Figure) {
                System.out.println(
                        ((Figure) drawables[i]).getName() + "Perimeter: " +
                                ((Figure) drawables[i]).calculatePerimeter());
            }
            if (drawables[i] instanceof Animal) {
                ((Animal) drawables[i]).getName();
            }
            drawables[i].draw();
        }
    }
}
