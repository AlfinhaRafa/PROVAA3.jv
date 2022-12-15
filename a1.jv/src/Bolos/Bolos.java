package Bolos;
import Doces.Doces;

import java.security.Principal;
import java.util.ArrayList;
import java.util.Scanner;

public class Bolos extends Doces {//Herdando da classe doces
    Scanner scan = new Scanner(System.in);

    int escolha;
    //aba de doces;
    String idDd;
    String nomeDd;
    String quantidadeDd;
    double valorDd;
    String saborDd;
    String validadeDd;
    String novo;

    public Bolos(String classeDd, String nome, String quantidade, String sabor, String validade, double valor) {
        super(classeDd, nome, quantidade, sabor, validade, valor);

    }

    ArrayList<Doces> doces = new ArrayList<>();

    public ArrayList<Doces> getDoces() {// RETORNA TODA MINHA LISTA DE USUARIOS
        System.out.println("Tipo:       Nome:        Sabor:      Quantidade:     Validade:    Valor: ");
        System.out.println("---------------------------------------------------------------------------------");

        System.out.println();

        for (Doces lista : doces) {

            System.out.println("* " + lista.getIdDd() + " | " + lista.getNomeDd() + " | " + lista.getSaborDd() + " |   " + lista.getQuantidadeDd() + " |   "
                    + lista.getValidadeDd() + " |   " + lista.getValorDd());
            System.out.println("---------------------------------------------------------------------------------");

        }
        return doces;
    }

    public void DocesArrayList() {
        doces.add(new Doces("Brigadeiro", "Meio amargo", "100", "cacau 50%", "12-12-2022", 2.50));
        doces.add(new Doces("Brigadeiro", "Chocolate com café", "150", "café", "12-12-2022", 2.50));
        doces.add(new Doces("Bolos", "Brownie", "200", "chocolate", "12-12-2022", 5.50));
        doces.add(new Doces("Bolos", "Cupcake", "100", "ninho", "12-12-2022", 8.50));
        doces.add(new Doces("Donuts", "Donuts de oreo", "100", "chocolate", "12-12-2022", 12.3));
        doces.add(new Doces("Donuts", "Donuts puro", "30", "cobertura de chocolate", "12-12-2022", 11.6));
        doces.add(new Doces("Donuts", "Donuts de beijinho", "203", "coco", "12-12-2022", 12.3));
    }

    Doces bolos = new Doces();

    public void cadastrarBolo() {
        //CADASTRO DE DOCES
        Doces doces1 = new Doces();
        try {
            System.out.println("Digite o tipo: ");
            System.out.flush();//limpar o teclado
            idDd = scan.next();
            doces1.setIdDd(idDd);

            System.out.println("Digite o nome: ");
            System.out.flush();//limpar o teclado
            nomeDd = scan.next();
            doces1.setNomeDd(nomeDd);

            System.out.flush();
            System.out.println("Digite a quantidade: ");
            System.out.flush();
            quantidadeDd = scan.next();
            doces1.setQuantidadeDd(quantidadeDd);

            System.out.flush();
            System.out.println("Digite o sabor: ");
            System.out.flush();
            saborDd = scan.next();
            doces1.setSaborDd(saborDd);

            System.out.flush();
            System.out.println("Digite a validade: ");
            System.out.flush();
            validadeDd = scan.next();
            doces1.setValidadeDd(validadeDd);


            System.out.flush();
            System.out.println("Digite o valor: ");
            System.out.flush();
            valorDd = Double.parseDouble(scan.next());
            doces1.setValorDd(valorDd);
            if (valorDd != 0) {
                System.out.println("CADASTRO FEITO!");
            }
        } catch (Exception e) {
            System.out.println("TENTE NOVAMENTE");
        }

        doces.add(doces1);//adiciona o doce a lista

    }

    public void BuscarDoces() {
        try {

            System.out.println("Digite o nome do produto que você procura: ");// buscar produto
            System.out.flush();
            String busca = scan.next();
            boolean fin = false;
            for (int i = 0; i < doces.size(); i++) {
                Doces currentDoces = (Doces) doces.get(i);
                if (currentDoces.getNomeDd().equalsIgnoreCase(busca)) {
                    System.out.println("Tipo: " + currentDoces.getIdDd());
                    System.out.println("Nome: " + currentDoces.getNomeDd());
                    System.out.println("Sabor: " + currentDoces.getSaborDd());
                    System.out.println("Quantidade: " + currentDoces.getQuantidadeDd());
                    System.out.println("Validade: " + currentDoces.getValidadeDd());
                    System.out.println("Valor: " + currentDoces.getValorDd());

                    fin = true;
                }

            }
        } catch (Exception e) {
            System.out.println("VALOR NULO");
        }
    }

    public void EditarDoces() {
        System.out.println(" EDITAR NOME");
        System.out.println("Digite o nome do doce que você quer atualizar: ");// buscar produto

        boolean fin = false;
        String busca = scan.next();
        for (int i = 0; i < doces.size(); i++) {
            Doces currentDoces = (Doces) doces.get(i);
            if (currentDoces.getNomeDd().equalsIgnoreCase(busca)) {
                System.out.println("Tipo:       Nome:        Sabor:      Quantidade:     Validade:    Valor: ");
                System.out.println("---------------------------------------------------------------------------------");
                System.out.println("* " + currentDoces.getIdDd() + " | " + currentDoces.getNomeDd() + " | " + currentDoces.getSaborDd() + " |   " + currentDoces.getQuantidadeDd() + " |   " + currentDoces.getValidadeDd() + " |   " + currentDoces.getValorDd());
                System.out.println("---------------------------------------------------------------------------------");

                System.out.println("Digite o Novo Nome");
                novo = scan.next();
                currentDoces.setNomeDd(novo);
                System.out.println("Tipo: " + currentDoces.getIdDd());
                System.out.println("Nome: " + currentDoces.getNomeDd());
                System.out.println("Sabor: " + currentDoces.getSaborDd());
                System.out.println("Quantidade: " + currentDoces.getQuantidadeDd());
                System.out.println("Validade: " + currentDoces.getValidadeDd());
                System.out.println("Valor: " + currentDoces.getValorDd());

                fin = true;
            }


        }
    }

    public void ExcluirDoce() {
        scan = new Scanner(System.in);
        System.out.println("Digite o nome do doce que você quer excluir: ");// excluir produto
        String busca = scan.nextLine();
        for (int i = 0; i < doces.size(); i++) {
            Doces currentDoces = (Doces) doces.get(i);
            if (currentDoces.getNomeDd().equalsIgnoreCase(busca)) {
                System.out.println("Tipo:       Nome:        Sabor:      Quantidade:     Validade:    Valor: ");
                System.out.println("---------------------------------------------------------------------------------");
                System.out.println("* " + currentDoces.getIdDd() + " | " + currentDoces.getNomeDd() + " | " + currentDoces.getSaborDd() + " |   " + currentDoces.getQuantidadeDd() + " |   " + currentDoces.getValidadeDd() + " |   " + currentDoces.getValorDd());
                System.out.println("---------------------------------------------------------------------------------");

                System.out.println(" você realmente quer excluir? (sim) (nao) ");// excluir
                String verdade = scan.next();
                if(verdade.toUpperCase().equals("sim".toUpperCase())){
                    doces.remove(currentDoces);
                    System.out.println(" Doce removido! ");

                }else{
                    return;
                }




            }
        }

    }
}




