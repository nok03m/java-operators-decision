# Core Java & Object-Oriented Programming Workshop 🚀

[![Java](https://img.shields.io/badge/Java-21-orange.svg)](https://www.oracle.com/java/)
[![IDE](https://img.shields.io/badge/IDE-IntelliJ%20IDEA-blue.svg)](https://www.jetbrains.com/idea/)
[![Paradigm](https://img.shields.io/badge/Paradigm-OOP%20%26%20Structured-green.svg)]()
[![License](https://img.shields.io/badge/License-MIT-purple.svg)](LICENSE)

A comprehensive, production-grade learning repository containing exercises, interactive console applications, and in-depth debugging case studies covering **Java Operators**, **Decision Structures**, **Loop Mechanisms**, **String Manipulation**, and **Object-Oriented Programming (OOP)**.

---

## 📌 Table of Contents

- [About the Project](#-about-the-project)
- [Module Breakdown](#-module-breakdown)
  - [1. Operators & Decision Making (`com.taller.practico`)](#1-operators--decision-making-comtallerpractico)
  - [2. Loop Structures & Iteration (`com.taller.ciclos`)](#2-loop-structures--iteration-comtallerciclos)
  - [3. String Manipulation & Console Games (`com.educacion.ahorcado`)](#3-string-manipulation--console-games-comeducacionahorcado)
  - [4. Object-Oriented Programming (`com.taller.poo`)](#4-object-oriented-programming-comtallerpoo)
- [Project Directory Structure](#-project-directory-structure)
- [Prerequisites](#-prerequisites)
- [Compilation & Execution](#-compilation--execution)
- [Debugging & Conceptual Case Studies](#-debugging--conceptual-case-studies)
- [Contributing](#-contributing)
- [License](#-license)

---

## 📖 About the Project

This repository serves as a structured, progressive pathway through Java core fundamentals and Object-Oriented design. Each package targets a specific programming competency—from low-level operator precedence and control flow branching to encapsulated domain entities, constructor overloading, static utility design, memory analysis (primitives vs. wrappers), and defensive debugging.

---

## 🔍 Module Breakdown

### 1. Operators & Decision Making (`com.taller.practico`)
Focuses on conditional flow control and arithmetic/relational/logical operators:
- **`AgeClassification.java`**: Age category evaluation using multi-branch conditional structures.
- **`GradingAttendanceSystem.java`**: Academic pass/fail evaluation combining grades and attendance percentages.
- **`RetailSimulator.java`**: Tiered discount and checkout calculations using boolean logic.
- **`TicketCalculator.java`**: Dynamic cinema ticket pricing based on age and day of the week.
- **`DayOfWeekManager.java`**: Calendar scheduling and weekday mapping using `switch`.
- **`TernaryRefactor.java`**: Simplifying verbose conditional assignments with the ternary operator (`? :`).
- **Debugging Studies**: Common pitfalls including `AssignmentError` (`=` vs `==`), `FallThroughError` (missing `break`), `PrecisionError` (floating-point inaccuracies), and `StringComparisonError` (`==` vs `.equals()`).

### 2. Loop Structures & Iteration (`com.taller.ciclos`)
Comprehensive coverage of iterative control structures (`for`, `while`, `do-while`):
- **`BankMenu.java`**: Interactive console ATM system driven by a `do-while` loop.
- **`InventoryControl.java`**: Real-time stock auditing combining all three loop paradigms.
- **`PinValidator.java`**: Security PIN authentication with attempt limits using `while`.
- **`MultiplicationTable.java` & `FactorialAndPattern.java`**: Mathematical iteration and nested pattern rendering.
- **`SentinelAccumulator.java` & `TransactionProcessor.java`**: Accumulator loops with sentinel exit values.
- **`EvenNumberFilter.java` & `FirstCommonMultiple.java`**: Step-wise arithmetic filters.
- **Debugging Studies**: `InfiniteLoopError` (missing loop increment), `OffByOneError` (index boundary misuse), and `MisplacedBreakError` (`break` vs. `continue`).

### 3. String Manipulation & Console Games (`com.educacion.ahorcado`)
- **`Main.java`**: Full-featured interactive Hangman console game featuring masked word tracking, duplicate letter validation, ASCII hangman scaffold visual rendering, attempt counters, and dynamic `StringBuilder` manipulation.

### 4. Object-Oriented Programming (`com.taller.poo`)
A complete OOP workshop exploring encapsulation, constructor overloading, memory consumption, static vs. instance methods, and domain modeling:
- **`Vehiculo.java`**: Vehicle entity with private fields, constructor overloading, and explicit technical analysis comparing memory usage and nullability between primitives (`double`, `int`, `boolean`) and Wrapper classes (`Double`, `Integer`, `Boolean`).
- **`Estudiante.java`**: Encapsulated student model using `StringBuilder` and `String.format()` (`%s`, `%.2f`, `%b`) to generate immutable academic reports.
- **`CuentaBancaria.java`**: Bank account domain model featuring 3 overloaded constructors, parameter disambiguation with `this`, and business logic methods (`depositar()`, `retirar()`) with overdraft credit protection.
- **`ConversorMoneda.java`**: Static utility class with a private default constructor preventing instantiation, offering currency conversion (`USD` to `EUR`) and currency formatting routines.
- **`Principal.java`**: Executable demonstration instantiating collections of objects, mutating state, invoking static helpers, and presenting reports strictly formatted with `System.out.printf`.
- **`SistemaGestionCuentas.java` (Reto Integrador)**: Interactive console account management system utilizing `Scanner`, continuous `do-while` menu, `switch` routing, fixed array `CuentaBancaria[3]` traversal, input validation, and `StringBuilder` report accumulation.

---

## 🗂️ Project Directory Structure

```text
TallerUnidad1_2/
├── src/
│   └── com/
│       ├── educacion/
│       │   └── ahorcado/
│       │       └── Main.java                         # Interactive Hangman Game
│       └── taller/
│           ├── practico/                             # Module 1: Decisions & Operators
│           │   ├── AgeClassification.java
│           │   ├── AssignmentError.java
│           │   ├── DayOfWeekManager.java
│           │   ├── FallThroughError.java
│           │   ├── GradingAttendanceSystem.java
│           │   ├── PrecisionError.java
│           │   ├── RetailSimulator.java
│           │   ├── StringComparisonError.java
│           │   ├── TernaryRefactor.java
│           │   └── TicketCalculator.java
│           ├── ciclos/                               # Module 2: Loop Structures
│           │   ├── BankMenu.java
│           │   ├── EvenNumberFilter.java
│           │   ├── FactorialAndPattern.java
│           │   ├── FirstCommonMultiple.java
│           │   ├── InfiniteLoopError.java
│           │   ├── InventoryControl.java
│           │   ├── MisplacedBreakError.java
│           │   ├── MultiplicationTable.java
│           │   ├── OffByOneError.java
│           │   ├── PinValidator.java
│           │   ├── SentinelAccumulator.java
│           │   └── TransactionProcessor.java
│           └── poo/                                  # Module 3: Object-Oriented Programming
│               ├── ConversorMoneda.java              # Static utility class
│               ├── CuentaBancaria.java               # Overloaded constructors & business rules
│               ├── Estudiante.java                   # Encapsulation & StringBuilder reporting
│               ├── GestorVehiculos.java              # Debugging: static vs instance context
│               ├── Principal.java                    # Demo execution & formatted output
│               ├── PruebaEstudiante.java             # Debugging: uninitialized reference & NPE
│               ├── SistemaGestionCuentas.java        # Comprehensive console management system
│               ├── Vehiculo.java                     # Abstraction & wrapper vs primitive analysis
│               └── DEBUGGING_ANALYSIS.md             # Written solutions to OOP case studies
├── .gitignore
├── README.md
└── TallerUnidad1_2.iml
```

---

## ⚙️ Prerequisites

- **Java Development Kit (JDK):** Version 17, 21, or newer.
- **IDE (Optional):** [IntelliJ IDEA](https://www.jetbrains.com/idea/) (recommended) or VS Code.
- **Terminal:** Bash, Zsh, or PowerShell.

---

## 🚀 Compilation & Execution

All classes can be compiled to the `out` directory and executed directly from the terminal.

### 1. Object-Oriented Programming (OOP) Module
```bash
# Compile all OOP classes
javac -d out src/com/taller/poo/*.java

# Run the Principal demonstration
java -cp out com.taller.poo.Principal

# Run the interactive Bank Account Management System
java -cp out com.taller.poo.SistemaGestionCuentas

# Run debugging demonstration classes
java -cp out com.taller.poo.PruebaEstudiante
java -cp out com.taller.poo.GestorVehiculos
```

### 2. Hangman Game
```bash
javac -d out src/com/educacion/ahorcado/Main.java
java -cp out com.educacion.ahorcado.Main
```

### 3. Decisions & Loops Modules
```bash
# Compile loops and practical exercises
javac -d out src/com/taller/ciclos/*.java src/com/taller/practico/*.java

# Run examples
java -cp out com.taller.ciclos.InventoryControl
java -cp out com.taller.practico.RetailSimulator
```

---

## 🔬 Debugging & Conceptual Case Studies

The repository includes explicit study cases targeting typical Java errors, accompanied by full analytical writeups in [`src/com/taller/poo/DEBUGGING_ANALYSIS.md`](src/com/taller/poo/DEBUGGING_ANALYSIS.md):

| Case Study | Category | Problem Mechanism | Remediation |
| :--- | :--- | :--- | :--- |
| **Case 1** | Reference / Memory | Invoking methods on uninstantiated reference (`NullPointerException`) | Instantiate object via `new` with appropriate constructor before access |
| **Case 2** | Static vs Instance | Direct invocation of instance method from `static main` | Instantiate enclosing class or declare method as `static` |
| **Case 3** | Constructor Syntax | Declaring a constructor with a `void` return type | Remove `void` keyword so compiler recognizes constructor signature |
| **Case 4** | Variable Scope | Parameter shadowing fields due to missing `this` reference | Qualify assignments explicitly using `this.field = parameter;` |

---

## 🤝 Contributing

1. Fork the Project.
2. Create your Feature Branch (`git checkout -b feature/NewFeature`).
3. Commit your changes following Conventional Commits (`git commit -m 'feat: add new feature'`).
4. Push to the Branch (`git push origin feature/NewFeature`).
5. Open a Pull Request.

---

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
