public class Overloading {

    public static void main(String args[]) {
        Zoom zoomMeeting = new Zoom();
        zoomMeeting.connect();
        zoomMeeting.connect("https://zoommeeting/abc");
        zoomMeeting.connect(1234567, "xyzpassword");
    }

    static class Zoom{
        void connect() {
            System.out.println("Allowing meeting to all without password");
        }

        void connect(String link) {
            System.out.println("Allowing to enter with  zoom link");
        }

        void connect(long meetingId, String password) {
            System.out.println("Allowing to enter with meeting Id and password");
        }

    }
}
