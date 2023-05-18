package cc.jml1024.spring.boot.autoconfigure;

public class SingleKaptchaProperties extends BaseProperties{
    private Session session = new Session();
    private String path;

    public static class Session {
        private String key;
        private String date;

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }
    }

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
