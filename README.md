Here is a complete `README.md` file for your `FashionShop.java` project, including the compile and run commands as requested.

-----

# 🛍️ Fashion Shop CLI

```
/$$$$$$$$                                /$$        /$$                     /$$$$$$  /$$
| $$_____/                               | $$       |__/                    /$$__  $$| $$
| $$      /$$$$$$   /$$$$$$$| $$$$$$$   /$$  /$$$$$$  /$$$$$$$      | $$  \__/| $$$$$$$   /$$$$$$   /$$$$$$
| $$$$$  |____  $$ /$$_____/| $$__  $$| $$ /$$__  $$| $$__  $$      |  $$$$$$ | $$__  $$ /$$__  $$ /$$__  $$
| $$__/   /$$$$$$$|  $$$$$$ | $$  \ $$| $$| $$  \ $$| $$  \ $$       \____  $$| $$  \ $$| $$  \ $$| $$  \ $$
| $$     /$$__  $$ \____  $$| $$  | $$| $$| $$  | $$| $$  | $$       /$$  \ $$| $$  | $$| $$  | $$| $$  | $$
| $$    |  $$$$$$$ /$$$$$$$/| $$  | $$| $$|  $$$$$$/| $$  | $$      |  $$$$$$/| $$  | $$|  $$$$$$/| $$$$$$$/
|__/     \_______/|_______/ |__/  |__/|__/ \______/ |__/  |__/       \______/ |__/  |__/ \______/ | $$____/
                                                                                                | $$
                                                                                                | $$
                                                                                                |__/
```

This is a simple, single-file, command-line interface (CLI) application for managing t-shirt orders for a fashion shop. It's written in pure Java and uses parallel arrays to manage all application data in memory.

-----

## ✨ Features

The application provides a main menu with the following functionalities:

  * **[1] Place Order:**

      * Generates a new Order ID (e.g., `ODR#00001`).
      * Validates and captures a 10-digit customer phone number.
      * Takes T-Shirt size (XS, S, M, L, XL, XXL) and quantity.
      * Calculates the total amount based on size and quantity.
      * Asks for final confirmation before placing the order.

  * **[2] Search Customer:**

      * Finds a customer using their phone number.
      * Displays a detailed report of all items purchased by that customer, aggregated by size (total QTY and total Amount per size).

  * **[3] Search Order:**

      * Finds a specific order using its Order ID.
      * Displays all details for that order: Phone Number, Size, QTY, Amount, and current Status.

  * **[4] View Reports:**

      * A sub-menu for various aggregated reports:
      * **Customer Reports:**
          * `[1] Best in Customers`: Lists all customers, sorted by the total quantity they have purchased.
          * `[2] View Customers`: Lists all unique customers and their total QTY and Amount.
          * `[3] All Customer Report`: A detailed breakdown of purchases by size for every customer.
      * **Item Reports:**
          * `[1] Sorted by QTY`: Shows total sales (QTY and Amount) for each T-shirt size, sorted from most sold to least sold.
          * `[2] Sorted by Amount`: Shows total sales (QTY and Amount) for each T-shirt size, sorted by the highest revenue.
      * **Order Reports:**
          * `[1] All Orders`: Lists every order in the system with all details.
          * `[2] Orders By Amount`: Sorts and lists all orders from highest amount to lowest.

  * **[5] Set Order Status:**

      * Allows the user to update the status of an order.
      * An order can be changed from `PROCESSING` -\> `DELIVERING` or `PROCESSING` -\> `DELIVERED`.
      * An order can be changed from `DELIVERING` -\> `DELIVERED`.
      * A `DELIVERED` order status cannot be changed.

  * **[6] Delete Order:**

      * Finds an order by its ID.
      * Asks for confirmation before permanently deleting the order from the system.

-----

## 🚀 How to Run

### Prerequisites

You must have the **Java Development Kit (JDK)** installed on your machine to compile and run the program.

### 1\. Compile

Save the code as `FashionShop.java`. Open your terminal or command prompt, navigate to the directory where you saved the file, and run the **`javac`** (Java Compiler) command:

```bash
javac FashionShop.java
```

This will create a `FashionShop.class` file in the same directory.

### 2\. Run

Once the code is compiled, run the **`java`** (Java Runtime) command to start the application. Note that you **do not** add the `.class` extension.

```bash
java FashionShop
```

The application will start, clear the console, and display the main menu.

-----

## 📝 Code Structure

  * **Single-File Application:** All logic is contained within the `FashionShop.java` file.
  * **Static Methods & Variables:** The program does not use instances or objects. All methods and arrays are `static`, meaning they belong to the class itself.
  * **Parallel Arrays:** The core data structure. Instead of an `Order` object, the program uses multiple arrays where the same index (`i`) corresponds to the same order.
      * `orderIdArray[i]`
      * `customerPhoneArray[i]`
      * `sizeArray[i]`
      * `qtyArray[i]`
      * `amountArray[i]`
      * `statusArray[i]`
  * **Dynamic Array Management:** Methods like `extendArray()` and `deleteCustomer(index)` are used to manually resize the arrays by creating a new, larger (or smaller) array and copying the data over.
  * **In-Memory Storage:** All order data is stored in memory. **This means all data will be lost when the application is closed.**
