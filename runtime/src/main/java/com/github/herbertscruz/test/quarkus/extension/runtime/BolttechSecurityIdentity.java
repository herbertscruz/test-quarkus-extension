package com.github.herbertscruz.test.quarkus.extension.runtime;

import java.security.Permission;
import java.security.Principal;
import java.util.Map;
import java.util.Set;

import javax.annotation.Priority;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Alternative;
import javax.inject.Inject;

import io.quarkus.security.credential.Credential;
import io.quarkus.security.identity.SecurityIdentity;
import io.quarkus.security.runtime.SecurityIdentityAssociation;
import io.smallrye.mutiny.Uni;

@Alternative
@Priority(2000)
@ApplicationScoped
public class BolttechSecurityIdentity implements SecurityIdentity {

    @Inject
    SecurityIdentityAssociation securityIdentityAssociation;


    @Override
    public Principal getPrincipal() {
        System.out.println("---------------------------------");
        System.out.println("BolttechSecurityIdentity.getPrincipal() ---> " + securityIdentityAssociation.getIdentity().getPrincipal());
        System.out.println("---------------------------------");
        return securityIdentityAssociation.getIdentity().getPrincipal();
    }


    @Override
    public boolean isAnonymous() {
        return securityIdentityAssociation.getIdentity().isAnonymous();
    }


    @Override
    public Set<String> getRoles() {
        return securityIdentityAssociation.getIdentity().getRoles();
    }


    @Override
    public boolean hasRole(String role) {
        return securityIdentityAssociation.getIdentity().hasRole(role);
    }


    @Override
    public <T extends Credential> T getCredential(Class<T> credentialType) {
        return securityIdentityAssociation.getIdentity().getCredential(credentialType);
    }


    @Override
    public Set<Credential> getCredentials() {
        return securityIdentityAssociation.getIdentity().getCredentials();
    }


    @Override
    public <T> T getAttribute(String name) {
        return securityIdentityAssociation.getIdentity().getAttribute(name);
    }


    @Override
    public Map<String, Object> getAttributes() {
        return securityIdentityAssociation.getIdentity().getAttributes();
    }


    @Override
    public Uni<Boolean> checkPermission(Permission permission) {
        return securityIdentityAssociation.getIdentity().checkPermission(permission);
    }
}
