package ourblog.bean;

/**
 * Created by Maria on 2017/5/20.
 */
public class Blog {
    private int createUserId;
    private String blogTitle;
    private String blogPath;
    private int blogClassId;
    private String blogPermission;
    private String createTime;
    private String lastModifyTime;

    public int getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(int createUserId) {
        this.createUserId = createUserId;
    }

    public String getBlogTitle() {
        return blogTitle;
    }

    public void setBlogTitle(String blogTitle) {
        this.blogTitle = blogTitle;
    }

    public String getBlogPath() {
        return blogPath;
    }

    public void setBlogPath(String blogPath) {
        this.blogPath = blogPath;
    }

    public int getBlogClassId() {
        return blogClassId;
    }

    public void setBlogClassId(int blogClassId) {
        this.blogClassId = blogClassId;
    }

    public String getBlogPermission() {
        return blogPermission;
    }

    public void setBlogPermission(String blogPermission) {
        this.blogPermission = blogPermission;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getLastModifyTime() {
        return lastModifyTime;
    }

    public void setLastModifyTime(String lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }
}
