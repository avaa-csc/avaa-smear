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

import fi.csc.smear.db.NoSuchkvjEddyException;
import fi.csc.smear.db.model.impl.kvjEddyImpl;
import fi.csc.smear.db.model.impl.kvjEddyModelImpl;
import fi.csc.smear.db.model.kvjEddy;
import fi.csc.smear.db.service.persistence.kvjEddyPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the kvj eddy service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author pj
 * @see kvjEddyPersistence
 * @see kvjEddyUtil
 * @generated
 */
public class kvjEddyPersistenceImpl extends BasePersistenceImpl<kvjEddy>
    implements kvjEddyPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link kvjEddyUtil} to access the kvj eddy persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = kvjEddyImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(kvjEddyModelImpl.ENTITY_CACHE_ENABLED,
            kvjEddyModelImpl.FINDER_CACHE_ENABLED, kvjEddyImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(kvjEddyModelImpl.ENTITY_CACHE_ENABLED,
            kvjEddyModelImpl.FINDER_CACHE_ENABLED, kvjEddyImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(kvjEddyModelImpl.ENTITY_CACHE_ENABLED,
            kvjEddyModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_KVJEDDY = "SELECT kvjEddy FROM kvjEddy kvjEddy";
    private static final String _SQL_COUNT_KVJEDDY = "SELECT COUNT(kvjEddy) FROM kvjEddy kvjEddy";
    private static final String _ORDER_BY_ENTITY_ALIAS = "kvjEddy.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No kvjEddy exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(kvjEddyPersistenceImpl.class);
    private static kvjEddy _nullkvjEddy = new kvjEddyImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<kvjEddy> toCacheModel() {
                return _nullkvjEddyCacheModel;
            }
        };

    private static CacheModel<kvjEddy> _nullkvjEddyCacheModel = new CacheModel<kvjEddy>() {
            @Override
            public kvjEddy toEntityModel() {
                return _nullkvjEddy;
            }
        };

    public kvjEddyPersistenceImpl() {
        setModelClass(kvjEddy.class);
    }

    /**
     * Caches the kvj eddy in the entity cache if it is enabled.
     *
     * @param kvjEddy the kvj eddy
     */
    @Override
    public void cacheResult(kvjEddy kvjEddy) {
        EntityCacheUtil.putResult(kvjEddyModelImpl.ENTITY_CACHE_ENABLED,
            kvjEddyImpl.class, kvjEddy.getPrimaryKey(), kvjEddy);

        kvjEddy.resetOriginalValues();
    }

    /**
     * Caches the kvj eddies in the entity cache if it is enabled.
     *
     * @param kvjEddies the kvj eddies
     */
    @Override
    public void cacheResult(List<kvjEddy> kvjEddies) {
        for (kvjEddy kvjEddy : kvjEddies) {
            if (EntityCacheUtil.getResult(
                        kvjEddyModelImpl.ENTITY_CACHE_ENABLED,
                        kvjEddyImpl.class, kvjEddy.getPrimaryKey()) == null) {
                cacheResult(kvjEddy);
            } else {
                kvjEddy.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all kvj eddies.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(kvjEddyImpl.class.getName());
        }

        EntityCacheUtil.clearCache(kvjEddyImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the kvj eddy.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(kvjEddy kvjEddy) {
        EntityCacheUtil.removeResult(kvjEddyModelImpl.ENTITY_CACHE_ENABLED,
            kvjEddyImpl.class, kvjEddy.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<kvjEddy> kvjEddies) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (kvjEddy kvjEddy : kvjEddies) {
            EntityCacheUtil.removeResult(kvjEddyModelImpl.ENTITY_CACHE_ENABLED,
                kvjEddyImpl.class, kvjEddy.getPrimaryKey());
        }
    }

    /**
     * Creates a new kvj eddy with the primary key. Does not add the kvj eddy to the database.
     *
     * @param samptime the primary key for the new kvj eddy
     * @return the new kvj eddy
     */
    @Override
    public kvjEddy create(java.util.Date samptime) {
        kvjEddy kvjEddy = new kvjEddyImpl();

        kvjEddy.setNew(true);
        kvjEddy.setPrimaryKey(samptime);

        return kvjEddy;
    }

    /**
     * Removes the kvj eddy with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param samptime the primary key of the kvj eddy
     * @return the kvj eddy that was removed
     * @throws fi.csc.smear.db.NoSuchkvjEddyException if a kvj eddy with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public kvjEddy remove(java.util.Date samptime)
        throws NoSuchkvjEddyException, SystemException {
        return remove((Serializable) samptime);
    }

    /**
     * Removes the kvj eddy with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the kvj eddy
     * @return the kvj eddy that was removed
     * @throws fi.csc.smear.db.NoSuchkvjEddyException if a kvj eddy with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public kvjEddy remove(Serializable primaryKey)
        throws NoSuchkvjEddyException, SystemException {
        Session session = null;

        try {
            session = openSession();

            kvjEddy kvjEddy = (kvjEddy) session.get(kvjEddyImpl.class,
                    primaryKey);

            if (kvjEddy == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchkvjEddyException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(kvjEddy);
        } catch (NoSuchkvjEddyException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected kvjEddy removeImpl(kvjEddy kvjEddy) throws SystemException {
        kvjEddy = toUnwrappedModel(kvjEddy);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(kvjEddy)) {
                kvjEddy = (kvjEddy) session.get(kvjEddyImpl.class,
                        kvjEddy.getPrimaryKeyObj());
            }

            if (kvjEddy != null) {
                session.delete(kvjEddy);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (kvjEddy != null) {
            clearCache(kvjEddy);
        }

        return kvjEddy;
    }

    @Override
    public kvjEddy updateImpl(fi.csc.smear.db.model.kvjEddy kvjEddy)
        throws SystemException {
        kvjEddy = toUnwrappedModel(kvjEddy);

        boolean isNew = kvjEddy.isNew();

        Session session = null;

        try {
            session = openSession();

            if (kvjEddy.isNew()) {
                session.save(kvjEddy);

                kvjEddy.setNew(false);
            } else {
                session.merge(kvjEddy);
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

        EntityCacheUtil.putResult(kvjEddyModelImpl.ENTITY_CACHE_ENABLED,
            kvjEddyImpl.class, kvjEddy.getPrimaryKey(), kvjEddy);

        return kvjEddy;
    }

    protected kvjEddy toUnwrappedModel(kvjEddy kvjEddy) {
        if (kvjEddy instanceof kvjEddyImpl) {
            return kvjEddy;
        }

        kvjEddyImpl kvjEddyImpl = new kvjEddyImpl();

        kvjEddyImpl.setNew(kvjEddy.isNew());
        kvjEddyImpl.setPrimaryKey(kvjEddy.getPrimaryKey());

        kvjEddyImpl.setSamptime(kvjEddy.getSamptime());
        kvjEddyImpl.setH(kvjEddy.getH());
        kvjEddyImpl.setH_EMEP(kvjEddy.getH_EMEP());
        kvjEddyImpl.setQc_H(kvjEddy.getQc_H());
        kvjEddyImpl.setQc_H_EMEP(kvjEddy.getQc_H_EMEP());
        kvjEddyImpl.setTau(kvjEddy.getTau());
        kvjEddyImpl.setTau_EMEP(kvjEddy.getTau_EMEP());
        kvjEddyImpl.setQc_tau(kvjEddy.getQc_tau());
        kvjEddyImpl.setQc_tau_EMEP(kvjEddy.getQc_tau_EMEP());
        kvjEddyImpl.setU_star(kvjEddy.getU_star());
        kvjEddyImpl.setU_star_EMEP(kvjEddy.getU_star_EMEP());
        kvjEddyImpl.setMO_length(kvjEddy.getMO_length());
        kvjEddyImpl.setMO_length_EMEP(kvjEddy.getMO_length_EMEP());
        kvjEddyImpl.setErr_packet(kvjEddy.getErr_packet());
        kvjEddyImpl.setErr_packet_EMEP(kvjEddy.getErr_packet_EMEP());
        kvjEddyImpl.setF_CO2_LI72(kvjEddy.getF_CO2_LI72());
        kvjEddyImpl.setF_CO2_LI72_EMEP(kvjEddy.getF_CO2_LI72_EMEP());
        kvjEddyImpl.setQc_CO2_LI72(kvjEddy.getQc_CO2_LI72());
        kvjEddyImpl.setQc_CO2_LI72_EMEP(kvjEddy.getQc_CO2_LI72_EMEP());
        kvjEddyImpl.setF_CH4_PICA(kvjEddy.getF_CH4_PICA());
        kvjEddyImpl.setF_CH4_PICA_EMEP(kvjEddy.getF_CH4_PICA_EMEP());
        kvjEddyImpl.setQc_CH4_PICA(kvjEddy.getQc_CH4_PICA());
        kvjEddyImpl.setQc_CH4_PICA_EMEP(kvjEddy.getQc_CH4_PICA_EMEP());
        kvjEddyImpl.setF_H2O_LI72(kvjEddy.getF_H2O_LI72());
        kvjEddyImpl.setF_H2O_LI72_EMEP(kvjEddy.getF_H2O_LI72_EMEP());
        kvjEddyImpl.setQc_H2O_LI72(kvjEddy.getQc_H2O_LI72());
        kvjEddyImpl.setQc_H2O_LI72_EMEP(kvjEddy.getQc_H2O_LI72_EMEP());
        kvjEddyImpl.setF_H2O_PICA(kvjEddy.getF_H2O_PICA());
        kvjEddyImpl.setF_H2O_PICA_EMEP(kvjEddy.getF_H2O_PICA_EMEP());
        kvjEddyImpl.setQc_H2O_PICA(kvjEddy.getQc_H2O_PICA());
        kvjEddyImpl.setQc_H2O_PICA_EMEP(kvjEddy.getQc_H2O_PICA_EMEP());
        kvjEddyImpl.setLE_LI72(kvjEddy.getLE_LI72());
        kvjEddyImpl.setLE_LI72_EMEP(kvjEddy.getLE_LI72_EMEP());
        kvjEddyImpl.setLE_PICA(kvjEddy.getLE_PICA());
        kvjEddyImpl.setLE_PICA_EMEP(kvjEddy.getLE_PICA_EMEP());
        kvjEddyImpl.setU(kvjEddy.getU());
        kvjEddyImpl.setU_EMEP(kvjEddy.getU_EMEP());
        kvjEddyImpl.setWind_dir(kvjEddy.getWind_dir());
        kvjEddyImpl.setWind_dir_EMEP(kvjEddy.getWind_dir_EMEP());
        kvjEddyImpl.setAv_u(kvjEddy.getAv_u());
        kvjEddyImpl.setAv_u_EMEP(kvjEddy.getAv_u_EMEP());
        kvjEddyImpl.setAv_v(kvjEddy.getAv_v());
        kvjEddyImpl.setAv_v_EMEP(kvjEddy.getAv_v_EMEP());
        kvjEddyImpl.setAv_w(kvjEddy.getAv_w());
        kvjEddyImpl.setAv_w_EMEP(kvjEddy.getAv_w_EMEP());
        kvjEddyImpl.setAv_t(kvjEddy.getAv_t());
        kvjEddyImpl.setAv_t_EMEP(kvjEddy.getAv_t_EMEP());
        kvjEddyImpl.setAv_c_LI72(kvjEddy.getAv_c_LI72());
        kvjEddyImpl.setAv_c_LI72_EMEP(kvjEddy.getAv_c_LI72_EMEP());
        kvjEddyImpl.setAv_h_LI72(kvjEddy.getAv_h_LI72());
        kvjEddyImpl.setAv_h_LI72_EMEP(kvjEddy.getAv_h_LI72_EMEP());
        kvjEddyImpl.setAv_h_PICA(kvjEddy.getAv_h_PICA());
        kvjEddyImpl.setAv_h_PICA_EMEP(kvjEddy.getAv_h_PICA_EMEP());
        kvjEddyImpl.setAv_CH4(kvjEddy.getAv_CH4());
        kvjEddyImpl.setAv_CH4_EMEP(kvjEddy.getAv_CH4_EMEP());
        kvjEddyImpl.setStd_u(kvjEddy.getStd_u());
        kvjEddyImpl.setStd_u_EMEP(kvjEddy.getStd_u_EMEP());
        kvjEddyImpl.setStd_v(kvjEddy.getStd_v());
        kvjEddyImpl.setStd_v_EMEP(kvjEddy.getStd_v_EMEP());
        kvjEddyImpl.setStd_w(kvjEddy.getStd_w());
        kvjEddyImpl.setStd_w_EMEP(kvjEddy.getStd_w_EMEP());
        kvjEddyImpl.setStd_t(kvjEddy.getStd_t());
        kvjEddyImpl.setStd_t_EMEP(kvjEddy.getStd_t_EMEP());
        kvjEddyImpl.setStd_c_LI72(kvjEddy.getStd_c_LI72());
        kvjEddyImpl.setStd_c_LI72_EMEP(kvjEddy.getStd_c_LI72_EMEP());
        kvjEddyImpl.setStd_h_LI72(kvjEddy.getStd_h_LI72());
        kvjEddyImpl.setStd_h_LI72_EMEP(kvjEddy.getStd_h_LI72_EMEP());
        kvjEddyImpl.setStd_h_PICA(kvjEddy.getStd_h_PICA());
        kvjEddyImpl.setStd_h_PICA_EMEP(kvjEddy.getStd_h_PICA_EMEP());
        kvjEddyImpl.setStd_CH4(kvjEddy.getStd_CH4());
        kvjEddyImpl.setStd_CH4_EMEP(kvjEddy.getStd_CH4_EMEP());
        kvjEddyImpl.setEta(kvjEddy.getEta());
        kvjEddyImpl.setEta_EMEP(kvjEddy.getEta_EMEP());
        kvjEddyImpl.setTheta(kvjEddy.getTheta());
        kvjEddyImpl.setTheta_EMEP(kvjEddy.getTheta_EMEP());
        kvjEddyImpl.setBeta(kvjEddy.getBeta());
        kvjEddyImpl.setBeta_EMEP(kvjEddy.getBeta_EMEP());
        kvjEddyImpl.setCovs_u(kvjEddy.getCovs_u());
        kvjEddyImpl.setCovs_u_EMEP(kvjEddy.getCovs_u_EMEP());
        kvjEddyImpl.setCovs_v(kvjEddy.getCovs_v());
        kvjEddyImpl.setCovs_v_EMEP(kvjEddy.getCovs_v_EMEP());
        kvjEddyImpl.setCovs_Ts(kvjEddy.getCovs_Ts());
        kvjEddyImpl.setCovs_Ts_EMEP(kvjEddy.getCovs_Ts_EMEP());
        kvjEddyImpl.setCovs_CO2_LI72(kvjEddy.getCovs_CO2_LI72());
        kvjEddyImpl.setCovs_CO2_LI72_EMEP(kvjEddy.getCovs_CO2_LI72_EMEP());
        kvjEddyImpl.setCovs_H2O_LI72(kvjEddy.getCovs_H2O_LI72());
        kvjEddyImpl.setCovs_H2O_LI72_EMEP(kvjEddy.getCovs_H2O_LI72_EMEP());
        kvjEddyImpl.setCovs_T_C_LI72(kvjEddy.getCovs_T_C_LI72());
        kvjEddyImpl.setCovs_T_C_LI72_EMEP(kvjEddy.getCovs_T_C_LI72_EMEP());
        kvjEddyImpl.setCovs_P_C_LI72(kvjEddy.getCovs_P_C_LI72());
        kvjEddyImpl.setCovs_P_C_LI72_EMEP(kvjEddy.getCovs_P_C_LI72_EMEP());
        kvjEddyImpl.setCovs_H2O_PICA(kvjEddy.getCovs_H2O_PICA());
        kvjEddyImpl.setCovs_H2O_PICA_EMEP(kvjEddy.getCovs_H2O_PICA_EMEP());
        kvjEddyImpl.setCovs_CH4_PICA(kvjEddy.getCovs_CH4_PICA());
        kvjEddyImpl.setCovs_CH4_PICA_EMEP(kvjEddy.getCovs_CH4_PICA_EMEP());
        kvjEddyImpl.setLicor_t_av(kvjEddy.getLicor_t_av());
        kvjEddyImpl.setLicor_t_av_EMEP(kvjEddy.getLicor_t_av_EMEP());
        kvjEddyImpl.setLicor_p_av(kvjEddy.getLicor_p_av());
        kvjEddyImpl.setLicor_p_av_EMEP(kvjEddy.getLicor_p_av_EMEP());
        kvjEddyImpl.setLicor_t_std(kvjEddy.getLicor_t_std());
        kvjEddyImpl.setLicor_t_std_EMEP(kvjEddy.getLicor_t_std_EMEP());
        kvjEddyImpl.setLicor_p_std(kvjEddy.getLicor_p_std());
        kvjEddyImpl.setLicor_p_std_EMEP(kvjEddy.getLicor_p_std_EMEP());
        kvjEddyImpl.setC_lag_LI72(kvjEddy.getC_lag_LI72());
        kvjEddyImpl.setC_lag_LI72_EMEP(kvjEddy.getC_lag_LI72_EMEP());
        kvjEddyImpl.setH_lag_LI72(kvjEddy.getH_lag_LI72());
        kvjEddyImpl.setH_lag_LI72_EMEP(kvjEddy.getH_lag_LI72_EMEP());
        kvjEddyImpl.setT_lag_LI72(kvjEddy.getT_lag_LI72());
        kvjEddyImpl.setT_lag_LI72_EMEP(kvjEddy.getT_lag_LI72_EMEP());
        kvjEddyImpl.setP_lag_LI72(kvjEddy.getP_lag_LI72());
        kvjEddyImpl.setP_lag_LI72_EMEP(kvjEddy.getP_lag_LI72_EMEP());
        kvjEddyImpl.setH_lag_PICA(kvjEddy.getH_lag_PICA());
        kvjEddyImpl.setH_lag_PICA_EMEP(kvjEddy.getH_lag_PICA_EMEP());
        kvjEddyImpl.setCH4_lag(kvjEddy.getCH4_lag());
        kvjEddyImpl.setCH4_lag_EMEP(kvjEddy.getCH4_lag_EMEP());
        kvjEddyImpl.setNspikes_u(kvjEddy.getNspikes_u());
        kvjEddyImpl.setNspikes_u_EMEP(kvjEddy.getNspikes_u_EMEP());
        kvjEddyImpl.setNspikes_v(kvjEddy.getNspikes_v());
        kvjEddyImpl.setNspikes_v_EMEP(kvjEddy.getNspikes_v_EMEP());
        kvjEddyImpl.setNspikes_w(kvjEddy.getNspikes_w());
        kvjEddyImpl.setNspikes_w_EMEP(kvjEddy.getNspikes_w_EMEP());
        kvjEddyImpl.setNspikes_Ts(kvjEddy.getNspikes_Ts());
        kvjEddyImpl.setNspikes_Ts_EMEP(kvjEddy.getNspikes_Ts_EMEP());
        kvjEddyImpl.setNspikes_CO2_LI72(kvjEddy.getNspikes_CO2_LI72());
        kvjEddyImpl.setNspikes_CO2_LI72_EMEP(kvjEddy.getNspikes_CO2_LI72_EMEP());
        kvjEddyImpl.setNspikes_H2O_LI72(kvjEddy.getNspikes_H2O_LI72());
        kvjEddyImpl.setNspikes_H2O_LI72_EMEP(kvjEddy.getNspikes_H2O_LI72_EMEP());
        kvjEddyImpl.setNspikes_T_C_LI72(kvjEddy.getNspikes_T_C_LI72());
        kvjEddyImpl.setNspikes_T_C_LI72_EMEP(kvjEddy.getNspikes_T_C_LI72_EMEP());
        kvjEddyImpl.setNspikes_P_C_LI72(kvjEddy.getNspikes_P_C_LI72());
        kvjEddyImpl.setNspikes_P_C_LI72_EMEP(kvjEddy.getNspikes_P_C_LI72_EMEP());
        kvjEddyImpl.setNspikes_H2O_PICA(kvjEddy.getNspikes_H2O_PICA());
        kvjEddyImpl.setNspikes_H2O_PICA_EMEP(kvjEddy.getNspikes_H2O_PICA_EMEP());
        kvjEddyImpl.setNspikes_CH4_PICA(kvjEddy.getNspikes_CH4_PICA());
        kvjEddyImpl.setNspikes_CH4_PICA_EMEP(kvjEddy.getNspikes_CH4_PICA_EMEP());
        kvjEddyImpl.setFI_u(kvjEddy.getFI_u());
        kvjEddyImpl.setFI_u_EMEP(kvjEddy.getFI_u_EMEP());
        kvjEddyImpl.setFI_Ts(kvjEddy.getFI_Ts());
        kvjEddyImpl.setFI_Ts_EMEP(kvjEddy.getFI_Ts_EMEP());
        kvjEddyImpl.setFI_CO2_LI72(kvjEddy.getFI_CO2_LI72());
        kvjEddyImpl.setFI_CO2_LI72_EMEP(kvjEddy.getFI_CO2_LI72_EMEP());
        kvjEddyImpl.setFI_H2O_LI72(kvjEddy.getFI_H2O_LI72());
        kvjEddyImpl.setFI_H2O_LI72_EMEP(kvjEddy.getFI_H2O_LI72_EMEP());
        kvjEddyImpl.setFI_CH4_PICA(kvjEddy.getFI_CH4_PICA());
        kvjEddyImpl.setFI_CH4_PICA_EMEP(kvjEddy.getFI_CH4_PICA_EMEP());
        kvjEddyImpl.setFI_H2O_PICA(kvjEddy.getFI_H2O_PICA());
        kvjEddyImpl.setFI_H2O_PICA_EMEP(kvjEddy.getFI_H2O_PICA_EMEP());
        kvjEddyImpl.setFST_u(kvjEddy.getFST_u());
        kvjEddyImpl.setFST_u_EMEP(kvjEddy.getFST_u_EMEP());
        kvjEddyImpl.setFST_Ts(kvjEddy.getFST_Ts());
        kvjEddyImpl.setFST_Ts_EMEP(kvjEddy.getFST_Ts_EMEP());
        kvjEddyImpl.setFST_CO2_LI72(kvjEddy.getFST_CO2_LI72());
        kvjEddyImpl.setFST_CO2_LI72_EMEP(kvjEddy.getFST_CO2_LI72_EMEP());
        kvjEddyImpl.setFST_H2O_LI72(kvjEddy.getFST_H2O_LI72());
        kvjEddyImpl.setFST_H2O_LI72_EMEP(kvjEddy.getFST_H2O_LI72_EMEP());
        kvjEddyImpl.setFST_CH4_PICA(kvjEddy.getFST_CH4_PICA());
        kvjEddyImpl.setFST_CH4_PICA_EMEP(kvjEddy.getFST_CH4_PICA_EMEP());
        kvjEddyImpl.setFST_H2O_PICA(kvjEddy.getFST_H2O_PICA());
        kvjEddyImpl.setFST_H2O_PICA_EMEP(kvjEddy.getFST_H2O_PICA_EMEP());
        kvjEddyImpl.setRFE_u(kvjEddy.getRFE_u());
        kvjEddyImpl.setRFE_u_EMEP(kvjEddy.getRFE_u_EMEP());
        kvjEddyImpl.setRFE_Ts(kvjEddy.getRFE_Ts());
        kvjEddyImpl.setRFE_Ts_EMEP(kvjEddy.getRFE_Ts_EMEP());
        kvjEddyImpl.setRFE_CO2_LI72(kvjEddy.getRFE_CO2_LI72());
        kvjEddyImpl.setRFE_CO2_LI72_EMEP(kvjEddy.getRFE_CO2_LI72_EMEP());
        kvjEddyImpl.setRFE_H2O_LI72(kvjEddy.getRFE_H2O_LI72());
        kvjEddyImpl.setRFE_H2O_LI72_EMEP(kvjEddy.getRFE_H2O_LI72_EMEP());
        kvjEddyImpl.setRFE_CH4_PICA(kvjEddy.getRFE_CH4_PICA());
        kvjEddyImpl.setRFE_CH4_PICA_EMEP(kvjEddy.getRFE_CH4_PICA_EMEP());
        kvjEddyImpl.setRFE_H2O_PICA(kvjEddy.getRFE_H2O_PICA());
        kvjEddyImpl.setRFE_H2O_PICA_EMEP(kvjEddy.getRFE_H2O_PICA_EMEP());
        kvjEddyImpl.setFA_u(kvjEddy.getFA_u());
        kvjEddyImpl.setFA_u_EMEP(kvjEddy.getFA_u_EMEP());
        kvjEddyImpl.setFA_v(kvjEddy.getFA_v());
        kvjEddyImpl.setFA_v_EMEP(kvjEddy.getFA_v_EMEP());
        kvjEddyImpl.setFA_Ts(kvjEddy.getFA_Ts());
        kvjEddyImpl.setFA_Ts_EMEP(kvjEddy.getFA_Ts_EMEP());
        kvjEddyImpl.setFA_CO2_LI72(kvjEddy.getFA_CO2_LI72());
        kvjEddyImpl.setFA_CO2_LI72_EMEP(kvjEddy.getFA_CO2_LI72_EMEP());
        kvjEddyImpl.setFA_H2O_LI72(kvjEddy.getFA_H2O_LI72());
        kvjEddyImpl.setFA_H2O_LI72_EMEP(kvjEddy.getFA_H2O_LI72_EMEP());
        kvjEddyImpl.setFA_CH4_PICA(kvjEddy.getFA_CH4_PICA());
        kvjEddyImpl.setFA_CH4_PICA_EMEP(kvjEddy.getFA_CH4_PICA_EMEP());
        kvjEddyImpl.setFA_H2O_PICA(kvjEddy.getFA_H2O_PICA());
        kvjEddyImpl.setFA_H2O_PICA_EMEP(kvjEddy.getFA_H2O_PICA_EMEP());
        kvjEddyImpl.setCovsvar_u(kvjEddy.getCovsvar_u());
        kvjEddyImpl.setCovsvar_u_EMEP(kvjEddy.getCovsvar_u_EMEP());
        kvjEddyImpl.setCovsvar_v(kvjEddy.getCovsvar_v());
        kvjEddyImpl.setCovsvar_v_EMEP(kvjEddy.getCovsvar_v_EMEP());
        kvjEddyImpl.setCovsvar_Ts(kvjEddy.getCovsvar_Ts());
        kvjEddyImpl.setCovsvar_Ts_EMEP(kvjEddy.getCovsvar_Ts_EMEP());
        kvjEddyImpl.setCovsvar_CO2_LI72(kvjEddy.getCovsvar_CO2_LI72());
        kvjEddyImpl.setCovsvar_CO2_LI72_EMEP(kvjEddy.getCovsvar_CO2_LI72_EMEP());
        kvjEddyImpl.setCovsvar_H2O_LI72(kvjEddy.getCovsvar_H2O_LI72());
        kvjEddyImpl.setCovsvar_H2O_LI72_EMEP(kvjEddy.getCovsvar_H2O_LI72_EMEP());
        kvjEddyImpl.setCovsvar_CH4_PICA(kvjEddy.getCovsvar_CH4_PICA());
        kvjEddyImpl.setCovsvar_CH4_PICA_EMEP(kvjEddy.getCovsvar_CH4_PICA_EMEP());
        kvjEddyImpl.setCovsvar_H2O_PICA(kvjEddy.getCovsvar_H2O_PICA());
        kvjEddyImpl.setCovsvar_H2O_PICA_EMEP(kvjEddy.getCovsvar_H2O_PICA_EMEP());
        kvjEddyImpl.setSKx_u(kvjEddy.getSKx_u());
        kvjEddyImpl.setSKx_u_EMEP(kvjEddy.getSKx_u_EMEP());
        kvjEddyImpl.setSKx_v(kvjEddy.getSKx_v());
        kvjEddyImpl.setSKx_v_EMEP(kvjEddy.getSKx_v_EMEP());
        kvjEddyImpl.setSKx_w(kvjEddy.getSKx_w());
        kvjEddyImpl.setSKx_w_EMEP(kvjEddy.getSKx_w_EMEP());
        kvjEddyImpl.setSKx_Ts(kvjEddy.getSKx_Ts());
        kvjEddyImpl.setSKx_Ts_EMEP(kvjEddy.getSKx_Ts_EMEP());
        kvjEddyImpl.setSKx_CO2_LI72(kvjEddy.getSKx_CO2_LI72());
        kvjEddyImpl.setSKx_CO2_LI72_EMEP(kvjEddy.getSKx_CO2_LI72_EMEP());
        kvjEddyImpl.setSKx_H2O_LI72(kvjEddy.getSKx_H2O_LI72());
        kvjEddyImpl.setSKx_H2O_LI72_EMEP(kvjEddy.getSKx_H2O_LI72_EMEP());
        kvjEddyImpl.setSKx_CH4_PICA(kvjEddy.getSKx_CH4_PICA());
        kvjEddyImpl.setSKx_CH4_PICA_EMEP(kvjEddy.getSKx_CH4_PICA_EMEP());
        kvjEddyImpl.setSKx_H2O_PICA(kvjEddy.getSKx_H2O_PICA());
        kvjEddyImpl.setSKx_H2O_PICA_EMEP(kvjEddy.getSKx_H2O_PICA_EMEP());
        kvjEddyImpl.setKUx_u(kvjEddy.getKUx_u());
        kvjEddyImpl.setKUx_u_EMEP(kvjEddy.getKUx_u_EMEP());
        kvjEddyImpl.setKUx_v(kvjEddy.getKUx_v());
        kvjEddyImpl.setKUx_v_EMEP(kvjEddy.getKUx_v_EMEP());
        kvjEddyImpl.setKUx_w(kvjEddy.getKUx_w());
        kvjEddyImpl.setKUx_w_EMEP(kvjEddy.getKUx_w_EMEP());
        kvjEddyImpl.setKUx_Ts(kvjEddy.getKUx_Ts());
        kvjEddyImpl.setKUx_Ts_EMEP(kvjEddy.getKUx_Ts_EMEP());
        kvjEddyImpl.setKUx_CO2_LI72(kvjEddy.getKUx_CO2_LI72());
        kvjEddyImpl.setKUx_CO2_LI72_EMEP(kvjEddy.getKUx_CO2_LI72_EMEP());
        kvjEddyImpl.setKUx_H2O_LI72(kvjEddy.getKUx_H2O_LI72());
        kvjEddyImpl.setKUx_H2O_LI72_EMEP(kvjEddy.getKUx_H2O_LI72_EMEP());
        kvjEddyImpl.setKUx_CH4_PICA(kvjEddy.getKUx_CH4_PICA());
        kvjEddyImpl.setKUx_CH4_PICA_EMEP(kvjEddy.getKUx_CH4_PICA_EMEP());
        kvjEddyImpl.setKUx_H2O_PICA(kvjEddy.getKUx_H2O_PICA());
        kvjEddyImpl.setKUx_H2O_PICA_EMEP(kvjEddy.getKUx_H2O_PICA_EMEP());
        kvjEddyImpl.setOverall_qflag_u(kvjEddy.getOverall_qflag_u());
        kvjEddyImpl.setOverall_qflag_u_EMEP(kvjEddy.getOverall_qflag_u_EMEP());
        kvjEddyImpl.setOverall_qflag_Ts(kvjEddy.getOverall_qflag_Ts());
        kvjEddyImpl.setOverall_qflag_Ts_EMEP(kvjEddy.getOverall_qflag_Ts_EMEP());
        kvjEddyImpl.setOverall_qflag_CO2_LI72(kvjEddy.getOverall_qflag_CO2_LI72());
        kvjEddyImpl.setOverall_qflag_CO2_LI72_EMEP(kvjEddy.getOverall_qflag_CO2_LI72_EMEP());
        kvjEddyImpl.setOverall_qflag_H2O_LI72(kvjEddy.getOverall_qflag_H2O_LI72());
        kvjEddyImpl.setOverall_qflag_H2O_LI72_EMEP(kvjEddy.getOverall_qflag_H2O_LI72_EMEP());
        kvjEddyImpl.setOverall_qflag_CH4_PICA(kvjEddy.getOverall_qflag_CH4_PICA());
        kvjEddyImpl.setOverall_qflag_CH4_PICA_EMEP(kvjEddy.getOverall_qflag_CH4_PICA_EMEP());
        kvjEddyImpl.setOverall_qflag_H2O_PICA(kvjEddy.getOverall_qflag_H2O_PICA());
        kvjEddyImpl.setOverall_qflag_H2O_PICA_EMEP(kvjEddy.getOverall_qflag_H2O_PICA_EMEP());
        kvjEddyImpl.setITC_qflag_w(kvjEddy.getITC_qflag_w());
        kvjEddyImpl.setITC_qflag_w_EMEP(kvjEddy.getITC_qflag_w_EMEP());
        kvjEddyImpl.setITC_qflag_u(kvjEddy.getITC_qflag_u());
        kvjEddyImpl.setITC_qflag_u_EMEP(kvjEddy.getITC_qflag_u_EMEP());
        kvjEddyImpl.setITC_qflag_Ts(kvjEddy.getITC_qflag_Ts());
        kvjEddyImpl.setITC_qflag_Ts_EMEP(kvjEddy.getITC_qflag_Ts_EMEP());
        kvjEddyImpl.setITC_qflag_CO2_LI72(kvjEddy.getITC_qflag_CO2_LI72());
        kvjEddyImpl.setITC_qflag_CO2_LI72_EMEP(kvjEddy.getITC_qflag_CO2_LI72_EMEP());
        kvjEddyImpl.setITC_qflag_H2O_LI72(kvjEddy.getITC_qflag_H2O_LI72());
        kvjEddyImpl.setITC_qflag_H2O_LI72_EMEP(kvjEddy.getITC_qflag_H2O_LI72_EMEP());
        kvjEddyImpl.setITC_qflag_CH4_PICA(kvjEddy.getITC_qflag_CH4_PICA());
        kvjEddyImpl.setITC_qflag_CH4_PICA_EMEP(kvjEddy.getITC_qflag_CH4_PICA_EMEP());
        kvjEddyImpl.setITC_qflag_H2O_PICA(kvjEddy.getITC_qflag_H2O_PICA());
        kvjEddyImpl.setITC_qflag_H2O_PICA_EMEP(kvjEddy.getITC_qflag_H2O_PICA_EMEP());
        kvjEddyImpl.setFST_qflag_u(kvjEddy.getFST_qflag_u());
        kvjEddyImpl.setFST_qflag_u_EMEP(kvjEddy.getFST_qflag_u_EMEP());
        kvjEddyImpl.setFST_qflag_Ts(kvjEddy.getFST_qflag_Ts());
        kvjEddyImpl.setFST_qflag_Ts_EMEP(kvjEddy.getFST_qflag_Ts_EMEP());
        kvjEddyImpl.setFST_qflag_CO2_LI72(kvjEddy.getFST_qflag_CO2_LI72());
        kvjEddyImpl.setFST_qflag_CO2_LI72_EMEP(kvjEddy.getFST_qflag_CO2_LI72_EMEP());
        kvjEddyImpl.setFST_qflag_H2O_LI72(kvjEddy.getFST_qflag_H2O_LI72());
        kvjEddyImpl.setFST_qflag_H2O_LI72_EMEP(kvjEddy.getFST_qflag_H2O_LI72_EMEP());
        kvjEddyImpl.setFST_qflag_CH4_PICA(kvjEddy.getFST_qflag_CH4_PICA());
        kvjEddyImpl.setFST_qflag_CH4_PICA_EMEP(kvjEddy.getFST_qflag_CH4_PICA_EMEP());
        kvjEddyImpl.setFST_qflag_H2O_PICA(kvjEddy.getFST_qflag_H2O_PICA());
        kvjEddyImpl.setFST_qflag_H2O_PICA_EMEP(kvjEddy.getFST_qflag_H2O_PICA_EMEP());
        kvjEddyImpl.setHm_u(kvjEddy.getHm_u());
        kvjEddyImpl.setHm_u_EMEP(kvjEddy.getHm_u_EMEP());
        kvjEddyImpl.setHm_Ts(kvjEddy.getHm_Ts());
        kvjEddyImpl.setHm_Ts_EMEP(kvjEddy.getHm_Ts_EMEP());
        kvjEddyImpl.setHm_CO2_LI72(kvjEddy.getHm_CO2_LI72());
        kvjEddyImpl.setHm_CO2_LI72_EMEP(kvjEddy.getHm_CO2_LI72_EMEP());
        kvjEddyImpl.setHm_H2O_LI72(kvjEddy.getHm_H2O_LI72());
        kvjEddyImpl.setHm_H2O_LI72_EMEP(kvjEddy.getHm_H2O_LI72_EMEP());
        kvjEddyImpl.setHm_CH4_PICA(kvjEddy.getHm_CH4_PICA());
        kvjEddyImpl.setHm_CH4_PICA_EMEP(kvjEddy.getHm_CH4_PICA_EMEP());
        kvjEddyImpl.setHm_H2O_PICA(kvjEddy.getHm_H2O_PICA());
        kvjEddyImpl.setHm_H2O_PICA_EMEP(kvjEddy.getHm_H2O_PICA_EMEP());
        kvjEddyImpl.setHv_u(kvjEddy.getHv_u());
        kvjEddyImpl.setHv_u_EMEP(kvjEddy.getHv_u_EMEP());
        kvjEddyImpl.setHv_Ts(kvjEddy.getHv_Ts());
        kvjEddyImpl.setHv_Ts_EMEP(kvjEddy.getHv_Ts_EMEP());
        kvjEddyImpl.setHv_CO2_LI72(kvjEddy.getHv_CO2_LI72());
        kvjEddyImpl.setHv_CO2_LI72_EMEP(kvjEddy.getHv_CO2_LI72_EMEP());
        kvjEddyImpl.setHv_H2O_LI72(kvjEddy.getHv_H2O_LI72());
        kvjEddyImpl.setHv_H2O_LI72_EMEP(kvjEddy.getHv_H2O_LI72_EMEP());
        kvjEddyImpl.setHv_CH4_PICA(kvjEddy.getHv_CH4_PICA());
        kvjEddyImpl.setHv_CH4_PICA_EMEP(kvjEddy.getHv_CH4_PICA_EMEP());
        kvjEddyImpl.setHv_H2O_PICA(kvjEddy.getHv_H2O_PICA());
        kvjEddyImpl.setHv_H2O_PICA_EMEP(kvjEddy.getHv_H2O_PICA_EMEP());
        kvjEddyImpl.setFpr_x_peak(kvjEddy.getFpr_x_peak());
        kvjEddyImpl.setFpr_x_peak_EMEP(kvjEddy.getFpr_x_peak_EMEP());
        kvjEddyImpl.setFpr_x_80(kvjEddy.getFpr_x_80());
        kvjEddyImpl.setFpr_x_80_EMEP(kvjEddy.getFpr_x_80_EMEP());

        return kvjEddyImpl;
    }

    /**
     * Returns the kvj eddy with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the kvj eddy
     * @return the kvj eddy
     * @throws fi.csc.smear.db.NoSuchkvjEddyException if a kvj eddy with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public kvjEddy findByPrimaryKey(Serializable primaryKey)
        throws NoSuchkvjEddyException, SystemException {
        kvjEddy kvjEddy = fetchByPrimaryKey(primaryKey);

        if (kvjEddy == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchkvjEddyException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return kvjEddy;
    }

    /**
     * Returns the kvj eddy with the primary key or throws a {@link fi.csc.smear.db.NoSuchkvjEddyException} if it could not be found.
     *
     * @param samptime the primary key of the kvj eddy
     * @return the kvj eddy
     * @throws fi.csc.smear.db.NoSuchkvjEddyException if a kvj eddy with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public kvjEddy findByPrimaryKey(java.util.Date samptime)
        throws NoSuchkvjEddyException, SystemException {
        return findByPrimaryKey((Serializable) samptime);
    }

    /**
     * Returns the kvj eddy with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the kvj eddy
     * @return the kvj eddy, or <code>null</code> if a kvj eddy with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public kvjEddy fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        kvjEddy kvjEddy = (kvjEddy) EntityCacheUtil.getResult(kvjEddyModelImpl.ENTITY_CACHE_ENABLED,
                kvjEddyImpl.class, primaryKey);

        if (kvjEddy == _nullkvjEddy) {
            return null;
        }

        if (kvjEddy == null) {
            Session session = null;

            try {
                session = openSession();

                kvjEddy = (kvjEddy) session.get(kvjEddyImpl.class, primaryKey);

                if (kvjEddy != null) {
                    cacheResult(kvjEddy);
                } else {
                    EntityCacheUtil.putResult(kvjEddyModelImpl.ENTITY_CACHE_ENABLED,
                        kvjEddyImpl.class, primaryKey, _nullkvjEddy);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(kvjEddyModelImpl.ENTITY_CACHE_ENABLED,
                    kvjEddyImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return kvjEddy;
    }

    /**
     * Returns the kvj eddy with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param samptime the primary key of the kvj eddy
     * @return the kvj eddy, or <code>null</code> if a kvj eddy with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public kvjEddy fetchByPrimaryKey(java.util.Date samptime)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) samptime);
    }

    /**
     * Returns all the kvj eddies.
     *
     * @return the kvj eddies
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<kvjEddy> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the kvj eddies.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.kvjEddyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of kvj eddies
     * @param end the upper bound of the range of kvj eddies (not inclusive)
     * @return the range of kvj eddies
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<kvjEddy> findAll(int start, int end) throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the kvj eddies.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.kvjEddyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of kvj eddies
     * @param end the upper bound of the range of kvj eddies (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of kvj eddies
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<kvjEddy> findAll(int start, int end,
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

        List<kvjEddy> list = (List<kvjEddy>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_KVJEDDY);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_KVJEDDY;

                if (pagination) {
                    sql = sql.concat(kvjEddyModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<kvjEddy>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<kvjEddy>(list);
                } else {
                    list = (List<kvjEddy>) QueryUtil.list(q, getDialect(),
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
     * Removes all the kvj eddies from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (kvjEddy kvjEddy : findAll()) {
            remove(kvjEddy);
        }
    }

    /**
     * Returns the number of kvj eddies.
     *
     * @return the number of kvj eddies
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

                Query q = session.createQuery(_SQL_COUNT_KVJEDDY);

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
     * Initializes the kvj eddy persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.fi.csc.smear.db.model.kvjEddy")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<kvjEddy>> listenersList = new ArrayList<ModelListener<kvjEddy>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<kvjEddy>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(kvjEddyImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
