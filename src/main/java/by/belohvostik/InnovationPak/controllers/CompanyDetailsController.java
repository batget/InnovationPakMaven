package by.belohvostik.InnovationPak.controllers;

import by.belohvostik.InnovationPak.models.CompanyDetailsModel;
import by.belohvostik.InnovationPak.repositorys.CompanyDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class CompanyDetailsController {

    private final CompanyDetails companyDetails;

    public CompanyDetailsController(CompanyDetails companyDetails) {
        this.companyDetails = companyDetails;
    }

    @PostMapping("/create")
    public Mono<Void> create(@RequestBody CompanyDetailsModel companyDetailsModel) {
        return companyDetails.create(companyDetailsModel);
    }

    @GetMapping("/readAll")
    public Flux<CompanyDetailsModel> readAll() {
        return companyDetails.allRead();
    }
}
