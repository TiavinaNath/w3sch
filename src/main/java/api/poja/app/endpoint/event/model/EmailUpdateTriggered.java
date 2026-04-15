package api.poja.app.endpoint.event.model;

import static api.poja.app.endpoint.event.EventStack.EVENT_STACK_3;

import api.poja.app.endpoint.event.EventStack;
import java.time.Duration;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@AllArgsConstructor
@Builder(toBuilder = true)
@Data
@EqualsAndHashCode(callSuper = false)
@ToString
public class EmailUpdateTriggered extends PojaEvent {
  @Override
  public Duration maxConsumerDuration() {
    return Duration.ofSeconds(20);
  }

  @Override
  public Duration maxConsumerBackoffBetweenRetries() {
    return Duration.ofMinutes(1);
  }

  @Override
  public EventStack getEventStack() {
    return EVENT_STACK_3;
  }
}
