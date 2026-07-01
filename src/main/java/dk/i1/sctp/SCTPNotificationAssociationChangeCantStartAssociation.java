package dk.i1.sctp;

/**An association to a peer cannot be made.
Only happens when this node initiated the association attempt.
The association ID is not longer valid.
*/
public class SCTPNotificationAssociationChangeCantStartAssociation extends SCTPNotificationAssociationChange {
	SCTPNotificationAssociationChangeCantStartAssociation(
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
		      State.SCTP_CANT_STR_ASSOC, //sac_state,
		      sac_error,
		      sac_outbound_streams,
		      sac_inbound_streams,
		      sac_assoc_id);
	}
}
