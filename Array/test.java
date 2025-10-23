public static void main(String[] args) {
        // Create an array of marks
        int[] marksArray = {85, 90, 78, 88, 92};

        // Create Student object using constructor
        Student student1 = new Student("Ali", marksArray);

        // Display data using method
        student1.displayInfo();

        // Update name and marks using setters
        student1.setName("Sara");
        int[] newMarks = {95, 89, 76, 91, 87};
        student1.setMarks(newMarks);

        // Display updated data
        System.out.println("\nAfter updating data:");
        student1.displayInfo();
    }
}