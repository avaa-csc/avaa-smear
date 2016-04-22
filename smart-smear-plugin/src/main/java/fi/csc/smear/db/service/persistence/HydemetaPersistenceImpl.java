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

import fi.csc.smear.db.NoSuchHydemetaException;
import fi.csc.smear.db.model.Hydemeta;
import fi.csc.smear.db.model.impl.HydemetaImpl;
import fi.csc.smear.db.model.impl.HydemetaModelImpl;
import fi.csc.smear.db.service.persistence.HydemetaPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the hydemeta service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author pj
 * @see HydemetaPersistence
 * @see HydemetaUtil
 * @generated
 */
public class HydemetaPersistenceImpl extends BasePersistenceImpl<Hydemeta>
    implements HydemetaPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link HydemetaUtil} to access the hydemeta persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = HydemetaImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(HydemetaModelImpl.ENTITY_CACHE_ENABLED,
            HydemetaModelImpl.FINDER_CACHE_ENABLED, HydemetaImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(HydemetaModelImpl.ENTITY_CACHE_ENABLED,
            HydemetaModelImpl.FINDER_CACHE_ENABLED, HydemetaImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(HydemetaModelImpl.ENTITY_CACHE_ENABLED,
            HydemetaModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_HYDEMETA = "SELECT hydemeta FROM Hydemeta hydemeta";
    private static final String _SQL_COUNT_HYDEMETA = "SELECT COUNT(hydemeta) FROM Hydemeta hydemeta";
    private static final String _ORDER_BY_ENTITY_ALIAS = "hydemeta.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Hydemeta exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(HydemetaPersistenceImpl.class);
    private static Hydemeta _nullHydemeta = new HydemetaImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Hydemeta> toCacheModel() {
                return _nullHydemetaCacheModel;
            }
        };

    private static CacheModel<Hydemeta> _nullHydemetaCacheModel = new CacheModel<Hydemeta>() {
            @Override
            public Hydemeta toEntityModel() {
                return _nullHydemeta;
            }
        };

    public HydemetaPersistenceImpl() {
        setModelClass(Hydemeta.class);
    }

    /**
     * Caches the hydemeta in the entity cache if it is enabled.
     *
     * @param hydemeta the hydemeta
     */
    @Override
    public void cacheResult(Hydemeta hydemeta) {
        EntityCacheUtil.putResult(HydemetaModelImpl.ENTITY_CACHE_ENABLED,
            HydemetaImpl.class, hydemeta.getPrimaryKey(), hydemeta);

        hydemeta.resetOriginalValues();
    }

    /**
     * Caches the hydemetas in the entity cache if it is enabled.
     *
     * @param hydemetas the hydemetas
     */
    @Override
    public void cacheResult(List<Hydemeta> hydemetas) {
        for (Hydemeta hydemeta : hydemetas) {
            if (EntityCacheUtil.getResult(
                        HydemetaModelImpl.ENTITY_CACHE_ENABLED,
                        HydemetaImpl.class, hydemeta.getPrimaryKey()) == null) {
                cacheResult(hydemeta);
            } else {
                hydemeta.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all hydemetas.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(HydemetaImpl.class.getName());
        }

        EntityCacheUtil.clearCache(HydemetaImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the hydemeta.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Hydemeta hydemeta) {
        EntityCacheUtil.removeResult(HydemetaModelImpl.ENTITY_CACHE_ENABLED,
            HydemetaImpl.class, hydemeta.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<Hydemeta> hydemetas) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Hydemeta hydemeta : hydemetas) {
            EntityCacheUtil.removeResult(HydemetaModelImpl.ENTITY_CACHE_ENABLED,
                HydemetaImpl.class, hydemeta.getPrimaryKey());
        }
    }

    /**
     * Creates a new hydemeta with the primary key. Does not add the hydemeta to the database.
     *
     * @param samptime the primary key for the new hydemeta
     * @return the new hydemeta
     */
    @Override
    public Hydemeta create(java.util.Date samptime) {
        Hydemeta hydemeta = new HydemetaImpl();

        hydemeta.setNew(true);
        hydemeta.setPrimaryKey(samptime);

        return hydemeta;
    }

    /**
     * Removes the hydemeta with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param samptime the primary key of the hydemeta
     * @return the hydemeta that was removed
     * @throws fi.csc.smear.db.NoSuchHydemetaException if a hydemeta with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Hydemeta remove(java.util.Date samptime)
        throws NoSuchHydemetaException, SystemException {
        return remove((Serializable) samptime);
    }

    /**
     * Removes the hydemeta with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the hydemeta
     * @return the hydemeta that was removed
     * @throws fi.csc.smear.db.NoSuchHydemetaException if a hydemeta with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Hydemeta remove(Serializable primaryKey)
        throws NoSuchHydemetaException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Hydemeta hydemeta = (Hydemeta) session.get(HydemetaImpl.class,
                    primaryKey);

            if (hydemeta == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchHydemetaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(hydemeta);
        } catch (NoSuchHydemetaException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Hydemeta removeImpl(Hydemeta hydemeta) throws SystemException {
        hydemeta = toUnwrappedModel(hydemeta);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(hydemeta)) {
                hydemeta = (Hydemeta) session.get(HydemetaImpl.class,
                        hydemeta.getPrimaryKeyObj());
            }

            if (hydemeta != null) {
                session.delete(hydemeta);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (hydemeta != null) {
            clearCache(hydemeta);
        }

        return hydemeta;
    }

    @Override
    public Hydemeta updateImpl(fi.csc.smear.db.model.Hydemeta hydemeta)
        throws SystemException {
        hydemeta = toUnwrappedModel(hydemeta);

        boolean isNew = hydemeta.isNew();

        Session session = null;

        try {
            session = openSession();

            if (hydemeta.isNew()) {
                session.save(hydemeta);

                hydemeta.setNew(false);
            } else {
                session.merge(hydemeta);
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

        EntityCacheUtil.putResult(HydemetaModelImpl.ENTITY_CACHE_ENABLED,
            HydemetaImpl.class, hydemeta.getPrimaryKey(), hydemeta);

        return hydemeta;
    }

    protected Hydemeta toUnwrappedModel(Hydemeta hydemeta) {
        if (hydemeta instanceof HydemetaImpl) {
            return hydemeta;
        }

        HydemetaImpl hydemetaImpl = new HydemetaImpl();

        hydemetaImpl.setNew(hydemeta.isNew());
        hydemetaImpl.setPrimaryKey(hydemeta.getPrimaryKey());

        hydemetaImpl.setSamptime(hydemeta.getSamptime());
        hydemetaImpl.setUV_A(hydemeta.getUV_A());
        hydemetaImpl.setUV_B(hydemeta.getUV_B());
        hydemetaImpl.setDiffPAR(hydemeta.getDiffPAR());
        hydemetaImpl.setDiffGLOB(hydemeta.getDiffGLOB());
        hydemetaImpl.setDirGLOB(hydemeta.getDirGLOB());
        hydemetaImpl.setNet(hydemeta.getNet());
        hydemetaImpl.setRGlob(hydemeta.getRGlob());
        hydemetaImpl.setGlob(hydemeta.getGlob());
        hydemetaImpl.setRPAR(hydemeta.getRPAR());
        hydemetaImpl.setPAR(hydemeta.getPAR());
        hydemetaImpl.setDirPAR(hydemeta.getDirPAR());
        hydemetaImpl.setCanIR(hydemeta.getCanIR());
        hydemetaImpl.setSkyIR(hydemeta.getSkyIR());
        hydemetaImpl.setPrecip(hydemeta.getPrecip());
        hydemetaImpl.setSWS(hydemeta.getSWS());
        hydemetaImpl.setTd(hydemeta.getTd());
        hydemetaImpl.setPamb0(hydemeta.getPamb0());
        hydemetaImpl.setT672(hydemeta.getT672());
        hydemetaImpl.setT504(hydemeta.getT504());
        hydemetaImpl.setT336(hydemeta.getT336());
        hydemetaImpl.setT168(hydemeta.getT168());
        hydemetaImpl.setT84(hydemeta.getT84());
        hydemetaImpl.setT42(hydemeta.getT42());
        hydemetaImpl.setWS672(hydemeta.getWS672());
        hydemetaImpl.setWS504(hydemeta.getWS504());
        hydemetaImpl.setWS336(hydemeta.getWS336());
        hydemetaImpl.setWS168(hydemeta.getWS168());
        hydemetaImpl.setWS84(hydemeta.getWS84());
        hydemetaImpl.setWS42(hydemeta.getWS42());
        hydemetaImpl.setWSU740(hydemeta.getWSU740());
        hydemetaImpl.setWSU336(hydemeta.getWSU336());
        hydemetaImpl.setWSU168(hydemeta.getWSU168());
        hydemetaImpl.setWSU84(hydemeta.getWSU84());
        hydemetaImpl.setWD(hydemeta.getWD());
        hydemetaImpl.setWD504(hydemeta.getWD504());
        hydemetaImpl.setWD336(hydemeta.getWD336());
        hydemetaImpl.setWD168(hydemeta.getWD168());
        hydemetaImpl.setWDU740(hydemeta.getWDU740());
        hydemetaImpl.setWDU336(hydemeta.getWDU336());
        hydemetaImpl.setWDU168(hydemeta.getWDU168());
        hydemetaImpl.setWDU84(hydemeta.getWDU84());
        hydemetaImpl.setNO672(hydemeta.getNO672());
        hydemetaImpl.setNO504(hydemeta.getNO504());
        hydemetaImpl.setNO336(hydemeta.getNO336());
        hydemetaImpl.setNO168(hydemeta.getNO168());
        hydemetaImpl.setNO84(hydemeta.getNO84());
        hydemetaImpl.setNO42(hydemeta.getNO42());
        hydemetaImpl.setNOx672(hydemeta.getNOx672());
        hydemetaImpl.setNOx504(hydemeta.getNOx504());
        hydemetaImpl.setNOx336(hydemeta.getNOx336());
        hydemetaImpl.setNOx168(hydemeta.getNOx168());
        hydemetaImpl.setNOx84(hydemeta.getNOx84());
        hydemetaImpl.setNOx42(hydemeta.getNOx42());
        hydemetaImpl.setO3672(hydemeta.getO3672());
        hydemetaImpl.setO3504(hydemeta.getO3504());
        hydemetaImpl.setO3336(hydemeta.getO3336());
        hydemetaImpl.setO3168(hydemeta.getO3168());
        hydemetaImpl.setO384(hydemeta.getO384());
        hydemetaImpl.setO342(hydemeta.getO342());
        hydemetaImpl.setSO2672(hydemeta.getSO2672());
        hydemetaImpl.setSO2504(hydemeta.getSO2504());
        hydemetaImpl.setSO2336(hydemeta.getSO2336());
        hydemetaImpl.setSO2168(hydemeta.getSO2168());
        hydemetaImpl.setSO284(hydemeta.getSO284());
        hydemetaImpl.setSO242(hydemeta.getSO242());
        hydemetaImpl.setH2O672(hydemeta.getH2O672());
        hydemetaImpl.setH2O504(hydemeta.getH2O504());
        hydemetaImpl.setH2O336(hydemeta.getH2O336());
        hydemetaImpl.setH2O168(hydemeta.getH2O168());
        hydemetaImpl.setH2O84(hydemeta.getH2O84());
        hydemetaImpl.setH2O42(hydemeta.getH2O42());
        hydemetaImpl.setCO2672(hydemeta.getCO2672());
        hydemetaImpl.setCO2504(hydemeta.getCO2504());
        hydemetaImpl.setCO2336(hydemeta.getCO2336());
        hydemetaImpl.setCO2168(hydemeta.getCO2168());
        hydemetaImpl.setCO284(hydemeta.getCO284());
        hydemetaImpl.setCO242(hydemeta.getCO242());
        hydemetaImpl.setH2S672(hydemeta.getH2S672());
        hydemetaImpl.setH2S504(hydemeta.getH2S504());
        hydemetaImpl.setH2S336(hydemeta.getH2S336());
        hydemetaImpl.setH2S168(hydemeta.getH2S168());
        hydemetaImpl.setH2S84(hydemeta.getH2S84());
        hydemetaImpl.setH2S42(hydemeta.getH2S42());
        hydemetaImpl.setRHIRGA672(hydemeta.getRHIRGA672());
        hydemetaImpl.setRHIRGA504(hydemeta.getRHIRGA504());
        hydemetaImpl.setRHIRGA336(hydemeta.getRHIRGA336());
        hydemetaImpl.setRHIRGA168(hydemeta.getRHIRGA168());
        hydemetaImpl.setRHIRGA84(hydemeta.getRHIRGA84());
        hydemetaImpl.setRHIRGA42(hydemeta.getRHIRGA42());
        hydemetaImpl.setCO672(hydemeta.getCO672());
        hydemetaImpl.setCO504(hydemeta.getCO504());
        hydemetaImpl.setCO336(hydemeta.getCO336());
        hydemetaImpl.setCO168(hydemeta.getCO168());
        hydemetaImpl.setCO84(hydemeta.getCO84());
        hydemetaImpl.setCO42(hydemeta.getCO42());
        hydemetaImpl.setRHTd(hydemeta.getRHTd());
        hydemetaImpl.setPTG(hydemeta.getPTG());
        hydemetaImpl.setVisibility(hydemeta.getVisibility());
        hydemetaImpl.setVisibilitymin(hydemeta.getVisibilitymin());
        hydemetaImpl.setVisibilitymax(hydemeta.getVisibilitymax());
        hydemetaImpl.setPrecipint(hydemeta.getPrecipint());
        hydemetaImpl.setPrecipintmin(hydemeta.getPrecipintmin());
        hydemetaImpl.setPrecipintmax(hydemeta.getPrecipintmax());
        hydemetaImpl.setPrecipacc(hydemeta.getPrecipacc());
        hydemetaImpl.setSnowfallacc(hydemeta.getSnowfallacc());
        hydemetaImpl.setWthcode(hydemeta.getWthcode());
        hydemetaImpl.setWthcodemin(hydemeta.getWthcodemin());
        hydemetaImpl.setWthcodemax(hydemeta.getWthcodemax());
        hydemetaImpl.setTsoil_humus(hydemeta.getTsoil_humus());
        hydemetaImpl.setTsoil_A(hydemeta.getTsoil_A());
        hydemetaImpl.setTsoil_B1(hydemeta.getTsoil_B1());
        hydemetaImpl.setTsoil_B2(hydemeta.getTsoil_B2());
        hydemetaImpl.setTsoil_C1(hydemeta.getTsoil_C1());
        hydemetaImpl.setH2OTd(hydemeta.getH2OTd());
        hydemetaImpl.setCO2_storage_flux(hydemeta.getCO2_storage_flux());
        hydemetaImpl.setWsoil_humus(hydemeta.getWsoil_humus());
        hydemetaImpl.setWsoil_A(hydemeta.getWsoil_A());
        hydemetaImpl.setWsoil_B1(hydemeta.getWsoil_B1());
        hydemetaImpl.setWsoil_B2(hydemeta.getWsoil_B2());
        hydemetaImpl.setWsoil_C1(hydemeta.getWsoil_C1());
        hydemetaImpl.setLWin(hydemeta.getLWin());
        hydemetaImpl.setLWout(hydemeta.getLWout());
        hydemetaImpl.setPRI(hydemeta.getPRI());
        hydemetaImpl.setNDVI(hydemeta.getNDVI());
        hydemetaImpl.setBNDVI(hydemeta.getBNDVI());
        hydemetaImpl.setCanPAR1(hydemeta.getCanPAR1());
        hydemetaImpl.setCanPAR2(hydemeta.getCanPAR2());
        hydemetaImpl.setCanPAR3(hydemeta.getCanPAR3());
        hydemetaImpl.setMaaPAR(hydemeta.getMaaPAR());
        hydemetaImpl.setMaaNet(hydemeta.getMaaNet());
        hydemetaImpl.setPAR2(hydemeta.getPAR2());
        hydemetaImpl.setGlobmast(hydemeta.getGlobmast());
        hydemetaImpl.setWDU672(hydemeta.getWDU672());
        hydemetaImpl.setWSU672(hydemeta.getWSU672());
        hydemetaImpl.setRGlob125(hydemeta.getRGlob125());
        hydemetaImpl.setCH4168(hydemeta.getCH4168());
        hydemetaImpl.setCH4672(hydemeta.getCH4672());
        hydemetaImpl.setCH41250(hydemeta.getCH41250());
        hydemetaImpl.setT1250(hydemeta.getT1250());
        hydemetaImpl.setWpsoil_A(hydemeta.getWpsoil_A());
        hydemetaImpl.setWpsoil_B(hydemeta.getWpsoil_B());
        hydemetaImpl.setRunoff1(hydemeta.getRunoff1());
        hydemetaImpl.setRunoff2(hydemeta.getRunoff2());
        hydemetaImpl.setDrainage1(hydemeta.getDrainage1());
        hydemetaImpl.setCO2icos168(hydemeta.getCO2icos168());
        hydemetaImpl.setCO2icos672(hydemeta.getCO2icos672());
        hydemetaImpl.setCO2icos1250(hydemeta.getCO2icos1250());
        hydemetaImpl.setH2Oicos168(hydemeta.getH2Oicos168());
        hydemetaImpl.setH2Oicos672(hydemeta.getH2Oicos672());
        hydemetaImpl.setH2Oicos1250(hydemeta.getH2Oicos1250());
        hydemetaImpl.setUV_A_EMEP(hydemeta.getUV_A_EMEP());
        hydemetaImpl.setUV_B_EMEP(hydemeta.getUV_B_EMEP());
        hydemetaImpl.setDiffPAR_EMEP(hydemeta.getDiffPAR_EMEP());
        hydemetaImpl.setDiffGLOB_EMEP(hydemeta.getDiffGLOB_EMEP());
        hydemetaImpl.setDirGLOB_EMEP(hydemeta.getDirGLOB_EMEP());
        hydemetaImpl.setNet_EMEP(hydemeta.getNet_EMEP());
        hydemetaImpl.setRGlob_EMEP(hydemeta.getRGlob_EMEP());
        hydemetaImpl.setGlob_EMEP(hydemeta.getGlob_EMEP());
        hydemetaImpl.setRPAR_EMEP(hydemeta.getRPAR_EMEP());
        hydemetaImpl.setPAR_EMEP(hydemeta.getPAR_EMEP());
        hydemetaImpl.setDirPAR_EMEP(hydemeta.getDirPAR_EMEP());
        hydemetaImpl.setCanIR_EMEP(hydemeta.getCanIR_EMEP());

        return hydemetaImpl;
    }

    /**
     * Returns the hydemeta with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the hydemeta
     * @return the hydemeta
     * @throws fi.csc.smear.db.NoSuchHydemetaException if a hydemeta with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Hydemeta findByPrimaryKey(Serializable primaryKey)
        throws NoSuchHydemetaException, SystemException {
        Hydemeta hydemeta = fetchByPrimaryKey(primaryKey);

        if (hydemeta == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchHydemetaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return hydemeta;
    }

    /**
     * Returns the hydemeta with the primary key or throws a {@link fi.csc.smear.db.NoSuchHydemetaException} if it could not be found.
     *
     * @param samptime the primary key of the hydemeta
     * @return the hydemeta
     * @throws fi.csc.smear.db.NoSuchHydemetaException if a hydemeta with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Hydemeta findByPrimaryKey(java.util.Date samptime)
        throws NoSuchHydemetaException, SystemException {
        return findByPrimaryKey((Serializable) samptime);
    }

    /**
     * Returns the hydemeta with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the hydemeta
     * @return the hydemeta, or <code>null</code> if a hydemeta with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Hydemeta fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Hydemeta hydemeta = (Hydemeta) EntityCacheUtil.getResult(HydemetaModelImpl.ENTITY_CACHE_ENABLED,
                HydemetaImpl.class, primaryKey);

        if (hydemeta == _nullHydemeta) {
            return null;
        }

        if (hydemeta == null) {
            Session session = null;

            try {
                session = openSession();

                hydemeta = (Hydemeta) session.get(HydemetaImpl.class, primaryKey);

                if (hydemeta != null) {
                    cacheResult(hydemeta);
                } else {
                    EntityCacheUtil.putResult(HydemetaModelImpl.ENTITY_CACHE_ENABLED,
                        HydemetaImpl.class, primaryKey, _nullHydemeta);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(HydemetaModelImpl.ENTITY_CACHE_ENABLED,
                    HydemetaImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return hydemeta;
    }

    /**
     * Returns the hydemeta with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param samptime the primary key of the hydemeta
     * @return the hydemeta, or <code>null</code> if a hydemeta with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Hydemeta fetchByPrimaryKey(java.util.Date samptime)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) samptime);
    }

    /**
     * Returns all the hydemetas.
     *
     * @return the hydemetas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Hydemeta> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the hydemetas.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.HydemetaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of hydemetas
     * @param end the upper bound of the range of hydemetas (not inclusive)
     * @return the range of hydemetas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Hydemeta> findAll(int start, int end) throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the hydemetas.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.HydemetaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of hydemetas
     * @param end the upper bound of the range of hydemetas (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of hydemetas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Hydemeta> findAll(int start, int end,
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

        List<Hydemeta> list = (List<Hydemeta>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_HYDEMETA);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_HYDEMETA;

                if (pagination) {
                    sql = sql.concat(HydemetaModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Hydemeta>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Hydemeta>(list);
                } else {
                    list = (List<Hydemeta>) QueryUtil.list(q, getDialect(),
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
     * Removes all the hydemetas from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Hydemeta hydemeta : findAll()) {
            remove(hydemeta);
        }
    }

    /**
     * Returns the number of hydemetas.
     *
     * @return the number of hydemetas
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

                Query q = session.createQuery(_SQL_COUNT_HYDEMETA);

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
     * Initializes the hydemeta persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.fi.csc.smear.db.model.Hydemeta")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Hydemeta>> listenersList = new ArrayList<ModelListener<Hydemeta>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Hydemeta>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(HydemetaImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
