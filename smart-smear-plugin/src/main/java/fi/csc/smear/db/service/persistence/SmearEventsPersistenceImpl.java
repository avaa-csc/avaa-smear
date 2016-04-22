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

import fi.csc.smear.db.NoSuchEventsException;
import fi.csc.smear.db.model.SmearEvents;
import fi.csc.smear.db.model.impl.SmearEventsImpl;
import fi.csc.smear.db.model.impl.SmearEventsModelImpl;
import fi.csc.smear.db.service.persistence.SmearEventsPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the smear events service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author pj
 * @see SmearEventsPersistence
 * @see SmearEventsUtil
 * @generated
 */
public class SmearEventsPersistenceImpl extends BasePersistenceImpl<SmearEvents>
    implements SmearEventsPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link SmearEventsUtil} to access the smear events persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = SmearEventsImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(SmearEventsModelImpl.ENTITY_CACHE_ENABLED,
            SmearEventsModelImpl.FINDER_CACHE_ENABLED, SmearEventsImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(SmearEventsModelImpl.ENTITY_CACHE_ENABLED,
            SmearEventsModelImpl.FINDER_CACHE_ENABLED, SmearEventsImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(SmearEventsModelImpl.ENTITY_CACHE_ENABLED,
            SmearEventsModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_SMEAREVENTS = "SELECT smearEvents FROM SmearEvents smearEvents";
    private static final String _SQL_COUNT_SMEAREVENTS = "SELECT COUNT(smearEvents) FROM SmearEvents smearEvents";
    private static final String _ORDER_BY_ENTITY_ALIAS = "smearEvents.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No SmearEvents exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(SmearEventsPersistenceImpl.class);
    private static SmearEvents _nullSmearEvents = new SmearEventsImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<SmearEvents> toCacheModel() {
                return _nullSmearEventsCacheModel;
            }
        };

    private static CacheModel<SmearEvents> _nullSmearEventsCacheModel = new CacheModel<SmearEvents>() {
            @Override
            public SmearEvents toEntityModel() {
                return _nullSmearEvents;
            }
        };

    public SmearEventsPersistenceImpl() {
        setModelClass(SmearEvents.class);
    }

    /**
     * Caches the smear events in the entity cache if it is enabled.
     *
     * @param smearEvents the smear events
     */
    @Override
    public void cacheResult(SmearEvents smearEvents) {
        EntityCacheUtil.putResult(SmearEventsModelImpl.ENTITY_CACHE_ENABLED,
            SmearEventsImpl.class, smearEvents.getPrimaryKey(), smearEvents);

        smearEvents.resetOriginalValues();
    }

    /**
     * Caches the smear eventses in the entity cache if it is enabled.
     *
     * @param smearEventses the smear eventses
     */
    @Override
    public void cacheResult(List<SmearEvents> smearEventses) {
        for (SmearEvents smearEvents : smearEventses) {
            if (EntityCacheUtil.getResult(
                        SmearEventsModelImpl.ENTITY_CACHE_ENABLED,
                        SmearEventsImpl.class, smearEvents.getPrimaryKey()) == null) {
                cacheResult(smearEvents);
            } else {
                smearEvents.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all smear eventses.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(SmearEventsImpl.class.getName());
        }

        EntityCacheUtil.clearCache(SmearEventsImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the smear events.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(SmearEvents smearEvents) {
        EntityCacheUtil.removeResult(SmearEventsModelImpl.ENTITY_CACHE_ENABLED,
            SmearEventsImpl.class, smearEvents.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<SmearEvents> smearEventses) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (SmearEvents smearEvents : smearEventses) {
            EntityCacheUtil.removeResult(SmearEventsModelImpl.ENTITY_CACHE_ENABLED,
                SmearEventsImpl.class, smearEvents.getPrimaryKey());
        }
    }

    /**
     * Creates a new smear events with the primary key. Does not add the smear events to the database.
     *
     * @param eventID the primary key for the new smear events
     * @return the new smear events
     */
    @Override
    public SmearEvents create(long eventID) {
        SmearEvents smearEvents = new SmearEventsImpl();

        smearEvents.setNew(true);
        smearEvents.setPrimaryKey(eventID);

        return smearEvents;
    }

    /**
     * Removes the smear events with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param eventID the primary key of the smear events
     * @return the smear events that was removed
     * @throws fi.csc.smear.db.NoSuchEventsException if a smear events with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SmearEvents remove(long eventID)
        throws NoSuchEventsException, SystemException {
        return remove((Serializable) eventID);
    }

    /**
     * Removes the smear events with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the smear events
     * @return the smear events that was removed
     * @throws fi.csc.smear.db.NoSuchEventsException if a smear events with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SmearEvents remove(Serializable primaryKey)
        throws NoSuchEventsException, SystemException {
        Session session = null;

        try {
            session = openSession();

            SmearEvents smearEvents = (SmearEvents) session.get(SmearEventsImpl.class,
                    primaryKey);

            if (smearEvents == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchEventsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(smearEvents);
        } catch (NoSuchEventsException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected SmearEvents removeImpl(SmearEvents smearEvents)
        throws SystemException {
        smearEvents = toUnwrappedModel(smearEvents);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(smearEvents)) {
                smearEvents = (SmearEvents) session.get(SmearEventsImpl.class,
                        smearEvents.getPrimaryKeyObj());
            }

            if (smearEvents != null) {
                session.delete(smearEvents);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (smearEvents != null) {
            clearCache(smearEvents);
        }

        return smearEvents;
    }

    @Override
    public SmearEvents updateImpl(fi.csc.smear.db.model.SmearEvents smearEvents)
        throws SystemException {
        smearEvents = toUnwrappedModel(smearEvents);

        boolean isNew = smearEvents.isNew();

        Session session = null;

        try {
            session = openSession();

            if (smearEvents.isNew()) {
                session.save(smearEvents);

                smearEvents.setNew(false);
            } else {
                session.merge(smearEvents);
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

        EntityCacheUtil.putResult(SmearEventsModelImpl.ENTITY_CACHE_ENABLED,
            SmearEventsImpl.class, smearEvents.getPrimaryKey(), smearEvents);

        return smearEvents;
    }

    protected SmearEvents toUnwrappedModel(SmearEvents smearEvents) {
        if (smearEvents instanceof SmearEventsImpl) {
            return smearEvents;
        }

        SmearEventsImpl smearEventsImpl = new SmearEventsImpl();

        smearEventsImpl.setNew(smearEvents.isNew());
        smearEventsImpl.setPrimaryKey(smearEvents.getPrimaryKey());

        smearEventsImpl.setEventID(smearEvents.getEventID());
        smearEventsImpl.setEvent_type(smearEvents.getEvent_type());
        smearEventsImpl.setEvent(smearEvents.getEvent());
        smearEventsImpl.setWho(smearEvents.getWho());
        smearEventsImpl.setPeriod_start(smearEvents.getPeriod_start());
        smearEventsImpl.setPeriod_end(smearEvents.getPeriod_end());
        smearEventsImpl.setEtimestamp(smearEvents.getEtimestamp());

        return smearEventsImpl;
    }

    /**
     * Returns the smear events with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the smear events
     * @return the smear events
     * @throws fi.csc.smear.db.NoSuchEventsException if a smear events with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SmearEvents findByPrimaryKey(Serializable primaryKey)
        throws NoSuchEventsException, SystemException {
        SmearEvents smearEvents = fetchByPrimaryKey(primaryKey);

        if (smearEvents == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchEventsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return smearEvents;
    }

    /**
     * Returns the smear events with the primary key or throws a {@link fi.csc.smear.db.NoSuchEventsException} if it could not be found.
     *
     * @param eventID the primary key of the smear events
     * @return the smear events
     * @throws fi.csc.smear.db.NoSuchEventsException if a smear events with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SmearEvents findByPrimaryKey(long eventID)
        throws NoSuchEventsException, SystemException {
        return findByPrimaryKey((Serializable) eventID);
    }

    /**
     * Returns the smear events with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the smear events
     * @return the smear events, or <code>null</code> if a smear events with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SmearEvents fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        SmearEvents smearEvents = (SmearEvents) EntityCacheUtil.getResult(SmearEventsModelImpl.ENTITY_CACHE_ENABLED,
                SmearEventsImpl.class, primaryKey);

        if (smearEvents == _nullSmearEvents) {
            return null;
        }

        if (smearEvents == null) {
            Session session = null;

            try {
                session = openSession();

                smearEvents = (SmearEvents) session.get(SmearEventsImpl.class,
                        primaryKey);

                if (smearEvents != null) {
                    cacheResult(smearEvents);
                } else {
                    EntityCacheUtil.putResult(SmearEventsModelImpl.ENTITY_CACHE_ENABLED,
                        SmearEventsImpl.class, primaryKey, _nullSmearEvents);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(SmearEventsModelImpl.ENTITY_CACHE_ENABLED,
                    SmearEventsImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return smearEvents;
    }

    /**
     * Returns the smear events with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param eventID the primary key of the smear events
     * @return the smear events, or <code>null</code> if a smear events with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SmearEvents fetchByPrimaryKey(long eventID)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) eventID);
    }

    /**
     * Returns all the smear eventses.
     *
     * @return the smear eventses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<SmearEvents> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the smear eventses.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.SmearEventsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of smear eventses
     * @param end the upper bound of the range of smear eventses (not inclusive)
     * @return the range of smear eventses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<SmearEvents> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the smear eventses.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.SmearEventsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of smear eventses
     * @param end the upper bound of the range of smear eventses (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of smear eventses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<SmearEvents> findAll(int start, int end,
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

        List<SmearEvents> list = (List<SmearEvents>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_SMEAREVENTS);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_SMEAREVENTS;

                if (pagination) {
                    sql = sql.concat(SmearEventsModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<SmearEvents>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<SmearEvents>(list);
                } else {
                    list = (List<SmearEvents>) QueryUtil.list(q, getDialect(),
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
     * Removes all the smear eventses from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (SmearEvents smearEvents : findAll()) {
            remove(smearEvents);
        }
    }

    /**
     * Returns the number of smear eventses.
     *
     * @return the number of smear eventses
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

                Query q = session.createQuery(_SQL_COUNT_SMEAREVENTS);

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
     * Initializes the smear events persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.fi.csc.smear.db.model.SmearEvents")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<SmearEvents>> listenersList = new ArrayList<ModelListener<SmearEvents>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<SmearEvents>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(SmearEventsImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
