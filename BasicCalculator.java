/**
 * The BasicCalculator class provides methods for performing addition, subtraction, multiplication, and
 * division on two float numbers.
 */
/**
 * The BasicCalculator class provides methods for performing addition, subtraction, multiplication, and
 * division on two float numbers.
 */
class BasicCalculator{
    
    /**
     * The function "addition" takes two float numbers as input and returns their sum.
     * 
     * @param num_1 The first number to be added.
     * @param num_2 The second number to be added.
     * @return The sum of num_1 and num_2 is being returned.
     */
    float addition (float num_1,float num_2){
        return(num_1 + num_2);
    }
    /**
     * The function "substraction" takes two float numbers as input and returns their difference.
     * 
     * @param num_1 The first number to be subtracted.
     * @param num_2 The second number to be subtracted from the first number.
     * @return the result of subtracting `num_2` from `num_1`.
     */
    float substraction (float num_1,float num_2){
        return(num_1 - num_2);
    }
    float multiplication (float num_1,float num_2){
        return(num_1 * num_2);
    }
    float division (float num_1,float num_2){
        return(num_1 / num_2);
    }
   // The `public static void main(String[] args)` method is the entry point of the Java program. It is
   // the method that is executed when the program is run.
    public static void main(String[] args) {
        // The line `float num_1 = 10;` is declaring a variable `num_1` of type `float` and assigning
        // it the value `10`. This line initializes the variable `num_1` with the value `10`.
        float num_1 =10;
        float num_2 = 5;
        BasicCalculator calc = new BasicCalculator();
        float add_result = calc.addition(num_1, num_2);
        System.out.println("Result of Addition is :" + add_result);
        float sub_result = calc.substraction(num_1, num_2);
        System.out.println("Result of Addition is :" + sub_result);
        float mul_result = calc.multiplication(num_1, num_2);
        System.out.println("Result of Addition is :" + mul_result);
        float div_result = calc.division(num_1, num_2);
        System.out.println("Result of Addition is :" + div_result);

    }
}
