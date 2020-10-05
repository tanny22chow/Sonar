package CucumberDiSpring.DTO;

import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class Credential implements Serializable {
    private String id;
    private String pwd;

    public Credential() {
    }

    public Credential(String id, String pwd) {
        this.id = id;
        this.pwd = pwd;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
