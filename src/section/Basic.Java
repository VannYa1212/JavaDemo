package section;


public class Basic {
    public static void main(String[] args) {
       
        // datatype java 
        // int, float, double, char, boolean, String, long, short, byte 
        // 1. int is use for number without decimal point. range from -2,147,483,648 to 2,147,483,647
        // 2. float is use for number with decimal point. range from 3.4e−038 to 3.4e+038
        // 3. double is use for number with decimal point. range from 1.7e−308 to 1.7e+308
        // 4. char is use for character. range from 0 to 65,535
        // 5. boolean is use for true or false. range from true or false
        // 6. String is use for text. range from 0 to 2,147,483,647
        // 7. long is use for number without decimal point. range from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        // 8. short is use for number without decimal point. range from -32,768 to 32,767
        // 9. byte is use for number without decimal point. range from -128 to 127
        
        // variable in java 
        // different between variable and constant 
        // variable is a container that store data and can be change 
        // constant is a container that store data and can't be change 
        // syntax for variable
        // datatype variableName = value; 
        // example
        int number = 10; // variable
        final int number2 = 20; // constant
        // number2 = 30; // error because number2 is constant
        // number = 20; // number is variable so it can be change
        double number3 = 10.5;
        char character = 'a';
        boolean isTrue = true;
        String text = "Hello World";
        long number4 = 1000000000000000000L;
        short number5 = 10000;
        byte number6 = 100;

         // =======  clear console(terminal or cmd)
         System.out.print("\033[H\033[2J");
         // =======
     
        
        // output in java : System.out.println();  and System.out.print(); 
        // System.out.println(); is use for output and go to next line
        // System.out.print(); is use for output and stay in the same line
        // example
        System.out.println("Hello World");
        System.out.print("Hello World");
        System.out.println(number);
        System.out.println(number2);
        System.out.println(number3);
        System.out.println(character);
        System.out.println(isTrue);
        System.out.println(text);
        System.out.println(number4);
        System.out.println(number5);
        System.out.println(number6);




    }
}