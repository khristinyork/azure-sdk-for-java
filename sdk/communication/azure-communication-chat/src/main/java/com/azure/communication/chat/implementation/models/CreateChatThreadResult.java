// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.chat.implementation.models;

import com.azure.communication.chat.models.CommunicationError;
import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Result of the create chat thread operation. */
@Fluent
public final class CreateChatThreadResult {
    /*
     * Chat thread.
     */
    @JsonProperty(value = "chatThread")
    private ChatThread chatThread;

    /*
     * The participants that failed to be added to the chat thread.
     */
    @JsonProperty(value = "invalidParticipants", access = JsonProperty.Access.WRITE_ONLY)
    private List<CommunicationError> invalidParticipants;

    /**
     * Get the chatThread property: Chat thread.
     *
     * @return the chatThread value.
     */
    public ChatThread getChatThread() {
        return this.chatThread;
    }

    /**
     * Set the chatThread property: Chat thread.
     *
     * @param chatThread the chatThread value to set.
     * @return the CreateChatThreadResult object itself.
     */
    public CreateChatThreadResult setChatThread(ChatThread chatThread) {
        this.chatThread = chatThread;
        return this;
    }

    /**
     * Get the invalidParticipants property: The participants that failed to be added to the chat thread.
     *
     * @return the invalidParticipants value.
     */
    public List<CommunicationError> getInvalidParticipants() {
        return this.invalidParticipants;
    }
}
