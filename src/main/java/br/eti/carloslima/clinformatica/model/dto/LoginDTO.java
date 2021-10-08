
package br.eti.carloslima.clinformatica.model.dto;

import br.eti.carloslima.clinformatica.model.entities.enums.Perfil;
import java.util.Objects;

/**
 * Essa Classe só será usada para realizar o ‘login’ do usuário no sistema.
 * This Class will only be used to log in to the system.
 * @author Carlos Lima
 */
public class LoginDTO {
    
    private String userName;
    private String password;
    private Perfil perfil;
    
    public LoginDTO() {
    }
    
    public LoginDTO(String userName, String password, Integer perfil) {
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
    
    public Integer getPerfil() {
        return perfil.getCode();
    }
    
    public void setPerfil(Integer perfil) {
        this.perfil = Perfil.valueOf(perfil);
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.userName);
        hash = 29 * hash + Objects.hashCode(this.password);
        hash = 29 * hash + Objects.hashCode(this.perfil);
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
        final LoginDTO other = (LoginDTO) obj;
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
