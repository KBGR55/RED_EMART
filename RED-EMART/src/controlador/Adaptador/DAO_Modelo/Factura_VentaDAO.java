
package controlador.Adaptador.DAO_Modelo;

import controlador.Adaptador.AdaptadorDao;
import controlador.tda.lista.ListaEnlazada;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import controlador.Factura_ventaController.ControladorFactura_Venta;
import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.util.Date;
import modelo.Detalle_Servicio;
import modelo.Factura_Venta;
import modelo.Persona;
import modelo.Venta;

/**
 *
 * @author K.G
 */
public class Factura_VentaDAO extends AdaptadorDao<Factura_Venta> {

    private Factura_Venta factura;

    public Factura_VentaDAO() {
        super(Factura_Venta.class);
    }

    public Factura_Venta getFactura_Venta() {
        if (factura == null) {
            factura = new Factura_Venta();
        }
        return factura;
    }

    public void setFactura_Venta(Factura_Venta Factura_Venta) {
        this.factura = factura;
    }
    
    public Boolean guardar_modificar() {
        try {
            if (getFactura_Venta().getId_venta() != null) {
                modificar(this.getFactura_Venta());
            } else {
                guardar(this.getFactura_Venta());
            }
            return true;
        } catch (Exception e) {
            System.out.println("Error en guadar o modificar");
            return false;
        }
    }
    
    public static void main(String[] args) {
        Factura_VentaDAO personaDao = new Factura_VentaDAO();
        ListaEnlazada<Factura_Venta> lista = personaDao.listar();       
        try {
            Venta venta = new Venta(0,1, 1,new Date(),1515.00);
            Detalle_Servicio detalle = null;
            PersonaDAO e= new PersonaDAO ();  
            ListaEnlazada<Persona> li= e.listar(); 
            
            Persona cliente = 
                    new Persona(
                    li.obtenerDato(0).getId_persona(),
                    li.obtenerDato(0).getNombres(),
                    li.obtenerDato(0).getApellidos(), li.obtenerDato(0).getIdentificacion(),
                   li.obtenerDato(0).getId_tipo_identificacion(), li.obtenerDato(0).getFecha_Nacimiento(), li.obtenerDato(0).getTelefono());
        
            ControladorFactura_Venta vent=new ControladorFactura_Venta(venta,detalle,cliente);
            vent.crearPdf(0,"Factura125");
            personaDao.getFactura_Venta();
            personaDao.AgregarPDFBaseDatos("archivos/Factura125.pdf", "Factura125",0);
            System.out.println("EXITO");
        } catch (Exception e) {
            System.out.println("ERROR: "+e);
        }
    }
    
    public void AgregarPDFBaseDatos(String ruta, String nom,Integer id) throws SQLException {
        factura.setId_venta(id);
        factura.setNombre_documento(nom);
        try {
//         byte[] pdfG = new byte[(int) ruta.length()];
//         InputStream input = new FileInputStream(ruta);  
//            byte[] data;
//            data = new ClassPathResource(ruta).getInputStream().readAllBytes();
//            factura.setDocumento(data);
            byte[] pdf = new byte[(int) ruta.length()];
            InputStream input = new FileInputStream(ruta);
            input.read(pdf);
           factura.setDocumento(pdf);
            try (InputStream inputS = new ByteArrayInputStream(factura.getDocumento())) {
                System.out.println("controlador.Adaptador.DAO_Modelo.Factura_VentaDAO.AgregarPDFBaseDatos()");
                int tamanoInput = inputS.available();
                byte[] datosPDF = new byte[tamanoInput];
                inputS.read(datosPDF, 0, tamanoInput);
                try (OutputStream out = new FileOutputStream("ArchivoAbiertoExito.pdf")) {
                    System.out.println("controlador.Adaptador.DAO_Modelo.Factura_VentaDAO.AgregarPDFBaseDatos()");
                    out.write(datosPDF);
                }
            }
            System.out.println(factura.getDocumento());
        } catch (IOException ex) {
            factura.setDocumento(null);
        }
       String sql = "INSERT INTO FACTURA_VENTA(ID_VENTA,DOCUMENTO,NOMBRE_DOCUMENTO) VALUES ( '"+factura.getId_venta()
               +"','" + factura.getDocumento() +
             "' , '"+factura.getNombre_documento()
             +"');";
       System.out.println(sql);
    
          PreparedStatement stmt = getConexion().prepareStatement(sql);
          stmt.executeUpdate();
    
    }

    private static class ClassPathResource {

        public ClassPathResource(String archivostareapdf) {
        }
    }
 
}