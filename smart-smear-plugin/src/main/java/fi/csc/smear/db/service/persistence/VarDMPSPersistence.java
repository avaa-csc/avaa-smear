package fi.csc.smear.db.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import fi.csc.smear.db.model.VarDMPS;

/**
 * The persistence interface for the var d m p s service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author pj
 * @see VarDMPSPersistenceImpl
 * @see VarDMPSUtil
 * @generated
 */
public interface VarDMPSPersistence extends BasePersistence<VarDMPS> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link VarDMPSUtil} to access the var d m p s persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the var d m p s in the entity cache if it is enabled.
    *
    * @param varDMPS the var d m p s
    */
    public void cacheResult(fi.csc.smear.db.model.VarDMPS varDMPS);

    /**
    * Caches the var d m p ses in the entity cache if it is enabled.
    *
    * @param varDMPSs the var d m p ses
    */
    public void cacheResult(
        java.util.List<fi.csc.smear.db.model.VarDMPS> varDMPSs);

    /**
    * Creates a new var d m p s with the primary key. Does not add the var d m p s to the database.
    *
    * @param samptime the primary key for the new var d m p s
    * @return the new var d m p s
    */
    public fi.csc.smear.db.model.VarDMPS create(java.util.Date samptime);

    /**
    * Removes the var d m p s with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param samptime the primary key of the var d m p s
    * @return the var d m p s that was removed
    * @throws fi.csc.smear.db.NoSuchVarDMPSException if a var d m p s with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.smear.db.model.VarDMPS remove(java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.smear.db.NoSuchVarDMPSException;

    public fi.csc.smear.db.model.VarDMPS updateImpl(
        fi.csc.smear.db.model.VarDMPS varDMPS)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the var d m p s with the primary key or throws a {@link fi.csc.smear.db.NoSuchVarDMPSException} if it could not be found.
    *
    * @param samptime the primary key of the var d m p s
    * @return the var d m p s
    * @throws fi.csc.smear.db.NoSuchVarDMPSException if a var d m p s with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.smear.db.model.VarDMPS findByPrimaryKey(
        java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.smear.db.NoSuchVarDMPSException;

    /**
    * Returns the var d m p s with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param samptime the primary key of the var d m p s
    * @return the var d m p s, or <code>null</code> if a var d m p s with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.smear.db.model.VarDMPS fetchByPrimaryKey(
        java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the var d m p ses.
    *
    * @return the var d m p ses
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.smear.db.model.VarDMPS> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the var d m p ses.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.VarDMPSModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of var d m p ses
    * @param end the upper bound of the range of var d m p ses (not inclusive)
    * @return the range of var d m p ses
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.smear.db.model.VarDMPS> findAll(int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the var d m p ses.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.VarDMPSModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of var d m p ses
    * @param end the upper bound of the range of var d m p ses (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of var d m p ses
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.smear.db.model.VarDMPS> findAll(int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the var d m p ses from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of var d m p ses.
    *
    * @return the number of var d m p ses
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
