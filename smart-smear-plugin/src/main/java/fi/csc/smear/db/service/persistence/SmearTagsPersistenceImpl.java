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

import fi.csc.smear.db.NoSuchTagsException;
import fi.csc.smear.db.model.SmearTags;
import fi.csc.smear.db.model.impl.SmearTagsImpl;
import fi.csc.smear.db.model.impl.SmearTagsModelImpl;
import fi.csc.smear.db.service.persistence.SmearTagsPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the smear tags service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author pj
 * @see SmearTagsPersistence
 * @see SmearTagsUtil
 * @generated
 */
public class SmearTagsPersistenceImpl extends BasePersistenceImpl<SmearTags>
    implements SmearTagsPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link SmearTagsUtil} to access the smear tags persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = SmearTagsImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(SmearTagsModelImpl.ENTITY_CACHE_ENABLED,
            SmearTagsModelImpl.FINDER_CACHE_ENABLED, SmearTagsImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(SmearTagsModelImpl.ENTITY_CACHE_ENABLED,
            SmearTagsModelImpl.FINDER_CACHE_ENABLED, SmearTagsImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(SmearTagsModelImpl.ENTITY_CACHE_ENABLED,
            SmearTagsModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_SMEARTAGS = "SELECT smearTags FROM SmearTags smearTags";
    private static final String _SQL_COUNT_SMEARTAGS = "SELECT COUNT(smearTags) FROM SmearTags smearTags";
    private static final String _ORDER_BY_ENTITY_ALIAS = "smearTags.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No SmearTags exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(SmearTagsPersistenceImpl.class);
    private static SmearTags _nullSmearTags = new SmearTagsImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<SmearTags> toCacheModel() {
                return _nullSmearTagsCacheModel;
            }
        };

    private static CacheModel<SmearTags> _nullSmearTagsCacheModel = new CacheModel<SmearTags>() {
            @Override
            public SmearTags toEntityModel() {
                return _nullSmearTags;
            }
        };

    public SmearTagsPersistenceImpl() {
        setModelClass(SmearTags.class);
    }

    /**
     * Caches the smear tags in the entity cache if it is enabled.
     *
     * @param smearTags the smear tags
     */
    @Override
    public void cacheResult(SmearTags smearTags) {
        EntityCacheUtil.putResult(SmearTagsModelImpl.ENTITY_CACHE_ENABLED,
            SmearTagsImpl.class, smearTags.getPrimaryKey(), smearTags);

        smearTags.resetOriginalValues();
    }

    /**
     * Caches the smear tagses in the entity cache if it is enabled.
     *
     * @param smearTagses the smear tagses
     */
    @Override
    public void cacheResult(List<SmearTags> smearTagses) {
        for (SmearTags smearTags : smearTagses) {
            if (EntityCacheUtil.getResult(
                        SmearTagsModelImpl.ENTITY_CACHE_ENABLED,
                        SmearTagsImpl.class, smearTags.getPrimaryKey()) == null) {
                cacheResult(smearTags);
            } else {
                smearTags.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all smear tagses.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(SmearTagsImpl.class.getName());
        }

        EntityCacheUtil.clearCache(SmearTagsImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the smear tags.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(SmearTags smearTags) {
        EntityCacheUtil.removeResult(SmearTagsModelImpl.ENTITY_CACHE_ENABLED,
            SmearTagsImpl.class, smearTags.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<SmearTags> smearTagses) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (SmearTags smearTags : smearTagses) {
            EntityCacheUtil.removeResult(SmearTagsModelImpl.ENTITY_CACHE_ENABLED,
                SmearTagsImpl.class, smearTags.getPrimaryKey());
        }
    }

    /**
     * Creates a new smear tags with the primary key. Does not add the smear tags to the database.
     *
     * @param tagID the primary key for the new smear tags
     * @return the new smear tags
     */
    @Override
    public SmearTags create(long tagID) {
        SmearTags smearTags = new SmearTagsImpl();

        smearTags.setNew(true);
        smearTags.setPrimaryKey(tagID);

        return smearTags;
    }

    /**
     * Removes the smear tags with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param tagID the primary key of the smear tags
     * @return the smear tags that was removed
     * @throws fi.csc.smear.db.NoSuchTagsException if a smear tags with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SmearTags remove(long tagID)
        throws NoSuchTagsException, SystemException {
        return remove((Serializable) tagID);
    }

    /**
     * Removes the smear tags with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the smear tags
     * @return the smear tags that was removed
     * @throws fi.csc.smear.db.NoSuchTagsException if a smear tags with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SmearTags remove(Serializable primaryKey)
        throws NoSuchTagsException, SystemException {
        Session session = null;

        try {
            session = openSession();

            SmearTags smearTags = (SmearTags) session.get(SmearTagsImpl.class,
                    primaryKey);

            if (smearTags == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchTagsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(smearTags);
        } catch (NoSuchTagsException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected SmearTags removeImpl(SmearTags smearTags)
        throws SystemException {
        smearTags = toUnwrappedModel(smearTags);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(smearTags)) {
                smearTags = (SmearTags) session.get(SmearTagsImpl.class,
                        smearTags.getPrimaryKeyObj());
            }

            if (smearTags != null) {
                session.delete(smearTags);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (smearTags != null) {
            clearCache(smearTags);
        }

        return smearTags;
    }

    @Override
    public SmearTags updateImpl(fi.csc.smear.db.model.SmearTags smearTags)
        throws SystemException {
        smearTags = toUnwrappedModel(smearTags);

        boolean isNew = smearTags.isNew();

        Session session = null;

        try {
            session = openSession();

            if (smearTags.isNew()) {
                session.save(smearTags);

                smearTags.setNew(false);
            } else {
                session.merge(smearTags);
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

        EntityCacheUtil.putResult(SmearTagsModelImpl.ENTITY_CACHE_ENABLED,
            SmearTagsImpl.class, smearTags.getPrimaryKey(), smearTags);

        return smearTags;
    }

    protected SmearTags toUnwrappedModel(SmearTags smearTags) {
        if (smearTags instanceof SmearTagsImpl) {
            return smearTags;
        }

        SmearTagsImpl smearTagsImpl = new SmearTagsImpl();

        smearTagsImpl.setNew(smearTags.isNew());
        smearTagsImpl.setPrimaryKey(smearTags.getPrimaryKey());

        smearTagsImpl.setTagID(smearTags.getTagID());
        smearTagsImpl.setVocabulary(smearTags.getVocabulary());
        smearTagsImpl.setTag(smearTags.getTag());
        smearTagsImpl.setDisplaykeyword(smearTags.getDisplaykeyword());

        return smearTagsImpl;
    }

    /**
     * Returns the smear tags with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the smear tags
     * @return the smear tags
     * @throws fi.csc.smear.db.NoSuchTagsException if a smear tags with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SmearTags findByPrimaryKey(Serializable primaryKey)
        throws NoSuchTagsException, SystemException {
        SmearTags smearTags = fetchByPrimaryKey(primaryKey);

        if (smearTags == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchTagsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return smearTags;
    }

    /**
     * Returns the smear tags with the primary key or throws a {@link fi.csc.smear.db.NoSuchTagsException} if it could not be found.
     *
     * @param tagID the primary key of the smear tags
     * @return the smear tags
     * @throws fi.csc.smear.db.NoSuchTagsException if a smear tags with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SmearTags findByPrimaryKey(long tagID)
        throws NoSuchTagsException, SystemException {
        return findByPrimaryKey((Serializable) tagID);
    }

    /**
     * Returns the smear tags with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the smear tags
     * @return the smear tags, or <code>null</code> if a smear tags with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SmearTags fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        SmearTags smearTags = (SmearTags) EntityCacheUtil.getResult(SmearTagsModelImpl.ENTITY_CACHE_ENABLED,
                SmearTagsImpl.class, primaryKey);

        if (smearTags == _nullSmearTags) {
            return null;
        }

        if (smearTags == null) {
            Session session = null;

            try {
                session = openSession();

                smearTags = (SmearTags) session.get(SmearTagsImpl.class,
                        primaryKey);

                if (smearTags != null) {
                    cacheResult(smearTags);
                } else {
                    EntityCacheUtil.putResult(SmearTagsModelImpl.ENTITY_CACHE_ENABLED,
                        SmearTagsImpl.class, primaryKey, _nullSmearTags);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(SmearTagsModelImpl.ENTITY_CACHE_ENABLED,
                    SmearTagsImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return smearTags;
    }

    /**
     * Returns the smear tags with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param tagID the primary key of the smear tags
     * @return the smear tags, or <code>null</code> if a smear tags with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SmearTags fetchByPrimaryKey(long tagID) throws SystemException {
        return fetchByPrimaryKey((Serializable) tagID);
    }

    /**
     * Returns all the smear tagses.
     *
     * @return the smear tagses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<SmearTags> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the smear tagses.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.SmearTagsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of smear tagses
     * @param end the upper bound of the range of smear tagses (not inclusive)
     * @return the range of smear tagses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<SmearTags> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the smear tagses.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.SmearTagsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of smear tagses
     * @param end the upper bound of the range of smear tagses (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of smear tagses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<SmearTags> findAll(int start, int end,
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

        List<SmearTags> list = (List<SmearTags>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_SMEARTAGS);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_SMEARTAGS;

                if (pagination) {
                    sql = sql.concat(SmearTagsModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<SmearTags>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<SmearTags>(list);
                } else {
                    list = (List<SmearTags>) QueryUtil.list(q, getDialect(),
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
     * Removes all the smear tagses from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (SmearTags smearTags : findAll()) {
            remove(smearTags);
        }
    }

    /**
     * Returns the number of smear tagses.
     *
     * @return the number of smear tagses
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

                Query q = session.createQuery(_SQL_COUNT_SMEARTAGS);

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
     * Initializes the smear tags persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.fi.csc.smear.db.model.SmearTags")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<SmearTags>> listenersList = new ArrayList<ModelListener<SmearTags>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<SmearTags>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(SmearTagsImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
