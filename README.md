# 1.3-Java-Collections-Level2

## 📄 Description – Exercise Statement

This project contains the solution to the following Java exercises:

### Exercise 1
Create a class called `Restaurant` with two attributes: `name` (`String`) and `score` (`int`).  
Implement the necessary methods so that it is **not possible** to insert `Restaurant` objects with the **same name and the same score** into a `HashSet` created in the `main()` method.

> Important: Restaurants with the **same name but different score** are allowed.  
> Only duplicates of **(name, score)** must be rejected.


#### ✅ What was implemented
- `Restaurant` with:
   - Constructor validation (non-null/non-empty `name`, positive `score` as per spec).
   - `equals()` and `hashCode()` based on **both** `name` and `score`.
   - `toString()` for readable output.
- `Main` that demonstrates `HashSet` behavior:
   - Adds duplicates (same name + same score) → only one remains.
   - Adds same name with different score → allowed.
   - Adds different restaurant → allowed.

---

### Exercise 2

---

## 💻 Technologies Used
- Java 17  
- IntelliJ IDEA  
- Git & GitHub  

---

## 📋 Requirements
- JDK 17 or higher installed  
- IntelliJ IDEA (or any Java-compatible IDE)  
- Git  

---

## 🛠️ Installation
Clone the repository and access the project folder:

```sh
git clone https://github.com/leilaweicman/1.3-Java-Collections-Level2.git
cd 1.3-Java-Collections-Level2
```

---

## ▶️ Execution

### Exercise 1

1. Open Main.java in the exercise1 package.
2. Run the main() method.
3. Expected console output:

```sh
Restaurants in set: [McDonalds (score: 8), McDonalds (score: 9), Burger King (score: 7)]
```

### Exercise 2


---

## 🌐 Deployment
Not applicable (local practice project).


---

## 🤝 Contributions

1. Fork this repository.
2. Create a new branch:
```sh
git checkout -b feature/NewFeature
```
3. Commit your changes:
```sh
git commit -m "Add NewFeature"
```
4. Commit your changes:
```sh
git push origin feature/NewFeature
```
5. Open a Pull Request.
