package com.poolfund.participants.service;

import com.poolfund.participants.dao.ParticipantRepository;
import com.poolfund.participants.model.Participant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParticipantService {

    @Autowired
    ParticipantRepository participantRepository;

    public Participant createParticipant(Participant participant) {
       return participantRepository.insert(participant);
    }

}
