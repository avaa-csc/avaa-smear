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

import fi.csc.smear.db.NoSuchVarrio_treeException;
import fi.csc.smear.db.model.Varrio_tree;
import fi.csc.smear.db.model.impl.Varrio_treeImpl;
import fi.csc.smear.db.model.impl.Varrio_treeModelImpl;
import fi.csc.smear.db.service.persistence.Varrio_treePersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the varrio_tree service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author pj
 * @see Varrio_treePersistence
 * @see Varrio_treeUtil
 * @generated
 */
public class Varrio_treePersistenceImpl extends BasePersistenceImpl<Varrio_tree>
    implements Varrio_treePersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link Varrio_treeUtil} to access the varrio_tree persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = Varrio_treeImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(Varrio_treeModelImpl.ENTITY_CACHE_ENABLED,
            Varrio_treeModelImpl.FINDER_CACHE_ENABLED, Varrio_treeImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(Varrio_treeModelImpl.ENTITY_CACHE_ENABLED,
            Varrio_treeModelImpl.FINDER_CACHE_ENABLED, Varrio_treeImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(Varrio_treeModelImpl.ENTITY_CACHE_ENABLED,
            Varrio_treeModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_VARRIO_TREE = "SELECT varrio_tree FROM Varrio_tree varrio_tree";
    private static final String _SQL_COUNT_VARRIO_TREE = "SELECT COUNT(varrio_tree) FROM Varrio_tree varrio_tree";
    private static final String _ORDER_BY_ENTITY_ALIAS = "varrio_tree.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Varrio_tree exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(Varrio_treePersistenceImpl.class);
    private static Varrio_tree _nullVarrio_tree = new Varrio_treeImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Varrio_tree> toCacheModel() {
                return _nullVarrio_treeCacheModel;
            }
        };

    private static CacheModel<Varrio_tree> _nullVarrio_treeCacheModel = new CacheModel<Varrio_tree>() {
            @Override
            public Varrio_tree toEntityModel() {
                return _nullVarrio_tree;
            }
        };

    public Varrio_treePersistenceImpl() {
        setModelClass(Varrio_tree.class);
    }

    /**
     * Caches the varrio_tree in the entity cache if it is enabled.
     *
     * @param varrio_tree the varrio_tree
     */
    @Override
    public void cacheResult(Varrio_tree varrio_tree) {
        EntityCacheUtil.putResult(Varrio_treeModelImpl.ENTITY_CACHE_ENABLED,
            Varrio_treeImpl.class, varrio_tree.getPrimaryKey(), varrio_tree);

        varrio_tree.resetOriginalValues();
    }

    /**
     * Caches the varrio_trees in the entity cache if it is enabled.
     *
     * @param varrio_trees the varrio_trees
     */
    @Override
    public void cacheResult(List<Varrio_tree> varrio_trees) {
        for (Varrio_tree varrio_tree : varrio_trees) {
            if (EntityCacheUtil.getResult(
                        Varrio_treeModelImpl.ENTITY_CACHE_ENABLED,
                        Varrio_treeImpl.class, varrio_tree.getPrimaryKey()) == null) {
                cacheResult(varrio_tree);
            } else {
                varrio_tree.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all varrio_trees.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(Varrio_treeImpl.class.getName());
        }

        EntityCacheUtil.clearCache(Varrio_treeImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the varrio_tree.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Varrio_tree varrio_tree) {
        EntityCacheUtil.removeResult(Varrio_treeModelImpl.ENTITY_CACHE_ENABLED,
            Varrio_treeImpl.class, varrio_tree.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<Varrio_tree> varrio_trees) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Varrio_tree varrio_tree : varrio_trees) {
            EntityCacheUtil.removeResult(Varrio_treeModelImpl.ENTITY_CACHE_ENABLED,
                Varrio_treeImpl.class, varrio_tree.getPrimaryKey());
        }
    }

    /**
     * Creates a new varrio_tree with the primary key. Does not add the varrio_tree to the database.
     *
     * @param SAMPTIME the primary key for the new varrio_tree
     * @return the new varrio_tree
     */
    @Override
    public Varrio_tree create(java.util.Date SAMPTIME) {
        Varrio_tree varrio_tree = new Varrio_treeImpl();

        varrio_tree.setNew(true);
        varrio_tree.setPrimaryKey(SAMPTIME);

        return varrio_tree;
    }

    /**
     * Removes the varrio_tree with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param SAMPTIME the primary key of the varrio_tree
     * @return the varrio_tree that was removed
     * @throws fi.csc.smear.db.NoSuchVarrio_treeException if a varrio_tree with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Varrio_tree remove(java.util.Date SAMPTIME)
        throws NoSuchVarrio_treeException, SystemException {
        return remove((Serializable) SAMPTIME);
    }

    /**
     * Removes the varrio_tree with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the varrio_tree
     * @return the varrio_tree that was removed
     * @throws fi.csc.smear.db.NoSuchVarrio_treeException if a varrio_tree with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Varrio_tree remove(Serializable primaryKey)
        throws NoSuchVarrio_treeException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Varrio_tree varrio_tree = (Varrio_tree) session.get(Varrio_treeImpl.class,
                    primaryKey);

            if (varrio_tree == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchVarrio_treeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(varrio_tree);
        } catch (NoSuchVarrio_treeException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Varrio_tree removeImpl(Varrio_tree varrio_tree)
        throws SystemException {
        varrio_tree = toUnwrappedModel(varrio_tree);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(varrio_tree)) {
                varrio_tree = (Varrio_tree) session.get(Varrio_treeImpl.class,
                        varrio_tree.getPrimaryKeyObj());
            }

            if (varrio_tree != null) {
                session.delete(varrio_tree);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (varrio_tree != null) {
            clearCache(varrio_tree);
        }

        return varrio_tree;
    }

    @Override
    public Varrio_tree updateImpl(fi.csc.smear.db.model.Varrio_tree varrio_tree)
        throws SystemException {
        varrio_tree = toUnwrappedModel(varrio_tree);

        boolean isNew = varrio_tree.isNew();

        Session session = null;

        try {
            session = openSession();

            if (varrio_tree.isNew()) {
                session.save(varrio_tree);

                varrio_tree.setNew(false);
            } else {
                session.merge(varrio_tree);
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

        EntityCacheUtil.putResult(Varrio_treeModelImpl.ENTITY_CACHE_ENABLED,
            Varrio_treeImpl.class, varrio_tree.getPrimaryKey(), varrio_tree);

        return varrio_tree;
    }

    protected Varrio_tree toUnwrappedModel(Varrio_tree varrio_tree) {
        if (varrio_tree instanceof Varrio_treeImpl) {
            return varrio_tree;
        }

        Varrio_treeImpl varrio_treeImpl = new Varrio_treeImpl();

        varrio_treeImpl.setNew(varrio_tree.isNew());
        varrio_treeImpl.setPrimaryKey(varrio_tree.getPrimaryKey());

        varrio_treeImpl.setSAMPTIME(varrio_tree.getSAMPTIME());
        varrio_treeImpl.setF_CO2_tree0(varrio_tree.getF_CO2_tree0());
        varrio_treeImpl.setF_H2O_tree0(varrio_tree.getF_H2O_tree0());
        varrio_treeImpl.setTcuv_tree0(varrio_tree.getTcuv_tree0());
        varrio_treeImpl.setPARcuv_tree0(varrio_tree.getPARcuv_tree0());
        varrio_treeImpl.setCO2_tree0(varrio_tree.getCO2_tree0());
        varrio_treeImpl.setH2O_tree0(varrio_tree.getH2O_tree0());
        varrio_treeImpl.setF_CO2_tree1(varrio_tree.getF_CO2_tree1());
        varrio_treeImpl.setF_H2O_tree1(varrio_tree.getF_H2O_tree1());
        varrio_treeImpl.setTcuv_tree1(varrio_tree.getTcuv_tree1());
        varrio_treeImpl.setPARcuv_tree1(varrio_tree.getPARcuv_tree1());
        varrio_treeImpl.setCO2_tree1(varrio_tree.getCO2_tree1());
        varrio_treeImpl.setH2O_tree1(varrio_tree.getH2O_tree1());
        varrio_treeImpl.setF_CO2_tree2(varrio_tree.getF_CO2_tree2());
        varrio_treeImpl.setF_H2O_tree2(varrio_tree.getF_H2O_tree2());
        varrio_treeImpl.setTcuv_tree2(varrio_tree.getTcuv_tree2());
        varrio_treeImpl.setPARcuv_tree2(varrio_tree.getPARcuv_tree2());
        varrio_treeImpl.setCO2_tree2(varrio_tree.getCO2_tree2());
        varrio_treeImpl.setH2O_tree2(varrio_tree.getH2O_tree2());
        varrio_treeImpl.setF_CO2_tree3(varrio_tree.getF_CO2_tree3());
        varrio_treeImpl.setF_H2O_tree3(varrio_tree.getF_H2O_tree3());
        varrio_treeImpl.setTcuv_tree3(varrio_tree.getTcuv_tree3());
        varrio_treeImpl.setPARcuv_tree3(varrio_tree.getPARcuv_tree3());
        varrio_treeImpl.setCO2_tree3(varrio_tree.getCO2_tree3());
        varrio_treeImpl.setH2O_tree3(varrio_tree.getH2O_tree3());
        varrio_treeImpl.setF_CO2_tree0_EMEP(varrio_tree.getF_CO2_tree0_EMEP());
        varrio_treeImpl.setF_H2O_tree0_EMEP(varrio_tree.getF_H2O_tree0_EMEP());
        varrio_treeImpl.setTcuv_tree0_EMEP(varrio_tree.getTcuv_tree0_EMEP());
        varrio_treeImpl.setPARcuv_tree0_EMEP(varrio_tree.getPARcuv_tree0_EMEP());
        varrio_treeImpl.setCO2_tree0_EMEP(varrio_tree.getCO2_tree0_EMEP());
        varrio_treeImpl.setH2O_tree0_EMEP(varrio_tree.getH2O_tree0_EMEP());
        varrio_treeImpl.setF_CO2_tree1_EMEP(varrio_tree.getF_CO2_tree1_EMEP());
        varrio_treeImpl.setF_H2O_tree1_EMEP(varrio_tree.getF_H2O_tree1_EMEP());
        varrio_treeImpl.setTcuv_tree1_EMEP(varrio_tree.getTcuv_tree1_EMEP());
        varrio_treeImpl.setPARcuv_tree1_EMEP(varrio_tree.getPARcuv_tree1_EMEP());
        varrio_treeImpl.setCO2_tree1_EMEP(varrio_tree.getCO2_tree1_EMEP());
        varrio_treeImpl.setH2O_tree1_EMEP(varrio_tree.getH2O_tree1_EMEP());
        varrio_treeImpl.setF_CO2_tree2_EMEP(varrio_tree.getF_CO2_tree2_EMEP());
        varrio_treeImpl.setF_H2O_tree2_EMEP(varrio_tree.getF_H2O_tree2_EMEP());
        varrio_treeImpl.setTcuv_tree2_EMEP(varrio_tree.getTcuv_tree2_EMEP());
        varrio_treeImpl.setPARcuv_tree2_EMEP(varrio_tree.getPARcuv_tree2_EMEP());
        varrio_treeImpl.setCO2_tree2_EMEP(varrio_tree.getCO2_tree2_EMEP());
        varrio_treeImpl.setH2O_tree2_EMEP(varrio_tree.getH2O_tree2_EMEP());
        varrio_treeImpl.setF_CO2_tree3_EMEP(varrio_tree.getF_CO2_tree3_EMEP());
        varrio_treeImpl.setF_H2O_tree3_EMEP(varrio_tree.getF_H2O_tree3_EMEP());
        varrio_treeImpl.setTcuv_tree3_EMEP(varrio_tree.getTcuv_tree3_EMEP());
        varrio_treeImpl.setPARcuv_tree3_EMEP(varrio_tree.getPARcuv_tree3_EMEP());
        varrio_treeImpl.setCO2_tree3_EMEP(varrio_tree.getCO2_tree3_EMEP());
        varrio_treeImpl.setH2O_tree3_EMEP(varrio_tree.getH2O_tree3_EMEP());

        return varrio_treeImpl;
    }

    /**
     * Returns the varrio_tree with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the varrio_tree
     * @return the varrio_tree
     * @throws fi.csc.smear.db.NoSuchVarrio_treeException if a varrio_tree with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Varrio_tree findByPrimaryKey(Serializable primaryKey)
        throws NoSuchVarrio_treeException, SystemException {
        Varrio_tree varrio_tree = fetchByPrimaryKey(primaryKey);

        if (varrio_tree == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchVarrio_treeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return varrio_tree;
    }

    /**
     * Returns the varrio_tree with the primary key or throws a {@link fi.csc.smear.db.NoSuchVarrio_treeException} if it could not be found.
     *
     * @param SAMPTIME the primary key of the varrio_tree
     * @return the varrio_tree
     * @throws fi.csc.smear.db.NoSuchVarrio_treeException if a varrio_tree with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Varrio_tree findByPrimaryKey(java.util.Date SAMPTIME)
        throws NoSuchVarrio_treeException, SystemException {
        return findByPrimaryKey((Serializable) SAMPTIME);
    }

    /**
     * Returns the varrio_tree with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the varrio_tree
     * @return the varrio_tree, or <code>null</code> if a varrio_tree with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Varrio_tree fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Varrio_tree varrio_tree = (Varrio_tree) EntityCacheUtil.getResult(Varrio_treeModelImpl.ENTITY_CACHE_ENABLED,
                Varrio_treeImpl.class, primaryKey);

        if (varrio_tree == _nullVarrio_tree) {
            return null;
        }

        if (varrio_tree == null) {
            Session session = null;

            try {
                session = openSession();

                varrio_tree = (Varrio_tree) session.get(Varrio_treeImpl.class,
                        primaryKey);

                if (varrio_tree != null) {
                    cacheResult(varrio_tree);
                } else {
                    EntityCacheUtil.putResult(Varrio_treeModelImpl.ENTITY_CACHE_ENABLED,
                        Varrio_treeImpl.class, primaryKey, _nullVarrio_tree);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(Varrio_treeModelImpl.ENTITY_CACHE_ENABLED,
                    Varrio_treeImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return varrio_tree;
    }

    /**
     * Returns the varrio_tree with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param SAMPTIME the primary key of the varrio_tree
     * @return the varrio_tree, or <code>null</code> if a varrio_tree with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Varrio_tree fetchByPrimaryKey(java.util.Date SAMPTIME)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) SAMPTIME);
    }

    /**
     * Returns all the varrio_trees.
     *
     * @return the varrio_trees
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Varrio_tree> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the varrio_trees.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.Varrio_treeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of varrio_trees
     * @param end the upper bound of the range of varrio_trees (not inclusive)
     * @return the range of varrio_trees
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Varrio_tree> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the varrio_trees.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.Varrio_treeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of varrio_trees
     * @param end the upper bound of the range of varrio_trees (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of varrio_trees
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Varrio_tree> findAll(int start, int end,
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

        List<Varrio_tree> list = (List<Varrio_tree>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_VARRIO_TREE);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_VARRIO_TREE;

                if (pagination) {
                    sql = sql.concat(Varrio_treeModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Varrio_tree>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Varrio_tree>(list);
                } else {
                    list = (List<Varrio_tree>) QueryUtil.list(q, getDialect(),
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
     * Removes all the varrio_trees from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Varrio_tree varrio_tree : findAll()) {
            remove(varrio_tree);
        }
    }

    /**
     * Returns the number of varrio_trees.
     *
     * @return the number of varrio_trees
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

                Query q = session.createQuery(_SQL_COUNT_VARRIO_TREE);

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
     * Initializes the varrio_tree persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.fi.csc.smear.db.model.Varrio_tree")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Varrio_tree>> listenersList = new ArrayList<ModelListener<Varrio_tree>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Varrio_tree>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(Varrio_treeImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
