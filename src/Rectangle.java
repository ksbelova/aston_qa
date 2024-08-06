class Rectangle implements Shapes {
    private double width;
    private double height;
    private String fillColor;
    private String borderColor;

    public Rectangle (double width, double height, String fillColor, String borderColor) {
        this.width = width;
        this.height = height;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    public double getPerimeter() {
        return 2 * (width + height);
        //return calculateRectanglePerimeter (width, height);
    }

    public double getSquare() {
        return width * height;
        //return calculateRectangleSquare (width, height);
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
