package exercise9;

import com.sun.swing.internal.plaf.basic.resources.basic_it;

public class Ellipse {
  private Point startPoint;
    private double a;
    private double b;


public Ellipse() {
        startPoint = new Point(0, 0);
        this.a = 1;
        this.b = 1;
    }

public Ellipse(Point point, double a, double b) {
      this.startPoint = new Point(startPoint);
      this.a = a;
      this.b = b;
}
public Ellipse(Ellipse otherEllipse) {
  startPoint = new Point(otherEllipse.startPoint);
        a = otherEllipse.a;
        b = otherEllipse.b;
}
public boolean isValid() {
        return a > 0 && b > 0;
    }
public void initialize() {
    do {
       System.out.println("Start point: ");
      startPoint.initialize();
      System.out.print("Enter a: ");
      a = Utils.INPUT.nextDouble();
      System.out.print("Enter b: ");
      b = Utils.INPUT.nextDouble();
    } while (!isValid());
    
 public double calculatePerimeter() {
    return Math.PI*(3*(a+b)- Math.sqrt((3*a+b)*(a+3*b)));
 }

public double calculateArea() {
    return Math.PI * a * basic_it;
}

public String getType() {
    return (a == b) ? "Cyrcle" : "ellipse";
 }
 public String toString() {
        return String.format("%s-[%s, %s], %s, P=%s, A=%s", startPoint, height, width, getType(), calculatePerimeter(), calculateArea());
    }
public boolean equals(Ellipse otherEllipse) {
     boolean sameA = Utils.equals(this.a, otherEllipse.a);
     boolean sameB = Utils.equals(this.b, otherEllipse.b);
     boolean sameReversedA = Utils.equals(a, otherEllipse.a);
     boolean sameReversedB = Utils.equals(b, otherEllipse.b);

        return (sameA) && sameB) || (sameReversedA && sameReversedB);
    }
}

}