package com.usatiuk.keywords.repository;

import com.usatiuk.keywords.domain.Profile;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "profiles", path = "profiles")
public interface ProfileRepository extends GraphRepository<Profile>, RelationshipOperationsRepository<Profile> {
	Profile findByScreenName(String screenName);
}
