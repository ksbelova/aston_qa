class Triangle implements Shapes {
    private double side;
    private String fillColor;
    private String borderColor;

    public Triangle (double side, String fillColor, String borderColor) {
        this.side = side;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    public double getPerimeter() {
        return 3 * side;
        //return calculateTrianglePerimeter (side);
    }

    public double getSquare() {
        return (Math.sqrt(3) / 4) * side * side;
        //return calculateTriangleSquare (side);
    }

    public String getFillColor() {
        return fillColor;
    }

    public String getBorderColor() {
        return borderColor;
    }

    public void setFillColor(String color) {
        this.fillColor = color;
    }

    public void setBorderColor(String color) {
        this.borderColor = color;
    }
}
