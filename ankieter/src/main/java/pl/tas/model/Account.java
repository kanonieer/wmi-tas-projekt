package pl.tas.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Piotr Pliszko. All rights reserved.
 */

@Entity
@Table(name = "account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Long id;
    @Column(nullable = false)
    private String login;
    @Column(nullable = false)
    private String password;
    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL)
    private List<Survey> surveys;

    public Account(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public Account() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
