package MasterMind;

public class Pista {
    char correcto = '0';
    char casi = 'X';
    char incorrecto = '-';

    public boolean getFeedback(String secreto, String intento) {
        String respuesta = generarRespuesta(secreto, intento);
        System.out.println("Pista: " + respuesta);

        if (intento.equals(secreto)) {
            System.out.println("Ganaste!");
            return true;
        } else {
            System.out.println("Sigue intentando...");
            return false;
        }
    }

    private String generarRespuesta(String secreto, String intento) {
        StringBuilder respuesta = new StringBuilder();
        boolean[] usadoSecreto = new boolean[secreto.length()];
        boolean[] usadoIntento = new boolean[secreto.length()];

        for (int i = 0; i < secreto.length(); i++) {
            if (secreto.charAt(i) == intento.charAt(i)) {
                respuesta.append(correcto);
                usadoSecreto[i] = true;
                usadoIntento[i] = true;
            } else {
                respuesta.append(" ");
            }
        }

        for (int i = 0; i < secreto.length(); i++) {
            if (!usadoIntento[i]) {
                for (int j = 0; j < secreto.length(); j++) {
                    if (!usadoSecreto[j] && intento.charAt(i) == secreto.charAt(j)) {
                        respuesta.setCharAt(i, casi);
                        usadoSecreto[j] = true;
                        usadoIntento[i] = true;
                        break;
                    }
                }
            }
        }

        for (int i = 0; i < secreto.length(); i++) {
            if (respuesta.charAt(i) == ' ') {
                respuesta.setCharAt(i, incorrecto);
            }
        }

        return respuesta.toString();
    }
}