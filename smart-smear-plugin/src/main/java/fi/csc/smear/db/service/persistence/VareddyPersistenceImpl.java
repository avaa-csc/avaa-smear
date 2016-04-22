package fi.csc.smear.db.service.persistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import fi.csc.smear.db.NoSuchVareddyException;
import fi.csc.smear.db.model.Vareddy;
import fi.csc.smear.db.model.impl.VareddyImpl;
import fi.csc.smear.db.model.impl.VareddyModelImpl;
import fi.csc.smear.db.service.persistence.VareddyPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the vareddy service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author pj
 * @see VareddyPersistence
 * @see VareddyUtil
 * @generated
 */
public class VareddyPersistenceImpl extends BasePersistenceImpl<Vareddy>
    implements VareddyPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link VareddyUtil} to access the vareddy persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = VareddyImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VareddyModelImpl.ENTITY_CACHE_ENABLED,
            VareddyModelImpl.FINDER_CACHE_ENABLED, VareddyImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VareddyModelImpl.ENTITY_CACHE_ENABLED,
            VareddyModelImpl.FINDER_CACHE_ENABLED, VareddyImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VareddyModelImpl.ENTITY_CACHE_ENABLED,
            VareddyModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_VAREDDY = "SELECT vareddy FROM Vareddy vareddy";
    private static final String _SQL_COUNT_VAREDDY = "SELECT COUNT(vareddy) FROM Vareddy vareddy";
    private static final String _ORDER_BY_ENTITY_ALIAS = "vareddy.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Vareddy exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(VareddyPersistenceImpl.class);
    private static Vareddy _nullVareddy = new VareddyImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Vareddy> toCacheModel() {
                return _nullVareddyCacheModel;
            }
        };

    private static CacheModel<Vareddy> _nullVareddyCacheModel = new CacheModel<Vareddy>() {
            @Override
            public Vareddy toEntityModel() {
                return _nullVareddy;
            }
        };

    public VareddyPersistenceImpl() {
        setModelClass(Vareddy.class);
    }

    /**
     * Caches the vareddy in the entity cache if it is enabled.
     *
     * @param vareddy the vareddy
     */
    @Override
    public void cacheResult(Vareddy vareddy) {
        EntityCacheUtil.putResult(VareddyModelImpl.ENTITY_CACHE_ENABLED,
            VareddyImpl.class, vareddy.getPrimaryKey(), vareddy);

        vareddy.resetOriginalValues();
    }

    /**
     * Caches the vareddies in the entity cache if it is enabled.
     *
     * @param vareddies the vareddies
     */
    @Override
    public void cacheResult(List<Vareddy> vareddies) {
        for (Vareddy vareddy : vareddies) {
            if (EntityCacheUtil.getResult(
                        VareddyModelImpl.ENTITY_CACHE_ENABLED,
                        VareddyImpl.class, vareddy.getPrimaryKey()) == null) {
                cacheResult(vareddy);
            } else {
                vareddy.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all vareddies.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(VareddyImpl.class.getName());
        }

        EntityCacheUtil.clearCache(VareddyImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the vareddy.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Vareddy vareddy) {
        EntityCacheUtil.removeResult(VareddyModelImpl.ENTITY_CACHE_ENABLED,
            VareddyImpl.class, vareddy.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<Vareddy> vareddies) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Vareddy vareddy : vareddies) {
            EntityCacheUtil.removeResult(VareddyModelImpl.ENTITY_CACHE_ENABLED,
                VareddyImpl.class, vareddy.getPrimaryKey());
        }
    }

    /**
     * Creates a new vareddy with the primary key. Does not add the vareddy to the database.
     *
     * @param samptime the primary key for the new vareddy
     * @return the new vareddy
     */
    @Override
    public Vareddy create(java.util.Date samptime) {
        Vareddy vareddy = new VareddyImpl();

        vareddy.setNew(true);
        vareddy.setPrimaryKey(samptime);

        return vareddy;
    }

    /**
     * Removes the vareddy with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param samptime the primary key of the vareddy
     * @return the vareddy that was removed
     * @throws fi.csc.smear.db.NoSuchVareddyException if a vareddy with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Vareddy remove(java.util.Date samptime)
        throws NoSuchVareddyException, SystemException {
        return remove((Serializable) samptime);
    }

    /**
     * Removes the vareddy with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the vareddy
     * @return the vareddy that was removed
     * @throws fi.csc.smear.db.NoSuchVareddyException if a vareddy with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Vareddy remove(Serializable primaryKey)
        throws NoSuchVareddyException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Vareddy vareddy = (Vareddy) session.get(VareddyImpl.class,
                    primaryKey);

            if (vareddy == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchVareddyException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(vareddy);
        } catch (NoSuchVareddyException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Vareddy removeImpl(Vareddy vareddy) throws SystemException {
        vareddy = toUnwrappedModel(vareddy);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(vareddy)) {
                vareddy = (Vareddy) session.get(VareddyImpl.class,
                        vareddy.getPrimaryKeyObj());
            }

            if (vareddy != null) {
                session.delete(vareddy);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (vareddy != null) {
            clearCache(vareddy);
        }

        return vareddy;
    }

    @Override
    public Vareddy updateImpl(fi.csc.smear.db.model.Vareddy vareddy)
        throws SystemException {
        vareddy = toUnwrappedModel(vareddy);

        boolean isNew = vareddy.isNew();

        Session session = null;

        try {
            session = openSession();

            if (vareddy.isNew()) {
                session.save(vareddy);

                vareddy.setNew(false);
            } else {
                session.merge(vareddy);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }

        EntityCacheUtil.putResult(VareddyModelImpl.ENTITY_CACHE_ENABLED,
            VareddyImpl.class, vareddy.getPrimaryKey(), vareddy);

        return vareddy;
    }

    protected Vareddy toUnwrappedModel(Vareddy vareddy) {
        if (vareddy instanceof VareddyImpl) {
            return vareddy;
        }

        VareddyImpl vareddyImpl = new VareddyImpl();

        vareddyImpl.setNew(vareddy.isNew());
        vareddyImpl.setPrimaryKey(vareddy.getPrimaryKey());

        vareddyImpl.setSamptime(vareddy.getSamptime());
        vareddyImpl.setH(vareddy.getH());
        vareddyImpl.setH_EMEP(vareddy.getH_EMEP());
        vareddyImpl.setLE(vareddy.getLE());
        vareddyImpl.setLE_EMEP(vareddy.getLE_EMEP());
        vareddyImpl.setE(vareddy.getE());
        vareddyImpl.setE_EMEP(vareddy.getE_EMEP());
        vareddyImpl.setF_c(vareddy.getF_c());
        vareddyImpl.setF_c_EMEP(vareddy.getF_c_EMEP());
        vareddyImpl.setTau(vareddy.getTau());
        vareddyImpl.setTau_EMEP(vareddy.getTau_EMEP());
        vareddyImpl.setU_star(vareddy.getU_star());
        vareddyImpl.setU_star_EMEP(vareddy.getU_star_EMEP());
        vareddyImpl.setMO_length(vareddy.getMO_length());
        vareddyImpl.setMO_length_EMEP(vareddy.getMO_length_EMEP());
        vareddyImpl.setStd_u(vareddy.getStd_u());
        vareddyImpl.setStd_u_EMEP(vareddy.getStd_u_EMEP());
        vareddyImpl.setStd_v(vareddy.getStd_v());
        vareddyImpl.setStd_v_EMEP(vareddy.getStd_v_EMEP());
        vareddyImpl.setStd_w(vareddy.getStd_w());
        vareddyImpl.setStd_w_EMEP(vareddy.getStd_w_EMEP());
        vareddyImpl.setStd_t(vareddy.getStd_t());
        vareddyImpl.setStd_t_EMEP(vareddy.getStd_t_EMEP());
        vareddyImpl.setStd_c(vareddy.getStd_c());
        vareddyImpl.setStd_c_EMEP(vareddy.getStd_c_EMEP());
        vareddyImpl.setStd_h(vareddy.getStd_h());
        vareddyImpl.setStd_h_EMEP(vareddy.getStd_h_EMEP());
        vareddyImpl.setAv_u(vareddy.getAv_u());
        vareddyImpl.setAv_u_EMEP(vareddy.getAv_u_EMEP());
        vareddyImpl.setAv_v(vareddy.getAv_v());
        vareddyImpl.setAv_v_EMEP(vareddy.getAv_v_EMEP());
        vareddyImpl.setAv_w(vareddy.getAv_w());
        vareddyImpl.setAv_w_EMEP(vareddy.getAv_w_EMEP());
        vareddyImpl.setAv_t(vareddy.getAv_t());
        vareddyImpl.setAv_t_EMEP(vareddy.getAv_t_EMEP());
        vareddyImpl.setAv_c(vareddy.getAv_c());
        vareddyImpl.setAv_c_EMEP(vareddy.getAv_c_EMEP());
        vareddyImpl.setAv_h(vareddy.getAv_h());
        vareddyImpl.setAv_h_EMEP(vareddy.getAv_h_EMEP());
        vareddyImpl.setU(vareddy.getU());
        vareddyImpl.setU_EMEP(vareddy.getU_EMEP());
        vareddyImpl.setWind_dir(vareddy.getWind_dir());
        vareddyImpl.setWind_dir_EMEP(vareddy.getWind_dir_EMEP());
        vareddyImpl.setC_lag(vareddy.getC_lag());
        vareddyImpl.setC_lag_EMEP(vareddy.getC_lag_EMEP());
        vareddyImpl.setH_lag(vareddy.getH_lag());
        vareddyImpl.setH_lag_EMEP(vareddy.getH_lag_EMEP());
        vareddyImpl.setLicor_t_std(vareddy.getLicor_t_std());
        vareddyImpl.setLicor_t_std_EMEP(vareddy.getLicor_t_std_EMEP());
        vareddyImpl.setLicor_t_av(vareddy.getLicor_t_av());
        vareddyImpl.setLicor_t_av_EMEP(vareddy.getLicor_t_av_EMEP());
        vareddyImpl.setLicor_p_std(vareddy.getLicor_p_std());
        vareddyImpl.setLicor_p_std_EMEP(vareddy.getLicor_p_std_EMEP());
        vareddyImpl.setLicor_p_av(vareddy.getLicor_p_av());
        vareddyImpl.setLicor_p_av_EMEP(vareddy.getLicor_p_av_EMEP());
        vareddyImpl.setH_sub(vareddy.getH_sub());
        vareddyImpl.setH_sub_EMEP(vareddy.getH_sub_EMEP());
        vareddyImpl.setLE_sub(vareddy.getLE_sub());
        vareddyImpl.setLE_sub_EMEP(vareddy.getLE_sub_EMEP());
        vareddyImpl.setE_sub(vareddy.getE_sub());
        vareddyImpl.setE_sub_EMEP(vareddy.getE_sub_EMEP());
        vareddyImpl.setF_c_sub(vareddy.getF_c_sub());
        vareddyImpl.setF_c_sub_EMEP(vareddy.getF_c_sub_EMEP());
        vareddyImpl.setTau_sub(vareddy.getTau_sub());
        vareddyImpl.setTau_sub_EMEP(vareddy.getTau_sub_EMEP());
        vareddyImpl.setU_star_sub(vareddy.getU_star_sub());
        vareddyImpl.setU_star_sub_EMEP(vareddy.getU_star_sub_EMEP());
        vareddyImpl.setMO_length_sub(vareddy.getMO_length_sub());
        vareddyImpl.setMO_length_sub_EMEP(vareddy.getMO_length_sub_EMEP());
        vareddyImpl.setStd_u_sub(vareddy.getStd_u_sub());
        vareddyImpl.setStd_u_sub_EMEP(vareddy.getStd_u_sub_EMEP());
        vareddyImpl.setStd_v_sub(vareddy.getStd_v_sub());
        vareddyImpl.setStd_v_sub_EMEP(vareddy.getStd_v_sub_EMEP());
        vareddyImpl.setStd_w_sub(vareddy.getStd_w_sub());
        vareddyImpl.setStd_w_sub_EMEP(vareddy.getStd_w_sub_EMEP());
        vareddyImpl.setStd_t_sub(vareddy.getStd_t_sub());
        vareddyImpl.setStd_t_sub_EMEP(vareddy.getStd_t_sub_EMEP());
        vareddyImpl.setStd_c_sub(vareddy.getStd_c_sub());
        vareddyImpl.setStd_c_sub_EMEP(vareddy.getStd_c_sub_EMEP());
        vareddyImpl.setStd_h_sub(vareddy.getStd_h_sub());
        vareddyImpl.setStd_h_sub_EMEP(vareddy.getStd_h_sub_EMEP());
        vareddyImpl.setAv_u_sub(vareddy.getAv_u_sub());
        vareddyImpl.setAv_u_sub_EMEP(vareddy.getAv_u_sub_EMEP());
        vareddyImpl.setAv_v_sub(vareddy.getAv_v_sub());
        vareddyImpl.setAv_v_sub_EMEP(vareddy.getAv_v_sub_EMEP());
        vareddyImpl.setAv_w_sub(vareddy.getAv_w_sub());
        vareddyImpl.setAv_w_sub_EMEP(vareddy.getAv_w_sub_EMEP());
        vareddyImpl.setAv_t_sub(vareddy.getAv_t_sub());
        vareddyImpl.setAv_t_sub_EMEP(vareddy.getAv_t_sub_EMEP());
        vareddyImpl.setAv_c_sub(vareddy.getAv_c_sub());
        vareddyImpl.setAv_c_sub_EMEP(vareddy.getAv_c_sub_EMEP());
        vareddyImpl.setAv_h_sub(vareddy.getAv_h_sub());
        vareddyImpl.setAv_h_sub_EMEP(vareddy.getAv_h_sub_EMEP());
        vareddyImpl.setU_sub(vareddy.getU_sub());
        vareddyImpl.setU_sub_EMEP(vareddy.getU_sub_EMEP());
        vareddyImpl.setWind_dir_sub(vareddy.getWind_dir_sub());
        vareddyImpl.setWind_dir_sub_EMEP(vareddy.getWind_dir_sub_EMEP());

        return vareddyImpl;
    }

    /**
     * Returns the vareddy with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the vareddy
     * @return the vareddy
     * @throws fi.csc.smear.db.NoSuchVareddyException if a vareddy with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Vareddy findByPrimaryKey(Serializable primaryKey)
        throws NoSuchVareddyException, SystemException {
        Vareddy vareddy = fetchByPrimaryKey(primaryKey);

        if (vareddy == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchVareddyException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return vareddy;
    }

    /**
     * Returns the vareddy with the primary key or throws a {@link fi.csc.smear.db.NoSuchVareddyException} if it could not be found.
     *
     * @param samptime the primary key of the vareddy
     * @return the vareddy
     * @throws fi.csc.smear.db.NoSuchVareddyException if a vareddy with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Vareddy findByPrimaryKey(java.util.Date samptime)
        throws NoSuchVareddyException, SystemException {
        return findByPrimaryKey((Serializable) samptime);
    }

    /**
     * Returns the vareddy with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the vareddy
     * @return the vareddy, or <code>null</code> if a vareddy with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Vareddy fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Vareddy vareddy = (Vareddy) EntityCacheUtil.getResult(VareddyModelImpl.ENTITY_CACHE_ENABLED,
                VareddyImpl.class, primaryKey);

        if (vareddy == _nullVareddy) {
            return null;
        }

        if (vareddy == null) {
            Session session = null;

            try {
                session = openSession();

                vareddy = (Vareddy) session.get(VareddyImpl.class, primaryKey);

                if (vareddy != null) {
                    cacheResult(vareddy);
                } else {
                    EntityCacheUtil.putResult(VareddyModelImpl.ENTITY_CACHE_ENABLED,
                        VareddyImpl.class, primaryKey, _nullVareddy);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(VareddyModelImpl.ENTITY_CACHE_ENABLED,
                    VareddyImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return vareddy;
    }

    /**
     * Returns the vareddy with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param samptime the primary key of the vareddy
     * @return the vareddy, or <code>null</code> if a vareddy with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Vareddy fetchByPrimaryKey(java.util.Date samptime)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) samptime);
    }

    /**
     * Returns all the vareddies.
     *
     * @return the vareddies
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Vareddy> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the vareddies.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.VareddyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of vareddies
     * @param end the upper bound of the range of vareddies (not inclusive)
     * @return the range of vareddies
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Vareddy> findAll(int start, int end) throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the vareddies.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.VareddyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of vareddies
     * @param end the upper bound of the range of vareddies (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of vareddies
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Vareddy> findAll(int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
            finderArgs = FINDER_ARGS_EMPTY;
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
            finderArgs = new Object[] { start, end, orderByComparator };
        }

        List<Vareddy> list = (List<Vareddy>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_VAREDDY);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_VAREDDY;

                if (pagination) {
                    sql = sql.concat(VareddyModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Vareddy>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Vareddy>(list);
                } else {
                    list = (List<Vareddy>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Removes all the vareddies from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Vareddy vareddy : findAll()) {
            remove(vareddy);
        }
    }

    /**
     * Returns the number of vareddies.
     *
     * @return the number of vareddies
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countAll() throws SystemException {
        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
                FINDER_ARGS_EMPTY, this);

        if (count == null) {
            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(_SQL_COUNT_VAREDDY);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Initializes the vareddy persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.fi.csc.smear.db.model.Vareddy")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Vareddy>> listenersList = new ArrayList<ModelListener<Vareddy>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Vareddy>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(VareddyImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
