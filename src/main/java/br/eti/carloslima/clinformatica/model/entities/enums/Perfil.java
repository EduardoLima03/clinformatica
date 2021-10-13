
package br.eti.carloslima.clinformatica.model.entities.enums;

/**
 *
 * @author Carlos Lima
 */
public enum Perfil {
    ADMINISTRADOR(1),
    TECNICO(2);

    private int code;

    private Perfil(int code) {
        this.code = code;
    }

    /**
     *
     * @return
     */
    public int getCode() {
        return code;
    }

    /**
     * Converte o valor inteiro para um tipo do perfil
     * Convert the integer value to a profile type
     * @param code
     * @return tipo do perfil
     */
    public static Perfil valueOf(int code) {
        for (Perfil value : Perfil.values()) {
            if (value.getCode() == code) {
                return value;
            }
        }
        throw new IllegalArgumentException("Codigo de perfil errado");
    }
}
