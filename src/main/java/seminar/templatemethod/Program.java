
package seminar.templatemethod;

/**
 *
 * @author Mirrális
 */
public class Program {

    public static void main(String[] args) {
        
        CarFactory carFactory1 = new SportsCar();
        CarFactory carFactory2 = new RegularCar();
        
        System.out.println("\nCar Factory 1\n");
        carFactory1.manufactureCar();
        System.out.println(carFactory1.builtCarSpecs());
       
        System.out.println("\n\nCar Factory 2\n");
        carFactory2.manufactureCar();
        System.out.println(carFactory2.builtCarSpecs());
    }
    
}









Output

Car Factory 1

Assembling chassis of the sports model
Assembling body of the sports model
Painting body of the sports model
Setting up interior of the sports model
Thoroughly inspecting SportsCar before shipping
Shipping the car

Car Specs = [ Chassis: Sporty Chassis, 
	Body: Sporty Body, 
	Paint: Sporty Black Paint, 
	Interior: Sporty Interior ]


Car Factory 2

Assembling chassis of the regular model
Assembling body of the regular model
Painting body of the regular model
Setting up interior of the regular model
Shipping the car

Car Specs = [ Chassis: Regular Chassis, 
	Body: Regular Body, 
	Paint: Regular White Paint, 
	Interior: Regular Interior ]