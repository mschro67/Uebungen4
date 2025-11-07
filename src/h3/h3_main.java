//mschro67

package h3;

public class h3_main{
    public static void main(String[] args){
        float celsiusFloat=15,fahrenheitFloat=12;
        double celsiusDouble=15,fahrenheitDouble=17;

        celsiusDouble=celsiusFloat;
        fahrenheitDouble=celsiusDouble*9/5+32;

        System.out.println("Celsius: "+celsiusFloat+", Fahrenheit: "+fahrenheitDouble);
    }
}
