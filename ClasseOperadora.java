package ex1;

public class ClasseOperadora {
    public ClasseOperadora()
    {
        super();
    }

    public void calculavetor1000oc()
    {
        int[] vetor = new int[1000];
        double init_temp = System.nanoTime();
        for (int i = 0; i < vetor.length; i++)
        {
            vetor[i] = 0;
        }
        double fin_temp = System.nanoTime();
        double temp_total = fin_temp - init_temp;
        temp_total = temp_total/ Math.pow(10, 9);
        System.out.printf("tempo total: %.6fs%n", temp_total, "s");
    }
    public void calculavetor10000oc()
    {
        int[] vetor = new int[10000];
        double init_temp = System.nanoTime();
        for (int i = 0; i < vetor.length; i++)
        {
            vetor[i] = 0;
        }
        double fin_temp = System.nanoTime();
        double temp_total = fin_temp - init_temp;
        temp_total = temp_total/ Math.pow(10, 9);
        System.out.printf("tempo total: %.6fs%n", temp_total, "s");
    }
    public void calculavetor100000oc()
    {
        int[] vetor = new int[10000];
        double init_temp = System.nanoTime();
        for (int i = 0; i < vetor.length; i++)
        {
            vetor[i] = 0;
        }
        double fin_temp = System.nanoTime();
        double temp_total = fin_temp - init_temp;
        temp_total = temp_total/ Math.pow(10, 9);
        System.out.printf("tempo total: %.6fs%n", temp_total, "s");
    }
}