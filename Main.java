class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    
    /* Comments! */

    // This is a single line comment. I can literally type anything I want here.
    /* 
    This is another kind of comment
    It allows me to pust stuff on multiple lines without always
    beginning the line with "//"
    */
    System.out.println("comments are helpful"); // even at the end of the line

    /* Mathematical expressions */
    /*
    3 + 1
    That expression is 4 (duh)
    3 - 1
    equal 2
    3 * 2
    equals 6: '*' means "multiply"
    8 / 2
    equal 4: '/' is "divide"
    5 % 3
    equals 2: '%' means "integer remainder of dividing by"
    */

    /* Logical expressions */
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

    /* Variables */

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
    int inJavaCharacterCaseMatters;
    int injavacharactercasematters;
    // ^^^ Those are different variables!

    /* Statements */

    /* Logically "a line of some code" */
    // They end with a semicolon!
    // They generally map to "doing something"
    // 3 * 6 is an expression that equals 18
    y = 3 * 6; // assign the value of the expression to variable "y"

    /* Assignment statements:
    Evaluate the expression on the right
    and put the value into the variable on the left!
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

    // types

    int j; // Integer
    float k; // "Floating point" - sort of a "real number"
    double l; // "Double precision float" - a more accurate sort of "real number"
    boolean t; // True or False - Logical variables!
    double m = 1.0;
    double radius = 3.0;
   
    // More complicated types we'll talk about later (Arrays, Strings, Objects)

    // In *most* places, where you can have  single statement,
    // You can also have a "block" of statements:
    { // Open with a curly-brace
       x = 3;
       y = 3 * x + 2;
    } // Close with anothe curly-brace

    /* Conditions */

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
      System.out.println("Well, crap...");
      b = d;
    }

    // Doing something more than once (aka "loops")

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
  static float f(float x, float m, float b) {
    return m * x + b;
  }
  // to use it: f(1,2,3) evaluates to 2 * 1 + 3, or 5

  // must declare the "type" of the result, as well as the type of the "parameters" or 
  // "arguments" to the function:
  static int absoluteValue(int x) {
    if (x < 0) {
      return -x;
    } else { 
      return x;
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

  static void moreStuff() {
    // Arrays: lists of things
    int[] i = new int[500]; // A list of 500 integers!
    // Strings: lists of characters (i.e. words/text)
    String s = "this is some text that I could print!";
    // Objects: a thing that represents a collection of related types as single concept
    //   Objects let you think about things at "higher level"
    //   We might have a 'robot' object that has operations like "move forward"
    //   much like we have integers that have operations like "add another integer"
    /*

    FTCRobot mrBot16750;
    FTCRobot kevinsBot;
    static void twoBots() {
      mrBot16750.turnToward(180); // 180 degrees? Look at the comments to find out!
      kevinsBot.turnToward(90);
      while (mrBot16750.distanceFromEdge() > kevinsBot.distanceFromEdge()) {
        mrBot16750.goForward();
      }
      mrBot16750.stop();
      while (kevinsBot.distanceFromEdge() > mrBot16750.distanceFromEdge()) {
        kevinsBot.goForward();
      }
      kevinsBot.stop();
    }

    */
  }
}