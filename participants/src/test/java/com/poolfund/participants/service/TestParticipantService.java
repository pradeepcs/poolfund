package com.poolfund.participants.service;

import com.poolfund.participants.dao.ParticipantRepository;
import com.poolfund.participants.model.Participant;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Set;

@RunWith(SpringRunner.class)
public class TestParticipantService {

    @Autowired
    ParticipantRepository participantRepository;


    @Test
    public void testCreateParticipant() {
        Participant participant = new Participant();
        participant.setId("1111111111111111111111111");
        participant.setName("csp11111111111111");
        //participant.getInfoDomain(Set.of({""}));
        participantRepository.insert(participant);
    }
}
