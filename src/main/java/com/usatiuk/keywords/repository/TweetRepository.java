package com.usatiuk.keywords.repository;

import com.usatiuk.keywords.domain.Keyword;
import com.usatiuk.keywords.domain.Tweet;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "tweets", path = "tweets")
public interface TweetRepository extends GraphRepository<Tweet>, RelationshipOperationsRepository<Tweet> {
}
