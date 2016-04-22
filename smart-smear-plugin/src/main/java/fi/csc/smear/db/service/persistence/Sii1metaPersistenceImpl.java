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

import fi.csc.smear.db.NoSuchSii1metaException;
import fi.csc.smear.db.model.Sii1meta;
import fi.csc.smear.db.model.impl.Sii1metaImpl;
import fi.csc.smear.db.model.impl.Sii1metaModelImpl;
import fi.csc.smear.db.service.persistence.Sii1metaPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the sii1meta service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author pj
 * @see Sii1metaPersistence
 * @see Sii1metaUtil
 * @generated
 */
public class Sii1metaPersistenceImpl extends BasePersistenceImpl<Sii1meta>
    implements Sii1metaPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link Sii1metaUtil} to access the sii1meta persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = Sii1metaImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(Sii1metaModelImpl.ENTITY_CACHE_ENABLED,
            Sii1metaModelImpl.FINDER_CACHE_ENABLED, Sii1metaImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(Sii1metaModelImpl.ENTITY_CACHE_ENABLED,
            Sii1metaModelImpl.FINDER_CACHE_ENABLED, Sii1metaImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(Sii1metaModelImpl.ENTITY_CACHE_ENABLED,
            Sii1metaModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_SII1META = "SELECT sii1meta FROM Sii1meta sii1meta";
    private static final String _SQL_COUNT_SII1META = "SELECT COUNT(sii1meta) FROM Sii1meta sii1meta";
    private static final String _ORDER_BY_ENTITY_ALIAS = "sii1meta.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Sii1meta exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(Sii1metaPersistenceImpl.class);
    private static Sii1meta _nullSii1meta = new Sii1metaImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Sii1meta> toCacheModel() {
                return _nullSii1metaCacheModel;
            }
        };

    private static CacheModel<Sii1meta> _nullSii1metaCacheModel = new CacheModel<Sii1meta>() {
            @Override
            public Sii1meta toEntityModel() {
                return _nullSii1meta;
            }
        };

    public Sii1metaPersistenceImpl() {
        setModelClass(Sii1meta.class);
    }

    /**
     * Caches the sii1meta in the entity cache if it is enabled.
     *
     * @param sii1meta the sii1meta
     */
    @Override
    public void cacheResult(Sii1meta sii1meta) {
        EntityCacheUtil.putResult(Sii1metaModelImpl.ENTITY_CACHE_ENABLED,
            Sii1metaImpl.class, sii1meta.getPrimaryKey(), sii1meta);

        sii1meta.resetOriginalValues();
    }

    /**
     * Caches the sii1metas in the entity cache if it is enabled.
     *
     * @param sii1metas the sii1metas
     */
    @Override
    public void cacheResult(List<Sii1meta> sii1metas) {
        for (Sii1meta sii1meta : sii1metas) {
            if (EntityCacheUtil.getResult(
                        Sii1metaModelImpl.ENTITY_CACHE_ENABLED,
                        Sii1metaImpl.class, sii1meta.getPrimaryKey()) == null) {
                cacheResult(sii1meta);
            } else {
                sii1meta.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all sii1metas.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(Sii1metaImpl.class.getName());
        }

        EntityCacheUtil.clearCache(Sii1metaImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the sii1meta.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Sii1meta sii1meta) {
        EntityCacheUtil.removeResult(Sii1metaModelImpl.ENTITY_CACHE_ENABLED,
            Sii1metaImpl.class, sii1meta.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<Sii1meta> sii1metas) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Sii1meta sii1meta : sii1metas) {
            EntityCacheUtil.removeResult(Sii1metaModelImpl.ENTITY_CACHE_ENABLED,
                Sii1metaImpl.class, sii1meta.getPrimaryKey());
        }
    }

    /**
     * Creates a new sii1meta with the primary key. Does not add the sii1meta to the database.
     *
     * @param samptime the primary key for the new sii1meta
     * @return the new sii1meta
     */
    @Override
    public Sii1meta create(java.util.Date samptime) {
        Sii1meta sii1meta = new Sii1metaImpl();

        sii1meta.setNew(true);
        sii1meta.setPrimaryKey(samptime);

        return sii1meta;
    }

    /**
     * Removes the sii1meta with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param samptime the primary key of the sii1meta
     * @return the sii1meta that was removed
     * @throws fi.csc.smear.db.NoSuchSii1metaException if a sii1meta with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Sii1meta remove(java.util.Date samptime)
        throws NoSuchSii1metaException, SystemException {
        return remove((Serializable) samptime);
    }

    /**
     * Removes the sii1meta with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the sii1meta
     * @return the sii1meta that was removed
     * @throws fi.csc.smear.db.NoSuchSii1metaException if a sii1meta with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Sii1meta remove(Serializable primaryKey)
        throws NoSuchSii1metaException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Sii1meta sii1meta = (Sii1meta) session.get(Sii1metaImpl.class,
                    primaryKey);

            if (sii1meta == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchSii1metaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(sii1meta);
        } catch (NoSuchSii1metaException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Sii1meta removeImpl(Sii1meta sii1meta) throws SystemException {
        sii1meta = toUnwrappedModel(sii1meta);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(sii1meta)) {
                sii1meta = (Sii1meta) session.get(Sii1metaImpl.class,
                        sii1meta.getPrimaryKeyObj());
            }

            if (sii1meta != null) {
                session.delete(sii1meta);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (sii1meta != null) {
            clearCache(sii1meta);
        }

        return sii1meta;
    }

    @Override
    public Sii1meta updateImpl(fi.csc.smear.db.model.Sii1meta sii1meta)
        throws SystemException {
        sii1meta = toUnwrappedModel(sii1meta);

        boolean isNew = sii1meta.isNew();

        Session session = null;

        try {
            session = openSession();

            if (sii1meta.isNew()) {
                session.save(sii1meta);

                sii1meta.setNew(false);
            } else {
                session.merge(sii1meta);
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

        EntityCacheUtil.putResult(Sii1metaModelImpl.ENTITY_CACHE_ENABLED,
            Sii1metaImpl.class, sii1meta.getPrimaryKey(), sii1meta);

        return sii1meta;
    }

    protected Sii1meta toUnwrappedModel(Sii1meta sii1meta) {
        if (sii1meta instanceof Sii1metaImpl) {
            return sii1meta;
        }

        Sii1metaImpl sii1metaImpl = new Sii1metaImpl();

        sii1metaImpl.setNew(sii1meta.isNew());
        sii1metaImpl.setPrimaryKey(sii1meta.getPrimaryKey());

        sii1metaImpl.setSamptime(sii1meta.getSamptime());
        sii1metaImpl.setT_a(sii1meta.getT_a());
        sii1metaImpl.setT_a_EMEP(sii1meta.getT_a_EMEP());
        sii1metaImpl.setRH(sii1meta.getRH());
        sii1metaImpl.setRH_EMEP(sii1meta.getRH_EMEP());
        sii1metaImpl.setPAR(sii1meta.getPAR());
        sii1metaImpl.setPAR_EMEP(sii1meta.getPAR_EMEP());
        sii1metaImpl.setR_PAR(sii1meta.getR_PAR());
        sii1metaImpl.setR_PAR_EMEP(sii1meta.getR_PAR_EMEP());
        sii1metaImpl.setNet_CNR4(sii1meta.getNet_CNR4());
        sii1metaImpl.setNet_CNR4_EMEP(sii1meta.getNet_CNR4_EMEP());
        sii1metaImpl.setNet_NRLite(sii1meta.getNet_NRLite());
        sii1metaImpl.setNet_NRLite_EMEP(sii1meta.getNet_NRLite_EMEP());
        sii1metaImpl.setWsoil_1(sii1meta.getWsoil_1());
        sii1metaImpl.setWsoil_1_EMEP(sii1meta.getWsoil_1_EMEP());
        sii1metaImpl.setWsoil_2(sii1meta.getWsoil_2());
        sii1metaImpl.setWsoil_2_EMEP(sii1meta.getWsoil_2_EMEP());
        sii1metaImpl.setT_p_B5(sii1meta.getT_p_B5());
        sii1metaImpl.setT_p_B5_EMEP(sii1meta.getT_p_B5_EMEP());
        sii1metaImpl.setT_p_B20(sii1meta.getT_p_B20());
        sii1metaImpl.setT_p_B20_EMEP(sii1meta.getT_p_B20_EMEP());
        sii1metaImpl.setT_p_B35(sii1meta.getT_p_B35());
        sii1metaImpl.setT_p_B35_EMEP(sii1meta.getT_p_B35_EMEP());
        sii1metaImpl.setT_p_B50(sii1meta.getT_p_B50());
        sii1metaImpl.setT_p_B50_EMEP(sii1meta.getT_p_B50_EMEP());
        sii1metaImpl.setT_p_C1(sii1meta.getT_p_C1());
        sii1metaImpl.setT_p_C1_EMEP(sii1meta.getT_p_C1_EMEP());
        sii1metaImpl.setT_p_C2(sii1meta.getT_p_C2());
        sii1metaImpl.setT_p_C2_EMEP(sii1meta.getT_p_C2_EMEP());
        sii1metaImpl.setT_p_C5(sii1meta.getT_p_C5());
        sii1metaImpl.setT_p_C5_EMEP(sii1meta.getT_p_C5_EMEP());
        sii1metaImpl.setT_p_C10(sii1meta.getT_p_C10());
        sii1metaImpl.setT_p_C10_EMEP(sii1meta.getT_p_C10_EMEP());
        sii1metaImpl.setT_p_C15(sii1meta.getT_p_C15());
        sii1metaImpl.setT_p_C15_EMEP(sii1meta.getT_p_C15_EMEP());
        sii1metaImpl.setT_p_C20(sii1meta.getT_p_C20());
        sii1metaImpl.setT_p_C20_EMEP(sii1meta.getT_p_C20_EMEP());
        sii1metaImpl.setT_p_C30(sii1meta.getT_p_C30());
        sii1metaImpl.setT_p_C30_EMEP(sii1meta.getT_p_C30_EMEP());
        sii1metaImpl.setT_p_C50(sii1meta.getT_p_C50());
        sii1metaImpl.setT_p_C50_EMEP(sii1meta.getT_p_C50_EMEP());
        sii1metaImpl.setT_p_C70(sii1meta.getT_p_C70());
        sii1metaImpl.setT_p_C70_EMEP(sii1meta.getT_p_C70_EMEP());
        sii1metaImpl.setT_p_C100(sii1meta.getT_p_C100());
        sii1metaImpl.setT_p_C100_EMEP(sii1meta.getT_p_C100_EMEP());
        sii1metaImpl.setWTD(sii1meta.getWTD());
        sii1metaImpl.setWTD_EMEP(sii1meta.getWTD_EMEP());
        sii1metaImpl.setPrecip(sii1meta.getPrecip());
        sii1metaImpl.setPrecip_EMEP(sii1meta.getPrecip_EMEP());

        return sii1metaImpl;
    }

    /**
     * Returns the sii1meta with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the sii1meta
     * @return the sii1meta
     * @throws fi.csc.smear.db.NoSuchSii1metaException if a sii1meta with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Sii1meta findByPrimaryKey(Serializable primaryKey)
        throws NoSuchSii1metaException, SystemException {
        Sii1meta sii1meta = fetchByPrimaryKey(primaryKey);

        if (sii1meta == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchSii1metaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return sii1meta;
    }

    /**
     * Returns the sii1meta with the primary key or throws a {@link fi.csc.smear.db.NoSuchSii1metaException} if it could not be found.
     *
     * @param samptime the primary key of the sii1meta
     * @return the sii1meta
     * @throws fi.csc.smear.db.NoSuchSii1metaException if a sii1meta with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Sii1meta findByPrimaryKey(java.util.Date samptime)
        throws NoSuchSii1metaException, SystemException {
        return findByPrimaryKey((Serializable) samptime);
    }

    /**
     * Returns the sii1meta with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the sii1meta
     * @return the sii1meta, or <code>null</code> if a sii1meta with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Sii1meta fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Sii1meta sii1meta = (Sii1meta) EntityCacheUtil.getResult(Sii1metaModelImpl.ENTITY_CACHE_ENABLED,
                Sii1metaImpl.class, primaryKey);

        if (sii1meta == _nullSii1meta) {
            return null;
        }

        if (sii1meta == null) {
            Session session = null;

            try {
                session = openSession();

                sii1meta = (Sii1meta) session.get(Sii1metaImpl.class, primaryKey);

                if (sii1meta != null) {
                    cacheResult(sii1meta);
                } else {
                    EntityCacheUtil.putResult(Sii1metaModelImpl.ENTITY_CACHE_ENABLED,
                        Sii1metaImpl.class, primaryKey, _nullSii1meta);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(Sii1metaModelImpl.ENTITY_CACHE_ENABLED,
                    Sii1metaImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return sii1meta;
    }

    /**
     * Returns the sii1meta with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param samptime the primary key of the sii1meta
     * @return the sii1meta, or <code>null</code> if a sii1meta with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Sii1meta fetchByPrimaryKey(java.util.Date samptime)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) samptime);
    }

    /**
     * Returns all the sii1metas.
     *
     * @return the sii1metas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Sii1meta> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the sii1metas.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.Sii1metaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of sii1metas
     * @param end the upper bound of the range of sii1metas (not inclusive)
     * @return the range of sii1metas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Sii1meta> findAll(int start, int end) throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the sii1metas.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.Sii1metaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of sii1metas
     * @param end the upper bound of the range of sii1metas (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of sii1metas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Sii1meta> findAll(int start, int end,
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

        List<Sii1meta> list = (List<Sii1meta>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_SII1META);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_SII1META;

                if (pagination) {
                    sql = sql.concat(Sii1metaModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Sii1meta>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Sii1meta>(list);
                } else {
                    list = (List<Sii1meta>) QueryUtil.list(q, getDialect(),
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
     * Removes all the sii1metas from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Sii1meta sii1meta : findAll()) {
            remove(sii1meta);
        }
    }

    /**
     * Returns the number of sii1metas.
     *
     * @return the number of sii1metas
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

                Query q = session.createQuery(_SQL_COUNT_SII1META);

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
     * Initializes the sii1meta persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.fi.csc.smear.db.model.Sii1meta")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Sii1meta>> listenersList = new ArrayList<ModelListener<Sii1meta>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Sii1meta>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(Sii1metaImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
