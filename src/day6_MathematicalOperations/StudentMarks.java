package day6_MathematicalOperations;

public class StudentMarks {
    public static void main(String[] args) {

        Points ram = new Points();
        ram.setPhysics(71);
        ram.setChemistry(75);
        ram.setBiology(68);
        ram.setMath(91);
        ram.setNepali(69);


        float totalPercentageRam = (ram.getPhysics()+ram.getChemistry()+ram.getBiology()+ram.getMath()+ram.getNepali())/500*100;
        System.out.println("Ram's Percentage:" + totalPercentageRam);


        Points shyam = new Points();
        shyam.setPhysics(89);
        shyam.setChemistry(82);
        shyam.setBiology(80);
        shyam.setMath(98);
        shyam.setNepali(79);

        float totalPercentageShyam = (shyam.getPhysics()+shyam.getChemistry()+shyam.getBiology()+shyam.getMath()+shyam.getNepali())/500*100;
        System.out.println("Shyam's Percentage:" + totalPercentageShyam);

        boolean isDistinctionRam = totalPercentageRam >=80;
        System.out.println("Ram's Grade:" + isDistinctionRam);

        boolean isDistinctionShyam = totalPercentageShyam >=80;
        System.out.println("Shyam's Grade:" + isDistinctionShyam);

        //Ternary Operator
        String gradeShyam = isDistinctionShyam ? "Distinction" : "No, its not";
        System.out.println(gradeShyam);

        String gradeRam = isDistinctionRam ? "Distinction" : "No, its not";
        System.out.println(gradeRam);


    }

}
