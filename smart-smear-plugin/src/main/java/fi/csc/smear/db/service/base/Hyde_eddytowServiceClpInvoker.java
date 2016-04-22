package fi.csc.smear.db.service.base;

import fi.csc.smear.db.service.Hyde_eddytowServiceUtil;

import java.util.Arrays;

/**
 * @author pj
 * @generated
 */
public class Hyde_eddytowServiceClpInvoker {
    private String _methodName172;
    private String[] _methodParameterTypes172;
    private String _methodName173;
    private String[] _methodParameterTypes173;

    public Hyde_eddytowServiceClpInvoker() {
        _methodName172 = "getBeanIdentifier";

        _methodParameterTypes172 = new String[] {  };

        _methodName173 = "setBeanIdentifier";

        _methodParameterTypes173 = new String[] { "java.lang.String" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName172.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes172, parameterTypes)) {
            return Hyde_eddytowServiceUtil.getBeanIdentifier();
        }

        if (_methodName173.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes173, parameterTypes)) {
            Hyde_eddytowServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        throw new UnsupportedOperationException();
    }
}
