import java.util.*;

public class App
{
    public static void main(String[] args)
    {
        var circle = new Circle(0,0,1);
        var rectangle = new Rectangle(0,1,2,3);

        ArrayList shapes = new ArrayList(10);
        shapes.add(circle);
        shapes.add(rectangle);

        DisplayAreas(shapes);

    }

    static void DisplayAreas(ArrayList shapes)
    {
        for(var shape : shapes)
        {
            if (shape instanceof Circle)
            {
                System.out.println("Circle area: " + ComputeAreaForCircle((Circle)shape));
            }

            if (shape instanceof Rectangle)
            {
                System.out.println("Rectangle area: " + ComputeAreaForRectangle((Rectangle)shape));
            }
                
        }
    }

    private static long ComputeAreaForCircle(Circle circle)
    {
        return 123;
    }

    private static long ComputeAreaForRectangle(Rectangle shape) 
    {
       return 234;
    }

}