package ui.respond;

public interface Lead {
    String getFirstName();

    String getLastName();

    String getPhoneNumber();

    String getEmailAddress();

    String getZipCode();

    String getMessage();

    String getReplyMessage();

    void setReplyMessage(String text);

    void setContacted(boolean b);
}
