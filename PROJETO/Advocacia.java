import java.util.Scanner;

public class Advocacia {

    public static void main(String[] args) {
        Scanner dadosUm = new Scanner(System.in);
        Advogados advogadoUm = new Advogados("", "", "", "", "", "", "", "", "", "", "", null);
        Scanner dadosDois = new Scanner(System.in);
        Clientes clienteUm = new Clientes("", "","", "", "", "", "", "", "", "", "", null);
        Endereco enderecoUm = new Endereco("", "", "", "", "", "", "");
        Endereco enderecoDois = new Endereco("", "", "", "", "", "", "");
        Processos processoUm = new Processos("", "", "", "", "", "", "", 0.0);
        Contrato contratoUm = new Contrato("", "", 0.0, 0, 0.0, "", 0, 0);
        advogadoUm.setCodAdv("CODADV01001");
        advogadoUm.setNome("Gabriel Galicia");
        advogadoUm.setOab("OABSP-50231");
        advogadoUm.setCivil("Solteiro");
        advogadoUm.setNasc("12/04/1989");
        advogadoUm.setEmail("gabriel_g@hotmail.com");
        advogadoUm.setCpf("354.895.762-64");
        advogadoUm.setRg("22.961.528-6");
        advogadoUm.setTel("(014)98585-4525");
        enderecoUm.setRua("Otavio Pinheiro Brisola");
        enderecoUm.setNumero("6-98");
        enderecoUm.setComplemento("casa");
        enderecoUm.setBairro("Jd. Panorama");
        enderecoUm.setCep("17011-450");
        enderecoUm.setCidade("Bauru");
        enderecoUm.setEstado("SP");       
        System.out.println("----------------------------------------------");
        System.out.println("---------------CADASTRO DE ACESSO-------------");
        System.out.println("Bem-Vindo, por favor crie seu login de acesso!");
        System.out.println("----------------------------------------------");
        System.out.println("Novo Login: ");
        advogadoUm.setLogin(dadosUm.nextLine());
        System.out.println("Nova Senha: ");
        advogadoUm.setSenha(dadosUm.nextLine());
        System.out.println("----------------------------------------------");
        System.out.println("---------CADASTRO EFETIVADO COM SUCESSO-------");
        System.out.println("----------------------------------------------");
        System.out.println("----------------LOGIN DE ACESSO---------------");
        Scanner login = new Scanner(System.in);
        Scanner senha = new Scanner(System.in);
        System.out.println("Login: ");
        String acessologin = login.nextLine();
        System.out.println("Senha: ");
        String acessosenha = senha.nextLine();
        for(int i=0; i<1;){
            if((advogadoUm.getLogin().equals(acessologin)) && (advogadoUm.getSenha().equals(acessosenha))){
                i++;
            }else{
                System.out.println("----------------------------------------------");
                System.out.println("Login e/ou Senha inválidos! \nPor Favor, tente novamente!");
                System.out.println("Login: ");
                acessologin = login.nextLine();
                System.out.println("Senha: ");
                acessosenha = senha.nextLine();
            }
        }   
             
        while(true){
            System.out.println("----------------------------------------------");
            System.out.println("Advogado(a): " + advogadoUm.getNome()+ "(Logado)");
            System.out.println("--------------------CADASTRO------------------");
            System.out.println("[1]:Dados Pessoais do cliente \n[2]:Endereço do cliente \n[3]:Contrato do cliente \n[4]:Processo do cliente");
            System.out.println("-------------------ATUALIZAÇÃO----------------");
            System.out.println("[5]:Advogado(e-mail e telefone) \n[6]:Dados Pessoais do cliente \n[7]:Endereço do cliente \n[8]:Status do cliente \n[9]:Contrato do cliente \n[10]:Processo do cliente");
            System.out.println("--------------------CONSULTA------------------");
            System.out.println("[11]:Cadastro completo do cliente \n[12]:Satus do cliente \n[13]:Contrato do cliente \n[14]:Processo do cliente");
            System.out.println("----------------------------------------------");
            Scanner menu = new Scanner(System.in);
            System.out.println("ESCOLHA A OPÇÃO:");
            int opcao = menu.nextInt();
        if (opcao==1){
            System.out.println("----------------------------------------------");
            System.out.println("    CADASTRO DE DADOS PESSOAIS DO CLIENTE");
            System.out.println("----------------------------------------------");
            clienteUm.setCodCli("CODCLI01001");
            System.out.println("Nome: ");
            clienteUm.setNome(dadosDois.nextLine());
            System.out.println("Estado civil: ");
            clienteUm.setCivil(dadosDois.nextLine());
            System.out.println("Data de Nascimento: ");
            clienteUm.setNasc(dadosDois.nextLine());
            System.out.println("E-mail: ");
            clienteUm.setEmail(dadosDois.nextLine());
            System.out.println("CPF: ");
            clienteUm.setCpf(dadosDois.nextLine());
            System.out.println("RG: ");
            clienteUm.setRg(dadosDois.nextLine());
            System.out.println("Telefone: ");
            clienteUm.setTel(dadosDois.nextLine());              
        }else if (opcao==2){
            System.out.println("----------------------------------------------");
            System.out.println("      CADASTRO DE ENDEREÇO DO CLIENTE");
            System.out.println("----------------------------------------------");
            System.out.println("Rua: ");
            enderecoDois.setRua(dadosDois.nextLine());
            System.out.println("Nº: ");
            enderecoDois.setNumero(dadosDois.nextLine());
            System.out.println("Complemento: ");
            enderecoDois.setComplemento(dadosDois.nextLine());
            System.out.println("Bairro: ");
            enderecoDois.setBairro(dadosDois.nextLine());
            System.out.println("CEP: ");
            enderecoDois.setCep(dadosDois.nextLine());
            System.out.println("Cidade: ");
            enderecoDois.setCidade(dadosDois.nextLine());
            System.out.println("Estado: ");
            enderecoDois.setEstado(dadosDois.nextLine());
        }else if(opcao==3){
            System.out.println("----------------------------------------------");
            System.out.println("             CONTRATO DO CLIENTE");
            System.out.println("----------------------------------------------");
            contratoUm.setCodAcordo("CODACO01001");
            System.out.println("Data da Formalização: ");
            contratoUm.setDataAcordo(dadosDois.nextLine());
            System.out.println("Valor Total: ");
            contratoUm.setValorTotal(dadosDois.nextDouble());
            System.out.println("Quantidade de Parcelas: ");
            contratoUm.setQtdParcela(dadosDois.nextInt());
            System.out.println("Data de Vencimento: ");
            contratoUm.setDataVenc(dadosDois.nextLine());
            System.out.println("Valor de Parcela: ");
            contratoUm.setValorParcela(dadosDois.nextDouble());
            System.out.println("Parcela em aberto: ");
            contratoUm.setParcelaPaga(dadosDois.nextInt());
        }else if(opcao==4){
            System.out.println("----------------------------------------------");
            System.out.println("              PROCESSO DO CLIENTE");
            System.out.println("----------------------------------------------");
            System.out.println("Nº do Processo: ");
            processoUm.setProcesso(dadosDois.nextLine());
            System.out.println("Honorários(em porcentagem): ");
            clienteUm.setHonorario(dadosDois.nextLine());
            System.out.println("Requerido: ");
            processoUm.setRequerido(dadosDois.nextLine());
            System.out.println("Comarca: ");
            processoUm.setComarca(dadosDois.nextLine());
            System.out.println("Tipo: ");
            processoUm.setTipo(dadosDois.nextLine());
            System.out.println("Data da Abertura: ");
            processoUm.setData(dadosDois.nextLine());
            System.out.println("Valor: ");
            processoUm.setValor(dadosDois.nextDouble());
        }else if(opcao==5){
            System.out.println("----------------------------------------------");
            System.out.println("             DADOS DO ADVOGADO(A)");
            System.out.println("----------------------------------------------");
            System.out.println("E-mail: ");
            advogadoUm.setEmail(dadosUm.nextLine());
            System.out.println("Telefone: ");
            advogadoUm.setTel(dadosUm.nextLine());      
        }else if(opcao==6){
            System.out.println("----------------------------------------------");
            System.out.println("              DADOS DO CLIENTE");
            System.out.println("----------------------------------------------");
            System.out.println("Estado civil: ");
            clienteUm.setCivil(dadosDois.nextLine());
            System.out.println("E-mail: ");
            clienteUm.setEmail(dadosDois.nextLine());
            System.out.println("Telefone: ");
            clienteUm.setTel(dadosDois.nextLine());  
        }else if(opcao==7){
            System.out.println("----------------------------------------------");
            System.out.println("             ENDEREÇO DO CLIENTE");
            System.out.println("----------------------------------------------");
            System.out.println("Rua: ");
            enderecoDois.setRua(dadosDois.nextLine());
            System.out.println("Nº: ");
            enderecoDois.setNumero(dadosDois.nextLine());
            System.out.println("Complemento: ");
            enderecoDois.setComplemento(dadosDois.nextLine());
            System.out.println("Bairro: ");
            enderecoDois.setBairro(dadosDois.nextLine());
            System.out.println("CEP: ");
            enderecoDois.setCep(dadosDois.nextLine());
            System.out.println("Cidade: ");
            enderecoDois.setCidade(dadosDois.nextLine());
            System.out.println("Estado: ");
            enderecoDois.setEstado(dadosDois.nextLine());
        }else if(opcao==8){
            System.out.println("----------------------------------------------");
            System.out.println("             STATUS DO CLIENTE");
            System.out.println("----------------------------------------------");
            System.out.println("Cliente: " + clienteUm.getNome());
            System.out.println("Situação: ");
            clienteUm.setSituacao(dadosDois.nextLine());
            System.out.println("Protestado: ");
            clienteUm.setProtesto(dadosDois.nextLine());     
        }else if(opcao==9){
            System.out.println("----------------------------------------------");
            System.out.println("             CONTRATO DO CLIENTE");
            System.out.println("----------------------------------------------");
            System.out.println("Cliente: " + clienteUm.getNome());
            System.out.println("Nº do Contrato: " + contratoUm.getCodAcordo());
            System.out.println("Formalizado em: " + contratoUm.getDataAcordo());
            System.out.println("Valor do Contrato: R$" + contratoUm.getValorTotal());
            System.out.println("Parcelas em Aberto: ");
            contratoUm.setParcelaPaga(dadosDois.nextInt());
            System.out.println("Parcelas em Atraso: ");
            contratoUm.setParcelaVencida(dadosDois.nextInt());
        }else if(opcao==10){
            System.out.println("----------------------------------------------");
            System.out.println("             PROCESSO DO CLIENTE");
            System.out.println("----------------------------------------------");
            System.out.println("Data da Audiencia: ");
            processoUm.setAudiencia(dadosDois.nextLine());
            System.out.println("Movimentação: ");
            processoUm.setMoviemnto(dadosDois.nextLine());   
        }else if(opcao==11){
            System.out.println("----------------------------------------------");
            System.out.println("              DADOS CADASTRAIS");
            System.out.println("----------------------------------------------");
            System.out.println(clienteUm);
            System.out.println(enderecoDois);
        }else if(opcao==12){
            System.out.println("----------------------------------------------");
            System.out.println("                   STATUS");
            System.out.println("----------------------------------------------");
            System.out.println("Código de Registro: " + clienteUm.getCodCli());
            System.out.println("Cliente: " + clienteUm.getNome());
            System.out.println("Situação do cliente: " + clienteUm.getSituacao());
            System.out.println("Protestado: " + clienteUm.getProtesto());
        }else if(opcao==13){
            System.out.println("----------------------------------------------");
            System.out.println("             RELATÓRIO DO CONTRATO");
            System.out.println("----------------------------------------------");
            System.out.println("Código de Registro: " + clienteUm.getCodCli());
            System.out.println("Cliente: " + clienteUm.getNome());
            System.out.println(contratoUm);
        }else if(opcao==14){
            System.out.println("----------------------------------------------");
            System.out.println("            RELATÓRIO DO PROCESSO");
            System.out.println("----------------------------------------------");
            System.out.println("Código de Registro: " + clienteUm.getCodCli());
            System.out.println("Cliente: " + clienteUm.getNome());
            System.out.println(processoUm);
        }else{
            System.out.println("Fim do Programa!");
            dadosUm.close();
            dadosDois.close();
            login.close();
            senha.close();
            menu.close();
            break;
        }
        } 
    }
}