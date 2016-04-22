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

import fi.csc.smear.db.NoSuchHyde_eddytowException;
import fi.csc.smear.db.model.Hyde_eddytow;
import fi.csc.smear.db.model.impl.Hyde_eddytowImpl;
import fi.csc.smear.db.model.impl.Hyde_eddytowModelImpl;
import fi.csc.smear.db.service.persistence.Hyde_eddytowPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the hyde_eddytow service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author pj
 * @see Hyde_eddytowPersistence
 * @see Hyde_eddytowUtil
 * @generated
 */
public class Hyde_eddytowPersistenceImpl extends BasePersistenceImpl<Hyde_eddytow>
    implements Hyde_eddytowPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link Hyde_eddytowUtil} to access the hyde_eddytow persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = Hyde_eddytowImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(Hyde_eddytowModelImpl.ENTITY_CACHE_ENABLED,
            Hyde_eddytowModelImpl.FINDER_CACHE_ENABLED, Hyde_eddytowImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(Hyde_eddytowModelImpl.ENTITY_CACHE_ENABLED,
            Hyde_eddytowModelImpl.FINDER_CACHE_ENABLED, Hyde_eddytowImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(Hyde_eddytowModelImpl.ENTITY_CACHE_ENABLED,
            Hyde_eddytowModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_HYDE_EDDYTOW = "SELECT hyde_eddytow FROM Hyde_eddytow hyde_eddytow";
    private static final String _SQL_COUNT_HYDE_EDDYTOW = "SELECT COUNT(hyde_eddytow) FROM Hyde_eddytow hyde_eddytow";
    private static final String _ORDER_BY_ENTITY_ALIAS = "hyde_eddytow.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Hyde_eddytow exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(Hyde_eddytowPersistenceImpl.class);
    private static Hyde_eddytow _nullHyde_eddytow = new Hyde_eddytowImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Hyde_eddytow> toCacheModel() {
                return _nullHyde_eddytowCacheModel;
            }
        };

    private static CacheModel<Hyde_eddytow> _nullHyde_eddytowCacheModel = new CacheModel<Hyde_eddytow>() {
            @Override
            public Hyde_eddytow toEntityModel() {
                return _nullHyde_eddytow;
            }
        };

    public Hyde_eddytowPersistenceImpl() {
        setModelClass(Hyde_eddytow.class);
    }

    /**
     * Caches the hyde_eddytow in the entity cache if it is enabled.
     *
     * @param hyde_eddytow the hyde_eddytow
     */
    @Override
    public void cacheResult(Hyde_eddytow hyde_eddytow) {
        EntityCacheUtil.putResult(Hyde_eddytowModelImpl.ENTITY_CACHE_ENABLED,
            Hyde_eddytowImpl.class, hyde_eddytow.getPrimaryKey(), hyde_eddytow);

        hyde_eddytow.resetOriginalValues();
    }

    /**
     * Caches the hyde_eddytows in the entity cache if it is enabled.
     *
     * @param hyde_eddytows the hyde_eddytows
     */
    @Override
    public void cacheResult(List<Hyde_eddytow> hyde_eddytows) {
        for (Hyde_eddytow hyde_eddytow : hyde_eddytows) {
            if (EntityCacheUtil.getResult(
                        Hyde_eddytowModelImpl.ENTITY_CACHE_ENABLED,
                        Hyde_eddytowImpl.class, hyde_eddytow.getPrimaryKey()) == null) {
                cacheResult(hyde_eddytow);
            } else {
                hyde_eddytow.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all hyde_eddytows.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(Hyde_eddytowImpl.class.getName());
        }

        EntityCacheUtil.clearCache(Hyde_eddytowImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the hyde_eddytow.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Hyde_eddytow hyde_eddytow) {
        EntityCacheUtil.removeResult(Hyde_eddytowModelImpl.ENTITY_CACHE_ENABLED,
            Hyde_eddytowImpl.class, hyde_eddytow.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<Hyde_eddytow> hyde_eddytows) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Hyde_eddytow hyde_eddytow : hyde_eddytows) {
            EntityCacheUtil.removeResult(Hyde_eddytowModelImpl.ENTITY_CACHE_ENABLED,
                Hyde_eddytowImpl.class, hyde_eddytow.getPrimaryKey());
        }
    }

    /**
     * Creates a new hyde_eddytow with the primary key. Does not add the hyde_eddytow to the database.
     *
     * @param samptime the primary key for the new hyde_eddytow
     * @return the new hyde_eddytow
     */
    @Override
    public Hyde_eddytow create(java.util.Date samptime) {
        Hyde_eddytow hyde_eddytow = new Hyde_eddytowImpl();

        hyde_eddytow.setNew(true);
        hyde_eddytow.setPrimaryKey(samptime);

        return hyde_eddytow;
    }

    /**
     * Removes the hyde_eddytow with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param samptime the primary key of the hyde_eddytow
     * @return the hyde_eddytow that was removed
     * @throws fi.csc.smear.db.NoSuchHyde_eddytowException if a hyde_eddytow with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Hyde_eddytow remove(java.util.Date samptime)
        throws NoSuchHyde_eddytowException, SystemException {
        return remove((Serializable) samptime);
    }

    /**
     * Removes the hyde_eddytow with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the hyde_eddytow
     * @return the hyde_eddytow that was removed
     * @throws fi.csc.smear.db.NoSuchHyde_eddytowException if a hyde_eddytow with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Hyde_eddytow remove(Serializable primaryKey)
        throws NoSuchHyde_eddytowException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Hyde_eddytow hyde_eddytow = (Hyde_eddytow) session.get(Hyde_eddytowImpl.class,
                    primaryKey);

            if (hyde_eddytow == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchHyde_eddytowException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(hyde_eddytow);
        } catch (NoSuchHyde_eddytowException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Hyde_eddytow removeImpl(Hyde_eddytow hyde_eddytow)
        throws SystemException {
        hyde_eddytow = toUnwrappedModel(hyde_eddytow);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(hyde_eddytow)) {
                hyde_eddytow = (Hyde_eddytow) session.get(Hyde_eddytowImpl.class,
                        hyde_eddytow.getPrimaryKeyObj());
            }

            if (hyde_eddytow != null) {
                session.delete(hyde_eddytow);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (hyde_eddytow != null) {
            clearCache(hyde_eddytow);
        }

        return hyde_eddytow;
    }

    @Override
    public Hyde_eddytow updateImpl(
        fi.csc.smear.db.model.Hyde_eddytow hyde_eddytow)
        throws SystemException {
        hyde_eddytow = toUnwrappedModel(hyde_eddytow);

        boolean isNew = hyde_eddytow.isNew();

        Session session = null;

        try {
            session = openSession();

            if (hyde_eddytow.isNew()) {
                session.save(hyde_eddytow);

                hyde_eddytow.setNew(false);
            } else {
                session.merge(hyde_eddytow);
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

        EntityCacheUtil.putResult(Hyde_eddytowModelImpl.ENTITY_CACHE_ENABLED,
            Hyde_eddytowImpl.class, hyde_eddytow.getPrimaryKey(), hyde_eddytow);

        return hyde_eddytow;
    }

    protected Hyde_eddytow toUnwrappedModel(Hyde_eddytow hyde_eddytow) {
        if (hyde_eddytow instanceof Hyde_eddytowImpl) {
            return hyde_eddytow;
        }

        Hyde_eddytowImpl hyde_eddytowImpl = new Hyde_eddytowImpl();

        hyde_eddytowImpl.setNew(hyde_eddytow.isNew());
        hyde_eddytowImpl.setPrimaryKey(hyde_eddytow.getPrimaryKey());

        hyde_eddytowImpl.setSamptime(hyde_eddytow.getSamptime());
        hyde_eddytowImpl.setH_radtow(hyde_eddytow.getH_radtow());
        hyde_eddytowImpl.setH_radtow_EMEP(hyde_eddytow.getH_radtow_EMEP());
        hyde_eddytowImpl.setQc_H_radtow(hyde_eddytow.getQc_H_radtow());
        hyde_eddytowImpl.setQc_H_radtow_EMEP(hyde_eddytow.getQc_H_radtow_EMEP());
        hyde_eddytowImpl.setLE_radtow(hyde_eddytow.getLE_radtow());
        hyde_eddytowImpl.setLE_radtow_EMEP(hyde_eddytow.getLE_radtow_EMEP());
        hyde_eddytowImpl.setQc_LE_radtow(hyde_eddytow.getQc_LE_radtow());
        hyde_eddytowImpl.setQc_LE_radtow_EMEP(hyde_eddytow.getQc_LE_radtow_EMEP());
        hyde_eddytowImpl.setE_radtow(hyde_eddytow.getE_radtow());
        hyde_eddytowImpl.setE_radtow_EMEP(hyde_eddytow.getE_radtow_EMEP());
        hyde_eddytowImpl.setQc_E_radtow(hyde_eddytow.getQc_E_radtow());
        hyde_eddytowImpl.setQc_E_radtow_EMEP(hyde_eddytow.getQc_E_radtow_EMEP());
        hyde_eddytowImpl.setF_c_radtow(hyde_eddytow.getF_c_radtow());
        hyde_eddytowImpl.setF_c_radtow_EMEP(hyde_eddytow.getF_c_radtow_EMEP());
        hyde_eddytowImpl.setQc_F_c_radtow(hyde_eddytow.getQc_F_c_radtow());
        hyde_eddytowImpl.setQc_F_c_radtow_EMEP(hyde_eddytow.getQc_F_c_radtow_EMEP());
        hyde_eddytowImpl.setTau_radtow(hyde_eddytow.getTau_radtow());
        hyde_eddytowImpl.setTau_radtow_EMEP(hyde_eddytow.getTau_radtow_EMEP());
        hyde_eddytowImpl.setQc_tau_radtow(hyde_eddytow.getQc_tau_radtow());
        hyde_eddytowImpl.setQc_tau_radtow_EMEP(hyde_eddytow.getQc_tau_radtow_EMEP());
        hyde_eddytowImpl.setU_star_radtow(hyde_eddytow.getU_star_radtow());
        hyde_eddytowImpl.setU_star_radtow_EMEP(hyde_eddytow.getU_star_radtow_EMEP());
        hyde_eddytowImpl.setMO_length_radtow(hyde_eddytow.getMO_length_radtow());
        hyde_eddytowImpl.setMO_length_radtow_EMEP(hyde_eddytow.getMO_length_radtow_EMEP());
        hyde_eddytowImpl.setStd_u_radtow(hyde_eddytow.getStd_u_radtow());
        hyde_eddytowImpl.setStd_u_radtow_EMEP(hyde_eddytow.getStd_u_radtow_EMEP());
        hyde_eddytowImpl.setStd_v_radtow(hyde_eddytow.getStd_v_radtow());
        hyde_eddytowImpl.setStd_v_radtow_EMEP(hyde_eddytow.getStd_v_radtow_EMEP());
        hyde_eddytowImpl.setStd_w_radtow(hyde_eddytow.getStd_w_radtow());
        hyde_eddytowImpl.setStd_w_radtow_EMEP(hyde_eddytow.getStd_w_radtow_EMEP());
        hyde_eddytowImpl.setStd_t_radtow(hyde_eddytow.getStd_t_radtow());
        hyde_eddytowImpl.setStd_t_radtow_EMEP(hyde_eddytow.getStd_t_radtow_EMEP());
        hyde_eddytowImpl.setStd_c_radtow(hyde_eddytow.getStd_c_radtow());
        hyde_eddytowImpl.setStd_c_radtow_EMEP(hyde_eddytow.getStd_c_radtow_EMEP());
        hyde_eddytowImpl.setStd_h_radtow(hyde_eddytow.getStd_h_radtow());
        hyde_eddytowImpl.setStd_h_radtow_EMEP(hyde_eddytow.getStd_h_radtow_EMEP());
        hyde_eddytowImpl.setAv_u_radtow(hyde_eddytow.getAv_u_radtow());
        hyde_eddytowImpl.setAv_u_radtow_EMEP(hyde_eddytow.getAv_u_radtow_EMEP());
        hyde_eddytowImpl.setAv_v_radtow(hyde_eddytow.getAv_v_radtow());
        hyde_eddytowImpl.setAv_v_radtow_EMEP(hyde_eddytow.getAv_v_radtow_EMEP());
        hyde_eddytowImpl.setAv_w_radtow(hyde_eddytow.getAv_w_radtow());
        hyde_eddytowImpl.setAv_w_radtow_EMEP(hyde_eddytow.getAv_w_radtow_EMEP());
        hyde_eddytowImpl.setAv_t_radtow(hyde_eddytow.getAv_t_radtow());
        hyde_eddytowImpl.setAv_t_radtow_EMEP(hyde_eddytow.getAv_t_radtow_EMEP());
        hyde_eddytowImpl.setAv_c_radtow(hyde_eddytow.getAv_c_radtow());
        hyde_eddytowImpl.setAv_c_radtow_EMEP(hyde_eddytow.getAv_c_radtow_EMEP());
        hyde_eddytowImpl.setAv_h_radtow(hyde_eddytow.getAv_h_radtow());
        hyde_eddytowImpl.setAv_h_radtow_EMEP(hyde_eddytow.getAv_h_radtow_EMEP());
        hyde_eddytowImpl.setU_radtow(hyde_eddytow.getU_radtow());
        hyde_eddytowImpl.setU_radtow_EMEP(hyde_eddytow.getU_radtow_EMEP());
        hyde_eddytowImpl.setWind_dir_radtow(hyde_eddytow.getWind_dir_radtow());
        hyde_eddytowImpl.setWind_dir_radtow_EMEP(hyde_eddytow.getWind_dir_radtow_EMEP());
        hyde_eddytowImpl.setEta_radtow(hyde_eddytow.getEta_radtow());
        hyde_eddytowImpl.setEta_radtow_EMEP(hyde_eddytow.getEta_radtow_EMEP());
        hyde_eddytowImpl.setTheta_radtow(hyde_eddytow.getTheta_radtow());
        hyde_eddytowImpl.setTheta_radtow_EMEP(hyde_eddytow.getTheta_radtow_EMEP());
        hyde_eddytowImpl.setBeta_radtow(hyde_eddytow.getBeta_radtow());
        hyde_eddytowImpl.setBeta_radtow_EMEP(hyde_eddytow.getBeta_radtow_EMEP());
        hyde_eddytowImpl.setC_lag_radtow(hyde_eddytow.getC_lag_radtow());
        hyde_eddytowImpl.setC_lag_radtow_EMEP(hyde_eddytow.getC_lag_radtow_EMEP());
        hyde_eddytowImpl.setH_lag_radtow(hyde_eddytow.getH_lag_radtow());
        hyde_eddytowImpl.setH_lag_radtow_EMEP(hyde_eddytow.getH_lag_radtow_EMEP());
        hyde_eddytowImpl.setErr_packet_radtow(hyde_eddytow.getErr_packet_radtow());
        hyde_eddytowImpl.setErr_packet_radtow_EMEP(hyde_eddytow.getErr_packet_radtow_EMEP());
        hyde_eddytowImpl.setLicor_t_std_radtow(hyde_eddytow.getLicor_t_std_radtow());
        hyde_eddytowImpl.setLicor_t_std_radtow_EMEP(hyde_eddytow.getLicor_t_std_radtow_EMEP());
        hyde_eddytowImpl.setLicor_t_av_radtow(hyde_eddytow.getLicor_t_av_radtow());
        hyde_eddytowImpl.setLicor_t_av_radtow_EMEP(hyde_eddytow.getLicor_t_av_radtow_EMEP());
        hyde_eddytowImpl.setLicor_p_std_radtow(hyde_eddytow.getLicor_p_std_radtow());
        hyde_eddytowImpl.setLicor_p_std_radtow_EMEP(hyde_eddytow.getLicor_p_std_radtow_EMEP());
        hyde_eddytowImpl.setLicor_p_av_radtow(hyde_eddytow.getLicor_p_av_radtow());
        hyde_eddytowImpl.setLicor_p_av_radtow_EMEP(hyde_eddytow.getLicor_p_av_radtow_EMEP());
        hyde_eddytowImpl.setF_O3_radtow(hyde_eddytow.getF_O3_radtow());
        hyde_eddytowImpl.setF_O3_radtow_EMEP(hyde_eddytow.getF_O3_radtow_EMEP());
        hyde_eddytowImpl.setQc_F_O3_radtow(hyde_eddytow.getQc_F_O3_radtow());
        hyde_eddytowImpl.setQc_F_O3_radtow_EMEP(hyde_eddytow.getQc_F_O3_radtow_EMEP());
        hyde_eddytowImpl.setStd_O3_radtow(hyde_eddytow.getStd_O3_radtow());
        hyde_eddytowImpl.setStd_O3_radtow_EMEP(hyde_eddytow.getStd_O3_radtow_EMEP());
        hyde_eddytowImpl.setAv_O3_radtow(hyde_eddytow.getAv_O3_radtow());
        hyde_eddytowImpl.setAv_O3_radtow_EMEP(hyde_eddytow.getAv_O3_radtow_EMEP());
        hyde_eddytowImpl.setO3_lag_radtow(hyde_eddytow.getO3_lag_radtow());
        hyde_eddytowImpl.setO3_lag_radtow_EMEP(hyde_eddytow.getO3_lag_radtow_EMEP());
        hyde_eddytowImpl.setNEE_radtow(hyde_eddytow.getNEE_radtow());
        hyde_eddytowImpl.setNEE_radtow_EMEP(hyde_eddytow.getNEE_radtow_EMEP());
        hyde_eddytowImpl.setQc_gapf_NEE_radtow(hyde_eddytow.getQc_gapf_NEE_radtow());
        hyde_eddytowImpl.setQc_gapf_NEE_radtow_EMEP(hyde_eddytow.getQc_gapf_NEE_radtow_EMEP());
        hyde_eddytowImpl.setGPP_radtow(hyde_eddytow.getGPP_radtow());
        hyde_eddytowImpl.setGPP_radtow_EMEP(hyde_eddytow.getGPP_radtow_EMEP());
        hyde_eddytowImpl.setTER_radtow(hyde_eddytow.getTER_radtow());
        hyde_eddytowImpl.setTER_radtow_EMEP(hyde_eddytow.getTER_radtow_EMEP());

        return hyde_eddytowImpl;
    }

    /**
     * Returns the hyde_eddytow with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the hyde_eddytow
     * @return the hyde_eddytow
     * @throws fi.csc.smear.db.NoSuchHyde_eddytowException if a hyde_eddytow with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Hyde_eddytow findByPrimaryKey(Serializable primaryKey)
        throws NoSuchHyde_eddytowException, SystemException {
        Hyde_eddytow hyde_eddytow = fetchByPrimaryKey(primaryKey);

        if (hyde_eddytow == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchHyde_eddytowException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return hyde_eddytow;
    }

    /**
     * Returns the hyde_eddytow with the primary key or throws a {@link fi.csc.smear.db.NoSuchHyde_eddytowException} if it could not be found.
     *
     * @param samptime the primary key of the hyde_eddytow
     * @return the hyde_eddytow
     * @throws fi.csc.smear.db.NoSuchHyde_eddytowException if a hyde_eddytow with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Hyde_eddytow findByPrimaryKey(java.util.Date samptime)
        throws NoSuchHyde_eddytowException, SystemException {
        return findByPrimaryKey((Serializable) samptime);
    }

    /**
     * Returns the hyde_eddytow with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the hyde_eddytow
     * @return the hyde_eddytow, or <code>null</code> if a hyde_eddytow with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Hyde_eddytow fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Hyde_eddytow hyde_eddytow = (Hyde_eddytow) EntityCacheUtil.getResult(Hyde_eddytowModelImpl.ENTITY_CACHE_ENABLED,
                Hyde_eddytowImpl.class, primaryKey);

        if (hyde_eddytow == _nullHyde_eddytow) {
            return null;
        }

        if (hyde_eddytow == null) {
            Session session = null;

            try {
                session = openSession();

                hyde_eddytow = (Hyde_eddytow) session.get(Hyde_eddytowImpl.class,
                        primaryKey);

                if (hyde_eddytow != null) {
                    cacheResult(hyde_eddytow);
                } else {
                    EntityCacheUtil.putResult(Hyde_eddytowModelImpl.ENTITY_CACHE_ENABLED,
                        Hyde_eddytowImpl.class, primaryKey, _nullHyde_eddytow);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(Hyde_eddytowModelImpl.ENTITY_CACHE_ENABLED,
                    Hyde_eddytowImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return hyde_eddytow;
    }

    /**
     * Returns the hyde_eddytow with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param samptime the primary key of the hyde_eddytow
     * @return the hyde_eddytow, or <code>null</code> if a hyde_eddytow with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Hyde_eddytow fetchByPrimaryKey(java.util.Date samptime)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) samptime);
    }

    /**
     * Returns all the hyde_eddytows.
     *
     * @return the hyde_eddytows
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Hyde_eddytow> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the hyde_eddytows.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.Hyde_eddytowModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of hyde_eddytows
     * @param end the upper bound of the range of hyde_eddytows (not inclusive)
     * @return the range of hyde_eddytows
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Hyde_eddytow> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the hyde_eddytows.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.Hyde_eddytowModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of hyde_eddytows
     * @param end the upper bound of the range of hyde_eddytows (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of hyde_eddytows
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Hyde_eddytow> findAll(int start, int end,
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

        List<Hyde_eddytow> list = (List<Hyde_eddytow>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_HYDE_EDDYTOW);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_HYDE_EDDYTOW;

                if (pagination) {
                    sql = sql.concat(Hyde_eddytowModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Hyde_eddytow>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Hyde_eddytow>(list);
                } else {
                    list = (List<Hyde_eddytow>) QueryUtil.list(q, getDialect(),
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
     * Removes all the hyde_eddytows from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Hyde_eddytow hyde_eddytow : findAll()) {
            remove(hyde_eddytow);
        }
    }

    /**
     * Returns the number of hyde_eddytows.
     *
     * @return the number of hyde_eddytows
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

                Query q = session.createQuery(_SQL_COUNT_HYDE_EDDYTOW);

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
     * Initializes the hyde_eddytow persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.fi.csc.smear.db.model.Hyde_eddytow")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Hyde_eddytow>> listenersList = new ArrayList<ModelListener<Hyde_eddytow>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Hyde_eddytow>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(Hyde_eddytowImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
