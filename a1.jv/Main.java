import java.util.Scanner;
public class Main
{
    public static void main(String args[]){
        Scanner in= new Scanner(System.in);
        System.out.println("Olá vamos calcular");
        //calculo de media
        int nota1, nota2, nota3,soma;
        System.out.println("Adicione suas notas");
        System.out.println("NOTA 1");
        nota1 = in.nextInt();
        System.out.println("NOTA 2");
        nota2 = in.nextInt();
        System.out.println("NOTA 3");
        nota3 = in.nextInt();
        soma=(nota1+ nota2 + nota3)/3;
        System.out.println("Sua media é:  " + soma);
    }



}