package com.baeldung.examples.olingo2.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "shipping_slip")
public class ShippingSlip {
	@Id
	@Column(name = "slipkey")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String slipkey;

    @Column(name = "account")
    private String account;
    
    @Column(name = "orderkey")
    private String orderkey;
    
    @Column(name = "ecordernum")
    private String ecordernum;

	public String getSlipkey() {
		return slipkey;
	}

	public void setSlipkey(String slipkey) {
		this.slipkey = slipkey;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getOrderkey() {
		return orderkey;
	}

	public void setOrderkey(String orderkey) {
		this.orderkey = orderkey;
	}

	public String getEcordernum() {
		return ecordernum;
	}

	public void setEcordernum(String ecordernum) {
		this.ecordernum = ecordernum;
	}
	
	@Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((slipkey == null) ? 0 : slipkey.hashCode());
        result = prime * result + ((account == null) ? 0 : account.hashCode());
        result = prime * result + ((orderkey == null) ? 0 : orderkey.hashCode());
        result = prime * result + ((ecordernum == null) ? 0 : ecordernum.hashCode());
        return result;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ShippingSlip other = (ShippingSlip) obj;
        if (slipkey == null) {
            if (other.slipkey != null)
                return false;
        } else if (!slipkey.equals(other.slipkey))
            return false;
        return true;
    }
}
