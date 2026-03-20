package essencial_pt1;
public class casos_switch {
    public static void main(String[] args) {
        //& Estrutura:
        /*
        * switch (*Argumento*) {
        ~ case *O que deve ser comparado* -> *retorno*
        ~ default *Se nenhum funcionar* -> *retorno*
        *}

        ^ OU

        * switch (*Argumento*) {
        ~ case *O que está comparando*:
            ...saida
        ~ default *Se nenhum funcionar*:
            ...saida
        *}

        */

        // EX:

        String dia = "Ter";

        switch (dia) {
            case "Seg", "Ter", "Qua", "Qui", "Sex":
                System.out.println("É um dia útil");
                break;
            case "Sab", "Dom":
                System.out.println("Feriado!");
                break;
            default:
                System.out.println("Isso não é um dia");
                break;
        }
    }
}
