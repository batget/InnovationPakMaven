package by.belohvostik.InnovationPak.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.sql.Timestamp;
import java.util.Objects;

public class ContractSosModel {

    private final int id;
    private final Timestamp create_Data;
    private final Timestamp update_Data;
    private final String contact_number;
    private final int customer_id;
    private final Timestamp start_date;
    private final Timestamp end_date;

    public ContractSosModel(@JsonProperty("id") int id,
                            @JsonProperty("create_data") Timestamp create_Data,
                            @JsonProperty("update_data") Timestamp update_Data,
                            @JsonProperty("contact_number") String contact_number,
                            @JsonProperty("customer_id") int customer_id,
                            @JsonProperty("start_date") Timestamp start_date,
                            @JsonProperty("end_date") Timestamp end_date) {
        this.id = id;
        this.create_Data = create_Data;
        this.update_Data = update_Data;
        this.contact_number = contact_number;
        this.customer_id = customer_id;
        this.start_date = start_date;
        this.end_date = end_date;
    }

    public int getId() {
        return id;
    }

    public Timestamp getCreate_Data() {
        return create_Data;
    }

    public Timestamp getUpdate_Data() {
        return update_Data;
    }

    public String getContact_number() {
        return contact_number;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public Timestamp getStart_date() {
        return start_date;
    }

    public Timestamp getEnd_date() {
        return end_date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ContractSosModel)) return false;
        ContractSosModel that = (ContractSosModel) o;
        return id == that.id && customer_id == that.customer_id && Objects.equals(create_Data, that.create_Data) && Objects.equals(update_Data, that.update_Data) && Objects.equals(contact_number, that.contact_number) && Objects.equals(start_date, that.start_date) && Objects.equals(end_date, that.end_date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, create_Data, update_Data, contact_number, customer_id, start_date, end_date);
    }
}
