package by.belohvostik.InnovationPak.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.sql.Timestamp;
import java.util.Objects;

public class OrdersModel {

    private final int id;
    private final Timestamp create_data;
    private final Timestamp update_data;
    private final int order_number;
    private final String status;

    public OrdersModel(@JsonProperty("id") int id,
                       @JsonProperty("create_data") Timestamp create_data,
                       @JsonProperty("update_data") Timestamp update_data,
                       @JsonProperty("order_number") int order_number,
                       @JsonProperty("status") String status) {
        this.id = id;
        this.create_data = create_data;
        this.update_data = update_data;
        this.order_number = order_number;
        this.status = status;
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

    public int getOrder_number() {
        return order_number;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OrdersModel)) return false;
        OrdersModel that = (OrdersModel) o;
        return id == that.id && order_number == that.order_number && Objects.equals(create_data, that.create_data) && Objects.equals(update_data, that.update_data) && Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, create_data, update_data, order_number, status);
    }
}
