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

import fi.csc.smear.db.NoSuchSii2metaException;
import fi.csc.smear.db.model.Sii2meta;
import fi.csc.smear.db.model.impl.Sii2metaImpl;
import fi.csc.smear.db.model.impl.Sii2metaModelImpl;
import fi.csc.smear.db.service.persistence.Sii2metaPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the sii2meta service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author pj
 * @see Sii2metaPersistence
 * @see Sii2metaUtil
 * @generated
 */
public class Sii2metaPersistenceImpl extends BasePersistenceImpl<Sii2meta>
    implements Sii2metaPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link Sii2metaUtil} to access the sii2meta persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = Sii2metaImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(Sii2metaModelImpl.ENTITY_CACHE_ENABLED,
            Sii2metaModelImpl.FINDER_CACHE_ENABLED, Sii2metaImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(Sii2metaModelImpl.ENTITY_CACHE_ENABLED,
            Sii2metaModelImpl.FINDER_CACHE_ENABLED, Sii2metaImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(Sii2metaModelImpl.ENTITY_CACHE_ENABLED,
            Sii2metaModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_SII2META = "SELECT sii2meta FROM Sii2meta sii2meta";
    private static final String _SQL_COUNT_SII2META = "SELECT COUNT(sii2meta) FROM Sii2meta sii2meta";
    private static final String _ORDER_BY_ENTITY_ALIAS = "sii2meta.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Sii2meta exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(Sii2metaPersistenceImpl.class);
    private static Sii2meta _nullSii2meta = new Sii2metaImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Sii2meta> toCacheModel() {
                return _nullSii2metaCacheModel;
            }
        };

    private static CacheModel<Sii2meta> _nullSii2metaCacheModel = new CacheModel<Sii2meta>() {
            @Override
            public Sii2meta toEntityModel() {
                return _nullSii2meta;
            }
        };

    public Sii2metaPersistenceImpl() {
        setModelClass(Sii2meta.class);
    }

    /**
     * Caches the sii2meta in the entity cache if it is enabled.
     *
     * @param sii2meta the sii2meta
     */
    @Override
    public void cacheResult(Sii2meta sii2meta) {
        EntityCacheUtil.putResult(Sii2metaModelImpl.ENTITY_CACHE_ENABLED,
            Sii2metaImpl.class, sii2meta.getPrimaryKey(), sii2meta);

        sii2meta.resetOriginalValues();
    }

    /**
     * Caches the sii2metas in the entity cache if it is enabled.
     *
     * @param sii2metas the sii2metas
     */
    @Override
    public void cacheResult(List<Sii2meta> sii2metas) {
        for (Sii2meta sii2meta : sii2metas) {
            if (EntityCacheUtil.getResult(
                        Sii2metaModelImpl.ENTITY_CACHE_ENABLED,
                        Sii2metaImpl.class, sii2meta.getPrimaryKey()) == null) {
                cacheResult(sii2meta);
            } else {
                sii2meta.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all sii2metas.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(Sii2metaImpl.class.getName());
        }

        EntityCacheUtil.clearCache(Sii2metaImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the sii2meta.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Sii2meta sii2meta) {
        EntityCacheUtil.removeResult(Sii2metaModelImpl.ENTITY_CACHE_ENABLED,
            Sii2metaImpl.class, sii2meta.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<Sii2meta> sii2metas) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Sii2meta sii2meta : sii2metas) {
            EntityCacheUtil.removeResult(Sii2metaModelImpl.ENTITY_CACHE_ENABLED,
                Sii2metaImpl.class, sii2meta.getPrimaryKey());
        }
    }

    /**
     * Creates a new sii2meta with the primary key. Does not add the sii2meta to the database.
     *
     * @param samptime the primary key for the new sii2meta
     * @return the new sii2meta
     */
    @Override
    public Sii2meta create(java.util.Date samptime) {
        Sii2meta sii2meta = new Sii2metaImpl();

        sii2meta.setNew(true);
        sii2meta.setPrimaryKey(samptime);

        return sii2meta;
    }

    /**
     * Removes the sii2meta with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param samptime the primary key of the sii2meta
     * @return the sii2meta that was removed
     * @throws fi.csc.smear.db.NoSuchSii2metaException if a sii2meta with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Sii2meta remove(java.util.Date samptime)
        throws NoSuchSii2metaException, SystemException {
        return remove((Serializable) samptime);
    }

    /**
     * Removes the sii2meta with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the sii2meta
     * @return the sii2meta that was removed
     * @throws fi.csc.smear.db.NoSuchSii2metaException if a sii2meta with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Sii2meta remove(Serializable primaryKey)
        throws NoSuchSii2metaException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Sii2meta sii2meta = (Sii2meta) session.get(Sii2metaImpl.class,
                    primaryKey);

            if (sii2meta == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchSii2metaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(sii2meta);
        } catch (NoSuchSii2metaException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Sii2meta removeImpl(Sii2meta sii2meta) throws SystemException {
        sii2meta = toUnwrappedModel(sii2meta);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(sii2meta)) {
                sii2meta = (Sii2meta) session.get(Sii2metaImpl.class,
                        sii2meta.getPrimaryKeyObj());
            }

            if (sii2meta != null) {
                session.delete(sii2meta);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (sii2meta != null) {
            clearCache(sii2meta);
        }

        return sii2meta;
    }

    @Override
    public Sii2meta updateImpl(fi.csc.smear.db.model.Sii2meta sii2meta)
        throws SystemException {
        sii2meta = toUnwrappedModel(sii2meta);

        boolean isNew = sii2meta.isNew();

        Session session = null;

        try {
            session = openSession();

            if (sii2meta.isNew()) {
                session.save(sii2meta);

                sii2meta.setNew(false);
            } else {
                session.merge(sii2meta);
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

        EntityCacheUtil.putResult(Sii2metaModelImpl.ENTITY_CACHE_ENABLED,
            Sii2metaImpl.class, sii2meta.getPrimaryKey(), sii2meta);

        return sii2meta;
    }

    protected Sii2meta toUnwrappedModel(Sii2meta sii2meta) {
        if (sii2meta instanceof Sii2metaImpl) {
            return sii2meta;
        }

        Sii2metaImpl sii2metaImpl = new Sii2metaImpl();

        sii2metaImpl.setNew(sii2meta.isNew());
        sii2metaImpl.setPrimaryKey(sii2meta.getPrimaryKey());

        sii2metaImpl.setSamptime(sii2meta.getSamptime());
        sii2metaImpl.setT_a(sii2meta.getT_a());
        sii2metaImpl.setT_a_EMEP(sii2meta.getT_a_EMEP());
        sii2metaImpl.setRH(sii2meta.getRH());
        sii2metaImpl.setRH_EMEP(sii2meta.getRH_EMEP());
        sii2metaImpl.setNet(sii2meta.getNet());
        sii2metaImpl.setNet_EMEP(sii2meta.getNet_EMEP());
        sii2metaImpl.setT_p_5(sii2meta.getT_p_5());
        sii2metaImpl.setT_p_5_EMEP(sii2meta.getT_p_5_EMEP());
        sii2metaImpl.setT_p_B20(sii2meta.getT_p_B20());
        sii2metaImpl.setT_p_B20_EMEP(sii2meta.getT_p_B20_EMEP());
        sii2metaImpl.setT_p_B35(sii2meta.getT_p_B35());
        sii2metaImpl.setT_p_B35_EMEP(sii2meta.getT_p_B35_EMEP());
        sii2metaImpl.setT_p_B50(sii2meta.getT_p_B50());
        sii2metaImpl.setT_p_B50_EMEP(sii2meta.getT_p_B50_EMEP());
        sii2metaImpl.setWTD(sii2meta.getWTD());
        sii2metaImpl.setWTD_EMEP(sii2meta.getWTD_EMEP());
        sii2metaImpl.setPrecip(sii2meta.getPrecip());
        sii2metaImpl.setPrecip_EMEP(sii2meta.getPrecip_EMEP());

        return sii2metaImpl;
    }

    /**
     * Returns the sii2meta with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the sii2meta
     * @return the sii2meta
     * @throws fi.csc.smear.db.NoSuchSii2metaException if a sii2meta with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Sii2meta findByPrimaryKey(Serializable primaryKey)
        throws NoSuchSii2metaException, SystemException {
        Sii2meta sii2meta = fetchByPrimaryKey(primaryKey);

        if (sii2meta == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchSii2metaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return sii2meta;
    }

    /**
     * Returns the sii2meta with the primary key or throws a {@link fi.csc.smear.db.NoSuchSii2metaException} if it could not be found.
     *
     * @param samptime the primary key of the sii2meta
     * @return the sii2meta
     * @throws fi.csc.smear.db.NoSuchSii2metaException if a sii2meta with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Sii2meta findByPrimaryKey(java.util.Date samptime)
        throws NoSuchSii2metaException, SystemException {
        return findByPrimaryKey((Serializable) samptime);
    }

    /**
     * Returns the sii2meta with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the sii2meta
     * @return the sii2meta, or <code>null</code> if a sii2meta with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Sii2meta fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Sii2meta sii2meta = (Sii2meta) EntityCacheUtil.getResult(Sii2metaModelImpl.ENTITY_CACHE_ENABLED,
                Sii2metaImpl.class, primaryKey);

        if (sii2meta == _nullSii2meta) {
            return null;
        }

        if (sii2meta == null) {
            Session session = null;

            try {
                session = openSession();

                sii2meta = (Sii2meta) session.get(Sii2metaImpl.class, primaryKey);

                if (sii2meta != null) {
                    cacheResult(sii2meta);
                } else {
                    EntityCacheUtil.putResult(Sii2metaModelImpl.ENTITY_CACHE_ENABLED,
                        Sii2metaImpl.class, primaryKey, _nullSii2meta);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(Sii2metaModelImpl.ENTITY_CACHE_ENABLED,
                    Sii2metaImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return sii2meta;
    }

    /**
     * Returns the sii2meta with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param samptime the primary key of the sii2meta
     * @return the sii2meta, or <code>null</code> if a sii2meta with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Sii2meta fetchByPrimaryKey(java.util.Date samptime)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) samptime);
    }

    /**
     * Returns all the sii2metas.
     *
     * @return the sii2metas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Sii2meta> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the sii2metas.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.Sii2metaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of sii2metas
     * @param end the upper bound of the range of sii2metas (not inclusive)
     * @return the range of sii2metas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Sii2meta> findAll(int start, int end) throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the sii2metas.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.Sii2metaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of sii2metas
     * @param end the upper bound of the range of sii2metas (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of sii2metas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Sii2meta> findAll(int start, int end,
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

        List<Sii2meta> list = (List<Sii2meta>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_SII2META);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_SII2META;

                if (pagination) {
                    sql = sql.concat(Sii2metaModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Sii2meta>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Sii2meta>(list);
                } else {
                    list = (List<Sii2meta>) QueryUtil.list(q, getDialect(),
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
     * Removes all the sii2metas from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Sii2meta sii2meta : findAll()) {
            remove(sii2meta);
        }
    }

    /**
     * Returns the number of sii2metas.
     *
     * @return the number of sii2metas
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

                Query q = session.createQuery(_SQL_COUNT_SII2META);

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
     * Initializes the sii2meta persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.fi.csc.smear.db.model.Sii2meta")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Sii2meta>> listenersList = new ArrayList<ModelListener<Sii2meta>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Sii2meta>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(Sii2metaImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
