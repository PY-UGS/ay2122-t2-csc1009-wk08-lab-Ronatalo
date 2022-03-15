import static java.lang.Math.*;
import java.util.Scanner;

public class CircleWithException{

    private double radius;

    public CircleWithException(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return PI * pow(radius, 2);
    }

    public double getDiameter(){
        return radius * 2;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        try{
            System.out.print("Radius of circle: ");
            double radius = input.nextDouble();
            CircleWithException circle = new CircleWithException(radius);
            double diameter = circle.getDiameter();
            double area = circle.getArea();
            input.close();

            if (radius <= 0){
                throw new IllegalArgumentException();
            }

            if (area > 1000){
                throw new Exception();
            }

            System.out.println("Area: " + diameter);
            System.out.println("Diameter: " + area);
        } 
        
        catch (IllegalArgumentException e){
            System.out.println("Error: The radius is not a positive number.");
        }
        
        catch (Exception e){
            System.out.println("Error: The area of the circle is bigger than 1000.");
        }
    }
}
