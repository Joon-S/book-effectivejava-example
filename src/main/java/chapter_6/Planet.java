package chapter_6;

public enum Planet {
    MERCURY(3.3, 2.4),
    VENUS(4.8, 6.0);

    private final double mass;
    private final double radius;
    private final double surfaceGravity;

    private static final double G = 6.6;

    Planet(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
        surfaceGravity = G * mass / (radius * radius);
    }

    public double mass() { return  mass; }
    public double radius() { return radius; }
    public double surfaceGravity() { return surfaceGravity; }

    public double surfaceWeight(double mass) {
        return mass * surfaceGravity;
    }
}
