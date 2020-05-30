package com.poolfund.participants.model;

import com.poolfund.foundation.model.Foundation;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Set;

@Document
public class Participant extends Foundation {

    protected Set<String> types;



}
