package controlador.tda.lista.exception;

/**
 *
 * @author  KBGR55/Hilary-Madelein/Thaisncp/AdrianArtz/ronaldcuenca19
 */
public class PosicionException extends Exception {

    /**
     * Creates a new instance of <code>PosicionException</code> without detail
     * message.
     */
    public PosicionException() {
    }

    /**
     * Constructs an instance of <code>PosicionException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public PosicionException(String msg) {
        super(msg);
    }
}
