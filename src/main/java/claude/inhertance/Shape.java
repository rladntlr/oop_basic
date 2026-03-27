/*
상속 문제
문제 1
Shape 라는 부모 클래스를 만들고, Circle 과 Rectangle 이 상속받아.
조건은 이거야.

Shape 는 color 필드를 가짐 (캡슐화 적용)
Shape 는 draw() 메서드를 가짐 — "도형을 그린다" 출력
Circle 은 draw() 를 오버라이딩 — "원을 그린다" 출력
Rectangle 은 draw() 를 오버라이딩 — "사각형을 그린다" 출력
각 자식 클래스는 생성자에서 super() 로 부모 생성자 호출


 */
package claude.inhertance;

public class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }
    public void draw() {
        System.out.println("도형을 그린다");
    }
}
