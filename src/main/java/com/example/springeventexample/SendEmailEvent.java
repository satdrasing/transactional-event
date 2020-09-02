package com.example.springeventexample;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SendEmailEvent {

    @Builder.Default
    private String to="to@mail.com";

    @Builder.Default
    private String from="from@mail.com";
}
