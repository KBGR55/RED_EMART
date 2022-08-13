package controlador.tda.lista;

import controlador.tda.lista.exception.PosicionException;
import controlador.utiles.Utilidades;
import static controlador.utiles.Utilidades.getMethod;
import controlador.utiles.TipoOrdenacion;
import java.lang.reflect.Field;
import java.lang.reflect.Method;



/**
 *
 * @author KBGR55/Hilary-Madelein/Thaisncp/AdrianArtz/ronaldcuenca19
 */

public class ListaEnlazada<E> {

    private NodoLista<E> cabecera;

    private Integer size;

    public NodoLista<E> getCabecera() {
        return cabecera;
    }

    public void setCabecera(NodoLista<E> cabecera) {
        this.cabecera = cabecera;
    }

    public ListaEnlazada() {
        cabecera = null;
        size = 0;
    }

    public Boolean estaVacia() {
        return cabecera == null;
    }

    public void insertar(E dato) {
        NodoLista<E> nuevo = new NodoLista<>(dato, null);
        if (estaVacia()) {
            cabecera = nuevo;
        } else {
            NodoLista<E> aux = cabecera;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
        size++;
    }

    public void insertarCabecera(E dato) {
        if (estaVacia()) {
            insertar(dato);
        } else {
            NodoLista<E> nuevo = new NodoLista<>(dato, null);

            nuevo.setSiguiente(cabecera);
            cabecera = nuevo;
            size++;
        }
    }

    public void insertar(E dato, Integer pos) throws PosicionException {
        //lista size = 1
        if (estaVacia()) {
            insertar(dato);
        } else if (pos >= 0 && pos < size) {
            NodoLista<E> nuevo = new NodoLista<>(dato, null);
            if (pos == (size - 1)) {
                insertar(dato);

            } else {

                NodoLista<E> aux = cabecera;
                for (int i = 0; i < pos - 1; i++) {
                    aux = aux.getSiguiente();
                }
                NodoLista<E> siguiente = aux.getSiguiente();
                aux.setSiguiente(nuevo);
                nuevo.setSiguiente(siguiente);
                size++;
            }

        } else {
            throw new PosicionException("Error en insertar: No existe la posicion dada");
        }
    }

    public void imprimir() {
        System.out.println("**************************");
        NodoLista<E> aux = cabecera;
        for (int i = 0; i < getSize(); i++) {
            System.out.print(aux.getDato().toString() + "\t");
            aux = aux.getSiguiente();
        }
        System.out.println("\n" + "**************************");
    }

    public Integer getSize() {
        return size;
    }

    public E obtenerDato(Integer pos) throws PosicionException {
        if (!estaVacia()) {
            if (pos >= 0 && pos < size) {
                E dato = null;
                if (pos == 0) {
                    dato = cabecera.getDato();
                } else {
                    NodoLista<E> aux = cabecera;
                    for (int i = 0; i < pos; i++) {
                        aux = aux.getSiguiente();
                    }
                    dato = aux.getDato();
                }

                return dato;
            } else {
                throw new PosicionException("Error en obtener dato: No existe la posicion dada");
            }

        } else {
            throw new PosicionException("Error en obtener dato: La lista esta vacia, por endde no hay esa posicion");
        }
    }

    public E eliminarDato(Integer pos) throws PosicionException {
        E auxDato = null;
        if (!estaVacia()) {
            if (pos >= 0 && pos < size) {
                if (pos == 0) {
                    auxDato = cabecera.getDato();
                    cabecera = cabecera.getSiguiente();
                    size--;
                } else {
                    NodoLista<E> aux = cabecera;
                    for (int i = 0; i < pos - 1; i++) {
                        aux = aux.getSiguiente();
                    }
                    auxDato = aux.getDato();
                    NodoLista<E> proximo = aux.getSiguiente();
                    aux.setSiguiente(proximo.getSiguiente());
                    size--;
                }
                return auxDato;

            } else {
                throw new PosicionException("Error en eliminar dato: No existe la posicion dada");
            }

        } else {
            throw new PosicionException("Error en eliminar dato: La lista esta vacia, por endde no hay esa posicion");
        }
    }

    public void vaciar() {
        cabecera = null;
        size = 0;
    }

    public void modificarDato(Integer pos, E datoM) throws PosicionException {
        if (!estaVacia()) {
            if (pos >= 0 && pos < size) {
                if (pos == 0) {
                    cabecera.setDato(datoM);
                } else {
                    NodoLista<E> aux = cabecera;
                    for (int i = 0; i < pos; i++) {
                        aux = aux.getSiguiente();
                    }
                    aux.setDato(datoM);
                }

            } else {
                throw new PosicionException("Error en obtener dato: No existe la posicion dada");
            }

        } else {
            throw new PosicionException("Error en obtener dato: La lista esta vacia, por endde no hay esa posicion");
        }
    }

    public E[] toArray() {
        E[] matriz = null;
        if (this.size > 0) {
            matriz = (E[]) java.lang.reflect.Array.newInstance(cabecera.getDato().getClass(), this.size);
            NodoLista<E> aux = cabecera;
            for (int i = 0; i < this.size; i++) {
                matriz[i] = aux.getDato();

                aux = aux.getSiguiente();
            }
        }

        return matriz;
    }

    public ListaEnlazada<E> toList(E[] matriz) {

        this.vaciar();
        for (int i = 0; i < matriz.length; i++) {
            this.insertar(matriz[i]);
        }
        return this;
    }

    public ListaEnlazada<E> ordenar_seleccion(String atributo, TipoOrdenacion tipoOrdenacion) throws Exception {
        Class<E> clazz = null;
        E[] matriz = null;
        if (size > 0) {
            matriz = toArray();
            E t = null;
            clazz = (Class<E>) cabecera.getDato().getClass();//primitivo, Dato envolvente, Object
            Boolean isObject = Utilidades.isObject(clazz);//si es objeto
            Integer i, j, k = 0;
            Integer n = matriz.length;
            for (i = 0; i < n - 1; i++) {
                k = i;
                t = matriz[i];
                for (j = i + 1; j < n; j++) {
                    if (isObject) {
                        Field field = Utilidades.getField(atributo, clazz);
                        Method method = getMethod("get" + Utilidades.capitalizar(atributo), t.getClass());
                        Method method1 = getMethod("get" + Utilidades.capitalizar(atributo), matriz[j].getClass());
                        Object[] aux = evaluaCambiarDato(field.getType(), t, matriz[j], method, method1, tipoOrdenacion, j);
                        if (aux[0] != null) {
                            t = (E) aux[0];
                            k = (Integer) aux[1];
                        }
                    } else {
                        Object[] aux = evaluaCambiarDatoNoObjeto(clazz, t, matriz[j], tipoOrdenacion, j);
                        if (aux[0] != null) {
                            t = (E) aux[0];
                            k = (Integer) aux[1];
                        }
                    }

                }
                matriz[k] = matriz[i];
                matriz[i] = t;
            }
        }
        if (matriz != null) {
            toList(matriz);
        }
        return this;
    }

    public ListaEnlazada<E> metodoShell(String atributo, TipoOrdenacion tipoOrdenacion) throws PosicionException, Exception {
        Class<E> clazz = null;
        E[] matriz = null;
        if (size > 0) {
            clazz = (Class<E>) cabecera.getDato().getClass();//primitivo, Dato envolvente, Object
            Boolean isObject = Utilidades.isObject(clazz);//si es objeto
            System.out.println("TRANFORMANDO A MATRIZ");
            matriz = toArray();
            int x, salto;
            boolean ordenado;

            for (salto = matriz.length / 2; salto != 0; salto /= 2) {
                ordenado = true;

                while (ordenado) {
                    ordenado = false;

                    for (x = salto; x < matriz.length; x++) {
                        if (isObject) {
                            Field field = Utilidades.getField(atributo, clazz);
                            Method method = getMethod("get" + Utilidades.capitalizar(atributo), matriz[x - salto].getClass());
                            Method method1 = getMethod("get" + Utilidades.capitalizar(atributo), matriz[x].getClass());
                            Object[] aux = evaluaCambiarDato(field.getType(), matriz[x - salto], matriz[x], method, method1, tipoOrdenacion, x - salto);
                            if (aux[0] != null) {
                                E t = matriz[x];
                                matriz[x] = matriz[x - salto];
                                matriz[x - salto] = t;
                                ordenado = true;
                            }
                        } else {
                            Object[] aux = evaluaCambiarDatoNoObjeto(clazz, matriz[x - salto], matriz[x], tipoOrdenacion, x - salto);
                            if (aux[0] != null) {
                                E t = matriz[x];
                                matriz[x] = matriz[x - salto];
                                matriz[x - salto] = t;
                                ordenado = true;
                            }

                        }
                    }
                }
            }

        }
        System.out.println("TRANFORMANDO A LISTA");
        if (matriz != null) {
            toList(matriz);
        }
        return this;

    }

    public ListaEnlazada<E> quickSort(String atributo, TipoOrdenacion tipoOrdenacion) throws PosicionException, Exception {
        Class<E> clazz = null;
        E[] matriz = null;
        if (size > 0) {
            clazz = (Class<E>) cabecera.getDato().getClass();//primitivo, Dato envolvente, Object
            Boolean isObject = Utilidades.isObject(clazz);//si es objeto
            System.out.println("TRANFORMANDO A MATRIZ");
            Field field = Utilidades.getField(atributo, clazz);
            matriz = toArray();
            matriz = quickDatos(matriz, atributo, field.getType(), tipoOrdenacion);
        }
        System.out.println("TRANFORMANDO A LISTA");
        if (matriz != null) {
            toList(matriz);
        }

        return this;

    }

    private E[] quickDatos(E[] matriz, String atributo, Class clazz, TipoOrdenacion tipoOrdenacion) throws Exception {
        E[] mat = matriz;
        quick(mat, 0, mat.length - 1, atributo, clazz, tipoOrdenacion);
        return mat;
    }

    private void quick(E[] arrelo, int inicio, int fin, String atributo, Class clazz, TipoOrdenacion tipoOrdenacion) throws Exception {
        E pivote = arrelo[inicio];
        int i = inicio;
        int j = fin;

        while (i < j) {

            Method method = getMethod("get" + Utilidades.capitalizar(atributo), arrelo[i].getClass());
            Method method1 = getMethod("get" + Utilidades.capitalizar(atributo), arrelo[j].getClass());
            Method method2 = getMethod("get" + Utilidades.capitalizar(atributo), pivote.getClass());
            if (Utilidades.isNumber(clazz)) {
                if (tipoOrdenacion.toString().equalsIgnoreCase(TipoOrdenacion.ASCENDENTE.toString())) {

                    while (((Number) method.invoke(arrelo[i])).doubleValue() <= ((Number) method2.invoke(pivote)).doubleValue() && i < j) {
                        // cambioBurbuja(j, matriz);
                        i++;
                    }
                    while (((Number) method1.invoke(arrelo[j])).doubleValue() > ((Number) method2.invoke(pivote)).doubleValue()) {
                        // cambioBurbuja(j, matriz);
                        j--;
                    }
                } else {
                    while (((Number) method.invoke(arrelo[i])).doubleValue() >= ((Number) method2.invoke(pivote)).doubleValue() && i < j) {
                        // cambioBurbuja(j, matriz);
                        i++;
                    }
                    while (((Number) method1.invoke(arrelo[j])).doubleValue() < ((Number) method2.invoke(pivote)).doubleValue()) {
                        // cambioBurbuja(j, matriz);
                        j--;
                    }
                }
                if (i < j) {
                    E aux = arrelo[i];
                    arrelo[i] = arrelo[j];
                    arrelo[j] = aux;

                }

            } else if (Utilidades.isString(clazz)) {

                if (tipoOrdenacion.toString().equalsIgnoreCase(TipoOrdenacion.ASCENDENTE.toString())) {
                    while (((String) method.invoke(arrelo[i])).toLowerCase().compareTo(((String) method2.invoke(pivote)).toLowerCase()) <= 0 && i < j) {
                        // cambioBurbuja(j, matriz);
                        i++;
                    }
                    while (((String) method1.invoke(arrelo[j])).toLowerCase().compareTo(((String) method2.invoke(pivote)).toLowerCase()) > 0) {
                        // cambioBurbuja(j, matriz);
                        j--;
                    }
                } else {
                    while (((String) method.invoke(arrelo[i])).toLowerCase().compareTo(((String) method2.invoke(pivote)).toLowerCase()) >= 0 && i < j) {
                        // cambioBurbuja(j, matriz);
                        i++;
                    }
                    while (((String) method1.invoke(arrelo[j])).toLowerCase().compareTo(((String) method2.invoke(pivote)).toLowerCase()) < 0) {
                        // cambioBurbuja(j, matriz);
                        j--;
                    }
                }
                if (i < j) {
                    E aux = arrelo[i];
                    arrelo[i] = arrelo[j];
                    arrelo[j] = aux;

                }

            } else if (Utilidades.isCharacter(clazz)) {
                if (tipoOrdenacion.toString().equalsIgnoreCase(TipoOrdenacion.ASCENDENTE.toString())) {

                    while (((Character) method.invoke(arrelo[i])) <= ((Character) method2.invoke(pivote)) && i < j) {
                        // cambioBurbuja(j, matriz);
                        i++;
                    }
                    while (((Character) method1.invoke(arrelo[j])) > ((Character) method2.invoke(pivote))) {
                        // cambioBurbuja(j, matriz);
                        j--;
                    }

                } else {
                    while (((Character) method.invoke(arrelo[i])) >= ((Character) method2.invoke(pivote)) && i < j) {
                        // cambioBurbuja(j, matriz);
                        i++;
                    }
                    while (((Character) method1.invoke(arrelo[j])) < ((Character) method2.invoke(pivote))) {
                        // cambioBurbuja(j, matriz);
                        j--;
                    }
                }
                if (i < j) {
                    E aux = arrelo[i];
                    arrelo[i] = arrelo[j];
                    arrelo[j] = aux;
                }

            }

        }
        arrelo[inicio] = arrelo[j];
        arrelo[j] = pivote;

        if (inicio < j - 1) {
            quick(arrelo, inicio, j - 1, atributo, clazz, tipoOrdenacion);
        }

        if (j + 1 < fin) {
            quick(arrelo, j + 1, fin, atributo, clazz, tipoOrdenacion);
        }

    }

    public ListaEnlazada<E> busquedaBinaria(String atributo, Object dato) throws Exception {
        Class<E> clazz = null;
        E[] matriz = null;
        ListaEnlazada<E> resultado = new ListaEnlazada<>();
        if (size > 0) {
            matriz = toArray();
            clazz = (Class<E>) cabecera.getDato().getClass();//primitivo, Dato envolvente, Object
            Boolean isObject = Utilidades.isObject(clazz);
            Field field = Utilidades.getField(atributo, clazz);
            if (isObject) {
                Integer inferior = 0;
                Integer centro;
                Integer superior = matriz.length - 1;
                while (inferior <= superior) {
                    System.out.println("condicional while");
                    centro = (superior + inferior) / 2;
                    Method method1 = getMethod("get" + Utilidades.capitalizar(atributo), matriz[centro].getClass());
                    E aux = null;
                    if (field.getType().getSuperclass().getSimpleName().equalsIgnoreCase("Number")
                            && dato.getClass().getSuperclass().getSimpleName().equalsIgnoreCase("Number")) {
                        System.out.println("numeros");
                        Number datoJ = (Number) dato;
                        Number datoX = (Number) method1.invoke(matriz[centro]);
                        if (datoJ.doubleValue() == datoX.doubleValue()) {
                            aux = (E) matriz[centro]; System.out.println("Igual ");
                            resultado.insertar(aux);
                            return resultado;
                        } else if (datoJ.doubleValue() < datoX.doubleValue()) {
                            superior = centro - 1;
                        } else {
                            inferior = centro + 1;
                        }
                    } else if (Utilidades.isString(field.getType()) && Utilidades.isString(dato.getClass())) {
                        String datoJ = (String) dato;
                        String datoX = (String) method1.invoke(matriz[centro]);
                        System.out.println("String");
                        if (datoX.toLowerCase().startsWith(datoJ.toLowerCase()) || datoX.toLowerCase().endsWith(datoJ.toLowerCase())
                                || datoX.toLowerCase().equalsIgnoreCase(datoJ.toLowerCase())) {
                            aux = (E) matriz[centro];
                            System.out.println("Igual ");
                            System.out.println("ENTRO  A CONDICIONAL");
                            resultado.insertar(aux);
                            resultado.imprimir();
                            return resultado;
                        } else if (datoX.toLowerCase().compareTo(datoJ.toLowerCase()) < 0) {
                            superior = centro - 1;
                        } else {
                            inferior = centro + 1;
                        }
                    } else if (Utilidades.isCharacter(clazz) && Utilidades.isCharacter(dato.getClass())) {
                        Character datoJ = (Character) dato;
                        Character datoJ1 = (Character) method1.invoke(matriz[centro]);
                        if (datoJ.charValue() == datoJ1.charValue()) {
                            aux = (E) matriz[centro];
                            System.out.println("Igual ");
                            resultado.insertar(aux);
                            return resultado;
                        } else if (datoJ1 < datoJ) {
                            superior = centro - 1;
                        } else {
                            inferior = centro + 1;
                        }
                    }

                }
            }
        }
        return resultado;
    }

    private Object[] evaluaCambiarDatoNoObjeto(Class clazz, E auxJ, E auxJ1, TipoOrdenacion tipoOrdenacion, Integer j) throws Exception {
        Object aux[] = new Object[2];
        if (clazz.getSuperclass().getSimpleName().equalsIgnoreCase("Number")) {
            if (tipoOrdenacion.toString().equalsIgnoreCase(TipoOrdenacion.ASCENDENTE.toString())) {
                if ((((Number) auxJ).doubleValue() > ((Number) auxJ1).doubleValue())) {
                    aux[0] = auxJ1;
                    aux[1] = j;

                }
            } else {
                if ((((Number) auxJ).doubleValue() < ((Number) auxJ1).doubleValue())) {
                    aux[0] = auxJ1;
                    aux[1] = j;
                }
            }
        } else if (Utilidades.isString(clazz)) {
            String datoJ = (String) auxJ;
            String datoJ1 = (String) auxJ1;
            if (tipoOrdenacion.toString().equalsIgnoreCase(TipoOrdenacion.ASCENDENTE.toString())) {
                if ((datoJ.toLowerCase().compareTo(datoJ1.toLowerCase()) > 0)) {

                    aux[0] = auxJ1;
                    aux[1] = j;
                }
            } else {
                if ((datoJ.toLowerCase().compareTo(datoJ1.toLowerCase()) < 0)) {

                    aux[0] = auxJ1;
                    aux[1] = j;
                }
            }

        } else if (Utilidades.isCharacter(clazz)) {
            Character datoJ = (Character) auxJ;
            Character datoJ1 = (Character) auxJ1;
            if (tipoOrdenacion.toString().equalsIgnoreCase(TipoOrdenacion.ASCENDENTE.toString())) {
                if (datoJ > datoJ1) {

                    aux[0] = auxJ1;
                    aux[1] = j;
                }
            } else {
                if (datoJ < datoJ1) {

                    aux[0] = auxJ1;
                    aux[1] = j;
                }
            }

        } else if (Utilidades.isBoolean(clazz)) {
            Boolean datoJ = (Boolean) auxJ;
            Boolean datoJ1 = (Boolean) auxJ1;
            if (tipoOrdenacion.toString().equalsIgnoreCase(TipoOrdenacion.ASCENDENTE.toString())) {
                if (Boolean.TRUE.equals(datoJ) && Boolean.TRUE.equals(datoJ1) == true) {

                    aux[0] = auxJ1;
                    aux[1] = j;
                }
            } else {
                if (Boolean.FALSE.equals(datoJ) && Boolean.FALSE.equals(datoJ1) == false) {

                    aux[0] = auxJ1;
                    aux[1] = j;
                }
            }
        }
        return aux;
    }

    private Object[] evaluaCambiarDato(Class clazz, E auxJ, E auxJ1, Method method, Method method1, TipoOrdenacion tipoOrdenacion, Integer j) throws Exception {
        Object aux[] = new Object[2];
        if (clazz.getSuperclass().getSimpleName().equalsIgnoreCase("Number")) {
            Number datoJ = (Number) method.invoke(auxJ);
            Number datoJ1 = (Number) method1.invoke(auxJ1);
            if (tipoOrdenacion.toString().equalsIgnoreCase(TipoOrdenacion.ASCENDENTE.toString())) {
                if ((datoJ.doubleValue() > datoJ1.doubleValue())) {
                    // cambioBurbuja(j, matriz);
                    aux[0] = auxJ1;
                    aux[1] = j;
                }
            } else {
                if ((datoJ.doubleValue() < datoJ1.doubleValue())) {
                    //    cambioBurbuja(j, matriz);
                    aux[0] = auxJ1;
                    aux[1] = j;
                }
            }
        } else if (Utilidades.isString(clazz)) {
            String datoJ = (String) method.invoke(auxJ);
            String datoJ1 = (String) method1.invoke(auxJ1);
            if (tipoOrdenacion.toString().equalsIgnoreCase(TipoOrdenacion.ASCENDENTE.toString())) {
                if ((datoJ.toLowerCase().compareTo(datoJ1.toLowerCase()) > 0)) {
                    //   cambioBurbuja(j, matriz);
                    aux[0] = auxJ1;
                    aux[1] = j;
                }
            } else {
                if ((datoJ.toLowerCase().compareTo(datoJ1.toLowerCase()) < 0)) {
                    //  cambioBurbuja(j, matriz);
                    aux[0] = auxJ1;
                    aux[1] = j;
                }
            }

        } else if (Utilidades.isCharacter(clazz)) {
            Character datoJ = (Character) method.invoke(auxJ);
            Character datoJ1 = (Character) method1.invoke(auxJ1);
            if (tipoOrdenacion.toString().equalsIgnoreCase(TipoOrdenacion.ASCENDENTE.toString())) {
                if (datoJ > datoJ1) {
                    // cambioBurbuja(j, matriz);
                    aux[0] = auxJ1;
                    aux[1] = j;
                }
            } else {
                if (datoJ < datoJ1) {
                    //  cambioBurbuja(j, matriz);
                    aux[0] = auxJ1;
                    aux[1] = j;
                }
            }
        }
        return aux;
    }
    
    /**
     * Metodo para busqueda secuencial
     *
     * @param atributo el atributo donde deseo buscar
     * @param dato El dato a buscar
     * @return ListaEnlazada<E> El listado de datos a buscar
     */
    public ListaEnlazada<E> buscar(String atributo, Object dato) throws Exception {
        Class<E> clazz = null;
        E[] matriz = null;
        ListaEnlazada<E> resultado = new ListaEnlazada<>();
        if (size > 0) {
            matriz = toArray();

            clazz = (Class<E>) cabecera.getDato().getClass();//primitivo, Dato envolvente, Object
            Boolean isObject = Utilidades.isObject(clazz);//si es objeto
            if (isObject) {
                Field field = Utilidades.getField(atributo, clazz);
//                Method method = getMethod("get" + Utilidades.capitalizar(atributo), field.getClass());

                for (int i = 0; i < matriz.length; i++) {
                    Method method1 = getMethod("get" + Utilidades.capitalizar(atributo), matriz[i].getClass());
                    E aux = buscarDatoPosicionObjeto(i, matriz, field.getType(), dato, method1);
                    if (aux != null) {
                        resultado.insertar(aux);
                    }
                }
            } else {
                for (int i = 0; i < matriz.length; i++) {
                    E aux = buscarDatoPosicion(i, matriz, clazz, (E) dato);
                    if (aux != null) {
                        resultado.insertar(aux);
                    }
                }
            }

        }
        return resultado;
    }

    private E buscarDatoPosicion(Integer j, E[] matriz, Class<E> clazz, E dato) throws Exception {
        E aux = null;
        if (clazz.getSuperclass().getSimpleName().equalsIgnoreCase("Number")) {
            Number datoJ = (Number) dato;
            Number datoJ1 = (Number) matriz[j];
            if (datoJ.doubleValue() == datoJ1.doubleValue()) {
                aux = (E) datoJ1;
            } else if (datoJ.doubleValue() < datoJ1.doubleValue()) {
                aux = (E) null;
            }
        } else if (Utilidades.isString(clazz)) {
            String datoJ = (String) dato;
            String datoJ1 = (String) matriz[j];

            if (datoJ1.toLowerCase().startsWith(datoJ.toLowerCase())
                    || datoJ1.toLowerCase().endsWith(datoJ.toLowerCase())
                    || datoJ1.toLowerCase().equalsIgnoreCase(datoJ.toLowerCase())) {
                //cambioBurbuja(j, matriz);
                aux = (E) matriz[j];
            }

        } else if (Utilidades.isCharacter(clazz)) {
            Character datoJ = (Character) dato;
            Character datoJ1 = (Character) matriz[j];
            if (datoJ.charValue() == datoJ1.charValue()) {
                aux = (E) matriz[j];
            }

        }
        return aux;
    }

    private E buscarDatoPosicionObjeto(Integer j, E[] matriz, Class clazz, Object dato, Method method1) throws Exception {
        E aux = null;
        if (clazz.getSuperclass().getSimpleName().equalsIgnoreCase("Number")
                && dato.getClass().getSuperclass().getSimpleName().equalsIgnoreCase("Number")) {
            Number datoJ = (Number) dato;
            Number datoJ1 = (Number) method1.invoke(matriz[j]);
            if (datoJ.doubleValue() == datoJ1.doubleValue()) {
                aux = (E) matriz[j];
            } else if (datoJ.doubleValue() < datoJ1.doubleValue()) {
                aux = (E) null;
            }
        } else if (Utilidades.isString(clazz) && Utilidades.isString(dato.getClass())) {
            String datoJ = (String) dato;
            String datoJ1 = (String) method1.invoke(matriz[j]);

            if (datoJ1.toLowerCase().startsWith(datoJ.toLowerCase())
                    || datoJ1.toLowerCase().endsWith(datoJ.toLowerCase())
                    || datoJ1.toLowerCase().equalsIgnoreCase(datoJ.toLowerCase())) {
                //cambioBurbuja(j, matriz);
                aux = (E) matriz[j];
            }

        } else if (Utilidades.isCharacter(clazz) && Utilidades.isCharacter(dato.getClass())) {
            Character datoJ = (Character) dato;
            Character datoJ1 = (Character) method1.invoke(matriz[j]);
            if (datoJ.charValue() == datoJ1.charValue()) {
                aux = (E) matriz[j];
            }

        }
        return aux;
    }
}