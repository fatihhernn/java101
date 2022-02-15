package EffectiveJava.item2;

public class StarbucksTest {
    public static void main(String[] args) {
        //gerekli 2 tane değişken var ise kullanmak kötü
        //opsiyonel parametreler 5 den fazla ise kullanılmalı
        StarbucksBuilder starbucks=new StarbucksBuilder.Builder("tall").yumusakIcenler("evet").laktozsuzTayfa("az").build();
    }
}
