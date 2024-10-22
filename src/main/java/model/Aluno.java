package model;

import javax.swing.JOptionPane;

public class Aluno extends Pessoa {

    private String curso;
    private static final String CURSO = "Engenharia de Computação";

    public Aluno() {
        this("", 0, "");
    }

    public Aluno(String nome, int idade, String curso) {
        super(nome, idade);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String getNomeFormatado() {
        return getNome().toUpperCase();
    }

    public void leitura() {
        super.leitura();
        setCurso(JOptionPane.showInputDialog(null, "Digite o nome do curso: ", CURSO));
    }

    public void imprimir() {
        super.imprimir();
        JOptionPane.showMessageDialog(null, "Curso:" + getCurso());
    }
}
