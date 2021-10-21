package br.eti.carloslima.clinformatica.model.entities;

import br.eti.carloslima.clinformatica.model.entities.enums.Perfil;
import java.io.Serializable;
import java.util.Objects;
import java.util.logging.Logger;

/**
 *
 * @author Carlos Lima
 */
public class UserModel extends People implements Serializable {

    private String userName;
    private String password;
    private Perfil perfil;

    public UserModel() {
        super();
    }

    public UserModel(Integer id, String name, String userName, String password, Integer perfil) {
        super(id, name);
        this.userName = userName;
        this.password = password;
        setPerfil(perfil);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPerfil() {
        return perfil.getCode();
    }

    public void setPerfil(int perfil) {
        this.perfil = Perfil.valueOf(perfil);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.userName);
        hash = 97 * hash + Objects.hashCode(this.password);
        hash = 97 * hash + Objects.hashCode(this.perfil);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final UserModel other = (UserModel) obj;
        if (!Objects.equals(this.userName, other.userName)) {
            return false;
        }
        if (!Objects.equals(this.password, other.password)) {
            return false;
        }
        if (this.perfil != other.perfil) {
            return false;
        }
        return true;
    }

}
