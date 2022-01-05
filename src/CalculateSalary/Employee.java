package CalculateSalary;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class Employee {
    String name;
    double salary;
    double workingHoursWeekly;
    int hireYear;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getWorkingHoursWeekly() {
        return workingHoursWeekly;
    }

    public void setWorkingHoursWeekly(double workingHoursWeekly) {
        this.workingHoursWeekly = workingHoursWeekly;
    }

    public int getHireYear() {
        return hireYear;
    }

    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }

    public Employee(String name, Double salary, Double workingHoursWeekly, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workingHoursWeekly = workingHoursWeekly;
        this.hireYear = hireYear;
    }

    double tax(){
        if (getSalary()>1000){
            return salary*0.03;
        }
        else return salary;
    }

    double bonus(){
        if (getWorkingHoursWeekly()>40){
            return  (getWorkingHoursWeekly()-40)*30;
        }
        return 0;
    }

    double raiseSalary(){
        if (LocalDate.now().getYear()-getHireYear()<10){
            return getSalary()*0.05;
        }
        else if (LocalDate.now().getYear()-getHireYear()>=10&&LocalDate.now().getYear()-getHireYear()<20){
            return getSalary()*0.10;
        }
        else if (LocalDate.now().getYear()-getHireYear()>=20){
            return getSalary()*0.15;
        }
        return 0;
    }

    double salaryWithTaxAndBonus(){
        return getSalary()+raiseSalary()-tax()-bonus();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", workingHoursWeekly=" + workingHoursWeekly +
                ", hireYear=" + hireYear +
                '}';
    }

    public double totalSalary() {
        return raiseSalary()+getSalary();
    }
}

