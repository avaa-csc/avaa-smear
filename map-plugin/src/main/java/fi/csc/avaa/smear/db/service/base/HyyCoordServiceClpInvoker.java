package fi.csc.avaa.smear.db.service.base;

import fi.csc.avaa.smear.db.service.HyyCoordServiceUtil;

import java.util.Arrays;

/**
 * @author tkantola
 * @generated
 */
public class HyyCoordServiceClpInvoker {
    private String _methodName18;
    private String[] _methodParameterTypes18;
    private String _methodName19;
    private String[] _methodParameterTypes19;

    public HyyCoordServiceClpInvoker() {
        _methodName18 = "getBeanIdentifier";

        _methodParameterTypes18 = new String[] {  };

        _methodName19 = "setBeanIdentifier";

        _methodParameterTypes19 = new String[] { "java.lang.String" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName18.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes18, parameterTypes)) {
            return HyyCoordServiceUtil.getBeanIdentifier();
        }

        if (_methodName19.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes19, parameterTypes)) {
            HyyCoordServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        throw new UnsupportedOperationException();
    }
}
