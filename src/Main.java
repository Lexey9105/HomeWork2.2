public class Main {

    public static void main(String[]args){
        TransportVehicle[] transportVehicle=new TransportVehicle[]{
                new Bicycle("bicycle1", 2),
                new Bicycle("bicycle2", 2),
                new Car("car1", 4),
                new Car("car2", 4),
                new Truck("truck1", 6),
                new Truck("truck2", 8)};

        ServiceStation ServiceStationForTransportVehicle=new  ServiceStationForTransportVehicle();
        ServiceStationForTransportVehicle.startServiceStation(transportVehicle);
    }
}
