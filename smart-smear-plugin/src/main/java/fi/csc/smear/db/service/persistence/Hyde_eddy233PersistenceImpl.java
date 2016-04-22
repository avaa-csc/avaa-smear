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

import fi.csc.smear.db.NoSuchHyde_eddy233Exception;
import fi.csc.smear.db.model.Hyde_eddy233;
import fi.csc.smear.db.model.impl.Hyde_eddy233Impl;
import fi.csc.smear.db.model.impl.Hyde_eddy233ModelImpl;
import fi.csc.smear.db.service.persistence.Hyde_eddy233Persistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the hyde_eddy233 service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author pj
 * @see Hyde_eddy233Persistence
 * @see Hyde_eddy233Util
 * @generated
 */
public class Hyde_eddy233PersistenceImpl extends BasePersistenceImpl<Hyde_eddy233>
    implements Hyde_eddy233Persistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link Hyde_eddy233Util} to access the hyde_eddy233 persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = Hyde_eddy233Impl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(Hyde_eddy233ModelImpl.ENTITY_CACHE_ENABLED,
            Hyde_eddy233ModelImpl.FINDER_CACHE_ENABLED, Hyde_eddy233Impl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(Hyde_eddy233ModelImpl.ENTITY_CACHE_ENABLED,
            Hyde_eddy233ModelImpl.FINDER_CACHE_ENABLED, Hyde_eddy233Impl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(Hyde_eddy233ModelImpl.ENTITY_CACHE_ENABLED,
            Hyde_eddy233ModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_HYDE_EDDY233 = "SELECT hyde_eddy233 FROM Hyde_eddy233 hyde_eddy233";
    private static final String _SQL_COUNT_HYDE_EDDY233 = "SELECT COUNT(hyde_eddy233) FROM Hyde_eddy233 hyde_eddy233";
    private static final String _ORDER_BY_ENTITY_ALIAS = "hyde_eddy233.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Hyde_eddy233 exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(Hyde_eddy233PersistenceImpl.class);
    private static Hyde_eddy233 _nullHyde_eddy233 = new Hyde_eddy233Impl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Hyde_eddy233> toCacheModel() {
                return _nullHyde_eddy233CacheModel;
            }
        };

    private static CacheModel<Hyde_eddy233> _nullHyde_eddy233CacheModel = new CacheModel<Hyde_eddy233>() {
            @Override
            public Hyde_eddy233 toEntityModel() {
                return _nullHyde_eddy233;
            }
        };

    public Hyde_eddy233PersistenceImpl() {
        setModelClass(Hyde_eddy233.class);
    }

    /**
     * Caches the hyde_eddy233 in the entity cache if it is enabled.
     *
     * @param hyde_eddy233 the hyde_eddy233
     */
    @Override
    public void cacheResult(Hyde_eddy233 hyde_eddy233) {
        EntityCacheUtil.putResult(Hyde_eddy233ModelImpl.ENTITY_CACHE_ENABLED,
            Hyde_eddy233Impl.class, hyde_eddy233.getPrimaryKey(), hyde_eddy233);

        hyde_eddy233.resetOriginalValues();
    }

    /**
     * Caches the hyde_eddy233s in the entity cache if it is enabled.
     *
     * @param hyde_eddy233s the hyde_eddy233s
     */
    @Override
    public void cacheResult(List<Hyde_eddy233> hyde_eddy233s) {
        for (Hyde_eddy233 hyde_eddy233 : hyde_eddy233s) {
            if (EntityCacheUtil.getResult(
                        Hyde_eddy233ModelImpl.ENTITY_CACHE_ENABLED,
                        Hyde_eddy233Impl.class, hyde_eddy233.getPrimaryKey()) == null) {
                cacheResult(hyde_eddy233);
            } else {
                hyde_eddy233.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all hyde_eddy233s.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(Hyde_eddy233Impl.class.getName());
        }

        EntityCacheUtil.clearCache(Hyde_eddy233Impl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the hyde_eddy233.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Hyde_eddy233 hyde_eddy233) {
        EntityCacheUtil.removeResult(Hyde_eddy233ModelImpl.ENTITY_CACHE_ENABLED,
            Hyde_eddy233Impl.class, hyde_eddy233.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<Hyde_eddy233> hyde_eddy233s) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Hyde_eddy233 hyde_eddy233 : hyde_eddy233s) {
            EntityCacheUtil.removeResult(Hyde_eddy233ModelImpl.ENTITY_CACHE_ENABLED,
                Hyde_eddy233Impl.class, hyde_eddy233.getPrimaryKey());
        }
    }

    /**
     * Creates a new hyde_eddy233 with the primary key. Does not add the hyde_eddy233 to the database.
     *
     * @param samptime the primary key for the new hyde_eddy233
     * @return the new hyde_eddy233
     */
    @Override
    public Hyde_eddy233 create(java.util.Date samptime) {
        Hyde_eddy233 hyde_eddy233 = new Hyde_eddy233Impl();

        hyde_eddy233.setNew(true);
        hyde_eddy233.setPrimaryKey(samptime);

        return hyde_eddy233;
    }

    /**
     * Removes the hyde_eddy233 with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param samptime the primary key of the hyde_eddy233
     * @return the hyde_eddy233 that was removed
     * @throws fi.csc.smear.db.NoSuchHyde_eddy233Exception if a hyde_eddy233 with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Hyde_eddy233 remove(java.util.Date samptime)
        throws NoSuchHyde_eddy233Exception, SystemException {
        return remove((Serializable) samptime);
    }

    /**
     * Removes the hyde_eddy233 with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the hyde_eddy233
     * @return the hyde_eddy233 that was removed
     * @throws fi.csc.smear.db.NoSuchHyde_eddy233Exception if a hyde_eddy233 with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Hyde_eddy233 remove(Serializable primaryKey)
        throws NoSuchHyde_eddy233Exception, SystemException {
        Session session = null;

        try {
            session = openSession();

            Hyde_eddy233 hyde_eddy233 = (Hyde_eddy233) session.get(Hyde_eddy233Impl.class,
                    primaryKey);

            if (hyde_eddy233 == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchHyde_eddy233Exception(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(hyde_eddy233);
        } catch (NoSuchHyde_eddy233Exception nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Hyde_eddy233 removeImpl(Hyde_eddy233 hyde_eddy233)
        throws SystemException {
        hyde_eddy233 = toUnwrappedModel(hyde_eddy233);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(hyde_eddy233)) {
                hyde_eddy233 = (Hyde_eddy233) session.get(Hyde_eddy233Impl.class,
                        hyde_eddy233.getPrimaryKeyObj());
            }

            if (hyde_eddy233 != null) {
                session.delete(hyde_eddy233);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (hyde_eddy233 != null) {
            clearCache(hyde_eddy233);
        }

        return hyde_eddy233;
    }

    @Override
    public Hyde_eddy233 updateImpl(
        fi.csc.smear.db.model.Hyde_eddy233 hyde_eddy233)
        throws SystemException {
        hyde_eddy233 = toUnwrappedModel(hyde_eddy233);

        boolean isNew = hyde_eddy233.isNew();

        Session session = null;

        try {
            session = openSession();

            if (hyde_eddy233.isNew()) {
                session.save(hyde_eddy233);

                hyde_eddy233.setNew(false);
            } else {
                session.merge(hyde_eddy233);
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

        EntityCacheUtil.putResult(Hyde_eddy233ModelImpl.ENTITY_CACHE_ENABLED,
            Hyde_eddy233Impl.class, hyde_eddy233.getPrimaryKey(), hyde_eddy233);

        return hyde_eddy233;
    }

    protected Hyde_eddy233 toUnwrappedModel(Hyde_eddy233 hyde_eddy233) {
        if (hyde_eddy233 instanceof Hyde_eddy233Impl) {
            return hyde_eddy233;
        }

        Hyde_eddy233Impl hyde_eddy233Impl = new Hyde_eddy233Impl();

        hyde_eddy233Impl.setNew(hyde_eddy233.isNew());
        hyde_eddy233Impl.setPrimaryKey(hyde_eddy233.getPrimaryKey());

        hyde_eddy233Impl.setSamptime(hyde_eddy233.getSamptime());
        hyde_eddy233Impl.setH(hyde_eddy233.getH());
        hyde_eddy233Impl.setLE(hyde_eddy233.getLE());
        hyde_eddy233Impl.setE(hyde_eddy233.getE());
        hyde_eddy233Impl.setF_c(hyde_eddy233.getF_c());
        hyde_eddy233Impl.setTau(hyde_eddy233.getTau());
        hyde_eddy233Impl.setU_star(hyde_eddy233.getU_star());
        hyde_eddy233Impl.setMO_length(hyde_eddy233.getMO_length());
        hyde_eddy233Impl.setStd_u(hyde_eddy233.getStd_u());
        hyde_eddy233Impl.setStd_v(hyde_eddy233.getStd_v());
        hyde_eddy233Impl.setStd_w(hyde_eddy233.getStd_w());
        hyde_eddy233Impl.setAv_u(hyde_eddy233.getAv_u());
        hyde_eddy233Impl.setAv_v(hyde_eddy233.getAv_v());
        hyde_eddy233Impl.setAv_w(hyde_eddy233.getAv_w());
        hyde_eddy233Impl.setAv_t(hyde_eddy233.getAv_t());
        hyde_eddy233Impl.setAv_c(hyde_eddy233.getAv_c());
        hyde_eddy233Impl.setAv_h(hyde_eddy233.getAv_h());
        hyde_eddy233Impl.setU(hyde_eddy233.getU());
        hyde_eddy233Impl.setWind_dir(hyde_eddy233.getWind_dir());
        hyde_eddy233Impl.setEta(hyde_eddy233.getEta());
        hyde_eddy233Impl.setTheta(hyde_eddy233.getTheta());
        hyde_eddy233Impl.setBeta(hyde_eddy233.getBeta());
        hyde_eddy233Impl.setC_lag(hyde_eddy233.getC_lag());
        hyde_eddy233Impl.setH_lag(hyde_eddy233.getH_lag());
        hyde_eddy233Impl.setErr_packet(hyde_eddy233.getErr_packet());
        hyde_eddy233Impl.setLicor_t_av(hyde_eddy233.getLicor_t_av());
        hyde_eddy233Impl.setLicor_t_std(hyde_eddy233.getLicor_t_std());
        hyde_eddy233Impl.setLicor_p_av(hyde_eddy233.getLicor_p_av());
        hyde_eddy233Impl.setLicor_p_std(hyde_eddy233.getLicor_p_std());
        hyde_eddy233Impl.setF_CPC(hyde_eddy233.getF_CPC());
        hyde_eddy233Impl.setStd_CPC(hyde_eddy233.getStd_CPC());
        hyde_eddy233Impl.setAv_CPC(hyde_eddy233.getAv_CPC());
        hyde_eddy233Impl.setCPC_lag(hyde_eddy233.getCPC_lag());
        hyde_eddy233Impl.setStd_t(hyde_eddy233.getStd_t());
        hyde_eddy233Impl.setStd_c(hyde_eddy233.getStd_c());
        hyde_eddy233Impl.setStd_h(hyde_eddy233.getStd_h());
        hyde_eddy233Impl.setQuality(hyde_eddy233.getQuality());
        hyde_eddy233Impl.setQc_H(hyde_eddy233.getQc_H());
        hyde_eddy233Impl.setQc_LE(hyde_eddy233.getQc_LE());
        hyde_eddy233Impl.setQc_E(hyde_eddy233.getQc_E());
        hyde_eddy233Impl.setQc_F_c(hyde_eddy233.getQc_F_c());
        hyde_eddy233Impl.setQc_tau(hyde_eddy233.getQc_tau());
        hyde_eddy233Impl.setQc_F_CPC(hyde_eddy233.getQc_F_CPC());
        hyde_eddy233Impl.setH_EMEP(hyde_eddy233.getH_EMEP());
        hyde_eddy233Impl.setLE_EMEP(hyde_eddy233.getLE_EMEP());
        hyde_eddy233Impl.setE_EMEP(hyde_eddy233.getE_EMEP());
        hyde_eddy233Impl.setF_c_EMEP(hyde_eddy233.getF_c_EMEP());
        hyde_eddy233Impl.setTau_EMEP(hyde_eddy233.getTau_EMEP());
        hyde_eddy233Impl.setU_star_EMEP(hyde_eddy233.getU_star_EMEP());
        hyde_eddy233Impl.setMO_length_EMEP(hyde_eddy233.getMO_length_EMEP());
        hyde_eddy233Impl.setStd_u_EMEP(hyde_eddy233.getStd_u_EMEP());
        hyde_eddy233Impl.setStd_v_EMEP(hyde_eddy233.getStd_v_EMEP());
        hyde_eddy233Impl.setStd_w_EMEP(hyde_eddy233.getStd_w_EMEP());
        hyde_eddy233Impl.setAv_u_EMEP(hyde_eddy233.getAv_u_EMEP());
        hyde_eddy233Impl.setAv_v_EMEP(hyde_eddy233.getAv_v_EMEP());
        hyde_eddy233Impl.setAv_w_EMEP(hyde_eddy233.getAv_w_EMEP());
        hyde_eddy233Impl.setAv_t_EMEP(hyde_eddy233.getAv_t_EMEP());
        hyde_eddy233Impl.setAv_c_EMEP(hyde_eddy233.getAv_c_EMEP());
        hyde_eddy233Impl.setAv_h_EMEP(hyde_eddy233.getAv_h_EMEP());
        hyde_eddy233Impl.setU_EMEP(hyde_eddy233.getU_EMEP());
        hyde_eddy233Impl.setWind_dir_EMEP(hyde_eddy233.getWind_dir_EMEP());
        hyde_eddy233Impl.setEta_EMEP(hyde_eddy233.getEta_EMEP());
        hyde_eddy233Impl.setTheta_EMEP(hyde_eddy233.getTheta_EMEP());
        hyde_eddy233Impl.setBeta_EMEP(hyde_eddy233.getBeta_EMEP());
        hyde_eddy233Impl.setC_lag_EMEP(hyde_eddy233.getC_lag_EMEP());
        hyde_eddy233Impl.setH_lag_EMEP(hyde_eddy233.getH_lag_EMEP());
        hyde_eddy233Impl.setErr_packet_EMEP(hyde_eddy233.getErr_packet_EMEP());
        hyde_eddy233Impl.setLicor_t_av_EMEP(hyde_eddy233.getLicor_t_av_EMEP());
        hyde_eddy233Impl.setLicor_t_std_EMEP(hyde_eddy233.getLicor_t_std_EMEP());
        hyde_eddy233Impl.setLicor_p_av_EMEP(hyde_eddy233.getLicor_p_av_EMEP());
        hyde_eddy233Impl.setLicor_p_std_EMEP(hyde_eddy233.getLicor_p_std_EMEP());
        hyde_eddy233Impl.setF_CPC_EMEP(hyde_eddy233.getF_CPC_EMEP());
        hyde_eddy233Impl.setStd_CPC_EMEP(hyde_eddy233.getStd_CPC_EMEP());
        hyde_eddy233Impl.setAv_CPC_EMEP(hyde_eddy233.getAv_CPC_EMEP());
        hyde_eddy233Impl.setCPC_lag_EMEP(hyde_eddy233.getCPC_lag_EMEP());
        hyde_eddy233Impl.setStd_t_EMEP(hyde_eddy233.getStd_t_EMEP());
        hyde_eddy233Impl.setStd_c_EMEP(hyde_eddy233.getStd_c_EMEP());
        hyde_eddy233Impl.setStd_h_EMEP(hyde_eddy233.getStd_h_EMEP());
        hyde_eddy233Impl.setQuality_EMEP(hyde_eddy233.getQuality_EMEP());
        hyde_eddy233Impl.setQc_H_EMEP(hyde_eddy233.getQc_H_EMEP());
        hyde_eddy233Impl.setQc_LE_EMEP(hyde_eddy233.getQc_LE_EMEP());
        hyde_eddy233Impl.setQc_E_EMEP(hyde_eddy233.getQc_E_EMEP());
        hyde_eddy233Impl.setQc_F_c_EMEP(hyde_eddy233.getQc_F_c_EMEP());
        hyde_eddy233Impl.setQc_tau_EMEP(hyde_eddy233.getQc_tau_EMEP());
        hyde_eddy233Impl.setQc_F_CPC_EMEP(hyde_eddy233.getQc_F_CPC_EMEP());
        hyde_eddy233Impl.setNEE(hyde_eddy233.getNEE());
        hyde_eddy233Impl.setQc_gapf_NEE(hyde_eddy233.getQc_gapf_NEE());
        hyde_eddy233Impl.setGPP(hyde_eddy233.getGPP());
        hyde_eddy233Impl.setTER(hyde_eddy233.getTER());
        hyde_eddy233Impl.setH_gapf(hyde_eddy233.getH_gapf());
        hyde_eddy233Impl.setQc_gapf_H(hyde_eddy233.getQc_gapf_H());
        hyde_eddy233Impl.setET_gapf(hyde_eddy233.getET_gapf());
        hyde_eddy233Impl.setQc_gapf_ET(hyde_eddy233.getQc_gapf_ET());
        hyde_eddy233Impl.setNEE_EMEP(hyde_eddy233.getNEE_EMEP());
        hyde_eddy233Impl.setQc_gapf_NEE_EMEP(hyde_eddy233.getQc_gapf_NEE_EMEP());
        hyde_eddy233Impl.setGPP_EMEP(hyde_eddy233.getGPP_EMEP());
        hyde_eddy233Impl.setTER_EMEP(hyde_eddy233.getTER_EMEP());
        hyde_eddy233Impl.setH_gapf_EMEP(hyde_eddy233.getH_gapf_EMEP());
        hyde_eddy233Impl.setQc_gapf_H_EMEP(hyde_eddy233.getQc_gapf_H_EMEP());
        hyde_eddy233Impl.setET_gapf_EMEP(hyde_eddy233.getET_gapf_EMEP());
        hyde_eddy233Impl.setQc_gapf_ET_EMEP(hyde_eddy233.getQc_gapf_ET_EMEP());

        return hyde_eddy233Impl;
    }

    /**
     * Returns the hyde_eddy233 with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the hyde_eddy233
     * @return the hyde_eddy233
     * @throws fi.csc.smear.db.NoSuchHyde_eddy233Exception if a hyde_eddy233 with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Hyde_eddy233 findByPrimaryKey(Serializable primaryKey)
        throws NoSuchHyde_eddy233Exception, SystemException {
        Hyde_eddy233 hyde_eddy233 = fetchByPrimaryKey(primaryKey);

        if (hyde_eddy233 == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchHyde_eddy233Exception(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return hyde_eddy233;
    }

    /**
     * Returns the hyde_eddy233 with the primary key or throws a {@link fi.csc.smear.db.NoSuchHyde_eddy233Exception} if it could not be found.
     *
     * @param samptime the primary key of the hyde_eddy233
     * @return the hyde_eddy233
     * @throws fi.csc.smear.db.NoSuchHyde_eddy233Exception if a hyde_eddy233 with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Hyde_eddy233 findByPrimaryKey(java.util.Date samptime)
        throws NoSuchHyde_eddy233Exception, SystemException {
        return findByPrimaryKey((Serializable) samptime);
    }

    /**
     * Returns the hyde_eddy233 with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the hyde_eddy233
     * @return the hyde_eddy233, or <code>null</code> if a hyde_eddy233 with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Hyde_eddy233 fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Hyde_eddy233 hyde_eddy233 = (Hyde_eddy233) EntityCacheUtil.getResult(Hyde_eddy233ModelImpl.ENTITY_CACHE_ENABLED,
                Hyde_eddy233Impl.class, primaryKey);

        if (hyde_eddy233 == _nullHyde_eddy233) {
            return null;
        }

        if (hyde_eddy233 == null) {
            Session session = null;

            try {
                session = openSession();

                hyde_eddy233 = (Hyde_eddy233) session.get(Hyde_eddy233Impl.class,
                        primaryKey);

                if (hyde_eddy233 != null) {
                    cacheResult(hyde_eddy233);
                } else {
                    EntityCacheUtil.putResult(Hyde_eddy233ModelImpl.ENTITY_CACHE_ENABLED,
                        Hyde_eddy233Impl.class, primaryKey, _nullHyde_eddy233);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(Hyde_eddy233ModelImpl.ENTITY_CACHE_ENABLED,
                    Hyde_eddy233Impl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return hyde_eddy233;
    }

    /**
     * Returns the hyde_eddy233 with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param samptime the primary key of the hyde_eddy233
     * @return the hyde_eddy233, or <code>null</code> if a hyde_eddy233 with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Hyde_eddy233 fetchByPrimaryKey(java.util.Date samptime)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) samptime);
    }

    /**
     * Returns all the hyde_eddy233s.
     *
     * @return the hyde_eddy233s
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Hyde_eddy233> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the hyde_eddy233s.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.Hyde_eddy233ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of hyde_eddy233s
     * @param end the upper bound of the range of hyde_eddy233s (not inclusive)
     * @return the range of hyde_eddy233s
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Hyde_eddy233> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the hyde_eddy233s.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.Hyde_eddy233ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of hyde_eddy233s
     * @param end the upper bound of the range of hyde_eddy233s (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of hyde_eddy233s
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Hyde_eddy233> findAll(int start, int end,
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

        List<Hyde_eddy233> list = (List<Hyde_eddy233>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_HYDE_EDDY233);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_HYDE_EDDY233;

                if (pagination) {
                    sql = sql.concat(Hyde_eddy233ModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Hyde_eddy233>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Hyde_eddy233>(list);
                } else {
                    list = (List<Hyde_eddy233>) QueryUtil.list(q, getDialect(),
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
     * Removes all the hyde_eddy233s from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Hyde_eddy233 hyde_eddy233 : findAll()) {
            remove(hyde_eddy233);
        }
    }

    /**
     * Returns the number of hyde_eddy233s.
     *
     * @return the number of hyde_eddy233s
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

                Query q = session.createQuery(_SQL_COUNT_HYDE_EDDY233);

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
     * Initializes the hyde_eddy233 persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.fi.csc.smear.db.model.Hyde_eddy233")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Hyde_eddy233>> listenersList = new ArrayList<ModelListener<Hyde_eddy233>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Hyde_eddy233>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(Hyde_eddy233Impl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
