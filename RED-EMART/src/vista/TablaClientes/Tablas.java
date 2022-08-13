package vista.TablaClientes;

import controlador.tda.lista.ListaEnlazada;
import controlador.tda.lista.exception.PosicionException;
import javax.swing.table.AbstractTableModel;
import modelo.Persona;

/**
 *
 * @author Hilary Calva
 */
public class Tablas extends AbstractTableModel {

    ListaEnlazada<Persona> listaCliente = new ListaEnlazada<>();

    public ListaEnlazada<Persona> getListaCliente() {
        return listaCliente;
    }

    public void setListaCliente(ListaEnlazada<Persona> listaCliente) {
        this.listaCliente = listaCliente;
    }

    @Override
    public int getColumnCount() {
        return 7;
    }

    @Override
    public int getRowCount() {
        return listaCliente.getSize();
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "ID";
            case 1:
                return "Nombre";
            case 2:
                return "Apellido";
            case 3:
                return "Identificacion";
            case 4:
                return "Tipo";
            case 5:
                return "Fecha nacimientoo";
            case 6:
                return "Telefono";
            default:
                return null;
        }
    }

    @Override
    public Object getValueAt(int arg0, int arg1)  {
        try {
            Persona persona;
            persona = listaCliente.obtenerDato(arg0);
            switch (arg1) {
                case 0:
                    return persona.getId_persona();
                case 1:
                    return persona.getNombres();
                case 2:
                    return persona.getApellidos();
                case 3:
                    return persona.getIdentificacion();
                case 4:
                    return persona.getId_tipo_identificacion();
                case 5:
                    return persona.getFecha_Nacimiento();
                case 6:
                    return persona.getTelefono();
                default:
                    return null;
            }
        } catch (PosicionException ex) {
            return null;
        }
    }
}
