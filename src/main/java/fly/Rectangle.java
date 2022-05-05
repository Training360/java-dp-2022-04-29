package fly;

import java.util.HashMap;
import java.util.Map;

public final class Rectangle {

    private final int a;

    private final int b;

    private static final Map<Rectangle, Rectangle> values = new HashMap<>();

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public static Rectangle getInstance(int a, int b) {
        Rectangle rectangle = new Rectangle(a, b);
        Rectangle stored = values.get(rectangle);
        if (stored == null) {
            values.put(rectangle, rectangle);
            return rectangle;
        }
        else {
            return stored;
        }
    }

    public static void main(String[] args) {
        System.out.println(Rectangle.getInstance(10, 20)
                == Rectangle.getInstance(10, 20));
    }

    public int getA() {
        return this.a;
    }

    public int getB() {
        return this.b;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Rectangle)) return false;
        final Rectangle other = (Rectangle) o;
        if (this.getA() != other.getA()) return false;
        if (this.getB() != other.getB()) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + this.getA();
        result = result * PRIME + this.getB();
        return result;
    }

    public String toString() {
        return "Rectangle(a=" + this.getA() + ", b=" + this.getB() + ")";
    }
}
