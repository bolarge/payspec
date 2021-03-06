package com.payspec.domain.model.organization;

import javax.persistence.*;

@Entity(name = "AbstractOrganization")
@Table(name = "organizations")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "class")
public class AbstractOrganization extends NamedEntity {

    @Column(name="name")
    protected String name;

    @Column(name = "organization_id")
    protected String organizationId;

    @Column(name="status")
    protected boolean status = false;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }
}
