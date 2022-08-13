/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.Adaptador;

import controlador.tda.lista.ListaEnlazada;


/**
 *
 * @author sebastian
 */
public interface InterfazDao <T> {
    public void guardar(T dato) throws Exception;
    public void modificar(T dato) throws Exception;
    public ListaEnlazada<T> listar();
    public T obtener(Integer id) throws Exception;
}
