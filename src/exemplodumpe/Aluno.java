/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplodumpe;

/**
 *
 * @author YanNotebook
 */
public class Aluno {
    private AlunoEstado status;
  
    public Aluno() {
        status = new AlunoMatriculado();
    }
    public void setStatus(AlunoEstado a){
        status = a;
    }
    public void setMatriculado() {
        status.setMatriculado(this);
    }

    public void setTrancado() {
        status.setTrancado(this);
    }

    public void setEvadidodo() {
        status.setEvadidodo(this);
    }

    public void setJubiladodo() {
        status.setJubiladodo(this);
    }

    public void setFormado() {
        status.setFormado(this);
    }

    public String getStado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    
}
