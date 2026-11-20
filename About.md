# Compiler javac
  --convert java files into byte code
# JVM java vertual  machine 
  --understand only byte code
  -- Jvm looks for Public static void main(String a[])

  for run code first compile by the code javac file_name 
  the it will creat a byte code then java class_name  it will run the code

# JRE java runtime environment
 it is besicaly # JVM + libreries  
 JVM < JRE < JDK
 WORA (write once run anywhere)
# Variable 
  location at memory... 
# Data type
  -- Integer
  -- Float
  -- Charecter
  -- Boolean

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