package figuresfx.figures;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public abstract class Figure {
    public static final int FIGURE_TYPE_CYRCLE = 0;
    public static final int FIGURE_TYPE_RECT = 1;
    public static final int FIGURE_TYPE_TRIANGLE = 2;

    private int type;

    protected double cx;
    protected double cy;
    protected double lineWidth;
    protected Color colour;

    public Figure(int type, double cx, double cy, double lineWidth, Color colour) {
        this.type = type;
        this.cx = cx;
        this.cy = cy;
        this.lineWidth = lineWidth;
        this.colour = colour;
    }

    public double getCx() {
        return cx;
    }

    public void setCx(double cx) {
        this.cx = cx;
    }

    public double getCy() {
        return cy;
    }

    public void setCy(double cy) {
        this.cy = cy;
    }

    public double getLineWidth() {
        return lineWidth;
    }

    public void setLineWidth(double lineWidth) {
        this.lineWidth = lineWidth;
    }

    public Color getColour() {
        return colour;
    }

    public void setColour(Color colour) {
        this.colour = colour;
    }

    public int getType() {
        return type;
    }

    public abstract void draw(GraphicsContext gc);
}
