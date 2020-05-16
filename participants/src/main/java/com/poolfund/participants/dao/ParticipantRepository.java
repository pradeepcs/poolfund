package com.poolfund.participants.dao;

import com.poolfund.participants.model.Participant;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ParticipantRepository extends MongoRepository<Participant, String> {
}
