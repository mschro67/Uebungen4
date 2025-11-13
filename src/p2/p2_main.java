//by mschro67
//fixed

package p2;

public class p2_main{
    public static void main(String[] args){
        int a = 3, b = 5, c = 6;
        double x = 1.5, y = 2.3;
        int intResult;
        double doubleResult;

        intResult = c - a * 3;
        System.out.println("a: "+intResult);

        intResult = c / b;
        System.out.println("b: "+intResult);

        intResult = a + b / c;
        System.out.println("c: "+intResult);

        doubleResult = (double) c / b; //ist erst int und wird dann zu double
        System.out.println("d: "+doubleResult);

        doubleResult = c + (double) a / b;
        System.out.println("e: "+doubleResult);

        doubleResult = x + y * b;
        System.out.println("f: "+doubleResult);
    }
}