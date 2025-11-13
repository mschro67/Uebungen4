//by mschro67

package p3;

public class p3_main{
    public static void main(String[] args){
        boolean x=true,y=true;
        boolean a=!(x!=y && x==y),b=x || true,c=x && false,d=(x&&!y)||(!x);
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        System.out.println("c: "+c);
        System.out.println("d: "+d);
    }
 }