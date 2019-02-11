package figuresfx.figures;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import java.util.Objects;

public class Circle extends Figure{

    private double radius;

    private Circle(double cx, double cy, double lineWidth, Color colour) {
        super(Figure.FIGURE_TYPE_CYRCLE, cx, cy, lineWidth, colour);
    }

    public Circle(double cx, double cy, double lineWidth, Color colour, double radius) {
        this(cx, cy, lineWidth, colour);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw(GraphicsContext gc) {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = ( Circle ) o;
        return Double.compare(circle.radius, radius) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(radius);
    }


}
