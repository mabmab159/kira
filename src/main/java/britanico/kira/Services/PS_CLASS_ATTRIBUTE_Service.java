package britanico.kira.Services;

import britanico.kira.DAO.PS_CLASS_ATTRIBUTE_DAO;
import britanico.kira.Models.PS_CLASS_ATTRIBUTE;
import britanico.kira.Models.PS_CLASS_ATTRIBUTE_ID;
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
public class PS_CLASS_ATTRIBUTE_Service implements PS_CLASS_ATTRIBUTE_DAO {

    @Autowired
    public PS_CLASS_ATTRIBUTE_DAO psClassAttributeDao;

    @Override
    public PS_CLASS_ATTRIBUTE obtenerClase(String strm, int clase) {
        return psClassAttributeDao.obtenerClase(strm, clase);
    }

    @Override
    public List<PS_CLASS_ATTRIBUTE> findAll() {
        return null;
    }

    @Override
    public List<PS_CLASS_ATTRIBUTE> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<PS_CLASS_ATTRIBUTE> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<PS_CLASS_ATTRIBUTE> findAllById(Iterable<PS_CLASS_ATTRIBUTE_ID> psClassAttributeIds) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(PS_CLASS_ATTRIBUTE_ID psClassAttributeId) {

    }

    @Override
    public void delete(PS_CLASS_ATTRIBUTE entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends PS_CLASS_ATTRIBUTE_ID> psClassAttributeIds) {

    }

    @Override
    public void deleteAll(Iterable<? extends PS_CLASS_ATTRIBUTE> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends PS_CLASS_ATTRIBUTE> S save(S entity) {
        return null;
    }

    @Override
    public <S extends PS_CLASS_ATTRIBUTE> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<PS_CLASS_ATTRIBUTE> findById(PS_CLASS_ATTRIBUTE_ID psClassAttributeId) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(PS_CLASS_ATTRIBUTE_ID psClassAttributeId) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends PS_CLASS_ATTRIBUTE> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends PS_CLASS_ATTRIBUTE> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<PS_CLASS_ATTRIBUTE> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<PS_CLASS_ATTRIBUTE_ID> psClassAttributeIds) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public PS_CLASS_ATTRIBUTE getOne(PS_CLASS_ATTRIBUTE_ID psClassAttributeId) {
        return null;
    }

    @Override
    public PS_CLASS_ATTRIBUTE getById(PS_CLASS_ATTRIBUTE_ID psClassAttributeId) {
        return null;
    }

    @Override
    public PS_CLASS_ATTRIBUTE getReferenceById(PS_CLASS_ATTRIBUTE_ID psClassAttributeId) {
        return null;
    }

    @Override
    public <S extends PS_CLASS_ATTRIBUTE> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends PS_CLASS_ATTRIBUTE> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends PS_CLASS_ATTRIBUTE> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends PS_CLASS_ATTRIBUTE> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends PS_CLASS_ATTRIBUTE> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends PS_CLASS_ATTRIBUTE> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends PS_CLASS_ATTRIBUTE, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
