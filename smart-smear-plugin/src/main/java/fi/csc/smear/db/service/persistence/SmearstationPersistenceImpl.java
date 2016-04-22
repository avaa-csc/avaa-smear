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

import fi.csc.smear.db.NoSuchstationException;
import fi.csc.smear.db.model.Smearstation;
import fi.csc.smear.db.model.impl.SmearstationImpl;
import fi.csc.smear.db.model.impl.SmearstationModelImpl;
import fi.csc.smear.db.service.persistence.SmearstationPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the smearstation service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author pj
 * @see SmearstationPersistence
 * @see SmearstationUtil
 * @generated
 */
public class SmearstationPersistenceImpl extends BasePersistenceImpl<Smearstation>
    implements SmearstationPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link SmearstationUtil} to access the smearstation persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = SmearstationImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(SmearstationModelImpl.ENTITY_CACHE_ENABLED,
            SmearstationModelImpl.FINDER_CACHE_ENABLED, SmearstationImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(SmearstationModelImpl.ENTITY_CACHE_ENABLED,
            SmearstationModelImpl.FINDER_CACHE_ENABLED, SmearstationImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(SmearstationModelImpl.ENTITY_CACHE_ENABLED,
            SmearstationModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_SMEARSTATION = "SELECT smearstation FROM Smearstation smearstation";
    private static final String _SQL_COUNT_SMEARSTATION = "SELECT COUNT(smearstation) FROM Smearstation smearstation";
    private static final String _ORDER_BY_ENTITY_ALIAS = "smearstation.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Smearstation exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(SmearstationPersistenceImpl.class);
    private static Smearstation _nullSmearstation = new SmearstationImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Smearstation> toCacheModel() {
                return _nullSmearstationCacheModel;
            }
        };

    private static CacheModel<Smearstation> _nullSmearstationCacheModel = new CacheModel<Smearstation>() {
            @Override
            public Smearstation toEntityModel() {
                return _nullSmearstation;
            }
        };

    public SmearstationPersistenceImpl() {
        setModelClass(Smearstation.class);
    }

    /**
     * Caches the smearstation in the entity cache if it is enabled.
     *
     * @param smearstation the smearstation
     */
    @Override
    public void cacheResult(Smearstation smearstation) {
        EntityCacheUtil.putResult(SmearstationModelImpl.ENTITY_CACHE_ENABLED,
            SmearstationImpl.class, smearstation.getPrimaryKey(), smearstation);

        smearstation.resetOriginalValues();
    }

    /**
     * Caches the smearstations in the entity cache if it is enabled.
     *
     * @param smearstations the smearstations
     */
    @Override
    public void cacheResult(List<Smearstation> smearstations) {
        for (Smearstation smearstation : smearstations) {
            if (EntityCacheUtil.getResult(
                        SmearstationModelImpl.ENTITY_CACHE_ENABLED,
                        SmearstationImpl.class, smearstation.getPrimaryKey()) == null) {
                cacheResult(smearstation);
            } else {
                smearstation.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all smearstations.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(SmearstationImpl.class.getName());
        }

        EntityCacheUtil.clearCache(SmearstationImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the smearstation.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Smearstation smearstation) {
        EntityCacheUtil.removeResult(SmearstationModelImpl.ENTITY_CACHE_ENABLED,
            SmearstationImpl.class, smearstation.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<Smearstation> smearstations) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Smearstation smearstation : smearstations) {
            EntityCacheUtil.removeResult(SmearstationModelImpl.ENTITY_CACHE_ENABLED,
                SmearstationImpl.class, smearstation.getPrimaryKey());
        }
    }

    /**
     * Creates a new smearstation with the primary key. Does not add the smearstation to the database.
     *
     * @param stationID the primary key for the new smearstation
     * @return the new smearstation
     */
    @Override
    public Smearstation create(long stationID) {
        Smearstation smearstation = new SmearstationImpl();

        smearstation.setNew(true);
        smearstation.setPrimaryKey(stationID);

        return smearstation;
    }

    /**
     * Removes the smearstation with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param stationID the primary key of the smearstation
     * @return the smearstation that was removed
     * @throws fi.csc.smear.db.NoSuchstationException if a smearstation with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Smearstation remove(long stationID)
        throws NoSuchstationException, SystemException {
        return remove((Serializable) stationID);
    }

    /**
     * Removes the smearstation with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the smearstation
     * @return the smearstation that was removed
     * @throws fi.csc.smear.db.NoSuchstationException if a smearstation with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Smearstation remove(Serializable primaryKey)
        throws NoSuchstationException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Smearstation smearstation = (Smearstation) session.get(SmearstationImpl.class,
                    primaryKey);

            if (smearstation == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchstationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(smearstation);
        } catch (NoSuchstationException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Smearstation removeImpl(Smearstation smearstation)
        throws SystemException {
        smearstation = toUnwrappedModel(smearstation);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(smearstation)) {
                smearstation = (Smearstation) session.get(SmearstationImpl.class,
                        smearstation.getPrimaryKeyObj());
            }

            if (smearstation != null) {
                session.delete(smearstation);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (smearstation != null) {
            clearCache(smearstation);
        }

        return smearstation;
    }

    @Override
    public Smearstation updateImpl(
        fi.csc.smear.db.model.Smearstation smearstation)
        throws SystemException {
        smearstation = toUnwrappedModel(smearstation);

        boolean isNew = smearstation.isNew();

        Session session = null;

        try {
            session = openSession();

            if (smearstation.isNew()) {
                session.save(smearstation);

                smearstation.setNew(false);
            } else {
                session.merge(smearstation);
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

        EntityCacheUtil.putResult(SmearstationModelImpl.ENTITY_CACHE_ENABLED,
            SmearstationImpl.class, smearstation.getPrimaryKey(), smearstation);

        return smearstation;
    }

    protected Smearstation toUnwrappedModel(Smearstation smearstation) {
        if (smearstation instanceof SmearstationImpl) {
            return smearstation;
        }

        SmearstationImpl smearstationImpl = new SmearstationImpl();

        smearstationImpl.setNew(smearstation.isNew());
        smearstationImpl.setPrimaryKey(smearstation.getPrimaryKey());

        smearstationImpl.setStationID(smearstation.getStationID());
        smearstationImpl.setDcmipoint(smearstation.getDcmipoint());
        smearstationImpl.setName(smearstation.getName());
        smearstationImpl.setDataAvail(smearstation.isDataAvail());

        return smearstationImpl;
    }

    /**
     * Returns the smearstation with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the smearstation
     * @return the smearstation
     * @throws fi.csc.smear.db.NoSuchstationException if a smearstation with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Smearstation findByPrimaryKey(Serializable primaryKey)
        throws NoSuchstationException, SystemException {
        Smearstation smearstation = fetchByPrimaryKey(primaryKey);

        if (smearstation == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchstationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return smearstation;
    }

    /**
     * Returns the smearstation with the primary key or throws a {@link fi.csc.smear.db.NoSuchstationException} if it could not be found.
     *
     * @param stationID the primary key of the smearstation
     * @return the smearstation
     * @throws fi.csc.smear.db.NoSuchstationException if a smearstation with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Smearstation findByPrimaryKey(long stationID)
        throws NoSuchstationException, SystemException {
        return findByPrimaryKey((Serializable) stationID);
    }

    /**
     * Returns the smearstation with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the smearstation
     * @return the smearstation, or <code>null</code> if a smearstation with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Smearstation fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Smearstation smearstation = (Smearstation) EntityCacheUtil.getResult(SmearstationModelImpl.ENTITY_CACHE_ENABLED,
                SmearstationImpl.class, primaryKey);

        if (smearstation == _nullSmearstation) {
            return null;
        }

        if (smearstation == null) {
            Session session = null;

            try {
                session = openSession();

                smearstation = (Smearstation) session.get(SmearstationImpl.class,
                        primaryKey);

                if (smearstation != null) {
                    cacheResult(smearstation);
                } else {
                    EntityCacheUtil.putResult(SmearstationModelImpl.ENTITY_CACHE_ENABLED,
                        SmearstationImpl.class, primaryKey, _nullSmearstation);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(SmearstationModelImpl.ENTITY_CACHE_ENABLED,
                    SmearstationImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return smearstation;
    }

    /**
     * Returns the smearstation with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param stationID the primary key of the smearstation
     * @return the smearstation, or <code>null</code> if a smearstation with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Smearstation fetchByPrimaryKey(long stationID)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) stationID);
    }

    /**
     * Returns all the smearstations.
     *
     * @return the smearstations
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Smearstation> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the smearstations.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.SmearstationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of smearstations
     * @param end the upper bound of the range of smearstations (not inclusive)
     * @return the range of smearstations
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Smearstation> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the smearstations.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.SmearstationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of smearstations
     * @param end the upper bound of the range of smearstations (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of smearstations
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Smearstation> findAll(int start, int end,
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

        List<Smearstation> list = (List<Smearstation>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_SMEARSTATION);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_SMEARSTATION;

                if (pagination) {
                    sql = sql.concat(SmearstationModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Smearstation>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Smearstation>(list);
                } else {
                    list = (List<Smearstation>) QueryUtil.list(q, getDialect(),
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
     * Removes all the smearstations from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Smearstation smearstation : findAll()) {
            remove(smearstation);
        }
    }

    /**
     * Returns the number of smearstations.
     *
     * @return the number of smearstations
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

                Query q = session.createQuery(_SQL_COUNT_SMEARSTATION);

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
     * Initializes the smearstation persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.fi.csc.smear.db.model.Smearstation")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Smearstation>> listenersList = new ArrayList<ModelListener<Smearstation>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Smearstation>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(SmearstationImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
