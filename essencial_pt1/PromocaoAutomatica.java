package essencial_pt1;
public class PromocaoAutomatica {
    public static void main(String[] args) {
        byte varbyte = 2;
        short varshort = 3;
        char varchar = 'A';
        int varint = 4;
        long varlong = 5;
        float varfloat = 6.2f;
        double vardouble = 7.3;
        System.out.println(varbyte + varshort);
        System.out.println(varint * vardouble);
        System.out.println(varlong/varint);
        System.out.println(varchar + " Isso é uma string agora");
        System.out.println(varfloat - vardouble);

        //^ COISA IMPORTAMTE DO JAVA
        /*
        * Existem operadores de decremento e incremento ANTES e DEPOIS da variável, exemplo
        & C = A++ // Aqui se passa o valor ANTIGO de A (antes do incremento)
        & C = ++A // Aqui se passa o valor de A JÁ INCREMENTADO
        */
    }
}
