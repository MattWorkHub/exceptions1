public class Main {
    public static void main(String[] args) {
        int number = 2;
        int parameter1 = 5;
        int parameter2 = 10;
        parameterCheck(number,parameter1,parameter2);
    }
    public static void parameterCheck(int number,int parameter1,int parameter2) {
            if (number < parameter1 || number > parameter2) {
                throw new ArithmeticException("Parameter error");
            }
            else {
                System.out.println("The number " + number + " is within parameters");
            }
    }
}