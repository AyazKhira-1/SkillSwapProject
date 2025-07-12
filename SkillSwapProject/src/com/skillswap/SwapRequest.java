package skillswap;

public class SwapRequest {
    private int id;
    private String fromUser;
    private String toUser;
    private String offeredSkill;
    private String wantedSkill;
    private String status;

    public SwapRequest(int id, String fromUser, String toUser, String offeredSkill, String wantedSkill, String status) {
        this.id = id;
        this.fromUser = fromUser;
        this.toUser = toUser;
        this.offeredSkill = offeredSkill;
        this.wantedSkill = wantedSkill;
        this.status = status;
    }

    public SwapRequest(String fromUser, String toUser, String offeredSkill, String wantedSkill) {
        this(0, fromUser, toUser, offeredSkill, wantedSkill, "Pending");
    }

    public int getId() { return id; }
    public String getFromUser() { return fromUser; }
    public String getToUser() { return toUser; }
    public String getOfferedSkill() { return offeredSkill; }
    public String getWantedSkill() { return wantedSkill; }
    public String getStatus() { return status; }
}