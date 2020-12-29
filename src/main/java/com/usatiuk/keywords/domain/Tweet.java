package com.usatiuk.keywords.domain;

import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.NodeEntity;

import java.util.Date;

@NodeEntity
public class Tweet {
	@GraphId
	Long id;

	public String text;
	public Date createdAt = new Date();
	public String languageCode;

	public Tweet() {
	}

	public Tweet(String text, Date createdAt, String languageCode) {
		this.text = text;
		this.createdAt = createdAt;
		this.languageCode = languageCode;
	}
}
