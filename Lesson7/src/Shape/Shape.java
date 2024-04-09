package Shape;

public class Shape {
    public void draw(){
        System.out.println("I draw " + this.getClass().getName());
    }
    public void erase(){
        System.out.println("I erase " + this.getClass().getName());
    }
}
