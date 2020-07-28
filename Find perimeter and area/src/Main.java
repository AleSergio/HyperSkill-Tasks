abstract class Shape {

    abstract double getPerimeter();

    abstract double getArea();
}

class Triangle extends Shape {

    double a,b,c;

    public Triangle(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getPerimeter(){
        return a + b + c;
    }

    @Override
    public double getArea(){
        double s = (a+b+c) / 2;
        return Math.sqrt( (s * (s - a) * (s - b) * (s - c) ));
    }
}

class Rectangle extends Shape {

    double w,h;

    public Rectangle(double w, double h){
        this.w = w;
        this.h = h;
    }

    @Override
    public double getPerimeter(){
        return 2*(w+h);
    }

    @Override
    public double getArea(){
        return w*h;
    }
}

class Circle extends Shape {

    double r;

    public Circle(double r){
        this.r = r;
    }

    @Override
    public double getPerimeter(){
        return 2*Math.PI*r;
    }

    @Override
    public double getArea(){
        return Math.PI * (r*r);
    }
}
