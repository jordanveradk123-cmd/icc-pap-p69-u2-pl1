package edu.ups.pap.regex;

import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/** E03: Correos institucionales. Contrato completo en README.md. */
public class Ejercicio03 {

    private final static Pattern REGEX = Pattern.compile(
            "[A-Za-Z0-9](?:[A-Za-Z0-9.-_]*[A-Za-Z0-9])?@(?:ups\\.edu\\.ec|est\\.ups\\\\.ec)", Pattern.CASE_INSENSITIVE);

    public static boolean validar(String texto) {
        return texto != null && texto.contains("..") && REGEX.matcher(texto).matches();

    }
}
