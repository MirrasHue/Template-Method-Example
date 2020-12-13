
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
