/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.ArrayList;
import java.util.Scanner;
import model.Endereco;
import model.Material;
import model.Missao;
import model.Status;
import model.Usuario;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int opcao, opcao2, opcao3;
        String email;
        String senha;
        String usuarioLogado;
        ArrayList<Usuario> listaDeUsuario = new ArrayList<>();

        Usuario u = new Usuario();
        Missao m = new Missao();
        Endereco endereco = new Endereco();
        Material material = new Material();
        Status status = new Status();

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
                    System.out.println("digite os dados para a realização do cadastro");

                    System.out.println("nome: ");
                    u.setNome(s.next());

                    System.out.println("email: ");
                    u.setEmail(s.next());

                    System.out.println("Senha: ");
                    u.setSenha(s.next());

                    System.out.println("endereço");

                    System.out.println("Rua: ");
                    endereco.setRua(s.next());
                    System.out.println("Numero: ");
                    endereco.setNumero(s.nextInt());
                    System.out.println("Bairro: ");
                    endereco.setBairro(s.next());
                    System.out.println("CEP: ");
                    endereco.setCep(s.next());

                    u.setEndereco(endereco);

                    System.out.println("telefone");
                    u.setTelefone(s.next());

                    System.out.println("digite 1 para ser um Fornecedor de material reciclavel");
                    System.out.println("digite 2 para ser um Recebedor de material reciclavel");
                    int funcao = s.nextInt();
                    if (funcao == 1) {
                        u.setFuncao(1);
                    } else if (funcao == 2) {
                        u.setFuncao(2);
                    }

                    listaDeUsuario.add(u);

                    System.out.println(listaDeUsuario);
                    break;

                // CASE DO LOGIN
                case 2:

                    System.out.println("digite  seu Email ");
                    email = s.next();
                    System.out.println("digite sua senha");
                    senha = s.next();

                    for (int i = 0; i < listaDeUsuario.size(); i++) {
                        if (listaDeUsuario.get(i).getEmail().contains(email) && listaDeUsuario.get(i).getSenha().contains(senha)) {

                            usuarioLogado = email;

                            System.out.println("usuario " +  usuarioLogado + " está logado");
                            
                            
                                if (listaDeUsuario.get(i).getEmail().contains(usuarioLogado)) {
                                        int funcao1 = listaDeUsuario.get(i).getFuncao();
                                    
                                        if (funcao1 == 2) {
                                        do {
                                            System.out.println("-------- MENU DO RECEBEDOR -------- ");
                                            System.out.println("1 - CRIAR MISSÃO");
                                            System.out.println("2 - VER MINHAS MISSÕES");
                                            System.out.println("4 - FAZER LOGOUT");
                                            opcao2 = s.nextInt();
                                            
                                            
                                            switch (opcao2) {
                                                case 1:
                                                    System.out.println("--------CRIADOR DE MISSÕES-------- ");

                                                    System.out.println("Nome da missão ");
                                                    m.setNome(s.next());

                                                    System.out.println("Qual o objetivo da missão? ex:(12 taboas para construir um pallet) ");
                                                    m.setObjetivo(s.next());

                                                    System.out.println("Selecione os materiais desejados");

                                                    System.out.println("1 para aluminio");
                                                    System.out.println("2 para plastico");
                                                    System.out.println("3 para papel/papelão");
                                                    System.out.println("4 para metais ferrosos");
                                                    System.out.println("5 para vidro");
                                                    opcao3 = s.nextInt();

                                                    switch (opcao3) {
                                                        case 1:
                                                            material.setTipoDoMaterial(1);
                                                            break;

                                                        case 2:
                                                            material.setTipoDoMaterial(2);
                                                            break;

                                                        case 3:
                                                            material.setTipoDoMaterial(3);
                                                            break;
                                                        case 4:
                                                            material.setTipoDoMaterial(4);
                                                            break;
                                                        case 5:
                                                            material.setTipoDoMaterial(5);
                                                            break;
                                                    }
                                                    
                                                   //setando o status da missao
                                                    status.setStatus(1);
                                                    m.setStatus(status);
                                                   //-------------------------- 
                                                    System.out.println("digite a pontução para essa missão:");
                                                    m.setPontuacao(s.nextInt());
                                                    
                                                    m.setEmailDoCriador(usuarioLogado);
                                                    m.setEmailDoRecebedor("");
                                                    
                                                    m.toString();
                                                    
                                                   
                                            }
                                        } while (opcao2 != 4);
                                    } 
                                    else{
                                        do {                                            
                                            System.out.println("-------- MENU DO FORNECEDOR -------- ");
                                            System.out.println("1 - VISUALIZAR MISSÕES ");
                                            System.out.println("2 - VER MISSÕES ACEITAS");
                                            System.out.println("3 - VER MISSÕES CONCLUIDAS");
                                            System.out.println("4 - FAZER LOGOUT");
                                            opcao2 = s.nextInt();
                                        } while (opcao2 != 4);
                                    }

                                }
                            }

                         else {
                            System.out.println("Usuario nao encontrado");
                        }
                    }

            }

        } while (opcao != 3);

    }
}
