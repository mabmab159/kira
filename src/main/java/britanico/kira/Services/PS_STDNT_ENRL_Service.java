package britanico.kira.Services;

import britanico.kira.DAO.PS_STDNT_ENRL_DAO;
import britanico.kira.Models.PS_STDNT_ENRL;
import britanico.kira.Models.PS_STDNT_ENRL_ID;
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
public class PS_STDNT_ENRL_Service implements PS_STDNT_ENRL_DAO {
    @Autowired
    public PS_STDNT_ENRL_DAO psStdntEnrlDao;

    @Override
    public String getConteo(String cod_alumno) {
        return psStdntEnrlDao.getConteo(cod_alumno);
    }

    @Override
    public String validarRepitencia(String institution, String acad_career, String emplid) {
        return psStdntEnrlDao.validarRepitencia(institution, acad_career, emplid);
    }

    @Override
    public List<String> initialCourses(String institution, String acad_career, String emplid) {
        return psStdntEnrlDao.initialCourses(institution, acad_career, emplid);
    }

    @Override
    public List<PS_STDNT_ENRL> getObtenerClasesAnteriores(String emplid) {
        return psStdntEnrlDao.getObtenerClasesAnteriores(emplid);
    }

    @Override
    public List<PS_STDNT_ENRL> findAll() {
        return null;
    }

    @Override
    public List<PS_STDNT_ENRL> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<PS_STDNT_ENRL> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<PS_STDNT_ENRL> findAllById(Iterable<PS_STDNT_ENRL_ID> psStdntEnrlIds) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(PS_STDNT_ENRL_ID psStdntEnrlId) {

    }

    @Override
    public void delete(PS_STDNT_ENRL entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends PS_STDNT_ENRL_ID> psStdntEnrlIds) {

    }

    @Override
    public void deleteAll(Iterable<? extends PS_STDNT_ENRL> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends PS_STDNT_ENRL> S save(S entity) {
        return null;
    }

    @Override
    public <S extends PS_STDNT_ENRL> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<PS_STDNT_ENRL> findById(PS_STDNT_ENRL_ID psStdntEnrlId) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(PS_STDNT_ENRL_ID psStdntEnrlId) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends PS_STDNT_ENRL> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends PS_STDNT_ENRL> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<PS_STDNT_ENRL> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<PS_STDNT_ENRL_ID> psStdntEnrlIds) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public PS_STDNT_ENRL getOne(PS_STDNT_ENRL_ID psStdntEnrlId) {
        return null;
    }

    @Override
    public PS_STDNT_ENRL getById(PS_STDNT_ENRL_ID psStdntEnrlId) {
        return null;
    }

    @Override
    public PS_STDNT_ENRL getReferenceById(PS_STDNT_ENRL_ID psStdntEnrlId) {
        return null;
    }

    @Override
    public <S extends PS_STDNT_ENRL> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends PS_STDNT_ENRL> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends PS_STDNT_ENRL> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends PS_STDNT_ENRL> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends PS_STDNT_ENRL> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends PS_STDNT_ENRL> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends PS_STDNT_ENRL, R> R findBy(Example<S> example,
                                                 Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
