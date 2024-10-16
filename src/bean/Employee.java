package bean;

public class Employee
{
    private int id;
    private String name;
    private int salary;
    private String city;

    private String gender;

    public Employee(int id, String name, int salary, String city,String gender) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.city = city;
        this.gender=gender;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public String getCity() {
        return city;
    }

    public String getGender() {
        return gender;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", city='" + city + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
