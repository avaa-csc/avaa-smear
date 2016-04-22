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

import fi.csc.smear.db.NoSuchvariableTagsException;
import fi.csc.smear.db.model.SmearvariableTags;
import fi.csc.smear.db.model.impl.SmearvariableTagsImpl;
import fi.csc.smear.db.model.impl.SmearvariableTagsModelImpl;
import fi.csc.smear.db.service.persistence.SmearvariableTagsPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the smearvariable tags service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author pj
 * @see SmearvariableTagsPersistence
 * @see SmearvariableTagsUtil
 * @generated
 */
public class SmearvariableTagsPersistenceImpl extends BasePersistenceImpl<SmearvariableTags>
    implements SmearvariableTagsPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link SmearvariableTagsUtil} to access the smearvariable tags persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = SmearvariableTagsImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(SmearvariableTagsModelImpl.ENTITY_CACHE_ENABLED,
            SmearvariableTagsModelImpl.FINDER_CACHE_ENABLED,
            SmearvariableTagsImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(SmearvariableTagsModelImpl.ENTITY_CACHE_ENABLED,
            SmearvariableTagsModelImpl.FINDER_CACHE_ENABLED,
            SmearvariableTagsImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(SmearvariableTagsModelImpl.ENTITY_CACHE_ENABLED,
            SmearvariableTagsModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_SMEARVARIABLETAGS = "SELECT smearvariableTags FROM SmearvariableTags smearvariableTags";
    private static final String _SQL_COUNT_SMEARVARIABLETAGS = "SELECT COUNT(smearvariableTags) FROM SmearvariableTags smearvariableTags";
    private static final String _ORDER_BY_ENTITY_ALIAS = "smearvariableTags.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No SmearvariableTags exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(SmearvariableTagsPersistenceImpl.class);
    private static SmearvariableTags _nullSmearvariableTags = new SmearvariableTagsImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<SmearvariableTags> toCacheModel() {
                return _nullSmearvariableTagsCacheModel;
            }
        };

    private static CacheModel<SmearvariableTags> _nullSmearvariableTagsCacheModel =
        new CacheModel<SmearvariableTags>() {
            @Override
            public SmearvariableTags toEntityModel() {
                return _nullSmearvariableTags;
            }
        };

    public SmearvariableTagsPersistenceImpl() {
        setModelClass(SmearvariableTags.class);
    }

    /**
     * Caches the smearvariable tags in the entity cache if it is enabled.
     *
     * @param smearvariableTags the smearvariable tags
     */
    @Override
    public void cacheResult(SmearvariableTags smearvariableTags) {
        EntityCacheUtil.putResult(SmearvariableTagsModelImpl.ENTITY_CACHE_ENABLED,
            SmearvariableTagsImpl.class, smearvariableTags.getPrimaryKey(),
            smearvariableTags);

        smearvariableTags.resetOriginalValues();
    }

    /**
     * Caches the smearvariable tagses in the entity cache if it is enabled.
     *
     * @param smearvariableTagses the smearvariable tagses
     */
    @Override
    public void cacheResult(List<SmearvariableTags> smearvariableTagses) {
        for (SmearvariableTags smearvariableTags : smearvariableTagses) {
            if (EntityCacheUtil.getResult(
                        SmearvariableTagsModelImpl.ENTITY_CACHE_ENABLED,
                        SmearvariableTagsImpl.class,
                        smearvariableTags.getPrimaryKey()) == null) {
                cacheResult(smearvariableTags);
            } else {
                smearvariableTags.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all smearvariable tagses.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(SmearvariableTagsImpl.class.getName());
        }

        EntityCacheUtil.clearCache(SmearvariableTagsImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the smearvariable tags.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(SmearvariableTags smearvariableTags) {
        EntityCacheUtil.removeResult(SmearvariableTagsModelImpl.ENTITY_CACHE_ENABLED,
            SmearvariableTagsImpl.class, smearvariableTags.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<SmearvariableTags> smearvariableTagses) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (SmearvariableTags smearvariableTags : smearvariableTagses) {
            EntityCacheUtil.removeResult(SmearvariableTagsModelImpl.ENTITY_CACHE_ENABLED,
                SmearvariableTagsImpl.class, smearvariableTags.getPrimaryKey());
        }
    }

    /**
     * Creates a new smearvariable tags with the primary key. Does not add the smearvariable tags to the database.
     *
     * @param variableID the primary key for the new smearvariable tags
     * @return the new smearvariable tags
     */
    @Override
    public SmearvariableTags create(long variableID) {
        SmearvariableTags smearvariableTags = new SmearvariableTagsImpl();

        smearvariableTags.setNew(true);
        smearvariableTags.setPrimaryKey(variableID);

        return smearvariableTags;
    }

    /**
     * Removes the smearvariable tags with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param variableID the primary key of the smearvariable tags
     * @return the smearvariable tags that was removed
     * @throws fi.csc.smear.db.NoSuchvariableTagsException if a smearvariable tags with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SmearvariableTags remove(long variableID)
        throws NoSuchvariableTagsException, SystemException {
        return remove((Serializable) variableID);
    }

    /**
     * Removes the smearvariable tags with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the smearvariable tags
     * @return the smearvariable tags that was removed
     * @throws fi.csc.smear.db.NoSuchvariableTagsException if a smearvariable tags with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SmearvariableTags remove(Serializable primaryKey)
        throws NoSuchvariableTagsException, SystemException {
        Session session = null;

        try {
            session = openSession();

            SmearvariableTags smearvariableTags = (SmearvariableTags) session.get(SmearvariableTagsImpl.class,
                    primaryKey);

            if (smearvariableTags == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchvariableTagsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(smearvariableTags);
        } catch (NoSuchvariableTagsException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected SmearvariableTags removeImpl(SmearvariableTags smearvariableTags)
        throws SystemException {
        smearvariableTags = toUnwrappedModel(smearvariableTags);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(smearvariableTags)) {
                smearvariableTags = (SmearvariableTags) session.get(SmearvariableTagsImpl.class,
                        smearvariableTags.getPrimaryKeyObj());
            }

            if (smearvariableTags != null) {
                session.delete(smearvariableTags);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (smearvariableTags != null) {
            clearCache(smearvariableTags);
        }

        return smearvariableTags;
    }

    @Override
    public SmearvariableTags updateImpl(
        fi.csc.smear.db.model.SmearvariableTags smearvariableTags)
        throws SystemException {
        smearvariableTags = toUnwrappedModel(smearvariableTags);

        boolean isNew = smearvariableTags.isNew();

        Session session = null;

        try {
            session = openSession();

            if (smearvariableTags.isNew()) {
                session.save(smearvariableTags);

                smearvariableTags.setNew(false);
            } else {
                session.merge(smearvariableTags);
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

        EntityCacheUtil.putResult(SmearvariableTagsModelImpl.ENTITY_CACHE_ENABLED,
            SmearvariableTagsImpl.class, smearvariableTags.getPrimaryKey(),
            smearvariableTags);

        return smearvariableTags;
    }

    protected SmearvariableTags toUnwrappedModel(
        SmearvariableTags smearvariableTags) {
        if (smearvariableTags instanceof SmearvariableTagsImpl) {
            return smearvariableTags;
        }

        SmearvariableTagsImpl smearvariableTagsImpl = new SmearvariableTagsImpl();

        smearvariableTagsImpl.setNew(smearvariableTags.isNew());
        smearvariableTagsImpl.setPrimaryKey(smearvariableTags.getPrimaryKey());

        smearvariableTagsImpl.setTagID(smearvariableTags.getTagID());
        smearvariableTagsImpl.setVariableID(smearvariableTags.getVariableID());

        return smearvariableTagsImpl;
    }

    /**
     * Returns the smearvariable tags with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the smearvariable tags
     * @return the smearvariable tags
     * @throws fi.csc.smear.db.NoSuchvariableTagsException if a smearvariable tags with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SmearvariableTags findByPrimaryKey(Serializable primaryKey)
        throws NoSuchvariableTagsException, SystemException {
        SmearvariableTags smearvariableTags = fetchByPrimaryKey(primaryKey);

        if (smearvariableTags == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchvariableTagsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return smearvariableTags;
    }

    /**
     * Returns the smearvariable tags with the primary key or throws a {@link fi.csc.smear.db.NoSuchvariableTagsException} if it could not be found.
     *
     * @param variableID the primary key of the smearvariable tags
     * @return the smearvariable tags
     * @throws fi.csc.smear.db.NoSuchvariableTagsException if a smearvariable tags with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SmearvariableTags findByPrimaryKey(long variableID)
        throws NoSuchvariableTagsException, SystemException {
        return findByPrimaryKey((Serializable) variableID);
    }

    /**
     * Returns the smearvariable tags with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the smearvariable tags
     * @return the smearvariable tags, or <code>null</code> if a smearvariable tags with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SmearvariableTags fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        SmearvariableTags smearvariableTags = (SmearvariableTags) EntityCacheUtil.getResult(SmearvariableTagsModelImpl.ENTITY_CACHE_ENABLED,
                SmearvariableTagsImpl.class, primaryKey);

        if (smearvariableTags == _nullSmearvariableTags) {
            return null;
        }

        if (smearvariableTags == null) {
            Session session = null;

            try {
                session = openSession();

                smearvariableTags = (SmearvariableTags) session.get(SmearvariableTagsImpl.class,
                        primaryKey);

                if (smearvariableTags != null) {
                    cacheResult(smearvariableTags);
                } else {
                    EntityCacheUtil.putResult(SmearvariableTagsModelImpl.ENTITY_CACHE_ENABLED,
                        SmearvariableTagsImpl.class, primaryKey,
                        _nullSmearvariableTags);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(SmearvariableTagsModelImpl.ENTITY_CACHE_ENABLED,
                    SmearvariableTagsImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return smearvariableTags;
    }

    /**
     * Returns the smearvariable tags with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param variableID the primary key of the smearvariable tags
     * @return the smearvariable tags, or <code>null</code> if a smearvariable tags with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SmearvariableTags fetchByPrimaryKey(long variableID)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) variableID);
    }

    /**
     * Returns all the smearvariable tagses.
     *
     * @return the smearvariable tagses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<SmearvariableTags> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the smearvariable tagses.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.SmearvariableTagsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of smearvariable tagses
     * @param end the upper bound of the range of smearvariable tagses (not inclusive)
     * @return the range of smearvariable tagses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<SmearvariableTags> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the smearvariable tagses.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.SmearvariableTagsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of smearvariable tagses
     * @param end the upper bound of the range of smearvariable tagses (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of smearvariable tagses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<SmearvariableTags> findAll(int start, int end,
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

        List<SmearvariableTags> list = (List<SmearvariableTags>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_SMEARVARIABLETAGS);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_SMEARVARIABLETAGS;

                if (pagination) {
                    sql = sql.concat(SmearvariableTagsModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<SmearvariableTags>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<SmearvariableTags>(list);
                } else {
                    list = (List<SmearvariableTags>) QueryUtil.list(q,
                            getDialect(), start, end);
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
     * Removes all the smearvariable tagses from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (SmearvariableTags smearvariableTags : findAll()) {
            remove(smearvariableTags);
        }
    }

    /**
     * Returns the number of smearvariable tagses.
     *
     * @return the number of smearvariable tagses
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

                Query q = session.createQuery(_SQL_COUNT_SMEARVARIABLETAGS);

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
     * Initializes the smearvariable tags persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.fi.csc.smear.db.model.SmearvariableTags")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<SmearvariableTags>> listenersList = new ArrayList<ModelListener<SmearvariableTags>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<SmearvariableTags>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(SmearvariableTagsImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
