public interface Shapes {
    double getPerimeter ();
    double getSquare ();
    String getFillColor ();
    String getBorderColor ();

    void setFillColor (String color);
    void setBorderColor (String color);

    default double calculateCirclePerimeter (double radius) {
        return 2 * Math.PI * radius;
    }
    default double calculateCircleSquare (double radius) {
        return Math.PI * radius * radius;
    }

    default double calculateRectanglePerimeter (double width, double height) {
        return 2 * (width + height);
    }
    default double calculateRectangleSquare (double width, double height) {
        return width * height;
    }

    default double calculateTrianglePerimeter (double side) {
        return 3 * side;
    }
    default double calculateTriangleSquare (double side) {
        return (Math.sqrt(3) / 4) * side * side;
    }
}
