class TrainerSession {
    int sessionId;
    String trainerName;
    String topic;
    int duration;

    TrainerSession(int sessionId, String trainerName,
                   String topic, int duration) {
        this.sessionId = sessionId;
        this.trainerName = trainerName;
        this.topic = topic;
        this.duration = duration;
    }

    TrainerSession(int sessionId, String trainerName,
                   String topic) {
        this(sessionId, trainerName, topic, 60);
    }

    void display() {
        System.out.println("\nTRAINER SESSION");
        System.out.println("Session ID : " + sessionId);
        System.out.println("Trainer    : " + trainerName);
        System.out.println("Topic      : " + topic);
        System.out.println("Duration   : " + duration + " minutes");
    }
}

public class TrainerSessionPlanner {
    public static void main(String[] args) {

        TrainerSession s1 = new TrainerSession(101, "Rahul", "Java");
        TrainerSession s2 = new TrainerSession(102, "Amit", "Python", 90);

        s1.display();
        s2.display();
    }
}