package skymap;

public class Planet {
    private String name;
    private double x;
    private double y;
    private double radius;
    private String color;
    private String details;

    public Planet(String name, double x, double y, double radius, String color, String details) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.color = color;
        this.details = details;
    }

    // Getters and setters
    public String getName() { return name; }
    public double getX() { return x; }
    public double getY() { return y; }
    public double getRadius() { return radius; }
    public String getColor() { return color; }
    public String getDetails() { return details; }
}