package main.java.com.koboMagic.javaQBank.java_basics;

class Circle {
    private int x;
    private int y;

    public Circle(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
public class PassByValue {
    public void moveCircle(Circle circle, int deltaX, int deltaY){
        circle.setX(circle.getX()+deltaX);
        circle.setY(circle.getY()+deltaY);

        circle = new Circle(5,5);
    }

    public static void main(String[] args) {
        PassByValue obj = new PassByValue();
        Circle circle = new Circle(0,0);
        obj.moveCircle(circle, 10, 13);
        System.out.println(circle.getX()+" "+ circle.getY());
    }
}
