package essencial_pt1;
public class Arrays {
    //* Para declarar um array, você coloca -> tipo[] nome;
    public static void main(String[] args) {
        int[] meuArray; // Declaração do array

        meuArray = new int[3]; // Criação do array
        meuArray[0] = 5;
        meuArray[1] = 8;
        meuArray[2] = 2;
        meuArray = new int[]{5,8,2}; //! ISSO AQUI FAZ TUDO
        System.out.println(meuArray[0] + " " + meuArray[1] + " " + meuArray[2]);

        // Loop FOREACH

        for (int i : meuArray) {
            System.out.println(i);
        }
    }
}
