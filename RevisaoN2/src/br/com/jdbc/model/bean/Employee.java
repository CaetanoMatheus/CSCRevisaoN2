package br.com.jdbc.model.bean;

public class Employee {

    private Integer id;
    private String name;
    private String address;
    private String phone;
    private String occupation;
    private String department;

    public Employee(String name, String address, String phone, String occupation, String department) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.occupation = occupation;
        this.department = department;
    }

    public Employee(Integer id, String name, String address, String phone, String occupation, String department) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.occupation = occupation;
        this.department = department;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getOccupation() { return occupation; }

    public void setOccupation(String occupation) { this.occupation = occupation; }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String data) {
        this.department = department;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nId: ");
        sb.append(this.id);
        sb.append("\nName: ");
        sb.append(this.name);
        sb.append("\nAddress : ");
        sb.append(this.address);
        sb.append("\nPhone: ");
        sb.append(this.phone);
        sb.append("\nOccupation: ");
        sb.append(this.occupation);
        sb.append("\nDepartment: ");
        sb.append(this.department);
        sb.append("\n");
        return sb.toString();
    }
}
