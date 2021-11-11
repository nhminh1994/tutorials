package com.baeldung.examples.olingo2.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "delivery_note_detail")
public class DeliveryNoteDetail {
	@Id
	@Column(name = "deliveryid")
    private String deliveryid;
	
	@Column(name = "binarydata")
	@Lob
    private String binarydata;
	
	@Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((deliveryid == null) ? 0 : deliveryid.hashCode());
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
        DeliveryNoteDetail other = (DeliveryNoteDetail) obj;
        if (deliveryid == null) {
            if (other.deliveryid != null)
                return false;
        } else if (!deliveryid.equals(other.deliveryid))
            return false;
        return true;
    }
    
	public String getDeliveryid() {
		return deliveryid;
	}

	public void setDeliveryid(String deliveryid) {
		this.deliveryid = deliveryid;
	}

	public String getBinarydata() {
		return binarydata;
	}

	public void setBinarydata(String binarydata) {
		this.binarydata = binarydata;
	}
}
