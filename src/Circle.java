class Circle implements Shapes {
        private double radius;
        private String fillColor;
        private String borderColor;

        public Circle (double radius, String fillColor, String borderColor) {
            this.radius = radius;
            this.fillColor = fillColor;
            this.borderColor = borderColor;
        }

        public double getPerimeter() {
            return 2 * Math.PI * radius;
            //return calculateCirclePerimeter (radius);
        }

        public double getSquare() {
            return Math.PI * radius * radius;
            //return calculateCircleSquare (radius);
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

