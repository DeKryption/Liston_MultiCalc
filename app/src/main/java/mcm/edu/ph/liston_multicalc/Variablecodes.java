package mcm.edu.ph.liston_multicalc;

public class Variablecodes {


    //AreaofT
    private double area,base,height1;

    public double getArea() {
        return area;
    }

    public double getBase() {
        return base;
    }

    public double getHeight1() {
        return height1;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setHeight1(double height1) {
        this.height1 = height1;
    }

    //Mass Formula
    private double mass,Volume1,density;

    public void setVolume1(double volume1) {
        Volume1 = volume1;
    }

    public void setDensity(double density) {
        this.density = density;
    }

    public double getMass() {
        return mass;
    }

    public double getDensity() {
        return density;
    }

    public double getVolume1() {
        return Volume1;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }




    //Kinetic Energy
    private double kinetic,Speed,Velocity1;

    public double getKinetic() {
        return kinetic;
    }

    public double getSpeed() {
        return Speed;
    }

    public double getVelocity1() {
        return Velocity1;
    }

    public void setKinetic(double kinetic) {
        this.kinetic = kinetic;
    }

    public void setSpeed(double mass1) {
        Speed = mass1;
    }

    public void setVelocity1(double velocity1) {
        Velocity1 = velocity1;
    }

    //Ohm's Law
    private double resistance, current;

    public double getResistance() {
        return resistance;
    }

    public void setResistance(double resistance) {
        this.resistance = resistance;
    }

    public double getCurrent() {
        return current;
    }

    public void setCurrent(double current) {
        this.current = current;
    }

}
