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

import fi.csc.smear.db.NoSuchHyyDMPSException;
import fi.csc.smear.db.model.HyyDMPS;
import fi.csc.smear.db.model.impl.HyyDMPSImpl;
import fi.csc.smear.db.model.impl.HyyDMPSModelImpl;
import fi.csc.smear.db.service.persistence.HyyDMPSPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the hyy d m p s service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author pj
 * @see HyyDMPSPersistence
 * @see HyyDMPSUtil
 * @generated
 */
public class HyyDMPSPersistenceImpl extends BasePersistenceImpl<HyyDMPS>
    implements HyyDMPSPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link HyyDMPSUtil} to access the hyy d m p s persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = HyyDMPSImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(HyyDMPSModelImpl.ENTITY_CACHE_ENABLED,
            HyyDMPSModelImpl.FINDER_CACHE_ENABLED, HyyDMPSImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(HyyDMPSModelImpl.ENTITY_CACHE_ENABLED,
            HyyDMPSModelImpl.FINDER_CACHE_ENABLED, HyyDMPSImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(HyyDMPSModelImpl.ENTITY_CACHE_ENABLED,
            HyyDMPSModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_HYYDMPS = "SELECT hyyDMPS FROM HyyDMPS hyyDMPS";
    private static final String _SQL_COUNT_HYYDMPS = "SELECT COUNT(hyyDMPS) FROM HyyDMPS hyyDMPS";
    private static final String _ORDER_BY_ENTITY_ALIAS = "hyyDMPS.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No HyyDMPS exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(HyyDMPSPersistenceImpl.class);
    private static HyyDMPS _nullHyyDMPS = new HyyDMPSImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<HyyDMPS> toCacheModel() {
                return _nullHyyDMPSCacheModel;
            }
        };

    private static CacheModel<HyyDMPS> _nullHyyDMPSCacheModel = new CacheModel<HyyDMPS>() {
            @Override
            public HyyDMPS toEntityModel() {
                return _nullHyyDMPS;
            }
        };

    public HyyDMPSPersistenceImpl() {
        setModelClass(HyyDMPS.class);
    }

    /**
     * Caches the hyy d m p s in the entity cache if it is enabled.
     *
     * @param hyyDMPS the hyy d m p s
     */
    @Override
    public void cacheResult(HyyDMPS hyyDMPS) {
        EntityCacheUtil.putResult(HyyDMPSModelImpl.ENTITY_CACHE_ENABLED,
            HyyDMPSImpl.class, hyyDMPS.getPrimaryKey(), hyyDMPS);

        hyyDMPS.resetOriginalValues();
    }

    /**
     * Caches the hyy d m p ses in the entity cache if it is enabled.
     *
     * @param hyyDMPSs the hyy d m p ses
     */
    @Override
    public void cacheResult(List<HyyDMPS> hyyDMPSs) {
        for (HyyDMPS hyyDMPS : hyyDMPSs) {
            if (EntityCacheUtil.getResult(
                        HyyDMPSModelImpl.ENTITY_CACHE_ENABLED,
                        HyyDMPSImpl.class, hyyDMPS.getPrimaryKey()) == null) {
                cacheResult(hyyDMPS);
            } else {
                hyyDMPS.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all hyy d m p ses.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(HyyDMPSImpl.class.getName());
        }

        EntityCacheUtil.clearCache(HyyDMPSImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the hyy d m p s.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(HyyDMPS hyyDMPS) {
        EntityCacheUtil.removeResult(HyyDMPSModelImpl.ENTITY_CACHE_ENABLED,
            HyyDMPSImpl.class, hyyDMPS.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<HyyDMPS> hyyDMPSs) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (HyyDMPS hyyDMPS : hyyDMPSs) {
            EntityCacheUtil.removeResult(HyyDMPSModelImpl.ENTITY_CACHE_ENABLED,
                HyyDMPSImpl.class, hyyDMPS.getPrimaryKey());
        }
    }

    /**
     * Creates a new hyy d m p s with the primary key. Does not add the hyy d m p s to the database.
     *
     * @param samptime the primary key for the new hyy d m p s
     * @return the new hyy d m p s
     */
    @Override
    public HyyDMPS create(java.util.Date samptime) {
        HyyDMPS hyyDMPS = new HyyDMPSImpl();

        hyyDMPS.setNew(true);
        hyyDMPS.setPrimaryKey(samptime);

        return hyyDMPS;
    }

    /**
     * Removes the hyy d m p s with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param samptime the primary key of the hyy d m p s
     * @return the hyy d m p s that was removed
     * @throws fi.csc.smear.db.NoSuchHyyDMPSException if a hyy d m p s with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public HyyDMPS remove(java.util.Date samptime)
        throws NoSuchHyyDMPSException, SystemException {
        return remove((Serializable) samptime);
    }

    /**
     * Removes the hyy d m p s with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the hyy d m p s
     * @return the hyy d m p s that was removed
     * @throws fi.csc.smear.db.NoSuchHyyDMPSException if a hyy d m p s with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public HyyDMPS remove(Serializable primaryKey)
        throws NoSuchHyyDMPSException, SystemException {
        Session session = null;

        try {
            session = openSession();

            HyyDMPS hyyDMPS = (HyyDMPS) session.get(HyyDMPSImpl.class,
                    primaryKey);

            if (hyyDMPS == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchHyyDMPSException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(hyyDMPS);
        } catch (NoSuchHyyDMPSException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected HyyDMPS removeImpl(HyyDMPS hyyDMPS) throws SystemException {
        hyyDMPS = toUnwrappedModel(hyyDMPS);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(hyyDMPS)) {
                hyyDMPS = (HyyDMPS) session.get(HyyDMPSImpl.class,
                        hyyDMPS.getPrimaryKeyObj());
            }

            if (hyyDMPS != null) {
                session.delete(hyyDMPS);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (hyyDMPS != null) {
            clearCache(hyyDMPS);
        }

        return hyyDMPS;
    }

    @Override
    public HyyDMPS updateImpl(fi.csc.smear.db.model.HyyDMPS hyyDMPS)
        throws SystemException {
        hyyDMPS = toUnwrappedModel(hyyDMPS);

        boolean isNew = hyyDMPS.isNew();

        Session session = null;

        try {
            session = openSession();

            if (hyyDMPS.isNew()) {
                session.save(hyyDMPS);

                hyyDMPS.setNew(false);
            } else {
                session.merge(hyyDMPS);
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

        EntityCacheUtil.putResult(HyyDMPSModelImpl.ENTITY_CACHE_ENABLED,
            HyyDMPSImpl.class, hyyDMPS.getPrimaryKey(), hyyDMPS);

        return hyyDMPS;
    }

    protected HyyDMPS toUnwrappedModel(HyyDMPS hyyDMPS) {
        if (hyyDMPS instanceof HyyDMPSImpl) {
            return hyyDMPS;
        }

        HyyDMPSImpl hyyDMPSImpl = new HyyDMPSImpl();

        hyyDMPSImpl.setNew(hyyDMPS.isNew());
        hyyDMPSImpl.setPrimaryKey(hyyDMPS.getPrimaryKey());

        hyyDMPSImpl.setSamptime(hyyDMPS.getSamptime());
        hyyDMPSImpl.setT1(hyyDMPS.getT1());
        hyyDMPSImpl.setT2(hyyDMPS.getT2());
        hyyDMPSImpl.setP1(hyyDMPS.getP1());
        hyyDMPSImpl.setP2(hyyDMPS.getP2());
        hyyDMPSImpl.setRh1(hyyDMPS.getRh1());
        hyyDMPSImpl.setRh2(hyyDMPS.getRh2());
        hyyDMPSImpl.setD100e1(hyyDMPS.getD100e1());
        hyyDMPSImpl.setD112e1(hyyDMPS.getD112e1());
        hyyDMPSImpl.setD126e1(hyyDMPS.getD126e1());
        hyyDMPSImpl.setD141e1(hyyDMPS.getD141e1());
        hyyDMPSImpl.setD158e1(hyyDMPS.getD158e1());
        hyyDMPSImpl.setD178e1(hyyDMPS.getD178e1());
        hyyDMPSImpl.setD200e1(hyyDMPS.getD200e1());
        hyyDMPSImpl.setD224e1(hyyDMPS.getD224e1());
        hyyDMPSImpl.setD251e1(hyyDMPS.getD251e1());
        hyyDMPSImpl.setD282e1(hyyDMPS.getD282e1());
        hyyDMPSImpl.setD316e1(hyyDMPS.getD316e1());
        hyyDMPSImpl.setD355e1(hyyDMPS.getD355e1());
        hyyDMPSImpl.setD398e1(hyyDMPS.getD398e1());
        hyyDMPSImpl.setD447e1(hyyDMPS.getD447e1());
        hyyDMPSImpl.setD501e1(hyyDMPS.getD501e1());
        hyyDMPSImpl.setD562e1(hyyDMPS.getD562e1());
        hyyDMPSImpl.setD631e1(hyyDMPS.getD631e1());
        hyyDMPSImpl.setD708e1(hyyDMPS.getD708e1());
        hyyDMPSImpl.setD794e1(hyyDMPS.getD794e1());
        hyyDMPSImpl.setD891e1(hyyDMPS.getD891e1());
        hyyDMPSImpl.setD100e2(hyyDMPS.getD100e2());
        hyyDMPSImpl.setD112e2(hyyDMPS.getD112e2());
        hyyDMPSImpl.setD126e2(hyyDMPS.getD126e2());
        hyyDMPSImpl.setD141e2(hyyDMPS.getD141e2());
        hyyDMPSImpl.setD158e2(hyyDMPS.getD158e2());
        hyyDMPSImpl.setD178e2(hyyDMPS.getD178e2());
        hyyDMPSImpl.setD200e2(hyyDMPS.getD200e2());
        hyyDMPSImpl.setD224e2(hyyDMPS.getD224e2());
        hyyDMPSImpl.setD251e2(hyyDMPS.getD251e2());
        hyyDMPSImpl.setD282e2(hyyDMPS.getD282e2());
        hyyDMPSImpl.setD316e2(hyyDMPS.getD316e2());
        hyyDMPSImpl.setD355e2(hyyDMPS.getD355e2());
        hyyDMPSImpl.setD398e2(hyyDMPS.getD398e2());
        hyyDMPSImpl.setD447e2(hyyDMPS.getD447e2());
        hyyDMPSImpl.setD501e2(hyyDMPS.getD501e2());
        hyyDMPSImpl.setD562e2(hyyDMPS.getD562e2());
        hyyDMPSImpl.setD631e2(hyyDMPS.getD631e2());
        hyyDMPSImpl.setD708e2(hyyDMPS.getD708e2());
        hyyDMPSImpl.setD794e2(hyyDMPS.getD794e2());
        hyyDMPSImpl.setD891e2(hyyDMPS.getD891e2());
        hyyDMPSImpl.setD100e3(hyyDMPS.getD100e3());
        hyyDMPSImpl.setD112e3(hyyDMPS.getD112e3());
        hyyDMPSImpl.setD126e3(hyyDMPS.getD126e3());
        hyyDMPSImpl.setD141e3(hyyDMPS.getD141e3());
        hyyDMPSImpl.setD158e3(hyyDMPS.getD158e3());
        hyyDMPSImpl.setD178e3(hyyDMPS.getD178e3());
        hyyDMPSImpl.setD200e3(hyyDMPS.getD200e3());
        hyyDMPSImpl.setD224e3(hyyDMPS.getD224e3());
        hyyDMPSImpl.setD251e3(hyyDMPS.getD251e3());
        hyyDMPSImpl.setD282e3(hyyDMPS.getD282e3());
        hyyDMPSImpl.setD316e3(hyyDMPS.getD316e3());
        hyyDMPSImpl.setD355e3(hyyDMPS.getD355e3());
        hyyDMPSImpl.setD398e3(hyyDMPS.getD398e3());
        hyyDMPSImpl.setD447e3(hyyDMPS.getD447e3());
        hyyDMPSImpl.setD501e3(hyyDMPS.getD501e3());
        hyyDMPSImpl.setD562e3(hyyDMPS.getD562e3());
        hyyDMPSImpl.setD631e3(hyyDMPS.getD631e3());
        hyyDMPSImpl.setD708e3(hyyDMPS.getD708e3());
        hyyDMPSImpl.setD794e3(hyyDMPS.getD794e3());
        hyyDMPSImpl.setD891e3(hyyDMPS.getD891e3());
        hyyDMPSImpl.setD100e4(hyyDMPS.getD100e4());
        hyyDMPSImpl.setTconc(hyyDMPS.getTconc());

        return hyyDMPSImpl;
    }

    /**
     * Returns the hyy d m p s with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the hyy d m p s
     * @return the hyy d m p s
     * @throws fi.csc.smear.db.NoSuchHyyDMPSException if a hyy d m p s with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public HyyDMPS findByPrimaryKey(Serializable primaryKey)
        throws NoSuchHyyDMPSException, SystemException {
        HyyDMPS hyyDMPS = fetchByPrimaryKey(primaryKey);

        if (hyyDMPS == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchHyyDMPSException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return hyyDMPS;
    }

    /**
     * Returns the hyy d m p s with the primary key or throws a {@link fi.csc.smear.db.NoSuchHyyDMPSException} if it could not be found.
     *
     * @param samptime the primary key of the hyy d m p s
     * @return the hyy d m p s
     * @throws fi.csc.smear.db.NoSuchHyyDMPSException if a hyy d m p s with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public HyyDMPS findByPrimaryKey(java.util.Date samptime)
        throws NoSuchHyyDMPSException, SystemException {
        return findByPrimaryKey((Serializable) samptime);
    }

    /**
     * Returns the hyy d m p s with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the hyy d m p s
     * @return the hyy d m p s, or <code>null</code> if a hyy d m p s with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public HyyDMPS fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        HyyDMPS hyyDMPS = (HyyDMPS) EntityCacheUtil.getResult(HyyDMPSModelImpl.ENTITY_CACHE_ENABLED,
                HyyDMPSImpl.class, primaryKey);

        if (hyyDMPS == _nullHyyDMPS) {
            return null;
        }

        if (hyyDMPS == null) {
            Session session = null;

            try {
                session = openSession();

                hyyDMPS = (HyyDMPS) session.get(HyyDMPSImpl.class, primaryKey);

                if (hyyDMPS != null) {
                    cacheResult(hyyDMPS);
                } else {
                    EntityCacheUtil.putResult(HyyDMPSModelImpl.ENTITY_CACHE_ENABLED,
                        HyyDMPSImpl.class, primaryKey, _nullHyyDMPS);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(HyyDMPSModelImpl.ENTITY_CACHE_ENABLED,
                    HyyDMPSImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return hyyDMPS;
    }

    /**
     * Returns the hyy d m p s with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param samptime the primary key of the hyy d m p s
     * @return the hyy d m p s, or <code>null</code> if a hyy d m p s with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public HyyDMPS fetchByPrimaryKey(java.util.Date samptime)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) samptime);
    }

    /**
     * Returns all the hyy d m p ses.
     *
     * @return the hyy d m p ses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<HyyDMPS> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the hyy d m p ses.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.HyyDMPSModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of hyy d m p ses
     * @param end the upper bound of the range of hyy d m p ses (not inclusive)
     * @return the range of hyy d m p ses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<HyyDMPS> findAll(int start, int end) throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the hyy d m p ses.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.HyyDMPSModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of hyy d m p ses
     * @param end the upper bound of the range of hyy d m p ses (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of hyy d m p ses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<HyyDMPS> findAll(int start, int end,
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

        List<HyyDMPS> list = (List<HyyDMPS>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_HYYDMPS);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_HYYDMPS;

                if (pagination) {
                    sql = sql.concat(HyyDMPSModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<HyyDMPS>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<HyyDMPS>(list);
                } else {
                    list = (List<HyyDMPS>) QueryUtil.list(q, getDialect(),
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
     * Removes all the hyy d m p ses from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (HyyDMPS hyyDMPS : findAll()) {
            remove(hyyDMPS);
        }
    }

    /**
     * Returns the number of hyy d m p ses.
     *
     * @return the number of hyy d m p ses
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

                Query q = session.createQuery(_SQL_COUNT_HYYDMPS);

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
     * Initializes the hyy d m p s persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.fi.csc.smear.db.model.HyyDMPS")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<HyyDMPS>> listenersList = new ArrayList<ModelListener<HyyDMPS>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<HyyDMPS>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(HyyDMPSImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
