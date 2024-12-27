package com.scm.helpers;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
@AllArgsConstructor
public class Message {

    private String content;
    @Builder.Default
    private MessageType type=MessageType.blue;


}
