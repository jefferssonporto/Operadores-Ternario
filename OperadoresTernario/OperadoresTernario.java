/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package operadorternario;

/**
 *
 * @author Jefferson
 */
public class OperadorTernario {

    public static void main(String[] args) {
        /*
         * int n1, n2, n3, r;
         * n1 = 9;
         * n2 = 18;
         * r = (n1>n2)?n1+n2:n1-n2;
         * System.out.println(r);
         * Se n1 for maior que n2 então some-se n1+nn2 ou se for menor subtraia
         */

        String nome1 = "Gustavo";
        String nome2 = "Gustavo";
        String nome3 = new String("Gustavo");
        String res;
        res = (nome1.equals(nome3)) ? "igual" : "diferente";
        System.out.println(res);
        /*
         * se os nomes forem iguais aparece igual se não diferente, nesse caso está
         * fazendo uma comparção ao nome3 que de fato é diferente por causa do "new",
         * porém
         * sendo o usado o código "equals".
         */

    }
}
