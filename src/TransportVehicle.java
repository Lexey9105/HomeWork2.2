import java.util.Objects;

public abstract class TransportVehicle  {

    private String modelName;
    private int wheelsCount;

    public TransportVehicle(String modelName,int wheelsCount){
        this.modelName=modelName;
        this.wheelsCount=wheelsCount;
    }


    public void checkTransport() {
        System.out.println("Обслуживаем " + this.getModelName());
        for (int i = 0; i < this.getWheelsCount(); i++) {
            this.updateTyre();
        }
    }
    public abstract void check();




    public String getModelName() {
        return modelName;
    }
    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }
    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }


    @Override
    public String toString() {
        return "TransportVehicle{" +
                "modelName='" + modelName + '\'' +
                ", wheelsCount=" + wheelsCount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TransportVehicle that = (TransportVehicle) o;
        return wheelsCount == that.wheelsCount &&
                Objects.equals(modelName, that.modelName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelName, wheelsCount);
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");}
}
