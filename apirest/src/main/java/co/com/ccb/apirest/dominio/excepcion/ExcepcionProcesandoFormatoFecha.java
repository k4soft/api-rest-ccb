package co.com.ccb.apirest.dominio.excepcion;

public class ExcepcionProcesandoFormatoFecha extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public ExcepcionProcesandoFormatoFecha(String mensaje) {
        super(mensaje);
    }

}
