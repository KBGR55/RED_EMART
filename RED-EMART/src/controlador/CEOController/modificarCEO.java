/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador.CEOController;

import controlador.Adaptador.DAO_Modelo.EmpleadoDAO;
import controlador.Adaptador.DAO_Modelo.PersonaDAO;
import java.util.Date;
import modelo.Empleado;

/**
 *
 * @author KBGR55/Hilary-Madelein/Thaisncp/AdrianArtz/ronaldcuenca19
 */
public class modificarCEO {
    Empleado CEO = new Empleado();
    EmpleadoDAO ed = new EmpleadoDAO();
    PersonaDAO pd = new PersonaDAO();

    public Empleado getCEO() {
        return CEO;
    }

    public void setCEO(Empleado CEO) {
        this.CEO = CEO;
    }

    public EmpleadoDAO getEd() {
        return ed;
    }

    public void setEd(EmpleadoDAO ed) {
        this.ed = ed;
    }

    public PersonaDAO getPd() {
        return pd;
    }

    public void setPd(PersonaDAO pd) {
        this.pd = pd;
    }
    
    public void modificarCEO(Integer id, String estadoEmpleado, String Usuario, String clave, String nombres, String apellidos, String identificacion, String tipo_iden, Date fecha_nac, String telefono) throws Exception {
        Empleado auxEmp = new Empleado();
        auxEmp.setId_tipo_emp("A_C");
        auxEmp.setId_persona(id);
        auxEmp.setUsuario(Usuario);
        auxEmp.setNombres(nombres);
        auxEmp.setApellidos(apellidos);
        auxEmp.setIdentificacion(identificacion);
        auxEmp.setId_tipo_identificacion(tipo_iden);
        auxEmp.setFecha_Nacimiento(fecha_nac);
        auxEmp.setTelefono(telefono);
        auxEmp.setClave(clave);
        auxEmp.setId_estado_emp(estadoEmpleado);
        pd.modificar(auxEmp);
        ed.modificar(auxEmp);
    }
    
}
