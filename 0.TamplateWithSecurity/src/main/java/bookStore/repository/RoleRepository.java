package bookStore.repository;

import bookStore.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by mariababan on 22/04/2017.
 */
public interface RoleRepository extends JpaRepository<Role, Integer> {
}
