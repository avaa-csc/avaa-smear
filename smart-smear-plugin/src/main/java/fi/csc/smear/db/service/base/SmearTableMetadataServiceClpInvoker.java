package fi.csc.smear.db.service.base;

import fi.csc.smear.db.service.SmearTableMetadataServiceUtil;

import java.util.Arrays;

/**
 * @author pj
 * @generated
 */
public class SmearTableMetadataServiceClpInvoker {
    private String _methodName172;
    private String[] _methodParameterTypes172;
    private String _methodName173;
    private String[] _methodParameterTypes173;

    public SmearTableMetadataServiceClpInvoker() {
        _methodName172 = "getBeanIdentifier";

        _methodParameterTypes172 = new String[] {  };

        _methodName173 = "setBeanIdentifier";

        _methodParameterTypes173 = new String[] { "java.lang.String" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName172.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes172, parameterTypes)) {
            return SmearTableMetadataServiceUtil.getBeanIdentifier();
        }

        if (_methodName173.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes173, parameterTypes)) {
            SmearTableMetadataServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        throw new UnsupportedOperationException();
    }
}
