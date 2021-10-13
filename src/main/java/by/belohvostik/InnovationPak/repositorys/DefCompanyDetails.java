package by.belohvostik.InnovationPak.repositorys;

import by.belohvostik.InnovationPak.models.CompanyDetailsModel;

import org.jooq.DSLContext;
import org.jooq.exception.DataAccessException;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import static by.belohvostik.InnovationPak.models.tables.CompanyDetails.COMPANY_DETAILS;


public class DefCompanyDetails implements CompanyDetails{

    private final DSLContext dslContext;

    public DefCompanyDetails(DSLContext dslContext) {
        this.dslContext = dslContext;
    }

    @Override
    public Mono<Void> create(CompanyDetailsModel companyDetailsModel) {
        return Mono.fromSupplier(() -> dslContext
                .insertInto(COMPANY_DETAILS, COMPANY_DETAILS.NAME, COMPANY_DETAILS.ADDRESS, COMPANY_DETAILS.ACCOUNT, COMPANY_DETAILS.BANK_NAME,
                        COMPANY_DETAILS.BANK_BIK)
                .values(companyDetailsModel.getName(), companyDetailsModel.getAddress(),
                        companyDetailsModel.getAccount(), companyDetailsModel.getBank_name(), companyDetailsModel.getBank_bik())
                .returning()
                .fetchOptional()
                .orElseThrow(() -> new DataAccessException("Error updating entity: " + companyDetailsModel.getName()))
                .into(Void.class));
    }

    @Override
    public Flux<CompanyDetailsModel> allRead() {
        return Flux.fromIterable(dslContext
                .selectFrom(COMPANY_DETAILS)
                .fetchInto(CompanyDetailsModel.class));
    }
}
