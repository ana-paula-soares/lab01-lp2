package lp2.lab01;
public class IdadePreferencialInteligente {
    public static void main(String[] args) {  // Definindo uma função
        int anoAtual = 2024;
        int anoNascimento = 2001;
        int idade = anoAtual - anoNascimento;
        if (idade >= 60) {
            System.out.println("Voce tem " + idade
                   + " anos. Voce pode usar o atendimento especial.");
        } else {
        System.out.println("Voce tem " + idade + " anos. Voce ainda nao pode usar o atendimento especial.");
        }
    }
}


