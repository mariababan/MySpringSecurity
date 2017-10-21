package bookStore.repository;

import bookStore.entity.Role;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

/**
 * Created by mariababan on 22/04/2017.
 */
public class MockRoleRepository  implements  RoleRepository{
    @Override
    public <S extends Role> S save(S entity) {
        return null;
    }

    @Override
    public Role findOne(Integer integer) {
        return null;
    }

    @Override
    public boolean exists(Integer integer) {
        return false;
    }

    @Override
    public List<Role> findAll() {
        return null;
    }

    @Override
    public List<Role> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Role> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Role> findAll(Iterable<Integer> integers) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void delete(Integer integer) {

    }

    @Override
    public void delete(Role entity) {

    }

    @Override
    public void delete(Iterable<? extends Role> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void flush() {

    }

    @Override
    public void deleteInBatch(Iterable<Role> entities) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Role getOne(Integer integer) {
        return null;
    }

    @Override
    public <S extends Role> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Role> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Role> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Role> List<S> save(Iterable<S> entities) {
        return null;
    }

    @Override
    public <S extends Role> S findOne(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Role> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Role> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Role> boolean exists(Example<S> example) {
        return false;
    }
}
