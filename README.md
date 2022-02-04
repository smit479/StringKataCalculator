**String Calculator TDD Kata**

CODE : CORE JAVA and JUNIT5

SOFTWARE OR IDLE USED : IntelliJ IDEA Community Edition 2021.3.2

1. Create a simple String calculator with a method signature:

    int Add(string numbers)
    
    The method can take up to two numbers, separated by commas, and will return their sum.

    For example "" or "1" or "1,2" as inputs. (for an empty string it will return 0)

    Hints:

        Start with the simplest test case of an empty string and move to one and two numbers
        Remember to solve things as simply as possible so that you force yourself to write tests you did not think about
        Remember to refactor after each passing test

2. Allow the Add method to handle an unknown amount of numbers

3. Allow the Add method to handle new lines between numbers (instead of commas).
    The following input is ok: "1\n2,3" (will equal 6)
    The following input is NOT ok: "1,\n" (not need to prove it - just clarifying)
    
4. Support different delimiters

      To change a delimiter, the beginning of the string will contain a separate line that looks like this: "//[delimiter]\n[numbers…]" for example "//;\n1;2" should return three where the default delimiter is ";"
      The first line is optional. all existing scenarios should still be supported
5. Calling Add with a negative number will throw an exception "negatives not allowed" - and the negative that was passed.

If there are multiple negatives, show all of them in the exception message.


The Zip consist full code and files .
