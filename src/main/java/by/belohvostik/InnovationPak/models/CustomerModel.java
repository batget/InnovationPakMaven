package by.belohvostik.InnovationPak.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class CustomerModel {

    private final int id;
    private final String name;
    private final String addres;
    private final String unp;
    private final String okpo;

    public CustomerModel(@JsonProperty("id") int id,
                         @JsonProperty("name") String name,
                         @JsonProperty("addres") String addres,
                         @JsonProperty("unp") String unp,
                         @JsonProperty("okpo") String okpo) {
        this.id = id;
        this.name = name;
        this.addres = addres;
        this.unp = unp;
        this.okpo = okpo;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddres() {
        return addres;
    }

    public String getUnp() {
        return unp;
    }

    public String getOkpo() {
        return okpo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CustomerModel)) return false;
        CustomerModel that = (CustomerModel) o;
        return id == that.id && Objects.equals(name, that.name) && Objects.equals(addres, that.addres) && Objects.equals(unp, that.unp) && Objects.equals(okpo, that.okpo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, addres, unp, okpo);
    }
}
