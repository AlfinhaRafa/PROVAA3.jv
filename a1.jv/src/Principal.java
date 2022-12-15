//import Bolos.Bolos;
import Bolos.Bolos;
import Doces.Doces;

import javax.swing.*;
import java.lang.String;
import java.util.*;
import java.util.concurrent.ExecutionException;
public class Principal {
    static Bolos bolos = new Bolos("BRIGADEIRO", "Meio amargo", "100", "cacau 50%", "12-12-2022", 2.50);

    public static void main(String[] args) {
        bolos.DocesArrayList();
        int escolha;
        //aba de doces;
        String idDd;
        String nomeDd;
        String quantidadeDd;
        double valorDd;
        String saborDd;
        String validadeDd;
        String novo;
        Scanner scan = new Scanner(System.in);
boolean fin= true;
        while (fin) {
//Repete o menu até que chegue a ultima opção
            System.out.println("-------------------------");
            System.out.println("MENU PRINCIPAL");
            System.out.println("-------------------------");
            System.out.println("1 - CADASTRAR DOCES");
            System.out.println("2 - BUSCAR DOCES");
            System.out.println("3 - LISTA DE DOCES CADASTRADOS");
            System.out.println("4 - ATUALIZAR DOCE");
            System.out.println("5 - EXCLUIR DOCE");
            System.out.println("6 - SAIR");
            System.out.println("Digite sua opção: ");
            escolha = scan.nextInt();
            //aba de lista
            switch (escolha) {

                case 1:
                    bolos.cadastrarBolo();
                    break;

                case 2:
                    bolos.BuscarDoces();
                    break;

                case 3:
                    bolos.getDoces();
                    break;

                case 4:
                    bolos.EditarDoces();
                    break;

                case 5:
                    bolos.ExcluirDoce();
                    break;

                case 6:
                    fin= false;
                    break;
            }
        }
    }
}
