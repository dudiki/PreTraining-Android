import java.lang.*;

abstract class Shape
{
protected String color;
protected boolean filled;
public Shape()
{
}
public Shape(String color,boolean filled)
{
this.color=color;
this.filled=filled;
}
public String getColor()
{
return color;
}
public void setColor(String color)
{
this.color=color;
}
public boolean isFilled()
{
return filled;
}
public void setFilled(boolean filled)
{
this.filled=filled;
}
public abstract double getArea();
public abstract double getPerimeter();
public abstract String toString();
}

class Circle extends Shape
{
protected double radius;
public Circle()
{
super();
}

public Circle(double radius)
{
super();
this.radius=radius;
}
public Circle(double radius,String color,boolean filled)
{
super(color,filled);
this.radius=radius;
}
public double getRadius()
{
return radius;
}
public void setRadius(double radius)
{
this.radius=radius;
}
public double getArea()
{
return 3.1415*radius*radius;
}
public double getPerimeter()
{
return 2*3.1415*radius;
}
public String toString()
{
return "circle with radius"+radius+"has "+getPerimeter()+" perimeter "+" and its area is "+getArea();
}
}

class Rectangle extends Shape
{
protected double width;
protected double length;
public Rectangle()
{
super();
}

public Rectangle(double width,double length)
{
super();
this.width=width;
this.length=length;
}
public Rectangle(double width,double length,String color,boolean filled)
{
super(color,filled);
this.width=width;
this.length=length;
}

public double getWidth()
{
return width;
}
public void setWidth(double width)
{
this.width=width;
}
public double getLength()
{
return length;
}
public void setLength(double length)
{
this.length=length;
}

public double getArea()
{
return width*length;
}
public double getPerimeter()
{
return 2*(width+length);
}
public String toString()
{
return "Rectangle with width"+width+" and length "+length+" has "+getPerimeter()+" perimeter "+"and its area is :"+getArea();
}
}

class Square extends Rectangle
{
protected double side;
public Square()
{
super();
}

public Square(double side)
{
super(side,side);
this.side=side;
}
public Square(double side,String color,boolean filled)
{
super(side,side,color,filled);
this.side=side;
}
public double getSide()
{
return side;
}
public void setSide(double side)
{
this.side=side;
}
public void setWidth(double side)
{
width=side;
}
public void setLength(double side)
{
length=side;
}
public String toString()
{
return "Square with side "+side+" has "+getPerimeter()+" perimeter "+" and its area is :"+getArea();
}
}



class ShapeTest
{
public static void main(String args[])
{
Square s1=new Square(20);
System.out.println(" s1 "+s1);
Square s2=new Square();
s2.setWidth(30);
s2.setLength(30);
s2.setColor("CYAN");
s2.setFilled(true);
System.out.println("  Square s2 has "+s2.getColor()+" color "+"and is Filled : "+s2.isFilled()+" s2 has an Area :"+s2.getArea()+" and Perimeter :"+s2.getPerimeter());


Rectangle r1=new Rectangle(20,40);
System.out.println(" R1 "+r1);
Rectangle r2=new Rectangle();
r2.setWidth(40);
r2.setLength(60);
r2.setColor("BLUE");
r2.setFilled(true);
System.out.println("  Rectangle r2 has "+r2.getColor()+" color "+"and  is Filled : "+r2.isFilled()+"r2 has an Area :"+r2.getArea()+" and Perimeter :"+r2.getPerimeter());



Circle c1=new Circle(2);
System.out.println(" C1 "+c1);
Circle c2=new Circle();
c2.setRadius(3.5);
c2.setColor("RED");
c2.setFilled(true);
System.out.println("  Circle C2 has "+c2.getColor()+" color "+"and is Filled: "+c2.isFilled()+"c2 has an area :"+c2.getArea()+" and Perimeter :"+c2.getPerimeter());

}
}



/* OUTPUT

E:\androidpre>java ShapeTest
 s1 Square with side 20.0 has 80.0 perimeter  and its area is :400.0
  Square s2 has CYAN color and is Filled : true s2 has an Area :900.0 and Perimeter :120.0
 R1 Rectangle with width20.0 and length 40.0 has 120.0 perimeter and its area is :800.0
  Rectangle r2 has BLUE color and  is Filled : truer2 has an Area :2400.0 and Perimeter :200.0
 C1 circle with radius2.0has 12.566 perimeter  and its area is 12.566
  Circle C2 has RED color and is Filled: truec2 has an area :38.483375 and Perimeter :21.9905

*/