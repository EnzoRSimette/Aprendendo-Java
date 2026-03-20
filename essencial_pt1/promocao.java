package essencial_pt1;
public class promocao {
    public static void main(String[] args) {
        //! Ao fazer uma operação com variáveis de nível baixo (byte, char, short)
        //! elas podem ser automaticamente convertidas para números maiores!
        // ex:
        byte a = 10;
        int b = a + 5; //^ Converteu o a Automaticamente!
        System.out.println(b);
        //? Se você usar var o java vai tentar automaticamente detectar o tipo
        var numero = 10;
        //var usuario = new User();
    }
}
