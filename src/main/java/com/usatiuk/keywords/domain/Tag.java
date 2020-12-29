package com.usatiuk.keywords.domain;

import org.springframework.data.neo4j.annotation.EndNode;
import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.RelationshipEntity;
import org.springframework.data.neo4j.annotation.StartNode;

@RelationshipEntity(type = "Tag")
public class Tag {
	@GraphId
	Long id;
	@StartNode
	Tweet tweet;
	@EndNode
	Keyword keyword;
}