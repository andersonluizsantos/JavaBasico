package conceitosbasicos;

public class ConversaoNumerica {

    public static void main(String[] args){
        // Exemplo 1 - Conversao explicita (0.1 é do tipo double e precisa ser convertido para float)
        float f1 = (float) 0.1;
        float f2 = 0.1F;
        System.out.println(f1);
        System.out.println(f2);

        // Exemplo 2 - Conversao explicita
        int i1 = (int) 7.9;
        System.out.println(i1);

        // Exemplo 3 - Conversao explicita
        int i2 = 'a';
        System.out.println(i2);

        // Exemplo 4 - Conversao explicita
        double d = 1001;
        System.out.println(d);
    }
}