package day2;

public class HealthInsuranceApp {

    public static void main(String[] args) {


        HealthInsurance client1 = new HealthInsurance();
        client1.name = "Ram";
        client1.address = "USA";
        client1.age = 30;
        client1.planType = "Premium";
        client1.numberOfYear = 10;


        System.out.println(client1.getName());
        System.out.println(client1.getAddress());
        System.out.println(client1.getPlanType());
        System.out.println(client1.getNumberOfYear());

    }
}
