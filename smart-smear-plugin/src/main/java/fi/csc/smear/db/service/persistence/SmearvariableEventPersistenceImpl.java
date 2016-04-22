package fi.csc.smear.db.service.persistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
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
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import fi.csc.smear.db.NoSuchvariableEventException;
import fi.csc.smear.db.model.SmearvariableEvent;
import fi.csc.smear.db.model.impl.SmearvariableEventImpl;
import fi.csc.smear.db.model.impl.SmearvariableEventModelImpl;
import fi.csc.smear.db.service.persistence.SmearvariableEventPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the smearvariable event service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author pj
 * @see SmearvariableEventPersistence
 * @see SmearvariableEventUtil
 * @generated
 */
public class SmearvariableEventPersistenceImpl extends BasePersistenceImpl<SmearvariableEvent>
    implements SmearvariableEventPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link SmearvariableEventUtil} to access the smearvariable event persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = SmearvariableEventImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(SmearvariableEventModelImpl.ENTITY_CACHE_ENABLED,
            SmearvariableEventModelImpl.FINDER_CACHE_ENABLED,
            SmearvariableEventImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(SmearvariableEventModelImpl.ENTITY_CACHE_ENABLED,
            SmearvariableEventModelImpl.FINDER_CACHE_ENABLED,
            SmearvariableEventImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(SmearvariableEventModelImpl.ENTITY_CACHE_ENABLED,
            SmearvariableEventModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_VARIABLE = new FinderPath(SmearvariableEventModelImpl.ENTITY_CACHE_ENABLED,
            SmearvariableEventModelImpl.FINDER_CACHE_ENABLED,
            SmearvariableEventImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByVariable",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VARIABLE =
        new FinderPath(SmearvariableEventModelImpl.ENTITY_CACHE_ENABLED,
            SmearvariableEventModelImpl.FINDER_CACHE_ENABLED,
            SmearvariableEventImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByVariable",
            new String[] { Long.class.getName() },
            SmearvariableEventModelImpl.VARIABLEID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_VARIABLE = new FinderPath(SmearvariableEventModelImpl.ENTITY_CACHE_ENABLED,
            SmearvariableEventModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByVariable",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_VARIABLE_VARIABLEID_2 = "smearvariableEvent.id.variableID = ?";
    private static final String _SQL_SELECT_SMEARVARIABLEEVENT = "SELECT smearvariableEvent FROM SmearvariableEvent smearvariableEvent";
    private static final String _SQL_SELECT_SMEARVARIABLEEVENT_WHERE = "SELECT smearvariableEvent FROM SmearvariableEvent smearvariableEvent WHERE ";
    private static final String _SQL_COUNT_SMEARVARIABLEEVENT = "SELECT COUNT(smearvariableEvent) FROM SmearvariableEvent smearvariableEvent";
    private static final String _SQL_COUNT_SMEARVARIABLEEVENT_WHERE = "SELECT COUNT(smearvariableEvent) FROM SmearvariableEvent smearvariableEvent WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "smearvariableEvent.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No SmearvariableEvent exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No SmearvariableEvent exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(SmearvariableEventPersistenceImpl.class);
    private static SmearvariableEvent _nullSmearvariableEvent = new SmearvariableEventImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<SmearvariableEvent> toCacheModel() {
                return _nullSmearvariableEventCacheModel;
            }
        };

    private static CacheModel<SmearvariableEvent> _nullSmearvariableEventCacheModel =
        new CacheModel<SmearvariableEvent>() {
            @Override
            public SmearvariableEvent toEntityModel() {
                return _nullSmearvariableEvent;
            }
        };

    public SmearvariableEventPersistenceImpl() {
        setModelClass(SmearvariableEvent.class);
    }

    /**
     * Returns all the smearvariable events where variableID = &#63;.
     *
     * @param variableID the variable i d
     * @return the matching smearvariable events
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<SmearvariableEvent> findByVariable(long variableID)
        throws SystemException {
        return findByVariable(variableID, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
            null);
    }

    /**
     * Returns a range of all the smearvariable events where variableID = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.SmearvariableEventModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param variableID the variable i d
     * @param start the lower bound of the range of smearvariable events
     * @param end the upper bound of the range of smearvariable events (not inclusive)
     * @return the range of matching smearvariable events
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<SmearvariableEvent> findByVariable(long variableID, int start,
        int end) throws SystemException {
        return findByVariable(variableID, start, end, null);
    }

    /**
     * Returns an ordered range of all the smearvariable events where variableID = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.SmearvariableEventModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param variableID the variable i d
     * @param start the lower bound of the range of smearvariable events
     * @param end the upper bound of the range of smearvariable events (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching smearvariable events
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<SmearvariableEvent> findByVariable(long variableID, int start,
        int end, OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VARIABLE;
            finderArgs = new Object[] { variableID };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_VARIABLE;
            finderArgs = new Object[] { variableID, start, end, orderByComparator };
        }

        List<SmearvariableEvent> list = (List<SmearvariableEvent>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (SmearvariableEvent smearvariableEvent : list) {
                if ((variableID != smearvariableEvent.getVariableID())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_SMEARVARIABLEEVENT_WHERE);

            query.append(_FINDER_COLUMN_VARIABLE_VARIABLEID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(SmearvariableEventModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(variableID);

                if (!pagination) {
                    list = (List<SmearvariableEvent>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<SmearvariableEvent>(list);
                } else {
                    list = (List<SmearvariableEvent>) QueryUtil.list(q,
                            getDialect(), start, end);
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
     * Returns the first smearvariable event in the ordered set where variableID = &#63;.
     *
     * @param variableID the variable i d
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching smearvariable event
     * @throws fi.csc.smear.db.NoSuchvariableEventException if a matching smearvariable event could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SmearvariableEvent findByVariable_First(long variableID,
        OrderByComparator orderByComparator)
        throws NoSuchvariableEventException, SystemException {
        SmearvariableEvent smearvariableEvent = fetchByVariable_First(variableID,
                orderByComparator);

        if (smearvariableEvent != null) {
            return smearvariableEvent;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("variableID=");
        msg.append(variableID);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchvariableEventException(msg.toString());
    }

    /**
     * Returns the first smearvariable event in the ordered set where variableID = &#63;.
     *
     * @param variableID the variable i d
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching smearvariable event, or <code>null</code> if a matching smearvariable event could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SmearvariableEvent fetchByVariable_First(long variableID,
        OrderByComparator orderByComparator) throws SystemException {
        List<SmearvariableEvent> list = findByVariable(variableID, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last smearvariable event in the ordered set where variableID = &#63;.
     *
     * @param variableID the variable i d
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching smearvariable event
     * @throws fi.csc.smear.db.NoSuchvariableEventException if a matching smearvariable event could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SmearvariableEvent findByVariable_Last(long variableID,
        OrderByComparator orderByComparator)
        throws NoSuchvariableEventException, SystemException {
        SmearvariableEvent smearvariableEvent = fetchByVariable_Last(variableID,
                orderByComparator);

        if (smearvariableEvent != null) {
            return smearvariableEvent;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("variableID=");
        msg.append(variableID);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchvariableEventException(msg.toString());
    }

    /**
     * Returns the last smearvariable event in the ordered set where variableID = &#63;.
     *
     * @param variableID the variable i d
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching smearvariable event, or <code>null</code> if a matching smearvariable event could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SmearvariableEvent fetchByVariable_Last(long variableID,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByVariable(variableID);

        if (count == 0) {
            return null;
        }

        List<SmearvariableEvent> list = findByVariable(variableID, count - 1,
                count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the smearvariable events before and after the current smearvariable event in the ordered set where variableID = &#63;.
     *
     * @param smearvariableEventPK the primary key of the current smearvariable event
     * @param variableID the variable i d
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next smearvariable event
     * @throws fi.csc.smear.db.NoSuchvariableEventException if a smearvariable event with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SmearvariableEvent[] findByVariable_PrevAndNext(
        SmearvariableEventPK smearvariableEventPK, long variableID,
        OrderByComparator orderByComparator)
        throws NoSuchvariableEventException, SystemException {
        SmearvariableEvent smearvariableEvent = findByPrimaryKey(smearvariableEventPK);

        Session session = null;

        try {
            session = openSession();

            SmearvariableEvent[] array = new SmearvariableEventImpl[3];

            array[0] = getByVariable_PrevAndNext(session, smearvariableEvent,
                    variableID, orderByComparator, true);

            array[1] = smearvariableEvent;

            array[2] = getByVariable_PrevAndNext(session, smearvariableEvent,
                    variableID, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected SmearvariableEvent getByVariable_PrevAndNext(Session session,
        SmearvariableEvent smearvariableEvent, long variableID,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_SMEARVARIABLEEVENT_WHERE);

        query.append(_FINDER_COLUMN_VARIABLE_VARIABLEID_2);

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(SmearvariableEventModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(variableID);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(smearvariableEvent);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<SmearvariableEvent> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the smearvariable events where variableID = &#63; from the database.
     *
     * @param variableID the variable i d
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByVariable(long variableID) throws SystemException {
        for (SmearvariableEvent smearvariableEvent : findByVariable(
                variableID, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(smearvariableEvent);
        }
    }

    /**
     * Returns the number of smearvariable events where variableID = &#63;.
     *
     * @param variableID the variable i d
     * @return the number of matching smearvariable events
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByVariable(long variableID) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_VARIABLE;

        Object[] finderArgs = new Object[] { variableID };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_SMEARVARIABLEEVENT_WHERE);

            query.append(_FINDER_COLUMN_VARIABLE_VARIABLEID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(variableID);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Caches the smearvariable event in the entity cache if it is enabled.
     *
     * @param smearvariableEvent the smearvariable event
     */
    @Override
    public void cacheResult(SmearvariableEvent smearvariableEvent) {
        EntityCacheUtil.putResult(SmearvariableEventModelImpl.ENTITY_CACHE_ENABLED,
            SmearvariableEventImpl.class, smearvariableEvent.getPrimaryKey(),
            smearvariableEvent);

        smearvariableEvent.resetOriginalValues();
    }

    /**
     * Caches the smearvariable events in the entity cache if it is enabled.
     *
     * @param smearvariableEvents the smearvariable events
     */
    @Override
    public void cacheResult(List<SmearvariableEvent> smearvariableEvents) {
        for (SmearvariableEvent smearvariableEvent : smearvariableEvents) {
            if (EntityCacheUtil.getResult(
                        SmearvariableEventModelImpl.ENTITY_CACHE_ENABLED,
                        SmearvariableEventImpl.class,
                        smearvariableEvent.getPrimaryKey()) == null) {
                cacheResult(smearvariableEvent);
            } else {
                smearvariableEvent.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all smearvariable events.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(SmearvariableEventImpl.class.getName());
        }

        EntityCacheUtil.clearCache(SmearvariableEventImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the smearvariable event.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(SmearvariableEvent smearvariableEvent) {
        EntityCacheUtil.removeResult(SmearvariableEventModelImpl.ENTITY_CACHE_ENABLED,
            SmearvariableEventImpl.class, smearvariableEvent.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<SmearvariableEvent> smearvariableEvents) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (SmearvariableEvent smearvariableEvent : smearvariableEvents) {
            EntityCacheUtil.removeResult(SmearvariableEventModelImpl.ENTITY_CACHE_ENABLED,
                SmearvariableEventImpl.class, smearvariableEvent.getPrimaryKey());
        }
    }

    /**
     * Creates a new smearvariable event with the primary key. Does not add the smearvariable event to the database.
     *
     * @param smearvariableEventPK the primary key for the new smearvariable event
     * @return the new smearvariable event
     */
    @Override
    public SmearvariableEvent create(SmearvariableEventPK smearvariableEventPK) {
        SmearvariableEvent smearvariableEvent = new SmearvariableEventImpl();

        smearvariableEvent.setNew(true);
        smearvariableEvent.setPrimaryKey(smearvariableEventPK);

        return smearvariableEvent;
    }

    /**
     * Removes the smearvariable event with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param smearvariableEventPK the primary key of the smearvariable event
     * @return the smearvariable event that was removed
     * @throws fi.csc.smear.db.NoSuchvariableEventException if a smearvariable event with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SmearvariableEvent remove(SmearvariableEventPK smearvariableEventPK)
        throws NoSuchvariableEventException, SystemException {
        return remove((Serializable) smearvariableEventPK);
    }

    /**
     * Removes the smearvariable event with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the smearvariable event
     * @return the smearvariable event that was removed
     * @throws fi.csc.smear.db.NoSuchvariableEventException if a smearvariable event with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SmearvariableEvent remove(Serializable primaryKey)
        throws NoSuchvariableEventException, SystemException {
        Session session = null;

        try {
            session = openSession();

            SmearvariableEvent smearvariableEvent = (SmearvariableEvent) session.get(SmearvariableEventImpl.class,
                    primaryKey);

            if (smearvariableEvent == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchvariableEventException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(smearvariableEvent);
        } catch (NoSuchvariableEventException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected SmearvariableEvent removeImpl(
        SmearvariableEvent smearvariableEvent) throws SystemException {
        smearvariableEvent = toUnwrappedModel(smearvariableEvent);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(smearvariableEvent)) {
                smearvariableEvent = (SmearvariableEvent) session.get(SmearvariableEventImpl.class,
                        smearvariableEvent.getPrimaryKeyObj());
            }

            if (smearvariableEvent != null) {
                session.delete(smearvariableEvent);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (smearvariableEvent != null) {
            clearCache(smearvariableEvent);
        }

        return smearvariableEvent;
    }

    @Override
    public SmearvariableEvent updateImpl(
        fi.csc.smear.db.model.SmearvariableEvent smearvariableEvent)
        throws SystemException {
        smearvariableEvent = toUnwrappedModel(smearvariableEvent);

        boolean isNew = smearvariableEvent.isNew();

        SmearvariableEventModelImpl smearvariableEventModelImpl = (SmearvariableEventModelImpl) smearvariableEvent;

        Session session = null;

        try {
            session = openSession();

            if (smearvariableEvent.isNew()) {
                session.save(smearvariableEvent);

                smearvariableEvent.setNew(false);
            } else {
                session.merge(smearvariableEvent);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !SmearvariableEventModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((smearvariableEventModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VARIABLE.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        smearvariableEventModelImpl.getOriginalVariableID()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_VARIABLE, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VARIABLE,
                    args);

                args = new Object[] { smearvariableEventModelImpl.getVariableID() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_VARIABLE, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VARIABLE,
                    args);
            }
        }

        EntityCacheUtil.putResult(SmearvariableEventModelImpl.ENTITY_CACHE_ENABLED,
            SmearvariableEventImpl.class, smearvariableEvent.getPrimaryKey(),
            smearvariableEvent);

        return smearvariableEvent;
    }

    protected SmearvariableEvent toUnwrappedModel(
        SmearvariableEvent smearvariableEvent) {
        if (smearvariableEvent instanceof SmearvariableEventImpl) {
            return smearvariableEvent;
        }

        SmearvariableEventImpl smearvariableEventImpl = new SmearvariableEventImpl();

        smearvariableEventImpl.setNew(smearvariableEvent.isNew());
        smearvariableEventImpl.setPrimaryKey(smearvariableEvent.getPrimaryKey());

        smearvariableEventImpl.setEventID(smearvariableEvent.getEventID());
        smearvariableEventImpl.setVariableID(smearvariableEvent.getVariableID());

        return smearvariableEventImpl;
    }

    /**
     * Returns the smearvariable event with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the smearvariable event
     * @return the smearvariable event
     * @throws fi.csc.smear.db.NoSuchvariableEventException if a smearvariable event with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SmearvariableEvent findByPrimaryKey(Serializable primaryKey)
        throws NoSuchvariableEventException, SystemException {
        SmearvariableEvent smearvariableEvent = fetchByPrimaryKey(primaryKey);

        if (smearvariableEvent == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchvariableEventException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return smearvariableEvent;
    }

    /**
     * Returns the smearvariable event with the primary key or throws a {@link fi.csc.smear.db.NoSuchvariableEventException} if it could not be found.
     *
     * @param smearvariableEventPK the primary key of the smearvariable event
     * @return the smearvariable event
     * @throws fi.csc.smear.db.NoSuchvariableEventException if a smearvariable event with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SmearvariableEvent findByPrimaryKey(
        SmearvariableEventPK smearvariableEventPK)
        throws NoSuchvariableEventException, SystemException {
        return findByPrimaryKey((Serializable) smearvariableEventPK);
    }

    /**
     * Returns the smearvariable event with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the smearvariable event
     * @return the smearvariable event, or <code>null</code> if a smearvariable event with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SmearvariableEvent fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        SmearvariableEvent smearvariableEvent = (SmearvariableEvent) EntityCacheUtil.getResult(SmearvariableEventModelImpl.ENTITY_CACHE_ENABLED,
                SmearvariableEventImpl.class, primaryKey);

        if (smearvariableEvent == _nullSmearvariableEvent) {
            return null;
        }

        if (smearvariableEvent == null) {
            Session session = null;

            try {
                session = openSession();

                smearvariableEvent = (SmearvariableEvent) session.get(SmearvariableEventImpl.class,
                        primaryKey);

                if (smearvariableEvent != null) {
                    cacheResult(smearvariableEvent);
                } else {
                    EntityCacheUtil.putResult(SmearvariableEventModelImpl.ENTITY_CACHE_ENABLED,
                        SmearvariableEventImpl.class, primaryKey,
                        _nullSmearvariableEvent);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(SmearvariableEventModelImpl.ENTITY_CACHE_ENABLED,
                    SmearvariableEventImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return smearvariableEvent;
    }

    /**
     * Returns the smearvariable event with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param smearvariableEventPK the primary key of the smearvariable event
     * @return the smearvariable event, or <code>null</code> if a smearvariable event with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SmearvariableEvent fetchByPrimaryKey(
        SmearvariableEventPK smearvariableEventPK) throws SystemException {
        return fetchByPrimaryKey((Serializable) smearvariableEventPK);
    }

    /**
     * Returns all the smearvariable events.
     *
     * @return the smearvariable events
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<SmearvariableEvent> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the smearvariable events.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.SmearvariableEventModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of smearvariable events
     * @param end the upper bound of the range of smearvariable events (not inclusive)
     * @return the range of smearvariable events
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<SmearvariableEvent> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the smearvariable events.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.SmearvariableEventModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of smearvariable events
     * @param end the upper bound of the range of smearvariable events (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of smearvariable events
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<SmearvariableEvent> findAll(int start, int end,
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

        List<SmearvariableEvent> list = (List<SmearvariableEvent>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_SMEARVARIABLEEVENT);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_SMEARVARIABLEEVENT;

                if (pagination) {
                    sql = sql.concat(SmearvariableEventModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<SmearvariableEvent>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<SmearvariableEvent>(list);
                } else {
                    list = (List<SmearvariableEvent>) QueryUtil.list(q,
                            getDialect(), start, end);
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
     * Removes all the smearvariable events from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (SmearvariableEvent smearvariableEvent : findAll()) {
            remove(smearvariableEvent);
        }
    }

    /**
     * Returns the number of smearvariable events.
     *
     * @return the number of smearvariable events
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

                Query q = session.createQuery(_SQL_COUNT_SMEARVARIABLEEVENT);

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
     * Initializes the smearvariable event persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.fi.csc.smear.db.model.SmearvariableEvent")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<SmearvariableEvent>> listenersList = new ArrayList<ModelListener<SmearvariableEvent>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<SmearvariableEvent>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(SmearvariableEventImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
