package EffectiveJava.item4;

class Rectangle implements Shape {
    private final double length;
    private final double height;

    public Rectangle(double length, double height) {
        this.length = length;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return length*height;
    }
}
