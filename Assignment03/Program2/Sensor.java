package Assignment03.Program2;

public class Sensor {
    private int sensorid;
    private String SensorType;
    private double sensorValue;
    private double ResultValue;
    //Constructor
    public Sensor(int sensorid, String sensorType) {
        this.sensorid = sensorid;
        SensorType = sensorType;
    }
    //Setters
    public void setSensorid(int sensorid) {
        this.sensorid = sensorid;
    }
    public void setSensorType(String sensorType) {
        SensorType = sensorType;
    }
    public void setSensorValue(double sensorValue) {
        this.sensorValue = sensorValue;
    }
    //getters
    public int getSensorid() {
        return sensorid;
    }
    public String getSensorType() {
        return SensorType;
    }
    public double getSensorValue() {
        return sensorValue;
    }
    public double getResultValue() {
        return ResultValue;
    }
    //Other Methods
    public void calculateResultValue(){
        ResultValue = (SensorType.equals("Temperature")) ? sensorValue*9.2 : sensorValue*3;
    }
    public void displayInfo(){
        System.out.println("\nSensor Type = "+SensorType);
        System.out.println("Sensor Id = "+sensorid);
        System.out.println("Sensor value = "+sensorValue);
        System.out.println("Result Value = "+ResultValue+"\n");
    }
}
