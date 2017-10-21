package bookStore.entity;

import javax.persistence.*;

/**
 * Created by mariababan on 22/04/2017.
 */

@Entity
@Table(name = "user_roles")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userRoleId;
    private String username;
    private String role;

    public Role(String username,String role) {
        this.username = username;
        this.role = role;
    }

    public Role() {}

    public int getUserRoleId() {
        return userRoleId;
    }

    public void setUserRoleId(int userRoleId) {
        this.userRoleId = userRoleId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }



}
