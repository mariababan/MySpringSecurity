package bookStore.repository;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by mariababan on 22/04/2017.
 */
public class MockSellRepository  implements JpaRepository<Sell, Integer> {
    @Override
    public <S extends Sell> S save(S entity) {
        return null;
    }

    @Override
    public Sell findOne(Integer integer) {
        return null;
    }

    @Override
    public boolean exists(Integer integer) {
        return false;
    }

    @Override
    public List<Sell> findAll() {
        return null;
    }

    @Override
    public List<Sell> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Sell> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Sell> findAll(Iterable<Integer> integers) {
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
    public void delete(Sell entity) {

    }

    @Override
    public void delete(Iterable<? extends Sell> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void flush() {

    }

    @Override
    public void deleteInBatch(Iterable<Sell> entities) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Sell getOne(Integer integer) {
        return null;
    }

    @Override
    public <S extends Sell> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Sell> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Sell> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Sell> List<S> save(Iterable<S> entities) {
        return null;
    }

    @Override
    public <S extends Sell> S findOne(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Sell> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Sell> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Sell> boolean exists(Example<S> example) {
        return false;
    }
}
