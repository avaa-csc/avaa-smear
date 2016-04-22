package fi.csc.smear.db.service.base;

import fi.csc.smear.db.service.Sii1eddyServiceUtil;

import java.util.Arrays;

/**
 * @author pj
 * @generated
 */
public class Sii1eddyServiceClpInvoker {
    private String _methodName172;
    private String[] _methodParameterTypes172;
    private String _methodName173;
    private String[] _methodParameterTypes173;

    public Sii1eddyServiceClpInvoker() {
        _methodName172 = "getBeanIdentifier";

        _methodParameterTypes172 = new String[] {  };

        _methodName173 = "setBeanIdentifier";

        _methodParameterTypes173 = new String[] { "java.lang.String" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName172.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes172, parameterTypes)) {
            return Sii1eddyServiceUtil.getBeanIdentifier();
        }

        if (_methodName173.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes173, parameterTypes)) {
            Sii1eddyServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        throw new UnsupportedOperationException();
    }
}
