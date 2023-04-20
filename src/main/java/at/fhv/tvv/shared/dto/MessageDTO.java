package at.fhv.tvv.shared.dto;

import java.io.Serializable;
import java.util.Objects;

public class MessageDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private String topicName;
    private String employeeUsername;
    private String title;
    private String content;

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private MessageDTO instance;

        public Builder() {
            this.instance = new MessageDTO();
        }
        public MessageDTO build() {
            Objects.requireNonNull(this.instance.topicName, "Message requires a topic");
            Objects.requireNonNull(this.instance.title, "Message requires a title");
            return this.instance;
        }
        public Builder withTopicName(String name) {
            this.instance.topicName = name;
            return this;
        }
        public Builder withTitle(String title) {
            this.instance.title = title;
            return this;
        }
        public Builder withEmployeeUsername(String username) {
            this.instance.employeeUsername = username;
            return this;
        }
        public Builder withContent(String content) {
            this.instance.content = content;
            return this;
        }
    }

    private MessageDTO() {
    }

    public String getTopicName() {
        return topicName;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getEmployeeUsername() {
        return employeeUsername;
    }
}

