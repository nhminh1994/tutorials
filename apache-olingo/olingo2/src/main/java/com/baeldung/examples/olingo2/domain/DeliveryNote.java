package com.baeldung.examples.olingo2.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "delivery_note")
public class DeliveryNote {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
    private String id;
	
	@Column(name = "deliveryid")
    private String deliveryid;
	
	@Column(name = "slipkey")
    private String slipkey;
    
	@Temporal(TemporalType.TIMESTAMP)
    @Column(name = "createddate")
    private Date createddate;
	
	@Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((slipkey == null) ? 0 : slipkey.hashCode());
        result = prime * result + ((deliveryid == null) ? 0 : deliveryid.hashCode());
        result = prime * result + ((createddate == null) ? 0 : createddate.hashCode());
        return result;
    }

    public String getDeliveryid() {
		return deliveryid;
	}

	public void setDeliveryid(String deliveryid) {
		this.deliveryid = deliveryid;
	}

	public String getSlipkey() {
		return slipkey;
	}

	public void setSlipkey(String slipkey) {
		this.slipkey = slipkey;
	}

	public Date getCreateddate() {
		return createddate;
	}

	public void setCreateddate(Date createddate) {
		this.createddate = createddate;
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
        DeliveryNote other = (DeliveryNote) obj;
        if (deliveryid == null) {
            if (other.deliveryid != null)
                return false;
        } else if (!deliveryid.equals(other.deliveryid))
            return false;
        return true;
    }
    
    public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
