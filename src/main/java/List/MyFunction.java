package List;

public class MyFunction {
    Integer myFunction (Integer input) throws Exception {
        if (input <0) throw new Exception("Illegal Value, Input must be positive");
        if (input == 0)
            return 1;
        else
            return input * myFunction(input-1);
    }

    public static void main(String[] args) throws Exception {
        MyFunction func = new MyFunction();
        System.out.println(func.myFunction(0));
        System.out.println(func.myFunction(4));
        System.out.println(func.myFunction(2));
        System.out.println(func.myFunction(-1));

    }
}
