============================================================
               PART 3: VEHICLERESERVATION PROGRAM
============================================================

>> OVERVIEW <<
------------------------------------------------------------
This project implements the "VehicleReservation" class as per 
the assignment requirements. It focuses on the use of static 
members, constructors, and conditional display logic to handle 
vehicle parking and billing operations in an OOP environment.


>> MAIN FEATURES <<
------------------------------------------------------------
• Complete VehicleReservation Class Implementation
  - Includes data members for:
      → vehicleID
      → vehicleOwnerName
      → vehicleType
      → totalTimeInMinutesForParking
      → parkingSlotId
      → bill
      → tax
      → static counter for total vehicles in parking

• Static Counter
  - Tracks the total number of vehicles currently parked.
  - Updated automatically when new VehicleReservation objects 
    are created.

• Method Improvements
  - DisplayCurrentlyTotalVehiclesInTheParking():
        → Corrected by adding the static modifier to properly 
          align with assignment specifications.
  - DisplayInfo():
        → Enhanced to dynamically display either:
             • The final bill (if parking duration is complete)
             • OR a message indicating that the car is still parked.
        → Makes output more interactive and user-friendly.

• Billing Logic
  - Calculates the final bill and tax based on total parking time.
  - Ensures accurate and clear cost representation.


>> LEARNING OBJECTIVES <<
------------------------------------------------------------
• Implement static members to track shared data across objects.  
• Strengthen understanding of constructors and object behavior.  
• Apply conditional statements to create dynamic output.  
• Practice writing clear and user-oriented display methods.


>> SAMPLE OUTPUT <<
------------------------------------------------------------
Enter Vehicle ID : V-302
Enter Owner Name : Ali Khan
Enter Vehicle Type : Car
Enter Parking Time (in minutes): 180

Vehicle Details:
------------------------------------------------------------
Vehicle ID         : V-302
Owner Name         : Ali Khan
Vehicle Type       : Car
Parking Duration   : 180 minutes
Parking Slot ID    : 12
Bill + Tax         : Rs. 540.00
Status             : Vehicle has been billed and exited.

Currently Parked Vehicles: 1

============================================================
                    END OF DOCUMENT
============================================================
