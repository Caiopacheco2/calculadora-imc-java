import java.util.Scanner;

public class IMC {
    public static void main (String[] args){

         /*Aqui começamos o progama definindo uma nova variável do tipo Scanner,
         chamada scanner (letra minúscula), que será usada para ler o que o usuário
         digitar no teclado. Já o "new Scanner(System.in)" cria uma nova instãncia scanner,
         ligada a entrada padão do sistema, que é o teclado do usuário. Assim, conseguimos capturar
         valores digitados durante a execussão.
          */

        Scanner scanner = new Scanner(System.in);

        /* Para começar a estruturar nossa solução, pensamos em pedir ao usuário que
        digite os dados que queremos via System.out.println(); Dessa forma, ele vai
        ser avisado de que precisará digitar o dado necessário na próxima linha.
         */

        System.out.println("Digite seu peso (em kg):");
        String pesoStr = scanner.nextLine().replace(",", ".");

        /* Aqui é onde vamos ARMAZENAR os valores que o usuário digitou, e como
        estamos lidando com dados de peso e altura, certamente podemos precisar receber
        número com casas decimais, então o tipo da variável vai precisar ser "double".
         */
        double peso = Double.parseDouble(pesoStr);

        /* Repetição do que aprendemos acima:*/

        System.out.println("Digite sua altura (em metros):");
        String alturaStr = scanner.nextLine().replace(",", ".");
        double altura = Double.parseDouble(alturaStr);

        double imc = peso / (altura * altura);
        System.out.printf("Seu IMC é: %.2f%n", imc);

        if (imc < 18.5){
            System.out.println("Classificação: Abaixo do peso ideal");
        } else if (imc >= 18.5 && imc <= 24.9){
            System.out.println("Classificação: Peso normal");
        } else if (imc >= 25 && imc <= 29.9){
            System.out.println("Classificação: Sobrepeso");
        }else if (imc >= 30 && imc <= 34.9){
            System.out.println("Classificação: Obesidade grau I");
        } else if (imc >= 35 && imc <= 39.9){
            System.out.println("Classificação: Obesidade grau II");
        }else {
            System.out.println("Classificação: Obesidade grau III");
        }


    }
}