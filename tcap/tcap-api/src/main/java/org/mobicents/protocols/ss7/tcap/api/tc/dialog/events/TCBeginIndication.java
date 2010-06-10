/**
 * 
 */
package org.mobicents.protocols.ss7.tcap.api.tc.dialog.events;

import org.mobicents.protocols.ss7.sccp.parameter.SccpAddress;
import org.mobicents.protocols.ss7.tcap.asn.ApplicationContextName;
import org.mobicents.protocols.ss7.tcap.asn.UserInformation;

/**
 * @author baranowb
 * 
 */
public interface TCBeginIndication extends DialogIndication {

	public Byte getQOS();

	public ApplicationContextName getApplicationContextName();

	public UserInformation getUserInformation();

	public SccpAddress getDestinationAddress();

	public SccpAddress getOriginatingAddress();

}
