package learning.vladdubceac.observer;

public class MyTopicSubscriber implements Observer {
    private String name;

    // not required, could just pass subject state to update method
    private Subject topic;

    public MyTopicSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        // this method could take data of subjects state that was changed, don't need to ask topic for it
        String msg = (String) topic.getUpdate(this);
        if (msg == null) {
            System.out.println(name + " :: No New Message");
        } else {
            System.out.println(name + " :: Consuming Message :: " + msg);
        }
    }

    @Override
    public void setSubject(Subject sub) {
// not required, added so Observer can ask Subject for State
        this.topic = sub;
    }
}
