package org.fasttrackit.salaries.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Employees {

    @Id
    @GeneratedValue
    private long id;
    @NotNull
    private  String firstName;
    @NotNull
    private String lastName;
    @NotNull
    private long marca;
    @NotNull
    private long salary;
    @NotNull
    private int standardHours;
    @NotNull
    private int personalDeduction;
    @NotNull
    private double tickets;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getMarca() {
        return marca;
    }

    public void setMarca(long marca) {
        this.marca = marca;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public int getStandardHours() {
        return standardHours;
    }

    public void setStandardHours(int standardHours) {
        this.standardHours = standardHours;
    }

    public int getPersonalDeduction() {
        return personalDeduction;
    }

    public void setPersonalDeduction(int personalDeduction) {
        this.personalDeduction = personalDeduction;
    }

    public double getTickets() {
        return tickets;
    }

    public void setTickets(double tickets) {
        this.tickets = tickets;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", marca=" + marca +
                ", salary=" + salary +
                ", standardHours=" + standardHours +
                ", personalDeduction=" + personalDeduction +
                ", tickets=" + tickets +
                '}';
    }
}
