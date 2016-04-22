package fi.csc.smear.db.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import fi.csc.smear.db.service.ClpSerializer;
import fi.csc.smear.db.service.SmearTagsLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class SmearTagsClp extends BaseModelImpl<SmearTags> implements SmearTags {
    private long _tagID;
    private String _vocabulary;
    private String _tag;
    private String _displaykeyword;
    private BaseModel<?> _smearTagsRemoteModel;
    private Class<?> _clpSerializerClass = fi.csc.smear.db.service.ClpSerializer.class;

    public SmearTagsClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return SmearTags.class;
    }

    @Override
    public String getModelClassName() {
        return SmearTags.class.getName();
    }

    @Override
    public long getPrimaryKey() {
        return _tagID;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setTagID(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _tagID;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("tagID", getTagID());
        attributes.put("vocabulary", getVocabulary());
        attributes.put("tag", getTag());
        attributes.put("displaykeyword", getDisplaykeyword());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long tagID = (Long) attributes.get("tagID");

        if (tagID != null) {
            setTagID(tagID);
        }

        String vocabulary = (String) attributes.get("vocabulary");

        if (vocabulary != null) {
            setVocabulary(vocabulary);
        }

        String tag = (String) attributes.get("tag");

        if (tag != null) {
            setTag(tag);
        }

        String displaykeyword = (String) attributes.get("displaykeyword");

        if (displaykeyword != null) {
            setDisplaykeyword(displaykeyword);
        }
    }

    @Override
    public long getTagID() {
        return _tagID;
    }

    @Override
    public void setTagID(long tagID) {
        _tagID = tagID;

        if (_smearTagsRemoteModel != null) {
            try {
                Class<?> clazz = _smearTagsRemoteModel.getClass();

                Method method = clazz.getMethod("setTagID", long.class);

                method.invoke(_smearTagsRemoteModel, tagID);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getVocabulary() {
        return _vocabulary;
    }

    @Override
    public void setVocabulary(String vocabulary) {
        _vocabulary = vocabulary;

        if (_smearTagsRemoteModel != null) {
            try {
                Class<?> clazz = _smearTagsRemoteModel.getClass();

                Method method = clazz.getMethod("setVocabulary", String.class);

                method.invoke(_smearTagsRemoteModel, vocabulary);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getTag() {
        return _tag;
    }

    @Override
    public void setTag(String tag) {
        _tag = tag;

        if (_smearTagsRemoteModel != null) {
            try {
                Class<?> clazz = _smearTagsRemoteModel.getClass();

                Method method = clazz.getMethod("setTag", String.class);

                method.invoke(_smearTagsRemoteModel, tag);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getDisplaykeyword() {
        return _displaykeyword;
    }

    @Override
    public void setDisplaykeyword(String displaykeyword) {
        _displaykeyword = displaykeyword;

        if (_smearTagsRemoteModel != null) {
            try {
                Class<?> clazz = _smearTagsRemoteModel.getClass();

                Method method = clazz.getMethod("setDisplaykeyword",
                        String.class);

                method.invoke(_smearTagsRemoteModel, displaykeyword);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getSmearTagsRemoteModel() {
        return _smearTagsRemoteModel;
    }

    public void setSmearTagsRemoteModel(BaseModel<?> smearTagsRemoteModel) {
        _smearTagsRemoteModel = smearTagsRemoteModel;
    }

    public Object invokeOnRemoteModel(String methodName,
        Class<?>[] parameterTypes, Object[] parameterValues)
        throws Exception {
        Object[] remoteParameterValues = new Object[parameterValues.length];

        for (int i = 0; i < parameterValues.length; i++) {
            if (parameterValues[i] != null) {
                remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
            }
        }

        Class<?> remoteModelClass = _smearTagsRemoteModel.getClass();

        ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

        Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

        for (int i = 0; i < parameterTypes.length; i++) {
            if (parameterTypes[i].isPrimitive()) {
                remoteParameterTypes[i] = parameterTypes[i];
            } else {
                String parameterTypeName = parameterTypes[i].getName();

                remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
            }
        }

        Method method = remoteModelClass.getMethod(methodName,
                remoteParameterTypes);

        Object returnValue = method.invoke(_smearTagsRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            SmearTagsLocalServiceUtil.addSmearTags(this);
        } else {
            SmearTagsLocalServiceUtil.updateSmearTags(this);
        }
    }

    @Override
    public SmearTags toEscapedModel() {
        return (SmearTags) ProxyUtil.newProxyInstance(SmearTags.class.getClassLoader(),
            new Class[] { SmearTags.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        SmearTagsClp clone = new SmearTagsClp();

        clone.setTagID(getTagID());
        clone.setVocabulary(getVocabulary());
        clone.setTag(getTag());
        clone.setDisplaykeyword(getDisplaykeyword());

        return clone;
    }

    @Override
    public int compareTo(SmearTags smearTags) {
        long primaryKey = smearTags.getPrimaryKey();

        if (getPrimaryKey() < primaryKey) {
            return -1;
        } else if (getPrimaryKey() > primaryKey) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof SmearTagsClp)) {
            return false;
        }

        SmearTagsClp smearTags = (SmearTagsClp) obj;

        long primaryKey = smearTags.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    public Class<?> getClpSerializerClass() {
        return _clpSerializerClass;
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(9);

        sb.append("{tagID=");
        sb.append(getTagID());
        sb.append(", vocabulary=");
        sb.append(getVocabulary());
        sb.append(", tag=");
        sb.append(getTag());
        sb.append(", displaykeyword=");
        sb.append(getDisplaykeyword());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(16);

        sb.append("<model><model-name>");
        sb.append("fi.csc.smear.db.model.SmearTags");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>tagID</column-name><column-value><![CDATA[");
        sb.append(getTagID());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>vocabulary</column-name><column-value><![CDATA[");
        sb.append(getVocabulary());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>tag</column-name><column-value><![CDATA[");
        sb.append(getTag());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>displaykeyword</column-name><column-value><![CDATA[");
        sb.append(getDisplaykeyword());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
