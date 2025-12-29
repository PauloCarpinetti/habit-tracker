package paulocarpinetti.com.github.habit_tracker.exceptions.handler;

import java.util.Date;

public record ExceptionResponse(Date timestamp, String message, String details) {}
