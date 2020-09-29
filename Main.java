class Main {
  public static void main(String[] args) {
    Introduction();
    Comments();
    MathematicalExpressions();
    LogicalExpression();
    Variables();
    Statements();
    Types();
    Conditions();
    Loops();
    TestFunctions();
  }

  public static void Introduction() {
    System.out.println("Hello world!");
  }

  public static void Comments() {
    // This is a single line comment. I can literally type anything I want here.
    /*
     * This is another kind of comment It allows me to write stuff on multiple lines
     * without always beginning the line with "//"
     */
    System.out.println("look at that ->" /* I can put a comment here */);
    System.out.println("Comments are helpful"); // even at the end of the line!
  }

  public static int MathematicalExpressions() {
    /*
     * 3 + 1 That expression is 4 (duh) 3 - 1 equal 2 3 * 2 equals 6: '*' means
     * "multiply" 8 / 2 equal 4: '/' is "divide" 5 % 3 equals 2: '%' means
     * "integer remainder of dividing by"
     */
    return (8 + 412) * 15 / 8 % 7;
  }

  public static boolean LogicalExpression() {
    /*
      Simple logical expressions:

      3 > 2
      True.
      3 < 2
      False.
      3 == 2 // Equality (not a single '=')
      False.
      3 != 2 // inequality i.e. Not Equal
      True.
      (also >= and <= for greater or equal, less or equal)
      Logical "operations"
      && "And" ----> Both things must be true, or the result is False

      True && True ----> True.
      False && True ----> False.
      True && False ----> False.
      False && False ----> False.

      || "Or" ----> Either thing can be true for the result to be true

      True || True ----> True.
      False || True ----> True.
      True || False ----> True.
      False || False ----> False.
      
      ! "Not" a.k.a. "invert" - true is false, and false is true:
      !True ---> False.
      !False ---> True.

      Combining stuff with parentheses (like math!)
      (3 > 2) && (4 > 0) --> True.
      (2 > 3) || (1 > 4) --> False.
      (3 > 2) && !(4 > 0) --> False.
    */
    return true && (3 > 2);
  }

  public static void Variables() {
    // In algebraic terms, "x" & "y":
    // y = mx + b
    // In Java:
    int y; // You have to 'declare' a variable in Java
    int x;
    int bigLongVariableName;
    int no_spaces_or_other_weird_characters_in_variable_names;
    int onlyLettersUnderscoresAndNumbersButOnlyAfterALetter8;
    int _this_is_okay;
    int _1sillyVariableName;
    // ^^^^ Don't do that, it's really ugly
    // int 1stPlace; << That's not legal: has to start with a letter or underscore
    int inJavaCharacterCaseMatters;
    int injavacharactercasematters;
    // ^^^ Those are different variables!
    int a, b, c; // You can declare variables of the same type

  }

  public static void Statements() {
    int x, y;
    /* Logically "a line of some code" */
    // They end with a semicolon!
    // They generally map to "doing something"
    // 3 * 6 is an expression that equals 18
    y = 3 * 6; // assign the value of the expression to variable "y"

    /*
     * Assignment statements: Evaluate the expression on the right and put the value
     * into the variable on the left!
     */

    x = 2 * 3 + 1; // variable x now contains the value 7
    y = 4 * x + 2; // variable y now contains the value 30

    // We can assign a value when we declare a variable
    // (it's generally a good idea)

    int a = 3;
    int b = 4;
    // If you try to "evaluate" a variable before it's been "assigned" Java no-likey
    int c, d, e, f, g, h;

    // int j = c * d; // Program no workey. Java get whiney.

    // Putting it together:
    c = a + b;
    d = c - b;
    e = d * c;
    f = e / b;
    g = a * b + c - d / e + f % 4;

    // In *most* places, where you can have single statement,
    // You can also have a "block" of statements:
    { // Open with a curly-brace
      x = 3;
      y = 3 * x + 2;
    } // Close with anothe curly-brace
  }

  static void Types() {

    int j; // Integer
    float k; // "Floating point" - sort of a "real number"
    double l; // "Double precision float" - a more accurate sort of "real number"
    boolean t; // True or False - Logical variables!
    double m = 1.0;
    double radius = 3.0;
  
    // More complicated types we'll talk about later (Arrays, Strings, Enums, Objects)
  }

  static void Conditions() {
    int a = 0;
    int b = 1;
    int c = 3;
    int d = 4;
    int e = 5;
    int f = 5;
    // Just 'if'!

    if (a == b) // The expression in the () must be a logical expression!
      System.out.println("Nope");
    if (a != b)
      System.out.println("Yup!");
    if (c > d)
      System.out.println("Hello");
    if (c < d)
      System.out.println("Goodbye");

    // Well, okay, there's also "else"...
    if (e > f)
      System.out.println("e > f");
    else
      System.out.println("e <= f");

    /* Remember 'blocks' of statements? */
    if (a * b > c * d) {
      System.out.println("There's a snake in my boots!");
      a = c;
    } else {
      System.out.println("Oh, Poop...");
      b = d;
    }

    // "Cascading if/else"
    if (a > b) {
      a = b;
    } else if (b > a) {
      b = a;
    } else {
      System.out.println("a is already the same value as b.");
    }
  }
  static void Loops() {
    // Doing something more than once (aka "loops")
    int a = 0; 
    int b = 10;
    // Executes the block of statements while the condition is true
    while (a != b) { // the statement had better make this thing change!
      System.out.println("a != b still");
      a = a + 1;
    }

    while (a * 2 > b) {
      System.out.println("a * 2 > b still");
      a = a - 1;
    }

    // Some helpers:

    // Do-while's: Always run the statement block (loop "body") once before checking
    do {
      System.out.println("b * 2 >= a");
      b = b + 1;
    } while (b * 2 < a);
    // ^^^ That's the same as vvv
    System.out.println("b * 2 >= a");
    b = b + 1;
    while (b * 2 < a) {
      System.out.println("b * 2 >= a");
      b = b + 1;
    }

    // for "loops": Initialize, compare, update
    for (a = 0; a < 5; a = a + 1) {
      System.out.println("hey there");
    }
    // ^^^ That's the same as vvv
    a = 0; // First statement in the for (1st; 2nd; 3rd) 1st: Initialize!
    while (a < 5) { // 2nd statement: Compare!
      System.out.println("hey there"); // statement block
      a = a + 1; // 3rd statement: Update!
    }
  }

  /* functions */

  // Logically, like a mathematical function:
  // f(x) = m * x + b
  // In Java:
  static float f(float x) {
    float m = 2.0f;
    float b = 3.0f;
    // 'return' is the statement that says 'this is the value of the function:
    // "return it" to the "caller"
    return m * x + b;
  }

  // to use it: f(1,2,3) evaluates to 2 * 1 + 3, or 5

  // must declare the "type" of the result, as well as the type of the
  // "parameters" or
  // "arguments" to the function:
  static int absoluteValue(int x) {
    if (x < 0) {
      return -x;
    } else {
      return x;
    }
  }

  // Putting it all together:
  /*
   * Try this at home! Write a function that takes 3 'inputs' (aka parameters aka
   * arguments to the function) it should return true if and only if the 3 values
   * are dimension of a right triangle Stuff to understand: mathematical
   * expressions, logical expressions, maybe an 'if/else'!
   */
  static boolean isRightTriangle(int sideA, int sideB, int sideC) {
    // What goes in here?
    return true && false; // What goes there?
  }

  /*
   * Try this: write a function that takes 2 inputs, and returns the first
   * argument to the power of the second Mathematically: A to the B power Stuff to
   * understand: mathematical expressions, logical expressions, variables, and
   * *loops*!
   */

  static int power(int a, int b) {
    int result = 1;
    // What goes in here?
    return result;
  }

  /*
   * Let's step it up: The Fibonacci series is the sum of the previous two values
   * of the series: 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, etc... Write a function that
   * takes a number and returns that element of the Fibonacci series fib(1)
   * returns 1 fib(2) returns 1 fib(3) returns 2
   */
  static int fib(int n) {
    // This is clearly incorrect. Fix it (without visiting stackoverflow :D )
    return 0;
  }

  /* switch/case */
  // In the same way that a 'for' loop is just another way to write a while loop,
  // you can use a switch statement to replace a bunch of specific if/else
  // statements:
  static int switchCase(int a) {
    switch (a) {
    case 1: // if (a == 1 || a == 2 || a == 3 || a == 5 || a == 7 || a == 11)
    case 2:
    case 3:
    case 5:
    case 7:
    case 11: {
      return 0;
    }
    case 0: { // else if (a == 0)
      return -1;
    }
    case 4: // else if (...)
    case 6:
    case 8:
    case 9: {
      return 1;
    }
    default: { // else ...
      return 2;
    }
    }
  }

  static void testAbsoluteValue() {
    for (int j = -5; j < 5; j++) {
      int jAbs = absoluteValue(j);
      if (j != jAbs) {
        System.out.println("j is Negative!");
      }
    }
  }

  /* Advanced types */
  // This is pretty anemic: I need to expand this one quite a bit...
  static void moreStuff() {
    // Arrays: lists of things
    int[] i = new int[500]; // A list of 500 integers!
    // Strings: lists of characters (i.e. words/text)
    String s = "this is some text that I could print!";
  }

  static void TestFunctions() {
    // Test all 3/4/5 combinations
    // TODO: Check a 5/12/13 one also?
    if (isRightTriangle(3,4,5) &&
        isRightTriangle(3,5,4) && 
        isRightTriangle(4,3,5) && 
        isRightTriangle(4,5,3) &&
        isRightTriangle(5,3,4) &&
        isRightTriangle(5,4,3)){
      System.out.println("isRightTriangle works for a 3/4/5 triangle");
    } else {
      System.out.println("isRightTriangle fails for a 3/4/5 triangle");
    }
    if (isRightTriangle(1,2,3) || 
        isRightTriangle(1,3,2) ||
        isRightTriangle(2,1,3) ||
        isRightTriangle(2,3,1) ||
        isRightTriangle(3,1,2) ||
        isRightTriangle(3,2,1)){
      System.out.println("isRightTriangle fails for a 1/2/3 triangle");
    } else {
      System.out.println("isRightTriangle works for a 1/2/3 triangle");
    }
    if (power(1,1) == 1 &&
        power(1,10) == 1 &&
        power(3, 0) == 1 &&
        power(3, 2) == 9 && 
        power(4, 4) == 256) {
          System.out.println("power looks pretty good");
    } else {
      System.out.println("power has bugs");
    }
    if (fib(1) != 1) {
      System.out.println("fib has trivial issues");
    }
    int cur = 1;
    int prv = 0;
    for (int i = 0; i < 20; i++) {
      int f = fib(i+2);
      if (f != cur + prv) {
        System.out.printf("Fib(%d) is wrong (should be %d, returned %d)%n", i+2, cur + prv, f);
      }
      int newVal = cur + prv;
      prv = cur;
      cur = newVal;
    }
  }
}

  // Enumerations
/*  enum MotorSpeed {Slow = 10, Fast = 30, Stop = 0, Reverse = -15, WickedFast=300};
  static void useEnum( ){
    SetMotor(MotorSpeed.Slow);
  }
  static int SetMotor(MotorSpeed speed) {return 0;}
  */

    // Objects: a thing that represents a collection of related types as single
    // concept
    // Objects let you think about things at "higher level"
    // We might have a 'robot' object that has operations like "move forward"
    // much like we have integers that have operations like "add another integer"

    /*
     * 
     * FTCRobot mrBot16750 = new FTCRobot(); FTCRobot kevinsBot = new FTCRobot();
     * static void twoBots() { mrBot16750.turnToward(180); // 180 degrees? Look at
     * the comments to find out! kevinsBot.turnToward(90); while
     * (mrBot16750.distanceFromEdge() > kevinsBot.distanceFromEdge()) {
     * mrBot16750.goForward(); } mrBot16750.stop(); while
     * (kevinsBot.distanceFromEdge() > mrBot16750.distanceFromEdge()) {
     * kevinsBot.goForward(); } kevinsBot.stop(); }
     * 
     */
  