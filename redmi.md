## Java Topics

- [Compiler javac](#compiler-javac)
- [JVM](#jvm)
- [JRE](#jre)
- [Variable](#variable)
- [Data type](#data-type)
- [User Input using Scanner](#scanner)
- [Packages and Access Modifiers](#packages)
- [Condition](#condition)
- [Iteration / Loops](#loops)
- [Class and Object](#class-and-object)
- [Methods](#methods)
- [Constructors](#constructors)
- [Arrays](#arrays)
- [Strings](#strings)
- [Wrapper Classes](#wrapper-classes)
- [Basic Collections](#collections)
- [Encapsulation](#encapsulation)
- [Inheritance](#inheritance)
- [Ambiguity](#ambiguity)
- [Polymorphism](#polymorphism)
- [Upcasting and Downcasting](#casting)
- [Abstraction](#abstraction)
- [Basic File Handling](#file-handling)
- [Basic Debugging](#debugging)
- [Exception Handling](#exception-handling)

---

<a id="compiler-javac"></a>
# Compiler javac
  --convert java files into byte code
<a id="jvm"></a>
# JVM java vertual  machine 
  --understand only byte code
  -- Jvm looks for Public static void main(String a[])

  for run code first compile by the code javac file_name 
  the it will creat a byte code then java class_name  it will run the code

<a id="jre"></a>
# JRE java runtime environment
 it is besicaly # JVM + libreries  
 JVM < JRE < JDK
 WORA (write once run anywhere)
<a id="variable"></a>
# Variable 
  location at memory... 
<a id="data-type"></a>
# Data type
  -- Integer
  -- Float
  -- Charecter
  -- Boolean

<a id="scanner"></a>
# User Input using Scanner
  -- `Scanner` class keyboard ya console se input lene ke liye use hoti hai
  -- `Scanner` `java.util` package ka part hai
  -- `import java.util.Scanner;` likhkar scanner class ko program mein import karte hain
  -- Program khatam hone par `scanner.close()` se resource close karna achhi practice hai

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Age: ");
        int age = scanner.nextInt();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

        scanner.close();
    }
}
```

## Common Scanner methods
  -- `nextInt()` integer input leta hai
  -- `nextDouble()` decimal input leta hai
  -- `nextLine()` poori line input leta hai
  -- `next()` ek word input leta hai
  -- Integer input ke baad `nextLine()` use karne se pehle extra newline clear karna pad sakta hai

<a id="packages"></a>
# Packages and Access Modifiers

## Package
  -- Package related classes ko ek folder ya group mein organize karta hai
  -- Package declaration file ke sabse upar hoti hai
  -- Built-in package ko use karne ke liye `import` keyword use hota hai

```java
package com.example;

import java.util.Scanner;
```

## Access modifiers
  -- `public` members ko kisi bhi class se access kar sakte hain
  -- `private` member sirf wahi class access kar sakti hai
  -- `protected` member same package aur subclasses se access ho sakta hai
  -- Modifier na dene par default/package-private access milta hai
  -- Default access sirf same package ki classes ko milta hai

| Modifier | Same class | Same package | Subclass | Other package |
|---|---|---|---|---|
| `private` | Yes | No | No | No |
| Default | Yes | Yes | No | No |
| `protected` | Yes | Yes | Yes | No |
| `public` | Yes | Yes | Yes | Yes |

<a id="condition"></a>
# Condition
  -- Condition is used to make decisions in a program
  -- Java uses true or false to check a condition

## if statement
  -- Runs code only when the condition is true

```java
if (age >= 18) {
    System.out.println("Adult");
}
```

## if else statement
  -- if runs when condition is true
  -- else runs when condition is false

```java
if (number % 2 == 0) {
    System.out.println("Even");
} else {
    System.out.println("Odd");
}
```

## else if statement
  -- Used to check multiple conditions one by one

```java
if (marks >= 90) {
    System.out.println("Grade A");
} else if (marks >= 60) {
    System.out.println("Grade B");
} else {
    System.out.println("Needs improvement");
}
```

## switch statement
  -- Used to choose one option from multiple values

```java
switch (day) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    default:
        System.out.println("Other day");
}
```

## Condition operators
  -- `==` equal to
  -- `!=` not equal to
  -- `>` greater than
  -- `<` less than
  -- `>=` greater than or equal to
  -- `<=` less than or equal to
  -- `&&` AND: both conditions must be true
  -- `||` OR: at least one condition must be true
  -- `!` NOT: reverses true or false

<a id="loops"></a>
# Iteration (Loops)
  -- A loop repeats a block of code
  -- Use loops to avoid writing the same code again and again

## for loop
  -- Used when the number of repetitions is known
  -- Format: initialization; condition; update

```java
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
```

## while loop
  -- Checks the condition before running the code
  -- May run zero or more times

```java
int i = 1;
while (i <= 5) {
    System.out.println(i);
    i++;
}
```

## do while loop
  -- Runs the code first, then checks the condition
  -- Runs at least one time

```java
int i = 1;
do {
    System.out.println(i);
    i++;
} while (i <= 5);
```

## Enhanced for loop
  -- Used to read each item in an array or collection

```java
int[] numbers = {1, 2, 3};
for (int number : numbers) {
    System.out.println(number);
}
```

## break and continue
  -- `break` stops the loop
  -- `continue` skips the current repetition and moves to the next one

<a id="class-and-object"></a>
# Class and Object

## Class
  -- A class is a blueprint or design for creating objects
  -- A class can have variables (data) and methods (actions)

## Object
  -- An object is an instance of a class
  -- Each object can have its own values for the class variables
  -- We can create many objects from one class

## Creating an object with `new`
  -- `new` creates an object in memory and calls its constructor
  -- The object reference is given back and can be stored in a reference variable
  -- Format: `ClassName referenceName = new ClassName();`

```java
class Student {
    String name;
    int age;

    void introduce() {
        System.out.println("My name is " + name);
        System.out.println("My age is " + age);
    }
}

class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Aman";
        student1.age = 20;
        student1.introduce();
    }
}
```

## Reference variable
  -- `student1` is a reference variable
  -- It refers to the Student object; it is not the object itself
  -- Use the dot (`.`) operator to access an object's variables and methods
  -- More than one reference variable can refer to the same object

```java
class Student {
    String name;
}

class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Aman";

        Student student2 = student1;
        student2.name = "Ravi";
        System.out.println(student1.name); // Ravi
    }
}
```

  -- `student1` and `student2` refer to the same object
  -- Changing the object using one reference can be seen through the other reference

<a id="methods"></a>
# Methods

## What is a method?
  -- A method is a block of code inside a class that performs a specific task
  -- The method code executes when the method is called
  -- Methods help divide a program into reusable and organized parts
  -- A class can contain variables and the methods that operate on those variables

## Method syntax

```java
accessModifier returnType methodName(parameters) {
    // Method body
    return value; // Required when the return type is not void
}
```

  -- `accessModifier` determines where the method can be accessed
  -- Common access modifiers are `public`, `private`, `protected`, and package-private
  -- `returnType` specifies the type of value returned by the method
  -- Use `void` when the method does not return any value
  -- `parameters` are inputs passed to the method
  -- A method can have zero or more parameters

## Instance method
  -- An instance method belongs to an object of the class
  -- It can access instance variables and other instance methods
  -- It can be called only through an object

```java
class Student {
    String name;
    int age;

    void introduce() {
        System.out.println("My name is " + name);
    }

    boolean isAdult() {
        return age >= 18;
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Aman";
        student.age = 20;

        student.introduce(); // Output: My name is Aman
        System.out.println(student.isAdult()); // Output: true
    }
}
```

  -- `student.introduce()` calls the instance method using the `student` object
  -- `student.isAdult()` returns a boolean value

## Void method
  -- A `void` method does not return a value
  -- It can perform an action such as displaying a message or updating a variable

```java
class Greeter {
    void greet(String name) {
        System.out.println("Hello, " + name);
    }
}
```

## Static method
  -- A `static` method belongs to the class rather than a specific object
  -- It can be called using the class name without creating an object
  -- A static method cannot directly access non-static instance variables or instance methods

```java
class MathTools {
    static int square(int number) {
        return number * number;
    }

    public static void main(String[] args) {
        System.out.println(MathTools.square(5)); // Output: 25 (5 * 5)
    }
}
```

## Static variable
  -- `static` variable class ka shared variable hota hai
  -- Har object alag static variable nahi banata; saare objects same variable share karte hain
  -- Class name se static variable access kiya ja sakta hai

```java
class Counter {
    static int count = 0;

    Counter() {
        count++;
    }
}

public class Main {
    public static void main(String[] args) {
        new Counter();
        new Counter();
        System.out.println(Counter.count); // 2
    }
}
```

## Method overloading
  -- Method overloading allows multiple methods with the same name in the same class
  -- The methods must have different parameter lists
  -- The parameter list can differ by the number, type, or order of parameters
  -- Changing only the return type does not overload a method
  -- The compiler selects the appropriate method based on the arguments
  -- Method overloading is one form of compile-time polymorphism

```java
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(10, 20)); // Output: 30
        System.out.println(calculator.add(10, 20, 30)); // Output: 60
    }
}
```

<a id="constructors"></a>
# Constructors

## What is a constructor?
  -- A constructor is a special block of code used to initialize an object
  -- It runs automatically when an object is created using `new`
  -- The constructor name must match the class name
  -- A constructor has no return type, including `void`
  -- Although similar to a method, a constructor is not technically a method
  -- A constructor is mainly used to assign initial values to instance variables

## Parameterized constructor example
  -- A parameterized constructor accepts values and uses them to initialize an object
  -- In `new Student("Aman", 18)`, `"Aman"` and `18` are constructor arguments

```java
class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Student student = new Student("Aman", 18);
        System.out.println(student.name); // Output: Aman
        System.out.println(student.age);  // Output: 18
    }
}
```

## No-argument and default constructors
  -- A no-argument constructor has no parameters
  -- If a class declares no constructor, Java provides a default no-argument constructor
  -- The default constructor initializes fields to their default values
  -- Java does not provide a default constructor if the class declares any constructor

```java
class Student {
    String name;

    Student() {
        name = "Unknown";
    }

    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.name); // Output: Unknown
    }
}
```

## Constructor overloading and `this(...)`
  -- Constructor overloading means defining multiple constructors with different parameter lists
  -- The parameter list can differ by the number or type of parameters
  -- `this(...)` calls another constructor in the same class
  -- `this(...)` must be the first statement in the constructor

```java
class Box {
    int width;
    int height;

    Box() {
        this(1, 1); // Calls the parameterized constructor
    }

    Box(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public static void main(String[] args) {
        Box box = new Box();
        System.out.println(box.width + ", " + box.height); // Output: 1, 1
    }
}
```

## The `this` keyword
  -- `this` refers to the current object
  -- If a parameter has the same name as an instance variable, `this.variableName` refers to the instance variable
  -- The parameter name without `this` refers to the parameter

```java
class Student {
    String name;

    Student(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Student student = new Student("Aman");
        System.out.println(student.name); // Aman
    }
}
```

## Method vs constructor

| Method | Constructor |
|---|---|
| Performs a specific task | Initializes a newly created object |
| Can have any valid method name | Must have the same name as the class |
| Must have a return type or `void` | Has no return type |
| Can be called explicitly from code | Is called automatically by `new` |
| Can be overloaded | Can be overloaded |
| Is not required to initialize an object | Is designed to initialize an object |

<a id="arrays"></a>
# Arrays

## What is an array?
  -- Array ek variable mein same data type ki multiple values store karta hai
  -- Array banne ke baad uska size fixed rehta hai
  -- Array ke elements ko index se access karte hain; index `0` se start hota hai
  -- `array.length` se array ka size milta hai

## Array ko values ke saath initialize karna
  -- Curly braces `{}` ke andar initial values likh sakte hain
  -- Neeche `arr` mein 10 integer values hain; last value `0` hai
  -- `for` loop `0` se `arr.length - 1` tak har element print karta hai

```java
int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

for (int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}
```

Is loop mein `i` index hai. `arr[0]` ki value `1` aur `arr[9]` ki value `0` hai.

## `new` se array banana
  -- `new int[10]` 10 integers ke liye array banata hai
  -- Is array ka size 10 hai aur shuru mein har element ki default value `0` hoti hai
  -- Baad mein index ke through har element ko value assign kar sakte hain
  -- Size fixed hota hai; `new` se bana array apne aap resize nahi hota

```java
int[] arr1 = new int[10];

for (int i = 0; i < arr1.length; i++) {
    arr1[i] = (i + 1) * 10;
}

for (int i = 0; i < arr1.length; i++) {
    System.out.println(arr1[i]);
}
```

Pehla loop values `10, 20, 30, ... 100` assign karta hai. Doosra loop un values ko print karta hai. `arr1.length` use karne se loop array ke size ke hisaab se chalta hai.

## Important points
  -- Valid indexes `0` se `length - 1` tak hote hain; is range ke bahar access karne par error aata hai
  -- Array ke saare elements ka data type same hota hai
  -- `int[] arr` aur `int arr[]` dono valid declarations hain; `int[] arr` zyada commonly use hota hai

<a id="strings"></a>
# Strings
  -- `String` text ko store karne ke liye use hoti hai
  -- String class `java.lang` package mein hai, isliye alag se import karne ki zaroorat nahi
  -- Strings immutable hoti hain; string ko modify karne par usually nayi String object banti hai

```java
String name = "Java";
System.out.println(name.length()); // 4
```

## Common String methods
  -- `length()` string mein characters ki count deta hai
  -- `charAt(index)` kisi index ka character deta hai
  -- `substring(start, end)` string ka selected part deta hai
  -- `toUpperCase()` aur `toLowerCase()` case change karte hain
  -- `trim()` string ke start aur end ki spaces hataata hai
  -- `contains(text)` check karta hai text present hai ya nahi
  -- `startsWith(text)` aur `endsWith(text)` prefix ya suffix check karte hain
  -- `equals(text)` case-sensitive value compare karta hai
  -- `equalsIgnoreCase(text)` case ko ignore karke value compare karta hai

```java
String text = "Java Programming";

System.out.println(text.length());
System.out.println(text.charAt(0)); // J
System.out.println(text.substring(0, 4)); // Java
System.out.println(text.toUpperCase());
System.out.println(text.contains("Program")); // true
System.out.println(text.equals("java programming")); // false
```

## String value comparison
  -- String compare karne ke liye `==` ki jagah `equals()` use karein
  -- `==` reference compare kar sakta hai; `equals()` content compare karta hai

```java
String first = new String("Java");
String second = new String("Java");

System.out.println(first == second); // false
System.out.println(first.equals(second)); // true
```

## StringBuilder
  -- String ko baar-baar modify karna ho to `StringBuilder` use hota hai
  -- `append()` string ke end mein text add karta hai

```java
StringBuilder builder = new StringBuilder("Hello");
builder.append(" ");
builder.append("Java");
System.out.println(builder.toString()); // Hello Java
```

<a id="wrapper-classes"></a>
# Wrapper Classes
  -- Wrapper classes primitive values ko object mein convert karti hain
  -- Common wrappers: `Integer`, `Double`, `Character`, `Boolean`
  -- Collections jaise `ArrayList` mein primitive type directly use nahi hota; wrapper use hota hai
  -- Primitive ko wrapper mein convert karna autoboxing hai
  -- Wrapper ko primitive mein convert karna unboxing hai

```java
Integer number = 10; // Autoboxing
int value = number; // Unboxing

String text = "25";
int parsedValue = Integer.parseInt(text);

System.out.println(number);
System.out.println(value);
System.out.println(parsedValue);
```

<a id="collections"></a>
# Basic Collections

## ArrayList
  -- `ArrayList` size change kar sakne wali ordered list hai
  -- Array ke fixed size ke compare mein ArrayList dynamically resize hoti hai
  -- `ArrayList<Integer>` generic syntax primitive wrapper type ke saath use hoti hai
  -- `add()` value add karta hai
  -- `get(index)` value read karta hai
  -- `set(index, value)` value update karta hai
  -- `remove(index)` value hataata hai
  -- `size()` list ki item count deta hai

```java
import java.util.ArrayList;

ArrayList<String> names = new ArrayList<>();
names.add("Aman");
names.add("Ravi");

System.out.println(names.get(0)); // Aman
System.out.println(names.size()); // 2

names.set(1, "Raj");
names.remove(0);

for (String name : names) {
    System.out.println(name);
}
```

## HashMap
  -- `HashMap` data ko key aur value pair ke roop mein store karta hai
  -- Key unique hoti hai
  -- `put(key, value)` pair add ya update karta hai
  -- `get(key)` key ki value deta hai
  -- `remove(key)` key aur uski value hataata hai
  -- `containsKey(key)` check karta hai key present hai ya nahi

```java
import java.util.HashMap;

HashMap<String, Integer> ages = new HashMap<>();
ages.put("Aman", 18);
ages.put("Ravi", 20);

System.out.println(ages.get("Aman")); // 18
System.out.println(ages.containsKey("Ravi")); // true

ages.remove("Aman");
```

<a id="encapsulation"></a>
# Encapsulation

## What is encapsulation?
  -- Encapsulation code aur data ko ek class ke andar ek unit mein wrap karna hai
  -- Class ke private variables ko direct access se hidden (data hiding) rakha jata hai
  -- Variables ko normally public getter aur setter methods ke through access ya update karte hain

## Encapsulation example

```java
class encapsulation {
    private int id = 10;
    private String name = "Adarsh";

    public int getid() {
        return id;
    }

    public void setid(int n) {
        this.id = n;
    }

    public String getname() {
        return name;
    }

    public void setname(String n) {
        this.name = n;
    }
}

public class Main {
    public static void main(String[] args) {
        encapsulation obj = new encapsulation();

        System.out.println(obj.getid());   // 10
        System.out.println(obj.getname()); // Adarsh

        obj.setid(20);
        obj.setname("Aakansha");

        System.out.println(obj.getid());   // 20
        System.out.println(obj.getname()); // Aakansha
    }
}
```

## `private` variables
  -- `private int id` aur `private String name` ko isi class ke bahar direct access nahi kar sakte
  -- Isse dusri classes variables ki value ko bina control ke change nahi kar sakti

## Getter methods
  -- Getter method private variable ki value read karta hai
  -- Getter method ka return type variable ke type ke same hota hai
  -- Example: `getid()` `int` return karta hai aur `getname()` `String` return karta hai

## Setter methods
  -- Setter method private variable ki value update karta hai
  -- Setter method ka return type normally `void` hota hai
  -- Example: `setid(20)` se `id` ki value `20` ho jati hai

## `this` keyword
  -- `this` current object ko refer karta hai
  -- Jab parameter aur instance variable ka naam same ho, `this.id` object ki variable ko aur `id` parameter ko represent karta hai

```java
private int id;

public void setid(int id) {
    this.id = id;
}
```

  -- `this.id = id` mein left side current object ki `id` variable hai
  -- Right side setter ko mila parameter `id` hai

<a id="inheritance"></a>
# Inheritance

## What is inheritance?
  -- Inheritance ek concept hai jisme ek class kisi doosri class ki properties aur methods ko inherit karti hai
  -- Java mein inheritance ke liye `extends` keyword use hota hai
  -- Child ya subclass parent ya superclass ki properties aur methods use kar sakti hai
  -- Inheritance se code reuse hota hai aur classes ke beech relationship ban sakti hai
  -- Java mein ek class ek time par sirf ek direct parent class ko extend kar sakti hai

```java
class Parent {
    void show() {
        System.out.println("This is the parent class");
    }
}

class Child extends Parent {
    void display() {
        show(); // Inherited method ko call kar rahe hain
    }
}

public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        child.display();
    }
}
```

## Types of inheritance shown in Java
  -- **Single inheritance:** ek child class ek hi parent ko inherit karti hai
  -- **Multilevel inheritance:** class1 ko class2 inherit karti hai aur class2 ko class3 inherit karti hai
  -- **Hierarchical inheritance:** ek se zyada child classes ek hi parent ko inherit karti hain

```java
class Class1 {
}

class Class2 extends Class1 {
}

class Class3 extends Class2 {
}
```

Yahan `Class3` ek class `Class2` ko aur indirect way mein `Class1` ko inherit karti hai. Isse multilevel inheritance kehte hain.

## `this` keyword
  -- `this` current object ko refer karta hai
  -- `this.variableName` instance variable ko refer karta hai
  -- Constructor ke andar `this(...)` same class ke doosre constructor ko call karta hai
  -- `this(...)` constructor mein sabse pehli statement honi chahiye

```java
class Student {
    String name;
    int age;

    Student() {
        this("Unknown", 18); // Calls another constructor of the same class
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
```

  -- `this.name = name` mein `this.name` current object's instance variable hai
  -- Right side wala `name` constructor ko mila parameter hai
  -- `this(...)` constructor chaining create karta hai

## `super` keyword
  -- `super` direct parent class ko refer karta hai
  -- `super(...)` parent class ke constructor ko call karta hai
  -- `super.methodName()` parent class ke method ko call karta hai
  -- Constructor mein `super(...)` sabse pehli statement honi chahiye
  -- Agar constructor mein `this(...)` ya `super(...)` likha nahi hai, Java automatically `super()` call karta hai

```java
class Parent {
    Parent() {
        System.out.println("Parent constructor");
    }

    void show() {
        System.out.println("Parent show method");
    }
}

class Child extends Parent {
    Child() {
        super(); // Calls the parent class constructor
        System.out.println("Child constructor");
    }

    void show() {
        super.show(); // Calls the parent class show method
        System.out.println("Child show method");
    }
}
```

## `this(...)` aur `super(...)` constructor chaining
  -- Constructor execute hone par object creation ke according parent constructors bhi execute hoti hain
  -- `this(...)` current class ke kisi constructor ko call karta hai
  -- `super(...)` parent class ke constructor ko call karta hai
  -- Ek constructor mein `this(...)` aur `super(...)` dono ek saath nahi likh sakte
  -- Constructor chaining mein final call tak parent class ki constructor pehle execute hoti hai

```java
class Class1 {
    Class1() {
        super(); // Calls Object class constructor
        System.out.println("Class1 constructor");
    }
}

class Class2 extends Class1 {
    Class2() {
        super(); // Calls Class1 constructor
        System.out.println("Class2 constructor");
    }
}

class Class3 extends Class2 {
    Class3() {
        super(); // Calls Class2 constructor
        System.out.println("Class3 constructor");
    }

    Class3(int number) {
        this(); // Calls the no-argument Class3 constructor
        System.out.println(number);
    }

    public static void main(String[] args) {
        new Class3(7);
    }
}
```

Upar ke example ka constructor execution order:

```text
Class1 constructor
Class2 constructor
Class3 constructor
7
```

## Important points
  -- `this` current class object ko refer karta hai
  -- `super` parent class ko refer karta hai
  -- `this()` aur `super()` constructors ko call karte hain
  -- `this.variableName` aur `super.variableName` fields ko access kar sakte hain
  -- `this.methodName()` aur `super.methodName()` methods ko call kar sakte hain
  -- `this(...)` ya `super(...)` constructor ke first statement mein hona chahiye

## anonymus object 
  which object don't have any referance variable, it is created only.
  ```
  public static void main(srting agrs[]){
    new student();
  }
  ```

<a id="ambiguity"></a>
# Ambiguity

## What is ambiguity?
  -- Ambiguity tab hoti hai jab ek class ko do ya zyada same-named methods ya variables milte hain aur compiler clear nahi kar pata ki kis member ko use karna hai
  -- Java mein multiple inheritance of classes allowed nahi hai, isliye class-level diamond problem se bachaya gaya hai
 
## Interface default method ambiguity
  -- Agar ek class do interfaces implement kare aur dono mein same default method ho
  -- To class ko method ko override karke exact implementation batani hoti hai
  -- Ambiguous call ko avoid karne ke liye `InterfaceName.super.methodName()` use kar sakte hain

## Field ambiguity
  -- Do parent interfaces ya classes mein same variable name ho to direct access ambiguous ho sakta hai
  -- Instance variable ke case mein child class apna separate variable bana sakti hai
  -- Interface ke variable by default `public static final` hote hain
  -- Specific parent class ko explicitly `super.variableName` ya interface ka naam use karke access kar sakte hain


## Resolving ambiguity
  -- Conflicting default methods ko child class mein override karein
  -- Interface-specific method call ke liye `InterfaceName.super.methodName()` use karein
  -- Direct multiple class inheritance ki jagah interfaces ya composition use karein
  -- Variables ke liye clear aur unique variable names rakhein

<a id="polymorphism"></a>
# Polymorphism

## What is polymorphism?
  -- Polymorphism ka matlab hai "many forms"
  -- Ek hi method ya constructor different situations mein different forms ya behavior de sakta hai
  -- Java mein polymorphism method overloading aur method overriding ke through implement hota hai
  -- Polymorphism code ko flexible, reusable aur easy to extend banata hai

## Types of polymorphism
  -- **Compile-time polymorphism:** Method overloading ya constructor overloading
  -- **Runtime polymorphism:** Method overriding aur dynamic method dispatch

## Compile-time polymorphism
  -- Compile-time polymorphism ko method overloading bhi kehte hain
  -- Same class mein same name ke multiple methods ho sakte hain, lekin parameter list different honi chahiye
  -- Parameter list number, type, ya order mein differ kar sakti hai
  -- Return type ko change karne se method overloading nahi hoti

```java
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(10, 20));       // 30
        System.out.println(calculator.add(10, 20, 30));   // 60
        System.out.println(calculator.add(2.5, 3.5));   // 6.0
    }
}
```

  -- Compiler arguments ko dekhkar call hone wale method ko compile time par decide karta hai
  -- `System.println` invalid hai; text example mein printing ke liye `System.out.println` use karein

## Constructor overloading
  -- Ek class mein different parameter lists ke multiple constructors ho sakte hain
  -- Constructor overloading bhi compile-time polymorphism ka example hai
  -- One constructor ko `this(...)` ke through doosre constructor ko call kar sakte hain

```java
class Student {
    String name;
    int age;

    Student() {
        this("Unknown", 18);
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
```

## Runtime polymorphism
  -- Runtime polymorphism ko method overriding ke through implement kiya jata hai
  -- Child class parent class ke method ko apni requirement ke according redefine kar sakti hai
  -- Method ka naam, return type aur parameter list parent method ke same hone chahiye
  -- Access modifier parent se kam restrictive hona chahiye

```java
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal;

        animal = new Dog();
        animal.sound(); // Dog barks

        animal = new Cat();
        animal.sound(); // Cat meows
    }
}
```

## Dynamic method dispatch
  -- Dynamic method dispatch runtime polymorphism ki mechanism hai
  -- Parent class ka reference child class ke object ko hold kar sakta hai
  -- Method call object ke actual type ke according resolve hoti hai, reference type ke according nahi
  -- Is process ko runtime polymorphism ya virtual method invocation kehte hain

```java
Animal animal = new Dog();
animal.sound();
```

  -- Yahan reference `Animal` type ka hai
  -- Object actual mein `Dog` class ka hai
  -- Isliye `Dog` ka `sound()` execute hota hai

## `@Override`
  -- `@Override` annotation batata hai ki method parent method ko override kar rahi hai
  -- Ye compiler ko check karne deta hai ki valid overriding ho rahi hai
  -- Ye mandatory nahi hai, lekin recommended hai
  -- Agar method signature galat ho, compiler error deta hai

```java
class Parent {
    void print() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    @Override
    void print() {
        System.out.println("Child");
    }
}
```

## Method overloading vs method overriding

| Method overloading | Method overriding |
|---|---|
| Same class mein hota hai | Parent aur child classes ke beech hota hai |
| Parameter list different hoti hai | Parameter list same hoti hai |
| Compile-time polymorphism hai | Runtime polymorphism hai |
| Inheritance necessary nahi hai | Inheritance necessary hai |
| Return type differ ho sakta hai agar parameters bhi differ karein | Return type usually same ya covariant hota hai |

## `final` aur polymorphism
  -- `final` method ko child class override nahi kar sakti
  -- `final` class ko koi class extend nahi kar sakti
  -- Static aur private methods ko normal overriding ke through override nahi kar sakte

```java
class Parent {
    final void show() {
        System.out.println("Cannot override");
    }
}

final class FinalClass {
}

// final class ko extend nahi kar sakte
// class Child extends FinalClass {
// }
```

## Important points
  -- Overloading compile-time polymorphism hai
  -- Overriding runtime polymorphism hai
  -- Parent reference child object hold kar sakta hai
  -- Runtime par actual object type method selection decide karta hai
  -- `@Override` overriding ko safe aur readable banata hai

<a id="casting"></a>
# Upcasting and Downcasting

## Upcasting
  -- Child class ke object ko parent class ke reference mein assign karna upcasting hai
  -- Java implicit upcasting karta hai
  -- Sirf parent class ke methods aur fields accessible hoti hain

```java
class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Bark");
    }
}

Animal animal = new Dog(); // Upcasting
animal.sound();
// animal.bark(); // Error: parent reference bark() ko nahi janta
```

## Downcasting
  -- Parent reference ko child class ke reference mein convert karna downcasting hai
  -- Downcasting explicit hoti hai; `(Dog) animal` likhna padta hai
  -- Unsafe casting se `ClassCastException` aa sakti hai
  -- Casting se pehle `instanceof` se type check karein

```java
Animal animal = new Dog(); // Upcasting

if (animal instanceof Dog) {
    Dog dog = (Dog) animal; // Downcasting
    dog.bark();
}
```

<a id="abstraction"></a>
# Abstraction

## What is abstraction?
  -- Abstraction implementation details ko chhupakar sirf zaroori features dikhata hai
  -- User ko object ke kaam par focus karwata hai, uske internal working par nahi
  -- Java mein abstraction abstract classes aur interfaces ke through achieve hoti hai
  -- Abstraction code ko flexible aur implementation-independent banata hai

## Abstract class

  -- Jis class ke saath `abstract` keyword likha ho, woh abstract class hoti hai
  -- Abstract class ka object directly nahi bana sakte
  -- Abstract class mein abstract aur concrete methods dono ho sakte hain
  -- Abstract method ka sirf declaration hota hai, implementation nahi
  -- Child class ko abstract methods ki implementation deni hoti hai

```java
abstract class Payment {
    double amount;

    Payment(double amount) {
        this.amount = amount;
    }

    abstract void pay();

    void showAmount() {
        System.out.println("Amount: " + amount);
    }
}

class CardPayment extends Payment {
    CardPayment(double amount) {
        super(amount);
    }

    @Override
    void pay() {
        System.out.println("Paid " + amount + " using card");
    }
}

public class Main {
    public static void main(String[] args) {
        Payment payment = new CardPayment(500);
        payment.showAmount();
        payment.pay();
    }
}
```


  -- Yahan user `pay()` ko call karta hai
  -- Actual implementation kaise execute hoti hai, woh child class me chhupi hoti hai

## Interface
  -- Interface ek complete abstraction provide karta hai
  -- Interface mein methods normally public aur abstract hote hain
  -- Java 8 se interface mein `default` aur `static` methods bhi ho sakte hain
  -- Ek class multiple interfaces implement kar sakti hai
  -- Interface reference child object ko hold kar sakta hai

```java
interface Printer {
    void print(String document);
}

class InkjetPrinter implements Printer {
    @Override
    public void print(String document) {
        System.out.println("Inkjet printing: " + document);
    }
}

public class Main {
    public static void main(String[] args) {
        Printer printer = new InkjetPrinter();
        printer.print("Java notes");
    }
}
```

## Abstract class vs interface

| Abstract class | Interface |
|---|---|
| Ek abstract ya concrete class extend ki ja sakti hai | Ek class multiple interfaces implement kar sakti hai |
| Instance variables aur constructors ho sakte hain | Traditionally instance variables aur constructors nahi hote |
| Abstract aur concrete methods dono ho sakte hain | Default implementation ke saath methods bhi ho sakte hain |
| "Is-a" relationship ke liye useful hai | "Can-do" ya capability ke liye useful hai |

## Important points
  -- Abstract class aur interface ka object directly nahi bana sakte
  -- Abstract methods ko child class ya implementing class me implement karna hota hai
  -- Abstraction implementation ko hide karta hai, encapsulation data ko hide karta hai
  -- Abstraction large systems ko small aur understandable parts mein todti hai
  -- Runtime polymorphism abstraction ke saath saath use hoti hai

<a id="file-handling"></a>
# Basic File Handling
  -- Java mein file ke saath read aur write operations `java.io` package se perform karte hain
  -- `FileWriter` text file mein data likhne ke liye use hota hai
  -- `FileReader` ya `BufferedReader` text file se data read karte hain
  -- File operation checked exception de sakti hai, isliye `try-catch` ya `throws` use hota hai

## File mein text likhna

```java
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("data.txt")) {
            writer.write("Hello Java");
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
```

## File se text read karna

```java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader reader =
                 new BufferedReader(new FileReader("data.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
```

<a id="debugging"></a>
# Basic Debugging
  -- Debugging code mein problem identify aur fix karne ki process hai
  -- Compilation error compiler code run hone se pehle batata hai
  -- Runtime exception program execute hone ke dauran aati hai
  -- Logic error mein program run hota hai, lekin result galat hota hai
  -- Error line, exception name aur stack trace debugging ke starting points hain

## Simple debugging methods
  -- Code ke critical parts mein `System.out.println()` se value print karein
  -- Variable ki value har major step ke baad check karein
  -- `try-catch` mein exception ka `getMessage()` ya `printStackTrace()` print karein
  -- IDE breakpoint set karke program ko line-by-line execute karein
  -- `if` conditions aur loop boundaries manually verify karein

```java
int number = 10;
System.out.println("Before calculation: " + number);

int result = number * 2;
System.out.println("After calculation: " + result);
```

## Basic debugging points
  -- Compilation error ke liye red underline aur compiler message dekhein
  -- Runtime exception ke liye first error line aur exception class dekhein
  -- Logic error ke liye input, expected output aur actual output compare karein
  -- Ek baar mein ek chhoti problem fix karein aur uske baad program dobara run karein

<a id="exception-handling"></a>
# Exception Handling

## What is an exception?
  -- Exception runtime par aane wali unexpected problem hai
  -- Exception ke bina program normally crash ho sakta hai
  -- Java exceptions ko objects ke through represent karta hai
  -- Exception handling se program crash hone ke baad bhi controlled response de sakta hai

```java
public class Main {
    public static void main(String[] args) {
        int result = 10 / 0;
        System.out.println("This line will not run");
    }
}
```

  -- Yahan `ArithmeticException` aaegi
  -- Exception handle na ho to program abnormal way mein terminate ho jayega

## Exception hierarchy

| Type | Description |
|---|---|
| `Throwable` | Java mein sabhi errors aur exceptions ki parent class hai |
| `Error` | Serious system problems, usually application handling ke liye nahi hoti |
| `Exception` | Application level problems, jinhe handle kiya ja sakta hai |
| `RuntimeException` | Runtime exceptions ki parent class hai |
| `Checked exception` | Compile time par handle ya declare karna padta hai |
| `Unchecked exception` | Runtime par detect hoti hain aur compiler force nahi karta |

```text
Throwable
├── Error
└── Exception
    ├── Checked Exceptions
    └── RuntimeException
        └── Unchecked Exceptions
```

## Checked exceptions
  -- `IOException`, `SQLException`, aur `ClassNotFoundException` checked exceptions hain
  -- Checked exceptions ko method ke andar `try-catch` se handle karna hota hai
  -- Ya phir method signature me `throws` se declare karna hota hai

```java
import java.io.IOException;

public class Main {
    static void readFile() throws IOException {
        throw new IOException("File not found");
    }

    public static void main(String[] args) {
        try {
            readFile();
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
```

## Unchecked exceptions
  -- Unchecked exceptions `RuntimeException` aur uski subclasses hain
  -- Common examples `ArithmeticException`, `NullPointerException`, aur `ArrayIndexOutOfBoundsException` hain
  -- Compiler ye exceptions handle karne ko mandatory nahi banata
  -- Inhe avoid karne ke liye input aur object state validate karni chahiye

```java
public class Main {
    public static void main(String[] args) {
        String name = null;

        if (name != null) {
            System.out.println(name.length());
        } else {
            System.out.println("Name is null");
        }
    }
}
```

## try-catch
  -- Risky code `try` block me likha jata hai
  -- Exception aaye to matching `catch` block execute hota hai
  -- Ek `try` ke baad multiple `catch` blocks ho sakte hain
  -- Specific exception ko general exception se pehle catch karna chahiye

```java
public class Main {
    public static void main(String[] args) {
        try {
            int[] numbers = {10, 20, 30};
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Invalid array index");
        } catch (Exception exception) {
            System.out.println("Some exception occurred");
        }
    }
}
```

## finally
  -- `finally` block `try-catch` ke baad optional hota hai
  -- Exception aaye ya na aaye, `finally` block execute hota hai
  -- Commonly resources close karne ke liye use hota hai

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter a number:");
            int number = scanner.nextInt();
            System.out.println("Number: " + number);
        } catch (Exception exception) {
            System.out.println("Invalid input");
        } finally {
            scanner.close();
            System.out.println("Scanner closed");
        }
    }
}
```

## throw
  -- `throw` keyword se manually exception object throw kiya jata hai
  -- `throw` ke saath ek exception instance dena hota hai
  -- Input ya business rule galat ho to custom error throw ki ja sakti hai

```java
public class Main {
    static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or above");
        }
        System.out.println("Valid age");
    }

    public static void main(String[] args) {
        checkAge(15);
    }
}
```

## throws
  -- `throws` keyword method signature me exception declare karta hai
  -- Yeh calling method ko warning deta hai ki exception aa sakti hai
  -- Checked exception ke liye `throws` use ho sakta hai
  -- Runtime exceptions ko normally declare karna zaroori nahi hota

```java
import java.io.IOException;

public class Main {
    static void saveData() throws IOException {
        throw new IOException("Unable to save data");
    }
}
```

## throw vs throws

| `throw` | `throws` |
|---|---|
| Exception manually throw karta hai | Method ke possible exceptions declare karta hai |
| Method ya block ke andar use hota hai | Method signature ke andar use hota hai |
| Ek exception instance throw karta hai | Ek ya multiple exception types list kar sakta hai |
| `throw new IOException()` | `void method() throws IOException` |

## try-with-resources
  -- Java 7 se resource ko automatically close karne ke liye use hota hai
  -- Resource ko `try(...)` ke andar declare karte hain
  -- Resource ko `AutoCloseable` interface implement karna hota hai
  -- `finally` block ki need kam ho jati hai

```java
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("data.txt")) {
            int character = reader.read();
            System.out.println(character);
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
```

## Custom exception
  -- Application-specific problem ke liye custom exception banate hain
  -- Checked custom exception ke liye `Exception` extend karte hain
  -- Unchecked custom exception ke liye `RuntimeException` extend karte hain
  -- Custom exception se problem ka clear naam aur message milta hai

```java
class InvalidAgeException extends RuntimeException {
    InvalidAgeException(String message) {
        super(message);
    }
}

public class Main {
    static void checkAge(int age) {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above");
        }
    }

    public static void main(String[] args) {
        checkAge(15);
    }
}
```

## Important exception methods
  -- `getMessage()` exception ka short description return karta hai
  -- `printStackTrace()` exception aur call stack print karta hai
  -- `getCause()` exception ka underlying cause return karta hai
  -- `toString()` exception class ka naam aur message return karta hai

## Important points
  -- Exception handling program ko crash hone se bachati hai
  -- `try-catch-finally` resource aur error handling ke liye use hota hai
  -- Specific exceptions ko general exceptions se pehle catch karein
  -- `finally` ya try-with-resources se resources close karein
  -- Exception ko tab throw karein jab koi operation apni normal condition fulfill na kar sake
  -- Exception messages clear aur meaningful hone chahiye
  -- Validation se common runtime exceptions ko pehle hi avoid kiya ja sakta hai
