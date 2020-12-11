
package seminar.templatemethod;

/**
 *
 * @author Mirrális
 */
public abstract class CarFactory {
    
    public final void manufactureCar() // Template method
    {
        fixChassis();
        fixBody();
        paint();
        fixInterior();
        thoroughInspection();
        shipCar();
    }
    
    // Steps, have to be implemented in subclasses
    protected abstract void fixChassis();
    protected abstract void fixBody();
    protected abstract void paint();
    protected abstract void fixInterior();
    
    // Predefined behavior, should not be overridden by subclasses, nor called
    private void shipCar()
    {
        System.out.println("Shipping the car");
    }
    
    // Hook method, could be overridden by subclasses
    protected void thoroughInspection() {}

    public String getChassis()  { return chassis; }
    public String getBody()     { return body; }
    public String getPaint()    { return paint; }
    public String getInterior() { return interior; }
    
    // Data members
    protected String chassis;
    protected String body;
    protected String paint;
    protected String interior;
    
    
    public String builtCarSpecs()
    {
        return "\nCar Specs = [ Chassis: " + chassis + ", \n\tBody: " + body + ", \n\tPaint: " + paint + ", \n\tInterior: " + interior + " ]";
    }
}
