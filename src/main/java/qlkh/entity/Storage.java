package qlkh.entity;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "storage")
@XmlAccessorType(XmlAccessType.FIELD)
public class Storage implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String name;
    private String unit;
    private int quantity;
    private int price;

    public Storage() {
    }

    public Storage(int id, String name, String unit, int quantity, int price) {
        super();
        this.id = id;
        this.name = name;
        this.unit = unit;
        this.quantity = quantity;
        this.price = price;
    }

//     public int getStt() {
//        return stt;
//    }
//
//    public void setStt(int stt) {
//        this.stt = stt;
//    }

    
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
