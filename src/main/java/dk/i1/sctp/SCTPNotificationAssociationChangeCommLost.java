package dk.i1.sctp;

/**An association has been lost.
The association ID is not longer valid.
*/
public class SCTPNotificationAssociationChangeCommLost extends SCTPNotificationAssociationChange {
	SCTPNotificationAssociationChangeCommLost(
		short flags,
		short sac_type,
		short sac_flags,
		short sac_state,
		short sac_error,
		short sac_outbound_streams,
		short sac_inbound_streams,
		long sac_assoc_id
	) {
		super(flags,
		      sac_type,
		      sac_flags,
		      State.SCTP_COMM_LOST, //sac_state,
		      sac_error,
		      sac_outbound_streams,
		      sac_inbound_streams,
		      sac_assoc_id);
	}
}
