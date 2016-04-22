package fi.csc.smear.db.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link fi.csc.smear.db.service.http.SmearmetadataServiceSoap}.
 *
 * @author pj
 * @see fi.csc.smear.db.service.http.SmearmetadataServiceSoap
 * @generated
 */
public class SmearmetadataSoap implements Serializable {
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

    public SmearmetadataSoap() {
    }

    public static SmearmetadataSoap toSoapModel(Smearmetadata model) {
        SmearmetadataSoap soapModel = new SmearmetadataSoap();

        soapModel.setTitle(model.getTitle());
        soapModel.setRightsCategory(model.getRightsCategory());
        soapModel.setAccess_rights(model.getAccess_rights());
        soapModel.setProject(model.getProject());
        soapModel.setMaintaining_organisation(model.getMaintaining_organisation());
        soapModel.setContact(model.getContact());
        soapModel.setRef(model.getRef());
        soapModel.setCreator(model.getCreator());
        soapModel.setDiscipline(model.getDiscipline());
        soapModel.setTimestamp(model.getTimestamp());

        return soapModel;
    }

    public static SmearmetadataSoap[] toSoapModels(Smearmetadata[] models) {
        SmearmetadataSoap[] soapModels = new SmearmetadataSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static SmearmetadataSoap[][] toSoapModels(Smearmetadata[][] models) {
        SmearmetadataSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new SmearmetadataSoap[models.length][models[0].length];
        } else {
            soapModels = new SmearmetadataSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static SmearmetadataSoap[] toSoapModels(List<Smearmetadata> models) {
        List<SmearmetadataSoap> soapModels = new ArrayList<SmearmetadataSoap>(models.size());

        for (Smearmetadata model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new SmearmetadataSoap[soapModels.size()]);
    }

    public String getPrimaryKey() {
        return _title;
    }

    public void setPrimaryKey(String pk) {
        setTitle(pk);
    }

    public String getTitle() {
        return _title;
    }

    public void setTitle(String title) {
        _title = title;
    }

    public String getRightsCategory() {
        return _rightsCategory;
    }

    public void setRightsCategory(String rightsCategory) {
        _rightsCategory = rightsCategory;
    }

    public String getAccess_rights() {
        return _access_rights;
    }

    public void setAccess_rights(String access_rights) {
        _access_rights = access_rights;
    }

    public String getProject() {
        return _project;
    }

    public void setProject(String project) {
        _project = project;
    }

    public String getMaintaining_organisation() {
        return _maintaining_organisation;
    }

    public void setMaintaining_organisation(String maintaining_organisation) {
        _maintaining_organisation = maintaining_organisation;
    }

    public String getContact() {
        return _contact;
    }

    public void setContact(String contact) {
        _contact = contact;
    }

    public String getRef() {
        return _ref;
    }

    public void setRef(String ref) {
        _ref = ref;
    }

    public String getCreator() {
        return _creator;
    }

    public void setCreator(String creator) {
        _creator = creator;
    }

    public String getDiscipline() {
        return _discipline;
    }

    public void setDiscipline(String discipline) {
        _discipline = discipline;
    }

    public Date getTimestamp() {
        return _timestamp;
    }

    public void setTimestamp(Date timestamp) {
        _timestamp = timestamp;
    }
}
