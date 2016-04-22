package fi.csc.smear.db.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import fi.csc.smear.db.model.Vareddy;

/**
 * The persistence interface for the vareddy service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author pj
 * @see VareddyPersistenceImpl
 * @see VareddyUtil
 * @generated
 */
public interface VareddyPersistence extends BasePersistence<Vareddy> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link VareddyUtil} to access the vareddy persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the vareddy in the entity cache if it is enabled.
    *
    * @param vareddy the vareddy
    */
    public void cacheResult(fi.csc.smear.db.model.Vareddy vareddy);

    /**
    * Caches the vareddies in the entity cache if it is enabled.
    *
    * @param vareddies the vareddies
    */
    public void cacheResult(
        java.util.List<fi.csc.smear.db.model.Vareddy> vareddies);

    /**
    * Creates a new vareddy with the primary key. Does not add the vareddy to the database.
    *
    * @param samptime the primary key for the new vareddy
    * @return the new vareddy
    */
    public fi.csc.smear.db.model.Vareddy create(java.util.Date samptime);

    /**
    * Removes the vareddy with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param samptime the primary key of the vareddy
    * @return the vareddy that was removed
    * @throws fi.csc.smear.db.NoSuchVareddyException if a vareddy with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.smear.db.model.Vareddy remove(java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.smear.db.NoSuchVareddyException;

    public fi.csc.smear.db.model.Vareddy updateImpl(
        fi.csc.smear.db.model.Vareddy vareddy)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the vareddy with the primary key or throws a {@link fi.csc.smear.db.NoSuchVareddyException} if it could not be found.
    *
    * @param samptime the primary key of the vareddy
    * @return the vareddy
    * @throws fi.csc.smear.db.NoSuchVareddyException if a vareddy with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.smear.db.model.Vareddy findByPrimaryKey(
        java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.smear.db.NoSuchVareddyException;

    /**
    * Returns the vareddy with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param samptime the primary key of the vareddy
    * @return the vareddy, or <code>null</code> if a vareddy with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.smear.db.model.Vareddy fetchByPrimaryKey(
        java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the vareddies.
    *
    * @return the vareddies
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.smear.db.model.Vareddy> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the vareddies.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.VareddyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of vareddies
    * @param end the upper bound of the range of vareddies (not inclusive)
    * @return the range of vareddies
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.smear.db.model.Vareddy> findAll(int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the vareddies.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.VareddyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of vareddies
    * @param end the upper bound of the range of vareddies (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of vareddies
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.smear.db.model.Vareddy> findAll(int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the vareddies from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of vareddies.
    *
    * @return the number of vareddies
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
