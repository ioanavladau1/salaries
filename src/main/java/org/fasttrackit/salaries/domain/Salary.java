package org.fasttrackit.salaries.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Salary {

    @Id
    private long id;

    @NotNull
    private long workingdaysmonth;
    private long workeddays;
    private long holidays;
    private long sickdays;
    private long dayswithoutsalary;
    private long rightworkeddays;
    private long rightholidays;
    private long rightsickdays;
    private long righttickets;
    private long brutincome;
    private long CAS;
    private long CASS;
    private long netincome;
    private long tax;
    private long netsalary;

    @OneToOne(fetch = FetchType.LAZY)
    @MapsId

    private Employees employees;

    public Employees getEmployees() {
        return employees;
    }

    public void setEmployees(Employees employees) {
        this.employees = employees;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getWorkingdaysmonth() {
        return workingdaysmonth;
    }

    public void setWorkingdaysmonth(long workingdaysmonth) { this.workingdaysmonth = workingdaysmonth; }

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

    public long getRightworkeddays() { return rightworkeddays; }

    public void setRightworkeddays(long rightworkeddays) { this.rightworkeddays = rightworkeddays; }

    public long getRightholidays() { return rightholidays;}

    public void setRightholidays(long rightholidays) { this.rightholidays = rightholidays; }

    public long getRightsickdays() { return rightsickdays; }

    public void setRightsickdays(long rightsickdays) {this.rightsickdays = rightsickdays; }

    public long getRighttickets() { return righttickets; }

    public void setRighttickets(long righttickets) { this.righttickets = righttickets; }

    public long getNetsalary() { return netsalary; }

    public void setNetsalary(long netsalary) { this.netsalary = netsalary; }


    @Override
    public String toString() {
        return "Salary{" +
                "id=" + id +
                ", workingdaysmonth=" + workingdaysmonth +
                ", workeddays=" + workeddays +
                ", holidays=" + holidays +
                ", sickdays=" + sickdays +
                ", dayswithoutsalary=" + dayswithoutsalary +
                ", rightworkeddays=" + rightworkeddays +
                ", rightholidays=" + rightholidays +
                ", rightsickdays=" + rightsickdays +
                ", righttickets=" + righttickets +
                ", brutincome=" + brutincome +
                ", CAS=" + CAS +
                ", CASS=" + CASS +
                ", netincome=" + netincome +
                ", tax=" + tax +
                ", netsalary=" + netsalary +
                ", employees=" + employees +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Salary salary = (Salary) o;

        return id == salary.id;

    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }
}