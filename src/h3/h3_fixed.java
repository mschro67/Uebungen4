//by mschro67

package h3;

public class h3_fixed{
    public static void main(String[] args){
        float celsiusFloat=17,fahrenheitFloat=12;
        double celsiusDouble=17,fahrenheitDouble=17;

        fahrenheitFloat=celsiusFloat*9/5+32;
        fahrenheitDouble=celsiusDouble*9/5+32;

        System.out.println("Celsius (Float): "+celsiusFloat+", Fahrenheit (Float): "+fahrenheitFloat);
        System.out.println("Celsius (Double): "+celsiusDouble+", Fahrenheit (Double): "+fahrenheitDouble);
    }
}