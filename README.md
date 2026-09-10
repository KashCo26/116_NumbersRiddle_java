# 1.1.6 Numbers Riddles
# Project 1.1.6: Numbers Riddle

## Project Description

This project demonstrates the **Numbers Riddle** program in Java. The program tests a math riddle across various numeric inputs to verify that performing a specific sequence of arithmetic operations always yields the expected result.

---

## Scoring Checklist & Requirements

### Part A. Program Code (60 Points)

* **Display Original Number (+6):** Prints the starting test value prior to execution.
* **Perform Operation (+30):** Executes each step of the riddle operations (Multiply by 2, Add 6, Divide by 2, Subtract starting number).
* **Display Results (+24):** Outputs the result after each arithmetic operation step.

### Part B. Test Values (6 Points)

The program supplies and tests the riddle with six distinct categories of input:

* **Positive Integer** (e.g., `5`)
* **Negative Integer** (e.g., `-5`)
* **Zero** (`0`)
* **One** (`1`)
* **Positive Double** (e.g., `5.5`)
* **Negative Double** (e.g., `-5.5`)

---

## Riddle Logic Steps

1. **Start:** Select a test number.
2. **Multiply by 2:** Double the starting number.
3. **Add 6:** Add 6 to the doubled value.
4. **Divide by 2:** Halve the current result.
5. **Subtract Original:** Subtract the initial test value from the current result.

---

## Example Usage & Code Structure

```java
public class NumbersRiddle {
    public static void main(String[] args) {
        double startingNumber = 1.0; // Replace with any test value

        // Display original number
        System.out.println("Starting Number: " + startingNumber);

        // Step 1: Multiply by 2
        double numberDoubled = startingNumber * 2;
        System.out.println("Number Doubled: " + numberDoubled);

        // Step 2: Add 6
        double addSix = numberDoubled + 6;
        System.out.println("Add 6: " + addSix);

        // Step 3: Divide by 2
        double divideHalf = addSix / 2;
        System.out.println("Divide by 2: " + divideHalf);

        // Step 4: Subtract Starting Number
        double subtractStarting = divideHalf - startingNumber;
        System.out.println("Subtract Starting Number: " + subtractStarting);
    }
}


```
<img width="249" height="84" alt="image" src="https://github.com/user-attachments/assets/986ef7eb-0f2e-4e99-910d-54225063fdf2" />

<img width="226" height="83" alt="image" src="https://github.com/user-attachments/assets/2a1185b0-7b5b-4099-8116-bb16ef282dfc" />

<img width="231" height="84" alt="image" src="https://github.com/user-attachments/assets/201131f3-5343-4e05-8a80-4425b15c856d" />

<img width="223" height="84" alt="image" src="https://github.com/user-attachments/assets/94404fb0-1018-4fce-bc4b-689b61de4dc2" />

<img width="265" height="91" alt="image" src="https://github.com/user-attachments/assets/47a781a8-891a-443a-a511-2a22dc3ddda1" />

<img width="255" height="86" alt="image" src="https://github.com/user-attachments/assets/22e71a84-0b04-4555-8ea2-a443cf9a8a06" />
