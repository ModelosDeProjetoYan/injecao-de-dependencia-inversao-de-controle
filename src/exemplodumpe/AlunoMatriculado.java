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
public class AlunoMatriculado implements AlunoEstado {
   
    public String getStado() {
        return "Aluno Matriculado";
    }

    public void setMatriculado(Aluno a) {
        a.setStatus(new AlunoMatriculado());
    }

    public void setTrancado(Aluno a) {
        a.setStatus(new AlunoTrancado());
    }

    public void setEvadidodo(Aluno a) {
        a.setStatus(new AlunoEvadido());
    }

    public void setJubiladodo(Aluno a) {
        a.setStatus(new AlunoJubilado());
    }

    public void setFormado(Aluno a) {
        a.setStatus(new AlunoFormado());
    }
}
