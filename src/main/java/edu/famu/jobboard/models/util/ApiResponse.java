package edu.famu.jobboard.models.util;

public record ApiResponse(boolean success, String message, Object data, Object error) {
}
