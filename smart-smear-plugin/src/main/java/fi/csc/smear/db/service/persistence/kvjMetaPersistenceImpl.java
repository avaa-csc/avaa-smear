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

import fi.csc.smear.db.NoSuchkvjMetaException;
import fi.csc.smear.db.model.impl.kvjMetaImpl;
import fi.csc.smear.db.model.impl.kvjMetaModelImpl;
import fi.csc.smear.db.model.kvjMeta;
import fi.csc.smear.db.service.persistence.kvjMetaPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the kvj meta service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author pj
 * @see kvjMetaPersistence
 * @see kvjMetaUtil
 * @generated
 */
public class kvjMetaPersistenceImpl extends BasePersistenceImpl<kvjMeta>
    implements kvjMetaPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link kvjMetaUtil} to access the kvj meta persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = kvjMetaImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(kvjMetaModelImpl.ENTITY_CACHE_ENABLED,
            kvjMetaModelImpl.FINDER_CACHE_ENABLED, kvjMetaImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(kvjMetaModelImpl.ENTITY_CACHE_ENABLED,
            kvjMetaModelImpl.FINDER_CACHE_ENABLED, kvjMetaImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(kvjMetaModelImpl.ENTITY_CACHE_ENABLED,
            kvjMetaModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_KVJMETA = "SELECT kvjMeta FROM kvjMeta kvjMeta";
    private static final String _SQL_COUNT_KVJMETA = "SELECT COUNT(kvjMeta) FROM kvjMeta kvjMeta";
    private static final String _ORDER_BY_ENTITY_ALIAS = "kvjMeta.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No kvjMeta exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(kvjMetaPersistenceImpl.class);
    private static kvjMeta _nullkvjMeta = new kvjMetaImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<kvjMeta> toCacheModel() {
                return _nullkvjMetaCacheModel;
            }
        };

    private static CacheModel<kvjMeta> _nullkvjMetaCacheModel = new CacheModel<kvjMeta>() {
            @Override
            public kvjMeta toEntityModel() {
                return _nullkvjMeta;
            }
        };

    public kvjMetaPersistenceImpl() {
        setModelClass(kvjMeta.class);
    }

    /**
     * Caches the kvj meta in the entity cache if it is enabled.
     *
     * @param kvjMeta the kvj meta
     */
    @Override
    public void cacheResult(kvjMeta kvjMeta) {
        EntityCacheUtil.putResult(kvjMetaModelImpl.ENTITY_CACHE_ENABLED,
            kvjMetaImpl.class, kvjMeta.getPrimaryKey(), kvjMeta);

        kvjMeta.resetOriginalValues();
    }

    /**
     * Caches the kvj metas in the entity cache if it is enabled.
     *
     * @param kvjMetas the kvj metas
     */
    @Override
    public void cacheResult(List<kvjMeta> kvjMetas) {
        for (kvjMeta kvjMeta : kvjMetas) {
            if (EntityCacheUtil.getResult(
                        kvjMetaModelImpl.ENTITY_CACHE_ENABLED,
                        kvjMetaImpl.class, kvjMeta.getPrimaryKey()) == null) {
                cacheResult(kvjMeta);
            } else {
                kvjMeta.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all kvj metas.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(kvjMetaImpl.class.getName());
        }

        EntityCacheUtil.clearCache(kvjMetaImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the kvj meta.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(kvjMeta kvjMeta) {
        EntityCacheUtil.removeResult(kvjMetaModelImpl.ENTITY_CACHE_ENABLED,
            kvjMetaImpl.class, kvjMeta.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<kvjMeta> kvjMetas) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (kvjMeta kvjMeta : kvjMetas) {
            EntityCacheUtil.removeResult(kvjMetaModelImpl.ENTITY_CACHE_ENABLED,
                kvjMetaImpl.class, kvjMeta.getPrimaryKey());
        }
    }

    /**
     * Creates a new kvj meta with the primary key. Does not add the kvj meta to the database.
     *
     * @param samptime the primary key for the new kvj meta
     * @return the new kvj meta
     */
    @Override
    public kvjMeta create(java.util.Date samptime) {
        kvjMeta kvjMeta = new kvjMetaImpl();

        kvjMeta.setNew(true);
        kvjMeta.setPrimaryKey(samptime);

        return kvjMeta;
    }

    /**
     * Removes the kvj meta with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param samptime the primary key of the kvj meta
     * @return the kvj meta that was removed
     * @throws fi.csc.smear.db.NoSuchkvjMetaException if a kvj meta with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public kvjMeta remove(java.util.Date samptime)
        throws NoSuchkvjMetaException, SystemException {
        return remove((Serializable) samptime);
    }

    /**
     * Removes the kvj meta with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the kvj meta
     * @return the kvj meta that was removed
     * @throws fi.csc.smear.db.NoSuchkvjMetaException if a kvj meta with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public kvjMeta remove(Serializable primaryKey)
        throws NoSuchkvjMetaException, SystemException {
        Session session = null;

        try {
            session = openSession();

            kvjMeta kvjMeta = (kvjMeta) session.get(kvjMetaImpl.class,
                    primaryKey);

            if (kvjMeta == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchkvjMetaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(kvjMeta);
        } catch (NoSuchkvjMetaException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected kvjMeta removeImpl(kvjMeta kvjMeta) throws SystemException {
        kvjMeta = toUnwrappedModel(kvjMeta);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(kvjMeta)) {
                kvjMeta = (kvjMeta) session.get(kvjMetaImpl.class,
                        kvjMeta.getPrimaryKeyObj());
            }

            if (kvjMeta != null) {
                session.delete(kvjMeta);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (kvjMeta != null) {
            clearCache(kvjMeta);
        }

        return kvjMeta;
    }

    @Override
    public kvjMeta updateImpl(fi.csc.smear.db.model.kvjMeta kvjMeta)
        throws SystemException {
        kvjMeta = toUnwrappedModel(kvjMeta);

        boolean isNew = kvjMeta.isNew();

        Session session = null;

        try {
            session = openSession();

            if (kvjMeta.isNew()) {
                session.save(kvjMeta);

                kvjMeta.setNew(false);
            } else {
                session.merge(kvjMeta);
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

        EntityCacheUtil.putResult(kvjMetaModelImpl.ENTITY_CACHE_ENABLED,
            kvjMetaImpl.class, kvjMeta.getPrimaryKey(), kvjMeta);

        return kvjMeta;
    }

    protected kvjMeta toUnwrappedModel(kvjMeta kvjMeta) {
        if (kvjMeta instanceof kvjMetaImpl) {
            return kvjMeta;
        }

        kvjMetaImpl kvjMetaImpl = new kvjMetaImpl();

        kvjMetaImpl.setNew(kvjMeta.isNew());
        kvjMetaImpl.setPrimaryKey(kvjMeta.getPrimaryKey());

        kvjMetaImpl.setSamptime(kvjMeta.getSamptime());
        kvjMetaImpl.setTw2(kvjMeta.getTw2());
        kvjMetaImpl.setTw5(kvjMeta.getTw5());
        kvjMetaImpl.setTw10(kvjMeta.getTw10());
        kvjMetaImpl.setTw15(kvjMeta.getTw15());
        kvjMetaImpl.setTw20(kvjMeta.getTw20());
        kvjMetaImpl.setTw25(kvjMeta.getTw25());
        kvjMetaImpl.setTw30(kvjMeta.getTw30());
        kvjMetaImpl.setTw35(kvjMeta.getTw35());
        kvjMetaImpl.setTw40(kvjMeta.getTw40());
        kvjMetaImpl.setTw45(kvjMeta.getTw45());
        kvjMetaImpl.setTw50(kvjMeta.getTw50());
        kvjMetaImpl.setTw60(kvjMeta.getTw60());
        kvjMetaImpl.setTw70(kvjMeta.getTw70());
        kvjMetaImpl.setTw80(kvjMeta.getTw80());
        kvjMetaImpl.setTw100(kvjMeta.getTw100());
        kvjMetaImpl.setTw120(kvjMeta.getTw120());
        kvjMetaImpl.setCO2w02(kvjMeta.getCO2w02());
        kvjMetaImpl.setCO2w15(kvjMeta.getCO2w15());
        kvjMetaImpl.setCO2w25(kvjMeta.getCO2w25());
        kvjMetaImpl.setCO2w70(kvjMeta.getCO2w70());
        kvjMetaImpl.setGlob(kvjMeta.getGlob());
        kvjMetaImpl.setRGlob(kvjMeta.getRGlob());
        kvjMetaImpl.setLWin(kvjMeta.getLWin());
        kvjMetaImpl.setLWout(kvjMeta.getLWout());
        kvjMetaImpl.setPARw02(kvjMeta.getPARw02());
        kvjMetaImpl.setPARw07(kvjMeta.getPARw07());
        kvjMetaImpl.setPARw10(kvjMeta.getPARw10());
        kvjMetaImpl.setTa(kvjMeta.getTa());
        kvjMetaImpl.setRH(kvjMeta.getRH());
        kvjMetaImpl.setTw2_EMEP(kvjMeta.getTw2_EMEP());
        kvjMetaImpl.setTw5_EMEP(kvjMeta.getTw5_EMEP());
        kvjMetaImpl.setTw10_EMEP(kvjMeta.getTw10_EMEP());
        kvjMetaImpl.setTw15_EMEP(kvjMeta.getTw15_EMEP());
        kvjMetaImpl.setTw20_EMEP(kvjMeta.getTw20_EMEP());
        kvjMetaImpl.setTw25_EMEP(kvjMeta.getTw25_EMEP());
        kvjMetaImpl.setTw30_EMEP(kvjMeta.getTw30_EMEP());
        kvjMetaImpl.setTw35_EMEP(kvjMeta.getTw35_EMEP());
        kvjMetaImpl.setTw40_EMEP(kvjMeta.getTw40_EMEP());
        kvjMetaImpl.setTw45_EMEP(kvjMeta.getTw45_EMEP());
        kvjMetaImpl.setTw50_EMEP(kvjMeta.getTw50_EMEP());
        kvjMetaImpl.setTw60_EMEP(kvjMeta.getTw60_EMEP());
        kvjMetaImpl.setTw70_EMEP(kvjMeta.getTw70_EMEP());
        kvjMetaImpl.setTw80_EMEP(kvjMeta.getTw80_EMEP());
        kvjMetaImpl.setTw100_EMEP(kvjMeta.getTw100_EMEP());
        kvjMetaImpl.setTw120_EMEP(kvjMeta.getTw120_EMEP());
        kvjMetaImpl.setCO2w02_EMEP(kvjMeta.getCO2w02_EMEP());
        kvjMetaImpl.setCO2w15_EMEP(kvjMeta.getCO2w15_EMEP());
        kvjMetaImpl.setCO2w25_EMEP(kvjMeta.getCO2w25_EMEP());
        kvjMetaImpl.setCO2w70_EMEP(kvjMeta.getCO2w70_EMEP());
        kvjMetaImpl.setGlob_EMEP(kvjMeta.getGlob_EMEP());
        kvjMetaImpl.setRGlob_EMEP(kvjMeta.getRGlob_EMEP());
        kvjMetaImpl.setLWin_EMEP(kvjMeta.getLWin_EMEP());
        kvjMetaImpl.setLWout_EMEP(kvjMeta.getLWout_EMEP());
        kvjMetaImpl.setPARw02_EMEP(kvjMeta.getPARw02_EMEP());
        kvjMetaImpl.setPARw07_EMEP(kvjMeta.getPARw07_EMEP());
        kvjMetaImpl.setPARw10_EMEP(kvjMeta.getPARw10_EMEP());
        kvjMetaImpl.setTa_EMEP(kvjMeta.getTa_EMEP());
        kvjMetaImpl.setRH_EMEP(kvjMeta.getRH_EMEP());

        return kvjMetaImpl;
    }

    /**
     * Returns the kvj meta with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the kvj meta
     * @return the kvj meta
     * @throws fi.csc.smear.db.NoSuchkvjMetaException if a kvj meta with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public kvjMeta findByPrimaryKey(Serializable primaryKey)
        throws NoSuchkvjMetaException, SystemException {
        kvjMeta kvjMeta = fetchByPrimaryKey(primaryKey);

        if (kvjMeta == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchkvjMetaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return kvjMeta;
    }

    /**
     * Returns the kvj meta with the primary key or throws a {@link fi.csc.smear.db.NoSuchkvjMetaException} if it could not be found.
     *
     * @param samptime the primary key of the kvj meta
     * @return the kvj meta
     * @throws fi.csc.smear.db.NoSuchkvjMetaException if a kvj meta with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public kvjMeta findByPrimaryKey(java.util.Date samptime)
        throws NoSuchkvjMetaException, SystemException {
        return findByPrimaryKey((Serializable) samptime);
    }

    /**
     * Returns the kvj meta with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the kvj meta
     * @return the kvj meta, or <code>null</code> if a kvj meta with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public kvjMeta fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        kvjMeta kvjMeta = (kvjMeta) EntityCacheUtil.getResult(kvjMetaModelImpl.ENTITY_CACHE_ENABLED,
                kvjMetaImpl.class, primaryKey);

        if (kvjMeta == _nullkvjMeta) {
            return null;
        }

        if (kvjMeta == null) {
            Session session = null;

            try {
                session = openSession();

                kvjMeta = (kvjMeta) session.get(kvjMetaImpl.class, primaryKey);

                if (kvjMeta != null) {
                    cacheResult(kvjMeta);
                } else {
                    EntityCacheUtil.putResult(kvjMetaModelImpl.ENTITY_CACHE_ENABLED,
                        kvjMetaImpl.class, primaryKey, _nullkvjMeta);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(kvjMetaModelImpl.ENTITY_CACHE_ENABLED,
                    kvjMetaImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return kvjMeta;
    }

    /**
     * Returns the kvj meta with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param samptime the primary key of the kvj meta
     * @return the kvj meta, or <code>null</code> if a kvj meta with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public kvjMeta fetchByPrimaryKey(java.util.Date samptime)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) samptime);
    }

    /**
     * Returns all the kvj metas.
     *
     * @return the kvj metas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<kvjMeta> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the kvj metas.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.kvjMetaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of kvj metas
     * @param end the upper bound of the range of kvj metas (not inclusive)
     * @return the range of kvj metas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<kvjMeta> findAll(int start, int end) throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the kvj metas.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.kvjMetaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of kvj metas
     * @param end the upper bound of the range of kvj metas (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of kvj metas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<kvjMeta> findAll(int start, int end,
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

        List<kvjMeta> list = (List<kvjMeta>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_KVJMETA);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_KVJMETA;

                if (pagination) {
                    sql = sql.concat(kvjMetaModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<kvjMeta>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<kvjMeta>(list);
                } else {
                    list = (List<kvjMeta>) QueryUtil.list(q, getDialect(),
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
     * Removes all the kvj metas from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (kvjMeta kvjMeta : findAll()) {
            remove(kvjMeta);
        }
    }

    /**
     * Returns the number of kvj metas.
     *
     * @return the number of kvj metas
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

                Query q = session.createQuery(_SQL_COUNT_KVJMETA);

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
     * Initializes the kvj meta persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.fi.csc.smear.db.model.kvjMeta")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<kvjMeta>> listenersList = new ArrayList<ModelListener<kvjMeta>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<kvjMeta>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(kvjMetaImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
