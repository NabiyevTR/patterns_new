package patterns.prototype;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(10, 10, 15);
        Circle clonedCircle = (Circle) circle.clone();
        System.out.println("Equals: " + circle.equals(clonedCircle));
        clonedCircle.setRadius(1);
        System.out.println("Equals: " + circle.equals(clonedCircle));
    }
}
