package fi.csc.smear.db.service;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.io.unsync.UnsyncByteArrayInputStream;
import com.liferay.portal.kernel.io.unsync.UnsyncByteArrayOutputStream;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ClassLoaderObjectInputStream;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.BaseModel;

import fi.csc.smear.db.model.Hyde_eddy233Clp;
import fi.csc.smear.db.model.Hyde_eddytowClp;
import fi.csc.smear.db.model.HydemetaClp;
import fi.csc.smear.db.model.HyyAeroClp;
import fi.csc.smear.db.model.HyyDMPSClp;
import fi.csc.smear.db.model.Hyy_eddysubClp;
import fi.csc.smear.db.model.KumpulaDMPSClp;
import fi.csc.smear.db.model.Kumpula_eddyClp;
import fi.csc.smear.db.model.KumpulametaClp;
import fi.csc.smear.db.model.Sii1eddyClp;
import fi.csc.smear.db.model.Sii1metaClp;
import fi.csc.smear.db.model.Sii2eddyClp;
import fi.csc.smear.db.model.Sii2metaClp;
import fi.csc.smear.db.model.SmearEventsClp;
import fi.csc.smear.db.model.SmearTableMetadataClp;
import fi.csc.smear.db.model.SmearTagsClp;
import fi.csc.smear.db.model.SmearVariableMetadataClp;
import fi.csc.smear.db.model.SmearmetadataClp;
import fi.csc.smear.db.model.SmearstationClp;
import fi.csc.smear.db.model.SmearvariableEventClp;
import fi.csc.smear.db.model.SmearvariableTagsClp;
import fi.csc.smear.db.model.TowermetaClp;
import fi.csc.smear.db.model.VarDMPSClp;
import fi.csc.smear.db.model.VareddyClp;
import fi.csc.smear.db.model.Varrio_treeClp;
import fi.csc.smear.db.model.VarriometaClp;
import fi.csc.smear.db.model.kvjEddyClp;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.lang.reflect.Method;

import java.util.ArrayList;
import java.util.List;


public class ClpSerializer {
    private static Log _log = LogFactoryUtil.getLog(ClpSerializer.class);
    private static String _servletContextName;
    private static boolean _useReflectionToTranslateThrowable = true;

    public static String getServletContextName() {
        if (Validator.isNotNull(_servletContextName)) {
            return _servletContextName;
        }

        synchronized (ClpSerializer.class) {
            if (Validator.isNotNull(_servletContextName)) {
                return _servletContextName;
            }

            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Class<?> portletPropsClass = classLoader.loadClass(
                        "com.liferay.util.portlet.PortletProps");

                Method getMethod = portletPropsClass.getMethod("get",
                        new Class<?>[] { String.class });

                String portletPropsServletContextName = (String) getMethod.invoke(null,
                        "smart-smear-portlet-deployment-context");

                if (Validator.isNotNull(portletPropsServletContextName)) {
                    _servletContextName = portletPropsServletContextName;
                }
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info(
                        "Unable to locate deployment context from portlet properties");
                }
            }

            if (Validator.isNull(_servletContextName)) {
                try {
                    String propsUtilServletContextName = PropsUtil.get(
                            "smart-smear-portlet-deployment-context");

                    if (Validator.isNotNull(propsUtilServletContextName)) {
                        _servletContextName = propsUtilServletContextName;
                    }
                } catch (Throwable t) {
                    if (_log.isInfoEnabled()) {
                        _log.info(
                            "Unable to locate deployment context from portal properties");
                    }
                }
            }

            if (Validator.isNull(_servletContextName)) {
                _servletContextName = "smart-smear-portlet";
            }

