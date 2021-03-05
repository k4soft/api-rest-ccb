package co.com.ccb.apirest.dominio.excepcion;

public class ExcepcionAutenticacion extends RuntimeException {
	public static final String MENSAJE_TOKEN_NULO = "El token no se encontró en el header de la petición http";
	public static final String MENSAJE_CREDENCIALES_ERRONEAS = "Las credenciales con las que esta intentando acceder no existen";
	public static final String MENSAJE_TIPO_TOKEN_ERRONEO = "JWT Token no es un Id token";
	public static final String MENSAJE_PERMISO_INVALIDO = "El usuario no tiene permiso para realizar esta petición.";

	private static final long serialVersionUID = 1L;

	public ExcepcionAutenticacion(String message) {
		super(message);
	}

}
