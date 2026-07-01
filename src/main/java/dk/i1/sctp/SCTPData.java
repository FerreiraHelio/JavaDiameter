package dk.i1.sctp;

public class SCTPData extends SCTPChunk {
	/**Sender/receiver info*/
	public sctp_sndrcvinfo sndrcvinfo;
	byte[] data;
	
	/**Creates an empty data chunk.
	 * Data will be null, and sndrcvinfo is created with default values.
	 */
	public SCTPData() {
		this.sndrcvinfo = new sctp_sndrcvinfo();
	}
	/**Creates a data chunk with payload.
	 * Data will be the specified array, and sndrcvinfo is created with default values.
	 */
	public SCTPData(byte[] data) {
		this.sndrcvinfo = new sctp_sndrcvinfo();
		this.data = data;
	}
	/**Creates an empty data chunk.
	 * The instances is initialized with the specified parameters.
	 */
	public SCTPData(sctp_sndrcvinfo sndrcvinfo, byte[] data) {
		this.sndrcvinfo = sndrcvinfo;
		this.data = data;
	}
	public byte[] getData() {
		return data;
	}
	public int getLength() {
		return data.length;
	}
	public void setData(byte[] data) {
		this.data = data;
	}
}
