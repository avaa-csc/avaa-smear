package fi.csc.smear.db.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link fi.csc.smear.db.service.http.SmearTagsServiceSoap}.
 *
 * @author pj
 * @see fi.csc.smear.db.service.http.SmearTagsServiceSoap
 * @generated
 */
public class SmearTagsSoap implements Serializable {
    private long _tagID;
    private String _vocabulary;
    private String _tag;
    private String _displaykeyword;

    public SmearTagsSoap() {
    }

    public static SmearTagsSoap toSoapModel(SmearTags model) {
        SmearTagsSoap soapModel = new SmearTagsSoap();

        soapModel.setTagID(model.getTagID());
        soapModel.setVocabulary(model.getVocabulary());
        soapModel.setTag(model.getTag());
        soapModel.setDisplaykeyword(model.getDisplaykeyword());

        return soapModel;
    }

    public static SmearTagsSoap[] toSoapModels(SmearTags[] models) {
        SmearTagsSoap[] soapModels = new SmearTagsSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static SmearTagsSoap[][] toSoapModels(SmearTags[][] models) {
        SmearTagsSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new SmearTagsSoap[models.length][models[0].length];
        } else {
            soapModels = new SmearTagsSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static SmearTagsSoap[] toSoapModels(List<SmearTags> models) {
        List<SmearTagsSoap> soapModels = new ArrayList<SmearTagsSoap>(models.size());

        for (SmearTags model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new SmearTagsSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _tagID;
    }

    public void setPrimaryKey(long pk) {
        setTagID(pk);
    }

    public long getTagID() {
        return _tagID;
    }

    public void setTagID(long tagID) {
        _tagID = tagID;
    }

    public String getVocabulary() {
        return _vocabulary;
    }

    public void setVocabulary(String vocabulary) {
        _vocabulary = vocabulary;
    }

    public String getTag() {
        return _tag;
    }

    public void setTag(String tag) {
        _tag = tag;
    }

    public String getDisplaykeyword() {
        return _displaykeyword;
    }

    public void setDisplaykeyword(String displaykeyword) {
        _displaykeyword = displaykeyword;
    }
}
