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

import fi.csc.smear.db.NoSuchVariableMetadataException;
import fi.csc.smear.db.model.SmearVariableMetadata;
import fi.csc.smear.db.model.impl.SmearVariableMetadataImpl;
import fi.csc.smear.db.model.impl.SmearVariableMetadataModelImpl;
import fi.csc.smear.db.service.persistence.SmearVariableMetadataPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the smear variable metadata service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author pj
 * @see SmearVariableMetadataPersistence
 * @see SmearVariableMetadataUtil
 * @generated
 */
public class SmearVariableMetadataPersistenceImpl extends BasePersistenceImpl<SmearVariableMetadata>
    implements SmearVariableMetadataPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link SmearVariableMetadataUtil} to access the smear variable metadata persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = SmearVariableMetadataImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(SmearVariableMetadataModelImpl.ENTITY_CACHE_ENABLED,
            SmearVariableMetadataModelImpl.FINDER_CACHE_ENABLED,
            SmearVariableMetadataImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(SmearVariableMetadataModelImpl.ENTITY_CACHE_ENABLED,
            SmearVariableMetadataModelImpl.FINDER_CACHE_ENABLED,
            SmearVariableMetadataImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(SmearVariableMetadataModelImpl.ENTITY_CACHE_ENABLED,
            SmearVariableMetadataModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_SMEARVARIABLEMETADATA = "SELECT smearVariableMetadata FROM SmearVariableMetadata smearVariableMetadata";
    private static final String _SQL_COUNT_SMEARVARIABLEMETADATA = "SELECT COUNT(smearVariableMetadata) FROM SmearVariableMetadata smearVariableMetadata";
    private static final String _ORDER_BY_ENTITY_ALIAS = "smearVariableMetadata.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No SmearVariableMetadata exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(SmearVariableMetadataPersistenceImpl.class);
    private static SmearVariableMetadata _nullSmearVariableMetadata = new SmearVariableMetadataImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<SmearVariableMetadata> toCacheModel() {
                return _nullSmearVariableMetadataCacheModel;
            }
        };

    private static CacheModel<SmearVariableMetadata> _nullSmearVariableMetadataCacheModel =
        new CacheModel<SmearVariableMetadata>() {
            @Override
            public SmearVariableMetadata toEntityModel() {
                return _nullSmearVariableMetadata;
            }
        };

    public SmearVariableMetadataPersistenceImpl() {
        setModelClass(SmearVariableMetadata.class);
    }

    /**
     * Caches the smear variable metadata in the entity cache if it is enabled.
     *
     * @param smearVariableMetadata the smear variable metadata
     */
    @Override
    public void cacheResult(SmearVariableMetadata smearVariableMetadata) {
        EntityCacheUtil.putResult(SmearVariableMetadataModelImpl.ENTITY_CACHE_ENABLED,
            SmearVariableMetadataImpl.class,
            smearVariableMetadata.getPrimaryKey(), smearVariableMetadata);

        smearVariableMetadata.resetOriginalValues();
    }

    /**
     * Caches the smear variable metadatas in the entity cache if it is enabled.
     *
     * @param smearVariableMetadatas the smear variable metadatas
     */
    @Override
    public void cacheResult(List<SmearVariableMetadata> smearVariableMetadatas) {
        for (SmearVariableMetadata smearVariableMetadata : smearVariableMetadatas) {
            if (EntityCacheUtil.getResult(
                        SmearVariableMetadataModelImpl.ENTITY_CACHE_ENABLED,
                        SmearVariableMetadataImpl.class,
                        smearVariableMetadata.getPrimaryKey()) == null) {
                cacheResult(smearVariableMetadata);
            } else {
                smearVariableMetadata.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all smear variable metadatas.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(SmearVariableMetadataImpl.class.getName());
        }

        EntityCacheUtil.clearCache(SmearVariableMetadataImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the smear variable metadata.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(SmearVariableMetadata smearVariableMetadata) {
        EntityCacheUtil.removeResult(SmearVariableMetadataModelImpl.ENTITY_CACHE_ENABLED,
            SmearVariableMetadataImpl.class,
            smearVariableMetadata.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<SmearVariableMetadata> smearVariableMetadatas) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (SmearVariableMetadata smearVariableMetadata : smearVariableMetadatas) {
            EntityCacheUtil.removeResult(SmearVariableMetadataModelImpl.ENTITY_CACHE_ENABLED,
                SmearVariableMetadataImpl.class,
                smearVariableMetadata.getPrimaryKey());
        }
    }

    /**
     * Creates a new smear variable metadata with the primary key. Does not add the smear variable metadata to the database.
     *
     * @param variableID the primary key for the new smear variable metadata
     * @return the new smear variable metadata
     */
    @Override
    public SmearVariableMetadata create(long variableID) {
        SmearVariableMetadata smearVariableMetadata = new SmearVariableMetadataImpl();

        smearVariableMetadata.setNew(true);
        smearVariableMetadata.setPrimaryKey(variableID);

        return smearVariableMetadata;
    }

    /**
     * Removes the smear variable metadata with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param variableID the primary key of the smear variable metadata
     * @return the smear variable metadata that was removed
     * @throws fi.csc.smear.db.NoSuchVariableMetadataException if a smear variable metadata with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SmearVariableMetadata remove(long variableID)
        throws NoSuchVariableMetadataException, SystemException {
        return remove((Serializable) variableID);
    }

    /**
     * Removes the smear variable metadata with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the smear variable metadata
     * @return the smear variable metadata that was removed
     * @throws fi.csc.smear.db.NoSuchVariableMetadataException if a smear variable metadata with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SmearVariableMetadata remove(Serializable primaryKey)
        throws NoSuchVariableMetadataException, SystemException {
        Session session = null;

        try {
            session = openSession();

            SmearVariableMetadata smearVariableMetadata = (SmearVariableMetadata) session.get(SmearVariableMetadataImpl.class,
                    primaryKey);

            if (smearVariableMetadata == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchVariableMetadataException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(smearVariableMetadata);
        } catch (NoSuchVariableMetadataException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected SmearVariableMetadata removeImpl(
        SmearVariableMetadata smearVariableMetadata) throws SystemException {
        smearVariableMetadata = toUnwrappedModel(smearVariableMetadata);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(smearVariableMetadata)) {
                smearVariableMetadata = (SmearVariableMetadata) session.get(SmearVariableMetadataImpl.class,
                        smearVariableMetadata.getPrimaryKeyObj());
            }

            if (smearVariableMetadata != null) {
                session.delete(smearVariableMetadata);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (smearVariableMetadata != null) {
            clearCache(smearVariableMetadata);
        }

        return smearVariableMetadata;
    }

    @Override
    public SmearVariableMetadata updateImpl(
        fi.csc.smear.db.model.SmearVariableMetadata smearVariableMetadata)
        throws SystemException {
        smearVariableMetadata = toUnwrappedModel(smearVariableMetadata);

        boolean isNew = smearVariableMetadata.isNew();

        Session session = null;

        try {
            session = openSession();

            if (smearVariableMetadata.isNew()) {
                session.save(smearVariableMetadata);

                smearVariableMetadata.setNew(false);
            } else {
                session.merge(smearVariableMetadata);
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

        EntityCacheUtil.putResult(SmearVariableMetadataModelImpl.ENTITY_CACHE_ENABLED,
            SmearVariableMetadataImpl.class,
            smearVariableMetadata.getPrimaryKey(), smearVariableMetadata);

        return smearVariableMetadata;
    }

    protected SmearVariableMetadata toUnwrappedModel(
        SmearVariableMetadata smearVariableMetadata) {
        if (smearVariableMetadata instanceof SmearVariableMetadataImpl) {
            return smearVariableMetadata;
        }

        SmearVariableMetadataImpl smearVariableMetadataImpl = new SmearVariableMetadataImpl();

        smearVariableMetadataImpl.setNew(smearVariableMetadata.isNew());
        smearVariableMetadataImpl.setPrimaryKey(smearVariableMetadata.getPrimaryKey());

        smearVariableMetadataImpl.setVariableID(smearVariableMetadata.getVariableID());
        smearVariableMetadataImpl.setTableID(smearVariableMetadata.getTableID());
        smearVariableMetadataImpl.setVariable(smearVariableMetadata.getVariable());
        smearVariableMetadataImpl.setDescription(smearVariableMetadata.getDescription());
        smearVariableMetadataImpl.setUnit(smearVariableMetadata.getUnit());
        smearVariableMetadataImpl.setTitle(smearVariableMetadata.getTitle());
        smearVariableMetadataImpl.setSource(smearVariableMetadata.getSource());
        smearVariableMetadataImpl.setPeriod_start(smearVariableMetadata.getPeriod_start());
        smearVariableMetadataImpl.setPeriod_end(smearVariableMetadata.getPeriod_end());
        smearVariableMetadataImpl.setCoverage(smearVariableMetadata.getCoverage());
        smearVariableMetadataImpl.setRights(smearVariableMetadata.getRights());
        smearVariableMetadataImpl.setMandatory(smearVariableMetadata.isMandatory());
        smearVariableMetadataImpl.setDerivative(smearVariableMetadata.isDerivative());
        smearVariableMetadataImpl.setVtimestamp(smearVariableMetadata.getVtimestamp());
        smearVariableMetadataImpl.setCategory(smearVariableMetadata.getCategory());

        return smearVariableMetadataImpl;
    }

    /**
     * Returns the smear variable metadata with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the smear variable metadata
     * @return the smear variable metadata
     * @throws fi.csc.smear.db.NoSuchVariableMetadataException if a smear variable metadata with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SmearVariableMetadata findByPrimaryKey(Serializable primaryKey)
        throws NoSuchVariableMetadataException, SystemException {
        SmearVariableMetadata smearVariableMetadata = fetchByPrimaryKey(primaryKey);

        if (smearVariableMetadata == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchVariableMetadataException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return smearVariableMetadata;
    }

    /**
     * Returns the smear variable metadata with the primary key or throws a {@link fi.csc.smear.db.NoSuchVariableMetadataException} if it could not be found.
     *
     * @param variableID the primary key of the smear variable metadata
     * @return the smear variable metadata
     * @throws fi.csc.smear.db.NoSuchVariableMetadataException if a smear variable metadata with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SmearVariableMetadata findByPrimaryKey(long variableID)
        throws NoSuchVariableMetadataException, SystemException {
        return findByPrimaryKey((Serializable) variableID);
    }

    /**
     * Returns the smear variable metadata with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the smear variable metadata
     * @return the smear variable metadata, or <code>null</code> if a smear variable metadata with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SmearVariableMetadata fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        SmearVariableMetadata smearVariableMetadata = (SmearVariableMetadata) EntityCacheUtil.getResult(SmearVariableMetadataModelImpl.ENTITY_CACHE_ENABLED,
                SmearVariableMetadataImpl.class, primaryKey);

        if (smearVariableMetadata == _nullSmearVariableMetadata) {
            return null;
        }

        if (smearVariableMetadata == null) {
            Session session = null;

            try {
                session = openSession();

                smearVariableMetadata = (SmearVariableMetadata) session.get(SmearVariableMetadataImpl.class,
                        primaryKey);

                if (smearVariableMetadata != null) {
                    cacheResult(smearVariableMetadata);
                } else {
                    EntityCacheUtil.putResult(SmearVariableMetadataModelImpl.ENTITY_CACHE_ENABLED,
                        SmearVariableMetadataImpl.class, primaryKey,
                        _nullSmearVariableMetadata);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(SmearVariableMetadataModelImpl.ENTITY_CACHE_ENABLED,
                    SmearVariableMetadataImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return smearVariableMetadata;
    }

    /**
     * Returns the smear variable metadata with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param variableID the primary key of the smear variable metadata
     * @return the smear variable metadata, or <code>null</code> if a smear variable metadata with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SmearVariableMetadata fetchByPrimaryKey(long variableID)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) variableID);
    }

    /**
     * Returns all the smear variable metadatas.
     *
     * @return the smear variable metadatas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<SmearVariableMetadata> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the smear variable metadatas.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.SmearVariableMetadataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of smear variable metadatas
     * @param end the upper bound of the range of smear variable metadatas (not inclusive)
     * @return the range of smear variable metadatas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<SmearVariableMetadata> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the smear variable metadatas.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.SmearVariableMetadataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of smear variable metadatas
     * @param end the upper bound of the range of smear variable metadatas (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of smear variable metadatas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<SmearVariableMetadata> findAll(int start, int end,
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

        List<SmearVariableMetadata> list = (List<SmearVariableMetadata>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_SMEARVARIABLEMETADATA);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_SMEARVARIABLEMETADATA;

                if (pagination) {
                    sql = sql.concat(SmearVariableMetadataModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<SmearVariableMetadata>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<SmearVariableMetadata>(list);
                } else {
                    list = (List<SmearVariableMetadata>) QueryUtil.list(q,
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
     * Removes all the smear variable metadatas from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (SmearVariableMetadata smearVariableMetadata : findAll()) {
            remove(smearVariableMetadata);
        }
    }

    /**
     * Returns the number of smear variable metadatas.
     *
     * @return the number of smear variable metadatas
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

                Query q = session.createQuery(_SQL_COUNT_SMEARVARIABLEMETADATA);

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
     * Initializes the smear variable metadata persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.fi.csc.smear.db.model.SmearVariableMetadata")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<SmearVariableMetadata>> listenersList = new ArrayList<ModelListener<SmearVariableMetadata>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<SmearVariableMetadata>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(SmearVariableMetadataImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
