============================================================
                     PART 2: DRAMA PROGRAM
============================================================

>> OVERVIEW <<
------------------------------------------------------------
This project contains the complete implementation of the 
"Drama" class, developed according to the given partial code 
and assignment requirements. It focuses on applying 
Object-Oriented Programming concepts such as static members, 
constructors, encapsulation, and method overloading.


>> MAIN FEATURES <<
------------------------------------------------------------
• Complete Drama Class Implementation
  - Defines all required data members, including:
      → dramaId
      → dramaName
      → actorsFee[] array
      → dramaTotalCost
      → static companyName
      → static counter for total objects created

• Constructors
  - Two-argument constructor initializes drama ID and name.
  - Automatically increments the static object counter 
    each time a new object is created.

• Getter and Setter Methods
  - Provide controlled access and modification of private 
    data members.

• Utility Methods
  - calculateDramaTotalCost():
        → Calculates the total cost by summing all actors’ fees.
  - displayInfo():
        → Displays full drama details including ID, name, 
          total cost, and company name.
  - countEqualCosts(Drama D2, Drama D3):
        → Compares the total cost of three dramas and 
          returns how many share the same value.

• Static Members
  - "companyName" represents a shared production house name.
  - "totalDramaObjectsCreated" tracks how many Drama objects 
    have been instantiated.


>> LEARNING OBJECTIVES <<
------------------------------------------------------------
• Practice the use of static variables and methods.  
• Understand constructor-based initialization and counting.  
• Implement encapsulation through getter and setter methods.  
• Apply logic for comparison and cost calculation among objects.


>> SAMPLE OUTPUT <<
------------------------------------------------------------
Enter Drama ID : 101
Enter Drama Name : The Shadow Stage
Enter Actor Fees : [10000, 15000, 20000, 12000]

Drama Details:
------------------------------------------------------------
Drama ID          : 101
Drama Name        : The Shadow Stage
Total Cost        : 57000.0
Company Name      : The Random Productions
Total Objects     : 3

============================================================
                    END OF DOCUMENT
============================================================
