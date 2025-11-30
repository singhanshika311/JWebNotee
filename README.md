# 📝 JWebNote – Java Swing App Running in the Browser (via CheerpJ)

**JWebNote** is a simple Java Swing notes application that runs directly inside the browser using **CheerpJ 3.0**.  
The goal of this project is to demonstrate how traditional Java desktop applications can be modernized and executed on the web *without rewriting them*.

---

## 🚀 Inspiration
Many companies still rely on old Java Swing desktop applications that are difficult to distribute, maintain, and run on modern systems. Rewriting these apps in JavaScript/React takes huge effort and time.

**CheerpJ solves this problem** by running original Java bytecode (JAR files) directly inside the browser using WebAssembly.  
This project is a minimal working example showing how any existing Java application can instantly run on the web.

---

## 📌 What It Does
- Loads and runs a Java Swing notes app from a `.jar` file  
- Works in Chrome, Safari, Firefox — without Java installed  
- Uses CheerpJ’s WebAssembly runtime  
- Runs completely client-side  
- Demonstrates UI rendering and simple file operations inside the browser  

---

## 🛠️ How We Built It

### **1. Java Swing Application**
We created a classic Swing-based Notes app featuring:
- `JFrame` as the main window  
- `JTextArea` to type notes  
- A `JMenu` with **Save** & **Load** options  
- A `Main` class that launches the UI  

The application is packaged into a JAR.

---

📂 Project Structure
JWebNote/
 ├── src/
 │   └── main/
 │       ├── java/
 │       │   └── org.example/
 │       │       └── index.html
 │       └── resources/
 ├── target/
 │   └── JWebNote.jar
 ├── pom.xml
 └── README.md

 ---

 😤 Challenges We Ran Into

Mapping desktop Java UI into a browser sandbox

Handling correct relative paths for JAR loading

CheerpJ async initialization (cheerpjInit)

Understanding browser security for file dialogs

Ensuring Maven packaging produces a runnable JAR

Getting Java GUI to behave inside HTML canvas

