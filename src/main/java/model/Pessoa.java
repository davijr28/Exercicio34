package model;

import javax.swing.JOptionPane;

public abstract class Pessoa {

    private String nome;
    private int idade;

    public Pessoa() {
        this("", 0);
    }

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public abstract String getNomeFormatado();

    public void leitura() {
        setNome(JOptionPane.showInputDialog("Digite o nome: "));
        setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade: ")));
    }

    public void imprimir() {
        JOptionPane.showMessageDialog(null, "Nome:" + getNome() + "\nIdade: " + getIdade());
    }
}
