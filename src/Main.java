public class Main {

    public static void main(String[] args) {

        //Перевести число 333 из шестнадцатиричной в десятичную.

        //(3 * (16*16)) + (3 * (16*1)) + (3*1)= 819.

        // Разложить число 200345 на разряды в десятичной системе.
        // 2 * 10^5 + 0 * 10^4 + 0 * 10^3 + 3 * 10^2 + 4 * 10^1 + 5 * 10^0

        // Перевести число 637 из десятичной в шестнадцатиричную и обратно (10->16 и 16->10).

        class DecimalToHexadecimal {
            public static void main(String[] args) {
                int decimal = 637;
                String hexadecimal = decimalToHexadecimal(decimal);
                System.out.println("Десятичное число " + decimal + " в шестнадцатеричной системе счисления: " + hexadecimal);
                int decimalFromHexadecimal = hexadecimalToDecimal(hexadecimal);
                System.out.println("Шестнадцатеричное число " + hexadecimal + " в десятичной системе счисления: " + decimalFromHexadecimal);
            }

            public static String decimalToHexadecimal(int decimal) {
                String hex = "";
                while (decimal > 0) {
                    int rem = decimal % 16;
                    if (rem < 10) {
                        hex = rem + hex;
                    } else {
                        hex = (char) (rem - 10 + 'A') + hex;
                    }
                    decimal = decimal / 16;
                }
                return hex;
            }

            public static int hexadecimalToDecimal(String hex) {
                int decimal = 0;
                for (int i = 0; i < hex.length(); i++) {
                    char ch = hex.charAt(i);
                    if (ch >= '0' && ch <= '9') {
                        decimal = decimal * 16 + (ch - '0');
                    } else if (ch >= 'A' && ch <= 'F') {
                        decimal = decimal * 16 + (ch - 'A' + 10);
                    }
                }
                return decimal;
            }
        }
        //Перевести 637 из десятичной в двоичную.

        class DecimalToBinary {
            public static void main(String[] args) {
                int decimal = 637;
                int binary[] = new int[20];
                int index = 0;
                while (decimal > 0) {
                    binary[index++] = decimal % 2;
                    decimal = decimal / 2;
                }
                for (int i = index - 1; i >= 0; i--) {
                    System.out.print(binary[i]);
                }
            }
        }
        //11100111 перевести в десятичную.
        class BinaryToDecimal {
            public static void main(String[] args) {
                String binary = "11100111";
                int decimal = 0;
                int power = 0;
                for (int i = binary.length() - 1; i >= 0; i--) {
                    if (binary.charAt(i) == '1') {
                        decimal += Math.pow(2, power);
                    }
                    power++;
                }
                System.out.println("Десятичное представление числа 11100111: " + decimal);
            }
        }
        //Перевести 637 из десятичной в троичную.
        class DecimalToTernary {
            public static void main(String[] args) {
                int decimal = 637;
                String ternary = "";
                while (decimal > 0) {
                    int ternaryDigit = decimal % 3;
                    ternary = ternaryDigit + ternary;
                    decimal = decimal / 3;
                }
                System.out.println("Троичное представление числа 637: " + ternary);
            }
        }
    }
}