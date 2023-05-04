public class Truck extends TransportVehicle {

    public Truck(String modelNumber,int wheelsCount){
        super(modelNumber,wheelsCount);
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    public  void check() {
        this.checkTransport();
        this.checkEngine();
        this.checkTrailer();
    }
}
