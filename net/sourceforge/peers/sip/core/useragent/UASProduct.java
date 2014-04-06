package net.sourceforge.peers.sip.core.useragent;


import net.sourceforge.peers.sip.transport.SipRequest;
import net.sourceforge.peers.sip.transactionuser.Dialog;

public class UASProduct {
	private InitialRequestManager initialRequestManager;

	public InitialRequestManager getInitialRequestManager() {
		return initialRequestManager;
	}

	public void setInitialRequestManager(
			InitialRequestManager initialRequestManager) {
		this.initialRequestManager = initialRequestManager;
	}

	public void acceptCall(SipRequest sipRequest, Dialog dialog) {
		initialRequestManager.getInviteHandler().acceptCall(sipRequest, dialog);
	}

	public void rejectCall(SipRequest sipRequest) {
		initialRequestManager.getInviteHandler().rejectCall(sipRequest);
	}
}