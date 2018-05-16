/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wsbank.objects;

/**
 *
 * @author chiarotti
 */
public class ObjectC {
    private String codigo;
    private String nome;
    private double valor;
    
    public ObjectC(){}
    public ObjectC(String codigo, String nome, double valor){
        this.codigo = codigo;
        this.nome = nome;
        this.valor = valor;
    }
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    
}
