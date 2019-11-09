package org.fasttrackit.salaries.transfer.salary;

public class SaveSalaryRequest {

    private  long workingdaysmonth;
    private  long workeddays;
    private  long holidays;
    private  long sickdays;
    private  long dayswithoutsalary;

    @Override
    public String toString() {
        return "SaveSalaryRequest{" +
                "workingdaysmonth=" + workingdaysmonth +
                ", workeddays=" + workeddays +
                ", holidaydays=" + holidays +
                ", sickdays=" + sickdays +
                ", dayswithoutsalary=" + dayswithoutsalary +

                '}';
    }

    public long getWorkingdaysmonth() {
        return workingdaysmonth;
    }

    public void setWorkingdaysmonth(long workingdaysmonth) {
        this.workingdaysmonth = workingdaysmonth;
    }

    public long getWorkeddays() {
        return workeddays;
    }

    public void setWorkeddays(long workeddays) {
        this.workeddays = workeddays;
    }

    public long getHolidays() {
        return holidays;
    }

    public void setHolidays(long holidays) {
        this.holidays = holidays;
    }

    public long getSickdays() {
        return sickdays;
    }

    public void setSickdays(long sickdays) {
        this.sickdays = sickdays;
    }

    public long getDayswithoutsalary() {
        return dayswithoutsalary;
    }

    public void setDayswithoutsalary(long dayswithoutsalary) { this.dayswithoutsalary = dayswithoutsalary; }


}
