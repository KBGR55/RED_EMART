package controlador.DespachadorController;

import controlador.Adaptador.DAO_Modelo.PersonaDAO;
import controlador.tda.lista.ListaEnlazada;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Persona;

/**
 *
 * @author Hilary-Madelein
 */
public class RegistrarClientes {    
    Persona personaPrueba = new Persona();
    PersonaDAO dao = new PersonaDAO();
    private Integer ID;

    public Persona getPersonaPrueba() {
        return personaPrueba;
    }

    public void setPersonaPrueba(Persona personaPrueba) {
        this.personaPrueba = personaPrueba;
    }

    public PersonaDAO getDao() {
        return dao;
    }

    public void setDao(PersonaDAO dao) {
        this.dao = dao;
    }

    /**
     * Metodo que permite guardar un cliente del tipo Persona en la base de datos 
     * @return Boolean - true si fue ingresado correctamente
     */
    public Boolean registrarCliente(String nombres, String apellidos, String identificacion, String tipo_iden, Date fecha_nac, String cell) throws Exception{
        ID= dao.listado().getSize();
        Boolean verificar = false;
        personaPrueba.setNombres(nombres);
        personaPrueba.setApellidos(apellidos);
        personaPrueba.setIdentificacion(identificacion);
        personaPrueba.setId_tipo_identificacion(tipo_iden);
        personaPrueba.setFecha_Nacimiento(fecha_nac);
        personaPrueba.setTelefono(cell);
        if(cedula(personaPrueba.getIdentificacion())){
            personaPrueba = new Persona(ID, personaPrueba.getNombres(), personaPrueba.getApellidos(), personaPrueba.getIdentificacion(), personaPrueba.getId_tipo_identificacion(), personaPrueba.getFecha_Nacimiento(), personaPrueba.getTelefono());
            dao.guardar(personaPrueba);
            verificar=true;            
        }      
        return verificar;
    }
    
    /**
     * Metodo que valida la cedula ingresada
     * @return Boolean - true si esta correcta
     */
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
    
    /**
     * Metodo que permite llenar una tabla de una lista tipo ListaEnlazada<Persona>
     */
    public void leer(JTable tableClientes, ListaEnlazada<Persona>  clientes) {
        DefaultTableModel tabla = new DefaultTableModel();
        try {
            tabla.addColumn("ID");
            tabla.addColumn("Nombre");
            tabla.addColumn("Apellido");
            tabla.addColumn("Identificacion");
            tabla.addColumn("Tipo identificacion");
            tabla.addColumn("Fecha Nacimiento");
            tabla.addColumn("Telefono");
            tableClientes.setModel(tabla);
            String datos[] = new String[7];
            for (int i = 0; i < clientes.getSize(); i++) {
                datos[0] = ""+clientes.obtenerDato(i).getId_persona();
                datos[1] = ""+clientes.obtenerDato(i).getNombres();
                datos[2] = ""+clientes.obtenerDato(i).getApellidos();
                datos[3] = ""+clientes.obtenerDato(i).getIdentificacion();
                datos[4] = ""+clientes.obtenerDato(i).getId_tipo_identificacion();
                datos[5] = ""+clientes.obtenerDato(i).getFecha_Nacimiento();
                datos[6] = ""+clientes.obtenerDato(i).getTelefono();
                tabla.addRow(datos);
                tableClientes.setModel(tabla);
            }
        } catch (Exception e) {
            System.out.println("ERROR en cargar: " + e);
        }
    }  
    
}