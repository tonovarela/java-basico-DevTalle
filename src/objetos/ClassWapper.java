package objetos;

public class ClassWapper {
    static void main() {
        int number =10;
        Integer numberWapper = Integer.valueOf(number);
        System.out.println("Valor de numberWapper " +numberWapper);

        boolean resultado =Integer.compare(6,6) ==1;
        System.out.println("Resultado de la comparacion " +resultado);

        int max =Integer.max(5,10);
        System.out.println("Valor maximo " +max);

        int min =Integer.min(5,10);
        System.out.println("Valor minimo " +min);

    }

}
