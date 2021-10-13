package by.belohvostik.InnovationPak.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.sql.Timestamp;
import java.util.Objects;

public class GoodsModel {

    private final int id;
    private final Timestamp create_data;
    private final Timestamp update_data;
    private final int order_id;
    private final String name;
    private final int count;
    private final float price_per_item;
    private final float pack_amount;
    private final float nds_amount;
    private final float summ_amount;

    public GoodsModel(@JsonProperty("id") int id,
                      @JsonProperty("create_data") Timestamp create_data,
                      @JsonProperty("update_data") Timestamp update_data,
                      @JsonProperty("order_id") int order_id,
                      @JsonProperty("name") String name,
                      @JsonProperty("count") int count,
                      @JsonProperty("price_per_item") float price_per_item,
                      @JsonProperty("pack_amount") float pack_amount,
                      @JsonProperty("nds_amount") float nds_amount,
                      @JsonProperty("summ_amount") float summ_amount) {
        this.id = id;
        this.create_data = create_data;
        this.update_data = update_data;
        this.order_id = order_id;
        this.name = name;
        this.count = count;
        this.price_per_item = price_per_item;
        this.pack_amount = pack_amount;
        this.nds_amount = nds_amount;
        this.summ_amount = summ_amount;
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

    public int getOrder_id() {
        return order_id;
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }

    public float getPrice_per_item() {
        return price_per_item;
    }

    public float getPack_amount() {
        return pack_amount;
    }

    public float getNds_amount() {
        return nds_amount;
    }

    public float getSumm_amount() {
        return summ_amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GoodsModel)) return false;
        GoodsModel that = (GoodsModel) o;
        return id == that.id && order_id == that.order_id && count == that.count && Float.compare(that.price_per_item, price_per_item) == 0 && Float.compare(that.pack_amount, pack_amount) == 0 && Float.compare(that.nds_amount, nds_amount) == 0 && Float.compare(that.summ_amount, summ_amount) == 0 && Objects.equals(create_data, that.create_data) && Objects.equals(update_data, that.update_data) && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, create_data, update_data, order_id, name, count, price_per_item, pack_amount, nds_amount, summ_amount);
    }
}
