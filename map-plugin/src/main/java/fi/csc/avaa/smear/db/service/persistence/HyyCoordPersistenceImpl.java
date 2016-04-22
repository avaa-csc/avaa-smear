package fi.csc.avaa.smear.db.service.persistence;

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

import fi.csc.avaa.smear.db.NoSuchHyyCoordException;
import fi.csc.avaa.smear.db.model.HyyCoord;
import fi.csc.avaa.smear.db.model.impl.HyyCoordImpl;
import fi.csc.avaa.smear.db.model.impl.HyyCoordModelImpl;
import fi.csc.avaa.smear.db.service.persistence.HyyCoordPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the hyy coord service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author tkantola
 * @see HyyCoordPersistence
 * @see HyyCoordUtil
 * @generated
 */
public class HyyCoordPersistenceImpl extends BasePersistenceImpl<HyyCoord>
    implements HyyCoordPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link HyyCoordUtil} to access the hyy coord persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = HyyCoordImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(HyyCoordModelImpl.ENTITY_CACHE_ENABLED,
            HyyCoordModelImpl.FINDER_CACHE_ENABLED, HyyCoordImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(HyyCoordModelImpl.ENTITY_CACHE_ENABLED,
            HyyCoordModelImpl.FINDER_CACHE_ENABLED, HyyCoordImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(HyyCoordModelImpl.ENTITY_CACHE_ENABLED,
            HyyCoordModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_HYYCOORD = "SELECT hyyCoord FROM HyyCoord hyyCoord";
    private static final String _SQL_COUNT_HYYCOORD = "SELECT COUNT(hyyCoord) FROM HyyCoord hyyCoord";
    private static final String _ORDER_BY_ENTITY_ALIAS = "hyyCoord.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No HyyCoord exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(HyyCoordPersistenceImpl.class);
    private static HyyCoord _nullHyyCoord = new HyyCoordImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<HyyCoord> toCacheModel() {
                return _nullHyyCoordCacheModel;
            }
        };

    private static CacheModel<HyyCoord> _nullHyyCoordCacheModel = new CacheModel<HyyCoord>() {
            @Override
            public HyyCoord toEntityModel() {
                return _nullHyyCoord;
            }
        };

    public HyyCoordPersistenceImpl() {
        setModelClass(HyyCoord.class);
    }

    /**
     * Caches the hyy coord in the entity cache if it is enabled.
     *
     * @param hyyCoord the hyy coord
     */
    @Override
    public void cacheResult(HyyCoord hyyCoord) {
        EntityCacheUtil.putResult(HyyCoordModelImpl.ENTITY_CACHE_ENABLED,
            HyyCoordImpl.class, hyyCoord.getPrimaryKey(), hyyCoord);

        hyyCoord.resetOriginalValues();
    }

    /**
     * Caches the hyy coords in the entity cache if it is enabled.
     *
     * @param hyyCoords the hyy coords
     */
    @Override
    public void cacheResult(List<HyyCoord> hyyCoords) {
        for (HyyCoord hyyCoord : hyyCoords) {
            if (EntityCacheUtil.getResult(
                        HyyCoordModelImpl.ENTITY_CACHE_ENABLED,
                        HyyCoordImpl.class, hyyCoord.getPrimaryKey()) == null) {
                cacheResult(hyyCoord);
            } else {
                hyyCoord.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all hyy coords.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(HyyCoordImpl.class.getName());
        }

        EntityCacheUtil.clearCache(HyyCoordImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the hyy coord.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(HyyCoord hyyCoord) {
        EntityCacheUtil.removeResult(HyyCoordModelImpl.ENTITY_CACHE_ENABLED,
            HyyCoordImpl.class, hyyCoord.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<HyyCoord> hyyCoords) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (HyyCoord hyyCoord : hyyCoords) {
            EntityCacheUtil.removeResult(HyyCoordModelImpl.ENTITY_CACHE_ENABLED,
                HyyCoordImpl.class, hyyCoord.getPrimaryKey());
        }
    }

    /**
     * Creates a new hyy coord with the primary key. Does not add the hyy coord to the database.
     *
     * @param arrTimeID the primary key for the new hyy coord
     * @return the new hyy coord
     */
    @Override
    public HyyCoord create(long arrTimeID) {
        HyyCoord hyyCoord = new HyyCoordImpl();

        hyyCoord.setNew(true);
        hyyCoord.setPrimaryKey(arrTimeID);

        return hyyCoord;
    }

    /**
     * Removes the hyy coord with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param arrTimeID the primary key of the hyy coord
     * @return the hyy coord that was removed
     * @throws fi.csc.avaa.smear.db.NoSuchHyyCoordException if a hyy coord with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public HyyCoord remove(long arrTimeID)
        throws NoSuchHyyCoordException, SystemException {
        return remove((Serializable) arrTimeID);
    }

    /**
     * Removes the hyy coord with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the hyy coord
     * @return the hyy coord that was removed
     * @throws fi.csc.avaa.smear.db.NoSuchHyyCoordException if a hyy coord with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public HyyCoord remove(Serializable primaryKey)
        throws NoSuchHyyCoordException, SystemException {
        Session session = null;

        try {
            session = openSession();

            HyyCoord hyyCoord = (HyyCoord) session.get(HyyCoordImpl.class,
                    primaryKey);

            if (hyyCoord == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchHyyCoordException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(hyyCoord);
        } catch (NoSuchHyyCoordException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected HyyCoord removeImpl(HyyCoord hyyCoord) throws SystemException {
        hyyCoord = toUnwrappedModel(hyyCoord);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(hyyCoord)) {
                hyyCoord = (HyyCoord) session.get(HyyCoordImpl.class,
                        hyyCoord.getPrimaryKeyObj());
            }

            if (hyyCoord != null) {
                session.delete(hyyCoord);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (hyyCoord != null) {
            clearCache(hyyCoord);
        }

        return hyyCoord;
    }

    @Override
    public HyyCoord updateImpl(fi.csc.avaa.smear.db.model.HyyCoord hyyCoord)
        throws SystemException {
        hyyCoord = toUnwrappedModel(hyyCoord);

        boolean isNew = hyyCoord.isNew();

        Session session = null;

        try {
            session = openSession();

            if (hyyCoord.isNew()) {
                session.save(hyyCoord);

                hyyCoord.setNew(false);
            } else {
                session.merge(hyyCoord);
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

        EntityCacheUtil.putResult(HyyCoordModelImpl.ENTITY_CACHE_ENABLED,
            HyyCoordImpl.class, hyyCoord.getPrimaryKey(), hyyCoord);

        return hyyCoord;
    }

    protected HyyCoord toUnwrappedModel(HyyCoord hyyCoord) {
        if (hyyCoord instanceof HyyCoordImpl) {
            return hyyCoord;
        }

        HyyCoordImpl hyyCoordImpl = new HyyCoordImpl();

        hyyCoordImpl.setNew(hyyCoord.isNew());
        hyyCoordImpl.setPrimaryKey(hyyCoord.getPrimaryKey());

        hyyCoordImpl.setArrTimeID(hyyCoord.getArrTimeID());
        hyyCoordImpl.setArrTime(hyyCoord.getArrTime());
        hyyCoordImpl.setMatTime(hyyCoord.getMatTime());
        hyyCoordImpl.setYear(hyyCoord.getYear());
        hyyCoordImpl.setMonth(hyyCoord.getMonth());
        hyyCoordImpl.setDay(hyyCoord.getDay());
        hyyCoordImpl.setHour(hyyCoord.getHour());
        hyyCoordImpl.setDoy(hyyCoord.getDoy());
        hyyCoordImpl.setBackTime(hyyCoord.getBackTime());
        hyyCoordImpl.setLat100(hyyCoord.getLat100());
        hyyCoordImpl.setLon100(hyyCoord.getLon100());
        hyyCoordImpl.setAlt100(hyyCoord.getAlt100());
        hyyCoordImpl.setAzim100(hyyCoord.getAzim100());
        hyyCoordImpl.setLat250(hyyCoord.getLat250());
        hyyCoordImpl.setLon250(hyyCoord.getLon250());
        hyyCoordImpl.setAlt250(hyyCoord.getAlt250());
        hyyCoordImpl.setAzim250(hyyCoord.getAzim250());
        hyyCoordImpl.setLat500(hyyCoord.getLat500());
        hyyCoordImpl.setLon500(hyyCoord.getLon500());
        hyyCoordImpl.setAlt500(hyyCoord.getAlt500());
        hyyCoordImpl.setAzim500(hyyCoord.getAzim500());

        return hyyCoordImpl;
    }

    /**
     * Returns the hyy coord with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the hyy coord
     * @return the hyy coord
     * @throws fi.csc.avaa.smear.db.NoSuchHyyCoordException if a hyy coord with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public HyyCoord findByPrimaryKey(Serializable primaryKey)
        throws NoSuchHyyCoordException, SystemException {
        HyyCoord hyyCoord = fetchByPrimaryKey(primaryKey);

        if (hyyCoord == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchHyyCoordException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return hyyCoord;
    }

    /**
     * Returns the hyy coord with the primary key or throws a {@link fi.csc.avaa.smear.db.NoSuchHyyCoordException} if it could not be found.
     *
     * @param arrTimeID the primary key of the hyy coord
     * @return the hyy coord
     * @throws fi.csc.avaa.smear.db.NoSuchHyyCoordException if a hyy coord with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public HyyCoord findByPrimaryKey(long arrTimeID)
        throws NoSuchHyyCoordException, SystemException {
        return findByPrimaryKey((Serializable) arrTimeID);
    }

    /**
     * Returns the hyy coord with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the hyy coord
     * @return the hyy coord, or <code>null</code> if a hyy coord with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public HyyCoord fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        HyyCoord hyyCoord = (HyyCoord) EntityCacheUtil.getResult(HyyCoordModelImpl.ENTITY_CACHE_ENABLED,
                HyyCoordImpl.class, primaryKey);

        if (hyyCoord == _nullHyyCoord) {
            return null;
        }

        if (hyyCoord == null) {
            Session session = null;

            try {
                session = openSession();

                hyyCoord = (HyyCoord) session.get(HyyCoordImpl.class, primaryKey);

                if (hyyCoord != null) {
                    cacheResult(hyyCoord);
                } else {
                    EntityCacheUtil.putResult(HyyCoordModelImpl.ENTITY_CACHE_ENABLED,
                        HyyCoordImpl.class, primaryKey, _nullHyyCoord);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(HyyCoordModelImpl.ENTITY_CACHE_ENABLED,
                    HyyCoordImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return hyyCoord;
    }

    /**
     * Returns the hyy coord with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param arrTimeID the primary key of the hyy coord
     * @return the hyy coord, or <code>null</code> if a hyy coord with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public HyyCoord fetchByPrimaryKey(long arrTimeID) throws SystemException {
        return fetchByPrimaryKey((Serializable) arrTimeID);
    }

    /**
     * Returns all the hyy coords.
     *
     * @return the hyy coords
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<HyyCoord> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the hyy coords.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.smear.db.model.impl.HyyCoordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of hyy coords
     * @param end the upper bound of the range of hyy coords (not inclusive)
     * @return the range of hyy coords
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<HyyCoord> findAll(int start, int end) throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the hyy coords.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.smear.db.model.impl.HyyCoordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of hyy coords
     * @param end the upper bound of the range of hyy coords (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of hyy coords
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<HyyCoord> findAll(int start, int end,
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

        List<HyyCoord> list = (List<HyyCoord>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_HYYCOORD);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_HYYCOORD;

                if (pagination) {
                    sql = sql.concat(HyyCoordModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<HyyCoord>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<HyyCoord>(list);
                } else {
                    list = (List<HyyCoord>) QueryUtil.list(q, getDialect(),
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
     * Removes all the hyy coords from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (HyyCoord hyyCoord : findAll()) {
            remove(hyyCoord);
        }
    }

    /**
     * Returns the number of hyy coords.
     *
     * @return the number of hyy coords
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

                Query q = session.createQuery(_SQL_COUNT_HYYCOORD);

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
     * Initializes the hyy coord persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.fi.csc.avaa.smear.db.model.HyyCoord")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<HyyCoord>> listenersList = new ArrayList<ModelListener<HyyCoord>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<HyyCoord>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(HyyCoordImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
