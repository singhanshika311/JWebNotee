# 📝 JWebNote – Java Swing App Running in Browser (via CheerpJ)

JWebNote is a simple Java Swing notes application that runs directly inside the browser using CheerpJ 3.0.  
The goal of this project is to demonstrate how traditional Java desktop applications can be modernized and executed on the web without rewriting them.

---

## 🚀 Inspiration
Many companies still depend on legacy Java Swing applications that are hard to distribute, maintain, and run on modern systems. Rewriting them into JavaScript/React takes huge effort.

CheerpJ solves this by allowing original Java bytecode (JAR files) to run inside the browser.  
This project is a minimal working example showing that your existing Java application can run on the web instantly.

---

## 📌 What It Does
- Loads a Java Swing notes application from a `.jar` file  
- Runs it inside Chrome/Safari/Firefox without Java installed  
- Uses CheerpJ WebAssembly runtime  
- Works fully client-side  
- Demonstrates UI rendering and file operations in the browser  

---

## 🛠️ How We Built It

### 1. **Java Swing Application**
A simple Java Swing UI was created with:
- `JFrame` (main window)  
- `JTextArea` (typing notes)  
- `JMenu` (File → Save / Load)  
- A `Main` class to run the app  

The application is packaged as `JWebNote.jar` and placed inside:
target/JWebNote.jar


### 2. **HTML + CheerpJ**
Inside  


src/main/java/org.example/index.html

We load the CheerpJ runtime:

```html
<script src="https://cjrtnc.leaningtech.com/3.0/loader.js"></script>


A button launches the Java UI:

async function runApp() {
    await cheerpjInit();
    cheerpjRunJar("/JWebNote.jar");
}


This runs the full Java application inside the browser.

### 📂 Project Structure
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

### ▶️ How to Run the Project (Mac / Windows / Linux)
Step 1 — Build JAR

Run in IntelliJ terminal:

mvn clean package


Your JAR will be created in:

target/JWebNote.jar

Step 2 — Start Local Server

Open terminal in project root:

cd JWebNote
python3 -m http.server 8080

Step 3 — Open Browser

Go to:

http://localhost:8080/src/main/java/org.example/index.html


Click Run Notes App → Your Java Swing UI loads in browser 🎉

😤 Challenges We Faced

Mapping desktop Java UI to browser environment

Getting correct JAR path inside CheerpJ sandbox

Understanding async initialization (cheerpjInit)

Browser security restrictions for file dialogs

Packaging JAR via Maven/IntelliJ

🏆 Accomplishments

Successfully ran a Java Swing app inside a browser

No changes required in Java source code

100% client-side execution

Clean minimal working example suitable for Devpost

Shows power of modernizing Java apps using CheerpJ

📚 What We Learned

How CheerpJ converts JVM bytecode to WebAssembly

Browser sandbox rules for running Java applications

Basics of Maven packaging

How to embed Java apps inside HTML

Difference between JVM runtime vs CheerpJ runtime

🔮 What's Next for JWebNote

Add dark mode

Add auto-save using browser storage (IndexedDB)

Add multiple notes workspace

Deploy to GitHub Pages

Add keyboard shortcuts (Ctrl+S, Ctrl+O)

Create a PWA version of the app

Add drag-and-drop file opening

🧑‍💻 Author

Anshika Singh

⭐ Conclusion

JWebNote demonstrates that even legacy Java desktop applications can run seamlessly inside modern web browsers with the help of CheerpJ — without rewriting code. This project showcases a clean, simple, and practical example of Java-to-Web modernization.
