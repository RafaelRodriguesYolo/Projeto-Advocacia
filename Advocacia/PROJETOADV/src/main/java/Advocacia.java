import java.util.Scanner;

public class Advocacia {

    public static void main(String[] args) {
        Scanner dadosUm = new Scanner(System.in);
        Advogados advogadoUm = new Advogados("", "", "", "", "", 0.0, 0.0, 0.0);
        System.out.println("=======================================");
        System.out.println("===========REGISTRO-ADVOGADO===========");
        System.out.println("Advogado(a): ");
        advogadoUm.setNome(dadosUm.nextLine());
        System.out.println("Nº da OAB: ");
        advogadoUm.setOab(dadosUm.nextLine());
        System.out.println("Estado civil: ");
        advogadoUm.setCivil(dadosUm.nextLine());
        System.out.println("Data de Nascimento: ");
        advogadoUm.setNasc(dadosUm.nextLine());
        System.out.println("E-mail: ");
        advogadoUm.setEmail(dadosUm.nextLine());
        System.out.println("CPF: ");
        advogadoUm.setCpf(dadosUm.nextDouble());
        System.out.println("RG: ");
        advogadoUm.setRg(dadosUm.nextDouble());
        System.out.println("Telefone: ");
        advogadoUm.setTel(dadosUm.nextDouble());
        System.out.println("=======================================");
        System.out.println("=========RELATÓRIO-CAD-ADVOGADO========");
        System.out.println(advogadoUm);
    }
    
}
