package List;

public class Polygon {

    public int polygon(int n) {

        if(n == 1) {

        }
        return (n * n) + (n * n - 1);
    }

    public static void main(String[] args) {
        Polygon runner = new Polygon();
        System.out.println(runner.polygon(6));
    }
}
