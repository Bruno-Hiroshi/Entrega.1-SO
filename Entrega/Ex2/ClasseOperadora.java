package ex_2;

public class classeoperadora {
    public classeoperadora()
    {
        super();
    }

    public void concatenaString(String par)
    {
        String[] texto_conc = par.split(";");
        for (String palavra: texto_conc){
            System.out.println(palavra);
        }
    }
}