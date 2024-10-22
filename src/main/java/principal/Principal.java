package principal;

import model.Aluno;
import model.Professor;

public class Principal {

    public static void main(String[] args) {
        Aluno joaozinho = new Aluno();
        joaozinho.leitura();
        joaozinho.imprimir();
        Professor xavier = new Professor();
        xavier.leitura();
        xavier.imprimir();   
    }
}
