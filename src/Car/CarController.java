package Car;

public class CarController {
    private Car model;
    private CarView view;

    public void CarController(Car model, CarView view){
        this.model = model;
        this.view = view;
    }

    public void setCarBrand(String brand){
        model.setCarBrand(brand);
    }

    public String getCarBrand(){
        return model.getCarBrand();
    }

    public void setVIN(String vin){
        model.setVIN(vin);
    }

    public String getVIN(){
        return model.getVIN();
    }

    public void setCarModel(String category){
        model.setCarModel(category);
    }

    public String getCarModel(){
        return model.getCarModel();
    }
    public void updateView(){
        view.printCourseDetails(model.getCarBrand(), model.getVIN(), model.getCarModel());
    }
}
