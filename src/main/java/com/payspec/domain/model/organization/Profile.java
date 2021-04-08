package com.payspec.domain.model.organization;

import com.payspec.domain.model.user.AbstractUser;
import com.payspec.domain.NamedEntity;
import com.payspec.domain.model.user.Role;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity(name = "Profile")
@Table(name = "profile")
public class Profile extends NamedEntity {

	@Column(name="base_url")
	protected String baseUrl;

	@ManyToMany(mappedBy = "profiles")
	protected Collection<AbstractUser> users = new HashSet<>();

	@ManyToMany(fetch=FetchType.EAGER,targetEntity = Role.class)
	@JoinTable(name = "profile_role",
			joinColumns = { @JoinColumn(name = "profle_id") },
			inverseJoinColumns = { @JoinColumn(name = "role_id") })
	  private Set<Role> roles = new HashSet<Role>();

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	public String getBaseUrl() {
		return baseUrl;
	}

	public void setBaseUrl(String baseUrl) {
		this.baseUrl = baseUrl;
	}

	public Collection<AbstractUser> getUsers() {
		return users;
	}

	public void setUsers(Collection<AbstractUser> users) {
		this.users = users;
	}

}