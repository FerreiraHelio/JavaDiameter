package dk.i1.sctp;
import java.net.InetSocketAddress;

public class sctp_paddrparams {
	public AssociationId           spp_assoc_id;
	public InetSocketAddress       spp_address;
	public int                     spp_hbinterval;
	public short                   spp_pathmaxrxt;
	public int                     spp_pathmtu;
	public int                     spp_sackdelay;
	public int                     spp_flags;
	public int                     spp_ipv6_flowlabel;
	public byte                    spp_ipv4_tos;
	public static final int SPP_HB_ENABLE=1;
	public static final int SPP_HB_DISABLE=2;
	public static final int SPP_HB_DEMAND=4;
	public static final int SPP_HB_TIME_IS_ZERO=8;
	public static final int SPP_PMTUD_ENABLE=16;
	public static final int SPP_PMTUD_DISABLE=32;
	public static final int SPP_SACKDELAY_ENABLE=64;
	public static final int SPP_SACKDELAY_DISABLE=128;
	public static final int SPP_IPV6_FLOWLABEL=256;
	public static final int SPP_IPV4_TOS=512;

	/**Returns a string representation of this structure.
	 *@since 0.9.7
	 */
	public String toString() {
		return "sctp_paddrparams{"
		     + "spp_assoc_id=" + spp_assoc_id + ","
		     + "spp_address=" + spp_address + ","
		     + "spp_hbinterval=" + spp_hbinterval + ","
		     + "spp_pathmaxrxt=" + spp_pathmaxrxt + ","
		     + "spp_pathmtu=" + spp_pathmtu + ","
		     + "spp_sackdelay=" + spp_sackdelay + ","
		     + "spp_flags=" + spp_flags
		       + "("
		       + ((spp_flags&SPP_HB_ENABLE)!=0?"hb_enable,":"")
		       + ((spp_flags&SPP_HB_DISABLE)!=0?"hb_disable,":"")
		       + ((spp_flags&SPP_HB_DEMAND)!=0?"hb_demand,":"")
		       + ((spp_flags&SPP_HB_TIME_IS_ZERO)!=0?"hb_time_is_zero,":"")
		       + ((spp_flags&SPP_PMTUD_ENABLE)!=0?"pmtu_enable,":"")
		       + ((spp_flags&SPP_PMTUD_DISABLE)!=0?"pmtu_disable,":"")
		       + ((spp_flags&SPP_SACKDELAY_ENABLE)!=0?"sackdelay_enable,":"")
		       + ((spp_flags&SPP_SACKDELAY_DISABLE)!=0?"sackdelay_disable,":"")
		       + ((spp_flags&SPP_IPV6_FLOWLABEL)!=0?"ipv6_flowlabel,":"")
		       + ((spp_flags&SPP_IPV4_TOS)!=0?"ipv4_tos,":"")
		       + ")" + ","
		     + "spp_ipv6_flowlabel=" + spp_ipv6_flowlabel + ","
		     + "spp_ipv4_tos=" + spp_ipv4_tos + ","
		     + "}";
	}
}
