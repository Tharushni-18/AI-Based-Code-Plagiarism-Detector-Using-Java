📄 AI-Based Code Plagiarism Detector Using Java

   This project is a **Code Plagiarism Detection System** built using Java.
   It compares two source code files and calculates their similarity based on **tokenization and structural analysis**, rather than simple text matching.



 🚀 Features

* 🔍 Detects similarity between two code files
* 🧹 Removes comments and unnecessary spaces
* 🔄 Tokenizes code for logical comparison
* 📊 Calculates similarity using Jaccard Algorithm
* 📄 Generates a report (`report.txt`)
* ⚡ Fast and lightweight (single file implementation)


 🧠 How It Works

1. **File Input**
   Reads two code files (`code1.java`, `code2.java`)

2. **Preprocessing**

   * Removes comments
   * Cleans extra spaces

3. **Tokenization**

   * Converts code into tokens
   * Normalizes variable names

4. **Similarity Calculation**
   Uses Jaccard similarity.

5. **Output**

   * Displays similarity percentage
   * Generates report file



🛠️ Tech Stack

* Language: Java
* Concepts: Tokenization, String Processing
* Algorithm: Jaccard Similarity
* File Handling: Java I/O


 📁 Project Structure


PlagiarismDetector/

│── Main.java

│── code1.java

│── code2.java

│── report.txt (generated)


 ▶️ How to Run

   1️⃣ Compile

            ```
             
             javac Main.java
            
            ```

   2️⃣ Run

           ```
           
              java Main

            ```


📥 Sample Input

     code1.java

     java
          int a = 10;
          int b = 20;
          System.out.println(a + b);


     code2.java

     java
          int x = 10;
          int y = 20;
          System.out.println(x + y);




 📤 Sample Output


Similarity: 85.0%
Report generated: report.txt



✅ Advantages

* Detects logical similarity (not just text)
* Easy to use and lightweight
* Good for academic use



❌ Disadvantages

* Limited to basic token comparison
* No deep syntax tree analysis
* Works best with simple programs



 🔮 Future Improvements

* Add Abstract Syntax Tree for better accuracy
* Build GUI using Java Swing
* Convert to web app
* Multi-language support
* Add graphical visualization






