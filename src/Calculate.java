public class Calculate {
    public static double calculator(double number_1, double number_2, char select) {
        switch (select) {
            case '+':
                return number_1 + number_2;
            case '-':
                return number_1 - number_2;
            case '*':
                return number_1 * number_2;
            case '/':
                if (number_2 != 0) {
                    return number_1 / number_2;
                } else {
                    throw new RuntimeException("Can't divide by zero");
                }
            default:
                throw new RuntimeException("Invalid operation");

        }
    }
}
