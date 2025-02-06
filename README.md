# **IRCTC Booking System 🚅**  
*A Java-Based Railway Ticket Booking System*  

  

---

## **📌 Project Overview**  
The **IRCTC Booking System** is a **Core Java-based** project designed to simulate a railway ticket booking platform similar to **Indian Railway Catering and Tourism Corporation (IRCTC)**. It includes **user registration, ticket booking, train scheduling, payment processing, booking history, and admin functionalities**.  

✅ **Tech Stack:** Java (Core Java, Collections, OOPs)  


---

## **📂 Project Structure**  

📦 core-java-irctc-booking-system ┣ 📂 src/com/irctcbooking ┃ ┣ 📂 model # POJO Classes ┃ ┣ 📂 service # Business Logic ┃ ┣ 📂 repository # Data Management ┃ ┣ 📂 controller # Handles User Requests ┃ ┗ 📂 utility # Helper Classes ┣ 📜 README.md # Project Documentation ┣ 📜 LICENSE # License Information ┗ 📜 .gitignore # Git Ignore File

---

## **⚡ Features & Functionalities**  

### **👤 User Management**
- **User Registration & Login** 🔐  
- Secure authentication system  

### **🚆 Train Management**
- **Search & Filter Trains** by **source, destination, and train type**  
- Display **departure & arrival time, seat availability, and fare details**  

### **🎟 Ticket Booking System**
- **PNR Generation** for booked tickets  
- **Seat Allocation & Confirmation**  
- **View & Cancel Bookings**  

### **💳 Payment Processing**
- **Payment Methods:** UPI, Credit/Debit Card, Net Banking  
- **Transaction Status:** Successful / Failed  

### **📜 Booking History & Notifications**
- View **past bookings** with payment status  
- Receive **alerts for train schedule changes, cancellations, or delays**  

### **👨‍💼 Admin Dashboard**
- Manage **Train Schedules, User Bookings, and Payment Records**  
- Modify **Ticket Pricing & Availability**  

---

## **📝 Database Schema (POJO Classes)**
| **Entity**          | **Attributes** |
|---------------------|----------------------------------------------------------|
| **User**           | userId, fullName, username, email, password, phoneNo |
| **Train**          | trainId, trainName, sourceStation, destinationStation, departureTime, arrivalTime, totalSeats, availableSeats, pricePerSeat |
| **Ticket**         | ticketId, pnrNumber, userId, trainName, seatNumber, departureTime, bookingDate, ticketPrice |
| **Payment**        | paymentId, ticketId, userId, paymentDate, paymentMethod, amount, paymentStatus |
| **Booking History** | bookingId, userId, trainName, ticketId, paymentId |
| **Notifications**  | notificationAlertId, userId, type, message, dateTime |
| **Admin**          | adminId, adminName, adminEmail, adminPhone |

---
