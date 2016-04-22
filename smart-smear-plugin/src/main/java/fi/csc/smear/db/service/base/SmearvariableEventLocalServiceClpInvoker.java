package fi.csc.smear.db.service.base;

import fi.csc.smear.db.service.SmearvariableEventLocalServiceUtil;

import java.util.Arrays;

/**
 * @author pj
 * @generated
 */
public class SmearvariableEventLocalServiceClpInvoker {
    private String _methodName0;
    private String[] _methodParameterTypes0;
    private String _methodName1;
    private String[] _methodParameterTypes1;
    private String _methodName2;
    private String[] _methodParameterTypes2;
    private String _methodName3;
    private String[] _methodParameterTypes3;
    private String _methodName4;
    private String[] _methodParameterTypes4;
    private String _methodName5;
    private String[] _methodParameterTypes5;
    private String _methodName6;
    private String[] _methodParameterTypes6;
    private String _methodName7;
    private String[] _methodParameterTypes7;
    private String _methodName8;
    private String[] _methodParameterTypes8;
    private String _methodName9;
    private String[] _methodParameterTypes9;
    private String _methodName10;
    private String[] _methodParameterTypes10;
    private String _methodName11;
    private String[] _methodParameterTypes11;
    private String _methodName12;
    private String[] _methodParameterTypes12;
    private String _methodName13;
    private String[] _methodParameterTypes13;
    private String _methodName14;
    private String[] _methodParameterTypes14;
    private String _methodName15;
    private String[] _methodParameterTypes15;
    private String _methodName188;
    private String[] _methodParameterTypes188;
    private String _methodName189;
    private String[] _methodParameterTypes189;
    private String _methodName194;
    private String[] _methodParameterTypes194;

    public SmearvariableEventLocalServiceClpInvoker() {
        _methodName0 = "addSmearvariableEvent";

        _methodParameterTypes0 = new String[] {
                "fi.csc.smear.db.model.SmearvariableEvent"
            };

        _methodName1 = "createSmearvariableEvent";

        _methodParameterTypes1 = new String[] {
                "fi.csc.smear.db.service.persistence.SmearvariableEventPK"
            };

        _methodName2 = "deleteSmearvariableEvent";

        _methodParameterTypes2 = new String[] {
                "fi.csc.smear.db.service.persistence.SmearvariableEventPK"
            };

        _methodName3 = "deleteSmearvariableEvent";

        _methodParameterTypes3 = new String[] {
                "fi.csc.smear.db.model.SmearvariableEvent"
            };

        _methodName4 = "dynamicQuery";

        _methodParameterTypes4 = new String[] {  };

        _methodName5 = "dynamicQuery";

        _methodParameterTypes5 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery"
            };

        _methodName6 = "dynamicQuery";

        _methodParameterTypes6 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int"
            };

        _methodName7 = "dynamicQuery";

        _methodParameterTypes7 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int",
                "com.liferay.portal.kernel.util.OrderByComparator"
            };

        _methodName8 = "dynamicQueryCount";

        _methodParameterTypes8 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery"
            };

        _methodName9 = "dynamicQueryCount";

        _methodParameterTypes9 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery",
                "com.liferay.portal.kernel.dao.orm.Projection"
            };

        _methodName10 = "fetchSmearvariableEvent";

        _methodParameterTypes10 = new String[] {
                "fi.csc.smear.db.service.persistence.SmearvariableEventPK"
            };

        _methodName11 = "getSmearvariableEvent";

        _methodParameterTypes11 = new String[] {
                "fi.csc.smear.db.service.persistence.SmearvariableEventPK"
            };

        _methodName12 = "getPersistedModel";

        _methodParameterTypes12 = new String[] { "java.io.Serializable" };

        _methodName13 = "getSmearvariableEvents";

        _methodParameterTypes13 = new String[] { "int", "int" };

        _methodName14 = "getSmearvariableEventsCount";

        _methodParameterTypes14 = new String[] {  };

        _methodName15 = "updateSmearvariableEvent";

        _methodParameterTypes15 = new String[] {
                "fi.csc.smear.db.model.SmearvariableEvent"
            };

        _methodName188 = "getBeanIdentifier";

        _methodParameterTypes188 = new String[] {  };

        _methodName189 = "setBeanIdentifier";

        _methodParameterTypes189 = new String[] { "java.lang.String" };

        _methodName194 = "findByVariable";

        _methodParameterTypes194 = new String[] { "long" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName0.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
            return SmearvariableEventLocalServiceUtil.addSmearvariableEvent((fi.csc.smear.db.model.SmearvariableEvent) arguments[0]);
        }

        if (_methodName1.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
            return SmearvariableEventLocalServiceUtil.createSmearvariableEvent((fi.csc.smear.db.service.persistence.SmearvariableEventPK) arguments[0]);
        }

        if (_methodName2.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
            return SmearvariableEventLocalServiceUtil.deleteSmearvariableEvent((fi.csc.smear.db.service.persistence.SmearvariableEventPK) arguments[0]);
        }

        if (_methodName3.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
            return SmearvariableEventLocalServiceUtil.deleteSmearvariableEvent((fi.csc.smear.db.model.SmearvariableEvent) arguments[0]);
        }

        if (_methodName4.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
            return SmearvariableEventLocalServiceUtil.dynamicQuery();
        }

        if (_methodName5.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
            return SmearvariableEventLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0]);
        }

        if (_methodName6.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
            return SmearvariableEventLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue());
        }

        if (_methodName7.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
            return SmearvariableEventLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue(),
                (com.liferay.portal.kernel.util.OrderByComparator) arguments[3]);
        }

        if (_methodName8.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
            return SmearvariableEventLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0]);
        }

        if (_methodName9.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
            return SmearvariableEventLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                (com.liferay.portal.kernel.dao.orm.Projection) arguments[1]);
        }

        if (_methodName10.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
            return SmearvariableEventLocalServiceUtil.fetchSmearvariableEvent((fi.csc.smear.db.service.persistence.SmearvariableEventPK) arguments[0]);
        }

        if (_methodName11.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
            return SmearvariableEventLocalServiceUtil.getSmearvariableEvent((fi.csc.smear.db.service.persistence.SmearvariableEventPK) arguments[0]);
        }

        if (_methodName12.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
            return SmearvariableEventLocalServiceUtil.getPersistedModel((java.io.Serializable) arguments[0]);
        }

        if (_methodName13.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
            return SmearvariableEventLocalServiceUtil.getSmearvariableEvents(((Integer) arguments[0]).intValue(),
                ((Integer) arguments[1]).intValue());
        }

        if (_methodName14.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
            return SmearvariableEventLocalServiceUtil.getSmearvariableEventsCount();
        }

        if (_methodName15.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
            return SmearvariableEventLocalServiceUtil.updateSmearvariableEvent((fi.csc.smear.db.model.SmearvariableEvent) arguments[0]);
        }

        if (_methodName188.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes188, parameterTypes)) {
            return SmearvariableEventLocalServiceUtil.getBeanIdentifier();
        }

        if (_methodName189.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes189, parameterTypes)) {
            SmearvariableEventLocalServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        if (_methodName194.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes194, parameterTypes)) {
            return SmearvariableEventLocalServiceUtil.findByVariable(((Long) arguments[0]).longValue());
        }

        throw new UnsupportedOperationException();
    }
}
