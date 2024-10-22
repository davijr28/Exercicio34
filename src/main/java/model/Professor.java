package model;

import javax.swing.JOptionPane;

public class Professor extends Pessoa {

    private double salario;
    private String titulo;
    private static final String TITULO = "Doutor";

    public Professor(){
        this(0.0,"");
    }
    
    public Professor(double salario, String titulo) {
        this.salario = salario;
        this.titulo = titulo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String getNomeFormatado() {
        return getTitulo() + getNome();
    }

    public void leitura() {
        super.leitura();
        setSalario(Double.parseDouble(JOptionPane.showInputDialog("Digite o salário: ")));
        setTitulo(JOptionPane.showInputDialog(null, "Digite o título: ", TITULO));
    }

    public void imprimir() {
        super.imprimir();
        JOptionPane.showMessageDialog(null, "Salário:" + getSalario() + "\nTítulo: " + getTitulo());
    }
}
