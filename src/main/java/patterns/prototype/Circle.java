package patterns.prototype;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class Circle extends Shape {

    private double radius;

    public Circle(double x, double y, double radius) {
        super(new Coords(x, y));
        this.radius = radius;
    }

    public Circle(Circle circle) {
        super(circle);
        if (circle != null) {
            this.radius = circle.getRadius();
        }
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }
}
