package ch3.dataBean;

/**
 * Created by bkv on 09.11.2014.
 */
public class RequestData {
    protected String hobby;
    protected String aversion;

    public RequestData() {
    }

    public boolean isValidHobby() {
        return hobby != null && !hobby.trim().equals("");
    }

    public String getHobby() {
        if (isValidHobby()) {
            return hobby;
        }
        return "No Hobby";
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getAversion() {
        return aversion;
    }

    public void setAversion(String aversion) {
        this.aversion = aversion;
    }
}
