package com.airsofka.admin.infra.mainservice.controllers;

import com.airsofka.admin.application.admin.issuebooking.IssueBookingRequest;
import com.airsofka.admin.application.admin.issuebooking.IssueBookingUseCase;
import com.airsofka.admin.application.shared.AdminResponse;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/issue-booking")
public class IssueBookingController {
    private final IssueBookingUseCase useCase;

    public IssueBookingController(IssueBookingUseCase useCase) {
        this.useCase = useCase;
    }

    @PutMapping
    public Mono<AdminResponse> issueBooking(@RequestBody IssueBookingRequest request) {
        return useCase.execute(request);
    }

}
