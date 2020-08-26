package ips;

/**
 *
 * @author Dair Salas
 */
public class MetodosOrdenamiento {

    int turnos;

    private Paciente vectorDatos[];
    private int numElementos;

    public MetodosOrdenamiento() {
        vectorDatos = null;
        numElementos = 0;
        turnos = 0;
    }

    public void crearVector() {
        //vectorDatos = new Paciente[numElementos];
        vectorDatos[0] = new Paciente(123, true);
        vectorDatos[1] = new Paciente();
        vectorDatos[2] = new Paciente();
        vectorDatos[3] = new Paciente();
        vectorDatos[4] = new Paciente();
        vectorDatos[5] = new Paciente();
        vectorDatos[6] = new Paciente();
        vectorDatos[7] = new Paciente();
        vectorDatos[8] = new Paciente();
        vectorDatos[9] = new Paciente();
        vectorDatos[10] = new Paciente();
        vectorDatos[11] = new Paciente();
        vectorDatos[12] = new Paciente();
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

    public void copiar(int v[]) {
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

        int i, j;
        for (i = 0; i < getNumElementos(); i++) {
            for (j = 0; j < (getNumElementos() - i) - 1; j++) {
                if (getVectorDatos(j).getTurno() > getVectorDatos(j + 1).getTurno()) {
                    cambiar(j, j + 1);
                }
            }
        }
    }

    public void ordenarIntercambio() {

        int i, j;
        for (i = 0; i < getNumElementos(); i++) {
            for (j = i + 1; j < getNumElementos(); j++) {
                if (getVectorDatos(i).getTurno() > getVectorDatos(j).getTurno()) {
                    cambiar(i, j);
                }
            }
        }
    }

    public int posicionMenor(int inicio) {
        int i;
        int posMenor;
        Paciente menorElemento;
        posMenor = inicio;

        menorElemento = getVectorDatos(inicio);
        for (i = inicio + 1; i < getNumElementos(); i++) {

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
        int salto;
        boolean cambios;
        for (salto = getNumElementos() / 2; salto != 0; salto /= 2) {
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
