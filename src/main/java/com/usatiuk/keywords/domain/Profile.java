package com.usatiuk.keywords.domain;

import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.Indexed;
import org.springframework.data.neo4j.annotation.NodeEntity;

@NodeEntity
public class Profile {
	@GraphId
	Long id;

	@Indexed(unique = true)
	public String screenName;

	public Profile() {
	}

	public Profile(String screenName) {
		this.screenName = screenName;
	}
}
