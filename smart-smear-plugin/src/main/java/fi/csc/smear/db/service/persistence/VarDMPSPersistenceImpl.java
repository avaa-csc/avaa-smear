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

import fi.csc.smear.db.NoSuchVarDMPSException;
import fi.csc.smear.db.model.VarDMPS;
import fi.csc.smear.db.model.impl.VarDMPSImpl;
import fi.csc.smear.db.model.impl.VarDMPSModelImpl;
import fi.csc.smear.db.service.persistence.VarDMPSPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the var d m p s service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author pj
 * @see VarDMPSPersistence
 * @see VarDMPSUtil
 * @generated
 */
public class VarDMPSPersistenceImpl extends BasePersistenceImpl<VarDMPS>
    implements VarDMPSPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link VarDMPSUtil} to access the var d m p s persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = VarDMPSImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VarDMPSModelImpl.ENTITY_CACHE_ENABLED,
            VarDMPSModelImpl.FINDER_CACHE_ENABLED, VarDMPSImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VarDMPSModelImpl.ENTITY_CACHE_ENABLED,
            VarDMPSModelImpl.FINDER_CACHE_ENABLED, VarDMPSImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VarDMPSModelImpl.ENTITY_CACHE_ENABLED,
            VarDMPSModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_VARDMPS = "SELECT varDMPS FROM VarDMPS varDMPS";
    private static final String _SQL_COUNT_VARDMPS = "SELECT COUNT(varDMPS) FROM VarDMPS varDMPS";
    private static final String _ORDER_BY_ENTITY_ALIAS = "varDMPS.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VarDMPS exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(VarDMPSPersistenceImpl.class);
    private static VarDMPS _nullVarDMPS = new VarDMPSImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<VarDMPS> toCacheModel() {
                return _nullVarDMPSCacheModel;
            }
        };

    private static CacheModel<VarDMPS> _nullVarDMPSCacheModel = new CacheModel<VarDMPS>() {
            @Override
            public VarDMPS toEntityModel() {
                return _nullVarDMPS;
            }
        };

    public VarDMPSPersistenceImpl() {
        setModelClass(VarDMPS.class);
    }

    /**
     * Caches the var d m p s in the entity cache if it is enabled.
     *
     * @param varDMPS the var d m p s
     */
    @Override
    public void cacheResult(VarDMPS varDMPS) {
        EntityCacheUtil.putResult(VarDMPSModelImpl.ENTITY_CACHE_ENABLED,
            VarDMPSImpl.class, varDMPS.getPrimaryKey(), varDMPS);

        varDMPS.resetOriginalValues();
    }

    /**
     * Caches the var d m p ses in the entity cache if it is enabled.
     *
     * @param varDMPSs the var d m p ses
     */
    @Override
    public void cacheResult(List<VarDMPS> varDMPSs) {
        for (VarDMPS varDMPS : varDMPSs) {
            if (EntityCacheUtil.getResult(
                        VarDMPSModelImpl.ENTITY_CACHE_ENABLED,
                        VarDMPSImpl.class, varDMPS.getPrimaryKey()) == null) {
                cacheResult(varDMPS);
            } else {
                varDMPS.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all var d m p ses.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(VarDMPSImpl.class.getName());
        }

        EntityCacheUtil.clearCache(VarDMPSImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the var d m p s.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(VarDMPS varDMPS) {
        EntityCacheUtil.removeResult(VarDMPSModelImpl.ENTITY_CACHE_ENABLED,
            VarDMPSImpl.class, varDMPS.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<VarDMPS> varDMPSs) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (VarDMPS varDMPS : varDMPSs) {
            EntityCacheUtil.removeResult(VarDMPSModelImpl.ENTITY_CACHE_ENABLED,
                VarDMPSImpl.class, varDMPS.getPrimaryKey());
        }
    }

    /**
     * Creates a new var d m p s with the primary key. Does not add the var d m p s to the database.
     *
     * @param samptime the primary key for the new var d m p s
     * @return the new var d m p s
     */
    @Override
    public VarDMPS create(java.util.Date samptime) {
        VarDMPS varDMPS = new VarDMPSImpl();

        varDMPS.setNew(true);
        varDMPS.setPrimaryKey(samptime);

        return varDMPS;
    }

    /**
     * Removes the var d m p s with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param samptime the primary key of the var d m p s
     * @return the var d m p s that was removed
     * @throws fi.csc.smear.db.NoSuchVarDMPSException if a var d m p s with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public VarDMPS remove(java.util.Date samptime)
        throws NoSuchVarDMPSException, SystemException {
        return remove((Serializable) samptime);
    }

    /**
     * Removes the var d m p s with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the var d m p s
     * @return the var d m p s that was removed
     * @throws fi.csc.smear.db.NoSuchVarDMPSException if a var d m p s with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public VarDMPS remove(Serializable primaryKey)
        throws NoSuchVarDMPSException, SystemException {
        Session session = null;

        try {
            session = openSession();

            VarDMPS varDMPS = (VarDMPS) session.get(VarDMPSImpl.class,
                    primaryKey);

            if (varDMPS == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchVarDMPSException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(varDMPS);
        } catch (NoSuchVarDMPSException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected VarDMPS removeImpl(VarDMPS varDMPS) throws SystemException {
        varDMPS = toUnwrappedModel(varDMPS);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(varDMPS)) {
                varDMPS = (VarDMPS) session.get(VarDMPSImpl.class,
                        varDMPS.getPrimaryKeyObj());
            }

            if (varDMPS != null) {
                session.delete(varDMPS);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (varDMPS != null) {
            clearCache(varDMPS);
        }

        return varDMPS;
    }

    @Override
    public VarDMPS updateImpl(fi.csc.smear.db.model.VarDMPS varDMPS)
        throws SystemException {
        varDMPS = toUnwrappedModel(varDMPS);

        boolean isNew = varDMPS.isNew();

        Session session = null;

        try {
            session = openSession();

            if (varDMPS.isNew()) {
                session.save(varDMPS);

                varDMPS.setNew(false);
            } else {
                session.merge(varDMPS);
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

        EntityCacheUtil.putResult(VarDMPSModelImpl.ENTITY_CACHE_ENABLED,
            VarDMPSImpl.class, varDMPS.getPrimaryKey(), varDMPS);

        return varDMPS;
    }

    protected VarDMPS toUnwrappedModel(VarDMPS varDMPS) {
        if (varDMPS instanceof VarDMPSImpl) {
            return varDMPS;
        }

        VarDMPSImpl varDMPSImpl = new VarDMPSImpl();

        varDMPSImpl.setNew(varDMPS.isNew());
        varDMPSImpl.setPrimaryKey(varDMPS.getPrimaryKey());

        varDMPSImpl.setSamptime(varDMPS.getSamptime());
        varDMPSImpl.setT1(varDMPS.getT1());
        varDMPSImpl.setT2(varDMPS.getT2());
        varDMPSImpl.setP1(varDMPS.getP1());
        varDMPSImpl.setP2(varDMPS.getP2());
        varDMPSImpl.setRh1(varDMPS.getRh1());
        varDMPSImpl.setRh2(varDMPS.getRh2());
        varDMPSImpl.setD100e1(varDMPS.getD100e1());
        varDMPSImpl.setD112e1(varDMPS.getD112e1());
        varDMPSImpl.setD126e1(varDMPS.getD126e1());
        varDMPSImpl.setD141e1(varDMPS.getD141e1());
        varDMPSImpl.setD158e1(varDMPS.getD158e1());
        varDMPSImpl.setD178e1(varDMPS.getD178e1());
        varDMPSImpl.setD200e1(varDMPS.getD200e1());
        varDMPSImpl.setD224e1(varDMPS.getD224e1());
        varDMPSImpl.setD251e1(varDMPS.getD251e1());
        varDMPSImpl.setD282e1(varDMPS.getD282e1());
        varDMPSImpl.setD316e1(varDMPS.getD316e1());
        varDMPSImpl.setD355e1(varDMPS.getD355e1());
        varDMPSImpl.setD398e1(varDMPS.getD398e1());
        varDMPSImpl.setD447e1(varDMPS.getD447e1());
        varDMPSImpl.setD501e1(varDMPS.getD501e1());
        varDMPSImpl.setD562e1(varDMPS.getD562e1());
        varDMPSImpl.setD631e1(varDMPS.getD631e1());
        varDMPSImpl.setD708e1(varDMPS.getD708e1());
        varDMPSImpl.setD794e1(varDMPS.getD794e1());
        varDMPSImpl.setD891e1(varDMPS.getD891e1());
        varDMPSImpl.setD100e2(varDMPS.getD100e2());
        varDMPSImpl.setD112e2(varDMPS.getD112e2());
        varDMPSImpl.setD126e2(varDMPS.getD126e2());
        varDMPSImpl.setD141e2(varDMPS.getD141e2());
        varDMPSImpl.setD158e2(varDMPS.getD158e2());
        varDMPSImpl.setD178e2(varDMPS.getD178e2());
        varDMPSImpl.setD200e2(varDMPS.getD200e2());
        varDMPSImpl.setD224e2(varDMPS.getD224e2());
        varDMPSImpl.setD251e2(varDMPS.getD251e2());
        varDMPSImpl.setD282e2(varDMPS.getD282e2());
        varDMPSImpl.setD316e2(varDMPS.getD316e2());
        varDMPSImpl.setD355e2(varDMPS.getD355e2());
        varDMPSImpl.setD398e2(varDMPS.getD398e2());
        varDMPSImpl.setD447e2(varDMPS.getD447e2());
        varDMPSImpl.setD501e2(varDMPS.getD501e2());
        varDMPSImpl.setD562e2(varDMPS.getD562e2());
        varDMPSImpl.setD631e2(varDMPS.getD631e2());
        varDMPSImpl.setD708e2(varDMPS.getD708e2());
        varDMPSImpl.setD794e2(varDMPS.getD794e2());
        varDMPSImpl.setD891e2(varDMPS.getD891e2());
        varDMPSImpl.setD100e3(varDMPS.getD100e3());
        varDMPSImpl.setD112e3(varDMPS.getD112e3());
        varDMPSImpl.setD126e3(varDMPS.getD126e3());
        varDMPSImpl.setD141e3(varDMPS.getD141e3());
        varDMPSImpl.setD158e3(varDMPS.getD158e3());
        varDMPSImpl.setD178e3(varDMPS.getD178e3());
        varDMPSImpl.setD200e3(varDMPS.getD200e3());
        varDMPSImpl.setD224e3(varDMPS.getD224e3());
        varDMPSImpl.setD251e3(varDMPS.getD251e3());
        varDMPSImpl.setD282e3(varDMPS.getD282e3());
        varDMPSImpl.setD316e3(varDMPS.getD316e3());
        varDMPSImpl.setD355e3(varDMPS.getD355e3());
        varDMPSImpl.setD398e3(varDMPS.getD398e3());
        varDMPSImpl.setD447e3(varDMPS.getD447e3());
        varDMPSImpl.setD501e3(varDMPS.getD501e3());
        varDMPSImpl.setD562e3(varDMPS.getD562e3());
        varDMPSImpl.setD631e3(varDMPS.getD631e3());
        varDMPSImpl.setD708e3(varDMPS.getD708e3());
        varDMPSImpl.setD794e3(varDMPS.getD794e3());
        varDMPSImpl.setD891e3(varDMPS.getD891e3());
        varDMPSImpl.setD100e4(varDMPS.getD100e4());
        varDMPSImpl.setTconc(varDMPS.getTconc());

        return varDMPSImpl;
    }

    /**
     * Returns the var d m p s with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the var d m p s
     * @return the var d m p s
     * @throws fi.csc.smear.db.NoSuchVarDMPSException if a var d m p s with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public VarDMPS findByPrimaryKey(Serializable primaryKey)
        throws NoSuchVarDMPSException, SystemException {
        VarDMPS varDMPS = fetchByPrimaryKey(primaryKey);

        if (varDMPS == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchVarDMPSException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return varDMPS;
    }

    /**
     * Returns the var d m p s with the primary key or throws a {@link fi.csc.smear.db.NoSuchVarDMPSException} if it could not be found.
     *
     * @param samptime the primary key of the var d m p s
     * @return the var d m p s
     * @throws fi.csc.smear.db.NoSuchVarDMPSException if a var d m p s with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public VarDMPS findByPrimaryKey(java.util.Date samptime)
        throws NoSuchVarDMPSException, SystemException {
        return findByPrimaryKey((Serializable) samptime);
    }

    /**
     * Returns the var d m p s with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the var d m p s
     * @return the var d m p s, or <code>null</code> if a var d m p s with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public VarDMPS fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        VarDMPS varDMPS = (VarDMPS) EntityCacheUtil.getResult(VarDMPSModelImpl.ENTITY_CACHE_ENABLED,
                VarDMPSImpl.class, primaryKey);

        if (varDMPS == _nullVarDMPS) {
            return null;
        }

        if (varDMPS == null) {
            Session session = null;

            try {
                session = openSession();

                varDMPS = (VarDMPS) session.get(VarDMPSImpl.class, primaryKey);

                if (varDMPS != null) {
                    cacheResult(varDMPS);
                } else {
                    EntityCacheUtil.putResult(VarDMPSModelImpl.ENTITY_CACHE_ENABLED,
                        VarDMPSImpl.class, primaryKey, _nullVarDMPS);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(VarDMPSModelImpl.ENTITY_CACHE_ENABLED,
                    VarDMPSImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return varDMPS;
    }

    /**
     * Returns the var d m p s with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param samptime the primary key of the var d m p s
     * @return the var d m p s, or <code>null</code> if a var d m p s with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public VarDMPS fetchByPrimaryKey(java.util.Date samptime)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) samptime);
    }

    /**
     * Returns all the var d m p ses.
     *
     * @return the var d m p ses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<VarDMPS> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the var d m p ses.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.VarDMPSModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of var d m p ses
     * @param end the upper bound of the range of var d m p ses (not inclusive)
     * @return the range of var d m p ses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<VarDMPS> findAll(int start, int end) throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the var d m p ses.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.VarDMPSModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of var d m p ses
     * @param end the upper bound of the range of var d m p ses (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of var d m p ses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<VarDMPS> findAll(int start, int end,
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

        List<VarDMPS> list = (List<VarDMPS>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_VARDMPS);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_VARDMPS;

                if (pagination) {
                    sql = sql.concat(VarDMPSModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<VarDMPS>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<VarDMPS>(list);
                } else {
                    list = (List<VarDMPS>) QueryUtil.list(q, getDialect(),
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
     * Removes all the var d m p ses from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (VarDMPS varDMPS : findAll()) {
            remove(varDMPS);
        }
    }

    /**
     * Returns the number of var d m p ses.
     *
     * @return the number of var d m p ses
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

                Query q = session.createQuery(_SQL_COUNT_VARDMPS);

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
     * Initializes the var d m p s persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.fi.csc.smear.db.model.VarDMPS")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<VarDMPS>> listenersList = new ArrayList<ModelListener<VarDMPS>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<VarDMPS>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(VarDMPSImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
