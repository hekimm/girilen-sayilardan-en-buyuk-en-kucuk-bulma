# Find Minimum and Maximum Numbers

## Overview

This Java program finds the **largest** and **smallest** numbers from a list of numbers entered by the user. The user specifies how many numbers they will enter, and the program determines the maximum and minimum values among them.

## How It Works

1. **Input**: The user is prompted to enter the total number of values they want to input (`numberOfNumbers`).
2. **Initial Value**: The first number (`ilkSayi`) is entered and used as the initial value for both the maximum (`enBuyuk`) and minimum (`enKucuk`) variables.
3. **Loop Through the Remaining Numbers**: The program then uses a `for` loop to take additional inputs:
   - For each value, it compares the value to the current maximum and minimum.
   - If the current value is greater than the maximum, the maximum value is updated.
   - If the current value is less than the minimum, the minimum value is updated.
4. **Output**: Once all numbers have been entered, the program prints the largest and smallest numbers to the console.

## How to Run the Program

1. Make sure you have Java installed on your system.
2. Copy the Java code into a file named `Main.java`.
3. Compile the Java file using the following command:

   ```
   javac Main.java
   ```

4. Run the program with the following command:

   ```
   java Main
   ```

5. Enter the number of values and each value when prompted. The program will calculate and display the largest and smallest numbers.

## Example Output

```
Kaç adet sayı gireceksiniz:
5
İlk sayıyı giriniz:
10
bir sayı giriniz
5
bir sayı giriniz
20
bir sayı giriniz
3
bir sayı giriniz
15
Girilen sayilardan en büyüğü : 20
Girilen sayilardan en küçüğü : 3
```

## Author

This program was created by **hekimcanaktas**.

## License

This project is licensed under the MIT License. You are free to use, modify, and distribute this software. See the [LICENSE](LICENSE) file for more details.



