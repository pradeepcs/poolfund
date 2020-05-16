package com.poolfund.participants.controller;

import com.poolfund.participants.model.Participant;
import com.poolfund.participants.service.ParticipantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/participant")
public class ParticipantController {

    @Autowired
    ParticipantService participantService;


}
