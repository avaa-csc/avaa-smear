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

import fi.csc.smear.db.NoSuchHyy_eddysubException;
import fi.csc.smear.db.model.Hyy_eddysub;
import fi.csc.smear.db.model.impl.Hyy_eddysubImpl;
import fi.csc.smear.db.model.impl.Hyy_eddysubModelImpl;
import fi.csc.smear.db.service.persistence.Hyy_eddysubPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the hyy_eddysub service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author pj
 * @see Hyy_eddysubPersistence
 * @see Hyy_eddysubUtil
 * @generated
 */
public class Hyy_eddysubPersistenceImpl extends BasePersistenceImpl<Hyy_eddysub>
    implements Hyy_eddysubPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link Hyy_eddysubUtil} to access the hyy_eddysub persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = Hyy_eddysubImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(Hyy_eddysubModelImpl.ENTITY_CACHE_ENABLED,
            Hyy_eddysubModelImpl.FINDER_CACHE_ENABLED, Hyy_eddysubImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(Hyy_eddysubModelImpl.ENTITY_CACHE_ENABLED,
            Hyy_eddysubModelImpl.FINDER_CACHE_ENABLED, Hyy_eddysubImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(Hyy_eddysubModelImpl.ENTITY_CACHE_ENABLED,
            Hyy_eddysubModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_HYY_EDDYSUB = "SELECT hyy_eddysub FROM Hyy_eddysub hyy_eddysub";
    private static final String _SQL_COUNT_HYY_EDDYSUB = "SELECT COUNT(hyy_eddysub) FROM Hyy_eddysub hyy_eddysub";
    private static final String _ORDER_BY_ENTITY_ALIAS = "hyy_eddysub.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Hyy_eddysub exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(Hyy_eddysubPersistenceImpl.class);
    private static Hyy_eddysub _nullHyy_eddysub = new Hyy_eddysubImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Hyy_eddysub> toCacheModel() {
                return _nullHyy_eddysubCacheModel;
            }
        };

    private static CacheModel<Hyy_eddysub> _nullHyy_eddysubCacheModel = new CacheModel<Hyy_eddysub>() {
            @Override
            public Hyy_eddysub toEntityModel() {
                return _nullHyy_eddysub;
            }
        };

    public Hyy_eddysubPersistenceImpl() {
        setModelClass(Hyy_eddysub.class);
    }

    /**
     * Caches the hyy_eddysub in the entity cache if it is enabled.
     *
     * @param hyy_eddysub the hyy_eddysub
     */
    @Override
    public void cacheResult(Hyy_eddysub hyy_eddysub) {
        EntityCacheUtil.putResult(Hyy_eddysubModelImpl.ENTITY_CACHE_ENABLED,
            Hyy_eddysubImpl.class, hyy_eddysub.getPrimaryKey(), hyy_eddysub);

        hyy_eddysub.resetOriginalValues();
    }

    /**
     * Caches the hyy_eddysubs in the entity cache if it is enabled.
     *
     * @param hyy_eddysubs the hyy_eddysubs
     */
    @Override
    public void cacheResult(List<Hyy_eddysub> hyy_eddysubs) {
        for (Hyy_eddysub hyy_eddysub : hyy_eddysubs) {
            if (EntityCacheUtil.getResult(
                        Hyy_eddysubModelImpl.ENTITY_CACHE_ENABLED,
                        Hyy_eddysubImpl.class, hyy_eddysub.getPrimaryKey()) == null) {
                cacheResult(hyy_eddysub);
            } else {
                hyy_eddysub.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all hyy_eddysubs.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(Hyy_eddysubImpl.class.getName());
        }

        EntityCacheUtil.clearCache(Hyy_eddysubImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the hyy_eddysub.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Hyy_eddysub hyy_eddysub) {
        EntityCacheUtil.removeResult(Hyy_eddysubModelImpl.ENTITY_CACHE_ENABLED,
            Hyy_eddysubImpl.class, hyy_eddysub.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<Hyy_eddysub> hyy_eddysubs) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Hyy_eddysub hyy_eddysub : hyy_eddysubs) {
            EntityCacheUtil.removeResult(Hyy_eddysubModelImpl.ENTITY_CACHE_ENABLED,
                Hyy_eddysubImpl.class, hyy_eddysub.getPrimaryKey());
        }
    }

    /**
     * Creates a new hyy_eddysub with the primary key. Does not add the hyy_eddysub to the database.
     *
     * @param samptime the primary key for the new hyy_eddysub
     * @return the new hyy_eddysub
     */
    @Override
    public Hyy_eddysub create(java.util.Date samptime) {
        Hyy_eddysub hyy_eddysub = new Hyy_eddysubImpl();

        hyy_eddysub.setNew(true);
        hyy_eddysub.setPrimaryKey(samptime);

        return hyy_eddysub;
    }

    /**
     * Removes the hyy_eddysub with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param samptime the primary key of the hyy_eddysub
     * @return the hyy_eddysub that was removed
     * @throws fi.csc.smear.db.NoSuchHyy_eddysubException if a hyy_eddysub with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Hyy_eddysub remove(java.util.Date samptime)
        throws NoSuchHyy_eddysubException, SystemException {
        return remove((Serializable) samptime);
    }

    /**
     * Removes the hyy_eddysub with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the hyy_eddysub
     * @return the hyy_eddysub that was removed
     * @throws fi.csc.smear.db.NoSuchHyy_eddysubException if a hyy_eddysub with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Hyy_eddysub remove(Serializable primaryKey)
        throws NoSuchHyy_eddysubException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Hyy_eddysub hyy_eddysub = (Hyy_eddysub) session.get(Hyy_eddysubImpl.class,
                    primaryKey);

            if (hyy_eddysub == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchHyy_eddysubException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(hyy_eddysub);
        } catch (NoSuchHyy_eddysubException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Hyy_eddysub removeImpl(Hyy_eddysub hyy_eddysub)
        throws SystemException {
        hyy_eddysub = toUnwrappedModel(hyy_eddysub);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(hyy_eddysub)) {
                hyy_eddysub = (Hyy_eddysub) session.get(Hyy_eddysubImpl.class,
                        hyy_eddysub.getPrimaryKeyObj());
            }

            if (hyy_eddysub != null) {
                session.delete(hyy_eddysub);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (hyy_eddysub != null) {
            clearCache(hyy_eddysub);
        }

        return hyy_eddysub;
    }

    @Override
    public Hyy_eddysub updateImpl(fi.csc.smear.db.model.Hyy_eddysub hyy_eddysub)
        throws SystemException {
        hyy_eddysub = toUnwrappedModel(hyy_eddysub);

        boolean isNew = hyy_eddysub.isNew();

        Session session = null;

        try {
            session = openSession();

            if (hyy_eddysub.isNew()) {
                session.save(hyy_eddysub);

                hyy_eddysub.setNew(false);
            } else {
                session.merge(hyy_eddysub);
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

        EntityCacheUtil.putResult(Hyy_eddysubModelImpl.ENTITY_CACHE_ENABLED,
            Hyy_eddysubImpl.class, hyy_eddysub.getPrimaryKey(), hyy_eddysub);

        return hyy_eddysub;
    }

    protected Hyy_eddysub toUnwrappedModel(Hyy_eddysub hyy_eddysub) {
        if (hyy_eddysub instanceof Hyy_eddysubImpl) {
            return hyy_eddysub;
        }

        Hyy_eddysubImpl hyy_eddysubImpl = new Hyy_eddysubImpl();

        hyy_eddysubImpl.setNew(hyy_eddysub.isNew());
        hyy_eddysubImpl.setPrimaryKey(hyy_eddysub.getPrimaryKey());

        hyy_eddysubImpl.setSamptime(hyy_eddysub.getSamptime());
        hyy_eddysubImpl.setH_subm(hyy_eddysub.getH_subm());
        hyy_eddysubImpl.setH_subm_EMEP(hyy_eddysub.getH_subm_EMEP());
        hyy_eddysubImpl.setQc_H_subm(hyy_eddysub.getQc_H_subm());
        hyy_eddysubImpl.setQc_H_subm_EMEP(hyy_eddysub.getQc_H_subm_EMEP());
        hyy_eddysubImpl.setLE_subm(hyy_eddysub.getLE_subm());
        hyy_eddysubImpl.setLE_subm_EMEP(hyy_eddysub.getLE_subm_EMEP());
        hyy_eddysubImpl.setQc_LE_subm(hyy_eddysub.getQc_LE_subm());
        hyy_eddysubImpl.setQc_LE_subm_EMEP(hyy_eddysub.getQc_LE_subm_EMEP());
        hyy_eddysubImpl.setE_subm(hyy_eddysub.getE_subm());
        hyy_eddysubImpl.setE_subm_EMEP(hyy_eddysub.getE_subm_EMEP());
        hyy_eddysubImpl.setQc_E_subm(hyy_eddysub.getQc_E_subm());
        hyy_eddysubImpl.setQc_E_subm_EMEP(hyy_eddysub.getQc_E_subm_EMEP());
        hyy_eddysubImpl.setF_c_subm(hyy_eddysub.getF_c_subm());
        hyy_eddysubImpl.setF_c_subm_EMEP(hyy_eddysub.getF_c_subm_EMEP());
        hyy_eddysubImpl.setQc_F_c_subm(hyy_eddysub.getQc_F_c_subm());
        hyy_eddysubImpl.setQc_F_c_subm_EMEP(hyy_eddysub.getQc_F_c_subm_EMEP());
        hyy_eddysubImpl.setTau_subm(hyy_eddysub.getTau_subm());
        hyy_eddysubImpl.setTau_subm_EMEP(hyy_eddysub.getTau_subm_EMEP());
        hyy_eddysubImpl.setQc_tau_subm(hyy_eddysub.getQc_tau_subm());
        hyy_eddysubImpl.setQc_tau_subm_EMEP(hyy_eddysub.getQc_tau_subm_EMEP());
        hyy_eddysubImpl.setU_star_subm(hyy_eddysub.getU_star_subm());
        hyy_eddysubImpl.setU_star_subm_EMEP(hyy_eddysub.getU_star_subm_EMEP());
        hyy_eddysubImpl.setMO_length_subm(hyy_eddysub.getMO_length_subm());
        hyy_eddysubImpl.setMO_length_subm_EMEP(hyy_eddysub.getMO_length_subm_EMEP());
        hyy_eddysubImpl.setStd_u_subm(hyy_eddysub.getStd_u_subm());
        hyy_eddysubImpl.setStd_u_subm_EMEP(hyy_eddysub.getStd_u_subm_EMEP());
        hyy_eddysubImpl.setStd_v_subm(hyy_eddysub.getStd_v_subm());
        hyy_eddysubImpl.setStd_v_subm_EMEP(hyy_eddysub.getStd_v_subm_EMEP());
        hyy_eddysubImpl.setStd_w_subm(hyy_eddysub.getStd_w_subm());
        hyy_eddysubImpl.setStd_w_subm_EMEP(hyy_eddysub.getStd_w_subm_EMEP());
        hyy_eddysubImpl.setStd_t_subm(hyy_eddysub.getStd_t_subm());
        hyy_eddysubImpl.setStd_t_subm_EMEP(hyy_eddysub.getStd_t_subm_EMEP());
        hyy_eddysubImpl.setStd_c_subm(hyy_eddysub.getStd_c_subm());
        hyy_eddysubImpl.setStd_c_subm_EMEP(hyy_eddysub.getStd_c_subm_EMEP());
        hyy_eddysubImpl.setStd_h_subm(hyy_eddysub.getStd_h_subm());
        hyy_eddysubImpl.setStd_h_subm_EMEP(hyy_eddysub.getStd_h_subm_EMEP());
        hyy_eddysubImpl.setAv_u_subm(hyy_eddysub.getAv_u_subm());
        hyy_eddysubImpl.setAv_u_subm_EMEP(hyy_eddysub.getAv_u_subm_EMEP());
        hyy_eddysubImpl.setAv_v_subm(hyy_eddysub.getAv_v_subm());
        hyy_eddysubImpl.setAv_v_subm_EMEP(hyy_eddysub.getAv_v_subm_EMEP());
        hyy_eddysubImpl.setAv_w_subm(hyy_eddysub.getAv_w_subm());
        hyy_eddysubImpl.setAv_w_subm_EMEP(hyy_eddysub.getAv_w_subm_EMEP());
        hyy_eddysubImpl.setAv_t_subm(hyy_eddysub.getAv_t_subm());
        hyy_eddysubImpl.setAv_t_subm_EMEP(hyy_eddysub.getAv_t_subm_EMEP());
        hyy_eddysubImpl.setAv_c_subm(hyy_eddysub.getAv_c_subm());
        hyy_eddysubImpl.setAv_c_subm_EMEP(hyy_eddysub.getAv_c_subm_EMEP());
        hyy_eddysubImpl.setAv_h_subm(hyy_eddysub.getAv_h_subm());
        hyy_eddysubImpl.setAv_h_subm_EMEP(hyy_eddysub.getAv_h_subm_EMEP());
        hyy_eddysubImpl.setU_subm(hyy_eddysub.getU_subm());
        hyy_eddysubImpl.setU_subm_EMEP(hyy_eddysub.getU_subm_EMEP());
        hyy_eddysubImpl.setWind_dir_subm(hyy_eddysub.getWind_dir_subm());
        hyy_eddysubImpl.setWind_dir_subm_EMEP(hyy_eddysub.getWind_dir_subm_EMEP());
        hyy_eddysubImpl.setEta_subm(hyy_eddysub.getEta_subm());
        hyy_eddysubImpl.setEta_subm_EMEP(hyy_eddysub.getEta_subm_EMEP());
        hyy_eddysubImpl.setTheta_subm(hyy_eddysub.getTheta_subm());
        hyy_eddysubImpl.setTheta_subm_EMEP(hyy_eddysub.getTheta_subm_EMEP());
        hyy_eddysubImpl.setBeta_subm(hyy_eddysub.getBeta_subm());
        hyy_eddysubImpl.setBeta_subm_EMEP(hyy_eddysub.getBeta_subm_EMEP());
        hyy_eddysubImpl.setC_lag_subm(hyy_eddysub.getC_lag_subm());
        hyy_eddysubImpl.setC_lag_subm_EMEP(hyy_eddysub.getC_lag_subm_EMEP());
        hyy_eddysubImpl.setH_lag_subm(hyy_eddysub.getH_lag_subm());
        hyy_eddysubImpl.setH_lag_subm_EMEP(hyy_eddysub.getH_lag_subm_EMEP());
        hyy_eddysubImpl.setErr_packet_subm(hyy_eddysub.getErr_packet_subm());
        hyy_eddysubImpl.setErr_packet_subm_EMEP(hyy_eddysub.getErr_packet_subm_EMEP());
        hyy_eddysubImpl.setLicor_t_std_subm(hyy_eddysub.getLicor_t_std_subm());
        hyy_eddysubImpl.setLicor_t_std_subm_EMEP(hyy_eddysub.getLicor_t_std_subm_EMEP());
        hyy_eddysubImpl.setLicor_t_av_subm(hyy_eddysub.getLicor_t_av_subm());
        hyy_eddysubImpl.setLicor_t_av_subm_EMEP(hyy_eddysub.getLicor_t_av_subm_EMEP());
        hyy_eddysubImpl.setLicor_p_std_subm(hyy_eddysub.getLicor_p_std_subm());
        hyy_eddysubImpl.setLicor_p_std_subm_EMEP(hyy_eddysub.getLicor_p_std_subm_EMEP());
        hyy_eddysubImpl.setLicor_p_av_subm(hyy_eddysub.getLicor_p_av_subm());
        hyy_eddysubImpl.setLicor_p_av_subm_EMEP(hyy_eddysub.getLicor_p_av_subm_EMEP());
        hyy_eddysubImpl.setAv_O3_subm(hyy_eddysub.getAv_O3_subm());
        hyy_eddysubImpl.setAv_O3_subm_EMEP(hyy_eddysub.getAv_O3_subm_EMEP());
        hyy_eddysubImpl.setStd_O3_subm(hyy_eddysub.getStd_O3_subm());
        hyy_eddysubImpl.setStd_O3_subm_EMEP(hyy_eddysub.getStd_O3_subm_EMEP());
        hyy_eddysubImpl.setO3_lag_subm(hyy_eddysub.getO3_lag_subm());
        hyy_eddysubImpl.setO3_lag_subm_EMEP(hyy_eddysub.getO3_lag_subm_EMEP());
        hyy_eddysubImpl.setF_O3_subm(hyy_eddysub.getF_O3_subm());
        hyy_eddysubImpl.setF_O3_subm_EMEP(hyy_eddysub.getF_O3_subm_EMEP());
        hyy_eddysubImpl.setQc_F_O3_subm(hyy_eddysub.getQc_F_O3_subm());
        hyy_eddysubImpl.setQc_F_O3_subm_EMEP(hyy_eddysub.getQc_F_O3_subm_EMEP());

        return hyy_eddysubImpl;
    }

    /**
     * Returns the hyy_eddysub with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the hyy_eddysub
     * @return the hyy_eddysub
     * @throws fi.csc.smear.db.NoSuchHyy_eddysubException if a hyy_eddysub with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Hyy_eddysub findByPrimaryKey(Serializable primaryKey)
        throws NoSuchHyy_eddysubException, SystemException {
        Hyy_eddysub hyy_eddysub = fetchByPrimaryKey(primaryKey);

        if (hyy_eddysub == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchHyy_eddysubException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return hyy_eddysub;
    }

    /**
     * Returns the hyy_eddysub with the primary key or throws a {@link fi.csc.smear.db.NoSuchHyy_eddysubException} if it could not be found.
     *
     * @param samptime the primary key of the hyy_eddysub
     * @return the hyy_eddysub
     * @throws fi.csc.smear.db.NoSuchHyy_eddysubException if a hyy_eddysub with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Hyy_eddysub findByPrimaryKey(java.util.Date samptime)
        throws NoSuchHyy_eddysubException, SystemException {
        return findByPrimaryKey((Serializable) samptime);
    }

    /**
     * Returns the hyy_eddysub with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the hyy_eddysub
     * @return the hyy_eddysub, or <code>null</code> if a hyy_eddysub with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Hyy_eddysub fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Hyy_eddysub hyy_eddysub = (Hyy_eddysub) EntityCacheUtil.getResult(Hyy_eddysubModelImpl.ENTITY_CACHE_ENABLED,
                Hyy_eddysubImpl.class, primaryKey);

        if (hyy_eddysub == _nullHyy_eddysub) {
            return null;
        }

        if (hyy_eddysub == null) {
            Session session = null;

            try {
                session = openSession();

                hyy_eddysub = (Hyy_eddysub) session.get(Hyy_eddysubImpl.class,
                        primaryKey);

                if (hyy_eddysub != null) {
                    cacheResult(hyy_eddysub);
                } else {
                    EntityCacheUtil.putResult(Hyy_eddysubModelImpl.ENTITY_CACHE_ENABLED,
                        Hyy_eddysubImpl.class, primaryKey, _nullHyy_eddysub);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(Hyy_eddysubModelImpl.ENTITY_CACHE_ENABLED,
                    Hyy_eddysubImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return hyy_eddysub;
    }

    /**
     * Returns the hyy_eddysub with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param samptime the primary key of the hyy_eddysub
     * @return the hyy_eddysub, or <code>null</code> if a hyy_eddysub with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Hyy_eddysub fetchByPrimaryKey(java.util.Date samptime)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) samptime);
    }

    /**
     * Returns all the hyy_eddysubs.
     *
     * @return the hyy_eddysubs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Hyy_eddysub> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the hyy_eddysubs.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.Hyy_eddysubModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of hyy_eddysubs
     * @param end the upper bound of the range of hyy_eddysubs (not inclusive)
     * @return the range of hyy_eddysubs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Hyy_eddysub> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the hyy_eddysubs.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.Hyy_eddysubModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of hyy_eddysubs
     * @param end the upper bound of the range of hyy_eddysubs (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of hyy_eddysubs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Hyy_eddysub> findAll(int start, int end,
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

        List<Hyy_eddysub> list = (List<Hyy_eddysub>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_HYY_EDDYSUB);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_HYY_EDDYSUB;

                if (pagination) {
                    sql = sql.concat(Hyy_eddysubModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Hyy_eddysub>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Hyy_eddysub>(list);
                } else {
                    list = (List<Hyy_eddysub>) QueryUtil.list(q, getDialect(),
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
     * Removes all the hyy_eddysubs from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Hyy_eddysub hyy_eddysub : findAll()) {
            remove(hyy_eddysub);
        }
    }

    /**
     * Returns the number of hyy_eddysubs.
     *
     * @return the number of hyy_eddysubs
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

                Query q = session.createQuery(_SQL_COUNT_HYY_EDDYSUB);

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
     * Initializes the hyy_eddysub persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.fi.csc.smear.db.model.Hyy_eddysub")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Hyy_eddysub>> listenersList = new ArrayList<ModelListener<Hyy_eddysub>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Hyy_eddysub>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(Hyy_eddysubImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
