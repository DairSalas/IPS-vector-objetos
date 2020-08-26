/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ips;

/**
 *
 * @author dair
 */
public class Paciente {
    
    private int id;
    private boolean dia;
    private int turno;

    public Paciente(int id, boolean dia) {
        this.id = id;
        this.dia = dia;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the dia
     */
    public boolean isDia() {
        return dia;
    }

    /**
     * @param dia the dia to set
     */
    public void setDia(boolean dia) {
        this.dia = dia;
    }

    /**
     * @return the turno
     */
    public int getTurno() {
        return turno;
    }

    /**
     * @param turno the turno to set
     */
    public void setTurno(int turno) {
        this.turno = turno;
    }
    
    
}
