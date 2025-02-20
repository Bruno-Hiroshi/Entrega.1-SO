package Ex3;

public class Operadora {
    public Operadora()
    {
        super();
    }

    public void funcao(int[] vet)
    {

        for (int numero: vet)
        {
            if (numero % 10 == 0)
            {
                System.out.println("Múltiplo de 10: " + numero);
            }
            if (numero % 2 != 0)
            {
                System.out.println("Impar : " + numero);
            }
        }
    }

}
