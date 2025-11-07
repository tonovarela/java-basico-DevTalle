package excepciones;

public class Main {


    static void main() {
        System.out.println("Excepciones");
//        try {
//            int result =10 / 0;
//            System.out.println("Resultado: " + result);
//        }
//        catch (ArithmeticException e) {
//            System.out.println("Error" +e.getMessage());
//        } catch (Exception e) {
//            System.out.println("Error genérico: " + e.getMessage());
//        }
//        finally {
//            System.out.println("Bloque finally ejecutado.");
//        }

        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            StackTraceElement[] stackTrace = e.getStackTrace();
            if (stackTrace.length > 0) {
                StackTraceElement element = stackTrace[0];
                String fileName = element.getFileName();
                int lineNumber = element.getLineNumber();
                String methodName = element.getMethodName();
                System.out.println("Error en el archivo: " + fileName);
                System.out.println("En el método: " + methodName);
                System.out.println("En la línea: " + lineNumber);
            }
            //System.out.println("Error: Índice fuera de los límites del array.");
        }


    }
}
