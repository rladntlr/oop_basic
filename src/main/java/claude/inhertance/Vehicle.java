/*
아래 코드에서 잘못된 부분을 찾아서 고쳐봐.
public class Vehicle {
    public String brand;

    public void move() {
        System.out.println("이동한다");
    }
}

public class Car extends Vehicle {
    public void move() {
        System.out.println("자동차가 이동한다");
    }
}

public class Knife extends Vehicle {
    public void move() {
        System.out.println("칼이 이동한다");
    }
}
 */
package claude.inhertance;

public class Vehicle {
    private String brand;

    public void move() {
        System.out.println("이동한다");
    }
}

public class Car extends Vehicle {


    @Override
    public void move() {
        System.out.println("자동차가 이동한다");
    }
}

public class Knife extends Vehicle {


    @Override
    public void move() {
        System.out.println("칼이 이동한다");
    }
}