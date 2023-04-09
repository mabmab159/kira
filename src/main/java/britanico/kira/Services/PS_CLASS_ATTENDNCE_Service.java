package britanico.kira.Services;

import britanico.kira.DAO.PS_CLASS_ATTENDNCE_DAO;
import britanico.kira.Models.PS_CLASS_ATTENDNCE;
import britanico.kira.Models.PS_CLASS_ATTENDNCE_ID;
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
public class PS_CLASS_ATTENDNCE_Service implements PS_CLASS_ATTENDNCE_DAO {

    @Autowired
    public PS_CLASS_ATTENDNCE_DAO classAttendnceDao;

    @Override
    public List<PS_CLASS_ATTENDNCE> findAll() {
        return classAttendnceDao.findAll();
    }

    @Override
    public List<PS_CLASS_ATTENDNCE> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<PS_CLASS_ATTENDNCE> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<PS_CLASS_ATTENDNCE> findAllById(Iterable<PS_CLASS_ATTENDNCE_ID> psClassAttendnceIds) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(PS_CLASS_ATTENDNCE_ID psClassAttendnceId) {

    }

    @Override
    public void delete(PS_CLASS_ATTENDNCE entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends PS_CLASS_ATTENDNCE_ID> psClassAttendnceIds) {

    }

    @Override
    public void deleteAll(Iterable<? extends PS_CLASS_ATTENDNCE> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends PS_CLASS_ATTENDNCE> S save(S entity) {
        return null;
    }

    @Override
    public <S extends PS_CLASS_ATTENDNCE> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<PS_CLASS_ATTENDNCE> findById(PS_CLASS_ATTENDNCE_ID psClassAttendnceId) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(PS_CLASS_ATTENDNCE_ID psClassAttendnceId) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends PS_CLASS_ATTENDNCE> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends PS_CLASS_ATTENDNCE> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<PS_CLASS_ATTENDNCE> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<PS_CLASS_ATTENDNCE_ID> psClassAttendnceIds) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public PS_CLASS_ATTENDNCE getOne(PS_CLASS_ATTENDNCE_ID psClassAttendnceId) {
        return null;
    }

    @Override
    public PS_CLASS_ATTENDNCE getById(PS_CLASS_ATTENDNCE_ID psClassAttendnceId) {
        return null;
    }

    @Override
    public PS_CLASS_ATTENDNCE getReferenceById(PS_CLASS_ATTENDNCE_ID psClassAttendnceId) {
        return null;
    }

    @Override
    public <S extends PS_CLASS_ATTENDNCE> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends PS_CLASS_ATTENDNCE> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends PS_CLASS_ATTENDNCE> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends PS_CLASS_ATTENDNCE> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends PS_CLASS_ATTENDNCE> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends PS_CLASS_ATTENDNCE> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends PS_CLASS_ATTENDNCE, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public List<PS_CLASS_ATTENDNCE> obtenerClases(String cod_alumno, String strm, int clase) {
        return classAttendnceDao.obtenerClases(cod_alumno, strm, clase);
    }
}
