package CalculateSalary;

public class Main {
    public static void main(String[] args) {
        Employee e1=new Employee("Kemal",2000.0,45.0,1985);
        System.out.println("Bonus : "+e1.bonus());;
        System.out.println("Tax : "+e1.tax());
        System.out.println("Maaş Artışı : "+e1.raiseSalary());
        System.out.println("Vergi ve bonuslarla birlikte maaşı : "+e1.salaryWithTaxAndBonus());
        System.out.println("Toplam maaşı : "+e1.totalSalary());
    }
}
