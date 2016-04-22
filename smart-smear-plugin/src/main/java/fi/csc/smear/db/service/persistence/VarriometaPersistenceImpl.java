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

import fi.csc.smear.db.NoSuchVarriometaException;
import fi.csc.smear.db.model.Varriometa;
import fi.csc.smear.db.model.impl.VarriometaImpl;
import fi.csc.smear.db.model.impl.VarriometaModelImpl;
import fi.csc.smear.db.service.persistence.VarriometaPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the varriometa service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author pj
 * @see VarriometaPersistence
 * @see VarriometaUtil
 * @generated
 */
public class VarriometaPersistenceImpl extends BasePersistenceImpl<Varriometa>
    implements VarriometaPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link VarriometaUtil} to access the varriometa persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = VarriometaImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VarriometaModelImpl.ENTITY_CACHE_ENABLED,
            VarriometaModelImpl.FINDER_CACHE_ENABLED, VarriometaImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VarriometaModelImpl.ENTITY_CACHE_ENABLED,
            VarriometaModelImpl.FINDER_CACHE_ENABLED, VarriometaImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VarriometaModelImpl.ENTITY_CACHE_ENABLED,
            VarriometaModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_VARRIOMETA = "SELECT varriometa FROM Varriometa varriometa";
    private static final String _SQL_COUNT_VARRIOMETA = "SELECT COUNT(varriometa) FROM Varriometa varriometa";
    private static final String _ORDER_BY_ENTITY_ALIAS = "varriometa.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Varriometa exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(VarriometaPersistenceImpl.class);
    private static Varriometa _nullVarriometa = new VarriometaImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Varriometa> toCacheModel() {
                return _nullVarriometaCacheModel;
            }
        };

    private static CacheModel<Varriometa> _nullVarriometaCacheModel = new CacheModel<Varriometa>() {
            @Override
            public Varriometa toEntityModel() {
                return _nullVarriometa;
            }
        };

    public VarriometaPersistenceImpl() {
        setModelClass(Varriometa.class);
    }

    /**
     * Caches the varriometa in the entity cache if it is enabled.
     *
     * @param varriometa the varriometa
     */
    @Override
    public void cacheResult(Varriometa varriometa) {
        EntityCacheUtil.putResult(VarriometaModelImpl.ENTITY_CACHE_ENABLED,
            VarriometaImpl.class, varriometa.getPrimaryKey(), varriometa);

        varriometa.resetOriginalValues();
    }

    /**
     * Caches the varriometas in the entity cache if it is enabled.
     *
     * @param varriometas the varriometas
     */
    @Override
    public void cacheResult(List<Varriometa> varriometas) {
        for (Varriometa varriometa : varriometas) {
            if (EntityCacheUtil.getResult(
                        VarriometaModelImpl.ENTITY_CACHE_ENABLED,
                        VarriometaImpl.class, varriometa.getPrimaryKey()) == null) {
                cacheResult(varriometa);
            } else {
                varriometa.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all varriometas.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(VarriometaImpl.class.getName());
        }

        EntityCacheUtil.clearCache(VarriometaImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the varriometa.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Varriometa varriometa) {
        EntityCacheUtil.removeResult(VarriometaModelImpl.ENTITY_CACHE_ENABLED,
            VarriometaImpl.class, varriometa.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<Varriometa> varriometas) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Varriometa varriometa : varriometas) {
            EntityCacheUtil.removeResult(VarriometaModelImpl.ENTITY_CACHE_ENABLED,
                VarriometaImpl.class, varriometa.getPrimaryKey());
        }
    }

    /**
     * Creates a new varriometa with the primary key. Does not add the varriometa to the database.
     *
     * @param SAMPTIME the primary key for the new varriometa
     * @return the new varriometa
     */
    @Override
    public Varriometa create(java.util.Date SAMPTIME) {
        Varriometa varriometa = new VarriometaImpl();

        varriometa.setNew(true);
        varriometa.setPrimaryKey(SAMPTIME);

        return varriometa;
    }

    /**
     * Removes the varriometa with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param SAMPTIME the primary key of the varriometa
     * @return the varriometa that was removed
     * @throws fi.csc.smear.db.NoSuchVarriometaException if a varriometa with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Varriometa remove(java.util.Date SAMPTIME)
        throws NoSuchVarriometaException, SystemException {
        return remove((Serializable) SAMPTIME);
    }

    /**
     * Removes the varriometa with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the varriometa
     * @return the varriometa that was removed
     * @throws fi.csc.smear.db.NoSuchVarriometaException if a varriometa with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Varriometa remove(Serializable primaryKey)
        throws NoSuchVarriometaException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Varriometa varriometa = (Varriometa) session.get(VarriometaImpl.class,
                    primaryKey);

            if (varriometa == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchVarriometaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(varriometa);
        } catch (NoSuchVarriometaException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Varriometa removeImpl(Varriometa varriometa)
        throws SystemException {
        varriometa = toUnwrappedModel(varriometa);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(varriometa)) {
                varriometa = (Varriometa) session.get(VarriometaImpl.class,
                        varriometa.getPrimaryKeyObj());
            }

            if (varriometa != null) {
                session.delete(varriometa);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (varriometa != null) {
            clearCache(varriometa);
        }

        return varriometa;
    }

    @Override
    public Varriometa updateImpl(fi.csc.smear.db.model.Varriometa varriometa)
        throws SystemException {
        varriometa = toUnwrappedModel(varriometa);

        boolean isNew = varriometa.isNew();

        Session session = null;

        try {
            session = openSession();

            if (varriometa.isNew()) {
                session.save(varriometa);

                varriometa.setNew(false);
            } else {
                session.merge(varriometa);
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

        EntityCacheUtil.putResult(VarriometaModelImpl.ENTITY_CACHE_ENABLED,
            VarriometaImpl.class, varriometa.getPrimaryKey(), varriometa);

        return varriometa;
    }

    protected Varriometa toUnwrappedModel(Varriometa varriometa) {
        if (varriometa instanceof VarriometaImpl) {
            return varriometa;
        }

        VarriometaImpl varriometaImpl = new VarriometaImpl();

        varriometaImpl.setNew(varriometa.isNew());
        varriometaImpl.setPrimaryKey(varriometa.getPrimaryKey());

        varriometaImpl.setSAMPTIME(varriometa.getSAMPTIME());
        varriometaImpl.setWS0(varriometa.getWS0());
        varriometaImpl.setWS1(varriometa.getWS1());
        varriometaImpl.setWS2(varriometa.getWS2());
        varriometaImpl.setWS3(varriometa.getWS3());
        varriometaImpl.setWS4(varriometa.getWS4());
        varriometaImpl.setRMM(varriometa.getRMM());
        varriometaImpl.setTLOG(varriometa.getTLOG());
        varriometaImpl.setPAR(varriometa.getPAR());
        varriometaImpl.setGLOB(varriometa.getGLOB());
        varriometaImpl.setREFL(varriometa.getREFL());
        varriometaImpl.setNET(varriometa.getNET());
        varriometaImpl.setUVA(varriometa.getUVA());
        varriometaImpl.setUVB(varriometa.getUVB());
        varriometaImpl.setUVAT(varriometa.getUVAT());
        varriometaImpl.setUVBT(varriometa.getUVBT());
        varriometaImpl.setRAIN(varriometa.getRAIN());
        varriometaImpl.setTDRY0(varriometa.getTDRY0());
        varriometaImpl.setTWET0(varriometa.getTWET0());
        varriometaImpl.setTDRY1(varriometa.getTDRY1());
        varriometaImpl.setTWET1(varriometa.getTWET1());
        varriometaImpl.setTDRY2(varriometa.getTDRY2());
        varriometaImpl.setTWET2(varriometa.getTWET2());
        varriometaImpl.setTDRY3(varriometa.getTDRY3());
        varriometaImpl.setTWET3(varriometa.getTWET3());
        varriometaImpl.setTDRY4(varriometa.getTDRY4());
        varriometaImpl.setTWET4(varriometa.getTWET4());
        varriometaImpl.setST(varriometa.getST());
        varriometaImpl.setWDIR(varriometa.getWDIR());
        varriometaImpl.setCPC1(varriometa.getCPC1());
        varriometaImpl.setO3_0(varriometa.getO3_0());
        varriometaImpl.setO3_1(varriometa.getO3_1());
        varriometaImpl.setO3_2(varriometa.getO3_2());
        varriometaImpl.setO3_3(varriometa.getO3_3());
        varriometaImpl.setO3_4(varriometa.getO3_4());
        varriometaImpl.setSO2_0(varriometa.getSO2_0());
        varriometaImpl.setSO2_1(varriometa.getSO2_1());
        varriometaImpl.setSO2_2(varriometa.getSO2_2());
        varriometaImpl.setSO2_3(varriometa.getSO2_3());
        varriometaImpl.setSO2_4(varriometa.getSO2_4());
        varriometaImpl.setNO_0(varriometa.getNO_0());
        varriometaImpl.setNO_1(varriometa.getNO_1());
        varriometaImpl.setNO_2(varriometa.getNO_2());
        varriometaImpl.setNO_4(varriometa.getNO_4());
        varriometaImpl.setNOX_0(varriometa.getNOX_0());
        varriometaImpl.setNOX_1(varriometa.getNOX_1());
        varriometaImpl.setNOX_2(varriometa.getNOX_2());
        varriometaImpl.setNOX_4(varriometa.getNOX_4());
        varriometaImpl.setP(varriometa.getP());
        varriometaImpl.setHUM_RH(varriometa.getHUM_RH());
        varriometaImpl.setHUM_T(varriometa.getHUM_T());
        varriometaImpl.setTemp(varriometa.getTemp());
        varriometaImpl.setWS00(varriometa.getWS00());
        varriometaImpl.setVisibility(varriometa.getVisibility());
        varriometaImpl.setRainint(varriometa.getRainint());
        varriometaImpl.setPrecipacc(varriometa.getPrecipacc());
        varriometaImpl.setHaildiammax(varriometa.getHaildiammax());
        varriometaImpl.setSnowint(varriometa.getSnowint());
        varriometaImpl.setVisibilitylpm(varriometa.getVisibilitylpm());
        varriometaImpl.setWthcode(varriometa.getWthcode());
        varriometaImpl.setCO_1(varriometa.getCO_1());
        varriometaImpl.setQuality(varriometa.getQuality());
        varriometaImpl.setTsoil(varriometa.getTsoil());
        varriometaImpl.setWsoil(varriometa.getWsoil());
        varriometaImpl.setCO206(varriometa.getCO206());
        varriometaImpl.setCO2soil(varriometa.getCO2soil());
        varriometaImpl.setTsoil_EMEP(varriometa.getTsoil_EMEP());
        varriometaImpl.setWsoil_EMEP(varriometa.getWsoil_EMEP());
        varriometaImpl.setCO206_EMEP(varriometa.getCO206_EMEP());
        varriometaImpl.setCO2soil_EMEP(varriometa.getCO2soil_EMEP());

        return varriometaImpl;
    }

    /**
     * Returns the varriometa with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the varriometa
     * @return the varriometa
     * @throws fi.csc.smear.db.NoSuchVarriometaException if a varriometa with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Varriometa findByPrimaryKey(Serializable primaryKey)
        throws NoSuchVarriometaException, SystemException {
        Varriometa varriometa = fetchByPrimaryKey(primaryKey);

        if (varriometa == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchVarriometaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return varriometa;
    }

    /**
     * Returns the varriometa with the primary key or throws a {@link fi.csc.smear.db.NoSuchVarriometaException} if it could not be found.
     *
     * @param SAMPTIME the primary key of the varriometa
     * @return the varriometa
     * @throws fi.csc.smear.db.NoSuchVarriometaException if a varriometa with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Varriometa findByPrimaryKey(java.util.Date SAMPTIME)
        throws NoSuchVarriometaException, SystemException {
        return findByPrimaryKey((Serializable) SAMPTIME);
    }

    /**
     * Returns the varriometa with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the varriometa
     * @return the varriometa, or <code>null</code> if a varriometa with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Varriometa fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Varriometa varriometa = (Varriometa) EntityCacheUtil.getResult(VarriometaModelImpl.ENTITY_CACHE_ENABLED,
                VarriometaImpl.class, primaryKey);

        if (varriometa == _nullVarriometa) {
            return null;
        }

        if (varriometa == null) {
            Session session = null;

            try {
                session = openSession();

                varriometa = (Varriometa) session.get(VarriometaImpl.class,
                        primaryKey);

                if (varriometa != null) {
                    cacheResult(varriometa);
                } else {
                    EntityCacheUtil.putResult(VarriometaModelImpl.ENTITY_CACHE_ENABLED,
                        VarriometaImpl.class, primaryKey, _nullVarriometa);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(VarriometaModelImpl.ENTITY_CACHE_ENABLED,
                    VarriometaImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return varriometa;
    }

    /**
     * Returns the varriometa with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param SAMPTIME the primary key of the varriometa
     * @return the varriometa, or <code>null</code> if a varriometa with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Varriometa fetchByPrimaryKey(java.util.Date SAMPTIME)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) SAMPTIME);
    }

    /**
     * Returns all the varriometas.
     *
     * @return the varriometas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Varriometa> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the varriometas.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.VarriometaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of varriometas
     * @param end the upper bound of the range of varriometas (not inclusive)
     * @return the range of varriometas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Varriometa> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the varriometas.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.VarriometaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of varriometas
     * @param end the upper bound of the range of varriometas (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of varriometas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Varriometa> findAll(int start, int end,
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

        List<Varriometa> list = (List<Varriometa>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_VARRIOMETA);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_VARRIOMETA;

                if (pagination) {
                    sql = sql.concat(VarriometaModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Varriometa>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Varriometa>(list);
                } else {
                    list = (List<Varriometa>) QueryUtil.list(q, getDialect(),
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
     * Removes all the varriometas from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Varriometa varriometa : findAll()) {
            remove(varriometa);
        }
    }

    /**
     * Returns the number of varriometas.
     *
     * @return the number of varriometas
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

                Query q = session.createQuery(_SQL_COUNT_VARRIOMETA);

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
     * Initializes the varriometa persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.fi.csc.smear.db.model.Varriometa")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Varriometa>> listenersList = new ArrayList<ModelListener<Varriometa>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Varriometa>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(VarriometaImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
