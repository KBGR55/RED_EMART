package controlador.Adaptador.DAO_Modelo;

import controlador.Adaptador.AdaptadorDao;
import controlador.tda.lista.ListaEnlazada;
import modelo.Cliente;

/**
 *
 * @author KBGR55/Hilary-Madelein/Thaisncp/AdrianArtz/ronaldcuenca19
 */
public class ClienteDAO extends AdaptadorDao<Cliente> {

    private Cliente cliente;

    public Cliente getCliente() {
        if (cliente == null) {
            cliente = new Cliente();
        }
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ClienteDAO() {
        super(Cliente.class);
    }

    public Boolean guardar_modificar() {
        try {
            if (getCliente().getId() != null) {
                modificar(this.getCliente());
            } else {
                guardar(this.getCliente());
            }
            return true;
        } catch (Exception e) {
            System.out.println("Error en guadar o modificar");
            return false;
        }
    }

//    public static void main(String[] args) {
//        ClienteDAO cliente = new ClienteDAO();
//        ListaEnlazada<Cliente> lista = cliente.listar();
//        try {
//            cliente.getCliente().setEdad(18);
//            cliente.getCliente().setTelefono("0985928699");
//            cliente.guardar(cliente.getCliente());
//            System.out.println("EXITO");
//        } catch (Exception e) {
//            System.out.println("ERROR: " + e);
//        }
//    }

}
