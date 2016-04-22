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

import fi.csc.smear.db.NoSuchSii1eddyException;
import fi.csc.smear.db.model.Sii1eddy;
import fi.csc.smear.db.model.impl.Sii1eddyImpl;
import fi.csc.smear.db.model.impl.Sii1eddyModelImpl;
import fi.csc.smear.db.service.persistence.Sii1eddyPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the sii1eddy service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author pj
 * @see Sii1eddyPersistence
 * @see Sii1eddyUtil
 * @generated
 */
public class Sii1eddyPersistenceImpl extends BasePersistenceImpl<Sii1eddy>
    implements Sii1eddyPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link Sii1eddyUtil} to access the sii1eddy persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = Sii1eddyImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(Sii1eddyModelImpl.ENTITY_CACHE_ENABLED,
            Sii1eddyModelImpl.FINDER_CACHE_ENABLED, Sii1eddyImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(Sii1eddyModelImpl.ENTITY_CACHE_ENABLED,
            Sii1eddyModelImpl.FINDER_CACHE_ENABLED, Sii1eddyImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(Sii1eddyModelImpl.ENTITY_CACHE_ENABLED,
            Sii1eddyModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_SII1EDDY = "SELECT sii1eddy FROM Sii1eddy sii1eddy";
    private static final String _SQL_COUNT_SII1EDDY = "SELECT COUNT(sii1eddy) FROM Sii1eddy sii1eddy";
    private static final String _ORDER_BY_ENTITY_ALIAS = "sii1eddy.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Sii1eddy exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(Sii1eddyPersistenceImpl.class);
    private static Sii1eddy _nullSii1eddy = new Sii1eddyImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Sii1eddy> toCacheModel() {
                return _nullSii1eddyCacheModel;
            }
        };

    private static CacheModel<Sii1eddy> _nullSii1eddyCacheModel = new CacheModel<Sii1eddy>() {
            @Override
            public Sii1eddy toEntityModel() {
                return _nullSii1eddy;
            }
        };

    public Sii1eddyPersistenceImpl() {
        setModelClass(Sii1eddy.class);
    }

    /**
     * Caches the sii1eddy in the entity cache if it is enabled.
     *
     * @param sii1eddy the sii1eddy
     */
    @Override
    public void cacheResult(Sii1eddy sii1eddy) {
        EntityCacheUtil.putResult(Sii1eddyModelImpl.ENTITY_CACHE_ENABLED,
            Sii1eddyImpl.class, sii1eddy.getPrimaryKey(), sii1eddy);

        sii1eddy.resetOriginalValues();
    }

    /**
     * Caches the sii1eddies in the entity cache if it is enabled.
     *
     * @param sii1eddies the sii1eddies
     */
    @Override
    public void cacheResult(List<Sii1eddy> sii1eddies) {
        for (Sii1eddy sii1eddy : sii1eddies) {
            if (EntityCacheUtil.getResult(
                        Sii1eddyModelImpl.ENTITY_CACHE_ENABLED,
                        Sii1eddyImpl.class, sii1eddy.getPrimaryKey()) == null) {
                cacheResult(sii1eddy);
            } else {
                sii1eddy.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all sii1eddies.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(Sii1eddyImpl.class.getName());
        }

        EntityCacheUtil.clearCache(Sii1eddyImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the sii1eddy.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Sii1eddy sii1eddy) {
        EntityCacheUtil.removeResult(Sii1eddyModelImpl.ENTITY_CACHE_ENABLED,
            Sii1eddyImpl.class, sii1eddy.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<Sii1eddy> sii1eddies) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Sii1eddy sii1eddy : sii1eddies) {
            EntityCacheUtil.removeResult(Sii1eddyModelImpl.ENTITY_CACHE_ENABLED,
                Sii1eddyImpl.class, sii1eddy.getPrimaryKey());
        }
    }

    /**
     * Creates a new sii1eddy with the primary key. Does not add the sii1eddy to the database.
     *
     * @param samptime the primary key for the new sii1eddy
     * @return the new sii1eddy
     */
    @Override
    public Sii1eddy create(java.util.Date samptime) {
        Sii1eddy sii1eddy = new Sii1eddyImpl();

        sii1eddy.setNew(true);
        sii1eddy.setPrimaryKey(samptime);

        return sii1eddy;
    }

    /**
     * Removes the sii1eddy with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param samptime the primary key of the sii1eddy
     * @return the sii1eddy that was removed
     * @throws fi.csc.smear.db.NoSuchSii1eddyException if a sii1eddy with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Sii1eddy remove(java.util.Date samptime)
        throws NoSuchSii1eddyException, SystemException {
        return remove((Serializable) samptime);
    }

    /**
     * Removes the sii1eddy with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the sii1eddy
     * @return the sii1eddy that was removed
     * @throws fi.csc.smear.db.NoSuchSii1eddyException if a sii1eddy with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Sii1eddy remove(Serializable primaryKey)
        throws NoSuchSii1eddyException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Sii1eddy sii1eddy = (Sii1eddy) session.get(Sii1eddyImpl.class,
                    primaryKey);

            if (sii1eddy == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchSii1eddyException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(sii1eddy);
        } catch (NoSuchSii1eddyException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Sii1eddy removeImpl(Sii1eddy sii1eddy) throws SystemException {
        sii1eddy = toUnwrappedModel(sii1eddy);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(sii1eddy)) {
                sii1eddy = (Sii1eddy) session.get(Sii1eddyImpl.class,
                        sii1eddy.getPrimaryKeyObj());
            }

            if (sii1eddy != null) {
                session.delete(sii1eddy);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (sii1eddy != null) {
            clearCache(sii1eddy);
        }

        return sii1eddy;
    }

    @Override
    public Sii1eddy updateImpl(fi.csc.smear.db.model.Sii1eddy sii1eddy)
        throws SystemException {
        sii1eddy = toUnwrappedModel(sii1eddy);

        boolean isNew = sii1eddy.isNew();

        Session session = null;

        try {
            session = openSession();

            if (sii1eddy.isNew()) {
                session.save(sii1eddy);

                sii1eddy.setNew(false);
            } else {
                session.merge(sii1eddy);
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

        EntityCacheUtil.putResult(Sii1eddyModelImpl.ENTITY_CACHE_ENABLED,
            Sii1eddyImpl.class, sii1eddy.getPrimaryKey(), sii1eddy);

        return sii1eddy;
    }

    protected Sii1eddy toUnwrappedModel(Sii1eddy sii1eddy) {
        if (sii1eddy instanceof Sii1eddyImpl) {
            return sii1eddy;
        }

        Sii1eddyImpl sii1eddyImpl = new Sii1eddyImpl();

        sii1eddyImpl.setNew(sii1eddy.isNew());
        sii1eddyImpl.setPrimaryKey(sii1eddy.getPrimaryKey());

        sii1eddyImpl.setSamptime(sii1eddy.getSamptime());
        sii1eddyImpl.setU(sii1eddy.getU());
        sii1eddyImpl.setU_EMEP(sii1eddy.getU_EMEP());
        sii1eddyImpl.setWind_dir(sii1eddy.getWind_dir());
        sii1eddyImpl.setWind_dir_EMEP(sii1eddy.getWind_dir_EMEP());
        sii1eddyImpl.setEta(sii1eddy.getEta());
        sii1eddyImpl.setEta_EMEP(sii1eddy.getEta_EMEP());
        sii1eddyImpl.setTheta(sii1eddy.getTheta());
        sii1eddyImpl.setTheta_EMEP(sii1eddy.getTheta_EMEP());
        sii1eddyImpl.setBeta(sii1eddy.getBeta());
        sii1eddyImpl.setBeta_EMEP(sii1eddy.getBeta_EMEP());
        sii1eddyImpl.setH(sii1eddy.getH());
        sii1eddyImpl.setH_EMEP(sii1eddy.getH_EMEP());
        sii1eddyImpl.setTau(sii1eddy.getTau());
        sii1eddyImpl.setTau_EMEP(sii1eddy.getTau_EMEP());
        sii1eddyImpl.setU_star(sii1eddy.getU_star());
        sii1eddyImpl.setU_star_EMEP(sii1eddy.getU_star_EMEP());
        sii1eddyImpl.setMO_length(sii1eddy.getMO_length());
        sii1eddyImpl.setMO_length_EMEP(sii1eddy.getMO_length_EMEP());
        sii1eddyImpl.setErr_packet(sii1eddy.getErr_packet());
        sii1eddyImpl.setErr_packet_EMEP(sii1eddy.getErr_packet_EMEP());
        sii1eddyImpl.setF_c_LI70(sii1eddy.getF_c_LI70());
        sii1eddyImpl.setF_c_LI70_EMEP(sii1eddy.getF_c_LI70_EMEP());
        sii1eddyImpl.setF_H2O_LI70(sii1eddy.getF_H2O_LI70());
        sii1eddyImpl.setF_H2O_LI70_EMEP(sii1eddy.getF_H2O_LI70_EMEP());
        sii1eddyImpl.setF_CH4_LGR(sii1eddy.getF_CH4_LGR());
        sii1eddyImpl.setF_CH4_LGR_EMEP(sii1eddy.getF_CH4_LGR_EMEP());
        sii1eddyImpl.setF_CH4_TGA(sii1eddy.getF_CH4_TGA());
        sii1eddyImpl.setF_CH4_TGA_EMEP(sii1eddy.getF_CH4_TGA_EMEP());
        sii1eddyImpl.setF_H2O_PIC(sii1eddy.getF_H2O_PIC());
        sii1eddyImpl.setF_H2O_PIC_EMEP(sii1eddy.getF_H2O_PIC_EMEP());
        sii1eddyImpl.setF_CH4_PIC(sii1eddy.getF_CH4_PIC());
        sii1eddyImpl.setF_CH4_PIC_EMEP(sii1eddy.getF_CH4_PIC_EMEP());
        sii1eddyImpl.setLE_LI70(sii1eddy.getLE_LI70());
        sii1eddyImpl.setLE_LI70_EMEP(sii1eddy.getLE_LI70_EMEP());
        sii1eddyImpl.setLE_PIC(sii1eddy.getLE_PIC());
        sii1eddyImpl.setLE_PIC_EMEP(sii1eddy.getLE_PIC_EMEP());
        sii1eddyImpl.setAv_u(sii1eddy.getAv_u());
        sii1eddyImpl.setAv_u_EMEP(sii1eddy.getAv_u_EMEP());
        sii1eddyImpl.setAv_v(sii1eddy.getAv_v());
        sii1eddyImpl.setAv_v_EMEP(sii1eddy.getAv_v_EMEP());
        sii1eddyImpl.setAv_w(sii1eddy.getAv_w());
        sii1eddyImpl.setAv_w_EMEP(sii1eddy.getAv_w_EMEP());
        sii1eddyImpl.setT_s(sii1eddy.getT_s());
        sii1eddyImpl.setT_s_EMEP(sii1eddy.getT_s_EMEP());
        sii1eddyImpl.setAv_c(sii1eddy.getAv_c());
        sii1eddyImpl.setAv_c_EMEP(sii1eddy.getAv_c_EMEP());
        sii1eddyImpl.setAv_H2O_LI70(sii1eddy.getAv_H2O_LI70());
        sii1eddyImpl.setAv_H2O_LI70_EMEP(sii1eddy.getAv_H2O_LI70_EMEP());
        sii1eddyImpl.setAv_CH4_LGR(sii1eddy.getAv_CH4_LGR());
        sii1eddyImpl.setAv_CH4_LGR_EMEP(sii1eddy.getAv_CH4_LGR_EMEP());
        sii1eddyImpl.setAv_CH4_TGA(sii1eddy.getAv_CH4_TGA());
        sii1eddyImpl.setAv_CH4_TGA_EMEP(sii1eddy.getAv_CH4_TGA_EMEP());
        sii1eddyImpl.setAv_H2O_PIC(sii1eddy.getAv_H2O_PIC());
        sii1eddyImpl.setAv_H2O_PIC_EMEP(sii1eddy.getAv_H2O_PIC_EMEP());
        sii1eddyImpl.setAv_CH4_PIC(sii1eddy.getAv_CH4_PIC());
        sii1eddyImpl.setAv_CH4_PIC_EMEP(sii1eddy.getAv_CH4_PIC_EMEP());
        sii1eddyImpl.setStd_u(sii1eddy.getStd_u());
        sii1eddyImpl.setStd_u_EMEP(sii1eddy.getStd_u_EMEP());
        sii1eddyImpl.setStd_v(sii1eddy.getStd_v());
        sii1eddyImpl.setStd_v_EMEP(sii1eddy.getStd_v_EMEP());
        sii1eddyImpl.setStd_w(sii1eddy.getStd_w());
        sii1eddyImpl.setStd_w_EMEP(sii1eddy.getStd_w_EMEP());
        sii1eddyImpl.setStd_T_s(sii1eddy.getStd_T_s());
        sii1eddyImpl.setStd_T_s_EMEP(sii1eddy.getStd_T_s_EMEP());
        sii1eddyImpl.setStd_c_LI70(sii1eddy.getStd_c_LI70());
        sii1eddyImpl.setStd_c_LI70_EMEP(sii1eddy.getStd_c_LI70_EMEP());
        sii1eddyImpl.setStd_H2O_LI70(sii1eddy.getStd_H2O_LI70());
        sii1eddyImpl.setStd_H2O_LI70_EMEP(sii1eddy.getStd_H2O_LI70_EMEP());
        sii1eddyImpl.setStd_CH4_LGR(sii1eddy.getStd_CH4_LGR());
        sii1eddyImpl.setStd_CH4_LGR_EMEP(sii1eddy.getStd_CH4_LGR_EMEP());
        sii1eddyImpl.setStd_CH4_TGA(sii1eddy.getStd_CH4_TGA());
        sii1eddyImpl.setStd_CH4_TGA_EMEP(sii1eddy.getStd_CH4_TGA_EMEP());
        sii1eddyImpl.setStd_H2O_PIC(sii1eddy.getStd_H2O_PIC());
        sii1eddyImpl.setStd_H2O_PIC_EMEP(sii1eddy.getStd_H2O_PIC_EMEP());
        sii1eddyImpl.setStd_CH4_PIC(sii1eddy.getStd_CH4_PIC());
        sii1eddyImpl.setStd_CH4_PIC_EMEP(sii1eddy.getStd_CH4_PIC_EMEP());
        sii1eddyImpl.setC_lag_LI70(sii1eddy.getC_lag_LI70());
        sii1eddyImpl.setC_lag_LI70_EMEP(sii1eddy.getC_lag_LI70_EMEP());
        sii1eddyImpl.setH2O_lag_LI70(sii1eddy.getH2O_lag_LI70());
        sii1eddyImpl.setH2O_lag_LI70_EMEP(sii1eddy.getH2O_lag_LI70_EMEP());
        sii1eddyImpl.setCH4_lag_LGR(sii1eddy.getCH4_lag_LGR());
        sii1eddyImpl.setCH4_lag_LGR_EMEP(sii1eddy.getCH4_lag_LGR_EMEP());
        sii1eddyImpl.setCH4_lag_TGA(sii1eddy.getCH4_lag_TGA());
        sii1eddyImpl.setCH4_lag_TGA_EMEP(sii1eddy.getCH4_lag_TGA_EMEP());
        sii1eddyImpl.setH2O_lag_PIC(sii1eddy.getH2O_lag_PIC());
        sii1eddyImpl.setH2O_lag_PIC_EMEP(sii1eddy.getH2O_lag_PIC_EMEP());
        sii1eddyImpl.setCH4_lag_PIC(sii1eddy.getCH4_lag_PIC());
        sii1eddyImpl.setCH4_lag_PIC_EMEP(sii1eddy.getCH4_lag_PIC_EMEP());
        sii1eddyImpl.setQc_H(sii1eddy.getQc_H());
        sii1eddyImpl.setQc_H_EMEP(sii1eddy.getQc_H_EMEP());
        sii1eddyImpl.setQc_CO2_LI70(sii1eddy.getQc_CO2_LI70());
        sii1eddyImpl.setQc_CO2_LI70_EMEP(sii1eddy.getQc_CO2_LI70_EMEP());
        sii1eddyImpl.setQc_CH4_LGR(sii1eddy.getQc_CH4_LGR());
        sii1eddyImpl.setQc_CH4_LGR_EMEP(sii1eddy.getQc_CH4_LGR_EMEP());
        sii1eddyImpl.setQc_CH4_TGA(sii1eddy.getQc_CH4_TGA());
        sii1eddyImpl.setQc_CH4_TGA_EMEP(sii1eddy.getQc_CH4_TGA_EMEP());
        sii1eddyImpl.setQc_CH4_PIC(sii1eddy.getQc_CH4_PIC());
        sii1eddyImpl.setQc_CH4_PIC_EMEP(sii1eddy.getQc_CH4_PIC_EMEP());
        sii1eddyImpl.setQc_LE_LI70(sii1eddy.getQc_LE_LI70());
        sii1eddyImpl.setQc_LE_LI70_EMEP(sii1eddy.getQc_LE_LI70_EMEP());
        sii1eddyImpl.setQc_LE_PIC(sii1eddy.getQc_LE_PIC());
        sii1eddyImpl.setQc_LE_PIC_EMEP(sii1eddy.getQc_LE_PIC_EMEP());
        sii1eddyImpl.setQc_tau(sii1eddy.getQc_tau());
        sii1eddyImpl.setQc_tau_EMEP(sii1eddy.getQc_tau_EMEP());

        return sii1eddyImpl;
    }

    /**
     * Returns the sii1eddy with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the sii1eddy
     * @return the sii1eddy
     * @throws fi.csc.smear.db.NoSuchSii1eddyException if a sii1eddy with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Sii1eddy findByPrimaryKey(Serializable primaryKey)
        throws NoSuchSii1eddyException, SystemException {
        Sii1eddy sii1eddy = fetchByPrimaryKey(primaryKey);

        if (sii1eddy == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchSii1eddyException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return sii1eddy;
    }

    /**
     * Returns the sii1eddy with the primary key or throws a {@link fi.csc.smear.db.NoSuchSii1eddyException} if it could not be found.
     *
     * @param samptime the primary key of the sii1eddy
     * @return the sii1eddy
     * @throws fi.csc.smear.db.NoSuchSii1eddyException if a sii1eddy with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Sii1eddy findByPrimaryKey(java.util.Date samptime)
        throws NoSuchSii1eddyException, SystemException {
        return findByPrimaryKey((Serializable) samptime);
    }

    /**
     * Returns the sii1eddy with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the sii1eddy
     * @return the sii1eddy, or <code>null</code> if a sii1eddy with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Sii1eddy fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Sii1eddy sii1eddy = (Sii1eddy) EntityCacheUtil.getResult(Sii1eddyModelImpl.ENTITY_CACHE_ENABLED,
                Sii1eddyImpl.class, primaryKey);

        if (sii1eddy == _nullSii1eddy) {
            return null;
        }

        if (sii1eddy == null) {
            Session session = null;

            try {
                session = openSession();

                sii1eddy = (Sii1eddy) session.get(Sii1eddyImpl.class, primaryKey);

                if (sii1eddy != null) {
                    cacheResult(sii1eddy);
                } else {
                    EntityCacheUtil.putResult(Sii1eddyModelImpl.ENTITY_CACHE_ENABLED,
                        Sii1eddyImpl.class, primaryKey, _nullSii1eddy);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(Sii1eddyModelImpl.ENTITY_CACHE_ENABLED,
                    Sii1eddyImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return sii1eddy;
    }

    /**
     * Returns the sii1eddy with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param samptime the primary key of the sii1eddy
     * @return the sii1eddy, or <code>null</code> if a sii1eddy with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Sii1eddy fetchByPrimaryKey(java.util.Date samptime)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) samptime);
    }

    /**
     * Returns all the sii1eddies.
     *
     * @return the sii1eddies
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Sii1eddy> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the sii1eddies.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.Sii1eddyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of sii1eddies
     * @param end the upper bound of the range of sii1eddies (not inclusive)
     * @return the range of sii1eddies
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Sii1eddy> findAll(int start, int end) throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the sii1eddies.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.Sii1eddyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of sii1eddies
     * @param end the upper bound of the range of sii1eddies (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of sii1eddies
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Sii1eddy> findAll(int start, int end,
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

        List<Sii1eddy> list = (List<Sii1eddy>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_SII1EDDY);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_SII1EDDY;

                if (pagination) {
                    sql = sql.concat(Sii1eddyModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Sii1eddy>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Sii1eddy>(list);
                } else {
                    list = (List<Sii1eddy>) QueryUtil.list(q, getDialect(),
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
     * Removes all the sii1eddies from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Sii1eddy sii1eddy : findAll()) {
            remove(sii1eddy);
        }
    }

    /**
     * Returns the number of sii1eddies.
     *
     * @return the number of sii1eddies
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

                Query q = session.createQuery(_SQL_COUNT_SII1EDDY);

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
     * Initializes the sii1eddy persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.fi.csc.smear.db.model.Sii1eddy")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Sii1eddy>> listenersList = new ArrayList<ModelListener<Sii1eddy>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Sii1eddy>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(Sii1eddyImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
