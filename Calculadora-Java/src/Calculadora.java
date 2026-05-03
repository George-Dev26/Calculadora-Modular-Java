import java.util.Scanner;

/*
            ETAPA 1
1. Importa o Scanner.
2. Criando o Objeto
3. Exibe um menu simples
 */

import java.util.Scanner;


public class Calculadora {
    public static void main (String [] args ) {

        Scanner leitor = new Scanner(System.in);
// EATAPA 4 APLICANDO O WHILE NA ESTRUTURA DO CÓDIGO
        boolean continuar = true; // A chave que mantém o programa vivo

        while (continuar) {
            System.out.println(" === CALCULADORA JAVA === ");
            System.out.println("1. Somar");
            System.out.println("2. Subtrair");
            System.out.println("0. Sair");
            System.out.println("Escolha uma opção: ");


// Aqui vamos capturar a OPÇÃO do menu
            int opcao = leitor.nextInt();

// Agora pedimos os números para o cálculo (apenas se ele não quiser sair )
            if (opcao == 0) {
                continuar = false; // Isso faz o loop parar na próxima volta
                System.out.println("Encerrando a calculadora... até logo!");
            } else if (opcao >= 1 && opcao <= 2) {
                System.out.println("Digite o primeiro número: ");
                double num1 = leitor.nextDouble();
                System.out.println("Digite o segundo número: ");
                double num2 = leitor.nextDouble();

// Por enquanto, vamos confirma o que foi digitado
                System.out.println("Você escolheu a opção: " + opcao + " Para os números " + num1 + " e " + num2);

// Detalhe importante:
//Usei o Double em vez de Int porque calculadora usa bastante números quebrados (ex: 50.4 + 7.0)
//em vez de manter no Int já que ele usa números inteiros, e aqui não é nosso foco.

/*

ETAPA 2: A Estrutura de Decisão (Switch-case)
Agora que já temos a opção e os números, precisamos de um "guarda de trânsito" para dizer:
"Se a opção for 1, faça isso... se for 2, faça aquilo... ".

*/

                switch (opcao) {
                    case 1:
//Chamando o método somar e subtrair e passando num1 e num2 como argumentos
                        double resultadoSoma = somar(num1, num2);
                        System.out.println("Resultado da Soma: " + resultadoSoma);
                        break;
                    case 2:
                        double resultadoSubtrair = subtrair(num1, num2);
                        System.out.println("Resultado da Subtração: " + resultadoSubtrair);
                        break;
                }
            } else {
                System.out.println("Opção inválida! Tente novamente.");

            }
        }

        leitor.close();

    }


/*

ETAPA 3: A Modularização (O Grande Salto)
Em vez de fazer (num1 + num2) direto no System.out.println, vamos criar "caixas" fora do
main que fazem esse trabalho.
O que devemos fazer agora:
Fora do bloco public static void main, que a gente já se encontra fora dela, mas ainda dentro da classe,
vamos criar os dois métodos, tanto o somar quanto o Subtrair.


*/

// Cirando o método soma


    public static double somar (double a, double b) {
        return a + b;
    }

    public static double subtrair (double a, double b) {
        return a - b;

    }


}