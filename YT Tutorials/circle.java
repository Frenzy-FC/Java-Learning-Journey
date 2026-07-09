public class circle extends shape {
    double radius;

    circle(double radius){
        this.radius = radius;
    }

    @Override
    double area(){
        return Math.PI * radius * radius;
    }
}
