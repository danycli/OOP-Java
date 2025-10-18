============================================================
                   PART 4: FOODORDER PROGRAM
============================================================

>> OVERVIEW <<
------------------------------------------------------------
This project implements the "FoodOrder" class for a food 
shop's ordering system. The program demonstrates constructor 
overloading, object-oriented design, and dynamic billing 
calculations for different order types such as "Dine-In" 
and "Home Delivery".


>> MAIN FEATURES <<
------------------------------------------------------------
• Complete FoodOrder Class Implementation
  - Includes data members to store order details:
      → Order ID
      → Customer Name
      → Order Type (Dine-In or Home Delivery)
      → Food or Drink Type
      → Quantity/Size
      → Drink Name (if applicable)
      → Price, Tax, Delivery Charges, Final Bill

• Constructor Overloading
  - Allows creation of objects for different scenarios:
      → Dine-In orders
      → Home Delivery orders

• Getter and Setter Methods
  - Provide controlled access and modification of private data 
    members.

• Billing Methods
  - Calculates taxes for each item.  
  - Adds delivery charges for Home Delivery orders.  
  - Computes the final bill dynamically based on order type.

• Display Method
  - Shows complete order details including type, items, tax, 
    delivery charges, and total bill.


>> LEARNING OBJECTIVES <<
------------------------------------------------------------
• Understand and apply constructor overloading in Java.  
• Implement encapsulation through getters and setters.  
• Apply conditional logic to differentiate between order types.  
• Create methods for calculating tax, delivery charges, and 
  total billing.


>> SAMPLE OUTPUT <<
------------------------------------------------------------
Enter Order Type (1-Dine-In, 2-Home Delivery): 2
Enter Customer Name         : Sara Ahmed
Enter Item Type (Food/Drink): Drink
Enter Drink Name            : Cola
Enter Drink Size (litres)   : 1.5
Enter Quantity               : 3

Order Details:
------------------------------------------------------------
Customer Name      : Sara Ahmed
Order Type         : Home Delivery
Item Type          : Drink
Drink Name         : Cola
Drink Size         : 1.5 L
Quantity           : 3
Tax                : Rs. 27.00
Delivery Charges   : Rs. 50.00
Final Bill         : Rs. 327.00

============================================================
                    END OF DOCUMENT
============================================================
