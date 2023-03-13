package vetor;

import java.util.Locale;
import java.util.Scanner;

public class DadosAprovados {
    private String pessoa;
    private double primeiraNota;
    private double segundaNota;

    public DadosAprovados(){

    }
    public DadosAprovados(String pessoa, double primeiraNota, double segundaNota){
        this.pessoa = pessoa;
        this.primeiraNota = primeiraNota;
        this.segundaNota = segundaNota;
    }

    public String getPessoa(){
        return pessoa;
    }

    public double getPrimeiraNota(){
        return primeiraNota;
    }
    public double getSegundaNota(){
        return segundaNota;
    }

    public void aprovadosEscola(){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos alunos serao digitados?");
        int quantos = sc.nextInt();
        DadosAprovados[] vect = new DadosAprovados[quantos];
        for(int i = 0; i < vect.length; i++){
            System.out.print("Nome:");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Primeira Nota: ");
           
            double primeiraNota = sc.nextDouble();
            System.out.print("Segunda Nota: ");
            sc.nextLine();
            double segundaNota = sc.nextDouble();

            vect[i] = new DadosAprovados(nome, primeiraNota, segundaNota);

        }
        Boolean nenhum = true;
        
        System.out.println("Lista dos alunos aprovados:");
        System.out.println("---------------------------------------");

        for(int i = 0; i < vect.length;i++){
            if(vect[i].getPrimeiraNota() >= 6.0 && vect[i].getSegundaNota() >= 6.0){
                
                System.out.println(vect[i].getPessoa());
                nenhum = false;
            

            }
        
        }
        if(nenhum == true){
            System.out.println("Nenhum");
        }
        System.out.println("---------------------------------------");

        

        sc.close();
    }

    public String ToString(){
        return String.format("Aluno: %s",getPessoa())
        + String.format("Primeira Nota: %.1f",getPrimeiraNota())
        + String.format("Segunda Nota %.1f",getSegundaNota());
    }

}
