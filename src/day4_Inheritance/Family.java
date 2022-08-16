package day4_Inheritance;

public class Family {
    public static void main(String[] args) {
        Father robert=  new Father();
        robert.setName("Robert");
        robert.setAge(32);
        robert.setHeight(6.1);
        robert.setColor("White");

        System.out.println(robert.getName());
        System.out.println(robert.getAge());
        System.out.println(robert.getHeight());
        System.out.println(robert.getColor());


        Mother jenny = new Mother();
        jenny.setName("Jenny");
        jenny.setAge(28);
        jenny.setHeight(5.6);
        jenny.setJob("Marketing");



    }

}
