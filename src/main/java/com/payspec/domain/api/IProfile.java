package com.payspec.domain.api;

public interface IProfile {

	String getName();
	void setName(String name);

	String getDescription();
	void setDescription(String description);

	String getBaseUrl();
	void setBaseUrl(String baseUrl);

	boolean isStatus();
	void setStatus(boolean status);

}
