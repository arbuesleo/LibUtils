package br.com.libutils.test;
import br.com.libutils.custom.StringUtils;

public class MainTeste {

	public static void main(String[] args) {
		try {
			System.out.println(StringUtils.getAsFloat("90.l"));
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
}
