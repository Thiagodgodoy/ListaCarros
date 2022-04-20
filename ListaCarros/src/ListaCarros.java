import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ListaCarros {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> lista_de_carros = new ArrayList<String>();
        int opcao = 0;
        do{
            System.out.println("1- Adicionar | 2- Selecionar | 3- Alterar | 4- Remover | 5- Percorrer Tamanho | 6- Mostrar Lista | 7- Ordenar | 8 - ArrayList convertido em Array | |  | 10 - Sair");        
            opcao = sc.nextInt();

            if (opcao == 1){
            System.out.println("Digite quantas marcas deseja adicionar: ");
             int qtd = sc.nextInt();
                for(int i = 0; i < qtd; i++){            
                    System.out.println("Digite a marca que deseja adicionar: ");
                    String marca = sc.next();              
                    lista_de_carros.add(marca);            
                }
                System.out.println(lista_de_carros); 
            }
            if (opcao == 2){
                System.out.println("Digite qual marca deseja selecionar: ");
                int pos = sc.nextInt(); 
                System.out.println(lista_de_carros.get(pos)); 
            } 
            if (opcao == 3){
                System.out.println("Digite qual posição deseja alterar: ");
                int alterar = sc.nextInt();
                System.out.println("Digite qual carro gostaria de substituir: ");
                String carro = sc.next();
                lista_de_carros.set(alterar, carro);        

                System.out.println(lista_de_carros); 
            }
            if (opcao == 4){
                System.out.println("Digite qual posição deseja remover: ");
                int remover = sc.nextInt();
                System.out.println(lista_de_carros.remove(remover));

                System.out.println(lista_de_carros); 
                }
            if (opcao == 5){
                for(int i = 0; i < lista_de_carros.size(); i++){
                    System.out.println(lista_de_carros.get(i));
                } 
            }
            if (opcao == 6){
                for(String i : lista_de_carros){
                    System.out.println(i);
                } 
            }
            if (opcao == 7){
                Collections.sort(lista_de_carros);
                for (String i : lista_de_carros){
                    System.out.println(i);
                }
            }
            if (opcao == 8){
                String[] minha_lista_codigo = new String[] {"Fusca", "BMW", "Audi", "Ford"};
                ArrayList<String> lista = new ArrayList<String>(Arrays.asList(minha_lista_codigo));

                System.out.println(lista);
                }            
        } while (opcao != 10);            
        sc.close();
    }
}