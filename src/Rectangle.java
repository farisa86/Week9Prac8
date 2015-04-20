/**
 * Created by jc302404 on 20/04/15.
 */
public class Rectangle extends Shape {

    private int height, width;
    public Rectangle (int height, int width){
        this.height = height;
        this.width = width;
    }


    @Override
    public boolean hit(int otherX, int otherY) {
        boolean checkHorizontal = Math.abs(this.x - x) <= width;
        boolean checkVertical = Math.abs(this.y - y) <= height;
        return checkHorizontal && checkVertical;
    }

    @Override
    public String toString(){
        return String.format("%s height: %d, width: %d", super.toString(), height, width);
    }
}