            return _servletContextName;
        }
    }

    public static Object translateInput(BaseModel<?> oldModel) {
        Class<?> oldModelClass = oldModel.getClass();

        String oldModelClassName = oldModelClass.getName();

        if (oldModelClassName.equals(Hyde_eddy233Clp.class.getName())) {
            return translateInputHyde_eddy233(oldModel);
        }

        if (oldModelClassName.equals(Hyde_eddytowClp.class.getName())) {
            return translateInputHyde_eddytow(oldModel);
        }

        if (oldModelClassName.equals(HydemetaClp.class.getName())) {
            return translateInputHydemeta(oldModel);
        }

        if (oldModelClassName.equals(Hyy_eddysubClp.class.getName())) {
            return translateInputHyy_eddysub(oldModel);
        }

        if (oldModelClassName.equals(HyyAeroClp.class.getName())) {
            return translateInputHyyAero(oldModel);
        }

        if (oldModelClassName.equals(HyyDMPSClp.class.getName())) {
            return translateInputHyyDMPS(oldModel);
        }

        if (oldModelClassName.equals(Kumpula_eddyClp.class.getName())) {
            return translateInputKumpula_eddy(oldModel);
        }

        if (oldModelClassName.equals(KumpulaDMPSClp.class.getName())) {
            return translateInputKumpulaDMPS(oldModel);
        }

        if (oldModelClassName.equals(KumpulametaClp.class.getName())) {
            return translateInputKumpulameta(oldModel);
        }

        if (oldModelClassName.equals(kvjEddyClp.class.getName())) {
            return translateInputkvjEddy(oldModel);
        }

        if (oldModelClassName.equals(Sii1eddyClp.class.getName())) {
            return translateInputSii1eddy(oldModel);
        }

        if (oldModelClassName.equals(Sii1metaClp.class.getName())) {
            return translateInputSii1meta(oldModel);
        }

        if (oldModelClassName.equals(Sii2eddyClp.class.getName())) {
            return translateInputSii2eddy(oldModel);
        }

        if (oldModelClassName.equals(Sii2metaClp.class.getName())) {
            return translateInputSii2meta(oldModel);
        }

        if (oldModelClassName.equals(SmearEventsClp.class.getName())) {
            return translateInputSmearEvents(oldModel);
        }

        if (oldModelClassName.equals(SmearmetadataClp.class.getName())) {
            return translateInputSmearmetadata(oldModel);
        }

        if (oldModelClassName.equals(SmearstationClp.class.getName())) {
            return translateInputSmearstation(oldModel);
        }

        if (oldModelClassName.equals(SmearTableMetadataClp.class.getName())) {
            return translateInputSmearTableMetadata(oldModel);
        }

        if (oldModelClassName.equals(SmearTagsClp.class.getName())) {
            return translateInputSmearTags(oldModel);
        }

        if (oldModelClassName.equals(SmearvariableEventClp.class.getName())) {
            return translateInputSmearvariableEvent(oldModel);
        }

        if (oldModelClassName.equals(SmearVariableMetadataClp.class.getName())) {
            return translateInputSmearVariableMetadata(oldModel);
        }

        if (oldModelClassName.equals(SmearvariableTagsClp.class.getName())) {
            return translateInputSmearvariableTags(oldModel);
        }

        if (oldModelClassName.equals(TowermetaClp.class.getName())) {
            return translateInputTowermeta(oldModel);
        }

        if (oldModelClassName.equals(VarDMPSClp.class.getName())) {
            return translateInputVarDMPS(oldModel);
        }

        if (oldModelClassName.equals(VareddyClp.class.getName())) {
            return translateInputVareddy(oldModel);
        }

        if (oldModelClassName.equals(Varrio_treeClp.class.getName())) {
            return translateInputVarrio_tree(oldModel);
        }

        if (oldModelClassName.equals(VarriometaClp.class.getName())) {
            return translateInputVarriometa(oldModel);
        }

        return oldModel;
    }

    public static Object translateInput(List<Object> oldList) {
        List<Object> newList = new ArrayList<Object>(oldList.size());

        for (int i = 0; i < oldList.size(); i++) {
            Object curObj = oldList.get(i);

            newList.add(translateInput(curObj));
        }

        return newList;
    }

    public static Object translateInputHyde_eddy233(BaseModel<?> oldModel) {
        Hyde_eddy233Clp oldClpModel = (Hyde_eddy233Clp) oldModel;

        BaseModel<?> newModel = oldClpModel.getHyde_eddy233RemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputHyde_eddytow(BaseModel<?> oldModel) {
        Hyde_eddytowClp oldClpModel = (Hyde_eddytowClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getHyde_eddytowRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputHydemeta(BaseModel<?> oldModel) {
        HydemetaClp oldClpModel = (HydemetaClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getHydemetaRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputHyy_eddysub(BaseModel<?> oldModel) {
        Hyy_eddysubClp oldClpModel = (Hyy_eddysubClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getHyy_eddysubRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputHyyAero(BaseModel<?> oldModel) {
        HyyAeroClp oldClpModel = (HyyAeroClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getHyyAeroRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputHyyDMPS(BaseModel<?> oldModel) {
        HyyDMPSClp oldClpModel = (HyyDMPSClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getHyyDMPSRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputKumpula_eddy(BaseModel<?> oldModel) {
        Kumpula_eddyClp oldClpModel = (Kumpula_eddyClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getKumpula_eddyRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputKumpulaDMPS(BaseModel<?> oldModel) {
        KumpulaDMPSClp oldClpModel = (KumpulaDMPSClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getKumpulaDMPSRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputKumpulameta(BaseModel<?> oldModel) {
        KumpulametaClp oldClpModel = (KumpulametaClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getKumpulametaRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputkvjEddy(BaseModel<?> oldModel) {
        kvjEddyClp oldClpModel = (kvjEddyClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getkvjEddyRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputSii1eddy(BaseModel<?> oldModel) {
        Sii1eddyClp oldClpModel = (Sii1eddyClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getSii1eddyRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputSii1meta(BaseModel<?> oldModel) {
        Sii1metaClp oldClpModel = (Sii1metaClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getSii1metaRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputSii2eddy(BaseModel<?> oldModel) {
        Sii2eddyClp oldClpModel = (Sii2eddyClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getSii2eddyRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputSii2meta(BaseModel<?> oldModel) {
        Sii2metaClp oldClpModel = (Sii2metaClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getSii2metaRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputSmearEvents(BaseModel<?> oldModel) {
        SmearEventsClp oldClpModel = (SmearEventsClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getSmearEventsRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputSmearmetadata(BaseModel<?> oldModel) {
        SmearmetadataClp oldClpModel = (SmearmetadataClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getSmearmetadataRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputSmearstation(BaseModel<?> oldModel) {
        SmearstationClp oldClpModel = (SmearstationClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getSmearstationRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputSmearTableMetadata(BaseModel<?> oldModel) {
        SmearTableMetadataClp oldClpModel = (SmearTableMetadataClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getSmearTableMetadataRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputSmearTags(BaseModel<?> oldModel) {
        SmearTagsClp oldClpModel = (SmearTagsClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getSmearTagsRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputSmearvariableEvent(BaseModel<?> oldModel) {
        SmearvariableEventClp oldClpModel = (SmearvariableEventClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getSmearvariableEventRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputSmearVariableMetadata(
        BaseModel<?> oldModel) {
        SmearVariableMetadataClp oldClpModel = (SmearVariableMetadataClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getSmearVariableMetadataRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputSmearvariableTags(BaseModel<?> oldModel) {
        SmearvariableTagsClp oldClpModel = (SmearvariableTagsClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getSmearvariableTagsRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputTowermeta(BaseModel<?> oldModel) {
        TowermetaClp oldClpModel = (TowermetaClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getTowermetaRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputVarDMPS(BaseModel<?> oldModel) {
        VarDMPSClp oldClpModel = (VarDMPSClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getVarDMPSRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputVareddy(BaseModel<?> oldModel) {
        VareddyClp oldClpModel = (VareddyClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getVareddyRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputVarrio_tree(BaseModel<?> oldModel) {
        Varrio_treeClp oldClpModel = (Varrio_treeClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getVarrio_treeRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputVarriometa(BaseModel<?> oldModel) {
        VarriometaClp oldClpModel = (VarriometaClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getVarriometaRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInput(Object obj) {
        if (obj instanceof BaseModel<?>) {
            return translateInput((BaseModel<?>) obj);
        } else if (obj instanceof List<?>) {
            return translateInput((List<Object>) obj);
        } else {
            return obj;
        }
    }

    public static Object translateOutput(BaseModel<?> oldModel) {
        Class<?> oldModelClass = oldModel.getClass();

        String oldModelClassName = oldModelClass.getName();

        if (oldModelClassName.equals(
                    "fi.csc.smear.db.model.impl.Hyde_eddy233Impl")) {
            return translateOutputHyde_eddy233(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals(
                    "fi.csc.smear.db.model.impl.Hyde_eddytowImpl")) {
            return translateOutputHyde_eddytow(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals("fi.csc.smear.db.model.impl.HydemetaImpl")) {
            return translateOutputHydemeta(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals(
                    "fi.csc.smear.db.model.impl.Hyy_eddysubImpl")) {
            return translateOutputHyy_eddysub(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals("fi.csc.smear.db.model.impl.HyyAeroImpl")) {
            return translateOutputHyyAero(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals("fi.csc.smear.db.model.impl.HyyDMPSImpl")) {
            return translateOutputHyyDMPS(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals(
                    "fi.csc.smear.db.model.impl.Kumpula_eddyImpl")) {
            return translateOutputKumpula_eddy(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals(
                    "fi.csc.smear.db.model.impl.KumpulaDMPSImpl")) {
            return translateOutputKumpulaDMPS(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals(
                    "fi.csc.smear.db.model.impl.KumpulametaImpl")) {
            return translateOutputKumpulameta(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals("fi.csc.smear.db.model.impl.kvjEddyImpl")) {
            return translateOutputkvjEddy(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals("fi.csc.smear.db.model.impl.Sii1eddyImpl")) {
            return translateOutputSii1eddy(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals("fi.csc.smear.db.model.impl.Sii1metaImpl")) {
            return translateOutputSii1meta(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals("fi.csc.smear.db.model.impl.Sii2eddyImpl")) {
            return translateOutputSii2eddy(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals("fi.csc.smear.db.model.impl.Sii2metaImpl")) {
            return translateOutputSii2meta(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals(
                    "fi.csc.smear.db.model.impl.SmearEventsImpl")) {
            return translateOutputSmearEvents(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals(
                    "fi.csc.smear.db.model.impl.SmearmetadataImpl")) {
            return translateOutputSmearmetadata(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals(
                    "fi.csc.smear.db.model.impl.SmearstationImpl")) {
            return translateOutputSmearstation(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals(
                    "fi.csc.smear.db.model.impl.SmearTableMetadataImpl")) {
            return translateOutputSmearTableMetadata(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals("fi.csc.smear.db.model.impl.SmearTagsImpl")) {
            return translateOutputSmearTags(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals(
                    "fi.csc.smear.db.model.impl.SmearvariableEventImpl")) {
            return translateOutputSmearvariableEvent(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals(
                    "fi.csc.smear.db.model.impl.SmearVariableMetadataImpl")) {
            return translateOutputSmearVariableMetadata(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals(
                    "fi.csc.smear.db.model.impl.SmearvariableTagsImpl")) {
            return translateOutputSmearvariableTags(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals("fi.csc.smear.db.model.impl.TowermetaImpl")) {
            return translateOutputTowermeta(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals("fi.csc.smear.db.model.impl.VarDMPSImpl")) {
            return translateOutputVarDMPS(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals("fi.csc.smear.db.model.impl.VareddyImpl")) {
            return translateOutputVareddy(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals(
                    "fi.csc.smear.db.model.impl.Varrio_treeImpl")) {
            return translateOutputVarrio_tree(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals(
                    "fi.csc.smear.db.model.impl.VarriometaImpl")) {
            return translateOutputVarriometa(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        return oldModel;
    }

    public static Object translateOutput(List<Object> oldList) {
        List<Object> newList = new ArrayList<Object>(oldList.size());

        for (int i = 0; i < oldList.size(); i++) {
            Object curObj = oldList.get(i);

            newList.add(translateOutput(curObj));
        }

        return newList;
    }

    public static Object translateOutput(Object obj) {
        if (obj instanceof BaseModel<?>) {
            return translateOutput((BaseModel<?>) obj);
        } else if (obj instanceof List<?>) {
            return translateOutput((List<Object>) obj);
        } else {
            return obj;
        }
    }

    public static Throwable translateThrowable(Throwable throwable) {
        if (_useReflectionToTranslateThrowable) {
            try {
                UnsyncByteArrayOutputStream unsyncByteArrayOutputStream = new UnsyncByteArrayOutputStream();
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(unsyncByteArrayOutputStream);

                objectOutputStream.writeObject(throwable);

                objectOutputStream.flush();
                objectOutputStream.close();

                UnsyncByteArrayInputStream unsyncByteArrayInputStream = new UnsyncByteArrayInputStream(unsyncByteArrayOutputStream.unsafeGetByteArray(),
                        0, unsyncByteArrayOutputStream.size());

                Thread currentThread = Thread.currentThread();

                ClassLoader contextClassLoader = currentThread.getContextClassLoader();

                ObjectInputStream objectInputStream = new ClassLoaderObjectInputStream(unsyncByteArrayInputStream,
                        contextClassLoader);

                throwable = (Throwable) objectInputStream.readObject();

                objectInputStream.close();

                return throwable;
            } catch (SecurityException se) {
                if (_log.isInfoEnabled()) {
                    _log.info("Do not use reflection to translate throwable");
                }

                _useReflectionToTranslateThrowable = false;
            } catch (Throwable throwable2) {
                _log.error(throwable2, throwable2);

                return throwable2;
            }
        }

        Class<?> clazz = throwable.getClass();

        String className = clazz.getName();

        if (className.equals(PortalException.class.getName())) {
            return new PortalException();
        }

        if (className.equals(SystemException.class.getName())) {
            return new SystemException();
        }

        if (className.equals("fi.csc.smear.db.NoSuchHyde_eddy233Exception")) {
            return new fi.csc.smear.db.NoSuchHyde_eddy233Exception();
        }

        if (className.equals("fi.csc.smear.db.NoSuchHyde_eddytowException")) {
            return new fi.csc.smear.db.NoSuchHyde_eddytowException();
        }

        if (className.equals("fi.csc.smear.db.NoSuchHydemetaException")) {
            return new fi.csc.smear.db.NoSuchHydemetaException();
        }

        if (className.equals("fi.csc.smear.db.NoSuchHyy_eddysubException")) {
            return new fi.csc.smear.db.NoSuchHyy_eddysubException();
        }

        if (className.equals("fi.csc.smear.db.NoSuchHyyAeroException")) {
            return new fi.csc.smear.db.NoSuchHyyAeroException();
        }

        if (className.equals("fi.csc.smear.db.NoSuchHyyDMPSException")) {
            return new fi.csc.smear.db.NoSuchHyyDMPSException();
        }

        if (className.equals("fi.csc.smear.db.NoSuchKumpula_eddyException")) {
            return new fi.csc.smear.db.NoSuchKumpula_eddyException();
        }

        if (className.equals("fi.csc.smear.db.NoSuchKumpulaDMPSException")) {
            return new fi.csc.smear.db.NoSuchKumpulaDMPSException();
        }

        if (className.equals("fi.csc.smear.db.NoSuchKumpulametaException")) {
            return new fi.csc.smear.db.NoSuchKumpulametaException();
        }

        if (className.equals("fi.csc.smear.db.NoSuchkvjEddyException")) {
            return new fi.csc.smear.db.NoSuchkvjEddyException();
        }

        if (className.equals("fi.csc.smear.db.NoSuchSii1eddyException")) {
            return new fi.csc.smear.db.NoSuchSii1eddyException();
        }

        if (className.equals("fi.csc.smear.db.NoSuchSii1metaException")) {
            return new fi.csc.smear.db.NoSuchSii1metaException();
        }

        if (className.equals("fi.csc.smear.db.NoSuchSii2eddyException")) {
            return new fi.csc.smear.db.NoSuchSii2eddyException();
        }

        if (className.equals("fi.csc.smear.db.NoSuchSii2metaException")) {
            return new fi.csc.smear.db.NoSuchSii2metaException();
        }

        if (className.equals("fi.csc.smear.db.NoSuchEventsException")) {
            return new fi.csc.smear.db.NoSuchEventsException();
        }

        if (className.equals("fi.csc.smear.db.NoSuchmetadataException")) {
            return new fi.csc.smear.db.NoSuchmetadataException();
        }

        if (className.equals("fi.csc.smear.db.NoSuchstationException")) {
            return new fi.csc.smear.db.NoSuchstationException();
        }

        if (className.equals("fi.csc.smear.db.NoSuchTableMetadataException")) {
            return new fi.csc.smear.db.NoSuchTableMetadataException();
        }

        if (className.equals("fi.csc.smear.db.NoSuchTagsException")) {
            return new fi.csc.smear.db.NoSuchTagsException();
        }

        if (className.equals("fi.csc.smear.db.NoSuchvariableEventException")) {
            return new fi.csc.smear.db.NoSuchvariableEventException();
        }

        if (className.equals("fi.csc.smear.db.NoSuchVariableMetadataException")) {
            return new fi.csc.smear.db.NoSuchVariableMetadataException();
        }

        if (className.equals("fi.csc.smear.db.NoSuchvariableTagsException")) {
            return new fi.csc.smear.db.NoSuchvariableTagsException();
        }

        if (className.equals("fi.csc.smear.db.NoSuchTowermetaException")) {
            return new fi.csc.smear.db.NoSuchTowermetaException();
        }

        if (className.equals("fi.csc.smear.db.NoSuchVarDMPSException")) {
            return new fi.csc.smear.db.NoSuchVarDMPSException();
        }

        if (className.equals("fi.csc.smear.db.NoSuchVareddyException")) {
            return new fi.csc.smear.db.NoSuchVareddyException();
        }

        if (className.equals("fi.csc.smear.db.NoSuchVarrio_treeException")) {
            return new fi.csc.smear.db.NoSuchVarrio_treeException();
        }

        if (className.equals("fi.csc.smear.db.NoSuchVarriometaException")) {
            return new fi.csc.smear.db.NoSuchVarriometaException();
        }

        return throwable;
    }

    public static Object translateOutputHyde_eddy233(BaseModel<?> oldModel) {
        Hyde_eddy233Clp newModel = new Hyde_eddy233Clp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setHyde_eddy233RemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputHyde_eddytow(BaseModel<?> oldModel) {
        Hyde_eddytowClp newModel = new Hyde_eddytowClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setHyde_eddytowRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputHydemeta(BaseModel<?> oldModel) {
        HydemetaClp newModel = new HydemetaClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setHydemetaRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputHyy_eddysub(BaseModel<?> oldModel) {
        Hyy_eddysubClp newModel = new Hyy_eddysubClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setHyy_eddysubRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputHyyAero(BaseModel<?> oldModel) {
        HyyAeroClp newModel = new HyyAeroClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setHyyAeroRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputHyyDMPS(BaseModel<?> oldModel) {
        HyyDMPSClp newModel = new HyyDMPSClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setHyyDMPSRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputKumpula_eddy(BaseModel<?> oldModel) {
        Kumpula_eddyClp newModel = new Kumpula_eddyClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setKumpula_eddyRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputKumpulaDMPS(BaseModel<?> oldModel) {
        KumpulaDMPSClp newModel = new KumpulaDMPSClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setKumpulaDMPSRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputKumpulameta(BaseModel<?> oldModel) {
        KumpulametaClp newModel = new KumpulametaClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setKumpulametaRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputkvjEddy(BaseModel<?> oldModel) {
        kvjEddyClp newModel = new kvjEddyClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setkvjEddyRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputSii1eddy(BaseModel<?> oldModel) {
        Sii1eddyClp newModel = new Sii1eddyClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setSii1eddyRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputSii1meta(BaseModel<?> oldModel) {
        Sii1metaClp newModel = new Sii1metaClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setSii1metaRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputSii2eddy(BaseModel<?> oldModel) {
        Sii2eddyClp newModel = new Sii2eddyClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setSii2eddyRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputSii2meta(BaseModel<?> oldModel) {
        Sii2metaClp newModel = new Sii2metaClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setSii2metaRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputSmearEvents(BaseModel<?> oldModel) {
        SmearEventsClp newModel = new SmearEventsClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setSmearEventsRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputSmearmetadata(BaseModel<?> oldModel) {
        SmearmetadataClp newModel = new SmearmetadataClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setSmearmetadataRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputSmearstation(BaseModel<?> oldModel) {
        SmearstationClp newModel = new SmearstationClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setSmearstationRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputSmearTableMetadata(
        BaseModel<?> oldModel) {
        SmearTableMetadataClp newModel = new SmearTableMetadataClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setSmearTableMetadataRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputSmearTags(BaseModel<?> oldModel) {
        SmearTagsClp newModel = new SmearTagsClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setSmearTagsRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputSmearvariableEvent(
        BaseModel<?> oldModel) {
        SmearvariableEventClp newModel = new SmearvariableEventClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setSmearvariableEventRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputSmearVariableMetadata(
        BaseModel<?> oldModel) {
        SmearVariableMetadataClp newModel = new SmearVariableMetadataClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setSmearVariableMetadataRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputSmearvariableTags(BaseModel<?> oldModel) {
        SmearvariableTagsClp newModel = new SmearvariableTagsClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setSmearvariableTagsRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputTowermeta(BaseModel<?> oldModel) {
        TowermetaClp newModel = new TowermetaClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setTowermetaRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputVarDMPS(BaseModel<?> oldModel) {
        VarDMPSClp newModel = new VarDMPSClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setVarDMPSRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputVareddy(BaseModel<?> oldModel) {
        VareddyClp newModel = new VareddyClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setVareddyRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputVarrio_tree(BaseModel<?> oldModel) {
        Varrio_treeClp newModel = new Varrio_treeClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setVarrio_treeRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputVarriometa(BaseModel<?> oldModel) {
        VarriometaClp newModel = new VarriometaClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setVarriometaRemoteModel(oldModel);

        return newModel;
    }
}
