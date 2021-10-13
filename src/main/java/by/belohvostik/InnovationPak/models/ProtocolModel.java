package by.belohvostik.InnovationPak.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.sql.Timestamp;
import java.util.Objects;

public class ProtocolModel {

    private final int id;
    private final Timestamp create_data;
    private final Timestamp update_data;
    private final int contact_id;
    private final int order_id;

    public ProtocolModel(@JsonProperty("id") int id,
                         @JsonProperty("create_data") Timestamp create_data,
                         @JsonProperty("update_data") Timestamp update_data,
                         @JsonProperty("contact_id") int contact_id,
                         @JsonProperty("order_id") int order_id) {
        this.id = id;
        this.create_data = create_data;
        this.update_data = update_data;
        this.contact_id = contact_id;
        this.order_id = order_id;
    }

    public int getId() {
        return id;
    }

    public Timestamp getCreate_data() {
        return create_data;
    }

    public Timestamp getUpdate_data() {
        return update_data;
    }

    public int getContact_id() {
        return contact_id;
    }

    public int getOrder_id() {
        return order_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProtocolModel)) return false;
        ProtocolModel that = (ProtocolModel) o;
        return id == that.id && contact_id == that.contact_id && order_id == that.order_id && Objects.equals(create_data, that.create_data) && Objects.equals(update_data, that.update_data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, create_data, update_data, contact_id, order_id);
    }
}
