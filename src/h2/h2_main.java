//by mschro67

package h2;

public class h2_main{
    public static void main(String[] args){
        boolean x,y,a,b,c;
        int input=10;

        x=(input==10 || input==11);
        y=(input==11 || input==1);

        boolean E1=x,E2=y,E3=(x!=y);

        a=(E1 && E2);
        b=(E1 || E3);
        c=(!(y));

        System.out.println("input: "+input+", x: "+x+", y: "+y+", a: "+a+", b: "+b+", c: "+c);
    }
}
