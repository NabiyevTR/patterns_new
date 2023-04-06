package patterns.prototype;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
public class Coords {
    private double x;
    private double y;

    private Coords(Coords coords) {
        if (coords != null) {
            this.x = coords.x;
            this.y = coords.y;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coords coords = (Coords) o;
        return Double.compare(coords.x, x) == 0 && Double.compare(coords.y, y) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

}


