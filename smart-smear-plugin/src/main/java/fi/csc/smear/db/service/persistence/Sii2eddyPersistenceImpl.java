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

import fi.csc.smear.db.NoSuchSii2eddyException;
import fi.csc.smear.db.model.Sii2eddy;
import fi.csc.smear.db.model.impl.Sii2eddyImpl;
import fi.csc.smear.db.model.impl.Sii2eddyModelImpl;
import fi.csc.smear.db.service.persistence.Sii2eddyPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the sii2eddy service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author pj
 * @see Sii2eddyPersistence
 * @see Sii2eddyUtil
 * @generated
 */
public class Sii2eddyPersistenceImpl extends BasePersistenceImpl<Sii2eddy>
    implements Sii2eddyPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link Sii2eddyUtil} to access the sii2eddy persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = Sii2eddyImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(Sii2eddyModelImpl.ENTITY_CACHE_ENABLED,
            Sii2eddyModelImpl.FINDER_CACHE_ENABLED, Sii2eddyImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(Sii2eddyModelImpl.ENTITY_CACHE_ENABLED,
            Sii2eddyModelImpl.FINDER_CACHE_ENABLED, Sii2eddyImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(Sii2eddyModelImpl.ENTITY_CACHE_ENABLED,
            Sii2eddyModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_SII2EDDY = "SELECT sii2eddy FROM Sii2eddy sii2eddy";
    private static final String _SQL_COUNT_SII2EDDY = "SELECT COUNT(sii2eddy) FROM Sii2eddy sii2eddy";
    private static final String _ORDER_BY_ENTITY_ALIAS = "sii2eddy.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Sii2eddy exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(Sii2eddyPersistenceImpl.class);
    private static Sii2eddy _nullSii2eddy = new Sii2eddyImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Sii2eddy> toCacheModel() {
                return _nullSii2eddyCacheModel;
            }
        };

    private static CacheModel<Sii2eddy> _nullSii2eddyCacheModel = new CacheModel<Sii2eddy>() {
            @Override
            public Sii2eddy toEntityModel() {
                return _nullSii2eddy;
            }
        };

    public Sii2eddyPersistenceImpl() {
        setModelClass(Sii2eddy.class);
    }

    /**
     * Caches the sii2eddy in the entity cache if it is enabled.
     *
     * @param sii2eddy the sii2eddy
     */
    @Override
    public void cacheResult(Sii2eddy sii2eddy) {
        EntityCacheUtil.putResult(Sii2eddyModelImpl.ENTITY_CACHE_ENABLED,
            Sii2eddyImpl.class, sii2eddy.getPrimaryKey(), sii2eddy);

        sii2eddy.resetOriginalValues();
    }

    /**
     * Caches the sii2eddies in the entity cache if it is enabled.
     *
     * @param sii2eddies the sii2eddies
     */
    @Override
    public void cacheResult(List<Sii2eddy> sii2eddies) {
        for (Sii2eddy sii2eddy : sii2eddies) {
            if (EntityCacheUtil.getResult(
                        Sii2eddyModelImpl.ENTITY_CACHE_ENABLED,
                        Sii2eddyImpl.class, sii2eddy.getPrimaryKey()) == null) {
                cacheResult(sii2eddy);
            } else {
                sii2eddy.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all sii2eddies.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(Sii2eddyImpl.class.getName());
        }

        EntityCacheUtil.clearCache(Sii2eddyImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the sii2eddy.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Sii2eddy sii2eddy) {
        EntityCacheUtil.removeResult(Sii2eddyModelImpl.ENTITY_CACHE_ENABLED,
            Sii2eddyImpl.class, sii2eddy.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<Sii2eddy> sii2eddies) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Sii2eddy sii2eddy : sii2eddies) {
            EntityCacheUtil.removeResult(Sii2eddyModelImpl.ENTITY_CACHE_ENABLED,
                Sii2eddyImpl.class, sii2eddy.getPrimaryKey());
        }
    }

    /**
     * Creates a new sii2eddy with the primary key. Does not add the sii2eddy to the database.
     *
     * @param samptime the primary key for the new sii2eddy
     * @return the new sii2eddy
     */
    @Override
    public Sii2eddy create(java.util.Date samptime) {
        Sii2eddy sii2eddy = new Sii2eddyImpl();

        sii2eddy.setNew(true);
        sii2eddy.setPrimaryKey(samptime);

        return sii2eddy;
    }

    /**
     * Removes the sii2eddy with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param samptime the primary key of the sii2eddy
     * @return the sii2eddy that was removed
     * @throws fi.csc.smear.db.NoSuchSii2eddyException if a sii2eddy with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Sii2eddy remove(java.util.Date samptime)
        throws NoSuchSii2eddyException, SystemException {
        return remove((Serializable) samptime);
    }

    /**
     * Removes the sii2eddy with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the sii2eddy
     * @return the sii2eddy that was removed
     * @throws fi.csc.smear.db.NoSuchSii2eddyException if a sii2eddy with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Sii2eddy remove(Serializable primaryKey)
        throws NoSuchSii2eddyException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Sii2eddy sii2eddy = (Sii2eddy) session.get(Sii2eddyImpl.class,
                    primaryKey);

            if (sii2eddy == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchSii2eddyException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(sii2eddy);
        } catch (NoSuchSii2eddyException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Sii2eddy removeImpl(Sii2eddy sii2eddy) throws SystemException {
        sii2eddy = toUnwrappedModel(sii2eddy);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(sii2eddy)) {
                sii2eddy = (Sii2eddy) session.get(Sii2eddyImpl.class,
                        sii2eddy.getPrimaryKeyObj());
            }

            if (sii2eddy != null) {
                session.delete(sii2eddy);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (sii2eddy != null) {
            clearCache(sii2eddy);
        }

        return sii2eddy;
    }

    @Override
    public Sii2eddy updateImpl(fi.csc.smear.db.model.Sii2eddy sii2eddy)
        throws SystemException {
        sii2eddy = toUnwrappedModel(sii2eddy);

        boolean isNew = sii2eddy.isNew();

        Session session = null;

        try {
            session = openSession();

            if (sii2eddy.isNew()) {
                session.save(sii2eddy);

                sii2eddy.setNew(false);
            } else {
                session.merge(sii2eddy);
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

        EntityCacheUtil.putResult(Sii2eddyModelImpl.ENTITY_CACHE_ENABLED,
            Sii2eddyImpl.class, sii2eddy.getPrimaryKey(), sii2eddy);

        return sii2eddy;
    }

    protected Sii2eddy toUnwrappedModel(Sii2eddy sii2eddy) {
        if (sii2eddy instanceof Sii2eddyImpl) {
            return sii2eddy;
        }

        Sii2eddyImpl sii2eddyImpl = new Sii2eddyImpl();

        sii2eddyImpl.setNew(sii2eddy.isNew());
        sii2eddyImpl.setPrimaryKey(sii2eddy.getPrimaryKey());

        sii2eddyImpl.setSamptime(sii2eddy.getSamptime());
        sii2eddyImpl.setU(sii2eddy.getU());
        sii2eddyImpl.setU_EMEP(sii2eddy.getU_EMEP());
        sii2eddyImpl.setWind_dir(sii2eddy.getWind_dir());
        sii2eddyImpl.setWind_dir_EMEP(sii2eddy.getWind_dir_EMEP());
        sii2eddyImpl.setEta(sii2eddy.getEta());
        sii2eddyImpl.setEta_EMEP(sii2eddy.getEta_EMEP());
        sii2eddyImpl.setTheta(sii2eddy.getTheta());
        sii2eddyImpl.setTheta_EMEP(sii2eddy.getTheta_EMEP());
        sii2eddyImpl.setBeta(sii2eddy.getBeta());
        sii2eddyImpl.setBeta_EMEP(sii2eddy.getBeta_EMEP());
        sii2eddyImpl.setH(sii2eddy.getH());
        sii2eddyImpl.setH_EMEP(sii2eddy.getH_EMEP());
        sii2eddyImpl.setTau(sii2eddy.getTau());
        sii2eddyImpl.setTau_EMEP(sii2eddy.getTau_EMEP());
        sii2eddyImpl.setU_star(sii2eddy.getU_star());
        sii2eddyImpl.setU_star_EMEP(sii2eddy.getU_star_EMEP());
        sii2eddyImpl.setMO_length(sii2eddy.getMO_length());
        sii2eddyImpl.setMO_length_EMEP(sii2eddy.getMO_length_EMEP());
        sii2eddyImpl.setErr_packet(sii2eddy.getErr_packet());
        sii2eddyImpl.setErr_packet_EMEP(sii2eddy.getErr_packet_EMEP());
        sii2eddyImpl.setF_c_LI72(sii2eddy.getF_c_LI72());
        sii2eddyImpl.setF_c_LI72_EMEP(sii2eddy.getF_c_LI72_EMEP());
        sii2eddyImpl.setF_H2O_LI72(sii2eddy.getF_H2O_LI72());
        sii2eddyImpl.setF_H2O_LI72_EMEP(sii2eddy.getF_H2O_LI72_EMEP());
        sii2eddyImpl.setF_CH4_LI77(sii2eddy.getF_CH4_LI77());
        sii2eddyImpl.setF_CH4_LI77_EMEP(sii2eddy.getF_CH4_LI77_EMEP());
        sii2eddyImpl.setLE_LI72(sii2eddy.getLE_LI72());
        sii2eddyImpl.setLE_LI72_EMEP(sii2eddy.getLE_LI72_EMEP());
        sii2eddyImpl.setAv_u(sii2eddy.getAv_u());
        sii2eddyImpl.setAv_u_EMEP(sii2eddy.getAv_u_EMEP());
        sii2eddyImpl.setAv_v(sii2eddy.getAv_v());
        sii2eddyImpl.setAv_v_EMEP(sii2eddy.getAv_v_EMEP());
        sii2eddyImpl.setAv_w(sii2eddy.getAv_w());
        sii2eddyImpl.setAv_w_EMEP(sii2eddy.getAv_w_EMEP());
        sii2eddyImpl.setT_s(sii2eddy.getT_s());
        sii2eddyImpl.setT_s_EMEP(sii2eddy.getT_s_EMEP());
        sii2eddyImpl.setAv_c(sii2eddy.getAv_c());
        sii2eddyImpl.setAv_c_EMEP(sii2eddy.getAv_c_EMEP());
        sii2eddyImpl.setAv_H2O_LI72(sii2eddy.getAv_H2O_LI72());
        sii2eddyImpl.setAv_H2O_LI72_EMEP(sii2eddy.getAv_H2O_LI72_EMEP());
        sii2eddyImpl.setAv_CH4_LI77(sii2eddy.getAv_CH4_LI77());
        sii2eddyImpl.setAv_CH4_LI77_EMEP(sii2eddy.getAv_CH4_LI77_EMEP());
        sii2eddyImpl.setStd_u(sii2eddy.getStd_u());
        sii2eddyImpl.setStd_u_EMEP(sii2eddy.getStd_u_EMEP());
        sii2eddyImpl.setStd_v(sii2eddy.getStd_v());
        sii2eddyImpl.setStd_v_EMEP(sii2eddy.getStd_v_EMEP());
        sii2eddyImpl.setStd_w(sii2eddy.getStd_w());
        sii2eddyImpl.setStd_w_EMEP(sii2eddy.getStd_w_EMEP());
        sii2eddyImpl.setStd_T_s(sii2eddy.getStd_T_s());
        sii2eddyImpl.setStd_T_s_EMEP(sii2eddy.getStd_T_s_EMEP());
        sii2eddyImpl.setStd_c_LI72(sii2eddy.getStd_c_LI72());
        sii2eddyImpl.setStd_c_LI72_EMEP(sii2eddy.getStd_c_LI72_EMEP());
        sii2eddyImpl.setStd_H2O_LI72(sii2eddy.getStd_H2O_LI72());
        sii2eddyImpl.setStd_H2O_LI72_EMEP(sii2eddy.getStd_H2O_LI72_EMEP());
        sii2eddyImpl.setStd_CH4_LI77(sii2eddy.getStd_CH4_LI77());
        sii2eddyImpl.setStd_CH4_LI77_EMEP(sii2eddy.getStd_CH4_LI77_EMEP());
        sii2eddyImpl.setC_lag_LI72(sii2eddy.getC_lag_LI72());
        sii2eddyImpl.setC_lag_LI72_EMEP(sii2eddy.getC_lag_LI72_EMEP());
        sii2eddyImpl.setH2O_lag_LI72(sii2eddy.getH2O_lag_LI72());
        sii2eddyImpl.setH2O_lag_LI72_EMEP(sii2eddy.getH2O_lag_LI72_EMEP());
        sii2eddyImpl.setCH4_lag_LI77(sii2eddy.getCH4_lag_LI77());
        sii2eddyImpl.setCH4_lag_LI77_EMEP(sii2eddy.getCH4_lag_LI77_EMEP());
        sii2eddyImpl.setQc_H(sii2eddy.getQc_H());
        sii2eddyImpl.setQc_H_EMEP(sii2eddy.getQc_H_EMEP());
        sii2eddyImpl.setQc_CO2_LI70(sii2eddy.getQc_CO2_LI70());
        sii2eddyImpl.setQc_CO2_LI70_EMEP(sii2eddy.getQc_CO2_LI70_EMEP());
        sii2eddyImpl.setQc_CH4_LI77(sii2eddy.getQc_CH4_LI77());
        sii2eddyImpl.setQc_CH4_LI77_EMEP(sii2eddy.getQc_CH4_LI77_EMEP());
        sii2eddyImpl.setQc_LE_LI72(sii2eddy.getQc_LE_LI72());
        sii2eddyImpl.setQc_LE_LI72_EMEP(sii2eddy.getQc_LE_LI72_EMEP());
        sii2eddyImpl.setQc_tau(sii2eddy.getQc_tau());
        sii2eddyImpl.setQc_tau_EMEP(sii2eddy.getQc_tau_EMEP());

        return sii2eddyImpl;
    }

    /**
     * Returns the sii2eddy with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the sii2eddy
     * @return the sii2eddy
     * @throws fi.csc.smear.db.NoSuchSii2eddyException if a sii2eddy with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Sii2eddy findByPrimaryKey(Serializable primaryKey)
        throws NoSuchSii2eddyException, SystemException {
        Sii2eddy sii2eddy = fetchByPrimaryKey(primaryKey);

        if (sii2eddy == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchSii2eddyException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return sii2eddy;
    }

    /**
     * Returns the sii2eddy with the primary key or throws a {@link fi.csc.smear.db.NoSuchSii2eddyException} if it could not be found.
     *
     * @param samptime the primary key of the sii2eddy
     * @return the sii2eddy
     * @throws fi.csc.smear.db.NoSuchSii2eddyException if a sii2eddy with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Sii2eddy findByPrimaryKey(java.util.Date samptime)
        throws NoSuchSii2eddyException, SystemException {
        return findByPrimaryKey((Serializable) samptime);
    }

    /**
     * Returns the sii2eddy with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the sii2eddy
     * @return the sii2eddy, or <code>null</code> if a sii2eddy with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Sii2eddy fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Sii2eddy sii2eddy = (Sii2eddy) EntityCacheUtil.getResult(Sii2eddyModelImpl.ENTITY_CACHE_ENABLED,
                Sii2eddyImpl.class, primaryKey);

        if (sii2eddy == _nullSii2eddy) {
            return null;
        }

        if (sii2eddy == null) {
            Session session = null;

            try {
                session = openSession();

                sii2eddy = (Sii2eddy) session.get(Sii2eddyImpl.class, primaryKey);

                if (sii2eddy != null) {
                    cacheResult(sii2eddy);
                } else {
                    EntityCacheUtil.putResult(Sii2eddyModelImpl.ENTITY_CACHE_ENABLED,
                        Sii2eddyImpl.class, primaryKey, _nullSii2eddy);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(Sii2eddyModelImpl.ENTITY_CACHE_ENABLED,
                    Sii2eddyImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return sii2eddy;
    }

    /**
     * Returns the sii2eddy with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param samptime the primary key of the sii2eddy
     * @return the sii2eddy, or <code>null</code> if a sii2eddy with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Sii2eddy fetchByPrimaryKey(java.util.Date samptime)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) samptime);
    }

    /**
     * Returns all the sii2eddies.
     *
     * @return the sii2eddies
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Sii2eddy> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the sii2eddies.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.Sii2eddyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of sii2eddies
     * @param end the upper bound of the range of sii2eddies (not inclusive)
     * @return the range of sii2eddies
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Sii2eddy> findAll(int start, int end) throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the sii2eddies.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.Sii2eddyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of sii2eddies
     * @param end the upper bound of the range of sii2eddies (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of sii2eddies
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Sii2eddy> findAll(int start, int end,
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

        List<Sii2eddy> list = (List<Sii2eddy>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_SII2EDDY);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_SII2EDDY;

                if (pagination) {
                    sql = sql.concat(Sii2eddyModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Sii2eddy>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Sii2eddy>(list);
                } else {
                    list = (List<Sii2eddy>) QueryUtil.list(q, getDialect(),
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
     * Removes all the sii2eddies from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Sii2eddy sii2eddy : findAll()) {
            remove(sii2eddy);
        }
    }

    /**
     * Returns the number of sii2eddies.
     *
     * @return the number of sii2eddies
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

                Query q = session.createQuery(_SQL_COUNT_SII2EDDY);

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
     * Initializes the sii2eddy persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.fi.csc.smear.db.model.Sii2eddy")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Sii2eddy>> listenersList = new ArrayList<ModelListener<Sii2eddy>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Sii2eddy>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(Sii2eddyImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
