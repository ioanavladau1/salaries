package org.fasttrackit.salaries.transfer.employees;


import javax.validation.constraints.NotNull;

public class SaveEmployeesRequest {

    @NotNull
    private long marca;
    @NotNull
    private  String firstName;
    @NotNull
    private  String lastName;
    @NotNull
    private  long salary;
    @NotNull
    private  int standardHours;
    @NotNull
    private  int personalDeduction;
    @NotNull
    private  double tickets;

    public long getMarca() {
        return marca;
    }

    public void setMarca(long marca) {
        this.marca = marca;
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
        return "SaveEmployeesRequest{" +
                "marca=" + marca +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", Salary=" + salary +
                ", standardHours=" + standardHours +
                ", personalDeduction=" + personalDeduction +
                ", tickets=" + tickets +
                '}';
    }
}