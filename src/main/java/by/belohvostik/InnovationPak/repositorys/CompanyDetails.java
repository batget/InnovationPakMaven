package by.belohvostik.InnovationPak.repositorys;

import by.belohvostik.InnovationPak.models.CompanyDetailsModel;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CompanyDetails {

    Mono<Void> create(CompanyDetailsModel companyDetailsModel);

    Flux<CompanyDetailsModel> allRead();
}
