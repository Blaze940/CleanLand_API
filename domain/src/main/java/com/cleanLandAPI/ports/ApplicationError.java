package com.cleanLandAPI.ports;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;

@JsonAutoDetect(fieldVisibility = ANY)
public record ApplicationError(String context, String message, Object value, Throwable cause) {}
