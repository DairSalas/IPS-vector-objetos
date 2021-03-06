package ips;

/**
 *
 * @author Dair Salas
 */
public class MetodosOrdenamiento {

    private int turnos;

    private Paciente vectorDatos[];
    private int numElementos;

    public MetodosOrdenamiento() {
        vectorDatos = null;
        numElementos = 0;
        turnos = 0;
    }

    public void crearVector() {
        vectorDatos = new Paciente[13];
        vectorDatos[0] = new Paciente(123, true);
        vectorDatos[1] = new Paciente(456, false);
        vectorDatos[2] = new Paciente(789, true);
        vectorDatos[3] = new Paciente(987, false);
        vectorDatos[4] = new Paciente(654, true);
        vectorDatos[5] = new Paciente(321, true);
        vectorDatos[6] = new Paciente(012, true);
        vectorDatos[7] = new Paciente(031, true);
        vectorDatos[8] = new Paciente(045, false);
        vectorDatos[9] = new Paciente(214, false);
        vectorDatos[10] = new Paciente(643, true);
        vectorDatos[11] = new Paciente(175, true);
        vectorDatos[12] = new Paciente(864, true);
        
        numElementos = vectorDatos.length;
    }

    public void ponerTurnos() {
        for (int i = 0; i < numElementos; i++) {
            if (getVectorDatos(i).isDia()) {
                turnos++;
                getVectorDatos(i).setTurno(turnos);
            } else {
                getVectorDatos(i).setTurno(-1);
            }
        }
    }
    
    public int getTurnos() {
        return turnos;
    }

    public void setVectorDatos(int p, Paciente dato) {
        vectorDatos[p] = dato;
    }

    public Paciente[] getVector() {
        return vectorDatos;
    }

    public Paciente getVectorDatos(int p) {
        return vectorDatos[p];
    }

    public void setNumElementos(int num) {
        numElementos = num;
    }

    public int getNumElementos() {
        return numElementos;
    }

    public void copiar(Paciente v[]) {
        numElementos = v.length;
        crearVector();
        for (int i = 0; i < v.length; i++) {
            setVectorDatos(i, getVectorDatos(i));
        }
    }

    public void cambiar(int p1, int p2) {
        Paciente temp;
        temp = getVectorDatos(p1);
        setVectorDatos(p1, getVectorDatos(p2));
        setVectorDatos(p2, temp);
    }

    public void ordenarBurbuja() {

        for (int i = 0; i < getNumElementos(); i++) {
            for (int j = 0; j < (getNumElementos() - i) - 1; j++) {
                if (getVectorDatos(j).getTurno() > getVectorDatos(j + 1).getTurno()) {
                    cambiar(j, j + 1);
                }
            }
        }
    }

    public void ordenarIntercambio() {

        for (int i = 0; i < getNumElementos(); i++) {
            for (int j = i + 1; j < getNumElementos(); j++) {
                if (getVectorDatos(i).getTurno() > getVectorDatos(j).getTurno()) {
                    cambiar(i, j);
                }
            }
        }
    }

    public int posicionMenor(int inicio) {
        int posMenor;
        Paciente menorElemento;
        posMenor = inicio;

        menorElemento = getVectorDatos(inicio);
        for (int i = inicio + 1; i < getNumElementos(); i++) {

            if (getVectorDatos(i).getTurno() < menorElemento.getTurno()) {
                menorElemento = getVectorDatos(i);
                posMenor = i;
            }
        }
        return posMenor;
    }

    public void ordenarSeleccion() {
        for (int i = 0; i < getNumElementos(); i++) {
            cambiar(i, posicionMenor(i));
        }
    }

    public void shell() {
        boolean cambios;
        for (int salto = getNumElementos() / 2; salto != 0; salto /= 2) {
            cambios = true;
            while (cambios) {
                cambios = false;
                for (int i = salto; i < getNumElementos(); i++) {
                    if (getVectorDatos(i - salto).getTurno() > getVectorDatos(i).getTurno()) {
                        cambiar(i, i - salto);
                        cambios = true;
                    }
                }
            }
        }
    }

    public void quickSort(int izq, int der) {
        Paciente pivote = getVectorDatos(izq);
        int i = izq;
        int j = der;

        while (i < j) {
            while (getVectorDatos(i).getTurno() <= pivote.getTurno() && i < j) {
                i++;
            }
            while (getVectorDatos(j).getTurno() > pivote.getTurno()) {
                j--;
            }
            if (i < j) {
                cambiar(i, j);
            }
        }

        setVectorDatos(izq, getVectorDatos(j));
        setVectorDatos(j, pivote);
        if (izq < j - 1) {
            quickSort(izq, j - 1);
        }
        if (j + 1 < der) {
            quickSort(j + 1, der);
        }
    }

}
