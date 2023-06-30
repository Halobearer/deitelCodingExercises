package africa.semicolon.myEmailApp.dtos.responses;

public class FindUserResponse {

    private String userName;
    private String fullName;
    private int userId;
    private String timeReceived;
    private String dateRegistered;
    private String dateOfBirth;


    public String getDateRegistered() {
        return dateRegistered;
    }

    public void setDateRegistered(String dateRegistered) {
        this.dateRegistered = dateRegistered;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getTimeReceived() {
        return timeReceived;
    }

    public void setTimeReceived(String dateRegistered) {
        this.timeReceived = dateRegistered;
    }

    @Override
    public String toString() {
        return "FindUserResponse{" +
                "userName='" + userName + '\'' +
                ", fullName='" + fullName + '\'' +
                ", userId='" + userId + '\'' +
                ", timeReceived='" + timeReceived + '\'' +
                '}';
    }
}
