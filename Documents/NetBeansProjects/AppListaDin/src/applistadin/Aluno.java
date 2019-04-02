/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applistadin;

/**
 *
 * @author lab801
 */
public class Aluno implements Cloneable{
private String nome;
private int ra;

public Aluno(String nome, int ra){
    this.nome = nome;
    this.ra= ra;
}
protected Object clone() throws CloneNotSupportedException{
    return super.clone();
    
}
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the ra
     */
    public int getRa() {
        return ra;
    }

    /**
     * @param ra the ra to set
     */
    public void setRa(int ra) {
        this.ra = ra;
    }

}
