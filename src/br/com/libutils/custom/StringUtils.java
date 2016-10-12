package br.com.libutils.custom;
/**
 * * @author Leonardo Mendes de Oliveira
 * 
 */
public class StringUtils {

	/**
	 * Método utilizado para conversão de uma String em um int.
	 * 
	 * @param val
	 *            é uma {@code String}.
	 * @return val tipo {@code int}.
	 */
	public static int getAsNumber(String val) {
		return Integer.parseInt(val);
	}

	/**
	 * Método utilizado para conversão de uma String em um float.
	 * 
	 * @param val
	 *            é uma {@code String}.
	 * @return val tipo {@code float}.
	 */
	public static float getAsFloat(String val) {
		return Float.parseFloat(val);
	}
	/**
	 * Método utilizado para conversão de uma String em um double.
	 * 
	 * @param val
	 *            é uma {@code String}.
	 * @return val tipo {@code double}.
	 */
	public static double getAsDouble(String val) {
		return Double.parseDouble(val);
	}
	/**
	 * Método utilizado para conversão de uma String em um boolean.
	 * 
	 * @param val
	 *            é uma {@code String}.
	 * @return val tipo {@code boolean}.
	 */
	public static boolean getAsBoolean(String val) {
		return Boolean.parseBoolean(val);
	}

	/**
	 * Método utilizado para verificar se a String está nula.
	 * 
	 * @param val
	 *            é uma {@code String}.
	 * @return true ou false
	 */
	public static boolean isNullValue(String val) {
		return val == null;
	}

	/**
	 * Método utilizado para verificar se a String está vazia.
	 * 
	 * @param val
	 *            é uma {@code String}.
	 * @return true ou false
	 */
	public static boolean isEmpty(String val) {
		return (val != null) ? val.trim().hashCode() == 0 : false;
	}

	/**
	 * Método utilizado para verificar se a String está nula ou vazia.
	 * 
	 * @param val
	 *            é uma {@code String}.
	 * @return true ou false
	 */
	public static boolean isNullOrEmpty(String val) {
		return isEmpty(val) || val == null;
	}
}