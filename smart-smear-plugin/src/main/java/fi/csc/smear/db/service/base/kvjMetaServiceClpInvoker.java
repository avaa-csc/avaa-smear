package fi.csc.smear.db.service.base;

import fi.csc.smear.db.service.kvjMetaServiceUtil;

import java.util.Arrays;

/**
 * @author pj
 * @generated
 */
public class kvjMetaServiceClpInvoker {
    private String _methodName178;
    private String[] _methodParameterTypes178;
    private String _methodName179;
    private String[] _methodParameterTypes179;

    public kvjMetaServiceClpInvoker() {
        _methodName178 = "getBeanIdentifier";

        _methodParameterTypes178 = new String[] {  };

        _methodName179 = "setBeanIdentifier";

        _methodParameterTypes179 = new String[] { "java.lang.String" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName178.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes178, parameterTypes)) {
            return kvjMetaServiceUtil.getBeanIdentifier();
        }

        if (_methodName179.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes179, parameterTypes)) {
            kvjMetaServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        throw new UnsupportedOperationException();
    }
}
