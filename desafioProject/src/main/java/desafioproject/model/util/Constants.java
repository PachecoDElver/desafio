package desafioproject.model.util;

import java.util.regex.Pattern;

public class Constants {
	public static final String MSSG_CORREO_EXIST= "El correo ya se encuentra registrado";
	
	public static final String MSSG_INVAL_USER_NOMBRE = "Nombre de usuario invalido. debe tener un minimo de 1 y un maximo de 50 caracteres.";
	public static final String MSSG_INVAL_USER_CORREO = "Correo del usuario invalido.  la dirección de correo electrónico debe contener caracteres alfanuméricos y ciertos caracteres especiales en la parte local antes de la '@', y luego exigiendo un dominio válido con al menos un punto seguido de una extensión de dos a cuatro letras, y opcionalmente, un subdominio adicional.";
	public static final String MSSG_INVAL_USER_PASS = "Password del usuario invalido. debe tener un minimo de 1 y un maximo de 50 caracteres.";
	
	public static final String MSSG_INVAL_TELEF_NUM = "Numero de telefono invalido. solo se acepta numeros y debe tener un minimo de 1 y un maximo de 15 caracteres.";
	public static final String MSSG_INVAL_TELEF_COD_PAIS = "Codigo de pais de telefono invalido. solo se acepta numeros y debe tener un minimo de 1 y un maximo de 3 caracteres.";
	public static final String MSSG_INVAL_TELEF_COD_CIUDAD = "Codigo de ciudad de telefono invalido. solo se acepta numeros y debe tener un minimo de 1 y un maximo de 3 caracteres.";
	public static final boolean COD_ACTIVO_SI = true;

	public static final Pattern PATTERN_USER_NOMBRE = Pattern.compile("^.{1,50}$");
	public static final Pattern PATTERN_USER_PASS = Pattern.compile("^.{1,50}$");
	public static final Pattern PATTERN_USER_CORREO = Pattern.compile("[a-zA-Z0-9!#$%&'*\\/=?^_`\\{\\|\\}~\\+\\-]([\\.]?[a-zA-Z0-9!#$%&'*\\/=?^_`\\{\\|\\}~\\+\\-])+@[a-zA-Z0-9]([^@&%$\\/\\(\\)=?¿!\\.,:;]|\\d)+[a-zA-Z0-9][\\.][a-zA-Z]{2,4}([\\.][a-zA-Z]{2})?");

	public static final Pattern PATTERN_TELEF_NUM = Pattern.compile("^[0-9]{1,15}$");
	public static final Pattern PATTERN_TELEF_COD_PAIS = Pattern.compile("^[0-9]{1,3}$");
	public static final Pattern PATTERN_TELEF_COD_CIUDAD = Pattern.compile("^[0-9]{1,3}$");	
}
