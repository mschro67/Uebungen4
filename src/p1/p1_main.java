//by mschro67
//fixed

package p1;

public class p1_main{
    public static void main(String[] args){
        int stockwerk=2;

        System.out.println("stockwerk: "+stockwerk);

        switch (stockwerk){
            case 3:
                System.out.println("Kinderbekleidung");
            case 2:
                System.out.println("Herrenbekleidung");
            case 1:
                System.out.println("Damenbekleidung");
            case 0:
                System.out.println("Angebote");
                break;
            case -1:
                System.out.println("Parkhaus");
                break;
            default:
                System.out.println("unbekannt");
                break;
        }
    }
}