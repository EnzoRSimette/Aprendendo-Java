public class TestStatic {
    public static void main(String[] args) {
        //* Por conta de as funções serem do tipo STATIC, podemos chamar elas pela classe e não necessariamente pelo objeto
        TestStatic.exibirValor(3000);
        TestStatic.exibirValor("Hello World!");
    }

    public static void exibirValor(int a) {
        System.out.println("O valor do inteiro é: " + a);
    }
    public static void exibirValor(String str) {
        System.out.println("Sua string é: " + str);
    }

}
