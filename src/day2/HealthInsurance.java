package day2;

public class HealthInsurance {
    //State
    //get and set
     String name;

    //set only
    int age;

    //Get and set
    String address;

    //Get and set
    String planType;

    //Get and set
    int numberOfYear;

    //Set only
    String socialSecurityNumber;

    public void setNumberOfYear(int numberOfYear) {
        this.numberOfYear = numberOfYear;
    }

    public void setPlanType(String planType) {
        this.planType = planType;
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

    public int getAge() {
        return age;
    }

    public String getPlanType() {
        return planType;
    }

    public int getNumberOfYear() {
        return numberOfYear;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }
}
