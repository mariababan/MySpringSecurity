package bookStore.dto;

/**
 * Created by mariababan on 22/04/2017.
 */
public class RoleDto {

    public int roleId;
    public String username;
    public String role;



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

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

}
