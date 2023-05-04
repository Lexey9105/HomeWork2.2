import java.io.UnsupportedEncodingException;
import java.util.Objects;

public class Bicycle extends TransportVehicle {

    public Bicycle(String modelNumber,int wheelsCount){
        super(modelNumber,wheelsCount);
    }

    public void check() {
        this.checkTransport();
    }
}
