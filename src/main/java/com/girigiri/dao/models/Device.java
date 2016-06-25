package com.girigiri.dao.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by JianGuo on 6/24/16.
 * POJO for to-do repair device
 */
@Data
@Entity
@Table
public class Device {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    //TODO: limit the type to 1, 2, 3, 4, 5
    @NotNull
    @Min(1)
    @Max(5)
    private int type;

    private String brand;

    private String number;

    private String serial;

    private String components;

    @NotNull
    private String error;

    //TODO: limit the type to 1, 2
    @NotNull
    @Min(1)
    @Max(2)
    private int errorType;

    private String appearance;

    private String pwd;

    private String data;

    private String HDD;

    private String memory;

    private String PCoutside;

    private String adapter;

    private String battery;

    private String CDoutside;

    private String other;


    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created", nullable = false)
    private Date created;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated", nullable = false)
    private Date updated;

    @Version
    @JsonIgnore
    private Long version;





    @PrePersist
    protected void onCreate() {
        updated = created = new Date();
    }

    @PreUpdate
    protected void onUpdate() {
        updated = new Date();
    }


    public Device(int type, String brand, String number, String serial, String components, String error, int errorType, String appearance, String pwd, String data, String HDD, String memory, String PCoutside, String adapter, String battery, String CDoutside, String other) {
        this.type = type;
        this.brand = brand;
        this.number = number;
        this.serial = serial;
        this.components = components;
        this.error = error;
        this.errorType = errorType;
        this.appearance = appearance;
        this.pwd = pwd;
        this.data = data;
        this.HDD = HDD;
        this.memory = memory;
        this.PCoutside = PCoutside;
        this.adapter = adapter;
        this.battery = battery;
        this.CDoutside = CDoutside;
        this.other = other;
    }

    public Device(int type, String error, int errorType) {
        this(type, null, null, null, null, error, errorType, null, null, null, null, null, null, null, null, null, null);
    }


    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getComponents() {
        return components;
    }

    public void setComponents(String components) {
        this.components = components;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public int getErrorType() {
        return errorType;
    }

    public void setErrorType(int errorType) {
        this.errorType = errorType;
    }

    public String getAppearance() {
        return appearance;
    }

    public void setAppearance(String appearance) {
        this.appearance = appearance;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHDD() {
        return HDD;
    }

    public void setHDD(String HDD) {
        this.HDD = HDD;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getPCoutside() {
        return PCoutside;
    }

    public void setPCoutside(String PCoutside) {
        this.PCoutside = PCoutside;
    }

    public String getAdapter() {
        return adapter;
    }

    public void setAdapter(String adapter) {
        this.adapter = adapter;
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    public String getCDoutside() {
        return CDoutside;
    }

    public void setCDoutside(String CDoutside) {
        this.CDoutside = CDoutside;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Device{" +
                "id=" + id +
                ", type=" + type +
                ", brand='" + brand + '\'' +
                ", number='" + number + '\'' +
                ", serial='" + serial + '\'' +
                ", components='" + components + '\'' +
                ", error='" + error + '\'' +
                ", errorType=" + errorType +
                ", appearance='" + appearance + '\'' +
                ", pwd='" + pwd + '\'' +
                ", data='" + data + '\'' +
                ", HDD='" + HDD + '\'' +
                ", memory='" + memory + '\'' +
                ", PCoutside='" + PCoutside + '\'' +
                ", adapter='" + adapter + '\'' +
                ", battery='" + battery + '\'' +
                ", CDoutside='" + CDoutside + '\'' +
                ", other='" + other + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Device that = (Device) o;

        if (type != that.type) return false;
        if (errorType != that.errorType) return false;
        if (!id.equals(that.id)) return false;
        if (brand != null ? !brand.equals(that.brand) : that.brand != null) return false;
        if (number != null ? !number.equals(that.number) : that.number != null) return false;
        if (serial != null ? !serial.equals(that.serial) : that.serial != null) return false;
        if (components != null ? !components.equals(that.components) : that.components != null) return false;
        if (!error.equals(that.error)) return false;
        if (appearance != null ? !appearance.equals(that.appearance) : that.appearance != null) return false;
        if (pwd != null ? !pwd.equals(that.pwd) : that.pwd != null) return false;
        if (data != null ? !data.equals(that.data) : that.data != null) return false;
        if (HDD != null ? !HDD.equals(that.HDD) : that.HDD != null) return false;
        if (memory != null ? !memory.equals(that.memory) : that.memory != null) return false;
        if (PCoutside != null ? !PCoutside.equals(that.PCoutside) : that.PCoutside != null) return false;
        if (adapter != null ? !adapter.equals(that.adapter) : that.adapter != null) return false;
        if (battery != null ? !battery.equals(that.battery) : that.battery != null) return false;
        if (CDoutside != null ? !CDoutside.equals(that.CDoutside) : that.CDoutside != null) return false;
        return other != null ? other.equals(that.other) : that.other == null;

    }

    @Override
    public int hashCode() {
        int result = 0;
        result = 31 * result + type;
        result = 31 * result + (brand != null ? brand.hashCode() : 0);
        result = 31 * result + (number != null ? number.hashCode() : 0);
        result = 31 * result + (serial != null ? serial.hashCode() : 0);
        result = 31 * result + (components != null ? components.hashCode() : 0);
        result = 31 * result + error.hashCode();
        result = 31 * result + errorType;
        result = 31 * result + (appearance != null ? appearance.hashCode() : 0);
        result = 31 * result + (pwd != null ? pwd.hashCode() : 0);
        result = 31 * result + (data != null ? data.hashCode() : 0);
        result = 31 * result + (HDD != null ? HDD.hashCode() : 0);
        result = 31 * result + (memory != null ? memory.hashCode() : 0);
        result = 31 * result + (PCoutside != null ? PCoutside.hashCode() : 0);
        result = 31 * result + (adapter != null ? adapter.hashCode() : 0);
        result = 31 * result + (battery != null ? battery.hashCode() : 0);
        result = 31 * result + (CDoutside != null ? CDoutside.hashCode() : 0);
        result = 31 * result + (other != null ? other.hashCode() : 0);
        return result;
    }
}