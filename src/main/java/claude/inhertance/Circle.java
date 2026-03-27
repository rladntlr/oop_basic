package claude.inhertance;

public class Circle extends Shape {

    public Circle(String color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("원형을 그린다");
    }
}
