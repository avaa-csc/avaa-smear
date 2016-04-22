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

import fi.csc.smear.db.NoSuchTowermetaException;
import fi.csc.smear.db.model.Towermeta;
import fi.csc.smear.db.model.impl.TowermetaImpl;
import fi.csc.smear.db.model.impl.TowermetaModelImpl;
import fi.csc.smear.db.service.persistence.TowermetaPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the towermeta service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author pj
 * @see TowermetaPersistence
 * @see TowermetaUtil
 * @generated
 */
public class TowermetaPersistenceImpl extends BasePersistenceImpl<Towermeta>
    implements TowermetaPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link TowermetaUtil} to access the towermeta persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = TowermetaImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TowermetaModelImpl.ENTITY_CACHE_ENABLED,
            TowermetaModelImpl.FINDER_CACHE_ENABLED, TowermetaImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TowermetaModelImpl.ENTITY_CACHE_ENABLED,
            TowermetaModelImpl.FINDER_CACHE_ENABLED, TowermetaImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TowermetaModelImpl.ENTITY_CACHE_ENABLED,
            TowermetaModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_TOWERMETA = "SELECT towermeta FROM Towermeta towermeta";
    private static final String _SQL_COUNT_TOWERMETA = "SELECT COUNT(towermeta) FROM Towermeta towermeta";
    private static final String _ORDER_BY_ENTITY_ALIAS = "towermeta.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Towermeta exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(TowermetaPersistenceImpl.class);
    private static Towermeta _nullTowermeta = new TowermetaImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Towermeta> toCacheModel() {
                return _nullTowermetaCacheModel;
            }
        };

    private static CacheModel<Towermeta> _nullTowermetaCacheModel = new CacheModel<Towermeta>() {
            @Override
            public Towermeta toEntityModel() {
                return _nullTowermeta;
            }
        };

    public TowermetaPersistenceImpl() {
        setModelClass(Towermeta.class);
    }

    /**
     * Caches the towermeta in the entity cache if it is enabled.
     *
     * @param towermeta the towermeta
     */
    @Override
    public void cacheResult(Towermeta towermeta) {
        EntityCacheUtil.putResult(TowermetaModelImpl.ENTITY_CACHE_ENABLED,
            TowermetaImpl.class, towermeta.getPrimaryKey(), towermeta);

        towermeta.resetOriginalValues();
    }

    /**
     * Caches the towermetas in the entity cache if it is enabled.
     *
     * @param towermetas the towermetas
     */
    @Override
    public void cacheResult(List<Towermeta> towermetas) {
        for (Towermeta towermeta : towermetas) {
            if (EntityCacheUtil.getResult(
                        TowermetaModelImpl.ENTITY_CACHE_ENABLED,
                        TowermetaImpl.class, towermeta.getPrimaryKey()) == null) {
                cacheResult(towermeta);
            } else {
                towermeta.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all towermetas.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(TowermetaImpl.class.getName());
        }

        EntityCacheUtil.clearCache(TowermetaImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the towermeta.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Towermeta towermeta) {
        EntityCacheUtil.removeResult(TowermetaModelImpl.ENTITY_CACHE_ENABLED,
            TowermetaImpl.class, towermeta.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<Towermeta> towermetas) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Towermeta towermeta : towermetas) {
            EntityCacheUtil.removeResult(TowermetaModelImpl.ENTITY_CACHE_ENABLED,
                TowermetaImpl.class, towermeta.getPrimaryKey());
        }
    }

    /**
     * Creates a new towermeta with the primary key. Does not add the towermeta to the database.
     *
     * @param samptime the primary key for the new towermeta
     * @return the new towermeta
     */
    @Override
    public Towermeta create(java.util.Date samptime) {
        Towermeta towermeta = new TowermetaImpl();

        towermeta.setNew(true);
        towermeta.setPrimaryKey(samptime);

        return towermeta;
    }

    /**
     * Removes the towermeta with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param samptime the primary key of the towermeta
     * @return the towermeta that was removed
     * @throws fi.csc.smear.db.NoSuchTowermetaException if a towermeta with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Towermeta remove(java.util.Date samptime)
        throws NoSuchTowermetaException, SystemException {
        return remove((Serializable) samptime);
    }

    /**
     * Removes the towermeta with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the towermeta
     * @return the towermeta that was removed
     * @throws fi.csc.smear.db.NoSuchTowermetaException if a towermeta with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Towermeta remove(Serializable primaryKey)
        throws NoSuchTowermetaException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Towermeta towermeta = (Towermeta) session.get(TowermetaImpl.class,
                    primaryKey);

            if (towermeta == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchTowermetaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(towermeta);
        } catch (NoSuchTowermetaException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Towermeta removeImpl(Towermeta towermeta)
        throws SystemException {
        towermeta = toUnwrappedModel(towermeta);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(towermeta)) {
                towermeta = (Towermeta) session.get(TowermetaImpl.class,
                        towermeta.getPrimaryKeyObj());
            }

            if (towermeta != null) {
                session.delete(towermeta);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (towermeta != null) {
            clearCache(towermeta);
        }

        return towermeta;
    }

    @Override
    public Towermeta updateImpl(fi.csc.smear.db.model.Towermeta towermeta)
        throws SystemException {
        towermeta = toUnwrappedModel(towermeta);

        boolean isNew = towermeta.isNew();

        Session session = null;

        try {
            session = openSession();

            if (towermeta.isNew()) {
                session.save(towermeta);

                towermeta.setNew(false);
            } else {
                session.merge(towermeta);
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

        EntityCacheUtil.putResult(TowermetaModelImpl.ENTITY_CACHE_ENABLED,
            TowermetaImpl.class, towermeta.getPrimaryKey(), towermeta);

        return towermeta;
    }

    protected Towermeta toUnwrappedModel(Towermeta towermeta) {
        if (towermeta instanceof TowermetaImpl) {
            return towermeta;
        }

        TowermetaImpl towermetaImpl = new TowermetaImpl();

        towermetaImpl.setNew(towermeta.isNew());
        towermetaImpl.setPrimaryKey(towermeta.getPrimaryKey());

        towermetaImpl.setSamptime(towermeta.getSamptime());
        towermetaImpl.setH(towermeta.getH());
        towermetaImpl.setH_EMEP(towermeta.getH_EMEP());
        towermetaImpl.setQc_H(towermeta.getQc_H());
        towermetaImpl.setQc_H_EMEP(towermeta.getQc_H_EMEP());
        towermetaImpl.setLE(towermeta.getLE());
        towermetaImpl.setLE_EMEP(towermeta.getLE_EMEP());
        towermetaImpl.setQc_LE(towermeta.getQc_LE());
        towermetaImpl.setQc_LE_EMEP(towermeta.getQc_LE_EMEP());
        towermetaImpl.setE(towermeta.getE());
        towermetaImpl.setE_EMEP(towermeta.getE_EMEP());
        towermetaImpl.setQc_E(towermeta.getQc_E());
        towermetaImpl.setQc_E_EMEP(towermeta.getQc_E_EMEP());
        towermetaImpl.setF_c(towermeta.getF_c());
        towermetaImpl.setF_c_EMEP(towermeta.getF_c_EMEP());
        towermetaImpl.setQc_F_c(towermeta.getQc_F_c());
        towermetaImpl.setQc_F_c_EMEP(towermeta.getQc_F_c_EMEP());
        towermetaImpl.setTau(towermeta.getTau());
        towermetaImpl.setTau_EMEP(towermeta.getTau_EMEP());
        towermetaImpl.setQc_tau(towermeta.getQc_tau());
        towermetaImpl.setQc_tau_EMEP(towermeta.getQc_tau_EMEP());
        towermetaImpl.setU_star(towermeta.getU_star());
        towermetaImpl.setU_star_EMEP(towermeta.getU_star_EMEP());
        towermetaImpl.setMO_length(towermeta.getMO_length());
        towermetaImpl.setMO_length_EMEP(towermeta.getMO_length_EMEP());
        towermetaImpl.setStd_u(towermeta.getStd_u());
        towermetaImpl.setStd_u_EMEP(towermeta.getStd_u_EMEP());
        towermetaImpl.setStd_v(towermeta.getStd_v());
        towermetaImpl.setStd_v_EMEP(towermeta.getStd_v_EMEP());
        towermetaImpl.setStd_w(towermeta.getStd_w());
        towermetaImpl.setStd_w_EMEP(towermeta.getStd_w_EMEP());
        towermetaImpl.setStd_t(towermeta.getStd_t());
        towermetaImpl.setStd_t_EMEP(towermeta.getStd_t_EMEP());
        towermetaImpl.setStd_c(towermeta.getStd_c());
        towermetaImpl.setStd_c_EMEP(towermeta.getStd_c_EMEP());
        towermetaImpl.setStd_h(towermeta.getStd_h());
        towermetaImpl.setStd_h_EMEP(towermeta.getStd_h_EMEP());
        towermetaImpl.setAv_u(towermeta.getAv_u());
        towermetaImpl.setAv_u_EMEP(towermeta.getAv_u_EMEP());
        towermetaImpl.setAv_v(towermeta.getAv_v());
        towermetaImpl.setAv_v_EMEP(towermeta.getAv_v_EMEP());
        towermetaImpl.setAv_w(towermeta.getAv_w());
        towermetaImpl.setAv_w_EMEP(towermeta.getAv_w_EMEP());
        towermetaImpl.setAv_t(towermeta.getAv_t());
        towermetaImpl.setAv_t_EMEP(towermeta.getAv_t_EMEP());
        towermetaImpl.setAv_c(towermeta.getAv_c());
        towermetaImpl.setAv_c_EMEP(towermeta.getAv_c_EMEP());
        towermetaImpl.setAv_h(towermeta.getAv_h());
        towermetaImpl.setAv_h_EMEP(towermeta.getAv_h_EMEP());
        towermetaImpl.setU(towermeta.getU());
        towermetaImpl.setU_EMEP(towermeta.getU_EMEP());
        towermetaImpl.setWind_dir(towermeta.getWind_dir());
        towermetaImpl.setWind_dir_EMEP(towermeta.getWind_dir_EMEP());
        towermetaImpl.setEta(towermeta.getEta());
        towermetaImpl.setEta_EMEP(towermeta.getEta_EMEP());
        towermetaImpl.setTheta(towermeta.getTheta());
        towermetaImpl.setTheta_EMEP(towermeta.getTheta_EMEP());
        towermetaImpl.setBeta(towermeta.getBeta());
        towermetaImpl.setBeta_EMEP(towermeta.getBeta_EMEP());
        towermetaImpl.setC_lag(towermeta.getC_lag());
        towermetaImpl.setC_lag_EMEP(towermeta.getC_lag_EMEP());
        towermetaImpl.setH_lag(towermeta.getH_lag());
        towermetaImpl.setH_lag_EMEP(towermeta.getH_lag_EMEP());
        towermetaImpl.setErr_packet(towermeta.getErr_packet());
        towermetaImpl.setErr_packet_EMEP(towermeta.getErr_packet_EMEP());
        towermetaImpl.setLicor_t_std(towermeta.getLicor_t_std());
        towermetaImpl.setLicor_t_std_EMEP(towermeta.getLicor_t_std_EMEP());
        towermetaImpl.setLicor_t_av(towermeta.getLicor_t_av());
        towermetaImpl.setLicor_t_av_EMEP(towermeta.getLicor_t_av_EMEP());
        towermetaImpl.setLicor_p_std(towermeta.getLicor_p_std());
        towermetaImpl.setLicor_p_std_EMEP(towermeta.getLicor_p_std_EMEP());
        towermetaImpl.setLicor_p_av(towermeta.getLicor_p_av());
        towermetaImpl.setLicor_p_av_EMEP(towermeta.getLicor_p_av_EMEP());
        towermetaImpl.setF_CPC(towermeta.getF_CPC());
        towermetaImpl.setF_CPC_EMEP(towermeta.getF_CPC_EMEP());
        towermetaImpl.setQc_F_CPC(towermeta.getQc_F_CPC());
        towermetaImpl.setQc_F_CPC_EMEP(towermeta.getQc_F_CPC_EMEP());
        towermetaImpl.setStd_CPC(towermeta.getStd_CPC());
        towermetaImpl.setStd_CPC_EMEP(towermeta.getStd_CPC_EMEP());
        towermetaImpl.setAv_CPC(towermeta.getAv_CPC());
        towermetaImpl.setAv_CPC_EMEP(towermeta.getAv_CPC_EMEP());
        towermetaImpl.setCPC_lag(towermeta.getCPC_lag());
        towermetaImpl.setCPC_lag_EMEP(towermeta.getCPC_lag_EMEP());

        return towermetaImpl;
    }

    /**
     * Returns the towermeta with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the towermeta
     * @return the towermeta
     * @throws fi.csc.smear.db.NoSuchTowermetaException if a towermeta with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Towermeta findByPrimaryKey(Serializable primaryKey)
        throws NoSuchTowermetaException, SystemException {
        Towermeta towermeta = fetchByPrimaryKey(primaryKey);

        if (towermeta == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchTowermetaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return towermeta;
    }

    /**
     * Returns the towermeta with the primary key or throws a {@link fi.csc.smear.db.NoSuchTowermetaException} if it could not be found.
     *
     * @param samptime the primary key of the towermeta
     * @return the towermeta
     * @throws fi.csc.smear.db.NoSuchTowermetaException if a towermeta with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Towermeta findByPrimaryKey(java.util.Date samptime)
        throws NoSuchTowermetaException, SystemException {
        return findByPrimaryKey((Serializable) samptime);
    }

    /**
     * Returns the towermeta with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the towermeta
     * @return the towermeta, or <code>null</code> if a towermeta with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Towermeta fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Towermeta towermeta = (Towermeta) EntityCacheUtil.getResult(TowermetaModelImpl.ENTITY_CACHE_ENABLED,
                TowermetaImpl.class, primaryKey);

        if (towermeta == _nullTowermeta) {
            return null;
        }

        if (towermeta == null) {
            Session session = null;

            try {
                session = openSession();

                towermeta = (Towermeta) session.get(TowermetaImpl.class,
                        primaryKey);

                if (towermeta != null) {
                    cacheResult(towermeta);
                } else {
                    EntityCacheUtil.putResult(TowermetaModelImpl.ENTITY_CACHE_ENABLED,
                        TowermetaImpl.class, primaryKey, _nullTowermeta);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(TowermetaModelImpl.ENTITY_CACHE_ENABLED,
                    TowermetaImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return towermeta;
    }

    /**
     * Returns the towermeta with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param samptime the primary key of the towermeta
     * @return the towermeta, or <code>null</code> if a towermeta with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Towermeta fetchByPrimaryKey(java.util.Date samptime)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) samptime);
    }

    /**
     * Returns all the towermetas.
     *
     * @return the towermetas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Towermeta> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the towermetas.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.TowermetaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of towermetas
     * @param end the upper bound of the range of towermetas (not inclusive)
     * @return the range of towermetas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Towermeta> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the towermetas.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.TowermetaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of towermetas
     * @param end the upper bound of the range of towermetas (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of towermetas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Towermeta> findAll(int start, int end,
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

        List<Towermeta> list = (List<Towermeta>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_TOWERMETA);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_TOWERMETA;

                if (pagination) {
                    sql = sql.concat(TowermetaModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Towermeta>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Towermeta>(list);
                } else {
                    list = (List<Towermeta>) QueryUtil.list(q, getDialect(),
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
     * Removes all the towermetas from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Towermeta towermeta : findAll()) {
            remove(towermeta);
        }
    }

    /**
     * Returns the number of towermetas.
     *
     * @return the number of towermetas
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

                Query q = session.createQuery(_SQL_COUNT_TOWERMETA);

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
     * Initializes the towermeta persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.fi.csc.smear.db.model.Towermeta")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Towermeta>> listenersList = new ArrayList<ModelListener<Towermeta>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Towermeta>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(TowermetaImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
