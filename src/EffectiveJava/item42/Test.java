package EffectiveJava.item42;

public class Test {

    public String ex4(){
        return "ex 4 yaz";
    }
    public String ex5(){
        return "ex 5 yaz";
    }

    public static void main(String[] args) {


        Yazdır yazdır=new Yazdır() {
            @Override
            public void yazdir() {
                System.out.println("merhaba");
            }
        };
        yazdır.yazdir();



        Yazdır y=() -> System.out.println("merhaba 2");
        y.yazdir();

        ParametreliYazdir p=(isimAlacak)->{return "Hoşgeldin "+isimAlacak;};
        System.out.println(p.parametreliYazdir("fatih"));



        Calculate topla= (ilksayi,ikincisayi) -> {
            return ilksayi + ikincisayi;
        };
        Calculate carp= (double ilksayi,double ikincisayi) -> {
            return ilksayi * ikincisayi;
        };
        Calculate bol= (ilksayi,ikincisayi) -> {
            return ilksayi / ikincisayi;
        };
        Calculate cikar= (ilksayi,ikincisayi) -> {
            return ilksayi - ikincisayi;
        };
        System.out.println(topla.calculate(5, 4));
        System.out.println(carp.calculate(5, 4));
        System.out.println(bol.calculate(5, 4));
        System.out.println(cikar.calculate(5, 4));

        Test test   =new Test();

        YazdirStringDondur yazdir=test::ex5;
        System.out.println(yazdir.yazdir());


    }
}
