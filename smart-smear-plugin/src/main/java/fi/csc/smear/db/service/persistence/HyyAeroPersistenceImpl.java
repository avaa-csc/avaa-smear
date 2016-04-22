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

import fi.csc.smear.db.NoSuchHyyAeroException;
import fi.csc.smear.db.model.HyyAero;
import fi.csc.smear.db.model.impl.HyyAeroImpl;
import fi.csc.smear.db.model.impl.HyyAeroModelImpl;
import fi.csc.smear.db.service.persistence.HyyAeroPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the hyy aero service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author pj
 * @see HyyAeroPersistence
 * @see HyyAeroUtil
 * @generated
 */
public class HyyAeroPersistenceImpl extends BasePersistenceImpl<HyyAero>
    implements HyyAeroPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link HyyAeroUtil} to access the hyy aero persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = HyyAeroImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(HyyAeroModelImpl.ENTITY_CACHE_ENABLED,
            HyyAeroModelImpl.FINDER_CACHE_ENABLED, HyyAeroImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(HyyAeroModelImpl.ENTITY_CACHE_ENABLED,
            HyyAeroModelImpl.FINDER_CACHE_ENABLED, HyyAeroImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(HyyAeroModelImpl.ENTITY_CACHE_ENABLED,
            HyyAeroModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_HYYAERO = "SELECT hyyAero FROM HyyAero hyyAero";
    private static final String _SQL_COUNT_HYYAERO = "SELECT COUNT(hyyAero) FROM HyyAero hyyAero";
    private static final String _ORDER_BY_ENTITY_ALIAS = "hyyAero.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No HyyAero exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(HyyAeroPersistenceImpl.class);
    private static HyyAero _nullHyyAero = new HyyAeroImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<HyyAero> toCacheModel() {
                return _nullHyyAeroCacheModel;
            }
        };

    private static CacheModel<HyyAero> _nullHyyAeroCacheModel = new CacheModel<HyyAero>() {
            @Override
            public HyyAero toEntityModel() {
                return _nullHyyAero;
            }
        };

    public HyyAeroPersistenceImpl() {
        setModelClass(HyyAero.class);
    }

    /**
     * Caches the hyy aero in the entity cache if it is enabled.
     *
     * @param hyyAero the hyy aero
     */
    @Override
    public void cacheResult(HyyAero hyyAero) {
        EntityCacheUtil.putResult(HyyAeroModelImpl.ENTITY_CACHE_ENABLED,
            HyyAeroImpl.class, hyyAero.getPrimaryKey(), hyyAero);

        hyyAero.resetOriginalValues();
    }

    /**
     * Caches the hyy aeros in the entity cache if it is enabled.
     *
     * @param hyyAeros the hyy aeros
     */
    @Override
    public void cacheResult(List<HyyAero> hyyAeros) {
        for (HyyAero hyyAero : hyyAeros) {
            if (EntityCacheUtil.getResult(
                        HyyAeroModelImpl.ENTITY_CACHE_ENABLED,
                        HyyAeroImpl.class, hyyAero.getPrimaryKey()) == null) {
                cacheResult(hyyAero);
            } else {
                hyyAero.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all hyy aeros.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(HyyAeroImpl.class.getName());
        }

        EntityCacheUtil.clearCache(HyyAeroImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the hyy aero.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(HyyAero hyyAero) {
        EntityCacheUtil.removeResult(HyyAeroModelImpl.ENTITY_CACHE_ENABLED,
            HyyAeroImpl.class, hyyAero.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<HyyAero> hyyAeros) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (HyyAero hyyAero : hyyAeros) {
            EntityCacheUtil.removeResult(HyyAeroModelImpl.ENTITY_CACHE_ENABLED,
                HyyAeroImpl.class, hyyAero.getPrimaryKey());
        }
    }

    /**
     * Creates a new hyy aero with the primary key. Does not add the hyy aero to the database.
     *
     * @param samptime the primary key for the new hyy aero
     * @return the new hyy aero
     */
    @Override
    public HyyAero create(java.util.Date samptime) {
        HyyAero hyyAero = new HyyAeroImpl();

        hyyAero.setNew(true);
        hyyAero.setPrimaryKey(samptime);

        return hyyAero;
    }

    /**
     * Removes the hyy aero with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param samptime the primary key of the hyy aero
     * @return the hyy aero that was removed
     * @throws fi.csc.smear.db.NoSuchHyyAeroException if a hyy aero with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public HyyAero remove(java.util.Date samptime)
        throws NoSuchHyyAeroException, SystemException {
        return remove((Serializable) samptime);
    }

    /**
     * Removes the hyy aero with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the hyy aero
     * @return the hyy aero that was removed
     * @throws fi.csc.smear.db.NoSuchHyyAeroException if a hyy aero with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public HyyAero remove(Serializable primaryKey)
        throws NoSuchHyyAeroException, SystemException {
        Session session = null;

        try {
            session = openSession();

            HyyAero hyyAero = (HyyAero) session.get(HyyAeroImpl.class,
                    primaryKey);

            if (hyyAero == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchHyyAeroException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(hyyAero);
        } catch (NoSuchHyyAeroException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected HyyAero removeImpl(HyyAero hyyAero) throws SystemException {
        hyyAero = toUnwrappedModel(hyyAero);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(hyyAero)) {
                hyyAero = (HyyAero) session.get(HyyAeroImpl.class,
                        hyyAero.getPrimaryKeyObj());
            }

            if (hyyAero != null) {
                session.delete(hyyAero);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (hyyAero != null) {
            clearCache(hyyAero);
        }

        return hyyAero;
    }

    @Override
    public HyyAero updateImpl(fi.csc.smear.db.model.HyyAero hyyAero)
        throws SystemException {
        hyyAero = toUnwrappedModel(hyyAero);

        boolean isNew = hyyAero.isNew();

        Session session = null;

        try {
            session = openSession();

            if (hyyAero.isNew()) {
                session.save(hyyAero);

                hyyAero.setNew(false);
            } else {
                session.merge(hyyAero);
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

        EntityCacheUtil.putResult(HyyAeroModelImpl.ENTITY_CACHE_ENABLED,
            HyyAeroImpl.class, hyyAero.getPrimaryKey(), hyyAero);

        return hyyAero;
    }

    protected HyyAero toUnwrappedModel(HyyAero hyyAero) {
        if (hyyAero instanceof HyyAeroImpl) {
            return hyyAero;
        }

        HyyAeroImpl hyyAeroImpl = new HyyAeroImpl();

        hyyAeroImpl.setNew(hyyAero.isNew());
        hyyAeroImpl.setPrimaryKey(hyyAero.getPrimaryKey());

        hyyAeroImpl.setSamptime(hyyAero.getSamptime());
        hyyAeroImpl.setCn(hyyAero.getCn());
        hyyAeroImpl.setCn_t(hyyAero.getCn_t());
        hyyAeroImpl.setCn_p(hyyAero.getCn_p());

        return hyyAeroImpl;
    }

    /**
     * Returns the hyy aero with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the hyy aero
     * @return the hyy aero
     * @throws fi.csc.smear.db.NoSuchHyyAeroException if a hyy aero with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public HyyAero findByPrimaryKey(Serializable primaryKey)
        throws NoSuchHyyAeroException, SystemException {
        HyyAero hyyAero = fetchByPrimaryKey(primaryKey);

        if (hyyAero == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchHyyAeroException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return hyyAero;
    }

    /**
     * Returns the hyy aero with the primary key or throws a {@link fi.csc.smear.db.NoSuchHyyAeroException} if it could not be found.
     *
     * @param samptime the primary key of the hyy aero
     * @return the hyy aero
     * @throws fi.csc.smear.db.NoSuchHyyAeroException if a hyy aero with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public HyyAero findByPrimaryKey(java.util.Date samptime)
        throws NoSuchHyyAeroException, SystemException {
        return findByPrimaryKey((Serializable) samptime);
    }

    /**
     * Returns the hyy aero with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the hyy aero
     * @return the hyy aero, or <code>null</code> if a hyy aero with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public HyyAero fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        HyyAero hyyAero = (HyyAero) EntityCacheUtil.getResult(HyyAeroModelImpl.ENTITY_CACHE_ENABLED,
                HyyAeroImpl.class, primaryKey);

        if (hyyAero == _nullHyyAero) {
            return null;
        }

        if (hyyAero == null) {
            Session session = null;

            try {
                session = openSession();

                hyyAero = (HyyAero) session.get(HyyAeroImpl.class, primaryKey);

                if (hyyAero != null) {
                    cacheResult(hyyAero);
                } else {
                    EntityCacheUtil.putResult(HyyAeroModelImpl.ENTITY_CACHE_ENABLED,
                        HyyAeroImpl.class, primaryKey, _nullHyyAero);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(HyyAeroModelImpl.ENTITY_CACHE_ENABLED,
                    HyyAeroImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return hyyAero;
    }

    /**
     * Returns the hyy aero with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param samptime the primary key of the hyy aero
     * @return the hyy aero, or <code>null</code> if a hyy aero with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public HyyAero fetchByPrimaryKey(java.util.Date samptime)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) samptime);
    }

    /**
     * Returns all the hyy aeros.
     *
     * @return the hyy aeros
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<HyyAero> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the hyy aeros.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.HyyAeroModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of hyy aeros
     * @param end the upper bound of the range of hyy aeros (not inclusive)
     * @return the range of hyy aeros
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<HyyAero> findAll(int start, int end) throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the hyy aeros.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.HyyAeroModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of hyy aeros
     * @param end the upper bound of the range of hyy aeros (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of hyy aeros
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<HyyAero> findAll(int start, int end,
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

        List<HyyAero> list = (List<HyyAero>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_HYYAERO);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_HYYAERO;

                if (pagination) {
                    sql = sql.concat(HyyAeroModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<HyyAero>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<HyyAero>(list);
                } else {
                    list = (List<HyyAero>) QueryUtil.list(q, getDialect(),
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
     * Removes all the hyy aeros from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (HyyAero hyyAero : findAll()) {
            remove(hyyAero);
        }
    }

    /**
     * Returns the number of hyy aeros.
     *
     * @return the number of hyy aeros
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

                Query q = session.createQuery(_SQL_COUNT_HYYAERO);

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
     * Initializes the hyy aero persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.fi.csc.smear.db.model.HyyAero")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<HyyAero>> listenersList = new ArrayList<ModelListener<HyyAero>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<HyyAero>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(HyyAeroImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
