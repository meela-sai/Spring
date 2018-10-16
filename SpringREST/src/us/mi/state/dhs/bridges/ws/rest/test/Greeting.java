package us.mi.state.dhs.bridges.ws.rest.test;

import org.springframework.stereotype.Component;

@Component("greet")
public class Greeting {

    private  long id;
    private  String content;

    public void setId(long id) {
		this.id = id;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}