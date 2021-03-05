package co.com.ccb.apirest.dominio.excepcion;

public class ExcepcionProcesandoJson extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public ExcepcionProcesandoJson(String mensaje) {
        super(mensaje);
    }

}
