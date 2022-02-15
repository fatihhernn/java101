package EffectiveJava.item51;

public class EnumTest {
    public static void main(String[] args) {
//        boolean isCelcius=true;
//        if (isCelcius){
//            System.out.println("evet celcius");
//        }
//        else {
//            System.out.println("fahren..");
//        }
//
        TemperatureScale value=TemperatureScale.FAHRENHEIT;
//        if (TemperatureScale.CELCIUS==value){
//            System.out.println("Celciusa göre işlem yap");
//        }
//        else if (TemperatureScale.FAHRENHEIT==value) {
//            System.out.println("FAHRENHEIT göre işlem yap");
//        }
//        else  System.out.println("kELVIN göre işlem yap");

        switch (value){
            case KELVIN:
                System.out.println("kELVIN göre işlem yap");
                break;
            case CELCIUS:
                System.out.println("Celciusa göre işlem yap");
                break;
            case FAHRENHEIT:
                System.out.println("FAHRENHEIT göre işlem yap");
                break;
            default:
                System.out.println("Belirtilen değer enum değerlerinde belirtilmemiş");
                break;
        }

    }
}
