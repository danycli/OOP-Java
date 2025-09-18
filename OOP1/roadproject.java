package OOP1;

public class roadproject {
    private String RoadProject_Name;
    private int RoadProject_ID;
    private int RoadLenghtInKiloMeters;
    private double RoadCost;
    private int NumberOfTollPlazas;
    private double ProjectDurationInMonths;
    private double RoadProjectTax;

    void setRoadProjectName(String Name) {
        RoadProject_Name = Name;
    }

    void setRoadProjectID(int id) {
        RoadProject_ID = id;
    }

    void setRoadLenghtInKiloMeters(int km) {
        RoadLenghtInKiloMeters = km;
    }

    void calculateRoadCost() {
        if (RoadLenghtInKiloMeters >= 1) {
            RoadCost = RoadLenghtInKiloMeters * 2.5;
        } else {
            RoadCost = 0;
        }
    }

    void calculateNumberOfTollPlazas() {
        if (RoadLenghtInKiloMeters >= 100) {
            NumberOfTollPlazas = RoadLenghtInKiloMeters / 100;
        } else {
            NumberOfTollPlazas = 0;
        }
    }

    void calculateProjectDurationInMonths() {
        if (RoadLenghtInKiloMeters >= 0) {
            double days = (RoadLenghtInKiloMeters * 1000) * 0.1;
            ProjectDurationInMonths = days / 30;
        } else {
            ProjectDurationInMonths = 0.0;
        }
    }

    void calculateRoadProjectTax() {
        if (RoadCost < 20) {
            RoadProjectTax = (2.0 / 100) * RoadCost;
        } else {
            RoadProjectTax = (3.0 / 100) * RoadCost;
        }
    }

    public int getRoadProjectID() {
        return RoadProject_ID;
    }

    public String getRoadProjectName() {
        return RoadProject_Name;
    }

    public int getRoadLenghtInKiloMeters() {
        return RoadLenghtInKiloMeters;
    }

    public double getRoadCost() {
        return RoadCost;
    }

    public int getNumberOfTollPlazas() {
        return NumberOfTollPlazas;
    }

    public double getProjectDurationInMonths() {
        return ProjectDurationInMonths;
    }

    public double getRoadProjectTax() {
        return RoadProjectTax;
    }

    public void displayInfo() {
        System.out.println();
        System.out.println("Project Name is = " + RoadProject_Name);
        System.out.println("Project ID = " + RoadProject_ID);
        System.out.println("Length of the Road (Km) = " + RoadLenghtInKiloMeters + "km");
        System.out.println("Total cost of the Project = " + RoadCost + "Million");
        System.out.println("No of tool Plazas = " + NumberOfTollPlazas);
        System.out.println("Project Duration = " + ProjectDurationInMonths + "Months");
        System.out.println("Total tax applied on the project = " + RoadProjectTax + "Million");
        System.out.println();
    }
}