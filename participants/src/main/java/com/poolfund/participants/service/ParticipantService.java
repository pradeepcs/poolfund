package com.poolfund.participants.service;

import com.poolfund.participants.dao.ParticipantRepository;
import com.poolfund.participants.model.Participant;
import org.springframework.beans.factory.annotation.Autowired;

public class ParticipantService {

    @Autowired
    ParticipantRepository participantRepository;

    public void createParticipant(Participant participant) {
        participantRepository.insert(participant);
    }

}
