import com.sun.xml.internal.bind.annotation.OverrideAnnotationOf;

/**
 * Created by jc302404 on 20/04/15.
 */
public abstract class Shape {
    public int x, y;

    public Shape(){
        x = y = 0;
    }
    public abstract boolean hit(int x, int y);


    public void move(int dx, int dy){
        x += dx;
        y += dy;
    }
    @Override
    public String toString(){
        return String.format("(%d %d)", x, y);
    }
}
