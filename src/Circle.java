/**
 * Created by jc302404 on 20/04/15.
 */
public class Circle extends Shape {
    private int radius;

    public Circle(int radius){
        this.radius = radius;
    }

    @Override
    public boolean hit(int x, int y) {
        boolean checkHorizontal = Math.abs(this.x - x) <= radius;
        boolean checkVertical = Math.abs(this.y - y) <= radius;
        return checkHorizontal && checkVertical;
    }


    @Override
    public String toString(){
        return String.format("%s radius: %d", super.toString(), radius);
    }
}
