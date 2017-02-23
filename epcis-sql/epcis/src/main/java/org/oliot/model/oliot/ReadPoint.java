//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.09.15 at 01:39:48 PM KST 
//


package org.oliot.model.oliot;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;


@Entity
public class ReadPoint {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    //@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="readpoint_seq ")
	//@SequenceGenerator(name="readpoint_seq ", sequenceName="readpoint_seq ", allocationSize=1)
    private int id;
    @XmlElement(required = true)
    protected String sId;
    
    @OneToOne
	@JoinColumn(name="readPointExtension_id")
    protected ReadPointExtension extension;
    
    @Transient
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    
    
    
    public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getsId() {
		return sId;
	}




	public void setsId(String sId) {
		this.sId = sId;
	}




	public ReadPointExtension getExtension() {
		return extension;
	}




	public void setExtension(ReadPointExtension extension) {
		this.extension = extension;
	}




	public void setAny(List<Object> any) {
		this.any = any;
	}




	public ReadPoint(String sId, ReadPointExtension extension) {
		super();
		this.sId = sId;
		this.extension = extension;
	}




	public ReadPoint() {
		super();
	}




	public ReadPoint(String sId) {
		super();
		this.sId = sId;
	}




	public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

}
