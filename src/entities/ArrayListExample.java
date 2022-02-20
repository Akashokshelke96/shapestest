package entities;

import java.util.ArrayList;
import java.util.List;

class ArrayListExample {

    // Define the following methods.  No casts allowed!

    // total_area -- takes a list of 2-d shapes and calculates the total
    // area of those shapes
    public static double total_area(List<? extends TwoDShape> list) {
        double area = 0d;
        for (TwoDShape shape : list) {
            area += shape.area();

        }
        return area;
    }

    // total_perimeter -- takes a list of rectangles and calculates the
    // total perimeter
    public static double total_perimeter(List<Rectangle> rectangles){
        double perimeter = 0;
        for (Rectangle rectangle: rectangles) {
            perimeter += rectangle.perimeter();

        }
        return perimeter;
    }

    // describe_all -- takes a list of geometric shapes and invokes the
    // 'describe' method on each of them, then prints out the total number
    // of shapes
    public static void describe_all(List<?> geometricShapes){
         describe_all(geometricShapes);
    }

    // add_empties  -- takes a list of geometric shapes and adds 
    // the following objects to it: 
    //  new entities.Circle(0.0)
    //
    //  new entities.Rectangle(0.0,0.0)
    //  new entities.Sphere(0.0)
    public static void add_empties(List<GeometricShape> geometricShapes){
        geometricShapes.add(new entities.Circle(0.0));
        geometricShapes.add(new entities.Cone(0.0,0.0));
        geometricShapes.add(new entities.Rectangle(0.0,0.0));
        geometricShapes.add(new entities.Sphere(0.0));

    }





    // leave this main method as is:
    public static void main(String[] args) {

        // Make a list of shapes, add a circle, a cone, and some empty 
        // shapes.  Then describe all of the shapes
        System.out.println();
        System.out.print("Example with a list of shapes with a circle, ");
        System.out.println("a cone, and some empty shapes");
        ArrayList<GeometricShape> shapes = new ArrayList<GeometricShape>();
        shapes.add(new Circle(1.0));
        shapes.add(new Cone(2.0, 3.0));
        add_empties(shapes);
        describe_all(shapes);

        // Make a list of rectangles, and add some rectangles.  
        // Describe the rectangles, and calculate the total area 
        // and total perimeter.
        System.out.println();
        System.out.println("Example with a list of rectangles");
        ArrayList<Rectangle> rects = new ArrayList<Rectangle>();
        rects.add(new Rectangle(2.0, 3.0));
        rects.add(new Rectangle(5.0, 5.0));
        describe_all(rects);
        System.out.print("total area of rectangles: ");
        System.out.println(total_area(rects));
        System.out.print("total perimeter of rectangles: ");
        System.out.println(total_perimeter(rects));

        // Make a list of 2-d shapes, and add a rectangle and a circle.
        // Describe the shapes and calculate the total area.
        System.out.println();
        System.out.print("Example with a list of 2d shapes with a circle ");
        System.out.println("and a rectangle");
        ArrayList<TwoDShape> flat_shapes = new ArrayList<TwoDShape>();
        flat_shapes.add(new Rectangle(10.0, 10.0));
        flat_shapes.add(new Circle(2.0));
        describe_all(flat_shapes);
        System.out.print("total area of flat shapes: ");
        System.out.println(total_area(flat_shapes));

        // Make a list of spheres and describe them
        ArrayList<Sphere> spheres = new ArrayList<Sphere>();
        spheres.add(new Sphere(10.0));
        spheres.add(new Sphere(50.0));
        spheres.add(new Sphere(0.0));
        System.out.println();
        System.out.println("Example list of spheres");
        describe_all(spheres);

        // Extra credit part: supersize different kinds of lists of shapes
//         System.out.println();
//         System.out.println("supersizing a list of rectangles");
//         ArrayList<entities.Rectangle> double_rects = supersized_list(rects);
//         describe_all(double_rects);
//         System.out.println();
//         System.out.println("supersizing a list of spheres");
//         ArrayList<entities.Sphere> double_spheres = supersized_list(spheres);
//         describe_all(double_spheres);
    }
}
