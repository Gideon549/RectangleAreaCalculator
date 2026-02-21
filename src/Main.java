public class Main{
    public static double calculateArea(double length, double width){
        return length * width;
    }
    public static void main(String[] args){
        double length = 5.0;
        double width = 3.0;
System.out.println("Area of the rectangle: " + calculateArea(length, width));
    }
}