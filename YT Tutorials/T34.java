public class T34 {
    public static void main(String[] args){
        // Abstract: Logic & Function

        circle Circle = new circle(3);
        rectangle Rectangle = new rectangle(6, 7);
        triangle Triangle = new triangle(4, 5);

        Circle.display();
        Rectangle.display();
        Triangle.display();

        System.out.println(Circle.area());
        System.out.println(Rectangle.area());
        System.out.println(Triangle.area());
    }
}
