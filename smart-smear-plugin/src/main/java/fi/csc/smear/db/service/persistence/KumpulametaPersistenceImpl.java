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

import fi.csc.smear.db.NoSuchKumpulametaException;
import fi.csc.smear.db.model.Kumpulameta;
import fi.csc.smear.db.model.impl.KumpulametaImpl;
import fi.csc.smear.db.model.impl.KumpulametaModelImpl;
import fi.csc.smear.db.service.persistence.KumpulametaPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the kumpulameta service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author pj
 * @see KumpulametaPersistence
 * @see KumpulametaUtil
 * @generated
 */
public class KumpulametaPersistenceImpl extends BasePersistenceImpl<Kumpulameta>
    implements KumpulametaPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link KumpulametaUtil} to access the kumpulameta persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = KumpulametaImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(KumpulametaModelImpl.ENTITY_CACHE_ENABLED,
            KumpulametaModelImpl.FINDER_CACHE_ENABLED, KumpulametaImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(KumpulametaModelImpl.ENTITY_CACHE_ENABLED,
            KumpulametaModelImpl.FINDER_CACHE_ENABLED, KumpulametaImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(KumpulametaModelImpl.ENTITY_CACHE_ENABLED,
            KumpulametaModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_KUMPULAMETA = "SELECT kumpulameta FROM Kumpulameta kumpulameta";
    private static final String _SQL_COUNT_KUMPULAMETA = "SELECT COUNT(kumpulameta) FROM Kumpulameta kumpulameta";
    private static final String _ORDER_BY_ENTITY_ALIAS = "kumpulameta.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Kumpulameta exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(KumpulametaPersistenceImpl.class);
    private static Kumpulameta _nullKumpulameta = new KumpulametaImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Kumpulameta> toCacheModel() {
                return _nullKumpulametaCacheModel;
            }
        };

    private static CacheModel<Kumpulameta> _nullKumpulametaCacheModel = new CacheModel<Kumpulameta>() {
            @Override
            public Kumpulameta toEntityModel() {
                return _nullKumpulameta;
            }
        };

    public KumpulametaPersistenceImpl() {
        setModelClass(Kumpulameta.class);
    }

    /**
     * Caches the kumpulameta in the entity cache if it is enabled.
     *
     * @param kumpulameta the kumpulameta
     */
    @Override
    public void cacheResult(Kumpulameta kumpulameta) {
        EntityCacheUtil.putResult(KumpulametaModelImpl.ENTITY_CACHE_ENABLED,
            KumpulametaImpl.class, kumpulameta.getPrimaryKey(), kumpulameta);

        kumpulameta.resetOriginalValues();
    }

    /**
     * Caches the kumpulametas in the entity cache if it is enabled.
     *
     * @param kumpulametas the kumpulametas
     */
    @Override
    public void cacheResult(List<Kumpulameta> kumpulametas) {
        for (Kumpulameta kumpulameta : kumpulametas) {
            if (EntityCacheUtil.getResult(
                        KumpulametaModelImpl.ENTITY_CACHE_ENABLED,
                        KumpulametaImpl.class, kumpulameta.getPrimaryKey()) == null) {
                cacheResult(kumpulameta);
            } else {
                kumpulameta.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all kumpulametas.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(KumpulametaImpl.class.getName());
        }

        EntityCacheUtil.clearCache(KumpulametaImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the kumpulameta.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Kumpulameta kumpulameta) {
        EntityCacheUtil.removeResult(KumpulametaModelImpl.ENTITY_CACHE_ENABLED,
            KumpulametaImpl.class, kumpulameta.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<Kumpulameta> kumpulametas) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Kumpulameta kumpulameta : kumpulametas) {
            EntityCacheUtil.removeResult(KumpulametaModelImpl.ENTITY_CACHE_ENABLED,
                KumpulametaImpl.class, kumpulameta.getPrimaryKey());
        }
    }

    /**
     * Creates a new kumpulameta with the primary key. Does not add the kumpulameta to the database.
     *
     * @param samptime the primary key for the new kumpulameta
     * @return the new kumpulameta
     */
    @Override
    public Kumpulameta create(java.util.Date samptime) {
        Kumpulameta kumpulameta = new KumpulametaImpl();

        kumpulameta.setNew(true);
        kumpulameta.setPrimaryKey(samptime);

        return kumpulameta;
    }

    /**
     * Removes the kumpulameta with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param samptime the primary key of the kumpulameta
     * @return the kumpulameta that was removed
     * @throws fi.csc.smear.db.NoSuchKumpulametaException if a kumpulameta with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Kumpulameta remove(java.util.Date samptime)
        throws NoSuchKumpulametaException, SystemException {
        return remove((Serializable) samptime);
    }

    /**
     * Removes the kumpulameta with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the kumpulameta
     * @return the kumpulameta that was removed
     * @throws fi.csc.smear.db.NoSuchKumpulametaException if a kumpulameta with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Kumpulameta remove(Serializable primaryKey)
        throws NoSuchKumpulametaException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Kumpulameta kumpulameta = (Kumpulameta) session.get(KumpulametaImpl.class,
                    primaryKey);

            if (kumpulameta == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchKumpulametaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(kumpulameta);
        } catch (NoSuchKumpulametaException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Kumpulameta removeImpl(Kumpulameta kumpulameta)
        throws SystemException {
        kumpulameta = toUnwrappedModel(kumpulameta);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(kumpulameta)) {
                kumpulameta = (Kumpulameta) session.get(KumpulametaImpl.class,
                        kumpulameta.getPrimaryKeyObj());
            }

            if (kumpulameta != null) {
                session.delete(kumpulameta);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (kumpulameta != null) {
            clearCache(kumpulameta);
        }

        return kumpulameta;
    }

    @Override
    public Kumpulameta updateImpl(fi.csc.smear.db.model.Kumpulameta kumpulameta)
        throws SystemException {
        kumpulameta = toUnwrappedModel(kumpulameta);

        boolean isNew = kumpulameta.isNew();

        Session session = null;

        try {
            session = openSession();

            if (kumpulameta.isNew()) {
                session.save(kumpulameta);

                kumpulameta.setNew(false);
            } else {
                session.merge(kumpulameta);
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

        EntityCacheUtil.putResult(KumpulametaModelImpl.ENTITY_CACHE_ENABLED,
            KumpulametaImpl.class, kumpulameta.getPrimaryKey(), kumpulameta);

        return kumpulameta;
    }

    protected Kumpulameta toUnwrappedModel(Kumpulameta kumpulameta) {
        if (kumpulameta instanceof KumpulametaImpl) {
            return kumpulameta;
        }

        KumpulametaImpl kumpulametaImpl = new KumpulametaImpl();

        kumpulametaImpl.setNew(kumpulameta.isNew());
        kumpulametaImpl.setPrimaryKey(kumpulameta.getPrimaryKey());

        kumpulametaImpl.setSamptime(kumpulameta.getSamptime());
        kumpulametaImpl.setT(kumpulameta.getT());
        kumpulametaImpl.setDp(kumpulameta.getDp());
        kumpulametaImpl.setRh(kumpulameta.getRh());
        kumpulametaImpl.setP(kumpulameta.getP());
        kumpulametaImpl.setWs(kumpulameta.getWs());
        kumpulametaImpl.setWdir(kumpulameta.getWdir());
        kumpulametaImpl.setRmm(kumpulameta.getRmm());
        kumpulametaImpl.setP0(kumpulameta.getP0());
        kumpulametaImpl.setGlob(kumpulameta.getGlob());
        kumpulametaImpl.setPar(kumpulameta.getPar());
        kumpulametaImpl.setSkyir(kumpulameta.getSkyir());
        kumpulametaImpl.setPwd_visibility_1(kumpulameta.getPwd_visibility_1());
        kumpulametaImpl.setPwd_visibility_10(kumpulameta.getPwd_visibility_10());
        kumpulametaImpl.setPwd_wmo_0(kumpulameta.getPwd_wmo_0());
        kumpulametaImpl.setPwd_wmo_15(kumpulameta.getPwd_wmo_15());
        kumpulametaImpl.setPwd_wmo_60(kumpulameta.getPwd_wmo_60());
        kumpulametaImpl.setPwd_intensity_w(kumpulameta.getPwd_intensity_w());
        kumpulametaImpl.setPwd_rmm(kumpulameta.getPwd_rmm());
        kumpulametaImpl.setPwd_smm(kumpulameta.getPwd_smm());
        kumpulametaImpl.setPwd_nws(kumpulameta.getPwd_nws());
        kumpulametaImpl.setTower_T_4m(kumpulameta.getTower_T_4m());
        kumpulametaImpl.setTower_T_8m(kumpulameta.getTower_T_8m());
        kumpulametaImpl.setTower_T_16m(kumpulameta.getTower_T_16m());
        kumpulametaImpl.setTower_T_32m(kumpulameta.getTower_T_32m());
        kumpulametaImpl.setTower_WS_32m(kumpulameta.getTower_WS_32m());
        kumpulametaImpl.setTower_WS_16m(kumpulameta.getTower_WS_16m());
        kumpulametaImpl.setTower_WS_8m(kumpulameta.getTower_WS_8m());
        kumpulametaImpl.setTower_WS_4m(kumpulameta.getTower_WS_4m());
        kumpulametaImpl.setTower_WDIR_32m(kumpulameta.getTower_WDIR_32m());
        kumpulametaImpl.setTower_WDIR_16m(kumpulameta.getTower_WDIR_16m());
        kumpulametaImpl.setTower_WDIR_8m(kumpulameta.getTower_WDIR_8m());
        kumpulametaImpl.setTower_WDIR_4m(kumpulameta.getTower_WDIR_4m());
        kumpulametaImpl.setTower_PAR_32m(kumpulameta.getTower_PAR_32m());
        kumpulametaImpl.setTower_PAR_REFL_32m(kumpulameta.getTower_PAR_REFL_32m());
        kumpulametaImpl.setTower_GLOB_32m(kumpulameta.getTower_GLOB_32m());
        kumpulametaImpl.setTower_GLOB_REFL_32m(kumpulameta.getTower_GLOB_REFL_32m());
        kumpulametaImpl.setTower_IR_32m(kumpulameta.getTower_IR_32m());
        kumpulametaImpl.setTower_IR_REFL_32m(kumpulameta.getTower_IR_REFL_32m());
        kumpulametaImpl.setTower_VT_4m(kumpulameta.getTower_VT_4m());
        kumpulametaImpl.setTower_VT_8m(kumpulameta.getTower_VT_8m());
        kumpulametaImpl.setTower_VT_16m(kumpulameta.getTower_VT_16m());
        kumpulametaImpl.setTower_VT_32m(kumpulameta.getTower_VT_32m());
        kumpulametaImpl.setO_3(kumpulameta.getO_3());
        kumpulametaImpl.setNO(kumpulameta.getNO());
        kumpulametaImpl.setNO_x(kumpulameta.getNO_x());
        kumpulametaImpl.setSO_2(kumpulameta.getSO_2());
        kumpulametaImpl.setCO(kumpulameta.getCO());
        kumpulametaImpl.setTower_WS_MAX_32m(kumpulameta.getTower_WS_MAX_32m());
        kumpulametaImpl.setTower_WS_MAX_16m(kumpulameta.getTower_WS_MAX_16m());
        kumpulametaImpl.setTower_WS_MAX_8m(kumpulameta.getTower_WS_MAX_8m());
        kumpulametaImpl.setTower_WS_MAX_4m(kumpulameta.getTower_WS_MAX_4m());

        return kumpulametaImpl;
    }

    /**
     * Returns the kumpulameta with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the kumpulameta
     * @return the kumpulameta
     * @throws fi.csc.smear.db.NoSuchKumpulametaException if a kumpulameta with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Kumpulameta findByPrimaryKey(Serializable primaryKey)
        throws NoSuchKumpulametaException, SystemException {
        Kumpulameta kumpulameta = fetchByPrimaryKey(primaryKey);

        if (kumpulameta == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchKumpulametaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return kumpulameta;
    }

    /**
     * Returns the kumpulameta with the primary key or throws a {@link fi.csc.smear.db.NoSuchKumpulametaException} if it could not be found.
     *
     * @param samptime the primary key of the kumpulameta
     * @return the kumpulameta
     * @throws fi.csc.smear.db.NoSuchKumpulametaException if a kumpulameta with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Kumpulameta findByPrimaryKey(java.util.Date samptime)
        throws NoSuchKumpulametaException, SystemException {
        return findByPrimaryKey((Serializable) samptime);
    }

    /**
     * Returns the kumpulameta with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the kumpulameta
     * @return the kumpulameta, or <code>null</code> if a kumpulameta with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Kumpulameta fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Kumpulameta kumpulameta = (Kumpulameta) EntityCacheUtil.getResult(KumpulametaModelImpl.ENTITY_CACHE_ENABLED,
                KumpulametaImpl.class, primaryKey);

        if (kumpulameta == _nullKumpulameta) {
            return null;
        }

        if (kumpulameta == null) {
            Session session = null;

            try {
                session = openSession();

                kumpulameta = (Kumpulameta) session.get(KumpulametaImpl.class,
                        primaryKey);

                if (kumpulameta != null) {
                    cacheResult(kumpulameta);
                } else {
                    EntityCacheUtil.putResult(KumpulametaModelImpl.ENTITY_CACHE_ENABLED,
                        KumpulametaImpl.class, primaryKey, _nullKumpulameta);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(KumpulametaModelImpl.ENTITY_CACHE_ENABLED,
                    KumpulametaImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return kumpulameta;
    }

    /**
     * Returns the kumpulameta with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param samptime the primary key of the kumpulameta
     * @return the kumpulameta, or <code>null</code> if a kumpulameta with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Kumpulameta fetchByPrimaryKey(java.util.Date samptime)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) samptime);
    }

    /**
     * Returns all the kumpulametas.
     *
     * @return the kumpulametas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Kumpulameta> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the kumpulametas.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.KumpulametaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of kumpulametas
     * @param end the upper bound of the range of kumpulametas (not inclusive)
     * @return the range of kumpulametas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Kumpulameta> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the kumpulametas.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.KumpulametaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of kumpulametas
     * @param end the upper bound of the range of kumpulametas (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of kumpulametas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Kumpulameta> findAll(int start, int end,
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

        List<Kumpulameta> list = (List<Kumpulameta>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_KUMPULAMETA);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_KUMPULAMETA;

                if (pagination) {
                    sql = sql.concat(KumpulametaModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Kumpulameta>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Kumpulameta>(list);
                } else {
                    list = (List<Kumpulameta>) QueryUtil.list(q, getDialect(),
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
     * Removes all the kumpulametas from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Kumpulameta kumpulameta : findAll()) {
            remove(kumpulameta);
        }
    }

    /**
     * Returns the number of kumpulametas.
     *
     * @return the number of kumpulametas
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

                Query q = session.createQuery(_SQL_COUNT_KUMPULAMETA);

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
     * Initializes the kumpulameta persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.fi.csc.smear.db.model.Kumpulameta")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Kumpulameta>> listenersList = new ArrayList<ModelListener<Kumpulameta>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Kumpulameta>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(KumpulametaImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
