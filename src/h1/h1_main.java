//by mschro67

package h1;

public class h1_main{
    public static void main(String[] args){
        int zone=3;
        double price;

        price=2;

        switch (zone){
            case 1:
                break;
            case 2:
                price+=0.35;
                break;
            case 3:
                price+=0.85;
                break;
            case 4:
                price+=0.85;
                break;
            case 5:
                price+=1.55;
                break;
            default:
                price+=2;
        }

        System.out.println("Zonen: "+zone+", Preis: "+price+"€");
    }
}
