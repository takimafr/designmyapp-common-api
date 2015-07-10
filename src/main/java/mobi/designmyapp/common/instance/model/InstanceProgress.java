package mobi.designmyapp.common.instance.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Anas Hammani on 09/07/15.
 */
public class InstanceProgress {
  private String instanceUuid;

  private int percentage;

  private List<String> messages;

  /**
   * Default constructor.
   */
  public InstanceProgress() {

  }

  public String getInstanceUuid() {
    return instanceUuid;
  }

  public void setInstanceUuid(String instanceUuid) {
    this.instanceUuid = instanceUuid;
  }

  public int getPercentage() {
    return percentage;
  }

  public void setPercentage(int percentage) {
    this.percentage = percentage;
  }


  public List<String> getMessages() {
    return messages;
  }


  public void setMessages(List<String> messages) {
    this.messages = messages;
  }

  /**
   * Add a message to message list.
   *
   * @param message the message to add.
   */
  public void addMessage(String message) {
    if (messages == null) {
      messages = new ArrayList<>();
    }
    this.messages.add(message);
  }

  @Override
  public String toString() {
    return "InstanceProgress{" +
        "instanceUuid='" + instanceUuid + '\'' +
        ", percentage=" + percentage +
        ", messages=" + messages +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    InstanceProgress progress = (InstanceProgress) o;

    return !(instanceUuid != null ? !instanceUuid.equals(progress.instanceUuid) : progress.instanceUuid != null);

  }

  @Override
  public int hashCode() {
    return instanceUuid != null ? instanceUuid.hashCode() : 0;
  }
}
