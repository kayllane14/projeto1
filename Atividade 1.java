import java.util.Scanner;

 class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("BEM-VINDO, PARA COMEÇARMOS DIGA-ME O SEU NOME");
        Scanner DIGITADOR = new Scanner(System.in);
         String NOME1 = DIGITADOR.nextLine();

        System.out.println("Olá," + NOME1 +  ", obrigada pelo acesso, para continuamros seu cadastro,"+
         "diga-me sua idade:");
        int IDADE = DIGITADOR .nextInt();
        if(IDADE >= 18){
            System.out.println("Bem vindo "+ NOME1+ " , vimos que você é maior de idade, "+
            "logo possui acessso livre ao nosso site, aproveite!");
        } else {
            System.out.println("Infelizmente sua idade não condiz com as diretrizes do nosso "+
            "site, até a próxima!");
        }









    }
}

