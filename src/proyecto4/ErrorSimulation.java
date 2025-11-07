package proyecto4;

public class ErrorSimulation {


    static void simulateError(){
        causeError();
    }

    static void causeError() throws RuntimeException {
        throw new RuntimeException("Simulated runtime exception");

    }

    static void main() {
        try {
            simulateError();
        }catch (RuntimeException e) {
            System.out.println(e.getMessage());
            System.out.println("Caught an exception: " + e.getMessage());
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

        }

    }

}
