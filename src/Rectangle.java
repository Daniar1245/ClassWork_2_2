public class Rectangle extends Figure{
    private int length,width;

    public Rectangle(String name, int length, int width) {
        super(name);
        this.length = length;
        this.width = width;
    }
    @Override
    public int calculatePerimeter() {
        return length + width* 2;
    }

    @Override
    public void draw() {
        System.out.println("\uD83D\uDFE9");
    }
}
