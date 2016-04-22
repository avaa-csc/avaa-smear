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

import fi.csc.smear.db.NoSuchKumpulaDMPSException;
import fi.csc.smear.db.model.KumpulaDMPS;
import fi.csc.smear.db.model.impl.KumpulaDMPSImpl;
import fi.csc.smear.db.model.impl.KumpulaDMPSModelImpl;
import fi.csc.smear.db.service.persistence.KumpulaDMPSPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the kumpula d m p s service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author pj
 * @see KumpulaDMPSPersistence
 * @see KumpulaDMPSUtil
 * @generated
 */
public class KumpulaDMPSPersistenceImpl extends BasePersistenceImpl<KumpulaDMPS>
    implements KumpulaDMPSPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link KumpulaDMPSUtil} to access the kumpula d m p s persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = KumpulaDMPSImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(KumpulaDMPSModelImpl.ENTITY_CACHE_ENABLED,
            KumpulaDMPSModelImpl.FINDER_CACHE_ENABLED, KumpulaDMPSImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(KumpulaDMPSModelImpl.ENTITY_CACHE_ENABLED,
            KumpulaDMPSModelImpl.FINDER_CACHE_ENABLED, KumpulaDMPSImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(KumpulaDMPSModelImpl.ENTITY_CACHE_ENABLED,
            KumpulaDMPSModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_KUMPULADMPS = "SELECT kumpulaDMPS FROM KumpulaDMPS kumpulaDMPS";
    private static final String _SQL_COUNT_KUMPULADMPS = "SELECT COUNT(kumpulaDMPS) FROM KumpulaDMPS kumpulaDMPS";
    private static final String _ORDER_BY_ENTITY_ALIAS = "kumpulaDMPS.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No KumpulaDMPS exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(KumpulaDMPSPersistenceImpl.class);
    private static KumpulaDMPS _nullKumpulaDMPS = new KumpulaDMPSImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<KumpulaDMPS> toCacheModel() {
                return _nullKumpulaDMPSCacheModel;
            }
        };

    private static CacheModel<KumpulaDMPS> _nullKumpulaDMPSCacheModel = new CacheModel<KumpulaDMPS>() {
            @Override
            public KumpulaDMPS toEntityModel() {
                return _nullKumpulaDMPS;
            }
        };

    public KumpulaDMPSPersistenceImpl() {
        setModelClass(KumpulaDMPS.class);
    }

    /**
     * Caches the kumpula d m p s in the entity cache if it is enabled.
     *
     * @param kumpulaDMPS the kumpula d m p s
     */
    @Override
    public void cacheResult(KumpulaDMPS kumpulaDMPS) {
        EntityCacheUtil.putResult(KumpulaDMPSModelImpl.ENTITY_CACHE_ENABLED,
            KumpulaDMPSImpl.class, kumpulaDMPS.getPrimaryKey(), kumpulaDMPS);

        kumpulaDMPS.resetOriginalValues();
    }

    /**
     * Caches the kumpula d m p ses in the entity cache if it is enabled.
     *
     * @param kumpulaDMPSs the kumpula d m p ses
     */
    @Override
    public void cacheResult(List<KumpulaDMPS> kumpulaDMPSs) {
        for (KumpulaDMPS kumpulaDMPS : kumpulaDMPSs) {
            if (EntityCacheUtil.getResult(
                        KumpulaDMPSModelImpl.ENTITY_CACHE_ENABLED,
                        KumpulaDMPSImpl.class, kumpulaDMPS.getPrimaryKey()) == null) {
                cacheResult(kumpulaDMPS);
            } else {
                kumpulaDMPS.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all kumpula d m p ses.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(KumpulaDMPSImpl.class.getName());
        }

        EntityCacheUtil.clearCache(KumpulaDMPSImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the kumpula d m p s.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(KumpulaDMPS kumpulaDMPS) {
        EntityCacheUtil.removeResult(KumpulaDMPSModelImpl.ENTITY_CACHE_ENABLED,
            KumpulaDMPSImpl.class, kumpulaDMPS.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<KumpulaDMPS> kumpulaDMPSs) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (KumpulaDMPS kumpulaDMPS : kumpulaDMPSs) {
            EntityCacheUtil.removeResult(KumpulaDMPSModelImpl.ENTITY_CACHE_ENABLED,
                KumpulaDMPSImpl.class, kumpulaDMPS.getPrimaryKey());
        }
    }

    /**
     * Creates a new kumpula d m p s with the primary key. Does not add the kumpula d m p s to the database.
     *
     * @param samptime the primary key for the new kumpula d m p s
     * @return the new kumpula d m p s
     */
    @Override
    public KumpulaDMPS create(java.util.Date samptime) {
        KumpulaDMPS kumpulaDMPS = new KumpulaDMPSImpl();

        kumpulaDMPS.setNew(true);
        kumpulaDMPS.setPrimaryKey(samptime);

        return kumpulaDMPS;
    }

    /**
     * Removes the kumpula d m p s with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param samptime the primary key of the kumpula d m p s
     * @return the kumpula d m p s that was removed
     * @throws fi.csc.smear.db.NoSuchKumpulaDMPSException if a kumpula d m p s with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public KumpulaDMPS remove(java.util.Date samptime)
        throws NoSuchKumpulaDMPSException, SystemException {
        return remove((Serializable) samptime);
    }

    /**
     * Removes the kumpula d m p s with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the kumpula d m p s
     * @return the kumpula d m p s that was removed
     * @throws fi.csc.smear.db.NoSuchKumpulaDMPSException if a kumpula d m p s with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public KumpulaDMPS remove(Serializable primaryKey)
        throws NoSuchKumpulaDMPSException, SystemException {
        Session session = null;

        try {
            session = openSession();

            KumpulaDMPS kumpulaDMPS = (KumpulaDMPS) session.get(KumpulaDMPSImpl.class,
                    primaryKey);

            if (kumpulaDMPS == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchKumpulaDMPSException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(kumpulaDMPS);
        } catch (NoSuchKumpulaDMPSException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected KumpulaDMPS removeImpl(KumpulaDMPS kumpulaDMPS)
        throws SystemException {
        kumpulaDMPS = toUnwrappedModel(kumpulaDMPS);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(kumpulaDMPS)) {
                kumpulaDMPS = (KumpulaDMPS) session.get(KumpulaDMPSImpl.class,
                        kumpulaDMPS.getPrimaryKeyObj());
            }

            if (kumpulaDMPS != null) {
                session.delete(kumpulaDMPS);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (kumpulaDMPS != null) {
            clearCache(kumpulaDMPS);
        }

        return kumpulaDMPS;
    }

    @Override
    public KumpulaDMPS updateImpl(fi.csc.smear.db.model.KumpulaDMPS kumpulaDMPS)
        throws SystemException {
        kumpulaDMPS = toUnwrappedModel(kumpulaDMPS);

        boolean isNew = kumpulaDMPS.isNew();

        Session session = null;

        try {
            session = openSession();

            if (kumpulaDMPS.isNew()) {
                session.save(kumpulaDMPS);

                kumpulaDMPS.setNew(false);
            } else {
                session.merge(kumpulaDMPS);
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

        EntityCacheUtil.putResult(KumpulaDMPSModelImpl.ENTITY_CACHE_ENABLED,
            KumpulaDMPSImpl.class, kumpulaDMPS.getPrimaryKey(), kumpulaDMPS);

        return kumpulaDMPS;
    }

    protected KumpulaDMPS toUnwrappedModel(KumpulaDMPS kumpulaDMPS) {
        if (kumpulaDMPS instanceof KumpulaDMPSImpl) {
            return kumpulaDMPS;
        }

        KumpulaDMPSImpl kumpulaDMPSImpl = new KumpulaDMPSImpl();

        kumpulaDMPSImpl.setNew(kumpulaDMPS.isNew());
        kumpulaDMPSImpl.setPrimaryKey(kumpulaDMPS.getPrimaryKey());

        kumpulaDMPSImpl.setSamptime(kumpulaDMPS.getSamptime());
        kumpulaDMPSImpl.setT1(kumpulaDMPS.getT1());
        kumpulaDMPSImpl.setT2(kumpulaDMPS.getT2());
        kumpulaDMPSImpl.setP1(kumpulaDMPS.getP1());
        kumpulaDMPSImpl.setP2(kumpulaDMPS.getP2());
        kumpulaDMPSImpl.setRh1(kumpulaDMPS.getRh1());
        kumpulaDMPSImpl.setRh2(kumpulaDMPS.getRh2());
        kumpulaDMPSImpl.setD100e1(kumpulaDMPS.getD100e1());
        kumpulaDMPSImpl.setD112e1(kumpulaDMPS.getD112e1());
        kumpulaDMPSImpl.setD126e1(kumpulaDMPS.getD126e1());
        kumpulaDMPSImpl.setD141e1(kumpulaDMPS.getD141e1());
        kumpulaDMPSImpl.setD158e1(kumpulaDMPS.getD158e1());
        kumpulaDMPSImpl.setD178e1(kumpulaDMPS.getD178e1());
        kumpulaDMPSImpl.setD200e1(kumpulaDMPS.getD200e1());
        kumpulaDMPSImpl.setD224e1(kumpulaDMPS.getD224e1());
        kumpulaDMPSImpl.setD251e1(kumpulaDMPS.getD251e1());
        kumpulaDMPSImpl.setD282e1(kumpulaDMPS.getD282e1());
        kumpulaDMPSImpl.setD316e1(kumpulaDMPS.getD316e1());
        kumpulaDMPSImpl.setD355e1(kumpulaDMPS.getD355e1());
        kumpulaDMPSImpl.setD398e1(kumpulaDMPS.getD398e1());
        kumpulaDMPSImpl.setD447e1(kumpulaDMPS.getD447e1());
        kumpulaDMPSImpl.setD501e1(kumpulaDMPS.getD501e1());
        kumpulaDMPSImpl.setD562e1(kumpulaDMPS.getD562e1());
        kumpulaDMPSImpl.setD631e1(kumpulaDMPS.getD631e1());
        kumpulaDMPSImpl.setD708e1(kumpulaDMPS.getD708e1());
        kumpulaDMPSImpl.setD794e1(kumpulaDMPS.getD794e1());
        kumpulaDMPSImpl.setD891e1(kumpulaDMPS.getD891e1());
        kumpulaDMPSImpl.setD100e2(kumpulaDMPS.getD100e2());
        kumpulaDMPSImpl.setD112e2(kumpulaDMPS.getD112e2());
        kumpulaDMPSImpl.setD126e2(kumpulaDMPS.getD126e2());
        kumpulaDMPSImpl.setD141e2(kumpulaDMPS.getD141e2());
        kumpulaDMPSImpl.setD158e2(kumpulaDMPS.getD158e2());
        kumpulaDMPSImpl.setD178e2(kumpulaDMPS.getD178e2());
        kumpulaDMPSImpl.setD200e2(kumpulaDMPS.getD200e2());
        kumpulaDMPSImpl.setD224e2(kumpulaDMPS.getD224e2());
        kumpulaDMPSImpl.setD251e2(kumpulaDMPS.getD251e2());
        kumpulaDMPSImpl.setD282e2(kumpulaDMPS.getD282e2());
        kumpulaDMPSImpl.setD316e2(kumpulaDMPS.getD316e2());
        kumpulaDMPSImpl.setD355e2(kumpulaDMPS.getD355e2());
        kumpulaDMPSImpl.setD398e2(kumpulaDMPS.getD398e2());
        kumpulaDMPSImpl.setD447e2(kumpulaDMPS.getD447e2());
        kumpulaDMPSImpl.setD501e2(kumpulaDMPS.getD501e2());
        kumpulaDMPSImpl.setD562e2(kumpulaDMPS.getD562e2());
        kumpulaDMPSImpl.setD631e2(kumpulaDMPS.getD631e2());
        kumpulaDMPSImpl.setD708e2(kumpulaDMPS.getD708e2());
        kumpulaDMPSImpl.setD794e2(kumpulaDMPS.getD794e2());
        kumpulaDMPSImpl.setD891e2(kumpulaDMPS.getD891e2());
        kumpulaDMPSImpl.setD100e3(kumpulaDMPS.getD100e3());
        kumpulaDMPSImpl.setD112e3(kumpulaDMPS.getD112e3());
        kumpulaDMPSImpl.setD126e3(kumpulaDMPS.getD126e3());
        kumpulaDMPSImpl.setD141e3(kumpulaDMPS.getD141e3());
        kumpulaDMPSImpl.setD158e3(kumpulaDMPS.getD158e3());
        kumpulaDMPSImpl.setD178e3(kumpulaDMPS.getD178e3());
        kumpulaDMPSImpl.setD200e3(kumpulaDMPS.getD200e3());
        kumpulaDMPSImpl.setD224e3(kumpulaDMPS.getD224e3());
        kumpulaDMPSImpl.setD251e3(kumpulaDMPS.getD251e3());
        kumpulaDMPSImpl.setD282e3(kumpulaDMPS.getD282e3());
        kumpulaDMPSImpl.setD316e3(kumpulaDMPS.getD316e3());
        kumpulaDMPSImpl.setD355e3(kumpulaDMPS.getD355e3());
        kumpulaDMPSImpl.setD398e3(kumpulaDMPS.getD398e3());
        kumpulaDMPSImpl.setD447e3(kumpulaDMPS.getD447e3());
        kumpulaDMPSImpl.setD501e3(kumpulaDMPS.getD501e3());
        kumpulaDMPSImpl.setD562e3(kumpulaDMPS.getD562e3());
        kumpulaDMPSImpl.setD631e3(kumpulaDMPS.getD631e3());
        kumpulaDMPSImpl.setD708e3(kumpulaDMPS.getD708e3());
        kumpulaDMPSImpl.setD794e3(kumpulaDMPS.getD794e3());
        kumpulaDMPSImpl.setD891e3(kumpulaDMPS.getD891e3());
        kumpulaDMPSImpl.setD100e4(kumpulaDMPS.getD100e4());
        kumpulaDMPSImpl.setTconc(kumpulaDMPS.getTconc());

        return kumpulaDMPSImpl;
    }

    /**
     * Returns the kumpula d m p s with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the kumpula d m p s
     * @return the kumpula d m p s
     * @throws fi.csc.smear.db.NoSuchKumpulaDMPSException if a kumpula d m p s with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public KumpulaDMPS findByPrimaryKey(Serializable primaryKey)
        throws NoSuchKumpulaDMPSException, SystemException {
        KumpulaDMPS kumpulaDMPS = fetchByPrimaryKey(primaryKey);

        if (kumpulaDMPS == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchKumpulaDMPSException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return kumpulaDMPS;
    }

    /**
     * Returns the kumpula d m p s with the primary key or throws a {@link fi.csc.smear.db.NoSuchKumpulaDMPSException} if it could not be found.
     *
     * @param samptime the primary key of the kumpula d m p s
     * @return the kumpula d m p s
     * @throws fi.csc.smear.db.NoSuchKumpulaDMPSException if a kumpula d m p s with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public KumpulaDMPS findByPrimaryKey(java.util.Date samptime)
        throws NoSuchKumpulaDMPSException, SystemException {
        return findByPrimaryKey((Serializable) samptime);
    }

    /**
     * Returns the kumpula d m p s with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the kumpula d m p s
     * @return the kumpula d m p s, or <code>null</code> if a kumpula d m p s with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public KumpulaDMPS fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        KumpulaDMPS kumpulaDMPS = (KumpulaDMPS) EntityCacheUtil.getResult(KumpulaDMPSModelImpl.ENTITY_CACHE_ENABLED,
                KumpulaDMPSImpl.class, primaryKey);

        if (kumpulaDMPS == _nullKumpulaDMPS) {
            return null;
        }

        if (kumpulaDMPS == null) {
            Session session = null;

            try {
                session = openSession();

                kumpulaDMPS = (KumpulaDMPS) session.get(KumpulaDMPSImpl.class,
                        primaryKey);

                if (kumpulaDMPS != null) {
                    cacheResult(kumpulaDMPS);
                } else {
                    EntityCacheUtil.putResult(KumpulaDMPSModelImpl.ENTITY_CACHE_ENABLED,
                        KumpulaDMPSImpl.class, primaryKey, _nullKumpulaDMPS);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(KumpulaDMPSModelImpl.ENTITY_CACHE_ENABLED,
                    KumpulaDMPSImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return kumpulaDMPS;
    }

    /**
     * Returns the kumpula d m p s with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param samptime the primary key of the kumpula d m p s
     * @return the kumpula d m p s, or <code>null</code> if a kumpula d m p s with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public KumpulaDMPS fetchByPrimaryKey(java.util.Date samptime)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) samptime);
    }

    /**
     * Returns all the kumpula d m p ses.
     *
     * @return the kumpula d m p ses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<KumpulaDMPS> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the kumpula d m p ses.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.KumpulaDMPSModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of kumpula d m p ses
     * @param end the upper bound of the range of kumpula d m p ses (not inclusive)
     * @return the range of kumpula d m p ses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<KumpulaDMPS> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the kumpula d m p ses.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.KumpulaDMPSModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of kumpula d m p ses
     * @param end the upper bound of the range of kumpula d m p ses (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of kumpula d m p ses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<KumpulaDMPS> findAll(int start, int end,
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

        List<KumpulaDMPS> list = (List<KumpulaDMPS>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_KUMPULADMPS);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_KUMPULADMPS;

                if (pagination) {
                    sql = sql.concat(KumpulaDMPSModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<KumpulaDMPS>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<KumpulaDMPS>(list);
                } else {
                    list = (List<KumpulaDMPS>) QueryUtil.list(q, getDialect(),
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
     * Removes all the kumpula d m p ses from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (KumpulaDMPS kumpulaDMPS : findAll()) {
            remove(kumpulaDMPS);
        }
    }

    /**
     * Returns the number of kumpula d m p ses.
     *
     * @return the number of kumpula d m p ses
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

                Query q = session.createQuery(_SQL_COUNT_KUMPULADMPS);

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
     * Initializes the kumpula d m p s persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.fi.csc.smear.db.model.KumpulaDMPS")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<KumpulaDMPS>> listenersList = new ArrayList<ModelListener<KumpulaDMPS>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<KumpulaDMPS>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(KumpulaDMPSImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
