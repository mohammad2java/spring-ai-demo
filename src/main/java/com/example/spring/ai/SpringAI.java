package com.example.spring.ai;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
public class SpringAI {

private final ChatClient chatClient;

public SpringAI(ChatClient.Builder builder) {
this.chatClient = builder.build();
}

public String tellMeAJoke() {
return chatClient.prompt().user("Tell me a joke in hindi").call().content();
}

}