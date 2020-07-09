package com.hcl.dna.transformer;

import javax.enterprise.context.ApplicationScoped;

import org.eclipse.microprofile.reactive.messaging.Incoming;
import org.eclipse.microprofile.reactive.messaging.Outgoing;

import io.smallrye.reactive.messaging.annotations.Broadcast;

@ApplicationScoped
public class DataTransformer {

    @Incoming("data-source-topic")                                 
    @Outgoing("data-target-topic")                         
    @Broadcast                                          
    public String transform(String sourceDocument) {
    	String targetDocument = "Attempted : " + sourceDocument;
        return targetDocument;
    }

}
