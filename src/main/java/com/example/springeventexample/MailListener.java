package com.example.springeventexample;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionPhase;
import org.springframework.transaction.event.TransactionalEventListener;

@Component
@RequiredArgsConstructor
@Log4j2
public class MailListener {

    @TransactionalEventListener(phase= TransactionPhase.AFTER_COMMIT)
    void sendmail1(SendEmailEvent sendEmailEvent) {
        log.info("send mail... {} ", sendEmailEvent.getTo());
    }

}


