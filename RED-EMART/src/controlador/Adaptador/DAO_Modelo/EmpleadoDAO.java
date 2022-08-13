/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador.Adaptador.DAO_Modelo;

import controlador.Adaptador.AdaptadorDao;
import controlador.tda.lista.ListaEnlazada;
import modelo.Empleado;

/**
 *
 * @author Hilary-Madelein
 */
public class EmpleadoDAO extends AdaptadorDao<Empleado>{
    
    
    private Empleado emp;
    private ListaEnlazada<Empleado> listaEmp = new ListaEnlazada<>();

    public Empleado getEmp() {
        if (emp == null) {
            emp = new Empleado();
        }
        return emp;
    }

    public void setEmp(Empleado emp) {
        this.emp = emp;
    }

    public ListaEnlazada<Empleado> getListaEmp() {
        return listaEmp;
    }

    public void setListaEmp(ListaEnlazada<Empleado> listaEmp) {
        this.listaEmp = listaEmp;
    }

    public EmpleadoDAO() {
        super(Empleado.class);
    }

    public Boolean guardar_modificar() {
        try {
            if (getEmp().getId_persona() != null) {
                modificar(this.getEmp());
            } else {
                guardar(this.getEmp());
            }
            return true;
        } catch (Exception e) {
            System.out.println("Error en guadar o modificar");
            return false;
        }
    }
    
    public ListaEnlazada<Empleado> listado() {
        setListaEmp(listar());
        return listaEmp;
    }
    
    public static void main(String[] args) {
        EmpleadoDAO emp = new EmpleadoDAO();
        ListaEnlazada<Empleado> lista = emp.listar();       
        try {
            emp.getEmp().setId_persona(2);
            emp.getEmp().setId_tipo_emp("A_C");
            emp.getEmp().setId_estado_emp("EB_A");
            emp.getEmp().setUsuario("arge");
            emp.getEmp().setClave("12345");
            emp.guardar(emp.getEmp());
            System.out.println("EXITO");
        } catch (Exception e) {
            System.out.println("ERROR: "+e);
        }
    }
    
}
