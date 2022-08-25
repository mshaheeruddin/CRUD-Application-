/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud.sql;

/**
 *
 * @author Muhammad Shaheer
 */
public class Employee {
    private int employeeId;
    private String employeeName;
    private String employeePhone;
    private String employeeCity;

    public Employee(int employeeId, String employeeName, String employeePhone, String employeeCity) {
        super();
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeePhone = employeePhone;
        this.employeeCity = employeeCity;
    }

    public Employee(String employeeName, String employeePhone, String employeeCity) {
        super();
        this.employeeName = employeeName;
        this.employeePhone = employeePhone;
        this.employeeCity = employeeCity;
    }
    public Employee() {
        super();
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeePhone() {
        return employeePhone;
    }

    public void setEmployeePhone(String employeePhone) {
        this.employeePhone = employeePhone;
    }

    public String getEmployeeCity() {
        return employeeCity;
    }

    public void setEmployeeCity(String employeeCity) {
        this.employeeCity = employeeCity;
    }

    
    @Override
    public String toString() {
        return "Employee{" + "employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeePhone=" + employeePhone + ", employeeCity=" + employeeCity + '}';
    }

    
    

     
    



}
