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
	 * @return val tipo {@code int}
	 * @throws Exception
	 *             Houve um erro na conversão
	 */
	public static int getAsNumber(String val) throws Exception {
		try {

			return Integer.parseInt(val);
		} catch (Exception e) {

			throw new Exception(MensagemUtils.ERROCONVER);
		}
	}

	/**
	 * Método utilizado para conversão de uma String em um float.
	 * 
	 * @param val
	 *            é uma {@code String}.
	 * @return val tipo {@code float}.
	 * @throws Exception
	 *             Houve um erro na conversão
	 */
	public static float getAsFloat(String val) throws Exception {
		try {

			return Float.parseFloat(val);
		} catch (Exception e) {

			throw new Exception(MensagemUtils.ERROCONVER);
		}
	}

	/**
	 * Método utilizado para conversão de uma String em um double.
	 * 
	 * @param val
	 *            é uma {@code String}.
	 * @return val tipo {@code double}.
	 * @throws Exception
	 *             Houve um erro na conversão
	 */
	public static double getAsDouble(String val) throws Exception {
		try {

			return Double.parseDouble(val);
		} catch (Exception e) {

			throw new Exception(MensagemUtils.ERROCONVER);
		}
	}

	/**
	 * Método utilizado para conversão de uma String em um boolean.
	 * 
	 * @param val
	 *            é uma {@code String}.
	 * @return val tipo {@code boolean}.
	 * @throws Exception
	 *             Houve um erro na conversão
	 */
	public static boolean getAsBoolean(String val) throws Exception {
		try {

			return Boolean.parseBoolean(val);
		} catch (Exception e) {
			
			throw new Exception(MensagemUtils.ERROCONVER);
		}
	}
	/**
	 * Método utilizado para verificar se a String está vazia ou nula.
	 * 
	 * @param val
	 *            é uma {@code String}.
	 * @return true ou false
	 */
	public static boolean isEmpty(String val) {
		return val == null || "".equals(val.trim());
	}
}
