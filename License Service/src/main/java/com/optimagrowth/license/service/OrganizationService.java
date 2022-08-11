package com.optimagrowth.license.service;

import com.optimagrowth.license.model.Organization;
import com.optimagrowth.license.service.client.OrganizationRestTemplateClient;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrganizationService {

    @Autowired
    OrganizationRestTemplateClient organizationRestTemplateClient;

    @CircuitBreaker(name="organizationService")
    public Organization getOrganization(String organizationId) {
        return organizationRestTemplateClient.getOrganization(organizationId);
    }
}
