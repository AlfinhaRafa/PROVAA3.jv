import java.util.Scanner;

public class a2 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        //PRIMEIRA ETAPA: CAPTURA DE INFORMAÇÕES

        //1-quantidade de alunos
        int qalunos;
        System.out.println("Qual a quantidade de alunos? ");
        qalunos = scan.nextInt();

        //2-media dos alunos
        int[] media = new int[qalunos];
        for (int i = 0; i < qalunos; i++) {
            System.out.println("Digite a media do aluno:  " + (i + 1));
            media[i] = scan.nextInt();
        }
        //3-falta por aluno
        int[] qfaltas = new int[qalunos];
        for (int x = 0; x < qfaltas.length; x++) {
            System.out.println("Digite a quantidade de faltas do aluno:  " + (x + 1));
            qfaltas[x] = scan.nextInt();
        }
        //leitura de notas e faltas(aprovado e reprovado)
        int maiormedia = 70;
        int mediaminima= 40;
        int qaprovados = 0;
        int qreprovados= 0;
        int provafinal= 0;
        for (int i = 0; i < qalunos; i++) {
            if (media[i] >= maiormedia && qfaltas[i] <= 15) {
                qaprovados++;
            }
            else if (media[i]> mediaminima && qfaltas[i] <= 15) {
                provafinal++;
            }
            else{
                qreprovados++;
            }
        }
        System.out.println("QUANTIDADE DE APROVADOS: " + qaprovados);
        System.out.println("QUANTIDADE DE REPROVADOS: " + qreprovados);
        System.out.println("QUANTIDADE QUE VAI PRA PROVA FINAL: " +provafinal);

    }

}


