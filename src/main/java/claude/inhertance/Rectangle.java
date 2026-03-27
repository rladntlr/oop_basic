package claude.inhertance;

public class Rectangle extends Shape {

    public Rectangle(String color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("사각형을 그린다");
    }
}
