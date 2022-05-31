package mcm.edu.ph.liston_multicalc;

public class Formulacodes {

    //Mass
    public double mass(double volume, double density) {
        return volume*density;
    }

    //Kinetic Energy
    public double kinetic(double mass ,double velocity){
        return (0.5 * (mass * (velocity * velocity)));
    }

    //AreaofT
    public double triangleArea(double base, double height) {
        return ((0.5) * base * height);
    }
    public double triangleA(double base,double height){return ((base * height)/4);}

    //Ohm's Law
    public double ohms(double current, double resistance){
        return current * resistance;
    }
}
