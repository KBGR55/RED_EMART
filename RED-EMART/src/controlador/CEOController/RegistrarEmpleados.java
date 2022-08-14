/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador.CEOController;

import controlador.Adaptador.DAO_Modelo.EmpleadoDAO;
import controlador.Adaptador.DAO_Modelo.PersonaDAO;
import controlador.tda.lista.ListaEnlazada;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Empleado;
import modelo.Persona;

/**
 *
 * @author KBGR55/Hilary-Madelein/Thaisncp/AdrianArtz/ronaldcuenca19
 */
public class RegistrarEmpleados {

    Empleado personaEmpleados = new Empleado();
    EmpleadoDAO ed = new EmpleadoDAO();
    PersonaDAO pd = new PersonaDAO();
    private Integer ID_persona;

    public Persona getPersonaEmpleados() {
        return personaEmpleados;
    }

    public void setPersonaEmpleados(Empleado personaEmpleados) {
        this.personaEmpleados = personaEmpleados;
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

    public Boolean registrarEmpleado(String tipoEmpleado, String estadoEmpleado, String Usuario, String clave, String nombres, String apellidos, String identificacion, String tipo_iden, Date fecha_nac, String telefono) throws Exception {
        ID_persona = pd.listado().getSize();
        Boolean verificar = false;
        personaEmpleados.setNombres(nombres);
        personaEmpleados.setApellidos(apellidos);
        personaEmpleados.setIdentificacion(identificacion);
        personaEmpleados.setId_tipo_identificacion(tipo_iden);
        personaEmpleados.setFecha_Nacimiento(fecha_nac);
        personaEmpleados.setTelefono(telefono);
        personaEmpleados.setId_tipo_emp(tipo_iden);
        personaEmpleados.setUsuario(Usuario);
        personaEmpleados.setClave(clave);
        personaEmpleados.setId_estado_emp(estadoEmpleado);
        personaEmpleados.setId_tipo_emp(tipoEmpleado);
        if (cedula(personaEmpleados.getIdentificacion())) {
            personaEmpleados = new Empleado(personaEmpleados.getId_tipo_emp(), personaEmpleados.getId_estado_emp(), personaEmpleados.getUsuario(), personaEmpleados.getClave(), ID_persona, personaEmpleados.getNombres(), personaEmpleados.getApellidos(), personaEmpleados.getIdentificacion(), "TI_C", personaEmpleados.getFecha_Nacimiento(), personaEmpleados.getTelefono());
            pd.guardar(personaEmpleados);
            ed.guardar(personaEmpleados);
            verificar = true;
        }
        return verificar;
    }

    public static boolean cedula(String cedula) {
        boolean estado = false;
        try {

            if (cedula.length() == 10) {

                if ((Integer.parseInt(cedula.substring(0, 2)) <= 24) || (Integer.parseInt(cedula.substring(0, 2)) == 30)) {
                    int[] coeficientes = {2, 1, 2, 1, 2, 1, 2, 1, 2};
                    int digitoVerificador = Integer.parseInt(cedula.substring(cedula.length() - 1, cedula.length()));
                    int suma = 0;
                    int digitoXcoeficiente = 0;
                    int modulo = 0;

                    for (int i = 0; i < cedula.length() - 1; i++) {

                        digitoXcoeficiente = Integer.parseInt(cedula.substring(i, i + 1)) * coeficientes[i];

                        digitoXcoeficiente = (digitoXcoeficiente > 9) ? digitoXcoeficiente -= 9 : digitoXcoeficiente;

                        suma += digitoXcoeficiente;
                    }

                    modulo = suma % 10;

                    if ((10 - modulo) == digitoVerificador) {
                        estado = true;
                    }
                    if (modulo == 0 & modulo == digitoVerificador) {
                        estado = true;
                    }
                } else {
                    estado = false;
                    JOptionPane.showMessageDialog(null, "Cédula que no pertenece al estado ecuatoriano");
                }
            } else {
                estado = false;
                JOptionPane.showMessageDialog(null, "Cédula con número de dígitos incorrectos");
            }
        } catch (NumberFormatException e) {
            estado = false;
            JOptionPane.showMessageDialog(null, "Error al validar");
        }
        return estado;
    }

    public void leer(JTable tableClientes, ListaEnlazada<Empleado> empleados) {
        DefaultTableModel tabla = new DefaultTableModel();
        try {
            tabla.addColumn("ID");
            tabla.addColumn("ID Tipo Empleado");
            tabla.addColumn("ID Estado Empleado");
            tabla.addColumn("Usuario");
            tabla.addColumn("Clave");
            tableClientes.setModel(tabla);
            String datos[] = new String[5];
            for (int i = 0; i < empleados.getSize(); i++) {
                datos[0] = "" + empleados.obtenerDato(i).getId_persona();
                datos[1] = "" + empleados.obtenerDato(i).getId_tipo_emp();
                datos[2] = "" + empleados.obtenerDato(i).getId_estado_emp();
                datos[3] = "" + empleados.obtenerDato(i).getUsuario();
                datos[4] = "" + empleados.obtenerDato(i).getClave();
                tabla.addRow(datos);
                tableClientes.setModel(tabla);
            }
        } catch (Exception e) {
            System.out.println("ERROR en cargar: " + e);
        }
    }

    public void modificarEmpleado(Integer id_p, String tipoEmpleado, String estadoEmpleado, String Usuario, String clave, String nombres, String apellidos, String identificacion, String tipo_iden, Date fecha_nac, String telefono) throws Exception {
        Empleado auxEmp = new Empleado();
        auxEmp.setId_persona(id_p);
        auxEmp.setUsuario(Usuario);
        auxEmp.setNombres(nombres);
        auxEmp.setApellidos(apellidos);
        auxEmp.setIdentificacion(identificacion);
        auxEmp.setId_tipo_identificacion(tipo_iden);
        auxEmp.setFecha_Nacimiento(fecha_nac);
        auxEmp.setTelefono(telefono);
        auxEmp.setId_tipo_emp(tipo_iden);
        auxEmp.setClave(clave);
        auxEmp.setId_estado_emp(estadoEmpleado);
        auxEmp.setId_tipo_emp(tipoEmpleado);
        pd.modificar(auxEmp);
        ed.modificar(auxEmp);
    }

    public void buscarEmpleado(JTable tableClientes, PersonaDAO pd2, EmpleadoDAO ed2, String cedula) throws Exception {
        if (cedula(cedula)) {
            ListaEnlazada<Persona> lp = pd2.listado().buscar("identificacion", cedula);
            if (lp.getSize() > 0) {
                DefaultTableModel tabla = new DefaultTableModel();
                try {
                    tabla.addColumn("ID");
                    tabla.addColumn("ID Tipo Empleado");
                    tabla.addColumn("ID Estado Empleado");
                    tabla.addColumn("Usuario");
                    tabla.addColumn("Clave");
                    tableClientes.setModel(tabla);
                    String datos[] = new String[5];
                    for (int i = 0; i < lp.getSize(); i++) {
                        datos[0] = "" + ed2.obtener(lp.obtenerDato(i).getId_persona()).getId_persona();
                        datos[1] = "" + ed2.obtener(lp.obtenerDato(i).getId_persona()).getId_tipo_emp();
                        datos[2] = "" + ed2.obtener(lp.obtenerDato(i).getId_persona()).getId_estado_emp();
                        datos[3] = "" + ed2.obtener(lp.obtenerDato(i).getId_persona()).getUsuario();
                        datos[4] = "" + ed2.obtener(lp.obtenerDato(i).getId_persona()).getClave();
                        tabla.addRow(datos);
                        tableClientes.setModel(tabla);
                    }
                } catch (Exception e) {
                    System.out.println("ERROR en cargar: " + e);
                }
            }
        }
    }
}
