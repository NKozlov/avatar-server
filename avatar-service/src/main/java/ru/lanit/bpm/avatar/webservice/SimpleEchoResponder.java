/*
 * Copyright (c) 2008-2015
 * LANIT
 * All rights reserved.
 *
 * This product and related documentation are protected by copyright and
 * distributed under licenses restricting its use, copying, distribution, and
 * decompilation. No part of this product or related documentation may be
 * reproduced in any form by any means without prior written authorization of
 * LANIT and its licensors, if any.
 *
 * $Id$
 */
package ru.lanit.bpm.avatar.webservice;

import org.springframework.context.annotation.Bean;
import org.springframework.integration.xml.source.DomSourceFactory;
import org.springframework.stereotype.Component;
import org.springframework.integration.annotation.ServiceActivator;

import javax.xml.transform.Source;
import javax.xml.transform.dom.DOMSource;

public class SimpleEchoResponder {

    public Source issueResponseFor(DOMSource request) {
        return new DomSourceFactory().createSource(
                "<echoResponse xmlns=\"http://www.springframework.org/spring-ws/samples/echo\">" +
                        request.getNode().getTextContent() + "</echoResponse>");
    }
}