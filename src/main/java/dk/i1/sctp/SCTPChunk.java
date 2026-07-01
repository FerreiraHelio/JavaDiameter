package dk.i1.sctp;
/**An SCTP chunk, data or notification.
{@link SCTPSocket#receive} returns instances that are subclasses of SCTPChunk.
*The actual type depends on what happened. The most commonly received chunk is SCTPData.
<p>
Class hierarchy:
<pre>
{@link SCTPChunk}
	{@link SCTPData}
	{@link SCTPNotification}
		{@link SCTPNotificationAssociationChange}
			{@link SCTPNotificationAssociationChangeCommUp}
			{@link SCTPNotificationAssociationChangeCommLost}
			{@link SCTPNotificationAssociationChangeRestart}
			{@link SCTPNotificationAssociationChangeShutdownComplete}
			{@link SCTPNotificationAssociationChangeCantStartAssociation}
		{@link SCTPNotificationPeerAddressChange}
		{@link SCTPNotificationRemoteError}
		{@link SCTPNotificationSendFailed}
		{@link SCTPNotificationShutdownEvent}
		{@link SCTPNotificationAdaptationIndication}
		{@link SCTPNotificationPartialDeliveryEvent}
</pre>		
*/

public abstract class SCTPChunk {
}
