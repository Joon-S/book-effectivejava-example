package chapter_6;

public enum PayrollDayBad {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
    private static final int HOURS_PER_SHIFT = 0;

    double pay(double hoursWorked, double payRate) {
        double basePay = hoursWorked * payRate;

        double overtimePay;
        switch(this) {
            case SATURDAY: case SUNDAY:
                overtimePay = hoursWorked * payRate / 2;
                break;
                default:
                    overtimePay = hoursWorked <= HOURS_PER_SHIFT ?
                            0 : (hoursWorked - HOURS_PER_SHIFT) * payRate / 2;
        }

        return basePay + overtimePay;
    }
}
