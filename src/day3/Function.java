package day3;

public class Function {
    public static void main(String[] args) {

        int p = 5000;
        float t = 1.8f;
        double r = 3.5;

        //double iR = ((p*t*r)/100);
        double iR = iRAndReturn(p,t,r);
        System.out.println(iR);


        float p1 = 2599.544f;
        int t1 = 1;
        double r1 = 2.5;

        //double iR1 = ((p1*t1*r1)/100);
        double iR1 = iRAndReturn(p1, t1, r1);
        System.out.println(iR1);


        int p2 = 8000;
        int t2 = 2;
        int r2 = 3;

        double iR2 = iRAndReturn(p2,t2,r2);
        System.out.println(iR2);
    }

    public static double iRAndReturn(float p, float t, double r){
        double iR = (p*t*r)/100;
        return iR;
    }

    public static void iR(int p2, int t2, int r2){
        double iR = (p2*t2*r2)/100;
        System.out.println(iR);

    }


}
