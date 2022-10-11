import Car.Car;
import Car.CarController;
import Car.CarView;

public class MVCPatternDemo {
    public static void main(String[] args) {

        //fetch student record based on his roll no from the database
        Car model  = retriveCourseFromDatabase();

        //Create a view : to write course details on console
        CarView view = new CarView();

        CarController controller = new CarController(model, view);

        controller.updateView();

        //update model data
        controller.setCarModel("Mercedes");
        System.out.println("nAfter updating, Car Details are as follows");

        controller.updateView();
    }

    private static Car retriveCourseFromDatabase(){
        Car car = new Car();
        car.setCarBrand("BMW");
        car.setVIN("503BMW");
        car.SetCarModel("5series");
        return car;
    }
}