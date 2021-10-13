package by.belohvostik.InnovationPak.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class CompanyDetailsModel {

    private final String name;
    private final String address;
    private final String account;
    private final String bank_name;
    private final String bank_bik;

    public CompanyDetailsModel(@JsonProperty("name") String name,
                               @JsonProperty("address") String address,
                               @JsonProperty("account") String account,
                               @JsonProperty("bank_name") String bank_name,
                               @JsonProperty("bank_bik") String bank_bik)
    {
        this.name = name;
        this.address = address;
        this.account = account;
        this.bank_name = bank_name;
        this.bank_bik = bank_bik;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getAccount() {
        return account;
    }

    public String getBank_name() {
        return bank_name;
    }

    public String getBank_bik() {
        return bank_bik;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CompanyDetailsModel)) return false;
        CompanyDetailsModel that = (CompanyDetailsModel) o;
        return Objects.equals(name, that.name) && Objects.equals(address, that.address) && Objects.equals(account, that.account) && Objects.equals(bank_name, that.bank_name) && Objects.equals(bank_bik, that.bank_bik);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address, account, bank_name, bank_bik);
    }
}
