package org.fasttrackit.salaries.domain;

public class Salary {

    private long workingdays;
    private long workeddays;
    private long holidays;
    private long sickdays;
    private long dayswithoutsalary;
    private long brutincome;
    private long CAS;
    private long CASS;
    private long tax;
    private long netincome;

    public Salary() {

    }

    public long getWorkingdays() {
        return workingdays;
    }

    public void setWorkingdays(long workingdays) {
        this.workingdays = workingdays;
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

    public void setDayswithoutsalary(long dayswithoutsalary) {
        this.dayswithoutsalary = dayswithoutsalary;
    }

    public long getBrutincome() {
        return brutincome;
    }

    public void setBrutincome(long brutincome) {
        this.brutincome = brutincome;
    }

    public long getCAS() {
        return CAS;
    }

    public void setCAS(long CAS) {
        this.CAS = CAS;
    }

    public long getCASS() {
        return CASS;
    }

    public void setCASS(long CASS) {
        this.CASS = CASS;
    }

    public long getTax() {
        return tax;
    }

    public void setTax(long tax) {
        this.tax = tax;
    }

    public long getNetincome() {
        return netincome;
    }

    public void setNetincome(long netincome) {
        this.netincome = netincome;
    }
}
