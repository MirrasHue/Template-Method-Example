
package seminar.templatemethod;

/**
 *
 * @author Mirrális
 */
public class SportsCar extends CarFactory{
    
    @Override
    protected void fixChassis()
    {
        System.out.println("Assembling chassis of the sports model");
        chassis = "Sporty Chassis";
    }
    
    @Override
    protected void fixBody()
    {
        System.out.println("Assembling body of the sports model");
        body = "Sporty Body";
    }

    @Override
    protected void paint()
    {
        System.out.println("Painting body of the sports model");
        paint = "Sporty Black Paint";
    }

    @Override
    protected void fixInterior()
    {
        System.out.println("Setting up interior of the sports model");
        interior = "Sporty Interior";
    }
    
    @Override
    protected void thoroughInspection()
    {
        super.thoroughInspection();
        System.out.println("Thoroughly inspecting SportsCar before shipping");
    }
}
