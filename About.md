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