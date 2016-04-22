package fi.csc.smear.db.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import fi.csc.smear.db.service.ClpSerializer;
import fi.csc.smear.db.service.SmearmetadataLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class SmearmetadataClp extends BaseModelImpl<Smearmetadata>
    implements Smearmetadata {
    private String _title;
    private String _rightsCategory;
    private String _access_rights;
    private String _project;
    private String _maintaining_organisation;
    private String _contact;
    private String _ref;
    private String _creator;
    private String _discipline;
    private Date _timestamp;
    private BaseModel<?> _smearmetadataRemoteModel;
    private Class<?> _clpSerializerClass = fi.csc.smear.db.service.ClpSerializer.class;

    public SmearmetadataClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return Smearmetadata.class;
    }

    @Override
    public String getModelClassName() {
        return Smearmetadata.class.getName();
    }

    @Override
    public String getPrimaryKey() {
        return _title;
    }

    @Override
    public void setPrimaryKey(String primaryKey) {
        setTitle(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _title;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey((String) primaryKeyObj);
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("title", getTitle());
        attributes.put("rightsCategory", getRightsCategory());
        attributes.put("access_rights", getAccess_rights());
        attributes.put("project", getProject());
        attributes.put("maintaining_organisation", getMaintaining_organisation());
        attributes.put("contact", getContact());
        attributes.put("ref", getRef());
        attributes.put("creator", getCreator());
        attributes.put("discipline", getDiscipline());
        attributes.put("timestamp", getTimestamp());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        String title = (String) attributes.get("title");

        if (title != null) {
            setTitle(title);
        }

        String rightsCategory = (String) attributes.get("rightsCategory");

        if (rightsCategory != null) {
            setRightsCategory(rightsCategory);
        }

        String access_rights = (String) attributes.get("access_rights");

        if (access_rights != null) {
            setAccess_rights(access_rights);
        }

        String project = (String) attributes.get("project");

        if (project != null) {
            setProject(project);
        }

        String maintaining_organisation = (String) attributes.get(
                "maintaining_organisation");

        if (maintaining_organisation != null) {
            setMaintaining_organisation(maintaining_organisation);
        }

        String contact = (String) attributes.get("contact");

        if (contact != null) {
            setContact(contact);
        }

        String ref = (String) attributes.get("ref");

        if (ref != null) {
            setRef(ref);
        }

        String creator = (String) attributes.get("creator");

        if (creator != null) {
            setCreator(creator);
        }

        String discipline = (String) attributes.get("discipline");

        if (discipline != null) {
            setDiscipline(discipline);
        }

        Date timestamp = (Date) attributes.get("timestamp");

        if (timestamp != null) {
            setTimestamp(timestamp);
        }
    }

    @Override
    public String getTitle() {
        return _title;
    }

    @Override
    public void setTitle(String title) {
        _title = title;

        if (_smearmetadataRemoteModel != null) {
            try {
                Class<?> clazz = _smearmetadataRemoteModel.getClass();

                Method method = clazz.getMethod("setTitle", String.class);

                method.invoke(_smearmetadataRemoteModel, title);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getRightsCategory() {
        return _rightsCategory;
    }

    @Override
    public void setRightsCategory(String rightsCategory) {
        _rightsCategory = rightsCategory;

        if (_smearmetadataRemoteModel != null) {
            try {
                Class<?> clazz = _smearmetadataRemoteModel.getClass();

                Method method = clazz.getMethod("setRightsCategory",
                        String.class);

                method.invoke(_smearmetadataRemoteModel, rightsCategory);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getAccess_rights() {
        return _access_rights;
    }

    @Override
    public void setAccess_rights(String access_rights) {
        _access_rights = access_rights;

        if (_smearmetadataRemoteModel != null) {
            try {
                Class<?> clazz = _smearmetadataRemoteModel.getClass();

                Method method = clazz.getMethod("setAccess_rights", String.class);

                method.invoke(_smearmetadataRemoteModel, access_rights);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getProject() {
        return _project;
    }

    @Override
    public void setProject(String project) {
        _project = project;

        if (_smearmetadataRemoteModel != null) {
            try {
                Class<?> clazz = _smearmetadataRemoteModel.getClass();

                Method method = clazz.getMethod("setProject", String.class);

                method.invoke(_smearmetadataRemoteModel, project);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getMaintaining_organisation() {
        return _maintaining_organisation;
    }

    @Override
    public void setMaintaining_organisation(String maintaining_organisation) {
        _maintaining_organisation = maintaining_organisation;

        if (_smearmetadataRemoteModel != null) {
            try {
                Class<?> clazz = _smearmetadataRemoteModel.getClass();

                Method method = clazz.getMethod("setMaintaining_organisation",
                        String.class);

                method.invoke(_smearmetadataRemoteModel,
                    maintaining_organisation);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getContact() {
        return _contact;
    }

    @Override
    public void setContact(String contact) {
        _contact = contact;

        if (_smearmetadataRemoteModel != null) {
            try {
                Class<?> clazz = _smearmetadataRemoteModel.getClass();

                Method method = clazz.getMethod("setContact", String.class);

                method.invoke(_smearmetadataRemoteModel, contact);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getRef() {
        return _ref;
    }

    @Override
    public void setRef(String ref) {
        _ref = ref;

        if (_smearmetadataRemoteModel != null) {
            try {
                Class<?> clazz = _smearmetadataRemoteModel.getClass();

                Method method = clazz.getMethod("setRef", String.class);

                method.invoke(_smearmetadataRemoteModel, ref);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getCreator() {
        return _creator;
    }

    @Override
    public void setCreator(String creator) {
        _creator = creator;

        if (_smearmetadataRemoteModel != null) {
            try {
                Class<?> clazz = _smearmetadataRemoteModel.getClass();

                Method method = clazz.getMethod("setCreator", String.class);

                method.invoke(_smearmetadataRemoteModel, creator);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getDiscipline() {
        return _discipline;
    }

    @Override
    public void setDiscipline(String discipline) {
        _discipline = discipline;

        if (_smearmetadataRemoteModel != null) {
            try {
                Class<?> clazz = _smearmetadataRemoteModel.getClass();

                Method method = clazz.getMethod("setDiscipline", String.class);

                method.invoke(_smearmetadataRemoteModel, discipline);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getTimestamp() {
        return _timestamp;
    }

    @Override
    public void setTimestamp(Date timestamp) {
        _timestamp = timestamp;

        if (_smearmetadataRemoteModel != null) {
            try {
                Class<?> clazz = _smearmetadataRemoteModel.getClass();

                Method method = clazz.getMethod("setTimestamp", Date.class);

                method.invoke(_smearmetadataRemoteModel, timestamp);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getSmearmetadataRemoteModel() {
        return _smearmetadataRemoteModel;
    }

    public void setSmearmetadataRemoteModel(
        BaseModel<?> smearmetadataRemoteModel) {
        _smearmetadataRemoteModel = smearmetadataRemoteModel;
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

        Class<?> remoteModelClass = _smearmetadataRemoteModel.getClass();

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

        Object returnValue = method.invoke(_smearmetadataRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            SmearmetadataLocalServiceUtil.addSmearmetadata(this);
        } else {
            SmearmetadataLocalServiceUtil.updateSmearmetadata(this);
        }
    }

    @Override
    public Smearmetadata toEscapedModel() {
        return (Smearmetadata) ProxyUtil.newProxyInstance(Smearmetadata.class.getClassLoader(),
            new Class[] { Smearmetadata.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        SmearmetadataClp clone = new SmearmetadataClp();

        clone.setTitle(getTitle());
        clone.setRightsCategory(getRightsCategory());
        clone.setAccess_rights(getAccess_rights());
        clone.setProject(getProject());
        clone.setMaintaining_organisation(getMaintaining_organisation());
        clone.setContact(getContact());
        clone.setRef(getRef());
        clone.setCreator(getCreator());
        clone.setDiscipline(getDiscipline());
        clone.setTimestamp(getTimestamp());

        return clone;
    }

    @Override
    public int compareTo(Smearmetadata smearmetadata) {
        String primaryKey = smearmetadata.getPrimaryKey();

        return getPrimaryKey().compareTo(primaryKey);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof SmearmetadataClp)) {
            return false;
        }

        SmearmetadataClp smearmetadata = (SmearmetadataClp) obj;

        String primaryKey = smearmetadata.getPrimaryKey();

        if (getPrimaryKey().equals(primaryKey)) {
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
        return getPrimaryKey().hashCode();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(21);

        sb.append("{title=");
        sb.append(getTitle());
        sb.append(", rightsCategory=");
        sb.append(getRightsCategory());
        sb.append(", access_rights=");
        sb.append(getAccess_rights());
        sb.append(", project=");
        sb.append(getProject());
        sb.append(", maintaining_organisation=");
        sb.append(getMaintaining_organisation());
        sb.append(", contact=");
        sb.append(getContact());
        sb.append(", ref=");
        sb.append(getRef());
        sb.append(", creator=");
        sb.append(getCreator());
        sb.append(", discipline=");
        sb.append(getDiscipline());
        sb.append(", timestamp=");
        sb.append(getTimestamp());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(34);

        sb.append("<model><model-name>");
        sb.append("fi.csc.smear.db.model.Smearmetadata");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>title</column-name><column-value><![CDATA[");
        sb.append(getTitle());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>rightsCategory</column-name><column-value><![CDATA[");
        sb.append(getRightsCategory());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>access_rights</column-name><column-value><![CDATA[");
        sb.append(getAccess_rights());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>project</column-name><column-value><![CDATA[");
        sb.append(getProject());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>maintaining_organisation</column-name><column-value><![CDATA[");
        sb.append(getMaintaining_organisation());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>contact</column-name><column-value><![CDATA[");
        sb.append(getContact());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>ref</column-name><column-value><![CDATA[");
        sb.append(getRef());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>creator</column-name><column-value><![CDATA[");
        sb.append(getCreator());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>discipline</column-name><column-value><![CDATA[");
        sb.append(getDiscipline());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>timestamp</column-name><column-value><![CDATA[");
        sb.append(getTimestamp());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
