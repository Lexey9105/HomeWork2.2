public class Car extends TransportVehicle {

    public Car(String modelNumber,int wheelsCount){
        super(modelNumber,wheelsCount);
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public  void check() {
        this.checkTransport();
        this.checkEngine();
    }
}
