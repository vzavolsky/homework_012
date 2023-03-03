public class Author {
    private String  authorName,
                    authorFamilyName;

    public Author(String authorName, String authorFamilyName) {
        this.authorName = authorName;
        this.authorFamilyName = authorFamilyName;
    }

    public String getAuthorName() {
        return this.authorName;
    }

    public String getAuthorFamilyName() {
        return this.authorFamilyName;
    }
}
