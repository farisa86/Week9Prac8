/**
 * Created by jc302404 on 20/04/15.
 */
public class TestShape {
    public static void main(String[] args) {
        System.out.println("Test 1: create Circle");
        Shape shape = new Circle(10);
        check("(0,0) radius:10", shape);

        System.out.println("Test 2: hit method");
        shape = new Circle(20);

        boolean hit = shape.hit(10,10);
        check("true", hit);
        hit = shape.hit(50, 50);
        check("false", hit  );

        shape.move(100, 100);
        hit = shape.hit(0, 0);
        check("false", hit  );
    }

    private static void check(String expected, Object actual) {
        String message  = String.format("expected: %s actual:%s", expected, actual);
        System.out.println(message);

    }
}
