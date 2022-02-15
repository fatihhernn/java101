package EffectiveJava.Item34;

import static EffectiveJava.Item34.PayrollDay.PayType.*;

public enum PayrollDay {
        MONDAY(WEEKDAY),
        TUESDAY(WEEKDAY),
        WEDNESDAY(WEEKDAY),
        THURSDAY(WEEKDAY),
        FRIDAY(WEEKDAY),
        SATURDAY(WEEKEND),
        SUNDAY(WEEKEND),
    ;

    public void setPayType(PayType payType) {
        this.payType = payType;
    }

    private PayType payType;

    PayrollDay(PayType payType) {
        this.payType = payType;
    }

    int pay(int minsWorked,int payRate){
        return payType.pay(minsWorked,payRate);
    }

    enum PayType {
        WEEKEND{
            @Override
            int overtimePay(int minsWorked,int payRate) {
                return minsWorked<=MINS_PER_SHIFT?0:(minsWorked-MINS_PER_SHIFT)*payRate/2;
            }
        },
        BAYRAM{
            @Override
            int overtimePay(int minsWorked,int payRate) {
                return minsWorked*payRate;
            }
        },
        WEEKDAY {
            @Override
            int overtimePay(int minsWorked,int payRate) {
                return minsWorked*payRate/2;
            }
        };

        private static final int MINS_PER_SHIFT = 8*60;

        abstract int overtimePay(int minsWorked,int payRate);

        int pay(int minsWorked,int payRate){
            int basePay=minsWorked*payRate;
            return basePay+overtimePay(minsWorked,payRate);
        }

    }
    public static void main(String[] args) {
        PayrollDay.SUNDAY.setPayType(BAYRAM);
        for (PayrollDay day : values())
            System.out.printf("%-10s%d%n", day, day.pay(8 * 60, 1));
    }

}
