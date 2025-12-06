package Assignmet04.Program2;
public class Machine {
    int machineId;
    double totalSensorsValue;
    Sensor[] sensors;
    public Machine(int machineId, int numberOfSensors) {
        this.machineId = machineId;
        sensors = new Sensor[numberOfSensors];

        for(int i = 0; i < sensors.length; i++){
            //Has to assign temperature or humidity so instead of a straight and simple approch I choose to be a little tricky and unpredictable way
            String type = (Math.random() < 0.5) ? "Temperature" : "Humidity";
            sensors[i] = new Sensor(i+1, type);
        }
    }
    //setter
    public void setMachineId(int machineId) {
        this.machineId = machineId;
    }
    //getters
    public int getMachineId() {
        return machineId;
    }
    public double getTotalSensorsValue() {
        return totalSensorsValue;
    }
    //Other Methods
    public void calculateTotalSensorsValue(){
        for(int i = 0; i < sensors.length; i++){
            totalSensorsValue += sensors[i].getSensorValue();
        }
    }
    public boolean checkSensorOutput(){
        int j = 1;
        boolean b = true;
        for(int i = 0; i < sensors.length; i++){
            b = (sensors[i].getSensorType().equals(sensors[j++].getSensorType())) ? true : false;
        }
        return b;
    }
    public void displayInfo(){
        System.out.println("Machine id = "+machineId);
        System.out.println("Total value of "+sensors.length+" sensors = "+totalSensorsValue);
    }
}
