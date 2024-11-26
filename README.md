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
- ####   Addition:
1. Run the program.
2. Enter `1` for addition.
3. Input two numbers, e.g., `5` and `5`.
4. Output: `The result is: 10.0`.

- ### Factorial:
1. Enter `7` for factorial.
2. input non-negative integer e.g., `5`.
3. Output: `The result is: 120`.

- ### Calculating Average:
1. Enter `10` to calculate the average
2. Provide a series of numbers (e.g., `9`, `5`, `1`).
3. Type `stop` to end input.
4. Output: `The AVG is: 5`.

---
##  **Error Handling**
-  Invalid inputs trigger a warning:
`"Invalid input! Please enter a valid number next time."`  
- Attempts to divide by zero are handled gracefully, displaying a warning message:
`Division by zero is not allowed`
- The program prevents negative numbers for factorial and informs the user about it:
`Factorial is not defined for negative numbers.`

---
## Project Structure
```text
calculator/
├── App.java         # Contains the main program logic and user interaction
└── operations.java  # Includes mathematical methods and helper functions









<!--stackedit_data:
eyJoaXN0b3J5IjpbLTExNzc1MDMyNzYsLTU4OTI3NjM1OSwxNz
MwMjAyNDU2LDE5MTk5Mzg4NiwtMTcyNjM1Mzk5MSw1MjE0OTQy
MTEsLTg4ODY3MjMzMSwtMTk2MTk2NTI0NiwtMTk3Mzk4Mjk0MS
wxMTgxNDk4ODY1LC00NDYzMTkxNDIsMjA0MjI3OTIwOSw0MjQ1
NjI5MDRdfQ==
-->