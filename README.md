
---

# 🏨 Hotel Table Reservation System

A simple **Java multithreading project** that simulates a hotel table reservation system. It uses threads to handle multiple customer booking requests simultaneously, demonstrating **thread safety** using the `synchronized` keyword in Java.

---

## 📋 Features
- **Thread-Safe Booking System**: Ensures no race conditions while booking seats.
- **Multithreading in Action**: Uses Java threads to simulate concurrent user requests.
- **Real-World Scenario Simulation**: Models a real-life scenario where multiple customers request table bookings in a hotel simultaneously.

---

## 🚀 How It Works
1. The `Counter` class manages the seat availability and booking process.
2. The `BookingThread` class represents individual customers trying to book seats.
3. The `bookTicket` method in the `Counter` class is synchronized to prevent data inconsistency.
4. The `Booking` class is the main entry point where threads are created and started.

---

## 🛠️ Code Overview

### **1. `Counter.java`**
The core of the reservation system, this class:
- Tracks the number of available seats.
- Handles the booking process using the synchronized `bookTicket` method.

### **2. `BookingThread.java`**
A thread class representing individual customer booking requests:
- Accepts customer name and the number of seats requested.
- Calls the `bookTicket` method in `Counter`.

### **3. `Booking.java`**
The main class to:
- Initialize the `Counter` and multiple `BookingThread` objects.
- Start the threads to simulate concurrent booking requests.

---

## 📂 Project Structure
```
hotelTable/
├── reservation/
│   ├── client/
│   │   └── Booking.java        # Main class to run the program
│   └── system/
│       ├── BookingThread.java  # Thread class for individual booking requests
│       └── Counter.java        # Core class for managing bookings
```

---

## 🧪 How to Run
1. Clone this repository:
   ```bash
   git clone https://github.com/your-username/hotel-table-reservation.git
   ```
2. Navigate to the project directory:
   ```bash
   cd hotel-table-reservation
   ```
3. Compile the Java files:
   ```bash
   javac hotelTable/reservation/**/*.java
   ```
4. Run the `Booking` class:
   ```bash
   java hotelTable.reservation.client.Booking
   ```

---

## 💻 Example Output
Running the program will output something like this:
```
Hey, Soumik : 2 seats have been booked.
Hey, Shivam : Seats not available.
```

This output shows how the program handles concurrent booking requests and ensures thread safety.

---

## 📖 Concepts Demonstrated
- **Multithreading**: Simulates concurrent user actions using threads.
- **Synchronization**: Ensures only one thread modifies the shared resource (`availableSeats`) at a time.
- **Real-World Modeling**: Demonstrates a practical use case of table reservations in a hotel.

---

## 🤝 Contributing
Feel free to fork this repository and contribute! You can:
- Add more features, such as dynamic seat availability.
- Improve the logging or extend functionality.

---

## 📜 License
This project is licensed under the [MIT License](LICENSE).

---

## 🌟 Acknowledgments
Special thanks to everyone exploring Java multithreading with this simple yet educational project! 🙌

---
