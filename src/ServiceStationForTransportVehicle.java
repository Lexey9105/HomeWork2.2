public class ServiceStationForTransportVehicle implements ServiceStation {
@Override
public void startServiceStation(TransportVehicle[] transportVehicle){
    for (int i=0;i<transportVehicle.length;i++){
        transportVehicle[i].check();
    }
}




}

