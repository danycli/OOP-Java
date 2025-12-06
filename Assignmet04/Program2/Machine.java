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
            //Setting value for sensor value too
            sensors[i].setSensorValue(Math.random()*(100));
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
        boolean b = true;
        for(int i = 1; i < sensors.length; i++){
            for(int j = 0; j < sensors.length; j++){
                if(!(sensors[i].getSensorType().equals(sensors[j].getSensorType()))){
                    b = false;
                    break;
                }
            }
        }
        return b;
    }
    public void displayInfo(){
        System.out.println("Machine Id = "+machineId);
        for(Sensor sensor : sensors){
            //Before calling display one method is remaining to call out which is calculateResultValue
            sensor.calculateResultValue();
            sensor.displayInfo();
        }
        System.out.println("Total value of "+sensors.length+" sensors = "+totalSensorsValue);
    }
}
