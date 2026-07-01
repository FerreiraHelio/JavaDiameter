package dk.i1.sctp;

public class SCTPNotificationPartialDeliveryEvent extends SCTPNotification {
	public final int pdapi_indication;
	public final AssociationId pdapi_assoc_id;
	SCTPNotificationPartialDeliveryEvent(short flags,
	                                     int pdapi_indication,
	                                     long pdapi_assoc_id)
	{
		super(flags,Type.SCTP_PARTIAL_DELIVERY_EVENT);
		this.pdapi_indication = pdapi_indication;
		this.pdapi_assoc_id = new AssociationId(pdapi_assoc_id);
	}
	
}

