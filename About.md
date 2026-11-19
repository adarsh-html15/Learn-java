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
  -- Method class ke andar code ka block hota hai jo ek specific task perform karta hai
  -- Method ko call karne par uska code execute hota hai
  -- Ek method ko baar-baar call karke code reuse kar sakte hain

## Method syntax

```java
accessModifier returnType methodName(parameters) {
    // method ka code
    return value; // jab return type void na ho
}
```

  -- `accessModifier` controls ki method kahan se access ho sakta hai, jaise `public` ya `private`
  -- `returnType` batata hai method kis type ki value return karega; value nahi deni ho to `void` use karein
  -- `parameters` method ke input values hote hain; method bina parameters ke bhi ho sakta hai

## Instance method example
  -- Instance method object se belong karta hai, isliye ise call karne ke liye object banana padta hai
  -- `introduce()` student ka introduction print karta hai
  -- `isAdult()` age check karke `true` ya `false` return karta hai

```java
class Student {
    String name;
    int age;

    void introduce() {
        System.out.println("Mera naam " + name + " hai");
    }

    boolean isAdult() {
        return age >= 18;
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Aman";
        student.age = 20;

        student.introduce(); // Mera naam Aman hai
        System.out.println(student.isAdult()); // true
    }
}
```

Yahan `student.introduce()` method call karta hai. `isAdult()` ka returned result `println` print karta hai.

## Void method
  -- `void` method koi value return nahi karta
  -- Phir bhi method apna kaam kar sakta hai, jaise screen par message print karna

```java
class Greeter {
    void greet(String name) {
        System.out.println("Namaste, " + name);
    }
}
```

## Static method
  -- `static` method class se belong karta hai, kisi specific object se nahi
  -- Ise object create kiye bina class name se call kar sakte hain

```java
class MathTools {
    static int square(int number) {
        return number * number; // number ka square return karta hai
    }

    public static void main(String[] args) {
        System.out.println(MathTools.square(5)); // Output: 25 (5 * 5)
    }
}
```

## Method overloading
  -- Same class mein same name ke multiple methods ho sakte hain, agar unki parameter lists different hon
  -- Parameters ki number, type, ya order different ho sakti hai
  -- Sirf return type change karne se method overload nahi hota
  -- Compiler arguments ke basis par correct method choose karta hai; ise compile-time polymorphism kehte hain

```java
class Calculator {
    int add(int a, int b) {
        return a + b; // two numbers ka sum
    }

    int add(int a, int b, int c) {
        return a + b + c; // three numbers ka sum
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(10, 20)); // 2 parameters wala method: 30
        System.out.println(calculator.add(10, 20, 30)); // 3 parameters wala method: 60
    }
}
```

# Constructors

## What is a constructor?
  -- Constructor object create hote waqt uski initial values set karta hai
  -- Constructor ka naam class ke naam ke same hona chahiye
  -- Constructor ka return type nahi hota, `void` bhi nahi
  -- `new` keyword se object banate waqt constructor automatically call hota hai
  -- Constructor technically method nahi hota

## Parameterized constructor example
  -- Parameterized constructor inputs lekar object ke fields initialize karta hai
  -- `new Student("Aman", 18)` mein `"Aman"` aur `18` constructor ke arguments hain

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
  -- No-argument constructor mein koi parameter nahi hota
  -- Agar class mein koi constructor declare nahi kiya, Java compiler default no-argument constructor provide karta hai
  -- Apna constructor declare karne ke baad compiler default constructor provide nahi karta

```java
class Student {
    String name;

    Student() {
        name = "Unknown"; // default starting name
    }

    public static void main(String[] args) {
        Student student = new Student(); // no-argument constructor call
        System.out.println(student.name); // Output: Unknown
    }
}
```

## Constructor overloading and `this(...)`
  -- Same class mein different parameter lists wale multiple constructors ho sakte hain
  -- `this(...)` isi class ke another constructor ko call karta hai
  -- `this(...)` constructor ke andar first statement honi chahiye

```java
class Box {
    int width;
    int height;

    Box() {
        this(1, 1); // default size set karne ke liye doosra constructor call
    }

    Box(int width, int height) {
        this.width = width;   // left side object ka field, right side parameter
        this.height = height; // left side object ka field, right side parameter
    }
}
```

## The `this` keyword
  -- `this` current object ko refer karta hai
  -- Parameter aur field ka naam same ho, to `this.fieldName` se object ka field identify karte hain

```java
class Student {
    String name;

    Student(String name) {
        this.name = name; // left: object ka field, right: parameter
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
| Call hone par specific task perform karta hai | Object creation ke waqt initialize karta hai |
| Koi bhi valid naam ho sakta hai | Class ke naam ke same hona chahiye |
| Return type ya `void` hota hai | Return type nahi hota |
| Code se explicitly call karte hain | `new` se object banate waqt call hota hai |
| Overload ho sakta hai | Different parameters ke saath overload ho sakta hai |

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