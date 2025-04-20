# Random Star Printer

This is a basic Java program that prints a random number of asterisks (`*`) to the console every second. The number of asterisks printed ranges from 1 to 14, and the output refreshes every 1 second.

## Features

- Prints a random number of stars between 1 and 14.
- Runs the task repeatedly every second.
- Demonstrates the use of `Timer`, `TimerTask`, and `Random`.

## How It Works

1. A `Random` object generates a random integer between 1 and 14.
2. A `TimerTask` is scheduled to run every 1 second.
3. On each run, the program prints that many `*` characters on a new line.

## How to Run

1. Make sure you have Java installed (Java 8 or higher).
2. Compile the program:
   ```bash
   javac Main.java
   ```
3. Run the program:
   ```bash
   java Main
   ```
   
## Example Output
```
*
************
********
********
******
********
```

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
