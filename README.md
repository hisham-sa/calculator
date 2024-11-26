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
###  **Features in `App` class**
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
---
## How to use
1. **Launch the Program**:
- run the program using a Java development environment (e.g., NetBeans)

2. **Select an Operation**:
- Choose an operation by entering a number between `1` and `10` based on the menu.
- Enter `0` to exit the program.

3. **Provide Input**:
- Depending on the operation, the program will prompt you to enter one or more numbers.

4. **View Results**:
- The result of the operation will be displayed as output.
- You can repeat the process for other operations or exit the program.

### Example Usage
- ####   Addition
1. Run the program.
2. Enter `1` for addition.
3. Input two numbers, e.g., `5` and `5`.
4. Output: `The result is: 10`.
5. 
- ### Factorial
1- Run the program.
2. Enter `7`









<!--stackedit_data:
eyJoaXN0b3J5IjpbMTQzMTE4NjI2NywxOTE5OTM4ODYsLTE3Mj
YzNTM5OTEsNTIxNDk0MjExLC04ODg2NzIzMzEsLTE5NjE5NjUy
NDYsLTE5NzM5ODI5NDEsMTE4MTQ5ODg2NSwtNDQ2MzE5MTQyLD
IwNDIyNzkyMDksNDI0NTYyOTA0XX0=
-->