package patterns.prototype;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
public abstract class Shape {
    private Coords coord;

    public Shape(Shape shape) {
        if (shape != null) {
            this.coord = shape.coord;
        }
    }
    public abstract Shape clone();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shape shape = (Shape) o;
        return Objects.equals(coord, shape.coord);
    }

    @Override
    public int hashCode() {
        return Objects.hash(coord);
    }
}
