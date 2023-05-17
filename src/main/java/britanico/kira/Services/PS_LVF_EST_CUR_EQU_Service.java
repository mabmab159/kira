package britanico.kira.Services;

import britanico.kira.DAO.PS_LVF_EST_CUR_EQU_DAO;
import britanico.kira.Models.PS_LVF_EST_CUR_EQU;
import britanico.kira.Models.PS_LVF_EST_CUR_EQU_ID;
import org.springframework.beans.factory.annotation.Autowired;
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
public class PS_LVF_EST_CUR_EQU_Service implements PS_LVF_EST_CUR_EQU_DAO {

    @Autowired
    public PS_LVF_EST_CUR_EQU_DAO psLvfEstCurEquDao;

    @Override
    public List<String> equivalentCourses(String crse_id) {
        return psLvfEstCurEquDao.equivalentCourses(crse_id);
    }

    @Override
    public List<Object> test() {
        return psLvfEstCurEquDao.test();
    }

    @Override
    public List<PS_LVF_EST_CUR_EQU> findAll() {
        return null;
    }

    @Override
    public List<PS_LVF_EST_CUR_EQU> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<PS_LVF_EST_CUR_EQU> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<PS_LVF_EST_CUR_EQU> findAllById(Iterable<PS_LVF_EST_CUR_EQU_ID> psLvfEstCurEquIds) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(PS_LVF_EST_CUR_EQU_ID psLvfEstCurEquId) {

    }

    @Override
    public void delete(PS_LVF_EST_CUR_EQU entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends PS_LVF_EST_CUR_EQU_ID> psLvfEstCurEquIds) {

    }

    @Override
    public void deleteAll(Iterable<? extends PS_LVF_EST_CUR_EQU> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends PS_LVF_EST_CUR_EQU> S save(S entity) {
        return null;
    }

    @Override
    public <S extends PS_LVF_EST_CUR_EQU> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<PS_LVF_EST_CUR_EQU> findById(PS_LVF_EST_CUR_EQU_ID psLvfEstCurEquId) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(PS_LVF_EST_CUR_EQU_ID psLvfEstCurEquId) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends PS_LVF_EST_CUR_EQU> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends PS_LVF_EST_CUR_EQU> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<PS_LVF_EST_CUR_EQU> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<PS_LVF_EST_CUR_EQU_ID> psLvfEstCurEquIds) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public PS_LVF_EST_CUR_EQU getOne(PS_LVF_EST_CUR_EQU_ID psLvfEstCurEquId) {
        return null;
    }

    @Override
    public PS_LVF_EST_CUR_EQU getById(PS_LVF_EST_CUR_EQU_ID psLvfEstCurEquId) {
        return null;
    }

    @Override
    public PS_LVF_EST_CUR_EQU getReferenceById(PS_LVF_EST_CUR_EQU_ID psLvfEstCurEquId) {
        return null;
    }

    @Override
    public <S extends PS_LVF_EST_CUR_EQU> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends PS_LVF_EST_CUR_EQU> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends PS_LVF_EST_CUR_EQU> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends PS_LVF_EST_CUR_EQU> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends PS_LVF_EST_CUR_EQU> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends PS_LVF_EST_CUR_EQU> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends PS_LVF_EST_CUR_EQU, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
