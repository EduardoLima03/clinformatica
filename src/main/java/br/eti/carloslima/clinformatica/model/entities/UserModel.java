
package br.eti.carloslima.clinformatica.model.entities;

import br.eti.carloslima.clinformatica.model.entities.enums.Perfil;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Carlos Lima
 */
public class UserModel implements  Serializable{
    private Integer id;
    private String name;
    private String userName;
    private String password;
    private Perfil perfil;

    public UserModel() {
    }

    public UserModel(Integer id, String name, String userName, String password, Integer perfil) {
        this.id = id;
        this.name = name;
        this.userName = userName;
        this.password = password;
        setPerfil(perfil);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        int hash = 5;
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
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
    
}
