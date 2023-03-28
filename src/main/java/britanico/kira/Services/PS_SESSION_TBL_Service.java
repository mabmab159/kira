package britanico.kira.Services;

import britanico.kira.DAO.PS_CLASS_TBL_DAO;
import britanico.kira.DAO.PS_SESSION_TBL_DAO;
import britanico.kira.Models.PS_CLASS_TBL;
import britanico.kira.Models.PS_SESSION_TBL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service

public class PS_SESSION_TBL_Service implements PS_SESSION_TBL_DAO {

    @Qualifier("PS_SESSION_TBL_DAO")
    @Autowired
    private PS_SESSION_TBL_DAO psSessionTblDao;


    @Override
    public PS_SESSION_TBL findClass(int term) {
        return psSessionTblDao.findClass(term);
    }

    @Override
    public List<PS_SESSION_TBL> findAll() {
        return psSessionTblDao.findAll();
    }

    @Override
    public List<PS_SESSION_TBL> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<PS_SESSION_TBL> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<PS_SESSION_TBL> findAllById(Iterable<String> strings) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(String s) {

    }

    @Override
    public void delete(PS_SESSION_TBL entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends String> strings) {

    }

    @Override
    public void deleteAll(Iterable<? extends PS_SESSION_TBL> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends PS_SESSION_TBL> S save(S entity) {
        return null;
    }

    @Override
    public <S extends PS_SESSION_TBL> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<PS_SESSION_TBL> findById(String s) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(String s) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends PS_SESSION_TBL> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends PS_SESSION_TBL> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<PS_SESSION_TBL> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<String> strings) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public PS_SESSION_TBL getOne(String s) {
        return null;
    }

    @Override
    public PS_SESSION_TBL getById(String s) {
        return null;
    }

    @Override
    public PS_SESSION_TBL getReferenceById(String s) {
        return null;
    }

    @Override
    public <S extends PS_SESSION_TBL> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends PS_SESSION_TBL> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends PS_SESSION_TBL> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends PS_SESSION_TBL> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends PS_SESSION_TBL> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends PS_SESSION_TBL> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends PS_SESSION_TBL, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
