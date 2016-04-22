package fi.csc.smear.db.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import fi.csc.smear.db.model.Varriometa;

/**
 * The persistence interface for the varriometa service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author pj
 * @see VarriometaPersistenceImpl
 * @see VarriometaUtil
 * @generated
 */
public interface VarriometaPersistence extends BasePersistence<Varriometa> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link VarriometaUtil} to access the varriometa persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the varriometa in the entity cache if it is enabled.
    *
    * @param varriometa the varriometa
    */
    public void cacheResult(fi.csc.smear.db.model.Varriometa varriometa);

    /**
    * Caches the varriometas in the entity cache if it is enabled.
    *
    * @param varriometas the varriometas
    */
    public void cacheResult(
        java.util.List<fi.csc.smear.db.model.Varriometa> varriometas);

    /**
    * Creates a new varriometa with the primary key. Does not add the varriometa to the database.
    *
    * @param SAMPTIME the primary key for the new varriometa
    * @return the new varriometa
    */
    public fi.csc.smear.db.model.Varriometa create(java.util.Date SAMPTIME);

    /**
    * Removes the varriometa with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param SAMPTIME the primary key of the varriometa
    * @return the varriometa that was removed
    * @throws fi.csc.smear.db.NoSuchVarriometaException if a varriometa with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.smear.db.model.Varriometa remove(java.util.Date SAMPTIME)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.smear.db.NoSuchVarriometaException;

    public fi.csc.smear.db.model.Varriometa updateImpl(
        fi.csc.smear.db.model.Varriometa varriometa)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the varriometa with the primary key or throws a {@link fi.csc.smear.db.NoSuchVarriometaException} if it could not be found.
    *
    * @param SAMPTIME the primary key of the varriometa
    * @return the varriometa
    * @throws fi.csc.smear.db.NoSuchVarriometaException if a varriometa with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.smear.db.model.Varriometa findByPrimaryKey(
        java.util.Date SAMPTIME)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.smear.db.NoSuchVarriometaException;

    /**
    * Returns the varriometa with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param SAMPTIME the primary key of the varriometa
    * @return the varriometa, or <code>null</code> if a varriometa with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.smear.db.model.Varriometa fetchByPrimaryKey(
        java.util.Date SAMPTIME)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the varriometas.
    *
    * @return the varriometas
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.smear.db.model.Varriometa> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<fi.csc.smear.db.model.Varriometa> findAll(int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<fi.csc.smear.db.model.Varriometa> findAll(int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the varriometas from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of varriometas.
    *
    * @return the number of varriometas
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
