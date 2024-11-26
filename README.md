# Calculator 🧮
**Calculator** is a simple calculator program that performs various mathematical operations. Supports addition, subtraction, multiplication, division, percentage, exponentiation, factorial, odd/even checks, absolute values, and average calculations.

## Key Features
- **Basic mathematical operations** Addition, subtraction, multiplication, and  division.
- **Percentage**
- **Exponentiation**
- **Odd/Even Checks**
- **Absolute Value**
- **Average Calculation**

## Class Details

1. **App** class is the entry point of the calculator program. It interacts with the user via the `Scanner s1`  and performs the following:
- Displays a menu of operations.
- handles user inputs and manages invalid entries.
- Calls appropriate methods in the `operations` class for calculations.
---
### **Features in `App` class**
####  **Menu Options**
The program supports the following operations:
 
 0. Exit
1. Addition
2. Subtraction
3. Multipliction
4. Division
5. Percentage
6. Exponentiation
7. Factorial
8. Odd/Even Check
9. Absolute Value
10. Average

####  **Error Handling**
-  Invalid inputs trigger a warning:
`"Invalid input! Please enter a valid number next time ."`  
---


2. **operations** class contains the mathematical methods used by the calculator.
- Includes all the main mathematical operations supported by the program.
- Acts as a helper class to the primary class `App.java`.




<!--stackedit_data:
eyJoaXN0b3J5IjpbNTIxNDk0MjExLC04ODg2NzIzMzEsLTE5Nj
E5NjUyNDYsLTE5NzM5ODI5NDEsMTE4MTQ5ODg2NSwtNDQ2MzE5
MTQyLDIwNDIyNzkyMDksNDI0NTYyOTA0XX0=
-->