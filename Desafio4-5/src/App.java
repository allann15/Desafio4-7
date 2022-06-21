import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeSet;



import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        //QUESTÃO 4
        
        System.out.println("Informe quantos itens você ira colocar: ");
        int N = sc.nextInt();
        sc.nextLine();
        String[] arrayItens = new String[N];
        for(int i = 0; i< N; i++){
            arrayItens[i] = sc.nextLine();
            
        
        }
        List<String> busca = Arrays.asList(arrayItens);
        
        
        
        System.out.println("Informe o item que você deseja pesquisar: ");
        String pesquisa = sc.nextLine();
        System.out.println("Sua pesquisa se tem na lista  deu: " + busca.contains(pesquisa));
        if(busca.contains(pesquisa) == false){
            
            System.out.println("Veja se você não cometeu um erro de digitação");
        }
        System.out.print("Esses são os itens que temos na nossa lista: ");
        System.out.println(busca);

        //Questão 5
        Set<String> mensagensDupi = new TreeSet<>();
        LinkedList<String> mensagens = new LinkedList<>();
        mensagens.add("feliz natal");
        mensagens.add("feliz aniversario");
        mensagens.add("feliz ano novo");
        System.out.println("você quer cadastrar mais mensagens?(Responda com sim ou não) ");
        String resposta = sc.nextLine();
        if(resposta.compareToIgnoreCase("sim") == 0  ){
        System.out.println("Informe o numero de mensagens que deseja inserir: ");
        int y = sc.nextInt();
        
        System.out.print("Informe as mensagens:");
        String mensagemPrim = sc.nextLine();
        for(int i = 0; i < y; i++){
            
            String msg = sc.nextLine();
            if(msg == ","){
                msg.replace(",", mensagemPrim);
            }
            
            mensagens.add(msg);
        }
    }
        mensagensDupi.addAll(mensagens);
        LinkedList<String> mensagens2 = new LinkedList<>();
        mensagens2.addAll(mensagensDupi);
        
        System.out.println("Essas são as mensagens que você tem: " + mensagens2);
   

        
        //Questão 6
        Set<String> emails3 = new TreeSet<>();
        LinkedList<String> emailsprim = new LinkedList<>();
        System.out.println("Informe quantos emails dos apps ira cadastrar: ");
        int n = sc.nextInt();
        
        System.out.println("Informe os emails:");
        String emailPrim = sc.nextLine();
        for(int i = 0; i < n; i++){
            
            String email2 = sc.nextLine();
            if(email2 == ","){
                email2.replace(",", emailPrim);
            }
            
            emailsprim.add(email2);
        }
        //removendo duplicadas
        emails3.addAll(emailsprim);
        //adicionando em uma nova lista
        LinkedList<String> emailsprim2 = new LinkedList<>();
        emailsprim2.addAll(emails3);
        
        
        
        
        
        
         
         
        System.out.println("Esses são os emails cadastrados: " + emailsprim2);
        LinkedList<String> recebeprim = new LinkedList<>();
        System.out.println("informe quantos emails irão enviar as solicitações: ");
        int c = sc.nextInt();
        
        System.out.println("informe quais emails irão enviar as solicitações : ");
        for(int i = 0; i <= c; i++){
              String  emailsolicitacao = sc.nextLine();
              if(emailsprim2.contains(emailsolicitacao)){
                recebeprim.add(emailsolicitacao);
              }
             
        }
        Collections.sort(recebeprim);
        
        System.out.println("Esses são os emails que enviaram solicitações: " + recebeprim);
        
        //Questão 7
        Set<String> emailsDupi = new TreeSet<>();
        LinkedList<String> emails = new LinkedList<>();
        System.out.println("Informe quantos emails dos apps ira cadastrar: ");
        int m = sc.nextInt();
        
        System.out.print("Informe os do primeiro emails:");
        String primeiroEmail = sc.nextLine();
        for(int i = 0; i < m; i++){
            
            String email2 = sc.nextLine();
            if(email2 == ","){
                email2.replace(",", primeiroEmail);
            }
            
            emails.add(email2);
        }
        
        emailsDupi.addAll(emails);
        LinkedList<String> emails2 = new LinkedList<>();
        emails2.addAll(emailsDupi);
        
        
        
        System.out.println("Esses são os emails cadastrados no primeiro lote: " + emails2);
        Set<String> secondemailsDupi = new TreeSet<>();
        LinkedList<String> secondemails = new LinkedList<>();
        
        System.out.println("Informe quantos emails dos apps ira cadastrar nesse segundo lote: ");
        int quant = sc.nextInt();
        System.out.print("Informe os emails:");
        String emailSecond = sc.nextLine();
        for(int i = 0; i < quant; i++){
            
            String secemail = sc.nextLine();
            if(secemail == ","){
                secemail.replace(",",emailSecond);
            }
            
            secondemails.add(secemail);
        }
        secondemailsDupi.addAll(secondemails);
        LinkedList<String> secondemails2 = new LinkedList<>();
        secondemails2.addAll(secondemailsDupi);
        System.out.println("esses são os emails cadastrados no segundo lote: " + secondemails2);
        
        
        
        
        LinkedList<String> recebe = new LinkedList<>();
        
        System.out.println("informe quantos emails irão enviar as solicitações: ");
        int x = sc.nextInt();
        System.out.println("informe os emails que irão enviar as solicitações: ");
        for(int i = 0; i <= x; i++){
              String  emailsolicitacao = sc.nextLine();
              if(emails2.contains(emailsolicitacao)){
                recebe.add(emailsolicitacao);
              }
              if(secondemails2.contains(emailsolicitacao)){
                recebe.add(emailsolicitacao);
              }
              if(emails2.contains(emailsolicitacao) && secondemails2.contains(emailsolicitacao))  {
                recebe.removeLastOccurrence(emailsolicitacao);
              }
             
        
    }
        
        
        
        
        Collections.sort(recebe);
        
        System.out.println("Esses são os emails que enviaram solicitações: " + recebe);
        
       


        }
    }

