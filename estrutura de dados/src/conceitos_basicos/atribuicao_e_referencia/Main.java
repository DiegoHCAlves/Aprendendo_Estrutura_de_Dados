package conceitos_basicos.atribuicao_e_referencia;

public class Main {
    public static void main(String[] args) {
        /*O primitivo recebe uma cópia do valor*/
        int intA = 1;
        int intB = intA;

        System.out.println("intA= " + intA + " ,intB= " + intB);

        intB = 2;

        System.out.println("intA= " + intA + " ,intB= " + intB);

        /*------------------------------------------------------------------------------------------*/

        System.out.println();

        /*O objeto recebe uma cópia do endereço de memória, ou seja, são uma coisa só*/
        Objeto objA = new Objeto(1);
        Objeto objB = objA;

        System.out.println("objA= " + objA + " ,objB= " + objB);

        objA.setValor(2);

        System.out.println("objA= " + objA + " ,objB= " + objB);

        objB.setValor(5);

        System.out.println("objA= " + objA + " ,objB= " + objB);
    }
}
