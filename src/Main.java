public class Main{
    public static double calculateArea(double length, double width){
        return length * width;
    }
    public static void main(String[] args){
        double length = 5.0;
        double width = 3.0;
        System.out.println("Area of the rectangle: " + calculateArea(length, width));
        System.out.printf("Length: %.2f, Width: %.2f, Area: %.2f%n", length, width, calculateArea(length, width));
    }
    public static double calculatePerimeter(double length, double width){
        return 2 * (length + width);
    }
}