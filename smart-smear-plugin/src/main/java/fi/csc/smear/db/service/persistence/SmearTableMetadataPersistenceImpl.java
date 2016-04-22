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

import fi.csc.smear.db.NoSuchTableMetadataException;
import fi.csc.smear.db.model.SmearTableMetadata;
import fi.csc.smear.db.model.impl.SmearTableMetadataImpl;
import fi.csc.smear.db.model.impl.SmearTableMetadataModelImpl;
import fi.csc.smear.db.service.persistence.SmearTableMetadataPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the smear table metadata service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author pj
 * @see SmearTableMetadataPersistence
 * @see SmearTableMetadataUtil
 * @generated
 */
public class SmearTableMetadataPersistenceImpl extends BasePersistenceImpl<SmearTableMetadata>
    implements SmearTableMetadataPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link SmearTableMetadataUtil} to access the smear table metadata persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = SmearTableMetadataImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(SmearTableMetadataModelImpl.ENTITY_CACHE_ENABLED,
            SmearTableMetadataModelImpl.FINDER_CACHE_ENABLED,
            SmearTableMetadataImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(SmearTableMetadataModelImpl.ENTITY_CACHE_ENABLED,
            SmearTableMetadataModelImpl.FINDER_CACHE_ENABLED,
            SmearTableMetadataImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(SmearTableMetadataModelImpl.ENTITY_CACHE_ENABLED,
            SmearTableMetadataModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_SMEARTABLEMETADATA = "SELECT smearTableMetadata FROM SmearTableMetadata smearTableMetadata";
    private static final String _SQL_COUNT_SMEARTABLEMETADATA = "SELECT COUNT(smearTableMetadata) FROM SmearTableMetadata smearTableMetadata";
    private static final String _ORDER_BY_ENTITY_ALIAS = "smearTableMetadata.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No SmearTableMetadata exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(SmearTableMetadataPersistenceImpl.class);
    private static SmearTableMetadata _nullSmearTableMetadata = new SmearTableMetadataImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<SmearTableMetadata> toCacheModel() {
                return _nullSmearTableMetadataCacheModel;
            }
        };

    private static CacheModel<SmearTableMetadata> _nullSmearTableMetadataCacheModel =
        new CacheModel<SmearTableMetadata>() {
            @Override
            public SmearTableMetadata toEntityModel() {
                return _nullSmearTableMetadata;
            }
        };

    public SmearTableMetadataPersistenceImpl() {
        setModelClass(SmearTableMetadata.class);
    }

    /**
     * Caches the smear table metadata in the entity cache if it is enabled.
     *
     * @param smearTableMetadata the smear table metadata
     */
    @Override
    public void cacheResult(SmearTableMetadata smearTableMetadata) {
        EntityCacheUtil.putResult(SmearTableMetadataModelImpl.ENTITY_CACHE_ENABLED,
            SmearTableMetadataImpl.class, smearTableMetadata.getPrimaryKey(),
            smearTableMetadata);

        smearTableMetadata.resetOriginalValues();
    }

    /**
     * Caches the smear table metadatas in the entity cache if it is enabled.
     *
     * @param smearTableMetadatas the smear table metadatas
     */
    @Override
    public void cacheResult(List<SmearTableMetadata> smearTableMetadatas) {
        for (SmearTableMetadata smearTableMetadata : smearTableMetadatas) {
            if (EntityCacheUtil.getResult(
                        SmearTableMetadataModelImpl.ENTITY_CACHE_ENABLED,
                        SmearTableMetadataImpl.class,
                        smearTableMetadata.getPrimaryKey()) == null) {
                cacheResult(smearTableMetadata);
            } else {
                smearTableMetadata.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all smear table metadatas.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(SmearTableMetadataImpl.class.getName());
        }

        EntityCacheUtil.clearCache(SmearTableMetadataImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the smear table metadata.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(SmearTableMetadata smearTableMetadata) {
        EntityCacheUtil.removeResult(SmearTableMetadataModelImpl.ENTITY_CACHE_ENABLED,
            SmearTableMetadataImpl.class, smearTableMetadata.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<SmearTableMetadata> smearTableMetadatas) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (SmearTableMetadata smearTableMetadata : smearTableMetadatas) {
            EntityCacheUtil.removeResult(SmearTableMetadataModelImpl.ENTITY_CACHE_ENABLED,
                SmearTableMetadataImpl.class, smearTableMetadata.getPrimaryKey());
        }
    }

    /**
     * Creates a new smear table metadata with the primary key. Does not add the smear table metadata to the database.
     *
     * @param tableID the primary key for the new smear table metadata
     * @return the new smear table metadata
     */
    @Override
    public SmearTableMetadata create(long tableID) {
        SmearTableMetadata smearTableMetadata = new SmearTableMetadataImpl();

        smearTableMetadata.setNew(true);
        smearTableMetadata.setPrimaryKey(tableID);

        return smearTableMetadata;
    }

    /**
     * Removes the smear table metadata with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param tableID the primary key of the smear table metadata
     * @return the smear table metadata that was removed
     * @throws fi.csc.smear.db.NoSuchTableMetadataException if a smear table metadata with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SmearTableMetadata remove(long tableID)
        throws NoSuchTableMetadataException, SystemException {
        return remove((Serializable) tableID);
    }

    /**
     * Removes the smear table metadata with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the smear table metadata
     * @return the smear table metadata that was removed
     * @throws fi.csc.smear.db.NoSuchTableMetadataException if a smear table metadata with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SmearTableMetadata remove(Serializable primaryKey)
        throws NoSuchTableMetadataException, SystemException {
        Session session = null;

        try {
            session = openSession();

            SmearTableMetadata smearTableMetadata = (SmearTableMetadata) session.get(SmearTableMetadataImpl.class,
                    primaryKey);

            if (smearTableMetadata == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchTableMetadataException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(smearTableMetadata);
        } catch (NoSuchTableMetadataException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected SmearTableMetadata removeImpl(
        SmearTableMetadata smearTableMetadata) throws SystemException {
        smearTableMetadata = toUnwrappedModel(smearTableMetadata);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(smearTableMetadata)) {
                smearTableMetadata = (SmearTableMetadata) session.get(SmearTableMetadataImpl.class,
                        smearTableMetadata.getPrimaryKeyObj());
            }

            if (smearTableMetadata != null) {
                session.delete(smearTableMetadata);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (smearTableMetadata != null) {
            clearCache(smearTableMetadata);
        }

        return smearTableMetadata;
    }

    @Override
    public SmearTableMetadata updateImpl(
        fi.csc.smear.db.model.SmearTableMetadata smearTableMetadata)
        throws SystemException {
        smearTableMetadata = toUnwrappedModel(smearTableMetadata);

        boolean isNew = smearTableMetadata.isNew();

        Session session = null;

        try {
            session = openSession();

            if (smearTableMetadata.isNew()) {
                session.save(smearTableMetadata);

                smearTableMetadata.setNew(false);
            } else {
                session.merge(smearTableMetadata);
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

        EntityCacheUtil.putResult(SmearTableMetadataModelImpl.ENTITY_CACHE_ENABLED,
            SmearTableMetadataImpl.class, smearTableMetadata.getPrimaryKey(),
            smearTableMetadata);

        return smearTableMetadata;
    }

    protected SmearTableMetadata toUnwrappedModel(
        SmearTableMetadata smearTableMetadata) {
        if (smearTableMetadata instanceof SmearTableMetadataImpl) {
            return smearTableMetadata;
        }

        SmearTableMetadataImpl smearTableMetadataImpl = new SmearTableMetadataImpl();

        smearTableMetadataImpl.setNew(smearTableMetadata.isNew());
        smearTableMetadataImpl.setPrimaryKey(smearTableMetadata.getPrimaryKey());

        smearTableMetadataImpl.setTableID(smearTableMetadata.getTableID());
        smearTableMetadataImpl.setIdentifier(smearTableMetadata.getIdentifier());
        smearTableMetadataImpl.setTitle(smearTableMetadata.getTitle());
        smearTableMetadataImpl.setSpatial_coverage(smearTableMetadata.getSpatial_coverage());
        smearTableMetadataImpl.setName(smearTableMetadata.getName());
        smearTableMetadataImpl.setTtimestamp(smearTableMetadata.getTtimestamp());
        smearTableMetadataImpl.setPeriod(smearTableMetadata.getPeriod());

        return smearTableMetadataImpl;
    }

    /**
     * Returns the smear table metadata with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the smear table metadata
     * @return the smear table metadata
     * @throws fi.csc.smear.db.NoSuchTableMetadataException if a smear table metadata with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SmearTableMetadata findByPrimaryKey(Serializable primaryKey)
        throws NoSuchTableMetadataException, SystemException {
        SmearTableMetadata smearTableMetadata = fetchByPrimaryKey(primaryKey);

        if (smearTableMetadata == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchTableMetadataException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return smearTableMetadata;
    }

    /**
     * Returns the smear table metadata with the primary key or throws a {@link fi.csc.smear.db.NoSuchTableMetadataException} if it could not be found.
     *
     * @param tableID the primary key of the smear table metadata
     * @return the smear table metadata
     * @throws fi.csc.smear.db.NoSuchTableMetadataException if a smear table metadata with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SmearTableMetadata findByPrimaryKey(long tableID)
        throws NoSuchTableMetadataException, SystemException {
        return findByPrimaryKey((Serializable) tableID);
    }

    /**
     * Returns the smear table metadata with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the smear table metadata
     * @return the smear table metadata, or <code>null</code> if a smear table metadata with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SmearTableMetadata fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        SmearTableMetadata smearTableMetadata = (SmearTableMetadata) EntityCacheUtil.getResult(SmearTableMetadataModelImpl.ENTITY_CACHE_ENABLED,
                SmearTableMetadataImpl.class, primaryKey);

        if (smearTableMetadata == _nullSmearTableMetadata) {
            return null;
        }

        if (smearTableMetadata == null) {
            Session session = null;

            try {
                session = openSession();

                smearTableMetadata = (SmearTableMetadata) session.get(SmearTableMetadataImpl.class,
                        primaryKey);

                if (smearTableMetadata != null) {
                    cacheResult(smearTableMetadata);
                } else {
                    EntityCacheUtil.putResult(SmearTableMetadataModelImpl.ENTITY_CACHE_ENABLED,
                        SmearTableMetadataImpl.class, primaryKey,
                        _nullSmearTableMetadata);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(SmearTableMetadataModelImpl.ENTITY_CACHE_ENABLED,
                    SmearTableMetadataImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return smearTableMetadata;
    }

    /**
     * Returns the smear table metadata with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param tableID the primary key of the smear table metadata
     * @return the smear table metadata, or <code>null</code> if a smear table metadata with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SmearTableMetadata fetchByPrimaryKey(long tableID)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) tableID);
    }

    /**
     * Returns all the smear table metadatas.
     *
     * @return the smear table metadatas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<SmearTableMetadata> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the smear table metadatas.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.SmearTableMetadataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of smear table metadatas
     * @param end the upper bound of the range of smear table metadatas (not inclusive)
     * @return the range of smear table metadatas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<SmearTableMetadata> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the smear table metadatas.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.SmearTableMetadataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of smear table metadatas
     * @param end the upper bound of the range of smear table metadatas (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of smear table metadatas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<SmearTableMetadata> findAll(int start, int end,
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

        List<SmearTableMetadata> list = (List<SmearTableMetadata>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_SMEARTABLEMETADATA);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_SMEARTABLEMETADATA;

                if (pagination) {
                    sql = sql.concat(SmearTableMetadataModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<SmearTableMetadata>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<SmearTableMetadata>(list);
                } else {
                    list = (List<SmearTableMetadata>) QueryUtil.list(q,
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
     * Removes all the smear table metadatas from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (SmearTableMetadata smearTableMetadata : findAll()) {
            remove(smearTableMetadata);
        }
    }

    /**
     * Returns the number of smear table metadatas.
     *
     * @return the number of smear table metadatas
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

                Query q = session.createQuery(_SQL_COUNT_SMEARTABLEMETADATA);

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
     * Initializes the smear table metadata persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.fi.csc.smear.db.model.SmearTableMetadata")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<SmearTableMetadata>> listenersList = new ArrayList<ModelListener<SmearTableMetadata>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<SmearTableMetadata>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(SmearTableMetadataImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
