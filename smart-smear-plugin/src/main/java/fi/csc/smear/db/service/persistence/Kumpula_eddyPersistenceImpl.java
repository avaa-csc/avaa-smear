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

import fi.csc.smear.db.NoSuchKumpula_eddyException;
import fi.csc.smear.db.model.Kumpula_eddy;
import fi.csc.smear.db.model.impl.Kumpula_eddyImpl;
import fi.csc.smear.db.model.impl.Kumpula_eddyModelImpl;
import fi.csc.smear.db.service.persistence.Kumpula_eddyPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the kumpula_eddy service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author pj
 * @see Kumpula_eddyPersistence
 * @see Kumpula_eddyUtil
 * @generated
 */
public class Kumpula_eddyPersistenceImpl extends BasePersistenceImpl<Kumpula_eddy>
    implements Kumpula_eddyPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link Kumpula_eddyUtil} to access the kumpula_eddy persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = Kumpula_eddyImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(Kumpula_eddyModelImpl.ENTITY_CACHE_ENABLED,
            Kumpula_eddyModelImpl.FINDER_CACHE_ENABLED, Kumpula_eddyImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(Kumpula_eddyModelImpl.ENTITY_CACHE_ENABLED,
            Kumpula_eddyModelImpl.FINDER_CACHE_ENABLED, Kumpula_eddyImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(Kumpula_eddyModelImpl.ENTITY_CACHE_ENABLED,
            Kumpula_eddyModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_KUMPULA_EDDY = "SELECT kumpula_eddy FROM Kumpula_eddy kumpula_eddy";
    private static final String _SQL_COUNT_KUMPULA_EDDY = "SELECT COUNT(kumpula_eddy) FROM Kumpula_eddy kumpula_eddy";
    private static final String _ORDER_BY_ENTITY_ALIAS = "kumpula_eddy.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Kumpula_eddy exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(Kumpula_eddyPersistenceImpl.class);
    private static Kumpula_eddy _nullKumpula_eddy = new Kumpula_eddyImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Kumpula_eddy> toCacheModel() {
                return _nullKumpula_eddyCacheModel;
            }
        };

    private static CacheModel<Kumpula_eddy> _nullKumpula_eddyCacheModel = new CacheModel<Kumpula_eddy>() {
            @Override
            public Kumpula_eddy toEntityModel() {
                return _nullKumpula_eddy;
            }
        };

    public Kumpula_eddyPersistenceImpl() {
        setModelClass(Kumpula_eddy.class);
    }

    /**
     * Caches the kumpula_eddy in the entity cache if it is enabled.
     *
     * @param kumpula_eddy the kumpula_eddy
     */
    @Override
    public void cacheResult(Kumpula_eddy kumpula_eddy) {
        EntityCacheUtil.putResult(Kumpula_eddyModelImpl.ENTITY_CACHE_ENABLED,
            Kumpula_eddyImpl.class, kumpula_eddy.getPrimaryKey(), kumpula_eddy);

        kumpula_eddy.resetOriginalValues();
    }

    /**
     * Caches the kumpula_eddies in the entity cache if it is enabled.
     *
     * @param kumpula_eddies the kumpula_eddies
     */
    @Override
    public void cacheResult(List<Kumpula_eddy> kumpula_eddies) {
        for (Kumpula_eddy kumpula_eddy : kumpula_eddies) {
            if (EntityCacheUtil.getResult(
                        Kumpula_eddyModelImpl.ENTITY_CACHE_ENABLED,
                        Kumpula_eddyImpl.class, kumpula_eddy.getPrimaryKey()) == null) {
                cacheResult(kumpula_eddy);
            } else {
                kumpula_eddy.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all kumpula_eddies.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(Kumpula_eddyImpl.class.getName());
        }

        EntityCacheUtil.clearCache(Kumpula_eddyImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the kumpula_eddy.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Kumpula_eddy kumpula_eddy) {
        EntityCacheUtil.removeResult(Kumpula_eddyModelImpl.ENTITY_CACHE_ENABLED,
            Kumpula_eddyImpl.class, kumpula_eddy.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<Kumpula_eddy> kumpula_eddies) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Kumpula_eddy kumpula_eddy : kumpula_eddies) {
            EntityCacheUtil.removeResult(Kumpula_eddyModelImpl.ENTITY_CACHE_ENABLED,
                Kumpula_eddyImpl.class, kumpula_eddy.getPrimaryKey());
        }
    }

    /**
     * Creates a new kumpula_eddy with the primary key. Does not add the kumpula_eddy to the database.
     *
     * @param samptime the primary key for the new kumpula_eddy
     * @return the new kumpula_eddy
     */
    @Override
    public Kumpula_eddy create(java.util.Date samptime) {
        Kumpula_eddy kumpula_eddy = new Kumpula_eddyImpl();

        kumpula_eddy.setNew(true);
        kumpula_eddy.setPrimaryKey(samptime);

        return kumpula_eddy;
    }

    /**
     * Removes the kumpula_eddy with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param samptime the primary key of the kumpula_eddy
     * @return the kumpula_eddy that was removed
     * @throws fi.csc.smear.db.NoSuchKumpula_eddyException if a kumpula_eddy with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Kumpula_eddy remove(java.util.Date samptime)
        throws NoSuchKumpula_eddyException, SystemException {
        return remove((Serializable) samptime);
    }

    /**
     * Removes the kumpula_eddy with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the kumpula_eddy
     * @return the kumpula_eddy that was removed
     * @throws fi.csc.smear.db.NoSuchKumpula_eddyException if a kumpula_eddy with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Kumpula_eddy remove(Serializable primaryKey)
        throws NoSuchKumpula_eddyException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Kumpula_eddy kumpula_eddy = (Kumpula_eddy) session.get(Kumpula_eddyImpl.class,
                    primaryKey);

            if (kumpula_eddy == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchKumpula_eddyException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(kumpula_eddy);
        } catch (NoSuchKumpula_eddyException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Kumpula_eddy removeImpl(Kumpula_eddy kumpula_eddy)
        throws SystemException {
        kumpula_eddy = toUnwrappedModel(kumpula_eddy);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(kumpula_eddy)) {
                kumpula_eddy = (Kumpula_eddy) session.get(Kumpula_eddyImpl.class,
                        kumpula_eddy.getPrimaryKeyObj());
            }

            if (kumpula_eddy != null) {
                session.delete(kumpula_eddy);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (kumpula_eddy != null) {
            clearCache(kumpula_eddy);
        }

        return kumpula_eddy;
    }

    @Override
    public Kumpula_eddy updateImpl(
        fi.csc.smear.db.model.Kumpula_eddy kumpula_eddy)
        throws SystemException {
        kumpula_eddy = toUnwrappedModel(kumpula_eddy);

        boolean isNew = kumpula_eddy.isNew();

        Session session = null;

        try {
            session = openSession();

            if (kumpula_eddy.isNew()) {
                session.save(kumpula_eddy);

                kumpula_eddy.setNew(false);
            } else {
                session.merge(kumpula_eddy);
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

        EntityCacheUtil.putResult(Kumpula_eddyModelImpl.ENTITY_CACHE_ENABLED,
            Kumpula_eddyImpl.class, kumpula_eddy.getPrimaryKey(), kumpula_eddy);

        return kumpula_eddy;
    }

    protected Kumpula_eddy toUnwrappedModel(Kumpula_eddy kumpula_eddy) {
        if (kumpula_eddy instanceof Kumpula_eddyImpl) {
            return kumpula_eddy;
        }

        Kumpula_eddyImpl kumpula_eddyImpl = new Kumpula_eddyImpl();

        kumpula_eddyImpl.setNew(kumpula_eddy.isNew());
        kumpula_eddyImpl.setPrimaryKey(kumpula_eddy.getPrimaryKey());

        kumpula_eddyImpl.setSamptime(kumpula_eddy.getSamptime());
        kumpula_eddyImpl.setH(kumpula_eddy.getH());
        kumpula_eddyImpl.setH_EMEP(kumpula_eddy.getH_EMEP());
        kumpula_eddyImpl.setQc_H(kumpula_eddy.getQc_H());
        kumpula_eddyImpl.setQc_H_EMEP(kumpula_eddy.getQc_H_EMEP());
        kumpula_eddyImpl.setLE(kumpula_eddy.getLE());
        kumpula_eddyImpl.setLE_EMEP(kumpula_eddy.getLE_EMEP());
        kumpula_eddyImpl.setQc_LE(kumpula_eddy.getQc_LE());
        kumpula_eddyImpl.setQc_LE_EMEP(kumpula_eddy.getQc_LE_EMEP());
        kumpula_eddyImpl.setE(kumpula_eddy.getE());
        kumpula_eddyImpl.setE_EMEP(kumpula_eddy.getE_EMEP());
        kumpula_eddyImpl.setQc_E(kumpula_eddy.getQc_E());
        kumpula_eddyImpl.setQc_E_EMEP(kumpula_eddy.getQc_E_EMEP());
        kumpula_eddyImpl.setF_c(kumpula_eddy.getF_c());
        kumpula_eddyImpl.setF_c_EMEP(kumpula_eddy.getF_c_EMEP());
        kumpula_eddyImpl.setQc_F_c(kumpula_eddy.getQc_F_c());
        kumpula_eddyImpl.setQc_F_c_EMEP(kumpula_eddy.getQc_F_c_EMEP());
        kumpula_eddyImpl.setTau(kumpula_eddy.getTau());
        kumpula_eddyImpl.setTau_EMEP(kumpula_eddy.getTau_EMEP());
        kumpula_eddyImpl.setQc_tau(kumpula_eddy.getQc_tau());
        kumpula_eddyImpl.setQc_tau_EMEP(kumpula_eddy.getQc_tau_EMEP());
        kumpula_eddyImpl.setU_star(kumpula_eddy.getU_star());
        kumpula_eddyImpl.setU_star_EMEP(kumpula_eddy.getU_star_EMEP());
        kumpula_eddyImpl.setMO_length(kumpula_eddy.getMO_length());
        kumpula_eddyImpl.setMO_length_EMEP(kumpula_eddy.getMO_length_EMEP());
        kumpula_eddyImpl.setStd_u(kumpula_eddy.getStd_u());
        kumpula_eddyImpl.setStd_u_EMEP(kumpula_eddy.getStd_u_EMEP());
        kumpula_eddyImpl.setStd_v(kumpula_eddy.getStd_v());
        kumpula_eddyImpl.setStd_v_EMEP(kumpula_eddy.getStd_v_EMEP());
        kumpula_eddyImpl.setStd_w(kumpula_eddy.getStd_w());
        kumpula_eddyImpl.setStd_w_EMEP(kumpula_eddy.getStd_w_EMEP());
        kumpula_eddyImpl.setStd_t(kumpula_eddy.getStd_t());
        kumpula_eddyImpl.setStd_t_EMEP(kumpula_eddy.getStd_t_EMEP());
        kumpula_eddyImpl.setStd_c(kumpula_eddy.getStd_c());
        kumpula_eddyImpl.setStd_c_EMEP(kumpula_eddy.getStd_c_EMEP());
        kumpula_eddyImpl.setStd_h(kumpula_eddy.getStd_h());
        kumpula_eddyImpl.setStd_h_EMEP(kumpula_eddy.getStd_h_EMEP());
        kumpula_eddyImpl.setAv_u(kumpula_eddy.getAv_u());
        kumpula_eddyImpl.setAv_u_EMEP(kumpula_eddy.getAv_u_EMEP());
        kumpula_eddyImpl.setAv_v(kumpula_eddy.getAv_v());
        kumpula_eddyImpl.setAv_v_EMEP(kumpula_eddy.getAv_v_EMEP());
        kumpula_eddyImpl.setAv_w(kumpula_eddy.getAv_w());
        kumpula_eddyImpl.setAv_w_EMEP(kumpula_eddy.getAv_w_EMEP());
        kumpula_eddyImpl.setAv_t(kumpula_eddy.getAv_t());
        kumpula_eddyImpl.setAv_t_EMEP(kumpula_eddy.getAv_t_EMEP());
        kumpula_eddyImpl.setAv_c(kumpula_eddy.getAv_c());
        kumpula_eddyImpl.setAv_c_EMEP(kumpula_eddy.getAv_c_EMEP());
        kumpula_eddyImpl.setAv_h(kumpula_eddy.getAv_h());
        kumpula_eddyImpl.setAv_h_EMEP(kumpula_eddy.getAv_h_EMEP());
        kumpula_eddyImpl.setU(kumpula_eddy.getU());
        kumpula_eddyImpl.setU_EMEP(kumpula_eddy.getU_EMEP());
        kumpula_eddyImpl.setWind_dir(kumpula_eddy.getWind_dir());
        kumpula_eddyImpl.setWind_dir_EMEP(kumpula_eddy.getWind_dir_EMEP());
        kumpula_eddyImpl.setEta(kumpula_eddy.getEta());
        kumpula_eddyImpl.setEta_EMEP(kumpula_eddy.getEta_EMEP());
        kumpula_eddyImpl.setTheta(kumpula_eddy.getTheta());
        kumpula_eddyImpl.setTheta_EMEP(kumpula_eddy.getTheta_EMEP());
        kumpula_eddyImpl.setBeta(kumpula_eddy.getBeta());
        kumpula_eddyImpl.setBeta_EMEP(kumpula_eddy.getBeta_EMEP());
        kumpula_eddyImpl.setC_lag(kumpula_eddy.getC_lag());
        kumpula_eddyImpl.setC_lag_EMEP(kumpula_eddy.getC_lag_EMEP());
        kumpula_eddyImpl.setH_lag(kumpula_eddy.getH_lag());
        kumpula_eddyImpl.setH_lag_EMEP(kumpula_eddy.getH_lag_EMEP());
        kumpula_eddyImpl.setErr_packet(kumpula_eddy.getErr_packet());
        kumpula_eddyImpl.setErr_packet_EMEP(kumpula_eddy.getErr_packet_EMEP());
        kumpula_eddyImpl.setLicor_t_std(kumpula_eddy.getLicor_t_std());
        kumpula_eddyImpl.setLicor_t_std_EMEP(kumpula_eddy.getLicor_t_std_EMEP());
        kumpula_eddyImpl.setLicor_t_av(kumpula_eddy.getLicor_t_av());
        kumpula_eddyImpl.setLicor_t_av_EMEP(kumpula_eddy.getLicor_t_av_EMEP());
        kumpula_eddyImpl.setLicor_p_std(kumpula_eddy.getLicor_p_std());
        kumpula_eddyImpl.setLicor_p_std_EMEP(kumpula_eddy.getLicor_p_std_EMEP());
        kumpula_eddyImpl.setLicor_p_av(kumpula_eddy.getLicor_p_av());
        kumpula_eddyImpl.setLicor_p_av_EMEP(kumpula_eddy.getLicor_p_av_EMEP());
        kumpula_eddyImpl.setLE_op(kumpula_eddy.getLE_op());
        kumpula_eddyImpl.setLE_op_EMEP(kumpula_eddy.getLE_op_EMEP());
        kumpula_eddyImpl.setQc_LE_op(kumpula_eddy.getQc_LE_op());
        kumpula_eddyImpl.setQc_LE_op_EMEP(kumpula_eddy.getQc_LE_op_EMEP());
        kumpula_eddyImpl.setE_op(kumpula_eddy.getE_op());
        kumpula_eddyImpl.setE_op_EMEP(kumpula_eddy.getE_op_EMEP());
        kumpula_eddyImpl.setQc_E_op(kumpula_eddy.getQc_E_op());
        kumpula_eddyImpl.setQc_E_op_EMEP(kumpula_eddy.getQc_E_op_EMEP());
        kumpula_eddyImpl.setF_c_op(kumpula_eddy.getF_c_op());
        kumpula_eddyImpl.setF_c_op_EMEP(kumpula_eddy.getF_c_op_EMEP());
        kumpula_eddyImpl.setQc_F_c_op(kumpula_eddy.getQc_F_c_op());
        kumpula_eddyImpl.setQc_F_c_op_EMEP(kumpula_eddy.getQc_F_c_op_EMEP());
        kumpula_eddyImpl.setStd_c_op(kumpula_eddy.getStd_c_op());
        kumpula_eddyImpl.setStd_c_op_EMEP(kumpula_eddy.getStd_c_op_EMEP());
        kumpula_eddyImpl.setStd_h_op(kumpula_eddy.getStd_h_op());
        kumpula_eddyImpl.setStd_h_op_EMEP(kumpula_eddy.getStd_h_op_EMEP());
        kumpula_eddyImpl.setAv_c_op(kumpula_eddy.getAv_c_op());
        kumpula_eddyImpl.setAv_c_op_EMEP(kumpula_eddy.getAv_c_op_EMEP());
        kumpula_eddyImpl.setAv_h_op(kumpula_eddy.getAv_h_op());
        kumpula_eddyImpl.setAv_h_op_EMEP(kumpula_eddy.getAv_h_op_EMEP());
        kumpula_eddyImpl.setC_lag_op(kumpula_eddy.getC_lag_op());
        kumpula_eddyImpl.setC_lag_op_EMEP(kumpula_eddy.getC_lag_op_EMEP());
        kumpula_eddyImpl.setH_lag_op(kumpula_eddy.getH_lag_op());
        kumpula_eddyImpl.setH_lag_op_EMEP(kumpula_eddy.getH_lag_op_EMEP());
        kumpula_eddyImpl.setF_CPC(kumpula_eddy.getF_CPC());
        kumpula_eddyImpl.setF_CPC_EMEP(kumpula_eddy.getF_CPC_EMEP());
        kumpula_eddyImpl.setQc_F_CPC(kumpula_eddy.getQc_F_CPC());
        kumpula_eddyImpl.setQc_F_CPC_EMEP(kumpula_eddy.getQc_F_CPC_EMEP());
        kumpula_eddyImpl.setStd_CPC(kumpula_eddy.getStd_CPC());
        kumpula_eddyImpl.setStd_CPC_EMEP(kumpula_eddy.getStd_CPC_EMEP());
        kumpula_eddyImpl.setAv_CPC(kumpula_eddy.getAv_CPC());
        kumpula_eddyImpl.setAv_CPC_EMEP(kumpula_eddy.getAv_CPC_EMEP());
        kumpula_eddyImpl.setCPC_lag(kumpula_eddy.getCPC_lag());
        kumpula_eddyImpl.setCPC_lag_EMEP(kumpula_eddy.getCPC_lag_EMEP());
        kumpula_eddyImpl.setF_N2O(kumpula_eddy.getF_N2O());
        kumpula_eddyImpl.setF_N2O_EMEP(kumpula_eddy.getF_N2O_EMEP());
        kumpula_eddyImpl.setQc_F_N2O(kumpula_eddy.getQc_F_N2O());
        kumpula_eddyImpl.setQc_F_N2O_EMEP(kumpula_eddy.getQc_F_N2O_EMEP());
        kumpula_eddyImpl.setStd_N2O(kumpula_eddy.getStd_N2O());
        kumpula_eddyImpl.setStd_N2O_EMEP(kumpula_eddy.getStd_N2O_EMEP());
        kumpula_eddyImpl.setAv_N2O(kumpula_eddy.getAv_N2O());
        kumpula_eddyImpl.setAv_N2O_EMEP(kumpula_eddy.getAv_N2O_EMEP());
        kumpula_eddyImpl.setN2O_lag(kumpula_eddy.getN2O_lag());
        kumpula_eddyImpl.setN2O_lag_EMEP(kumpula_eddy.getN2O_lag_EMEP());

        return kumpula_eddyImpl;
    }

    /**
     * Returns the kumpula_eddy with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the kumpula_eddy
     * @return the kumpula_eddy
     * @throws fi.csc.smear.db.NoSuchKumpula_eddyException if a kumpula_eddy with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Kumpula_eddy findByPrimaryKey(Serializable primaryKey)
        throws NoSuchKumpula_eddyException, SystemException {
        Kumpula_eddy kumpula_eddy = fetchByPrimaryKey(primaryKey);

        if (kumpula_eddy == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchKumpula_eddyException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return kumpula_eddy;
    }

    /**
     * Returns the kumpula_eddy with the primary key or throws a {@link fi.csc.smear.db.NoSuchKumpula_eddyException} if it could not be found.
     *
     * @param samptime the primary key of the kumpula_eddy
     * @return the kumpula_eddy
     * @throws fi.csc.smear.db.NoSuchKumpula_eddyException if a kumpula_eddy with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Kumpula_eddy findByPrimaryKey(java.util.Date samptime)
        throws NoSuchKumpula_eddyException, SystemException {
        return findByPrimaryKey((Serializable) samptime);
    }

    /**
     * Returns the kumpula_eddy with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the kumpula_eddy
     * @return the kumpula_eddy, or <code>null</code> if a kumpula_eddy with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Kumpula_eddy fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Kumpula_eddy kumpula_eddy = (Kumpula_eddy) EntityCacheUtil.getResult(Kumpula_eddyModelImpl.ENTITY_CACHE_ENABLED,
                Kumpula_eddyImpl.class, primaryKey);

        if (kumpula_eddy == _nullKumpula_eddy) {
            return null;
        }

        if (kumpula_eddy == null) {
            Session session = null;

            try {
                session = openSession();

                kumpula_eddy = (Kumpula_eddy) session.get(Kumpula_eddyImpl.class,
                        primaryKey);

                if (kumpula_eddy != null) {
                    cacheResult(kumpula_eddy);
                } else {
                    EntityCacheUtil.putResult(Kumpula_eddyModelImpl.ENTITY_CACHE_ENABLED,
                        Kumpula_eddyImpl.class, primaryKey, _nullKumpula_eddy);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(Kumpula_eddyModelImpl.ENTITY_CACHE_ENABLED,
                    Kumpula_eddyImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return kumpula_eddy;
    }

    /**
     * Returns the kumpula_eddy with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param samptime the primary key of the kumpula_eddy
     * @return the kumpula_eddy, or <code>null</code> if a kumpula_eddy with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Kumpula_eddy fetchByPrimaryKey(java.util.Date samptime)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) samptime);
    }

    /**
     * Returns all the kumpula_eddies.
     *
     * @return the kumpula_eddies
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Kumpula_eddy> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the kumpula_eddies.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.Kumpula_eddyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of kumpula_eddies
     * @param end the upper bound of the range of kumpula_eddies (not inclusive)
     * @return the range of kumpula_eddies
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Kumpula_eddy> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the kumpula_eddies.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.Kumpula_eddyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of kumpula_eddies
     * @param end the upper bound of the range of kumpula_eddies (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of kumpula_eddies
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Kumpula_eddy> findAll(int start, int end,
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

        List<Kumpula_eddy> list = (List<Kumpula_eddy>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_KUMPULA_EDDY);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_KUMPULA_EDDY;

                if (pagination) {
                    sql = sql.concat(Kumpula_eddyModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Kumpula_eddy>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Kumpula_eddy>(list);
                } else {
                    list = (List<Kumpula_eddy>) QueryUtil.list(q, getDialect(),
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
     * Removes all the kumpula_eddies from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Kumpula_eddy kumpula_eddy : findAll()) {
            remove(kumpula_eddy);
        }
    }

    /**
     * Returns the number of kumpula_eddies.
     *
     * @return the number of kumpula_eddies
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

                Query q = session.createQuery(_SQL_COUNT_KUMPULA_EDDY);

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
     * Initializes the kumpula_eddy persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.fi.csc.smear.db.model.Kumpula_eddy")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Kumpula_eddy>> listenersList = new ArrayList<ModelListener<Kumpula_eddy>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Kumpula_eddy>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(Kumpula_eddyImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
