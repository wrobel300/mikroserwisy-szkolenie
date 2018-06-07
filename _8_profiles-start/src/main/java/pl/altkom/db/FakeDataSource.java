package pl.altkom.db;

public class FakeDataSource {

    private String url;
    private int port;

    public FakeDataSource(String url, int port) {
        this.url = url;
        this.port = port;
    }

    public String getUrl() {
        return url;
    }

    public int getPort() {
        return port;
    }
}
