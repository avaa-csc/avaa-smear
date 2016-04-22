package fi.csc.smear.db.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;
import fi.csc.smear.db.model.SmearvariableEvent;
import fi.csc.smear.db.service.base.SmearvariableEventLocalServiceBaseImpl;

/**
 * The implementation of the smearvariable event local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link fi.csc.smear.db.service.SmearvariableEventLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author pj
 * @see fi.csc.smear.db.service.base.SmearvariableEventLocalServiceBaseImpl
 * @see fi.csc.smear.db.service.SmearvariableEventLocalServiceUtil
 */
public class SmearvariableEventLocalServiceImpl
    extends SmearvariableEventLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link fi.csc.smear.db.service.SmearvariableEventLocalServiceUtil} to access the smearvariable event local service.
     */
	public List<SmearvariableEvent> findByVariable(long varId) {
		try {
			return smearvariableEventPersistence.findByVariable(varId);
		} catch (SystemException e) {
			return new ArrayList<SmearvariableEvent>();
		}
	}
}
