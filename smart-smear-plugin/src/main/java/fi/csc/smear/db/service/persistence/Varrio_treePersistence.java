package fi.csc.smear.db.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import fi.csc.smear.db.model.Varrio_tree;

/**
 * The persistence interface for the varrio_tree service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author pj
 * @see Varrio_treePersistenceImpl
 * @see Varrio_treeUtil
 * @generated
 */
public interface Varrio_treePersistence extends BasePersistence<Varrio_tree> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link Varrio_treeUtil} to access the varrio_tree persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the varrio_tree in the entity cache if it is enabled.
    *
    * @param varrio_tree the varrio_tree
    */
    public void cacheResult(fi.csc.smear.db.model.Varrio_tree varrio_tree);

    /**
    * Caches the varrio_trees in the entity cache if it is enabled.
    *
    * @param varrio_trees the varrio_trees
    */
    public void cacheResult(
        java.util.List<fi.csc.smear.db.model.Varrio_tree> varrio_trees);

    /**
    * Creates a new varrio_tree with the primary key. Does not add the varrio_tree to the database.
    *
    * @param SAMPTIME the primary key for the new varrio_tree
    * @return the new varrio_tree
    */
    public fi.csc.smear.db.model.Varrio_tree create(java.util.Date SAMPTIME);

    /**
    * Removes the varrio_tree with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param SAMPTIME the primary key of the varrio_tree
    * @return the varrio_tree that was removed
    * @throws fi.csc.smear.db.NoSuchVarrio_treeException if a varrio_tree with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.smear.db.model.Varrio_tree remove(java.util.Date SAMPTIME)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.smear.db.NoSuchVarrio_treeException;

    public fi.csc.smear.db.model.Varrio_tree updateImpl(
        fi.csc.smear.db.model.Varrio_tree varrio_tree)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the varrio_tree with the primary key or throws a {@link fi.csc.smear.db.NoSuchVarrio_treeException} if it could not be found.
    *
    * @param SAMPTIME the primary key of the varrio_tree
    * @return the varrio_tree
    * @throws fi.csc.smear.db.NoSuchVarrio_treeException if a varrio_tree with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.smear.db.model.Varrio_tree findByPrimaryKey(
        java.util.Date SAMPTIME)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.smear.db.NoSuchVarrio_treeException;

    /**
    * Returns the varrio_tree with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param SAMPTIME the primary key of the varrio_tree
    * @return the varrio_tree, or <code>null</code> if a varrio_tree with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.smear.db.model.Varrio_tree fetchByPrimaryKey(
        java.util.Date SAMPTIME)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the varrio_trees.
    *
    * @return the varrio_trees
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.smear.db.model.Varrio_tree> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the varrio_trees.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.Varrio_treeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of varrio_trees
    * @param end the upper bound of the range of varrio_trees (not inclusive)
    * @return the range of varrio_trees
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.smear.db.model.Varrio_tree> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the varrio_trees.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.Varrio_treeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of varrio_trees
    * @param end the upper bound of the range of varrio_trees (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of varrio_trees
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.smear.db.model.Varrio_tree> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the varrio_trees from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of varrio_trees.
    *
    * @return the number of varrio_trees
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
