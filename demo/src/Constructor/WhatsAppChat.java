package Constructor;

import java.time.LocalDateTime;

public class WhatsAppChat {
 
    private String sender;
    private String message;
    private LocalDateTime timestamp;

    public WhatsAppChat(String sender, String message, LocalDateTime timestamp) {
        this.sender = sender;
        this.message = message;
        this.timestamp = timestamp;
    }

    public String getSender() {
        return sender;
    }

    public String getMessage() {
        return message;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void displayChat() {
        System.out.println("[" + timestamp + "] " + sender + ": " + message);
    }
    public static void main(String[] args) {
        WhatsAppChat chat1 = new WhatsAppChat("John Doe", "Hello, how are you?", LocalDateTime.now());
        chat1.displayChat();
    }
}


