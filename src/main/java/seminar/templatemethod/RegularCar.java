
package seminar.templatemethod;

/**
 *
 * @author Mirrális
 */
public class RegularCar extends CarFactory{
    
    @Override
    protected void fixChassis()
    {
        System.out.println("Assembling chassis of the regular model");
        chassis = "Regular Chassis";
    }
    
    @Override
    protected void fixBody()
    {
        System.out.println("Assembling body of the regular model");
        body = "Regular Body";
    }

    @Override
    protected void paint()
    {
        System.out.println("Painting body of the regular model");
        paint = "Regular White Paint";
    }

    @Override
    protected void fixInterior()
    {
        System.out.println("Setting up interior of the regular model");
        interior = "Regular Interior";
    }
    
    // Regular car doesn't have a thorough inspection, it is too cheap.
}
