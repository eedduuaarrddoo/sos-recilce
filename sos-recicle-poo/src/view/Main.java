package view;


import java.util.ArrayList;
import java.util.Scanner;
import model.Endereco;
import model.Material;
import model.Missao;
import model.Status;
import model.Usuario;
import model.UsuarioFornecedor;
import model.UsuarioRecebedor;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int opcao, opcao2, opcao3, opcao5 = 0;

        String email;
        String senha;
        String usuarioLogado;

        ArrayList<UsuarioFornecedor> listaDeUsuarioFornecedor = new ArrayList<>();
        ArrayList<UsuarioRecebedor> listaDeUsuarioRecebedor = new ArrayList<>();

        ArrayList<Missao> listaDeMissao = new ArrayList<>();

        Usuario u = new Usuario();
        
        
        
        
        

        do {
            
            System.out.println("-------- SOS RECICLE -------- ");
            System.out.println("1 - Cadastrar Usuario");
            System.out.println("2 - Login");
            System.out.println("3 - Sair");
            System.out.println("------------------------ ");
            System.out.println("Escolha a opcao desejada: ");

            opcao = s.nextInt();

            switch (opcao) {
                // CASE DO CADASTRO
                case 1:
                   
                    UsuarioFornecedor uf = new UsuarioFornecedor();
                    
                    Endereco endereco = new Endereco();
                    
                    
                    System.out.println("digite os dados para a realização do cadastro");
                    System.out.println(" ");

                    System.out.println("digite 1 para ser um Fornecedor de material reciclavel");
                    System.out.println("digite 2 para ser um Recebedor de material reciclavel");
                    int funcao = s.nextInt();

                    if (funcao == 1) {
                        System.out.println("nome: ");
                        uf.setNome(s.next());

                        uf.setPontuacao(0);

                        System.out.println("email: ");
                        uf.setEmail(s.next());

                        System.out.println("Senha: ");
                        uf.setSenha(s.next());

                        System.out.println("endereço");

                        System.out.println("Rua: ");
                        endereco.setRua(s.next());
                        System.out.println("Numero: ");
                        endereco.setNumero(s.nextInt());
                        System.out.println("Bairro: ");
                        endereco.setBairro(s.next());
                        System.out.println("CEP: ");
                        endereco.setCep(s.next());

                        uf.setEndereco(endereco);

                        System.out.println("telefone");
                        uf.setTelefone(s.next());

                        uf.setFuncao(1);

                        listaDeUsuarioFornecedor.add(uf);

                        System.out.println(listaDeUsuarioFornecedor);

                    } else if (funcao == 2) {
                        UsuarioRecebedor ur = new UsuarioRecebedor();
                        
                        System.out.println("nome: ");
                        ur.setNome(s.next());

                        ur.setNivel(0);

                        System.out.println("email: ");
                        ur.setEmail(s.next());

                        System.out.println("Senha: ");
                        ur.setSenha(s.next());

                        System.out.println("endereço");

                        System.out.println("Rua: ");
                        endereco.setRua(s.next());
                        System.out.println("Numero: ");
                        endereco.setNumero(s.nextInt());
                        System.out.println("Bairro: ");
                        endereco.setBairro(s.next());
                        System.out.println("CEP: ");
                        endereco.setCep(s.next());

                        ur.setEndereco(endereco);

                        System.out.println("telefone");
                        ur.setTelefone(s.next());

                        ur.setFuncao(2);

                        listaDeUsuarioRecebedor.add(ur);

                        System.out.println(listaDeUsuarioRecebedor);

                    }
                    break;

                // CASE DO LOGIN
                case 2:

                    System.out.println("digite  seu Email ");
                    email = s.next();
                    System.out.println("digite sua senha");
                    senha = s.next();

                    for (int i = 0; i < listaDeUsuarioFornecedor.size() || i < listaDeUsuarioRecebedor.size(); i++) {
                        if (listaDeUsuarioFornecedor.get(i).getEmail().contains(email) && listaDeUsuarioFornecedor.get(i).getSenha().contains(senha)) {

                            usuarioLogado = email;

                            System.out.println("usuario " + usuarioLogado + " está logado");

                            //if (listaDeUsuarioRecebedor.get(i).getEmail() == usuarioLogado) {
                            do {
                                System.out.println("-------- MENU DO RECEBEDOR -------- ");
                                System.out.println("1 - CRIAR MISSÃO");
                                System.out.println("2 - VER MINHAS MISSÕES");
                                System.out.println("3 - CONFIRMAR A CONCLUSÃO DE UMA MISSÃO");
                                System.out.println("4 - FAZER LOGOUT");
                                opcao2 = s.nextInt();

                                switch (opcao2) {
                                    case 1:
                                        Missao m = new Missao();
                                        Material material = new Material();
                                        Status status = new Status();
                                        
                                        System.out.println("-------- DIGITE OS DADOS PARA CRIAR UMA MISSÃO -------- ");

                                        m.setId(listaDeMissao.size());

                                        System.out.println("Nome da missão ");
                                        m.setNome(s.nextLine());

                                        System.out.println("Qual o objetivo da missão? ex:(12 taboas para construir um pallet) ");
                                        m.setObjetivo(s.nextLine());

                                        System.out.println("Selecione os materiais desejados");

                                        System.out.println("1 para aluminio");
                                        System.out.println("2 para plastico");
                                        System.out.println("3 para papel/papelão");
                                        System.out.println("4 para metais ferrosos");
                                        System.out.println("5 para vidro");

                                        opcao3 = s.nextInt();

                                        switch (opcao3) {
                                            case 1:
                                                material.setTipoDoMaterial("ALUMINIO");
                                                break;

                                            case 2:
                                                material.setTipoDoMaterial("PLASTICO");
                                                break;

                                            case 3:
                                                material.setTipoDoMaterial("PAPEL/PAPELAO");
                                                break;
                                            case 4:
                                                material.setTipoDoMaterial("METAIS FERROSOS");
                                                break;
                                            case 5:
                                                material.setTipoDoMaterial("VIDRO");
                                                break;
                                        }

                                        m.setMaterial(material);

                                        //setando o status da missao
                                        status.setStatus(0);
                                        m.setStatus(status);
                                        //-------------------------- 
                                        System.out.println("digite a pontução para essa missão:");
                                        m.setPontuacao(s.nextInt());

                                        m.setEmailDoCriador(usuarioLogado);
                                        System.out.println(m.getEmailDoCriador());
                                        m.setEmailDoFornecedor("");

                                        listaDeMissao.add(m);
                                        break;

                                    case 2:
                                        for (int j = 0; j < listaDeMissao.size(); j++) {
                                            System.out.println("-----------------------------------------------------");
                                            System.out.println("| ID: " + listaDeMissao.get(j).getId());
                                            System.out.println("| NOME: " + listaDeMissao.get(j).getNome());
                                            System.out.println("| PONTUACAÇÃO: " + listaDeMissao.get(i).getPontuacao());
                                            System.out.println("| OBJETIVO: " + listaDeMissao.get(j).getObjetivo());
                                            System.out.println("| MATERIAL: " + listaDeMissao.get(j).getMaterial().getTipoDoMaterial());

                                            if (listaDeMissao.get(j).getStatus().getStatus() == 0) {
                                                System.out.println("| STATUS DA MISSÃO: EM ABERTO");
                                            }
                                            if (listaDeMissao.get(j).getStatus().getStatus() == 1) {
                                                System.out.println("| STATUS DA MISSÃO: EM ANDAMENTO ");
                                                System.out.println("| EMAIL DE QUEM ACEITOU ESSA MISSÃO: " + listaDeMissao.get(j).getEmailDoFornecedor());
                                            }
                                            if (listaDeMissao.get(j).getStatus().getStatus() == 2) {
                                                System.out.println("| STATUS DA MISSÃO: CONCLUIDA");
                                                System.out.println("| EMAIL DE QUEM ACEITOU ESSA MISSÃO: " + listaDeMissao.get(j).getEmailDoFornecedor());
                                            }
                                            if (listaDeMissao.get(j).getStatus().getStatus() == 3) {
                                                System.out.println("| STATUS DA MISSÃO: NÃO CONCLUIDA");
                                                System.out.println("| EMAIL DE QUEM ACEITOU ESSA MISSÃO: " + listaDeMissao.get(j).getEmailDoFornecedor());
                                            }
                                            System.out.println("---------------------------------------------------------");

                                        }
                                        break;

                                    case 3:
                                        for (int j = 0; j < listaDeMissao.size(); j++) {
                                            if (listaDeMissao.get(j).getStatus().getStatus() == 1) {
                                                System.out.println("---------------------");
                                                System.out.println("| ID: " + listaDeMissao.get(j).getId());
                                                System.out.println("| NOME: " + listaDeMissao.get(j).getNome());
                                                System.out.println("| PONTUACAÇÃO: " + listaDeMissao.get(i).getPontuacao());
                                                System.out.println("| OBJETIVO: " + listaDeMissao.get(j).getObjetivo());
                                                System.out.println("| MATERIAL: " + listaDeMissao.get(j).getMaterial().getTipoDoMaterial());
                                                System.out.println("---------------------");
                                                System.out.println("");
                                            }

                                            System.out.println("DIGITE O ID DA MISSÃO DA QUAL VOCÊ DESEJA MUDAR O STATUS");
                                            int idMissão = s.nextInt();
                                            System.out.println(idMissão);
                                            System.out.println("DIGITE 1 PARA ALTERAR O STATUS PARA 'MISSÃO CONCLUIDA' ");
                                            System.out.println("DIGITE 2 PARA ALTERAR O STATUS PARA 'MISSÃO NÃO CONCUIDA");
                                            int statusMissao = s.nextInt();

                                            switch (statusMissao) {
                                                case 1:
                                                    Status status1 = new Status();
                                                    for (int k = 0; k < listaDeMissao.size(); k++) {
                                                        if (listaDeMissao.get(k).getId() == idMissão) {
                                                            status1.setStatus(2);
                                                            listaDeMissao.get(k).setStatus(status1);
                                                        }

                                                    }
                                                    break;
                                                case 2:
                                                    Status status2 = new Status();
                                                    for (int k = 0; k < listaDeMissao.size(); k++) {
                                                        if (listaDeMissao.get(k).getId() == idMissão) {
                                                            status2.setStatus(3);
                                                            listaDeMissao.get(k).setStatus(status2);
                                                        }

                                                    }
                                                    break;

                                            }

                                        }

                                }
                            } while (opcao2 != 4);

                        } else if (listaDeUsuarioRecebedor.get(i).getEmail().contains(email) && listaDeUsuarioRecebedor.get(i).getSenha().contains(senha)) {
                            usuarioLogado = email;

                            System.out.println("usuario " + usuarioLogado + " está logado");

                            do {
                                System.out.println("-------- MENU DO FORNECEDOR -------- ");
                                System.out.println("1 - VISUALIZAR MISSÕES E ACEITAR MISSÃO ");
                                System.out.println("2 - VER MISSÕES ACEITAS");
                                System.out.println("3 - VER MISSÕES CONCLUIDAS");                              
                                System.out.println("4 - FAZER LOGOUT");
                                opcao2 = s.nextInt();

                                switch (opcao2) {
                                    case 1:

                                        for (int j = 0; j < listaDeMissao.size(); j++) {
                                            if (listaDeMissao.get(j).getStatus().getStatus() == 0) {
                                                System.out.println("<^^^^^^^^^^^^^^^^^^^^^^^>");
                                                System.out.println("| ID: " + listaDeMissao.get(j).getId());
                                                System.out.println("| NOME: " + listaDeMissao.get(j).getNome());
                                                System.out.println("| PONTUACAÇÃO: " + listaDeMissao.get(j).getPontuacao());
                                                System.out.println("| OBJETIVO: " + listaDeMissao.get(j).getObjetivo());
                                                System.out.println("| MATERIAL: " + listaDeMissao.get(j).getMaterial().getTipoDoMaterial());
                                                System.out.println("| Email do Fornecedor: " + listaDeMissao.get(j).getEmailDoCriador());
                                                System.out.println("<^^^^^^^^^^^^^^^^^^^^^^^>");
                                                
                                                 

                                            }
                                        } 
                                        
                                        System.out.println("DIGITE O ID DA MISSÃO QUE DESEJA ACEITAR");
                                        int idMissao = s.nextInt();
                                        for (int j = 0; j < listaDeMissao.size(); j++) {
                                            if (listaDeMissao.get(j).getId() == idMissao) {
                                                listaDeMissao.get(j).getStatus().setStatus(1);
                                                listaDeMissao.get(j).setEmailDoFornecedor(usuarioLogado);
                                            }
                                        
                                        }
                                       
                                    break;     
                                    case 2:
                                        
                                        System.out.println(usuarioLogado);
                                        for (int j = 0; j < listaDeMissao.size(); j++) {
                                            System.out.println(listaDeMissao.get(j).getEmailDoFornecedor());
                                            if (listaDeMissao.get(j).getStatus().getStatus() == 1 && listaDeMissao.get(j).getEmailDoFornecedor() == usuarioLogado) {
                                                System.out.println("<^^^^^^^^^^^^^^^^^^^^^^^>");
                                                System.out.println("| ID: " + listaDeMissao.get(j).getId());
                                                System.out.println("| NOME: " + listaDeMissao.get(j).getNome());
                                                System.out.println("| PONTUACAÇÃO: " + listaDeMissao.get(i).getPontuacao());
                                                System.out.println("| OBJETIVO: " + listaDeMissao.get(j).getObjetivo());
                                                System.out.println("| MATERIAL: " + listaDeMissao.get(j).getMaterial().getTipoDoMaterial());
                                                System.out.println("| EMAIL DO CRIADOR DA MISSÃO: " + listaDeMissao.get(j).getEmailDoCriador());
                                              
                                                System.out.println("<^^^^^^^^^^^^^^^^^^^^^^^>");
                                            }
                                        }
                                    break;
                                    
                                    case 3:
                                        System.out.println(usuarioLogado);
                                        for (int j = 0; j < listaDeMissao.size(); j++) {
                                            System.out.println(listaDeMissao.get(j).getEmailDoFornecedor());
                                            if (listaDeMissao.get(j).getStatus().getStatus() == 2 && listaDeMissao.get(j).getEmailDoFornecedor() == usuarioLogado ) {
                                                System.out.println("<^^^^^^^^^^^^^^^^^^^^^^^>");
                                                System.out.println("| ID: " + listaDeMissao.get(j).getId());
                                                System.out.println("| NOME: " + listaDeMissao.get(j).getNome());
                                                System.out.println("| PONTUACAÇÃO: " + listaDeMissao.get(i).getPontuacao());
                                                System.out.println("<^^^^^^^^^^^^^^^^^^^^^^^>");
                                            }
                                        }

                                    break;
                                }
                            } while (opcao2 != 4);

                        } else {
                            System.out.println("Usuario nao encontrado");
                        }
                    }

            }

        } while (opcao != 3);

    }

}
