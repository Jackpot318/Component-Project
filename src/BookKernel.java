/*
 * Book kernel component with primary methods.
 */
public interface BookKernel {

    /*
     * Adds book to this.
     *
     * @updates this.content
     *
     */
    void addBook();

    void removeBook();

    void hasBook();

    book getBook(int i);

    int length();

}
