package Doces;
import java.util.ArrayList;

public class Doces {
    private String idDd;
    private String classeDd;
    private String nomeDd;
    private String quantidadeDd;
    private String saborDd;
    private String validadeDd;
    private double valorDd;

    public Doces() {
    }
    public Doces (String classeDd,String nome, String quantidade, String sabor,String validade, double valor){
        this.idDd= classeDd;
        this.nomeDd = nome;
        this.quantidadeDd = quantidade;
        this.saborDd = sabor;
        this.validadeDd = validade;
        this.valorDd = valor;
    }
    ArrayList<Doces> doces = new ArrayList<>();

    public ArrayList<Doces> getDoces() {// RETORNA TODA MINHA LISTA DE USUARIOS
        System.out.println("Tipo:       Nome:        Sabor:      Quantidade:     Validade:    Valor: ");
        System.out.println("---------------------------------------------------------------------------------");

        System.out.println();

        for (Doces lista : doces) {

            System.out.println("* " + lista.getIdDd() + " | " + lista.getNomeDd() + " | " + lista.getSaborDd() + " |   " + lista.getQuantidadeDd() + " |   "
                    +lista.getValidadeDd() + " |   " + lista.getValorDd());

        }
        System.out.println("---------------------------------------------------------------------------------");
        return doces;
    }

    public void DocesArrayList(){
        doces.add(new Doces("Brigadeiro", "Meio amargo", "100", "cacau 50%", "12-12-2022", 2.50));
        doces.add(new Doces("Brigadeiro", "Chocolate com café", "150", "café", "12-12-2022", 2.50));
        doces.add(new Doces("Bolos", "Brownie", "200", "chocolate", "12-12-2022", 5.50));
        doces.add(new Doces("Bolos", "Cupcake", "100", "ninho", "12-12-2022", 8.50));
        doces.add(new Doces("Donuts", "Donuts de oreo", "100", "chocolate", "12-12-2022", 12.3));
        doces.add(new Doces("Donuts", "Donuts puro", "30", "cobertura de chocolate", "12-12-2022", 11.6));
        doces.add(new Doces("Donuts", "Donuts de beijinho", "203", "coco", "12-12-2022", 12.3));
    }
    //POSTAGEM DE ATRIBUTOS

    public void setClasseDd(String classeDd) {
        this.classeDd = classeDd;
    }

    public String getClasseDd() {
        return classeDd;
    }

    //0-TIPO DO DOCE:
    public void setIdDd(String idDd){
        this.idDd=idDd;
    }
    public String getIdDd(){
        return idDd;
    }

//1-NOME DO DOCE:

    public void setNomeDd(String nomeDd) {
        this.nomeDd = nomeDd;
    }

    public String getNomeDd() {
        return nomeDd;
    }


    //2-QUANTIDADE DE DOCES:

    public void setQuantidadeDd(String quantidadeDd) {

        this.quantidadeDd = quantidadeDd;
    }

    public String getQuantidadeDd() {
        return quantidadeDd;
    }

    //3-SABOR DE DOCES:

    public void setSaborDd(String saborDd) {
        this.saborDd = saborDd;
    }

    public String getSaborDd() {
        return saborDd;
    }

    //4-VALIDADE DOS DOCES:

    public void setValidadeDd(String validadeDd) {
        this.validadeDd = validadeDd;
    }

    public String getValidadeDd() {
        return validadeDd;
    }


    //5- VALOR DOS DOCES:

    public void setValorDd(double valorDd) {

        this.valorDd = valorDd;
    }

    public double getValorDd() {

        return valorDd;
    }


}
