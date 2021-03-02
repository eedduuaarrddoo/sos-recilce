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
        int opcao,opcao2,opcao3;
        String email;
        String senha;
        String usuarioLogado;
        ArrayList<Usuario> listaDeUsuario = new ArrayList<>();
        
        Usuario u = new Usuario();
        Missao m = new Missao ();
        Endereco endereco = new Endereco();

        do {
            System.out.println("-------- SOS RECICLE -------- ");
            System.out.println("1 - Cadastrar Usuario");
            System.out.println("2 - Login");
            System.out.println("3 - Sair");
            System.out.println("------------------------ ");
            System.out.println("Escolha a opcao desejada: ");
            opcao = s.nextInt();

            switch (opcao) {
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
                    if(funcao == 1){
                        u.setFuncao(1);
                    } else if(funcao == 2){
                        u.setFuncao(2);
                    }
                    
                   
                    
                    listaDeUsuario.add(u);
                    
                    System.out.println(listaDeUsuario);
                    break;       
                case 2 : 
                   
                    System.out.println("digite  seu Email ");
                    email = s.next();
                    System.out.println("digite sua senha");
                     senha = s.next();
                     for (int i = 0; i < listaDeUsuario.size(); i++) {
                        if(listaDeUsuario.get(i).getEmail().contains(email)&& listaDeUsuario.get(i).getSenha().contains(senha)){
                            
                            usuarioLogado = email; 
                            
                            System.out.println(usuarioLogado);
                            if(funcao = 1){
                            System.out.println("-------- MENU do Rebedor -------- ");
                            System.out.println("1 - CRIAR MISSÃO");
                            System.out.println("2 - VER MINHAS MISSÕES");
                            opcao2 = s.nextInt();
                            switch (opcao2){
                                    
                                case 1:
                                   System.out.println("--------CRIADOR DE MISSÕES-------- "); 
                                   System.out.println("Nome da missão ");
                                   m.setNome(s.next());
                                   System.out.println("Qual o objetivo da missão? ex:(12 taboas para construir um pallet) ");
                                   m.setObjetivo(s.next());
                                   System.out.println("Selecione os materiais desejados");
                                   
                                   switch(opcao3){
                                       case 1:
                                   }
                            
                            
                           
    
                            }   
                            }
                            
                            else{}
                        }else{System.out.println("Usuario nao encontrado");}
                    }
                          
                     
            }

        } while (opcao != 3);

    }
}
