package Convo;

public class convocation {

    // ----------------------------
    // Data Members
    // ----------------------------
    private final String Name; 
    private int convocationId;
    private String convocationYear; // e.g. "2025"
    private int[] studentIds = new int[100]; // can store up to 100 students
    private double convocationTotalCost; // total cost for this convocation

    static final String UniversityName = "COMSATS University"; // constant shared by all
    static double totalConvocationObjectsCreated = 0; // count of total objects

    // ----------------------------
    // Constructors
    // ----------------------------
    public convocation(int convocationId, String convocationYear, String Name) {
        this.convocationId = convocationId;
        this.convocationYear = convocationYear;
        totalConvocationObjectsCreated++; // increment count when object is created
        this.Name = Name;
    }

    // ----------------------------
    // Setter Methods
    // ----------------------------
    public void setConvocationId(int convocationId) {
        this.convocationId = convocationId;
    }

    public void setConvocationYear(String convocationYear) {
        this.convocationYear = convocationYear;
    }

    public void setStudentIds(int[] studentIds) {
        this.studentIds = studentIds.clone();
    }

    // ----------------------------
    // Getter Methods
    // ----------------------------
    public int getConvocationId() {
        return convocationId;
    }

    public String getConvocationYear() {
        return convocationYear;
    }

    public int[] getStudentIds() {
        return studentIds.clone();
    }

    public double getConvocationTotalCost() {
        return convocationTotalCost;
    }

    // ----------------------------
    // Method: calculateConvocationTotalCost
    // ----------------------------
    public void calculateConvocationTotalCost(float extraAmount) {
        int studentCount = 0;

        // Count valid student IDs (non-zero entries)
        for (int id : studentIds) {
            if (id != 0) {
                studentCount++;
            }
        }

        // Each student costs 400.2 Rs
        double costPerStudent = 400.2;
        convocationTotalCost = (studentCount * costPerStudent) + extraAmount;
    }

    // ----------------------------
    // Method: displayInfo
    // ----------------------------
    public void displayInfo() {
        System.out.println("----------- Convocation Details -----------");
        System.out.println("University Name      : " + UniversityName);
        System.out.println("Convocation ID       : " + convocationId);
        System.out.println("Convocation Year     : " + convocationYear);
        System.out.println("Students Registered  : " + getStudentCount());
        System.out.println("Total Cost (Rs)      : " + convocationTotalCost);
        System.out.println("------------------------------------------");
    }

    private int getStudentCount() {
        int count = 0;
        for (int id : studentIds) {
            if (id != 0) count++;
        }
        return count;
    }

    // ----------------------------
    // Static Method: displayTotalConvocationObjectsCreatedSoFar
    // ----------------------------
    public static void displayTotalConvocationObjectsCreatedSoFar() {
        System.out.println("Total Convocation Objects Created So Far: " + totalConvocationObjectsCreated);
    }

    // ----------------------------
    // Method: SumOfConvocationTotalCosts
    // ----------------------------
    public double SumOfConvocationTotalCosts(convocation Cx, convocation Cy, convocation Cz) {
        double sum = 0;

        if (hasSameDigits(Cx.convocationId)) sum += Cx.convocationTotalCost;
        if (hasSameDigits(Cy.convocationId)) sum += Cy.convocationTotalCost;
        if (hasSameDigits(Cz.convocationId)) sum += Cz.convocationTotalCost;

        return sum;
    }

    // Helper: Check if ID consists of same digits (e.g., 333, 7777)
    private boolean hasSameDigits(int num) {
        String s = String.valueOf(num);
        char first = s.charAt(0);
        for (char c : s.toCharArray()) {
            if (c != first) return false;
        }
        return true;
    }
}
