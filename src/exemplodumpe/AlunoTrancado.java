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
public class AlunoTrancado implements AlunoEstado{
    String statusAtual;
    public void setMatriculado(Aluno a) {
        a.setStatus(new AlunoMatriculado());
        statusAtual = "Matriculado";
    }

    @Override
    public void setTrancado(Aluno a) {
    }

    @Override
    public void setEvadidodo(Aluno a) {
    }

    @Override
    public void setJubiladodo(Aluno a) {
        a.setStatus(new AlunoJubilado());
        statusAtual = "Jubilado";
    }

    @Override
    public void setFormado(Aluno a) {
    
    }

    @Override
    public String getStado() {
        return statusAtual;
    }
    
}
