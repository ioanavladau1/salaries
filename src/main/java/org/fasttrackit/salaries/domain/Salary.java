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
        if (!(o instanceof Salary)) return false;

        Salary salary = (Salary) o;

        if (id != salary.id) return false;
        if (getWorkingdaysmonth() != salary.getWorkingdaysmonth()) return false;
        if (getWorkeddays() != salary.getWorkeddays()) return false;
        if (getHolidays() != salary.getHolidays()) return false;
        if (getSickdays() != salary.getSickdays()) return false;
        if (getDayswithoutsalary() != salary.getDayswithoutsalary()) return false;
        if (getRightworkeddays() != salary.getRightworkeddays()) return false;
        if (getRightholidays() != salary.getRightholidays()) return false;
        if (getRightsickdays() != salary.getRightsickdays()) return false;
        if (getRighttickets() != salary.getRighttickets()) return false;
        if (getBrutincome() != salary.getBrutincome()) return false;
        if (getCAS() != salary.getCAS()) return false;
        if (getCASS() != salary.getCASS()) return false;
        if (getNetincome() != salary.getNetincome()) return false;
        if (getTax() != salary.getTax()) return false;
        if (getNetsalary() != salary.getNetsalary()) return false;
        return employees.equals(salary.employees);
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (int) (getWorkingdaysmonth() ^ (getWorkingdaysmonth() >>> 32));
        result = 31 * result + (int) (getWorkeddays() ^ (getWorkeddays() >>> 32));
        result = 31 * result + (int) (getHolidays() ^ (getHolidays() >>> 32));
        result = 31 * result + (int) (getSickdays() ^ (getSickdays() >>> 32));
        result = 31 * result + (int) (getDayswithoutsalary() ^ (getDayswithoutsalary() >>> 32));
        result = 31 * result + (int) (getRightworkeddays() ^ (getRightworkeddays() >>> 32));
        result = 31 * result + (int) (getRightholidays() ^ (getRightholidays() >>> 32));
        result = 31 * result + (int) (getRightsickdays() ^ (getRightsickdays() >>> 32));
        result = 31 * result + (int) (getRighttickets() ^ (getRighttickets() >>> 32));
        result = 31 * result + (int) (getBrutincome() ^ (getBrutincome() >>> 32));
        result = 31 * result + (int) (getCAS() ^ (getCAS() >>> 32));
        result = 31 * result + (int) (getCASS() ^ (getCASS() >>> 32));
        result = 31 * result + (int) (getNetincome() ^ (getNetincome() >>> 32));
        result = 31 * result + (int) (getTax() ^ (getTax() >>> 32));
        result = 31 * result + (int) (getNetsalary() ^ (getNetsalary() >>> 32));
        result = 31 * result + employees.hashCode();
        return result;
    }
}
