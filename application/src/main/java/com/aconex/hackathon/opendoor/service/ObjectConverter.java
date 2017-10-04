package com.aconex.hackathon.opendoor.service;

import com.aconex.hackathon.opendoor.model.Feedback;
import com.aconex.hackathon.opendoor.model.Location;
import com.aconex.hackathon.opendoor.representation.FeedbackDto;

public final class ObjectConverter {
    public static Feedback domain(FeedbackDto feedbackDto) {
        return new Feedback(feedbackDto.getMessage(), feedbackDto.getBliss(), new Location(feedbackDto.getLocation()), feedbackDto.getRespondent());
    }

    public  static FeedbackDto dto(Feedback feedback) {
      return new FeedbackDto(feedback.getMessage(), feedback.getId(), feedback.getBliss(), feedback.getRespondent(), feedback.getCreatedAt(), feedback.getLocation().getName());
    }
}
